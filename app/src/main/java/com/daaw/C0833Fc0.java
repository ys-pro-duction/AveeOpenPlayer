package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.daaw.Fc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0833Fc0 implements InterfaceC0937Gc0 {
    public final ExecutorService a;
    public b b;
    public IOException c;

    /* JADX INFO: renamed from: com.daaw.Fc0$a */
    public interface a {
        int k(c cVar, long j, long j2, IOException iOException);

        void p(c cVar, long j, long j2, boolean z);

        void s(c cVar, long j, long j2);
    }

    /* JADX INFO: renamed from: com.daaw.Fc0$b */
    public final class b extends Handler implements Runnable {
        public final int B;
        public final c C;
        public final long D;
        public a E;
        public IOException F;
        public int G;
        public volatile Thread H;
        public volatile boolean I;
        public volatile boolean J;

        public b(Looper looper, c cVar, a aVar, int i, long j) {
            super(looper);
            this.C = cVar;
            this.E = aVar;
            this.B = i;
            this.D = j;
        }

        public void a(boolean z) {
            this.J = z;
            this.F = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.I = true;
                this.C.b();
                if (this.H != null) {
                    this.H.interrupt();
                }
            }
            if (z) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.E.p(this.C, jElapsedRealtime, jElapsedRealtime - this.D, true);
                this.E = null;
            }
        }

        public final void b() {
            this.F = null;
            C0833Fc0.this.a.execute(C0833Fc0.this.b);
        }

        public final void c() {
            C0833Fc0.this.b = null;
        }

        public final long d() {
            return Math.min((this.G - 1) * 1000, 5000);
        }

        public void e(int i) throws IOException {
            IOException iOException = this.F;
            if (iOException != null && this.G > i) {
                throw iOException;
            }
        }

        public void f(long j) {
            AbstractC7115ob.f(C0833Fc0.this.b == null);
            C0833Fc0.this.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.J) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                b();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.D;
            if (this.I) {
                this.E.p(this.C, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                this.E.p(this.C, jElapsedRealtime, j, false);
                return;
            }
            if (i2 == 2) {
                try {
                    this.E.s(this.C, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    C0833Fc0.this.c = new f(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.F = iOException;
            int iK = this.E.k(this.C, jElapsedRealtime, j, iOException);
            if (iK == 3) {
                C0833Fc0.this.c = this.F;
            } else if (iK != 2) {
                this.G = iK != 1 ? 1 + this.G : 1;
                f(d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.H = Thread.currentThread();
                if (!this.I) {
                    T41.a("load:" + this.C.getClass().getSimpleName());
                    try {
                        this.C.a();
                        T41.c();
                    } catch (Throwable th) {
                        T41.c();
                        throw th;
                    }
                }
                if (this.J) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.J) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Error e2) {
                if (!this.J) {
                    obtainMessage(4, e2).sendToTarget();
                }
                throw e2;
            } catch (InterruptedException unused) {
                AbstractC7115ob.f(this.I);
                if (this.J) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e3) {
                if (this.J) {
                    return;
                }
                obtainMessage(3, new f(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.J) {
                    return;
                }
                obtainMessage(3, new f(e4)).sendToTarget();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Fc0$c */
    public interface c {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: com.daaw.Fc0$d */
    public interface d {
        void h();
    }

    /* JADX INFO: renamed from: com.daaw.Fc0$e */
    public static final class e implements Runnable {
        public final d B;

        public e(d dVar) {
            this.B = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.h();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Fc0$f */
    public static final class f extends IOException {
        public f(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C0833Fc0(String str) {
        this.a = AbstractC6280lb1.L(str);
    }

    @Override // com.daaw.InterfaceC0937Gc0
    public void b() throws IOException {
        h(Integer.MIN_VALUE);
    }

    public void f() {
        this.b.a(false);
    }

    public boolean g() {
        return this.b != null;
    }

    public void h(int i) throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        b bVar = this.b;
        if (bVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = bVar.B;
            }
            bVar.e(i);
        }
    }

    public void i() {
        j(null);
    }

    public void j(d dVar) {
        b bVar = this.b;
        if (bVar != null) {
            bVar.a(true);
        }
        if (dVar != null) {
            this.a.execute(new e(dVar));
        }
        this.a.shutdown();
    }

    public long k(c cVar, a aVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC7115ob.f(looperMyLooper != null);
        this.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new b(looperMyLooper, cVar, aVar, i, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }
}
