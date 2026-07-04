package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.daaw.gt3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC4967gt3 extends Handler implements Runnable {
    public final InterfaceC5246ht3 B;
    public final long C;
    public InterfaceC4120dt3 D;
    public IOException E;
    public int F;
    public Thread G;
    public boolean H;
    public volatile boolean I;
    public final /* synthetic */ C6372lt3 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4967gt3(C6372lt3 c6372lt3, Looper looper, InterfaceC5246ht3 interfaceC5246ht3, InterfaceC4120dt3 interfaceC4120dt3, int i, long j) {
        super(looper);
        this.J = c6372lt3;
        this.B = interfaceC5246ht3;
        this.D = interfaceC4120dt3;
        this.C = j;
    }

    public final void a(boolean z) {
        this.I = z;
        this.E = null;
        if (hasMessages(0)) {
            this.H = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.H = true;
                    this.B.zzg();
                    Thread thread = this.G;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.J.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC4120dt3 interfaceC4120dt3 = this.D;
            interfaceC4120dt3.getClass();
            interfaceC4120dt3.j(this.B, jElapsedRealtime, jElapsedRealtime - this.C, true);
            this.D = null;
        }
    }

    public final void b(int i) {
        IOException iOException = this.E;
        if (iOException != null && this.F > i) {
            throw iOException;
        }
    }

    public final void c(long j) {
        AbstractC6048km2.f(this.J.b == null);
        this.J.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            d();
        }
    }

    public final void d() {
        this.E = null;
        C6372lt3 c6372lt3 = this.J;
        ExecutorService executorService = c6372lt3.a;
        HandlerC4967gt3 handlerC4967gt3 = c6372lt3.b;
        handlerC4967gt3.getClass();
        executorService.execute(handlerC4967gt3);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.I) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            d();
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.J.b = null;
        long j = this.C;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - j;
        InterfaceC4120dt3 interfaceC4120dt3 = this.D;
        interfaceC4120dt3.getClass();
        if (this.H) {
            interfaceC4120dt3.j(this.B, jElapsedRealtime, j2, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                interfaceC4120dt3.m(this.B, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                AbstractC3305ay2.d("LoadTask", "Unexpected exception handling load completed", e);
                this.J.c = new C6093kt3(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.E = iOException;
        int i3 = this.F + 1;
        this.F = i3;
        C4688ft3 c4688ft3I = interfaceC4120dt3.i(this.B, jElapsedRealtime, j2, iOException, i3);
        if (c4688ft3I.a == 3) {
            this.J.c = this.E;
        } else if (c4688ft3I.a != 2) {
            if (c4688ft3I.a == 1) {
                this.F = 1;
            }
            c(c4688ft3I.b != -9223372036854775807L ? c4688ft3I.b : Math.min((this.F - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.H;
                this.G = Thread.currentThread();
            }
            if (!z) {
                String str = "load:" + this.B.getClass().getSimpleName();
                int i = AbstractC9004vJ2.a;
                Trace.beginSection(str);
                try {
                    this.B.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.G = null;
                Thread.interrupted();
            }
            if (this.I) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.I) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.I) {
                return;
            }
            AbstractC3305ay2.d("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(2, new C6093kt3(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.I) {
                return;
            }
            AbstractC3305ay2.d("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(2, new C6093kt3(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.I) {
                AbstractC3305ay2.d("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
