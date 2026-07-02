package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public class R92 {
    public static final R92 B;
    public static final R92 C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final InterfaceC9666xh3 g0;
    public final TP2 A;
    public final int i;
    public final int j;
    public final boolean k;
    public final OP2 l;
    public final OP2 n;
    public final OP2 r;
    public final OP2 t;
    public final int u;
    public final RP2 z;
    public final int a = Integer.MAX_VALUE;
    public final int b = Integer.MAX_VALUE;
    public final int c = Integer.MAX_VALUE;
    public final int d = Integer.MAX_VALUE;
    public final int e = 0;
    public final int f = 0;
    public final int g = 0;
    public final int h = 0;
    public final int m = 0;
    public final int o = 0;
    public final int p = Integer.MAX_VALUE;
    public final int q = Integer.MAX_VALUE;
    public final int s = 0;
    public final int v = 0;
    public final boolean w = false;
    public final boolean x = false;
    public final boolean y = false;

    static {
        R92 r92 = new R92(new C7562q92());
        B = r92;
        C = r92;
        D = Integer.toString(1, 36);
        E = Integer.toString(2, 36);
        F = Integer.toString(3, 36);
        G = Integer.toString(4, 36);
        H = Integer.toString(5, 36);
        I = Integer.toString(6, 36);
        J = Integer.toString(7, 36);
        K = Integer.toString(8, 36);
        L = Integer.toString(9, 36);
        M = Integer.toString(10, 36);
        N = Integer.toString(11, 36);
        O = Integer.toString(12, 36);
        P = Integer.toString(13, 36);
        Q = Integer.toString(14, 36);
        R = Integer.toString(15, 36);
        S = Integer.toString(16, 36);
        T = Integer.toString(17, 36);
        U = Integer.toString(18, 36);
        V = Integer.toString(19, 36);
        W = Integer.toString(20, 36);
        X = Integer.toString(21, 36);
        Y = Integer.toString(22, 36);
        Z = Integer.toString(23, 36);
        a0 = Integer.toString(24, 36);
        b0 = Integer.toString(25, 36);
        c0 = Integer.toString(26, 36);
        d0 = Integer.toString(27, 36);
        e0 = Integer.toString(28, 36);
        f0 = Integer.toString(29, 36);
        g0 = new InterfaceC9666xh3() { // from class: com.daaw.G82
        };
    }

    public R92(C7562q92 c7562q92) {
        this.i = c7562q92.e;
        this.j = c7562q92.f;
        this.k = c7562q92.g;
        this.l = c7562q92.h;
        this.n = c7562q92.i;
        this.r = c7562q92.l;
        this.t = c7562q92.m;
        this.u = c7562q92.n;
        this.z = RP2.d(c7562q92.o);
        this.A = TP2.J(c7562q92.p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            R92 r92 = (R92) obj;
            if (this.k == r92.k && this.i == r92.i && this.j == r92.j && this.l.equals(r92.l) && this.n.equals(r92.n) && this.r.equals(r92.r) && this.t.equals(r92.t) && this.u == r92.u && this.z.equals(r92.z) && this.A.equals(r92.A)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.k ? 1 : 0) - 1048002209) * 31) + this.i) * 31) + this.j) * 31) + this.l.hashCode()) * 961) + this.n.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.r.hashCode()) * 923521) + this.t.hashCode()) * 31) + this.u) * 28629151) + this.z.hashCode()) * 31) + this.A.hashCode();
    }
}
