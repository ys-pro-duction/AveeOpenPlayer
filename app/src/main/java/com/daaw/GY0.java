package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class GY0 {
    public static final a b = new a(null);
    public static final int c = e(0);
    public static final int d = e(1);
    public static final int e = e(2);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return GY0.c;
        }

        public final int b() {
            return GY0.d;
        }

        public final int c() {
            return GY0.e;
        }

        public a() {
        }
    }

    public /* synthetic */ GY0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ GY0 d(int i) {
        return new GY0(i);
    }

    public static boolean f(int i, Object obj) {
        return (obj instanceof GY0) && i == ((GY0) obj).j();
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static String i(int i) {
        return g(i, c) ? "Butt" : g(i, d) ? "Round" : g(i, e) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ int j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }

    public static int e(int i) {
        return i;
    }

    public static int h(int i) {
        return i;
    }
}
