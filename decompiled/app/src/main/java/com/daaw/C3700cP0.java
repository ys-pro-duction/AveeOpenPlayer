package com.daaw;

import android.graphics.PointF;
import com.daaw.BX;

/* JADX INFO: renamed from: com.daaw.cP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3700cP0 extends AbstractC3143aP0 implements HQ, IQ {
    public BX.a A;
    public BX.a[] B;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public BX.a x;
    public BX.a y;
    public BX.a z;
    public PointF h = new PointF();
    public PointF i = new PointF();
    public PointF j = new PointF();
    public C1458Lc1 k = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 l = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 m = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 n = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 C = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 D = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 E = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 F = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 G = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 H = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 I = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 J = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 K = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 L = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 M = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 N = new C1458Lc1(0.0f, 0.0f);
    public boolean O = true;
    public boolean P = false;
    public float Q = 0.0f;

    @Override // com.daaw.AbstractC3143aP0, com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        super.a(c2591Vu);
        this.O = c2591Vu.o("mirror", false);
        this.P = c2591Vu.o("flipEveryOther", false);
    }

    @Override // com.daaw.BX
    public void m(InterfaceC9336wX interfaceC9336wX, BX.a[] aVarArr, float f, float f2, int i, float f3) {
        this.B = aVarArr;
        this.w = f2;
        this.Q = f3;
        int length = aVarArr.length;
        boolean zH = interfaceC9336wX.h();
        RH0 rh0 = !zH ? new RH0(i, interfaceC9336wX.b().f(), (C4312ec1) null, (InterfaceC6129l2) null, 2) : null;
        int i2 = 0;
        while (true) {
            BX.a[] aVarArr2 = this.B;
            if (i2 >= aVarArr2.length) {
                break;
            }
            BX.a aVar = aVarArr2[i2];
            this.x = aVar;
            int i3 = aVar.a;
            BX.a aVar2 = i3 < 0 ? aVar : aVarArr2[i3];
            this.z = aVar2;
            int i4 = aVar.b;
            BX.a aVar3 = i4 < 0 ? aVar : aVarArr2[i4];
            this.A = aVar3;
            float f4 = aVar.d;
            float f5 = aVar2.d;
            float f6 = aVar3.d;
            if (this.P) {
                if (i2 % 2 == 0) {
                    f4 *= -1.0f;
                } else {
                    f5 *= -1.0f;
                }
            }
            PointF pointF = this.h;
            pointF.x = aVar2.e;
            pointF.y = aVar2.f;
            PointF pointF2 = this.i;
            pointF2.x = aVar.e;
            pointF2.y = aVar.f;
            PointF pointF3 = this.j;
            pointF3.x = aVar3.e;
            pointF3.y = aVar3.f;
            float f7 = this.w;
            float f8 = this.f;
            float f9 = f5 * (-2.0f) * f7 * f8;
            float f10 = f4 * (-2.0f) * f7 * f8;
            if (this.O) {
                pointF.x -= aVar2.g * f9;
                pointF.y -= aVar2.h * f9;
                pointF2.x -= aVar.g * f10;
                pointF2.y -= aVar.h * f10;
                f10 = (float) (((double) f10) * 2.0d);
            }
            if (this.d ? this.e <= 0.0f : f10 >= 0.0f) {
                float f11 = pointF2.x;
                this.u = f11;
                float f12 = pointF2.y;
                this.v = f12;
                float f13 = (aVar.g * f10) + f11;
                this.s = f13;
                float f14 = (aVar.h * f10) + f12;
                this.t = f14;
                aVar.u = false;
                aVar.s = f13;
                aVar.t = f14;
                aVar.k = f11;
                aVar.l = f12;
                aVar.m = f13;
                aVar.n = f14;
            } else {
                float f15 = pointF2.x;
                this.s = f15;
                float f16 = pointF2.y;
                this.t = f16;
                float f17 = (aVar.g * f10) + f15;
                this.u = f17;
                float f18 = (aVar.h * f10) + f16;
                this.v = f18;
                aVar.u = true;
                aVar.s = f17;
                aVar.t = f18;
                aVar.k = f17;
                aVar.l = f18;
                aVar.m = f15;
                aVar.n = f16;
            }
            aVar.o = aVar.k;
            aVar.p = aVar.l;
            aVar.q = aVar.m;
            aVar.r = aVar.n;
            i2++;
        }
        if (this.d) {
            int i5 = 0;
            while (true) {
                BX.a[] aVarArr3 = this.B;
                if (i5 >= aVarArr3.length) {
                    break;
                }
                BX.a aVar4 = aVarArr3[i5];
                this.x = aVar4;
                y(aVar4, this.n, this.e, 0);
                BX.a aVar5 = this.x;
                if (aVar5.u) {
                    float f19 = aVar5.s;
                    C1458Lc1 c1458Lc1 = this.n;
                    float f20 = f19 + c1458Lc1.a;
                    aVar5.q = f20;
                    float f21 = aVar5.t + c1458Lc1.b;
                    aVar5.r = f21;
                    aVar5.m = f20;
                    aVar5.n = f21;
                } else {
                    float f22 = aVar5.s;
                    C1458Lc1 c1458Lc12 = this.n;
                    float f23 = f22 + c1458Lc12.a;
                    aVar5.o = f23;
                    float f24 = aVar5.t + c1458Lc12.b;
                    aVar5.p = f24;
                    aVar5.k = f23;
                    aVar5.l = f24;
                }
                i5++;
            }
        }
        if (zH) {
            interfaceC9336wX.j().c(interfaceC9336wX, this, length, 0.0f, C1458Lc1.s(), C1458Lc1.q(), interfaceC9336wX.b().c(), i, null);
        } else {
            interfaceC9336wX.j().f(interfaceC9336wX, this, length, 0.0f, C1458Lc1.s(), C1458Lc1.q(), rh0);
        }
    }

    @Override // com.daaw.AbstractC3143aP0, com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        super.q(c2591Vu);
        c2591Vu.N("mirror", this.O, "b");
        c2591Vu.N("flipEveryOther", this.P, "b");
    }

    @Override // com.daaw.HQ
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Boolean j(Integer num, float[] fArr, int[] iArr) {
        BX.a aVar = this.B[num.intValue()];
        this.x = aVar;
        int i = aVar.a;
        if (i < 0) {
            return Boolean.FALSE;
        }
        BX.a[] aVarArr = this.B;
        this.z = aVarArr[i];
        int iS = s(i, aVarArr.length, this.Q);
        int iS2 = s(num.intValue(), this.B.length, this.Q);
        iArr[0] = iS;
        iArr[1] = iS2;
        iArr[2] = iS;
        iArr[3] = iS2;
        BX.a aVar2 = this.z;
        float f = aVar2.o;
        this.q = f;
        float f2 = aVar2.p;
        this.r = f2;
        float f3 = aVar2.q;
        this.o = f3;
        float f4 = aVar2.r;
        this.p = f4;
        BX.a aVar3 = this.x;
        float f5 = aVar3.o;
        this.u = f5;
        float f6 = aVar3.p;
        this.v = f6;
        float f7 = aVar3.q;
        this.s = f7;
        float f8 = aVar3.r;
        this.t = f8;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f5;
        fArr[3] = f6;
        fArr[4] = f3;
        fArr[5] = f4;
        fArr[6] = f7;
        fArr[7] = f8;
        return Boolean.TRUE;
    }

    @Override // com.daaw.IQ
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Boolean c(Integer num, float[] fArr, int[] iArr, float[] fArr2) {
        BX.a aVar = this.B[num.intValue()];
        this.x = aVar;
        int i = aVar.a;
        if (i < 0) {
            return Boolean.FALSE;
        }
        this.z = this.B[i];
        iArr[1] = s(num.intValue(), this.B.length, this.Q);
        int iS = s(this.x.a, this.B.length, this.Q);
        iArr[0] = iS;
        iArr[2] = iS;
        iArr[3] = iArr[1];
        BX.a aVar2 = this.z;
        float f = aVar2.o;
        this.q = f;
        float f2 = aVar2.p;
        this.r = f2;
        float f3 = aVar2.q;
        this.o = f3;
        float f4 = aVar2.r;
        this.p = f4;
        BX.a aVar3 = this.x;
        float f5 = aVar3.o;
        this.u = f5;
        float f6 = aVar3.p;
        this.v = f6;
        float f7 = aVar3.q;
        this.s = f7;
        float f8 = aVar3.r;
        this.t = f8;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f5;
        fArr[3] = f6;
        fArr[4] = f3;
        fArr[5] = f4;
        fArr[6] = f7;
        fArr[7] = f8;
        int i2 = aVar2.a;
        if (i2 >= 0) {
            BX.a[] aVarArr = this.B;
            BX.a aVar4 = aVarArr[i2];
            this.y = aVar4;
            float f9 = aVar4.o;
            float f10 = aVar4.p;
            float f11 = aVar4.q;
            float f12 = aVar4.r;
            int i3 = aVar3.b;
            if (i3 >= 0) {
                BX.a aVar5 = aVarArr[i3];
                this.A = aVar5;
                float f13 = aVar5.o;
                float f14 = aVar5.p;
                float f15 = aVar5.q;
                z(-(f2 - f10), f - f9, -(f6 - f2), f5 - f, -(f14 - f6), f13 - f5, -(f4 - f12), f3 - f11, -(f8 - f4), f7 - f3, -(aVar5.r - f8), f15 - f7, fArr2);
            } else {
                z(-(f2 - f10), f - f9, -(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(f4 - f12), f3 - f11, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, fArr2);
            }
        } else {
            int i4 = aVar3.b;
            if (i4 >= 0) {
                BX.a aVar6 = this.B[i4];
                this.A = aVar6;
                float f16 = aVar6.o;
                z(-(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(aVar6.p - f6), f16 - f5, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, -(aVar6.r - f6), aVar6.q - f7, fArr2);
            } else {
                z(-(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, fArr2);
            }
        }
        return Boolean.TRUE;
    }

    public final void y(BX.a aVar, C1458Lc1 c1458Lc1, float f, int i) {
        int i2 = aVar.b;
        if (i2 < 0) {
            this.A = aVar;
            C1458Lc1 c1458Lc12 = this.l;
            c1458Lc12.a = 0.0f;
            c1458Lc12.b = 0.0f;
        } else {
            BX.a aVar2 = this.B[i2];
            this.A = aVar2;
            this.l.a = -(aVar2.b(i) - aVar.b(i));
            this.l.b = this.A.a(i) - aVar.a(i);
            this.l.o();
        }
        int i3 = aVar.a;
        if (i3 < 0) {
            C1458Lc1 c1458Lc13 = this.l;
            float f2 = c1458Lc13.a;
            aVar.i = f2;
            float f3 = c1458Lc13.b;
            aVar.j = f3;
            c1458Lc1.a = f2 * f;
            c1458Lc1.b = f3 * f;
            return;
        }
        BX.a aVar3 = this.B[i3];
        this.k.a = -(aVar.b(i) - aVar3.b(i));
        this.k.b = aVar.a(i) - aVar3.a(i);
        this.k.o();
        C1458Lc1 c1458Lc14 = this.m;
        C1458Lc1 c1458Lc15 = this.k;
        float f4 = c1458Lc15.a;
        C1458Lc1 c1458Lc16 = this.l;
        c1458Lc14.a = f4 + c1458Lc16.a;
        c1458Lc14.b = c1458Lc15.b + c1458Lc16.b;
        c1458Lc14.o();
        C1458Lc1 c1458Lc17 = this.m;
        float f5 = c1458Lc17.a;
        aVar.i = f5;
        float f6 = c1458Lc17.b;
        aVar.j = f6;
        C1458Lc1 c1458Lc18 = this.k;
        float f7 = -c1458Lc18.a;
        c1458Lc18.a = f7;
        float f8 = -c1458Lc18.b;
        c1458Lc18.b = f8;
        float fMax = f / Math.max(Math.abs(C1458Lc1.g(f5, f6, f7, f8)), 0.25f);
        c1458Lc1.a = aVar.i * 1.0f * fMax;
        c1458Lc1.b = aVar.j * 1.0f * fMax;
    }

    public void z(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr) {
        double dSqrt = Math.sqrt((f * f) + (f2 * f2));
        float f13 = (float) (((double) f) / dSqrt);
        float f14 = (float) (((double) f2) / dSqrt);
        double dSqrt2 = Math.sqrt((f3 * f3) + (f4 * f4));
        float f15 = (float) (((double) f3) / dSqrt2);
        float f16 = (float) (((double) f4) / dSqrt2);
        double dSqrt3 = Math.sqrt((f5 * f5) + (f6 * f6));
        double dSqrt4 = Math.sqrt((f7 * f7) + (f8 * f8));
        float f17 = (float) (((double) f7) / dSqrt4);
        float f18 = (float) (((double) f8) / dSqrt4);
        double dSqrt5 = Math.sqrt((f9 * f9) + (f10 * f10));
        float f19 = (float) (((double) f9) / dSqrt5);
        float f20 = (float) (((double) f10) / dSqrt5);
        double dSqrt6 = Math.sqrt((f11 * f11) + (f12 * f12));
        C1458Lc1 c1458Lc1 = this.C;
        c1458Lc1.a = f15 + f13;
        c1458Lc1.b = f16 + f14;
        c1458Lc1.m(f15, f16, 1.5f);
        C1458Lc1 c1458Lc12 = this.D;
        c1458Lc12.a = ((float) (((double) f5) / dSqrt3)) + f15;
        c1458Lc12.b = ((float) (((double) f6) / dSqrt3)) + f16;
        c1458Lc12.m(f15, f16, 1.5f);
        C1458Lc1 c1458Lc13 = this.E;
        c1458Lc13.a = ((float) (((double) f11) / dSqrt6)) + f19;
        c1458Lc13.b = ((float) (((double) f12) / dSqrt6)) + f20;
        c1458Lc13.m(f19, f20, 1.5f);
        C1458Lc1 c1458Lc14 = this.F;
        c1458Lc14.a = f17 + f19;
        c1458Lc14.b = f18 + f20;
        c1458Lc14.m(f19, f20, 1.5f);
        C1458Lc1 c1458Lc15 = this.C;
        fArr[0] = c1458Lc15.a;
        fArr[1] = c1458Lc15.b;
        C1458Lc1 c1458Lc16 = this.D;
        fArr[2] = c1458Lc16.a;
        fArr[3] = c1458Lc16.b;
        C1458Lc1 c1458Lc17 = this.E;
        fArr[4] = -c1458Lc17.a;
        fArr[5] = -c1458Lc17.b;
        C1458Lc1 c1458Lc18 = this.F;
        fArr[6] = -c1458Lc18.a;
        fArr[7] = -c1458Lc18.b;
    }
}
