package com.daaw;

/* JADX INFO: renamed from: com.daaw.Wq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2681Wq1 implements InterfaceC2369Tq1 {
    public final C5900kE2 a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    public C2681Wq1(C1098Hq1 c1098Hq1) {
        C5900kE2 c5900kE2 = c1098Hq1.b;
        this.a = c5900kE2;
        c5900kE2.g(12);
        this.c = c5900kE2.x() & 255;
        this.b = c5900kE2.x();
    }

    @Override // com.daaw.InterfaceC2369Tq1
    public final int zza() {
        return -1;
    }

    @Override // com.daaw.InterfaceC2369Tq1
    public final int zzb() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2369Tq1
    public final int zzc() {
        int i = this.c;
        if (i == 8) {
            return this.a.u();
        }
        if (i == 16) {
            return this.a.y();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iU = this.a.u();
        this.e = iU;
        return (iU & 240) >> 4;
    }
}
