package com.daaw;

/* JADX INFO: renamed from: com.daaw.Vp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2572Vp0 extends AbstractC4933gn {
    public static final a e = new a(null);
    public static final float[] f;
    public static final float[] g;
    public static final float[] h;
    public static final float[] i;

    /* JADX INFO: renamed from: com.daaw.Vp0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        float[] fArrB = V2.b.a().b();
        C4292eY c4292eY = C4292eY.a;
        float[] fArrK = AbstractC5212hn.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC5212hn.e(fArrB, c4292eY.b().c(), c4292eY.e().c()));
        f = fArrK;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        g = fArr;
        h = AbstractC5212hn.j(fArrK);
        i = AbstractC5212hn.j(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2572Vp0(String str, int i2) {
        super(str, AbstractC3808cn.a.a(), i2, null);
        G10.g(str, "name");
    }

    @Override // com.daaw.AbstractC4933gn
    public float[] a(float[] fArr) {
        G10.g(fArr, "v");
        AbstractC5212hn.m(f, fArr);
        double d = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d));
        AbstractC5212hn.m(g, fArr);
        return fArr;
    }

    @Override // com.daaw.AbstractC4933gn
    public float d(int i2) {
        return i2 == 0 ? 1.0f : 0.5f;
    }

    @Override // com.daaw.AbstractC4933gn
    public float e(int i2) {
        return i2 == 0 ? 0.0f : -0.5f;
    }

    @Override // com.daaw.AbstractC4933gn
    public float[] i(float[] fArr) {
        G10.g(fArr, "v");
        fArr[0] = AbstractC8417tE0.k(fArr[0], 0.0f, 1.0f);
        fArr[1] = AbstractC8417tE0.k(fArr[1], -0.5f, 0.5f);
        fArr[2] = AbstractC8417tE0.k(fArr[2], -0.5f, 0.5f);
        AbstractC5212hn.m(i, fArr);
        float f2 = fArr[0];
        fArr[0] = f2 * f2 * f2;
        float f3 = fArr[1];
        fArr[1] = f3 * f3 * f3;
        float f4 = fArr[2];
        fArr[2] = f4 * f4 * f4;
        AbstractC5212hn.m(h, fArr);
        return fArr;
    }
}
