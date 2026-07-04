package com.daaw;

import com.google.android.gms.internal.ads.zzby;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Un1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2461Un1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final C2357Tn1 k;
    public final zzby l;

    public C2461Un1(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C2357Tn1 c2357Tn1, zzby zzbyVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i(i5);
        this.g = i6;
        this.h = i7;
        this.i = h(i7);
        this.j = j;
        this.k = c2357Tn1;
        this.l = zzbyVar;
    }

    public static int h(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int i(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final long b(long j) {
        return Math.max(0L, Math.min((j * ((long) this.e)) / 1000000, this.j - 1));
    }

    public final C2485Ut1 c(byte[] bArr, zzby zzbyVar) {
        bArr[4] = -128;
        zzby zzbyVarD = d(zzbyVar);
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.u("audio/flac");
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        c1106Hs1.n(i);
        c1106Hs1.k0(this.g);
        c1106Hs1.v(this.e);
        c1106Hs1.k(Collections.singletonList(bArr));
        c1106Hs1.o(zzbyVarD);
        return c1106Hs1.D();
    }

    public final zzby d(zzby zzbyVar) {
        zzby zzbyVar2 = this.l;
        return zzbyVar2 == null ? zzbyVar : zzbyVar2.d(zzbyVar);
    }

    public final C2461Un1 e(List list) {
        return new C2461Un1(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, d(new zzby(list)));
    }

    public final C2461Un1 f(C2357Tn1 c2357Tn1) {
        return new C2461Un1(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, c2357Tn1, this.l);
    }

    public final C2461Un1 g(List list) {
        return new C2461Un1(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, d(AbstractC10257zo1.b(list)));
    }

    public C2461Un1(byte[] bArr, int i) {
        GD2 gd2 = new GD2(bArr, bArr.length);
        gd2.j(i * 8);
        this.a = gd2.d(16);
        this.b = gd2.d(16);
        this.c = gd2.d(24);
        this.d = gd2.d(24);
        int iD = gd2.d(20);
        this.e = iD;
        this.f = i(iD);
        this.g = gd2.d(3) + 1;
        int iD2 = gd2.d(5) + 1;
        this.h = iD2;
        this.i = h(iD2);
        int iD3 = gd2.d(4);
        int iD4 = gd2.d(32);
        int i2 = AbstractC9004vJ2.a;
        this.j = ((((long) iD3) & 4294967295L) << 32) | (((long) iD4) & 4294967295L);
        this.k = null;
        this.l = null;
    }
}
