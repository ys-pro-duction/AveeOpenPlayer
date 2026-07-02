package com.daaw;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class CS1 {
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public static final String m = Integer.toString(5, 36);
    public static final String n = Integer.toString(6, 36);
    public static final String o = Integer.toString(7, 36);
    public static final InterfaceC9666xh3 p = new InterfaceC9666xh3() { // from class: com.daaw.DC1
    };
    public final long a;
    public final int b;
    public final Uri[] c;
    public final int[] d;
    public final long[] e;
    public final long f;
    public final boolean g;

    public CS1(long j2) {
        this(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.d;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final CS1 b(int i2) {
        int[] iArr = this.d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new CS1(0L, 0, -1, iArrCopyOf, (Uri[]) Arrays.copyOf(this.c, 0), jArrCopyOf, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CS1.class == obj.getClass()) {
            CS1 cs1 = (CS1) obj;
            if (this.b == cs1.b && Arrays.equals(this.c, cs1.c) && Arrays.equals(this.d, cs1.d) && Arrays.equals(this.e, cs1.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b * 31) - 1) * 961) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 961;
    }

    public CS1(long j2, int i2, int i3, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z) {
        AbstractC6048km2.d(iArr.length == uriArr.length);
        this.a = 0L;
        this.b = i2;
        this.d = iArr;
        this.c = uriArr;
        this.e = jArr;
        this.f = 0L;
        this.g = false;
    }
}
