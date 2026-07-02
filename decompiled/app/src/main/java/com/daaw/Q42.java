package com.daaw;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class Q42 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final InterfaceC9666xh3 F;
    public static final Object p = new Object();
    public static final Object q = new Object();
    public static final YL1 r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object b;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public C4222eG1 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public Object a = p;
    public YL1 c = r;

    static {
        C2705Ww1 c2705Ww1 = new C2705Ww1();
        c2705Ww1.a("androidx.media3.common.Timeline");
        c2705Ww1.b(Uri.EMPTY);
        r = c2705Ww1.c();
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(7, 36);
        z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = new InterfaceC9666xh3() { // from class: com.daaw.m42
        };
    }

    public final Q42 a(Object obj, YL1 yl1, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, C4222eG1 c4222eG1, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        if (yl1 == null) {
            yl1 = r;
        }
        this.c = yl1;
        this.b = null;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = z2;
        this.h = z3;
        this.i = c4222eG1 != null;
        this.j = c4222eG1;
        this.l = 0L;
        this.m = j5;
        this.n = 0;
        this.o = 0;
        this.k = false;
        return this;
    }

    public final boolean b() {
        AbstractC6048km2.f(this.i == (this.j != null));
        return this.j != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q42.class.equals(obj.getClass())) {
            Q42 q42 = (Q42) obj;
            if (AbstractC9004vJ2.e(this.a, q42.a) && AbstractC9004vJ2.e(this.c, q42.c) && AbstractC9004vJ2.e(null, null) && AbstractC9004vJ2.e(this.j, q42.j) && this.d == q42.d && this.e == q42.e && this.f == q42.f && this.g == q42.g && this.h == q42.h && this.k == q42.k && this.m == q42.m && this.n == q42.n && this.o == q42.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() + 217) * 31) + this.c.hashCode();
        C4222eG1 c4222eG1 = this.j;
        int iHashCode2 = ((iHashCode * 961) + (c4222eG1 == null ? 0 : c4222eG1.hashCode())) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.k ? 1 : 0);
        long j4 = this.m;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
    }
}
