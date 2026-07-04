package com.daaw;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.sj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8273sj2 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public C8273sj2(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / RCHTTPStatusCodes.BAD_REQUEST;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 + i4;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    public static void j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    public final int a() {
        int i = this.m * this.b;
        return i + i;
    }

    public final int b() {
        int i = this.k * this.b;
        return i + i;
    }

    public final void c() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public final void d(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.b, this.m);
        shortBuffer.put(this.l, 0, this.b * iMin);
        int i = this.m - iMin;
        this.m = i;
        int i2 = this.b;
        short[] sArr = this.l;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public final void e() {
        int i;
        int i2 = this.k;
        int i3 = this.m;
        float f = this.o;
        float f2 = this.c;
        float f3 = this.e;
        float f4 = this.d;
        int i4 = i3 + ((int) ((((i2 / (f2 / f4)) + f) / (f3 * f4)) + 0.5f));
        int i5 = this.h;
        this.j = l(this.j, i2, i5 + i5 + i2);
        int i6 = 0;
        while (true) {
            int i7 = this.h;
            int i8 = this.b;
            i = i7 + i7;
            if (i6 >= i * i8) {
                break;
            }
            this.j[(i8 * i2) + i6] = 0;
            i6++;
        }
        this.k += i;
        k();
        if (this.m > i4) {
            this.m = i4;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    public final void f(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.b;
        int i2 = iRemaining / i;
        int i3 = i * i2;
        short[] sArrL = l(this.j, this.k, i2);
        this.j = sArrL;
        shortBuffer.get(sArrL, this.k * this.b, (i3 + i3) / 2);
        this.k += i2;
        k();
    }

    public final int g(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.b * i;
                iAbs += Math.abs(sArr[i9 + i8] - sArr[(i9 + i2) + i8]);
            }
            int i10 = iAbs * i6;
            int i11 = i4 * i2;
            if (i10 < i11) {
                i4 = iAbs;
            }
            if (i10 < i11) {
                i6 = i2;
            }
            int i12 = iAbs * i5;
            int i13 = i7 * i2;
            if (i12 > i13) {
                i7 = iAbs;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.u = i4 / i6;
        this.v = i7 / i5;
        return i6;
    }

    public final void h(short[] sArr, int i, int i2) {
        short[] sArrL = l(this.l, this.m, i2);
        this.l = sArrL;
        int i3 = this.m;
        int i4 = this.b;
        System.arraycopy(sArr, i * i4, sArrL, i3 * i4, i2 * i4);
        this.m += i2;
    }

    public final void i(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.h / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.b;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.i[i4] = (short) (i6 / i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0159 A[EDGE_INSN: B:108:0x0159->B:65:0x0159 BREAK  A[LOOP:4: B:13:0x0036->B:99:0x0230], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0230 A[LOOP:4: B:13:0x0036->B:99:0x0230, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8273sj2.k():void");
    }

    public final short[] l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}
