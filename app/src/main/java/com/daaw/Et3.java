package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Et3 extends Xs3 {
    public final C6117kz2 g;
    public final /* synthetic */ C1705Nm1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Et3(C1705Nm1 c1705Nm1, String str, int i, C6117kz2 c6117kz2) {
        super(str, i);
        this.h = c1705Nm1;
        this.g = c6117kz2;
    }

    @Override // com.daaw.Xs3
    public final int a() {
        return this.g.B();
    }

    @Override // com.daaw.Xs3
    public final boolean b() {
        return false;
    }

    @Override // com.daaw.Xs3
    public final boolean c() {
        return true;
    }

    public final boolean k(Long l, Long l2, DZ2 dz2, boolean z) {
        Bk3.b();
        boolean zB = this.h.a.z().B(this.a, AbstractC1311Jr2.Y);
        boolean zH = this.g.H();
        boolean zI = this.g.I();
        boolean zJ = this.g.J();
        boolean z2 = zH || zI || zJ;
        Boolean boolJ = null;
        boolJ = null;
        boolJ = null;
        boolJ = null;
        boolJ = null;
        if (z && !z2) {
            this.h.a.w().s().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.g.K() ? Integer.valueOf(this.g.B()) : null);
            return true;
        }
        C4696fv2 c4696fv2C = this.g.C();
        boolean zH2 = c4696fv2C.H();
        if (dz2.S()) {
            if (c4696fv2C.J()) {
                boolJ = Xs3.j(Xs3.h(dz2.C(), c4696fv2C.D()), zH2);
            } else {
                this.h.a.w().t().b("No number filter for long property. property", this.h.a.D().f(dz2.G()));
            }
        } else if (dz2.Q()) {
            if (c4696fv2C.J()) {
                boolJ = Xs3.j(Xs3.g(dz2.B(), c4696fv2C.D()), zH2);
            } else {
                this.h.a.w().t().b("No number filter for double property. property", this.h.a.D().f(dz2.G()));
            }
        } else if (!dz2.V()) {
            this.h.a.w().t().b("User property has no value, property", this.h.a.D().f(dz2.G()));
        } else if (c4696fv2C.L()) {
            boolJ = Xs3.j(Xs3.f(dz2.H(), c4696fv2C.E(), this.h.a.w()), zH2);
        } else if (!c4696fv2C.J()) {
            this.h.a.w().t().b("No string or number filter defined. property", this.h.a.D().f(dz2.G()));
        } else if (Af3.P(dz2.H())) {
            boolJ = Xs3.j(Xs3.i(dz2.H(), c4696fv2C.D()), zH2);
        } else {
            this.h.a.w().t().c("Invalid user property value for Numeric number filter. property, value", this.h.a.D().f(dz2.G()), dz2.H());
        }
        this.h.a.w().s().b("Property filter result", boolJ == null ? "null" : boolJ);
        if (boolJ == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (zJ && !boolJ.booleanValue()) {
            return true;
        }
        if (!z || this.g.H()) {
            this.d = boolJ;
        }
        if (boolJ.booleanValue() && z2 && dz2.T()) {
            long jD = dz2.D();
            if (l != null) {
                jD = l.longValue();
            }
            if (zB && this.g.H() && !this.g.I() && l2 != null) {
                jD = l2.longValue();
            }
            if (this.g.I()) {
                this.f = Long.valueOf(jD);
            } else {
                this.e = Long.valueOf(jD);
            }
        }
        return true;
    }
}
