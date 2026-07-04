package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class OJ0 {
    public static final a b = new a(null);
    public static final int c = h(0);
    public static final int d = h(1);
    public static final int e = h(2);
    public static final int f = h(3);
    public static final int g = h(4);
    public static final int h = h(5);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return OJ0.c;
        }

        public final int b() {
            return OJ0.d;
        }

        public final int c() {
            return OJ0.h;
        }

        public final int d() {
            return OJ0.f;
        }

        public final int e() {
            return OJ0.e;
        }

        public final int f() {
            return OJ0.g;
        }

        public a() {
        }
    }

    public /* synthetic */ OJ0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ OJ0 g(int i) {
        return new OJ0(i);
    }

    public static boolean i(int i, Object obj) {
        return (obj instanceof OJ0) && i == ((OJ0) obj).m();
    }

    public static final boolean j(int i, int i2) {
        return i == i2;
    }

    public static String l(int i) {
        return j(i, c) ? "Button" : j(i, d) ? "Checkbox" : j(i, e) ? "Switch" : j(i, f) ? "RadioButton" : j(i, g) ? "Tab" : j(i, h) ? "Image" : "Unknown";
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
