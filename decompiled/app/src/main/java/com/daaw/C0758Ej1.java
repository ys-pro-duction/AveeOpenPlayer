package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ej1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0758Ej1 extends AbstractC4933gn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0758Ej1(String str, int i) {
        super(str, AbstractC3808cn.a.c(), i, null);
        G10.g(str, "name");
    }

    @Override // com.daaw.AbstractC4933gn
    public float[] a(float[] fArr) {
        G10.g(fArr, "v");
        fArr[0] = j(fArr[0]);
        fArr[1] = j(fArr[1]);
        fArr[2] = j(fArr[2]);
        return fArr;
    }

    @Override // com.daaw.AbstractC4933gn
    public float d(int i) {
        return 2.0f;
    }

    @Override // com.daaw.AbstractC4933gn
    public float e(int i) {
        return -2.0f;
    }

    @Override // com.daaw.AbstractC4933gn
    public float[] i(float[] fArr) {
        G10.g(fArr, "v");
        fArr[0] = j(fArr[0]);
        fArr[1] = j(fArr[1]);
        fArr[2] = j(fArr[2]);
        return fArr;
    }

    public final float j(float f) {
        return AbstractC8417tE0.k(f, -2.0f, 2.0f);
    }
}
