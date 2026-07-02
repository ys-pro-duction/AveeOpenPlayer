package com.daaw;

/* JADX INFO: renamed from: com.daaw.jW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5690jW implements QM0 {
    public final int B;
    public final C5969kW C;
    public int D = -1;

    public C5690jW(C5969kW c5969kW, int i) {
        this.C = c5969kW;
        this.B = i;
    }

    @Override // com.daaw.QM0
    public boolean a() {
        if (this.D != -3) {
            return d() && this.C.H(this.D);
        }
        return true;
    }

    @Override // com.daaw.QM0
    public void b() throws PM0 {
        if (this.D == -2) {
            throw new PM0(this.C.r().a(this.B).a(0).G);
        }
        this.C.K();
    }

    public void c() {
        AbstractC7115ob.a(this.D == -1);
        this.D = this.C.w(this.B);
    }

    public final boolean d() {
        int i = this.D;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public void e() {
        if (this.D != -1) {
            this.C.a0(this.B);
            this.D = -1;
        }
    }

    @Override // com.daaw.QM0
    public int j(C5103hP c5103hP, C1016Gw c1016Gw, boolean z) {
        if (d()) {
            return this.C.R(this.D, c5103hP, c1016Gw, z);
        }
        return -3;
    }

    @Override // com.daaw.QM0
    public int n(long j) {
        if (d()) {
            return this.C.Z(this.D, j);
        }
        return 0;
    }
}
