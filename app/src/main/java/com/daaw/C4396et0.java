package com.daaw;

/* JADX INFO: renamed from: com.daaw.et0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4396et0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final float[] f = new float[4];
    public float g = 4.0f;
    public float h = 0.0f;
    public boolean e = true;

    public static void a(C4396et0 c4396et0, C4396et0 c4396et02, C4396et0 c4396et03, float f) {
        c4396et0.a = 0.0f;
        double d = f;
        c4396et0.b = AbstractC9479x10.a(c4396et02.b, c4396et03.b, d);
        c4396et0.c = AbstractC9479x10.a(c4396et02.c, c4396et03.c, d);
        c4396et0.d = AbstractC9479x10.a(c4396et02.d, c4396et03.d, d);
        VT.b(c4396et0.f, c4396et02.f, c4396et03.f, f);
        c4396et0.g = AbstractC9479x10.a(c4396et02.g, c4396et03.g, d);
        c4396et0.h = AbstractC9479x10.a(c4396et02.h, c4396et03.h, d);
        if (f < 0.5f) {
            c4396et0.e = c4396et02.e;
        } else {
            c4396et0.e = c4396et03.e;
        }
    }

    public float[] b() {
        return this.f;
    }

    public void c(int i) {
        VT.n(this.f, i);
    }

    public void d(float[] fArr) {
        float[] fArr2 = this.f;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
    }
}
