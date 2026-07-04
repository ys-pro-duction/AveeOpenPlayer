package com.daaw;

/* JADX INFO: renamed from: com.daaw.ho1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5219ho1 {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!AbstractC5497io1.m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.a = i2;
        this.b = AbstractC5497io1.a[3 - i3];
        int i7 = AbstractC5497io1.b[i5];
        this.d = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.d = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.d = i7;
        }
        int i8 = (i >>> 9) & 1;
        this.g = AbstractC5497io1.l(i2, i3);
        if (i3 == 3) {
            int i9 = i2 == 3 ? AbstractC5497io1.c[i6] : AbstractC5497io1.d[i6];
            this.f = i9;
            this.c = (((i9 * 12) / i7) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? AbstractC5497io1.e[i6] : AbstractC5497io1.f[i6];
                this.f = i10;
                this.c = ((i10 * 144) / i7) + i8;
            } else {
                int i11 = AbstractC5497io1.g[i6];
                this.f = i11;
                this.c = (((i3 == 1 ? 72 : 144) * i11) / i7) + i8;
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
