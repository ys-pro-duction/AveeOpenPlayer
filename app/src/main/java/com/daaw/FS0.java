package com.daaw;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class FS0 implements InterfaceC0808Ew {
    public final Thread a;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final C1016Gw[] e;
    public final AbstractC9713xr0[] f;
    public int g;
    public int h;
    public C1016Gw i;
    public Exception j;
    public boolean k;
    public boolean l;
    public int m;

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            FS0.this.u();
        }
    }

    public FS0(C1016Gw[] c1016GwArr, AbstractC9713xr0[] abstractC9713xr0Arr) {
        this.e = c1016GwArr;
        this.g = c1016GwArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = h();
        }
        this.f = abstractC9713xr0Arr;
        this.h = abstractC9713xr0Arr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = i();
        }
        a aVar = new a();
        this.a = aVar;
        aVar.start();
    }

    @Override // com.daaw.InterfaceC0808Ew
    public void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.daaw.InterfaceC0808Ew
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                C1016Gw c1016Gw = this.i;
                if (c1016Gw != null) {
                    r(c1016Gw);
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    r((C1016Gw) this.c.removeFirst());
                }
                while (!this.d.isEmpty()) {
                    t((AbstractC9713xr0) this.d.removeFirst());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        return !this.c.isEmpty() && this.h > 0;
    }

    public abstract C1016Gw h();

    public abstract AbstractC9713xr0 i();

    public abstract Exception j(Throwable th);

    public abstract Exception k(C1016Gw c1016Gw, AbstractC9713xr0 abstractC9713xr0, boolean z);

    public final boolean l() {
        synchronized (this.b) {
            while (!this.l && !g()) {
                try {
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            C1016Gw c1016Gw = (C1016Gw) this.c.removeFirst();
            AbstractC9713xr0[] abstractC9713xr0Arr = this.f;
            int i = this.h - 1;
            this.h = i;
            AbstractC9713xr0 abstractC9713xr0 = abstractC9713xr0Arr[i];
            boolean z = this.k;
            this.k = false;
            if (c1016Gw.p()) {
                abstractC9713xr0.k(4);
            } else {
                if (c1016Gw.o()) {
                    abstractC9713xr0.k(Integer.MIN_VALUE);
                }
                try {
                    this.j = k(c1016Gw, abstractC9713xr0, z);
                } catch (OutOfMemoryError e) {
                    this.j = j(e);
                } catch (RuntimeException e2) {
                    this.j = j(e2);
                }
                if (this.j != null) {
                    synchronized (this.b) {
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        t(abstractC9713xr0);
                    } else if (abstractC9713xr0.o()) {
                        this.m++;
                        t(abstractC9713xr0);
                    } else {
                        abstractC9713xr0.D = this.m;
                        this.m = 0;
                        this.d.addLast(abstractC9713xr0);
                    }
                    r(c1016Gw);
                } finally {
                }
            }
            return true;
        }
    }

    @Override // com.daaw.InterfaceC0808Ew
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final C1016Gw d() {
        C1016Gw c1016Gw;
        synchronized (this.b) {
            p();
            AbstractC7115ob.f(this.i == null);
            int i = this.g;
            if (i == 0) {
                c1016Gw = null;
            } else {
                C1016Gw[] c1016GwArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                c1016Gw = c1016GwArr[i2];
            }
            this.i = c1016Gw;
        }
        return c1016Gw;
    }

    @Override // com.daaw.InterfaceC0808Ew
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AbstractC9713xr0 c() {
        synchronized (this.b) {
            try {
                p();
                if (this.d.isEmpty()) {
                    return null;
                }
                return (AbstractC9713xr0) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (g()) {
            this.b.notify();
        }
    }

    public final void p() throws Exception {
        Exception exc = this.j;
        if (exc != null) {
            throw exc;
        }
    }

    @Override // com.daaw.InterfaceC0808Ew
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void e(C1016Gw c1016Gw) {
        synchronized (this.b) {
            p();
            AbstractC7115ob.a(c1016Gw == this.i);
            this.c.addLast(c1016Gw);
            o();
            this.i = null;
        }
    }

    public final void r(C1016Gw c1016Gw) {
        c1016Gw.l();
        C1016Gw[] c1016GwArr = this.e;
        int i = this.g;
        this.g = i + 1;
        c1016GwArr[i] = c1016Gw;
    }

    public void s(AbstractC9713xr0 abstractC9713xr0) {
        synchronized (this.b) {
            t(abstractC9713xr0);
            o();
        }
    }

    public final void t(AbstractC9713xr0 abstractC9713xr0) {
        abstractC9713xr0.l();
        AbstractC9713xr0[] abstractC9713xr0Arr = this.f;
        int i = this.h;
        this.h = i + 1;
        abstractC9713xr0Arr[i] = abstractC9713xr0;
    }

    public final void u() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (l());
    }

    public final void v(int i) {
        AbstractC7115ob.f(this.g == this.e.length);
        for (C1016Gw c1016Gw : this.e) {
            c1016Gw.t(i);
        }
    }
}
