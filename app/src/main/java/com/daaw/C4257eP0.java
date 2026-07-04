package com.daaw;

import android.graphics.PointF;
import com.daaw.BX;

/* JADX INFO: renamed from: com.daaw.eP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4257eP0 extends AbstractC3143aP0 {
    public float h = 0.5f;
    public boolean i = false;
    public PointF j = new PointF();
    public PointF k = new PointF();

    @Override // com.daaw.AbstractC3143aP0, com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        super.a(c2591Vu);
        this.h = c2591Vu.p("barWidth", 0.5f);
        this.i = c2591Vu.o("mirror", false);
    }

    @Override // com.daaw.BX
    public void m(InterfaceC9336wX interfaceC9336wX, BX.a[] aVarArr, float f, float f2, int i, float f3) {
        float fB;
        float fC;
        float fB2;
        float fC2;
        float fD;
        float fE;
        float fD2;
        float fE2;
        float f4;
        BX.a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        float fRound = Math.round((1.0f * f) / (length + 1)) * this.h;
        int i2 = 0;
        while (i2 < aVarArr2.length) {
            BX.a aVar = aVarArr2[i2];
            int i3 = aVar.a;
            if (i3 >= 0) {
                BX.a aVar2 = aVarArr2[i3];
                int iS = s(i2, length, f3);
                PointF pointF = this.j;
                pointF.x = aVar2.e;
                pointF.y = aVar2.f;
                PointF pointF2 = this.k;
                pointF2.x = aVar.e;
                pointF2.y = aVar.f;
                float f5 = aVar2.d * (-2.0f) * f2;
                float f6 = this.f;
                float f7 = f5 * f6;
                float f8 = aVar.d * (-2.0f) * f2 * f6;
                if (this.i) {
                    pointF.x -= aVar2.g * f7;
                    pointF.y -= aVar2.h * f7;
                    f7 = (float) (((double) f7) * 2.0d);
                    pointF2.x -= aVar.g * f8;
                    pointF2.y -= aVar.h * f8;
                    f8 = (float) (((double) f8) * 2.0d);
                }
                if (f7 < 0.0f) {
                    fB2 = (C1458Lc1.b(aVar.g, aVar.h) * fRound) + this.k.x;
                    fC2 = (C1458Lc1.c(aVar.g, aVar.h) * fRound) + this.k.y;
                    fB = (aVar.g * f7) + fB2;
                    fC = (aVar.h * f7) + fC2;
                } else {
                    fB = (C1458Lc1.b(aVar.g, aVar.h) * fRound) + this.k.x;
                    fC = (C1458Lc1.c(aVar.g, aVar.h) * fRound) + this.k.y;
                    fB2 = (aVar.g * f7) + fB;
                    fC2 = (aVar.h * f7) + fC;
                }
                float f9 = fB;
                float f10 = fC;
                if (f8 < 0.0f) {
                    fD2 = (C1458Lc1.d(aVar.g, aVar.h) * fRound) + this.k.x;
                    fE2 = (C1458Lc1.e(aVar.g, aVar.h) * fRound) + this.k.y;
                    fD = (aVar.g * f8) + fD2;
                    fE = (aVar.h * f8) + fE2;
                } else {
                    fD = (C1458Lc1.d(aVar.g, aVar.h) * fRound) + this.k.x;
                    fE = (C1458Lc1.e(aVar.g, aVar.h) * fRound) + this.k.y;
                    fD2 = (aVar.g * f8) + fD;
                    fE2 = (aVar.h * f8) + fE;
                }
                if (this.d) {
                    float fSignum = Math.signum(f8);
                    float f11 = aVar.g;
                    float f12 = this.e;
                    fB2 = (f11 * fSignum * f12) + f9;
                    float f13 = aVar.h;
                    fD2 = (f11 * fSignum * f12) + fD;
                    f4 = fE + (f13 * fSignum * f12);
                    fC2 = (f13 * fSignum * f12) + f10;
                } else {
                    f4 = fE2;
                }
                float f14 = fD2;
                if (interfaceC9336wX.h()) {
                    interfaceC9336wX.j().b(interfaceC9336wX, f9, f10, fD, fE, fB2, fC2, f14, f4, 0.0f, iS, C1458Lc1.s(), C1458Lc1.q(), interfaceC9336wX.b().c(), i, null);
                } else {
                    RH0 rh0 = new RH0(i, interfaceC9336wX.b().e(), (C4312ec1) null, (InterfaceC6129l2) null, 2);
                    float f15 = fD;
                    interfaceC9336wX.j().d(interfaceC9336wX, f9, f10, f15, fE, fB2, fC2, f14, f4, 0.0f, iS, C1458Lc1.s(), C1458Lc1.q(), rh0);
                }
            }
            i2++;
            aVarArr2 = aVarArr;
        }
    }

    @Override // com.daaw.AbstractC3143aP0, com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        super.q(c2591Vu);
        c2591Vu.Q("barWidth", this.h, "misc", 0.0f, 2.0f);
        c2591Vu.N("mirror", this.i, "misc");
    }
}
