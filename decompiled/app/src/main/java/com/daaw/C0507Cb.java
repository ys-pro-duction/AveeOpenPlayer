package com.daaw;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0507Cb extends M31 {
    public static final long h;
    public static final long i;
    public static C0507Cb j;
    public boolean e;
    public C0507Cb f;
    public long g;

    /* JADX INFO: renamed from: com.daaw.Cb$a */
    public class a implements InterfaceC9600xT0, AutoCloseable {
        public final /* synthetic */ InterfaceC9600xT0 B;

        public a(InterfaceC9600xT0 interfaceC9600xT0) {
            this.B = interfaceC9600xT0;
        }

        @Override // com.daaw.InterfaceC9600xT0
        public void O0(C4057dh c4057dh, long j) throws IOException {
            AbstractC7675qb1.b(c4057dh.C, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                FO0 fo0 = c4057dh.B;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (fo0.c - fo0.b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    fo0 = fo0.f;
                }
                C0507Cb.this.g();
                try {
                    try {
                        this.B.O0(c4057dh, j2);
                        j -= j2;
                        C0507Cb.this.i(true);
                    } catch (IOException e) {
                        throw C0507Cb.this.h(e);
                    }
                } catch (Throwable th) {
                    C0507Cb.this.i(false);
                    throw th;
                }
            }
        }

        @Override // com.daaw.InterfaceC9600xT0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0507Cb.this.g();
            try {
                try {
                    this.B.close();
                    C0507Cb.this.i(true);
                } catch (IOException e) {
                    throw C0507Cb.this.h(e);
                }
            } catch (Throwable th) {
                C0507Cb.this.i(false);
                throw th;
            }
        }

        @Override // com.daaw.InterfaceC9600xT0, java.io.Flushable
        public void flush() throws IOException {
            C0507Cb.this.g();
            try {
                try {
                    this.B.flush();
                    C0507Cb.this.i(true);
                } catch (IOException e) {
                    throw C0507Cb.this.h(e);
                }
            } catch (Throwable th) {
                C0507Cb.this.i(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.B + ")";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cb$b */
    public class b implements PU0, AutoCloseable {
        public final /* synthetic */ PU0 B;

        public b(PU0 pu0) {
            this.B = pu0;
        }

        @Override // com.daaw.PU0
        public long A0(C4057dh c4057dh, long j) throws IOException {
            C0507Cb.this.g();
            try {
                try {
                    long jA0 = this.B.A0(c4057dh, j);
                    C0507Cb.this.i(true);
                    return jA0;
                } catch (IOException e) {
                    throw C0507Cb.this.h(e);
                }
            } catch (Throwable th) {
                C0507Cb.this.i(false);
                throw th;
            }
        }

        @Override // com.daaw.PU0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0507Cb.this.g();
            try {
                try {
                    this.B.close();
                    C0507Cb.this.i(true);
                } catch (IOException e) {
                    throw C0507Cb.this.h(e);
                }
            } catch (Throwable th) {
                C0507Cb.this.i(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.B + ")";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cb$c */
    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r1.p();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.daaw.Cb> r0 = com.daaw.C0507Cb.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.daaw.Cb r1 = com.daaw.C0507Cb.e()     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r1 = move-exception
                goto L1b
            Ld:
                com.daaw.Cb r2 = com.daaw.C0507Cb.j     // Catch: java.lang.Throwable -> Lb
                if (r1 != r2) goto L16
                r1 = 0
                com.daaw.C0507Cb.j = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                r1.p()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0507Cb.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static C0507Cb e() throws InterruptedException {
        C0507Cb c0507Cb = j.f;
        if (c0507Cb == null) {
            long jNanoTime = System.nanoTime();
            C0507Cb.class.wait(h);
            if (j.f != null || System.nanoTime() - jNanoTime < i) {
                return null;
            }
            return j;
        }
        long jL = c0507Cb.l(System.nanoTime());
        if (jL > 0) {
            long j2 = jL / 1000000;
            C0507Cb.class.wait(j2, (int) (jL - (1000000 * j2)));
            return null;
        }
        j.f = c0507Cb.f;
        c0507Cb.f = null;
        return c0507Cb;
    }

    public static synchronized boolean f(C0507Cb c0507Cb) {
        C0507Cb c0507Cb2 = j;
        while (c0507Cb2 != null) {
            C0507Cb c0507Cb3 = c0507Cb2.f;
            if (c0507Cb3 == c0507Cb) {
                c0507Cb2.f = c0507Cb.f;
                c0507Cb.f = null;
                return false;
            }
            c0507Cb2 = c0507Cb3;
        }
        return true;
    }

    public static synchronized void m(C0507Cb c0507Cb, long j2, boolean z) {
        try {
            if (j == null) {
                j = new C0507Cb();
                new c().start();
            }
            long jNanoTime = System.nanoTime();
            if (j2 != 0 && z) {
                c0507Cb.g = Math.min(j2, c0507Cb.a() - jNanoTime) + jNanoTime;
            } else if (j2 != 0) {
                c0507Cb.g = j2 + jNanoTime;
            } else {
                if (!z) {
                    throw new AssertionError();
                }
                c0507Cb.g = c0507Cb.a();
            }
            long jL = c0507Cb.l(jNanoTime);
            C0507Cb c0507Cb2 = j;
            while (true) {
                C0507Cb c0507Cb3 = c0507Cb2.f;
                if (c0507Cb3 == null || jL < c0507Cb3.l(jNanoTime)) {
                    break;
                } else {
                    c0507Cb2 = c0507Cb2.f;
                }
            }
            c0507Cb.f = c0507Cb2.f;
            c0507Cb2.f = c0507Cb;
            if (c0507Cb2 == j) {
                C0507Cb.class.notify();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void g() {
        if (this.e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jD = d();
        boolean zB = b();
        if (jD != 0 || zB) {
            this.e = true;
            m(this, jD, zB);
        }
    }

    public final IOException h(IOException iOException) {
        return !j() ? iOException : k(iOException);
    }

    public final void i(boolean z) throws IOException {
        if (j() && z) {
            throw k(null);
        }
    }

    public final boolean j() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return f(this);
    }

    public IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long l(long j2) {
        return this.g - j2;
    }

    public final InterfaceC9600xT0 n(InterfaceC9600xT0 interfaceC9600xT0) {
        return new a(interfaceC9600xT0);
    }

    public final PU0 o(PU0 pu0) {
        return new b(pu0);
    }

    public void p() {
    }
}
