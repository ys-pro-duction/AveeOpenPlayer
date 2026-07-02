package com.daaw;

/* JADX INFO: renamed from: com.daaw.Tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2323Tf {
    public final int a;
    public static final a b = new a(null);
    public static final int c = E(0);
    public static final int d = E(1);
    public static final int e = E(2);
    public static final int f = E(3);
    public static final int g = E(4);
    public static final int h = E(5);
    public static final int i = E(6);
    public static final int j = E(7);
    public static final int k = E(8);
    public static final int l = E(9);
    public static final int m = E(10);
    public static final int n = E(11);
    public static final int o = E(12);
    public static final int p = E(13);
    public static final int q = E(14);
    public static final int r = E(15);
    public static final int s = E(16);
    public static final int t = E(17);
    public static final int u = E(18);
    public static final int v = E(19);
    public static final int w = E(20);
    public static final int x = E(21);
    public static final int y = E(22);
    public static final int z = E(23);
    public static final int A = E(24);
    public static final int B = E(25);
    public static final int C = E(26);
    public static final int D = E(27);
    public static final int E = E(28);

    /* JADX INFO: renamed from: com.daaw.Tf$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int A() {
            return C2323Tf.j;
        }

        public final int B() {
            return C2323Tf.f;
        }

        public final int C() {
            return C2323Tf.n;
        }

        public final int a() {
            return C2323Tf.c;
        }

        public final int b() {
            return C2323Tf.D;
        }

        public final int c() {
            return C2323Tf.v;
        }

        public final int d() {
            return C2323Tf.u;
        }

        public final int e() {
            return C2323Tf.s;
        }

        public final int f() {
            return C2323Tf.y;
        }

        public final int g() {
            return C2323Tf.e;
        }

        public final int h() {
            return C2323Tf.m;
        }

        public final int i() {
            return C2323Tf.i;
        }

        public final int j() {
            return C2323Tf.k;
        }

        public final int k() {
            return C2323Tf.g;
        }

        public final int l() {
            return C2323Tf.z;
        }

        public final int m() {
            return C2323Tf.w;
        }

        public final int n() {
            return C2323Tf.B;
        }

        public final int o() {
            return C2323Tf.t;
        }

        public final int p() {
            return C2323Tf.E;
        }

        public final int q() {
            return C2323Tf.p;
        }

        public final int r() {
            return C2323Tf.A;
        }

        public final int s() {
            return C2323Tf.r;
        }

        public final int t() {
            return C2323Tf.o;
        }

        public final int u() {
            return C2323Tf.C;
        }

        public final int v() {
            return C2323Tf.q;
        }

        public final int w() {
            return C2323Tf.x;
        }

        public final int x() {
            return C2323Tf.d;
        }

        public final int y() {
            return C2323Tf.l;
        }

        public final int z() {
            return C2323Tf.h;
        }

        public a() {
        }
    }

    public /* synthetic */ C2323Tf(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ C2323Tf D(int i2) {
        return new C2323Tf(i2);
    }

    public static boolean F(int i2, Object obj) {
        return (obj instanceof C2323Tf) && i2 == ((C2323Tf) obj).J();
    }

    public static final boolean G(int i2, int i3) {
        return i2 == i3;
    }

    public static String I(int i2) {
        return G(i2, c) ? "Clear" : G(i2, d) ? "Src" : G(i2, e) ? "Dst" : G(i2, f) ? "SrcOver" : G(i2, g) ? "DstOver" : G(i2, h) ? "SrcIn" : G(i2, i) ? "DstIn" : G(i2, j) ? "SrcOut" : G(i2, k) ? "DstOut" : G(i2, l) ? "SrcAtop" : G(i2, m) ? "DstAtop" : G(i2, n) ? "Xor" : G(i2, o) ? "Plus" : G(i2, p) ? "Modulate" : G(i2, q) ? "Screen" : G(i2, r) ? "Overlay" : G(i2, s) ? "Darken" : G(i2, t) ? "Lighten" : G(i2, u) ? "ColorDodge" : G(i2, v) ? "ColorBurn" : G(i2, w) ? "HardLight" : G(i2, x) ? "Softlight" : G(i2, y) ? "Difference" : G(i2, z) ? "Exclusion" : G(i2, A) ? "Multiply" : G(i2, B) ? "Hue" : G(i2, C) ? "Saturation" : G(i2, D) ? "Color" : G(i2, E) ? "Luminosity" : "Unknown";
    }

    public final /* synthetic */ int J() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return F(this.a, obj);
    }

    public int hashCode() {
        return H(this.a);
    }

    public String toString() {
        return I(this.a);
    }

    public static int E(int i2) {
        return i2;
    }

    public static int H(int i2) {
        return i2;
    }
}
