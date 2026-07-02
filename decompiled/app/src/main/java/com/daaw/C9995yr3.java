package com.daaw;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.yr3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9995yr3 extends AbstractC6963o11 {
    public final Object a = new Object();
    public final C9696xn3 b = new C9696xn3();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 a(Executor executor, InterfaceC4381eq0 interfaceC4381eq0) {
        this.b.a(new C8389t73(executor, interfaceC4381eq0));
        y();
        return this;
    }

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 b(InterfaceC5228hq0 interfaceC5228hq0) {
        this.b.a(new Pb3(AbstractC8922v11.a, interfaceC5228hq0));
        y();
        return this;
    }

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 c(Executor executor, InterfaceC5228hq0 interfaceC5228hq0) {
        this.b.a(new Pb3(executor, interfaceC5228hq0));
        y();
        return this;
    }

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 d(Executor executor, InterfaceC7470pq0 interfaceC7470pq0) {
        this.b.a(new Ye3(executor, interfaceC7470pq0));
        y();
        return this;
    }

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 e(Executor executor, InterfaceC0464Bq0 interfaceC0464Bq0) {
        this.b.a(new C8264sh3(executor, interfaceC0464Bq0));
        y();
        return this;
    }

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 f(InterfaceC1519Ls interfaceC1519Ls) {
        return g(AbstractC8922v11.a, interfaceC1519Ls);
    }

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 g(Executor executor, InterfaceC1519Ls interfaceC1519Ls) {
        C9995yr3 c9995yr3 = new C9995yr3();
        this.b.a(new C8393t82(executor, interfaceC1519Ls, c9995yr3));
        y();
        return c9995yr3;
    }

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 h(InterfaceC1519Ls interfaceC1519Ls) {
        return i(AbstractC8922v11.a, interfaceC1519Ls);
    }

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 i(Executor executor, InterfaceC1519Ls interfaceC1519Ls) {
        C9995yr3 c9995yr3 = new C9995yr3();
        this.b.a(new BD2(executor, interfaceC1519Ls, c9995yr3));
        y();
        return c9995yr3;
    }

    @Override // com.daaw.AbstractC6963o11
    public final Exception j() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.daaw.AbstractC6963o11
    public final Object k() {
        Object obj;
        synchronized (this.a) {
            try {
                v();
                w();
                Exception exc = this.f;
                if (exc != null) {
                    throw new C8720uK0(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.daaw.AbstractC6963o11
    public final boolean l() {
        return this.d;
    }

    @Override // com.daaw.AbstractC6963o11
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.daaw.AbstractC6963o11
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 o(InterfaceC9066vZ0 interfaceC9066vZ0) {
        Executor executor = AbstractC8922v11.a;
        C9995yr3 c9995yr3 = new C9995yr3();
        this.b.a(new Jk3(executor, interfaceC9066vZ0, c9995yr3));
        y();
        return c9995yr3;
    }

    @Override // com.daaw.AbstractC6963o11
    public final AbstractC6963o11 p(Executor executor, InterfaceC9066vZ0 interfaceC9066vZ0) {
        C9995yr3 c9995yr3 = new C9995yr3();
        this.b.a(new Jk3(executor, interfaceC9066vZ0, c9995yr3));
        y();
        return c9995yr3;
    }

    public final void q(Exception exc) {
        AbstractC7506py0.m(exc, "Exception must not be null");
        synchronized (this.a) {
            x();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void r(Object obj) {
        synchronized (this.a) {
            x();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final boolean s() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.d = true;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Exception exc) {
        AbstractC7506py0.m(exc, "Exception must not be null");
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.f = exc;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        AbstractC7506py0.p(this.c, "Task is not yet complete");
    }

    public final void w() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void x() {
        if (this.c) {
            throw KE.a(this);
        }
    }

    public final void y() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
