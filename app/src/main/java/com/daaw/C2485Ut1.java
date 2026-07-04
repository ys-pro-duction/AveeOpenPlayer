package com.daaw;

import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzby;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ut1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2485Ut1 {
    public static final C2485Ut1 I = new C2485Ut1(new C1106Hs1());
    public static final String J = Integer.toString(0, 36);
    public static final String K = Integer.toString(1, 36);
    public static final String L = Integer.toString(2, 36);
    public static final String M = Integer.toString(3, 36);
    public static final String N = Integer.toString(4, 36);
    public static final String O = Integer.toString(5, 36);
    public static final String P = Integer.toString(6, 36);
    public static final String Q = Integer.toString(7, 36);
    public static final String R = Integer.toString(8, 36);
    public static final String S = Integer.toString(9, 36);
    public static final String T = Integer.toString(10, 36);
    public static final String U = Integer.toString(11, 36);
    public static final String V = Integer.toString(12, 36);
    public static final String W = Integer.toString(13, 36);
    public static final String X = Integer.toString(14, 36);
    public static final String Y = Integer.toString(15, 36);
    public static final String Z = Integer.toString(16, 36);
    public static final String a0 = Integer.toString(17, 36);
    public static final String b0 = Integer.toString(18, 36);
    public static final String c0 = Integer.toString(19, 36);
    public static final String d0 = Integer.toString(20, 36);
    public static final String e0 = Integer.toString(21, 36);
    public static final String f0 = Integer.toString(22, 36);
    public static final String g0 = Integer.toString(23, 36);
    public static final String h0 = Integer.toString(24, 36);
    public static final String i0 = Integer.toString(25, 36);
    public static final String j0 = Integer.toString(26, 36);
    public static final String k0 = Integer.toString(27, 36);
    public static final String l0 = Integer.toString(28, 36);
    public static final String m0 = Integer.toString(29, 36);
    public static final String n0 = Integer.toString(30, 36);
    public static final String o0 = Integer.toString(31, 36);
    public static final InterfaceC9666xh3 p0 = new InterfaceC9666xh3() { // from class: com.daaw.ur1
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public int H;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final zzby j;
    public final String k;
    public final String l;
    public final int m;
    public final List n;
    public final zzad o;
    public final long p;
    public final int q;
    public final int r;
    public final float s;
    public final int t;
    public final float u;
    public final byte[] v;
    public final int w;
    public final Ho3 x;
    public final int y;
    public final int z;

    public final int a() {
        int i;
        int i2 = this.q;
        if (i2 == -1 || (i = this.r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final C1106Hs1 b() {
        return new C1106Hs1(this, null);
    }

    public final C2485Ut1 c(int i) {
        C1106Hs1 c1106Hs1 = new C1106Hs1(this, null);
        c1106Hs1.c(i);
        return new C2485Ut1(c1106Hs1);
    }

    public final boolean d(C2485Ut1 c2485Ut1) {
        if (this.n.size() != c2485Ut1.n.size()) {
            return false;
        }
        for (int i = 0; i < this.n.size(); i++) {
            if (!Arrays.equals((byte[]) this.n.get(i), (byte[]) c2485Ut1.n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && C2485Ut1.class == obj.getClass()) {
            C2485Ut1 c2485Ut1 = (C2485Ut1) obj;
            int i2 = this.H;
            if ((i2 == 0 || (i = c2485Ut1.H) == 0 || i2 == i) && this.d == c2485Ut1.d && this.f == c2485Ut1.f && this.g == c2485Ut1.g && this.m == c2485Ut1.m && this.p == c2485Ut1.p && this.q == c2485Ut1.q && this.r == c2485Ut1.r && this.t == c2485Ut1.t && this.w == c2485Ut1.w && this.y == c2485Ut1.y && this.z == c2485Ut1.z && this.A == c2485Ut1.A && this.B == c2485Ut1.B && this.C == c2485Ut1.C && this.D == c2485Ut1.D && this.E == c2485Ut1.E && this.F == c2485Ut1.F && this.G == c2485Ut1.G && Float.compare(this.s, c2485Ut1.s) == 0 && Float.compare(this.u, c2485Ut1.u) == 0 && AbstractC9004vJ2.e(this.a, c2485Ut1.a) && AbstractC9004vJ2.e(this.b, c2485Ut1.b) && AbstractC9004vJ2.e(this.i, c2485Ut1.i) && AbstractC9004vJ2.e(this.k, c2485Ut1.k) && AbstractC9004vJ2.e(this.l, c2485Ut1.l) && AbstractC9004vJ2.e(this.c, c2485Ut1.c) && Arrays.equals(this.v, c2485Ut1.v) && AbstractC9004vJ2.e(this.j, c2485Ut1.j) && AbstractC9004vJ2.e(this.x, c2485Ut1.x) && AbstractC9004vJ2.e(this.o, c2485Ut1.o) && d(c2485Ut1)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.H;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = iHashCode + 527;
        String str3 = this.c;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int i3 = (i2 * 31) + iHashCode2;
        int i4 = this.d;
        int i5 = this.f;
        int i6 = this.g;
        String str4 = this.i;
        int iHashCode4 = ((((((((((i3 * 31) + iHashCode3) * 31) + i4) * 961) + i5) * 31) + i6) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzby zzbyVar = this.j;
        int iHashCode5 = (iHashCode4 + (zzbyVar == null ? 0 : zzbyVar.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int iHashCode7 = ((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.m) * 31) + ((int) this.p)) * 31) + this.q) * 31) + this.r) * 31) + Float.floatToIntBits(this.s)) * 31) + this.t) * 31) + Float.floatToIntBits(this.u)) * 31) + this.w) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G;
        this.H = iHashCode7;
        return iHashCode7;
    }

    public final String toString() {
        return "Format(" + this.a + ", " + this.b + ", " + this.k + ", " + this.l + ", " + this.i + ", " + this.h + ", " + this.c + ", [" + this.q + ", " + this.r + ", " + this.s + ", " + String.valueOf(this.x) + "], [" + this.y + ", " + this.z + "])";
    }

    public C2485Ut1(C1106Hs1 c1106Hs1) {
        this.a = c1106Hs1.a;
        this.b = c1106Hs1.b;
        this.c = AbstractC9004vJ2.b(c1106Hs1.c);
        this.d = c1106Hs1.d;
        this.e = 0;
        int i = c1106Hs1.e;
        this.f = i;
        int i2 = c1106Hs1.f;
        this.g = i2;
        this.h = i2 != -1 ? i2 : i;
        this.i = c1106Hs1.g;
        this.j = c1106Hs1.h;
        this.k = c1106Hs1.i;
        this.l = c1106Hs1.j;
        this.m = c1106Hs1.k;
        this.n = c1106Hs1.l == null ? Collections.EMPTY_LIST : c1106Hs1.l;
        zzad zzadVar = c1106Hs1.m;
        this.o = zzadVar;
        this.p = c1106Hs1.n;
        this.q = c1106Hs1.o;
        this.r = c1106Hs1.p;
        this.s = c1106Hs1.q;
        this.t = c1106Hs1.r == -1 ? 0 : c1106Hs1.r;
        this.u = c1106Hs1.s == -1.0f ? 1.0f : c1106Hs1.s;
        this.v = c1106Hs1.t;
        this.w = c1106Hs1.u;
        this.x = c1106Hs1.v;
        this.y = c1106Hs1.w;
        this.z = c1106Hs1.x;
        this.A = c1106Hs1.y;
        this.B = c1106Hs1.z == -1 ? 0 : c1106Hs1.z;
        this.C = c1106Hs1.A != -1 ? c1106Hs1.A : 0;
        this.D = c1106Hs1.B;
        this.E = c1106Hs1.C;
        this.F = c1106Hs1.D;
        this.G = (c1106Hs1.E != 0 || zzadVar == null) ? c1106Hs1.E : 1;
    }
}
