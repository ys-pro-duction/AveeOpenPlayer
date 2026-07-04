package com.daaw;

import com.daaw.BX;

/* JADX INFO: loaded from: classes.dex */
public class ZO0 extends AbstractC3143aP0 {
    public float h = 0.5f;
    public boolean i = false;
    public boolean j = false;
    public BX.a k;
    public BX.a l;

    @Override // com.daaw.AbstractC3143aP0, com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        super.a(c2591Vu);
        this.h = c2591Vu.p("barWidth", 0.5f);
        this.j = c2591Vu.o("barWidthAffectedByShape", false);
        this.i = c2591Vu.o("mirror", false);
    }

    @Override // com.daaw.BX
    public void m(InterfaceC9336wX interfaceC9336wX, BX.a[] aVarArr, float f, float f2, int i, float f3) {
        int i2;
        float fC;
        float f4;
        float fE;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        RH0 rh0;
        BX.a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        float fRound = Math.round((0.5f * f) / (length + 1)) * this.h;
        C1458Lc1 c1458Lc1 = new C1458Lc1(0.0f, 0.0f);
        C1458Lc1 c1458Lc12 = new C1458Lc1(0.0f, 0.0f);
        boolean zH = interfaceC9336wX.h();
        RH0 rh02 = !zH ? new RH0(i, interfaceC9336wX.b().e(), (C4312ec1) null, (InterfaceC6129l2) null, 2) : null;
        int i4 = 0;
        while (i4 < aVarArr2.length) {
            BX.a aVar = aVarArr2[i4];
            int i5 = aVar.a;
            this.k = i5 < 0 ? aVar : aVarArr2[i5];
            int i6 = aVar.b;
            this.l = i6 < 0 ? aVar : aVarArr2[i6];
            int iS = s(i4, length, f3);
            float f11 = aVar.e;
            float f12 = aVar.f;
            float f13 = aVar.d * (-2.0f) * f2;
            float fD = AbstractC0405Bb1.d(f13);
            float f14 = f13 * this.f;
            if (this.i) {
                f11 -= aVar.g * f14;
                f12 -= aVar.h * f14;
                i2 = length;
                f14 = (float) (((double) f14) * 2.0d);
            } else {
                i2 = length;
            }
            if (this.j) {
                float f15 = aVar.g;
                BX.a aVar2 = this.k;
                c1458Lc1.a = aVar2.g + f15;
                float f16 = aVar.h;
                c1458Lc1.b = aVar2.h + f16;
                BX.a aVar3 = this.l;
                c1458Lc12.a = f15 + aVar3.g;
                c1458Lc12.b = f16 + aVar3.h;
                c1458Lc12.p();
                c1458Lc1.p();
                float fB = (C1458Lc1.b(aVar.g, aVar.h) * fRound) + f11;
                fC = (C1458Lc1.c(aVar.g, aVar.h) * fRound) + f12;
                f4 = fB;
                float fD2 = (C1458Lc1.d(aVar.g, aVar.h) * fRound) + f11;
                fE = (C1458Lc1.e(aVar.g, aVar.h) * fRound) + f12;
                float f17 = (c1458Lc1.a * f14) + f4;
                f9 = (c1458Lc1.b * f14) + fC;
                f5 = fD2;
                float f18 = (c1458Lc12.a * f14) + f5;
                f7 = (c1458Lc12.b * f14) + fE;
                f8 = f17;
                f6 = f18;
            } else {
                float fB2 = (C1458Lc1.b(aVar.g, aVar.h) * fRound) + f11;
                fC = (C1458Lc1.c(aVar.g, aVar.h) * fRound) + f12;
                f4 = fB2;
                float fD3 = (C1458Lc1.d(aVar.g, aVar.h) * fRound) + f11;
                fE = (C1458Lc1.e(aVar.g, aVar.h) * fRound) + f12;
                float f19 = aVar.g;
                float f20 = (f19 * f14) + f4;
                f5 = fD3;
                float f21 = aVar.h;
                float f22 = (f21 * f14) + fC;
                f6 = (f19 * f14) + f5;
                f7 = (f21 * f14) + fE;
                f8 = f20;
                f9 = f22;
            }
            float f23 = f7;
            if (this.d) {
                float f24 = aVar.g;
                float f25 = this.e;
                float f26 = (f24 * fD * f25) + f8;
                float f27 = aVar.h;
                float f28 = f9 + (f27 * fD * f25);
                float f29 = (f24 * fD * f25) + f6;
                fE = f23 + (f27 * fD * f25);
                f10 = f26;
                fC = f28;
                f5 = f29;
            } else {
                f10 = f4;
            }
            float f30 = fE;
            if (zH) {
                i3 = i4;
                interfaceC9336wX.j().b(interfaceC9336wX, f8, f9, f6, f23, f10, fC, f5, f30, 0.0f, iS, C1458Lc1.s(), C1458Lc1.q(), interfaceC9336wX.b().c(), i, null);
                rh0 = rh02;
            } else {
                i3 = i4;
                rh0 = rh02;
                interfaceC9336wX.j().d(interfaceC9336wX, f8, f9, f6, f23, f10, fC, f5, f30, 0.0f, iS, C1458Lc1.s(), C1458Lc1.q(), rh0);
            }
            i4 = i3 + 1;
            aVarArr2 = aVarArr;
            rh02 = rh0;
            length = i2;
        }
    }

    @Override // com.daaw.AbstractC3143aP0, com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        super.q(c2591Vu);
        c2591Vu.Q("barWidth", this.h, "misc", 0.0f, 2.0f);
        c2591Vu.N("barWidthAffectedByShape", this.j, "b");
        c2591Vu.N("mirror", this.i, "b");
    }
}
