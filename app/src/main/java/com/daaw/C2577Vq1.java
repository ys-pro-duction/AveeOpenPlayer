package com.daaw;

/* JADX INFO: renamed from: com.daaw.Vq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2577Vq1 implements InterfaceC2369Tq1 {
    public final int a;
    public final int b;
    public final C5900kE2 c;

    public C2577Vq1(C1098Hq1 c1098Hq1, C2485Ut1 c2485Ut1) {
        C5900kE2 c5900kE2 = c1098Hq1.b;
        this.c = c5900kE2;
        c5900kE2.g(12);
        int iX = c5900kE2.x();
        if ("audio/raw".equals(c2485Ut1.l)) {
            int iX2 = AbstractC9004vJ2.x(c2485Ut1.A, c2485Ut1.y);
            if (iX == 0 || iX % iX2 != 0) {
                AbstractC3305ay2.f("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iX2 + ", stsz sample size: " + iX);
                iX = iX2;
            }
        }
        this.a = iX == 0 ? -1 : iX;
        this.b = c5900kE2.x();
    }

    @Override // com.daaw.InterfaceC2369Tq1
    public final int zza() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC2369Tq1
    public final int zzb() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2369Tq1
    public final int zzc() {
        int i = this.a;
        return i == -1 ? this.c.x() : i;
    }
}
