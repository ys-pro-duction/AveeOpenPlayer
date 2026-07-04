package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class T11 {
    public static final a b = new a(null);
    public static final int c = g(1);
    public static final int d = g(2);
    public static final int e = g(3);
    public static final int f = g(4);
    public static final int g = g(5);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return T11.e;
        }

        public final int b() {
            return T11.f;
        }

        public final int c() {
            return T11.g;
        }

        public final int d() {
            return T11.c;
        }

        public final int e() {
            return T11.d;
        }

        public a() {
        }
    }

    public /* synthetic */ T11(int i) {
        this.a = i;
    }

    public static final /* synthetic */ T11 f(int i) {
        return new T11(i);
    }

    public static boolean h(int i, Object obj) {
        return (obj instanceof T11) && i == ((T11) obj).l();
    }

    public static final boolean i(int i, int i2) {
        return i == i2;
    }

    public static String k(int i) {
        return i(i, c) ? "Ltr" : i(i, d) ? "Rtl" : i(i, e) ? "Content" : i(i, f) ? "ContentOrLtr" : i(i, g) ? "ContentOrRtl" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ int l() {
        return this.a;
    }

    public String toString() {
        return k(this.a);
    }

    public static int g(int i) {
        return i;
    }

    public static int j(int i) {
        return i;
    }
}
