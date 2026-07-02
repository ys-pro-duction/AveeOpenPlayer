package com.daaw;

/* JADX INFO: renamed from: com.daaw.mS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6521mS0 {
    public int[] a;
    public float[] b;
    public float c;
    public float d;
    public int e;
    public int f;

    public C6521mS0(float[] fArr, float f, int i, int i2) {
        int i3 = 0;
        this.a = new int[0];
        this.b = new float[0];
        this.c = 1.0f;
        this.e = i2;
        int length = fArr.length;
        this.f = length;
        this.b = fArr;
        this.c = f;
        this.a = new int[fArr.length];
        int i4 = (length - 1) / 2;
        while (true) {
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                return;
            }
            iArr[i3] = (i3 % length) - i4;
            i3++;
        }
    }

    public static C6521mS0 b(int i) {
        int iCeil = (int) Math.ceil(((double) i) * 2.57d);
        int i2 = iCeil + iCeil + 1;
        float[] fArr = new float[i2];
        int i3 = -iCeil;
        float f = 0.0f;
        while (i3 < iCeil + 1) {
            float f2 = i3 == 0 ? 1.0f : 0.0f;
            fArr[i3 + iCeil] = f2;
            f += f2;
            i3++;
        }
        return new C6521mS0(fArr, f, i2, i);
    }

    public static C6521mS0 c(int i) {
        float f;
        double d = i;
        int iCeil = (int) Math.ceil(2.57d * d);
        int i2 = iCeil + iCeil + 1;
        float[] fArr = new float[i2];
        if (i2 == 1) {
            f = 1.0f;
            fArr[0] = 1.0f;
        } else {
            float f2 = 0.0f;
            for (int i3 = 0 - iCeil; i3 < iCeil + 1; i3++) {
                float fExp = ((float) Math.exp((-(i3 * i3)) / ((i * 2) * i))) / ((float) ((6.283185307179586d * d) * d));
                fArr[i3 + iCeil] = fExp;
                f2 += fExp;
            }
            f = f2;
        }
        return new C6521mS0(fArr, f, i2, i);
    }

    public static C6521mS0 e(int i, float f) {
        int i2 = 0;
        if (i < 1) {
            return new C6521mS0(new float[]{1.0f}, 1.0f, 1, 0);
        }
        C6521mS0 c6521mS0B = b(i);
        C6521mS0 c6521mS0B2 = b(i);
        c6521mS0B2.d(c(i));
        c6521mS0B2.d = f;
        float f2 = 1.0f - f;
        while (true) {
            float[] fArr = c6521mS0B2.b;
            if (i2 >= fArr.length) {
                c6521mS0B2.a();
                return c6521mS0B2;
            }
            fArr[i2] = (fArr[i2] * f) + (c6521mS0B.b[i2] * f2);
            i2++;
        }
    }

    public void a() {
        float fAbs = 0.0f;
        for (int i = 0; i < this.a.length; i++) {
            fAbs += Math.abs(this.b[i]);
        }
        this.c = fAbs;
    }

    public void d(C6521mS0 c6521mS0) {
        int i = (this.f - c6521mS0.f) / 2;
        for (int i2 = 0; i2 < this.a.length; i2++) {
            int i3 = i2 - i;
            if (i3 >= 0 && i3 < c6521mS0.f) {
                float[] fArr = this.b;
                fArr[i2] = fArr[i2] - (c6521mS0.b[i3] * (this.c / c6521mS0.c));
            }
        }
    }

    public int f() {
        int[] iArr = this.a;
        if (iArr == null || iArr.length < 2) {
            return 0;
        }
        return this.e;
    }

    public double g(int i, DX dx) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                return f / this.c;
            }
            int i3 = iArr[i2] + i;
            if (i3 >= 0 && i3 < dx.size()) {
                f = (float) (((double) f) + (dx.get(i3) * ((double) this.b[i2])));
            }
            i2++;
        }
    }

    public float h() {
        return this.d;
    }
}
