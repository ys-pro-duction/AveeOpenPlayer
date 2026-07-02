package com.daaw;

import com.daaw.AbstractC0960Gi;

/* JADX INFO: renamed from: com.daaw.Yj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2860Yj0 extends AbstractC0960Gi.a {
    public final InterfaceC3525bm a;
    public final C6882nk0 b;
    public final C2756Xj0 c;
    public final C1168Ii d;
    public final a f;
    public final AbstractC3246am[] g;
    public InterfaceC2867Yl i;
    public boolean j;
    public C0712Dy k;
    public final Object h = new Object();
    public final C8594ts e = C8594ts.e();

    /* JADX INFO: renamed from: com.daaw.Yj0$a */
    public interface a {
        void a();
    }

    public C2860Yj0(InterfaceC3525bm interfaceC3525bm, C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C1168Ii c1168Ii, a aVar, AbstractC3246am[] abstractC3246amArr) {
        this.a = interfaceC3525bm;
        this.b = c6882nk0;
        this.c = c2756Xj0;
        this.d = c1168Ii;
        this.f = aVar;
        this.g = abstractC3246amArr;
    }

    @Override // com.daaw.AbstractC0960Gi.a
    public void a(C2756Xj0 c2756Xj0) {
        AbstractC7785qy0.u(!this.j, "apply() or fail() already called");
        AbstractC7785qy0.o(c2756Xj0, "headers");
        this.c.m(c2756Xj0);
        C8594ts c8594tsB = this.e.b();
        try {
            InterfaceC2867Yl interfaceC2867YlC = this.a.c(this.b, this.c, this.d, this.g);
            this.e.f(c8594tsB);
            c(interfaceC2867YlC);
        } catch (Throwable th) {
            this.e.f(c8594tsB);
            throw th;
        }
    }

    @Override // com.daaw.AbstractC0960Gi.a
    public void b(C6262lX0 c6262lX0) {
        AbstractC7785qy0.e(!c6262lX0.o(), "Cannot fail with OK status");
        AbstractC7785qy0.u(!this.j, "apply() or fail() already called");
        c(new KJ(AbstractC7365pU.n(c6262lX0), this.g));
    }

    public final void c(InterfaceC2867Yl interfaceC2867Yl) {
        boolean z;
        AbstractC7785qy0.u(!this.j, "already finalized");
        this.j = true;
        synchronized (this.h) {
            try {
                if (this.i == null) {
                    this.i = interfaceC2867Yl;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.f.a();
            return;
        }
        AbstractC7785qy0.u(this.k != null, "delayedStream is null");
        Runnable runnableX = this.k.x(interfaceC2867Yl);
        if (runnableX != null) {
            runnableX.run();
        }
        this.f.a();
    }

    public InterfaceC2867Yl d() {
        synchronized (this.h) {
            try {
                InterfaceC2867Yl interfaceC2867Yl = this.i;
                if (interfaceC2867Yl != null) {
                    return interfaceC2867Yl;
                }
                C0712Dy c0712Dy = new C0712Dy();
                this.k = c0712Dy;
                this.i = c0712Dy;
                return c0712Dy;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
