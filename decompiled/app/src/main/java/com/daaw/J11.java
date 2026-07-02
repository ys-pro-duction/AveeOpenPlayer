package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class J11 {
    public static final a b = new a(null);
    public static final int c = h(1);
    public static final int d = h(2);
    public static final int e = h(3);
    public static final int f = h(4);
    public static final int g = h(5);
    public static final int h = h(6);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return J11.e;
        }

        public final int b() {
            return J11.h;
        }

        public final int c() {
            return J11.f;
        }

        public final int d() {
            return J11.c;
        }

        public final int e() {
            return J11.d;
        }

        public final int f() {
            return J11.g;
        }

        public a() {
        }
    }

    public /* synthetic */ J11(int i) {
        this.a = i;
    }

    public static final /* synthetic */ J11 g(int i) {
        return new J11(i);
    }

    public static boolean i(int i, Object obj) {
        return (obj instanceof J11) && i == ((J11) obj).m();
    }

    public static final boolean j(int i, int i2) {
        return i == i2;
    }

    public static String l(int i) {
        return j(i, c) ? "Left" : j(i, d) ? "Right" : j(i, e) ? "Center" : j(i, f) ? "Justify" : j(i, g) ? "Start" : j(i, h) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.a, obj);
    }

    public int hashCode() {
        return k(this.a);
    }

    public final /* synthetic */ int m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }

    public static int h(int i) {
        return i;
    }

    public static int k(int i) {
        return i;
    }
}
