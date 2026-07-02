package com.daaw;

/* JADX INFO: renamed from: com.daaw.d90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3914d90 extends AbstractC4933gn {
    public static final a e = new a(null);

    /* JADX INFO: renamed from: com.daaw.d90$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3914d90(String str, int i) {
        super(str, AbstractC3808cn.a.a(), i, null);
        G10.g(str, "name");
    }

    @Override // com.daaw.AbstractC4933gn
    public float[] a(float[] fArr) {
        G10.g(fArr, "v");
        float f = fArr[0];
        C4292eY c4292eY = C4292eY.a;
        float f2 = f / c4292eY.c()[0];
        float f3 = fArr[1] / c4292eY.c()[1];
        float f4 = fArr[2] / c4292eY.c()[2];
        float fPow = f2 > 0.008856452f ? (float) Math.pow(f2, 0.33333334f) : (f2 * 7.787037f) + 0.13793103f;
        float fPow2 = f3 > 0.008856452f ? (float) Math.pow(f3, 0.33333334f) : (f3 * 7.787037f) + 0.13793103f;
        float fPow3 = f4 > 0.008856452f ? (float) Math.pow(f4, 0.33333334f) : 0.13793103f + (f4 * 7.787037f);
        fArr[0] = AbstractC8417tE0.k((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = AbstractC8417tE0.k((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = AbstractC8417tE0.k((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // com.daaw.AbstractC4933gn
    public float d(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // com.daaw.AbstractC4933gn
    public float e(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // com.daaw.AbstractC4933gn
    public float[] i(float[] fArr) {
        G10.g(fArr, "v");
        fArr[0] = AbstractC8417tE0.k(fArr[0], 0.0f, 100.0f);
        fArr[1] = AbstractC8417tE0.k(fArr[1], -128.0f, 128.0f);
        float fK = AbstractC8417tE0.k(fArr[2], -128.0f, 128.0f);
        fArr[2] = fK;
        float f = (fArr[0] + 16.0f) / 116.0f;
        float f2 = (fArr[1] * 0.002f) + f;
        float f3 = f - (fK * 0.005f);
        float f4 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        float f5 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        C4292eY c4292eY = C4292eY.a;
        fArr[0] = f4 * c4292eY.c()[0];
        fArr[1] = f5 * c4292eY.c()[1];
        fArr[2] = f6 * c4292eY.c()[2];
        return fArr;
    }
}
