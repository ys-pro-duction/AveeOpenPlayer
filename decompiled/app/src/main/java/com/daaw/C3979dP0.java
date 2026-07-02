package com.daaw;

import com.daaw.BX;

/* JADX INFO: renamed from: com.daaw.dP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3979dP0 extends AbstractC3143aP0 {
    public static C1458Lc1 m = new C1458Lc1(0.0f, 0.5f);
    public static C1458Lc1 n = new C1458Lc1(1.0f, 0.5f);
    public static C1458Lc1 o = new C1458Lc1(0.0f, 0.5f);
    public static C1458Lc1 p = new C1458Lc1(1.0f, 0.5f);
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
        float fC;
        float fE;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        C3979dP0 c3979dP0 = this;
        BX.a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        float fRound = Math.round((f * 0.5f) / (length + 1)) * c3979dP0.h;
        C1458Lc1 c1458Lc1 = new C1458Lc1(0.0f, 0.0f);
        C1458Lc1 c1458Lc12 = new C1458Lc1(0.0f, 0.0f);
        int i2 = 0;
        while (i2 < aVarArr2.length) {
            BX.a aVar = aVarArr2[i2];
            int i3 = aVar.a;
            c3979dP0.k = i3 < 0 ? aVar : aVarArr2[i3];
            int i4 = aVar.b;
            c3979dP0.l = i4 < 0 ? aVar : aVarArr2[i4];
            int iS = c3979dP0.s(i2, length, f3);
            float f18 = aVar.e;
            float f19 = aVar.f;
            float f20 = aVar.d * (-2.0f) * f2;
            float fSignum = Math.signum(f20);
            float f21 = f20 * c3979dP0.f;
            if (c3979dP0.i) {
                f18 -= aVar.g * f21;
                f19 -= aVar.h * f21;
                f21 = (float) (((double) f21) * 2.0d);
            }
            if (c3979dP0.j) {
                float f22 = aVar.g;
                BX.a aVar2 = c3979dP0.k;
                c1458Lc1.a = aVar2.g + f22;
                float f23 = aVar.h;
                c1458Lc1.b = aVar2.h + f23;
                BX.a aVar3 = c3979dP0.l;
                c1458Lc12.a = f22 + aVar3.g;
                c1458Lc12.b = f23 + aVar3.h;
                c1458Lc12.p();
                c1458Lc1.p();
                float fB = (C1458Lc1.b(aVar.g, aVar.h) * fRound) + f18;
                fC = (C1458Lc1.c(aVar.g, aVar.h) * fRound) + f19;
                float fD = (C1458Lc1.d(aVar.g, aVar.h) * fRound) + f18;
                fE = (C1458Lc1.e(aVar.g, aVar.h) * fRound) + f19;
                float f24 = (c1458Lc1.a * f21) + fB;
                float f25 = (c1458Lc1.b * f21) + fC;
                f4 = fB;
                float f26 = (c1458Lc12.a * f21) + fD;
                float f27 = (c1458Lc12.b * f21) + fE;
                float f28 = -(C1458Lc1.l(f24 - f26, f25 - f27) * 0.5f);
                float f29 = (c1458Lc1.a * f28) + f24;
                float f30 = (c1458Lc1.b * f28) + f25;
                float f31 = (c1458Lc12.a * f28) + f26;
                f7 = (c1458Lc12.b * f28) + f27;
                f12 = f25;
                f14 = f27;
                f10 = fD;
                f11 = f26;
                f13 = f24;
                f6 = f31;
                f8 = fSignum;
                f9 = f30;
                f5 = f29;
            } else {
                float fB2 = (C1458Lc1.b(aVar.g, aVar.h) * fRound) + f18;
                fC = (C1458Lc1.c(aVar.g, aVar.h) * fRound) + f19;
                float fD2 = (C1458Lc1.d(aVar.g, aVar.h) * fRound) + f18;
                fE = (C1458Lc1.e(aVar.g, aVar.h) * fRound) + f19;
                float f32 = aVar.g;
                float f33 = (f32 * f21) + fB2;
                f4 = fB2;
                float f34 = aVar.h;
                float f35 = (f34 * f21) + fC;
                float f36 = (f32 * f21) + fD2;
                float f37 = (f21 * f34) + fE;
                float f38 = -fRound;
                f5 = (f32 * f38) + f33;
                float f39 = (f34 * f38) + f35;
                f6 = (f32 * f38) + f36;
                f7 = (f38 * f34) + f37;
                f8 = fSignum;
                f9 = f39;
                f10 = fD2;
                f11 = f36;
                f12 = f35;
                f13 = f33;
                f14 = f37;
            }
            float f40 = fE;
            float f41 = fC;
            float f42 = f7;
            if (c3979dP0.d) {
                float f43 = aVar.g;
                float f44 = c3979dP0.e;
                float f45 = f13 + (f43 * f8 * f44);
                float f46 = aVar.h;
                float f47 = f12 + (f46 * f8 * f44);
                float f48 = (f43 * f8 * f44) + f11;
                f40 = f14 + (f46 * f8 * f44);
                f17 = f48;
                f15 = f45;
                f16 = f47;
            } else {
                f15 = f4;
                f16 = f41;
                f17 = f10;
            }
            float f49 = f40;
            float f50 = aVar.g;
            float f51 = (f50 * fRound) + f15;
            float f52 = aVar.h;
            float f53 = (f52 * fRound) + f16;
            float f54 = (f50 * fRound) + f17;
            float f55 = (f52 * fRound) + f49;
            if (Math.abs(fRound) > 0.01f) {
                float f56 = f12;
                float f57 = f5;
                float f58 = f11;
                float f59 = f14;
                interfaceC9336wX.j().e(interfaceC9336wX, f57, f9, f6, f42, f13, f56, f58, f59, 0.0f, iS, C1458Lc1.s(), n, interfaceC9336wX.b().d(), i);
                float f60 = f16;
                float f61 = f15;
                float f62 = f17;
                interfaceC9336wX.j().e(interfaceC9336wX, f13, f56, f58, f59, f61, f60, f62, f49, 0.0f, iS, m, p, interfaceC9336wX.b().d(), i);
                interfaceC9336wX.j().e(interfaceC9336wX, f61, f60, f62, f49, f51, f53, f54, f55, 0.0f, iS, o, C1458Lc1.q(), interfaceC9336wX.b().d(), i);
            } else {
                interfaceC9336wX.j().e(interfaceC9336wX, f13, f12, f11, f14, f15, f16, f17, f49, 0.0f, iS, C1458Lc1.s(), C1458Lc1.q(), interfaceC9336wX.b().c(), i);
            }
            i2++;
            c3979dP0 = this;
            aVarArr2 = aVarArr;
        }
    }

    @Override // com.daaw.AbstractC3143aP0, com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        super.q(c2591Vu);
        c2591Vu.Q("barWidth", this.h, "misc", 0.0f, 2.0f);
        c2591Vu.N("barWidthAffectedByShape", this.j, "b");
        c2591Vu.N("mirror", this.i, "misc");
    }
}
