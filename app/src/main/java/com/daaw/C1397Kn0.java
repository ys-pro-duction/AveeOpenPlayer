package com.daaw;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.Kn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1397Kn0 {
    public int a;
    public byte[] b;
    public int c;
    public int d;
    public int[] f = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public int[] g = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public int[] h = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    public int[] i = new int[32];
    public int[][] e = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES][];

    public C1397Kn0(byte[] bArr, int i, int i2) {
        this.b = bArr;
        this.c = i;
        this.d = i2;
        for (int i3 = 0; i3 < 256; i3++) {
            this.e[i3] = new int[]{i, i, i, 0};
            int i4 = (i3 << 12) / PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            this.h[i3] = 256;
            this.g[i3] = 0;
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        int i6 = i2 - i;
        if (i6 < -1) {
            i6 = -1;
        }
        int i7 = i + i2;
        if (i7 > 256) {
            i7 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        int i8 = i2 + 1;
        int i9 = i2 - 1;
        int i10 = 1;
        while (true) {
            if (i8 >= i7 && i9 <= i6) {
                return;
            }
            int i11 = i10 + 1;
            int i12 = this.i[i10];
            if (i8 < i7) {
                int i13 = i8 + 1;
                int[] iArr = this.e[i8];
                try {
                    int i14 = iArr[0];
                    iArr[0] = i14 - (((i14 - i3) * i12) / 262144);
                    int i15 = iArr[1];
                    iArr[1] = i15 - (((i15 - i4) * i12) / 262144);
                    int i16 = iArr[2];
                    iArr[2] = i16 - (((i16 - i5) * i12) / 262144);
                } catch (Exception unused) {
                }
                i8 = i13;
            }
            if (i9 > i6) {
                int i17 = i9 - 1;
                int[] iArr2 = this.e[i9];
                try {
                    int i18 = iArr2[0];
                    iArr2[0] = i18 - (((i18 - i3) * i12) / 262144);
                    int i19 = iArr2[1];
                    iArr2[1] = i19 - (((i19 - i4) * i12) / 262144);
                    int i20 = iArr2[2];
                    iArr2[2] = i20 - ((i12 * (i20 - i5)) / 262144);
                } catch (Exception unused2) {
                }
                i10 = i11;
                i9 = i17;
            } else {
                i10 = i11;
            }
        }
    }

    public void b(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.e[i2];
        int i6 = iArr[0];
        iArr[0] = i6 - (((i6 - i3) * i) / 1024);
        int i7 = iArr[1];
        iArr[1] = i7 - (((i7 - i4) * i) / 1024);
        int i8 = iArr[2];
        iArr[2] = i8 - ((i * (i8 - i5)) / 1024);
    }

    public byte[] c() {
        byte[] bArr = new byte[768];
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            iArr[this.e[i][3]] = i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int[] iArr2 = this.e[iArr[i3]];
            bArr[i2] = (byte) iArr2[0];
            int i4 = i2 + 2;
            bArr[i2 + 1] = (byte) iArr2[1];
            i2 += 3;
            bArr[i4] = (byte) iArr2[2];
        }
        return bArr;
    }

    public int d(int i, int i2, int i3) {
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < 256; i8++) {
            int[] iArr = this.e[i8];
            int i9 = iArr[0] - i;
            if (i9 < 0) {
                i9 = -i9;
            }
            int i10 = iArr[1] - i2;
            if (i10 < 0) {
                i10 = -i10;
            }
            int i11 = i9 + i10;
            int i12 = iArr[2] - i3;
            if (i12 < 0) {
                i12 = -i12;
            }
            int i13 = i11 + i12;
            if (i13 < i4) {
                i6 = i8;
                i4 = i13;
            }
            int[] iArr2 = this.g;
            int i14 = i13 - (iArr2[i8] >> 12);
            if (i14 < i5) {
                i7 = i8;
                i5 = i14;
            }
            int[] iArr3 = this.h;
            int i15 = iArr3[i8];
            int i16 = i15 >> 10;
            iArr3[i8] = i15 - i16;
            iArr2[i8] = iArr2[i8] + (i16 << 10);
        }
        int[] iArr4 = this.h;
        iArr4[i6] = iArr4[i6] + 64;
        int[] iArr5 = this.g;
        iArr5[i6] = iArr5[i6] - 65536;
        return i7;
    }

    public void e() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 256) {
            int[] iArr = this.e[i];
            int i4 = iArr[1];
            int i5 = i + 1;
            int i6 = i;
            for (int i7 = i5; i7 < 256; i7++) {
                int i8 = this.e[i7][1];
                if (i8 < i4) {
                    i6 = i7;
                    i4 = i8;
                }
            }
            int[] iArr2 = this.e[i6];
            if (i != i6) {
                int i9 = iArr2[0];
                iArr2[0] = iArr[0];
                iArr[0] = i9;
                int i10 = iArr2[1];
                iArr2[1] = iArr[1];
                iArr[1] = i10;
                int i11 = iArr2[2];
                iArr2[2] = iArr[2];
                iArr[2] = i11;
                int i12 = iArr2[3];
                iArr2[3] = iArr[3];
                iArr[3] = i12;
            }
            if (i4 != i2) {
                this.f[i2] = (i3 + i) >> 1;
                while (true) {
                    i2++;
                    if (i2 >= i4) {
                        break;
                    } else {
                        this.f[i2] = i;
                    }
                }
                i3 = i;
                i2 = i4;
            }
            i = i5;
        }
        this.f[i2] = (i3 + 255) >> 1;
        for (int i13 = i2 + 1; i13 < 256; i13++) {
            this.f[i13] = 255;
        }
    }

    public void f() {
        C1397Kn0 c1397Kn0 = this;
        int i = c1397Kn0.c;
        if (i < 1509) {
            c1397Kn0.d = 1;
        }
        int i2 = c1397Kn0.d;
        c1397Kn0.a = ((i2 - 1) / 3) + 30;
        byte[] bArr = c1397Kn0.b;
        int i3 = i / (i2 * 3);
        int i4 = i3 / 100;
        for (int i5 = 0; i5 < 32; i5++) {
            c1397Kn0.i[i5] = 1024 * (((1024 - (i5 * i5)) * PSKKeyManager.MAX_KEY_LENGTH_BYTES) / 1024);
        }
        int i6 = c1397Kn0.c;
        int i7 = i6 < 1509 ? 3 : i6 % 499 != 0 ? 1497 : i6 % 491 != 0 ? 1473 : i6 % 487 != 0 ? 1461 : 1509;
        int i8 = i4;
        int i9 = 1024;
        int i10 = 2048;
        int i11 = 32;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            int i14 = (bArr[i13] & 255) << 4;
            int i15 = (bArr[i13 + 1] & 255) << 4;
            int i16 = (bArr[i13 + 2] & 255) << 4;
            int iD = c1397Kn0.d(i14, i15, i16);
            c1397Kn0.b(i9, iD, i14, i15, i16);
            int i17 = i9;
            c1397Kn0 = this;
            int i18 = i11;
            if (i11 != 0) {
                c1397Kn0.a(i18, iD, i14, i15, i16);
            }
            int i19 = i13 + i7;
            if (i19 >= i) {
                i19 -= c1397Kn0.c;
            }
            i13 = i19;
            i12++;
            if (i8 == 0) {
                i8 = 1;
            }
            if (i12 % i8 == 0) {
                i9 = i17 - (i17 / c1397Kn0.a);
                i10 -= i10 / 30;
                int i20 = i10 >> 6;
                i11 = i20 <= 1 ? 0 : i20;
                for (int i21 = 0; i21 < i11; i21++) {
                    int i22 = i11 * i11;
                    c1397Kn0.i[i21] = (((i22 - (i21 * i21)) * PSKKeyManager.MAX_KEY_LENGTH_BYTES) / i22) * i9;
                }
            } else {
                i11 = i18;
                i9 = i17;
            }
        }
    }

    public int g(int i, int i2, int i3) {
        int i4 = this.f[i2];
        int i5 = i4 - 1;
        int i6 = 1000;
        int i7 = -1;
        while (true) {
            if (i4 >= 256 && i5 < 0) {
                return i7;
            }
            if (i4 < 256) {
                int[] iArr = this.e[i4];
                int i8 = iArr[1] - i2;
                if (i8 >= i6) {
                    i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i4++;
                    if (i8 < 0) {
                        i8 = -i8;
                    }
                    int i9 = iArr[0] - i;
                    if (i9 < 0) {
                        i9 = -i9;
                    }
                    int i10 = i8 + i9;
                    if (i10 < i6) {
                        int i11 = iArr[2] - i3;
                        if (i11 < 0) {
                            i11 = -i11;
                        }
                        int i12 = i10 + i11;
                        if (i12 < i6) {
                            i7 = iArr[3];
                            i6 = i12;
                        }
                    }
                }
            }
            if (i5 >= 0) {
                int[] iArr2 = this.e[i5];
                int i13 = i2 - iArr2[1];
                if (i13 >= i6) {
                    i5 = -1;
                } else {
                    i5--;
                    if (i13 < 0) {
                        i13 = -i13;
                    }
                    int i14 = iArr2[0] - i;
                    if (i14 < 0) {
                        i14 = -i14;
                    }
                    int i15 = i13 + i14;
                    if (i15 < i6) {
                        int i16 = iArr2[2] - i3;
                        if (i16 < 0) {
                            i16 = -i16;
                        }
                        int i17 = i16 + i15;
                        if (i17 < i6) {
                            i7 = iArr2[3];
                            i6 = i17;
                        }
                    }
                }
            }
        }
    }

    public byte[] h() {
        f();
        i();
        e();
        return c();
    }

    public void i() {
        for (int i = 0; i < 256; i++) {
            int[] iArr = this.e[i];
            iArr[0] = iArr[0] >> 4;
            iArr[1] = iArr[1] >> 4;
            iArr[2] = iArr[2] >> 4;
            iArr[3] = i;
        }
    }
}
