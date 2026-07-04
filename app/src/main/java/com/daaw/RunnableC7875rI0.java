package com.daaw;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.rI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC7875rI0 implements JR, Runnable {
    public static final a M = new a();
    public final Handler B;
    public final int C;
    public final int D;
    public final boolean E;
    public final a F;
    public Object G;
    public InterfaceC7039oI0 H;
    public boolean I;
    public Exception J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: com.daaw.rI0$a */
    public static class a {
        public void a(Object obj) {
            obj.notifyAll();
        }

        public void b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public RunnableC7875rI0(Handler handler, int i, int i2) {
        this(handler, i, i2, true, M);
    }

    @Override // com.daaw.InterfaceC3596c11
    public void c(InterfaceC7039oI0 interfaceC7039oI0) {
        this.H = interfaceC7039oI0;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        try {
            if (this.I) {
                return true;
            }
            boolean zIsDone = isDone();
            boolean z2 = !zIsDone;
            if (!zIsDone) {
                this.I = true;
                if (z) {
                    f();
                }
                this.F.a(this);
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC3596c11
    public synchronized void d(Object obj, XS xs) {
        this.K = true;
        this.G = obj;
        this.F.a(this);
    }

    @Override // com.daaw.InterfaceC3596c11
    public void e(ET0 et0) {
        et0.f(this.C, this.D);
    }

    public void f() {
        this.B.post(this);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            return l(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.daaw.InterfaceC3596c11
    public synchronized void h(Exception exc, Drawable drawable) {
        this.L = true;
        this.J = exc;
        this.F.a(this);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.I     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            boolean r0 = r1.K     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto La
            goto Le
        La:
            r0 = 0
            goto Lf
        Lc:
            r0 = move-exception
            goto L11
        Le:
            r0 = 1
        Lf:
            monitor-exit(r1)
            return r0
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.RunnableC7875rI0.isDone():boolean");
    }

    @Override // com.daaw.InterfaceC3596c11
    public InterfaceC7039oI0 j() {
        return this.H;
    }

    public final synchronized Object l(Long l) {
        try {
            if (this.E) {
                AbstractC6559mb1.a();
            }
            if (this.I) {
                throw new CancellationException();
            }
            if (this.L) {
                throw new ExecutionException(this.J);
            }
            if (this.K) {
                return this.G;
            }
            if (l == null) {
                this.F.b(this, 0L);
            } else if (l.longValue() > 0) {
                this.F.b(this, l.longValue());
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.L) {
                throw new ExecutionException(this.J);
            }
            if (this.I) {
                throw new CancellationException();
            }
            if (!this.K) {
                throw new TimeoutException();
            }
            return this.G;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC7039oI0 interfaceC7039oI0 = this.H;
        if (interfaceC7039oI0 != null) {
            interfaceC7039oI0.clear();
            cancel(false);
        }
    }

    public RunnableC7875rI0(Handler handler, int i, int i2, boolean z, a aVar) {
        this.B = handler;
        this.C = i;
        this.D = i2;
        this.E = z;
        this.F = aVar;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return l(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // com.daaw.InterfaceC1556Mb0
    public void a() {
    }

    @Override // com.daaw.InterfaceC1556Mb0
    public void b() {
    }

    @Override // com.daaw.InterfaceC1556Mb0
    public void onDestroy() {
    }

    @Override // com.daaw.InterfaceC3596c11
    public void i(Drawable drawable) {
    }

    @Override // com.daaw.InterfaceC3596c11
    public void k(Drawable drawable) {
    }
}
