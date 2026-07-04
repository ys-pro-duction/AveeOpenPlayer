package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.vJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9002vJ0 extends AbstractC4933gn {
    public static final h r = new h(null);
    public static final NQ s = g.B;
    public final C2433Ug1 e;
    public final float f;
    public final float g;
    public final C5576j51 h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final NQ l;
    public final NQ m;
    public final NQ n;
    public final NQ o;
    public final boolean p;
    public final boolean q;

    /* JADX INFO: renamed from: com.daaw.vJ0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C5576j51 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5576j51 c5576j51) {
            super(1);
            this.B = c5576j51;
        }

        public final Double a(double d) {
            return Double.valueOf(AbstractC5212hn.n(d, this.B.a(), this.B.b(), this.B.c(), this.B.d(), this.B.g()));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.vJ0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C5576j51 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5576j51 c5576j51) {
            super(1);
            this.B = c5576j51;
        }

        public final Double a(double d) {
            return Double.valueOf(AbstractC5212hn.o(d, this.B.a(), this.B.b(), this.B.c(), this.B.d(), this.B.e(), this.B.f(), this.B.g()));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.vJ0$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C5576j51 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C5576j51 c5576j51) {
            super(1);
            this.B = c5576j51;
        }

        public final Double a(double d) {
            return Double.valueOf(AbstractC5212hn.p(d, this.B.a(), this.B.b(), this.B.c(), this.B.d(), this.B.g()));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.vJ0$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C5576j51 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C5576j51 c5576j51) {
            super(1);
            this.B = c5576j51;
        }

        public final Double a(double d) {
            return Double.valueOf(AbstractC5212hn.q(d, this.B.a(), this.B.b(), this.B.c(), this.B.d(), this.B.e(), this.B.f(), this.B.g()));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.vJ0$e */
    public static final class e extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ double B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(double d) {
            super(1);
            this.B = d;
        }

        public final Double a(double d) {
            if (d < 0.0d) {
                d = 0.0d;
            }
            return Double.valueOf(Math.pow(d, 1.0d / this.B));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.vJ0$f */
    public static final class f extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ double B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(double d) {
            super(1);
            this.B = d;
        }

        public final Double a(double d) {
            if (d < 0.0d) {
                d = 0.0d;
            }
            return Double.valueOf(Math.pow(d, this.B));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.vJ0$g */
    public static final class g extends AbstractC4192e90 implements NQ {
        public static final g B = new g();

        public g() {
            super(1);
        }

        public final Double a(double d) {
            return Double.valueOf(d);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.vJ0$h */
    public static final class h {
        public /* synthetic */ h(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final float e(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        public final boolean f(double d, NQ nq, NQ nq2) {
            return Math.abs(((Number) nq.invoke(Double.valueOf(d))).doubleValue() - ((Number) nq2.invoke(Double.valueOf(d))).doubleValue()) <= 0.001d;
        }

        public final float[] g(float[] fArr, C2433Ug1 c2433Ug1) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float fA = c2433Ug1.a();
            float fB = c2433Ug1.b();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = (f7 - f3) / f4;
            float f10 = (f7 - f5) / f6;
            float f11 = (f7 - fA) / fB;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (fA / fB) - f12;
            float f15 = f9 - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / (((f10 - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f20 * f, f19, f20 * ((1.0f - f) - f2), f21 * f3, f18, f21 * ((1.0f - f3) - f4), f22 * f5, f17, f22 * ((1.0f - f5) - f6)};
        }

        public final boolean h(float[] fArr, float[] fArr2) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[1];
            float f4 = fArr2[1];
            float f5 = fArr[2] - fArr2[2];
            float f6 = fArr[3] - fArr2[3];
            float f7 = fArr[4];
            float f8 = fArr2[4];
            float f9 = fArr[5];
            float f10 = fArr2[5];
            float[] fArr3 = {f - f2, f3 - f4, f5, f6, f7 - f8, f9 - f10};
            return i(fArr3[0], fArr3[1], f2 - f8, f4 - f10) >= 0.0f && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        public final float i(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public final boolean j(float[] fArr, C2433Ug1 c2433Ug1, NQ nq, NQ nq2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            C5490in c5490in = C5490in.a;
            if (!AbstractC5212hn.g(fArr, c5490in.s()) || !AbstractC5212hn.f(c2433Ug1, C4292eY.a.e()) || f != 0.0f || f2 != 1.0f) {
                return false;
            }
            C9002vJ0 c9002vJ0R = c5490in.r();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!f(d, nq, c9002vJ0R.p()) || !f(d, nq2, c9002vJ0R.m())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean k(float[] fArr, float f, float f2) {
            float fE = e(fArr);
            C5490in c5490in = C5490in.a;
            if (fE / e(c5490in.o()) <= 0.9f || !h(fArr, c5490in.s())) {
                return f < 0.0f && f2 > 1.0f;
            }
            return true;
        }

        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                AbstractC5152hb.i(fArr, fArr2, 0, 0, 6, 6, null);
                return fArr2;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = f + f2 + fArr[2];
            fArr2[0] = f / f3;
            fArr2[1] = f2 / f3;
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = f4 + f5 + fArr[5];
            fArr2[2] = f4 / f6;
            fArr2[3] = f5 / f6;
            float f7 = fArr[6];
            float f8 = fArr[7];
            float f9 = f7 + f8 + fArr[8];
            fArr2[4] = f7 / f9;
            fArr2[5] = f8 / f9;
            return fArr2;
        }

        public h() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.vJ0$i */
    public static final class i extends AbstractC4192e90 implements NQ {
        public i() {
            super(1);
        }

        public final Double a(double d) {
            return (Double) C9002vJ0.this.m().invoke(Double.valueOf(AbstractC8417tE0.j(d, C9002vJ0.this.f, C9002vJ0.this.g)));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.vJ0$j */
    public static final class j extends AbstractC4192e90 implements NQ {
        public j() {
            super(1);
        }

        public final Double a(double d) {
            return Double.valueOf(AbstractC8417tE0.j(((Number) C9002vJ0.this.p().invoke(Double.valueOf(d))).doubleValue(), C9002vJ0.this.f, C9002vJ0.this.g));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9002vJ0(String str, float[] fArr, C2433Ug1 c2433Ug1, float[] fArr2, NQ nq, NQ nq2, float f2, float f3, C5576j51 c5576j51, int i2) {
        super(str, AbstractC3808cn.a.b(), i2, null);
        G10.g(str, "name");
        G10.g(fArr, "primaries");
        G10.g(c2433Ug1, "whitePoint");
        G10.g(nq, "oetf");
        G10.g(nq2, "eotf");
        this.e = c2433Ug1;
        this.f = f2;
        this.g = f3;
        this.h = c5576j51;
        this.l = nq;
        this.m = new j();
        this.n = nq2;
        this.o = new i();
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Invalid range: min=" + f2 + ", max=" + f3 + "; min must be strictly < max");
        }
        h hVar = r;
        float[] fArrL = hVar.l(fArr);
        this.i = fArrL;
        if (fArr2 == null) {
            this.j = hVar.g(fArrL, c2433Ug1);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.j = fArr2;
        }
        this.k = AbstractC5212hn.j(this.j);
        this.p = hVar.k(fArrL, f2, f3);
        this.q = hVar.j(fArrL, c2433Ug1, nq, nq2, f2, f3, i2);
    }

    @Override // com.daaw.AbstractC4933gn
    public float[] a(float[] fArr) {
        G10.g(fArr, "v");
        AbstractC5212hn.m(this.k, fArr);
        fArr[0] = (float) ((Number) this.m.invoke(Double.valueOf(fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.m.invoke(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.m.invoke(Double.valueOf(fArr[2]))).doubleValue();
        return fArr;
    }

    @Override // com.daaw.AbstractC4933gn
    public float d(int i2) {
        return this.g;
    }

    @Override // com.daaw.AbstractC4933gn
    public float e(int i2) {
        return this.f;
    }

    @Override // com.daaw.AbstractC4933gn
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !G10.c(AbstractC5624jG0.b(C9002vJ0.class), AbstractC5624jG0.b(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        C9002vJ0 c9002vJ0 = (C9002vJ0) obj;
        if (Float.compare(c9002vJ0.f, this.f) != 0 || Float.compare(c9002vJ0.g, this.g) != 0 || !G10.c(this.e, c9002vJ0.e) || !Arrays.equals(this.i, c9002vJ0.i)) {
            return false;
        }
        C5576j51 c5576j51 = this.h;
        if (c5576j51 != null) {
            return G10.c(c5576j51, c9002vJ0.h);
        }
        if (c9002vJ0.h == null) {
            return true;
        }
        if (G10.c(this.l, c9002vJ0.l)) {
            return G10.c(this.n, c9002vJ0.n);
        }
        return false;
    }

    @Override // com.daaw.AbstractC4933gn
    public boolean h() {
        return this.q;
    }

    @Override // com.daaw.AbstractC4933gn
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.e.hashCode()) * 31) + Arrays.hashCode(this.i)) * 31;
        float f2 = this.f;
        int iFloatToIntBits = (iHashCode + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        float f3 = this.g;
        int iFloatToIntBits2 = (iFloatToIntBits + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        C5576j51 c5576j51 = this.h;
        int iHashCode2 = iFloatToIntBits2 + (c5576j51 != null ? c5576j51.hashCode() : 0);
        return this.h == null ? (((iHashCode2 * 31) + this.l.hashCode()) * 31) + this.n.hashCode() : iHashCode2;
    }

    @Override // com.daaw.AbstractC4933gn
    public float[] i(float[] fArr) {
        G10.g(fArr, "v");
        fArr[0] = (float) ((Number) this.o.invoke(Double.valueOf(fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.o.invoke(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.o.invoke(Double.valueOf(fArr[2]))).doubleValue();
        return AbstractC5212hn.m(this.j, fArr);
    }

    public final NQ l() {
        return this.o;
    }

    public final NQ m() {
        return this.n;
    }

    public final float[] n() {
        return this.k;
    }

    public final NQ o() {
        return this.m;
    }

    public final NQ p() {
        return this.l;
    }

    public final float[] q() {
        return this.j;
    }

    public final C2433Ug1 r() {
        return this.e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9002vJ0(String str, float[] fArr, C2433Ug1 c2433Ug1, C5576j51 c5576j51, int i2) {
        this(str, fArr, c2433Ug1, null, (c5576j51.e() == 0.0d && c5576j51.f() == 0.0d) ? new a(c5576j51) : new b(c5576j51), (c5576j51.e() == 0.0d && c5576j51.f() == 0.0d) ? new c(c5576j51) : new d(c5576j51), 0.0f, 1.0f, c5576j51, i2);
        G10.g(str, "name");
        G10.g(fArr, "primaries");
        G10.g(c2433Ug1, "whitePoint");
        G10.g(c5576j51, "function");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9002vJ0(String str, float[] fArr, C2433Ug1 c2433Ug1, double d2, float f2, float f3, int i2) {
        NQ eVar;
        NQ fVar;
        G10.g(str, "name");
        G10.g(fArr, "primaries");
        G10.g(c2433Ug1, "whitePoint");
        if (d2 == 1.0d) {
            eVar = s;
        } else {
            eVar = new e(d2);
        }
        NQ nq = eVar;
        if (d2 == 1.0d) {
            fVar = s;
        } else {
            fVar = new f(d2);
        }
        this(str, fArr, c2433Ug1, null, nq, fVar, f2, f3, new C5576j51(d2, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9002vJ0(C9002vJ0 c9002vJ0, float[] fArr, C2433Ug1 c2433Ug1) {
        this(c9002vJ0.g(), c9002vJ0.i, c2433Ug1, fArr, c9002vJ0.l, c9002vJ0.n, c9002vJ0.f, c9002vJ0.g, c9002vJ0.h, -1);
        G10.g(c9002vJ0, "colorSpace");
        G10.g(fArr, "transform");
        G10.g(c2433Ug1, "whitePoint");
    }
}
