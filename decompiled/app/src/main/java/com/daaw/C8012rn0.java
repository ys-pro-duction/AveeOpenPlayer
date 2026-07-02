package com.daaw;

import com.daaw.AbstractC3999dU0;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.rn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8012rn0 extends C7729qm0 {
    public final C7729qm0 n;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8012rn0(int i, C4566fU0 c4566fU0, NQ nq, NQ nq2, C7729qm0 c7729qm0) {
        super(i, c4566fU0, nq, nq2);
        G10.g(c4566fU0, "invalid");
        G10.g(c7729qm0, "parent");
        this.n = c7729qm0;
        c7729qm0.l(this);
    }

    @Override // com.daaw.C7729qm0
    public AbstractC3999dU0 A() {
        Map mapK;
        if (this.n.B() || this.n.e()) {
            return new AbstractC3999dU0.a(this);
        }
        Set setC = C();
        int iF = f();
        if (setC != null) {
            C7729qm0 c7729qm0 = this.n;
            mapK = AbstractC5124hU0.K(c7729qm0, this, c7729qm0.g());
        } else {
            mapK = null;
        }
        synchronized (AbstractC5124hU0.C()) {
            try {
                AbstractC5124hU0.Y(this);
                if (setC == null || setC.size() == 0) {
                    b();
                } else {
                    AbstractC3999dU0 abstractC3999dU0F = F(this.n.f(), mapK, this.n.g());
                    if (!G10.c(abstractC3999dU0F, AbstractC3999dU0.b.a)) {
                        return abstractC3999dU0F;
                    }
                    Set setC2 = this.n.C();
                    if (setC2 == null) {
                        setC2 = new HashSet();
                        this.n.M(setC2);
                    }
                    setC2.addAll(setC);
                }
                if (this.n.f() < iF) {
                    this.n.z();
                }
                C7729qm0 c7729qm02 = this.n;
                c7729qm02.u(c7729qm02.g().y(iF).w(D()));
                this.n.G(iF);
                this.n.I(w());
                this.n.H(D());
                this.n.J(E());
                G91 g91 = G91.a;
                L(true);
                Q();
                return AbstractC3999dU0.b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Q() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.n.m(this);
    }

    @Override // com.daaw.C7729qm0, com.daaw.AbstractC3720cU0
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        Q();
    }
}
