package com.daaw;

/* JADX INFO: renamed from: com.daaw.Xs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2793Xs1 implements InterfaceC2063Qs1 {
    public final GD2 a = new GD2(new byte[4], 4);
    public final /* synthetic */ C3001Zs1 b;

    public C2793Xs1(C3001Zs1 c3001Zs1) {
        this.b = c3001Zs1;
    }

    @Override // com.daaw.InterfaceC2063Qs1
    public final void a(C5900kE2 c5900kE2) {
        if (c5900kE2.u() == 0 && (c5900kE2.u() & 128) != 0) {
            c5900kE2.h(6);
            int iJ = c5900kE2.j() / 4;
            for (int i = 0; i < iJ; i++) {
                c5900kE2.b(this.a, 4);
                GD2 gd2 = this.a;
                int iD = gd2.d(16);
                gd2.l(3);
                if (iD == 0) {
                    this.a.l(13);
                } else {
                    int iD2 = this.a.d(13);
                    if (this.b.e.get(iD2) == null) {
                        C3001Zs1 c3001Zs1 = this.b;
                        c3001Zs1.e.put(iD2, new C2167Rs1(new C2897Ys1(c3001Zs1, iD2)));
                        this.b.k++;
                    }
                }
            }
            this.b.e.remove(0);
        }
    }

    @Override // com.daaw.InterfaceC2063Qs1
    public final void b(C5916kI2 c5916kI2, InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
    }
}
