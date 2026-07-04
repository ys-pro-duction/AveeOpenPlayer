package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class PO {
    public static final a b = new a(null);
    public static final int c = d(0);
    public static final int d = d(1);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return PO.d;
        }

        public final int b() {
            return PO.c;
        }

        public a() {
        }
    }

    public /* synthetic */ PO(int i) {
        this.a = i;
    }

    public static final /* synthetic */ PO c(int i) {
        return new PO(i);
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof PO) && i == ((PO) obj).i();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static String h(int i) {
        return f(i, c) ? "Normal" : f(i, d) ? "Italic" : "Invalid";
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
