package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class WZ {
    public static final a b = new a(null);
    public static final int c = d(1);
    public static final int d = d(2);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return WZ.d;
        }

        public final int b() {
            return WZ.c;
        }

        public a() {
        }
    }

    public /* synthetic */ WZ(int i) {
        this.a = i;
    }

    public static final /* synthetic */ WZ c(int i) {
        return new WZ(i);
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof WZ) && i == ((WZ) obj).i();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static String h(int i) {
        return f(i, c) ? "Touch" : f(i, d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return g(this.a);
    }

    public final /* synthetic */ int i() {
        return this.a;
    }

    public String toString() {
        return h(this.a);
    }

    public static int d(int i) {
        return i;
    }

    public static int g(int i) {
        return i;
    }
}
