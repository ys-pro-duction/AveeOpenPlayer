package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class QO {
    public static final a b = new a(null);
    public static final int c = c(0);
    public static final int d = c(1);
    public static final int e = c(2);
    public static final int f = c(3);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return QO.d;
        }

        public a() {
        }
    }

    public /* synthetic */ QO(int i) {
        this.a = i;
    }

    public static final /* synthetic */ QO b(int i) {
        return new QO(i);
    }

    public static boolean d(int i, Object obj) {
        return (obj instanceof QO) && i == ((QO) obj).j();
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }

    public static final boolean g(int i) {
        return e(i, d) || e(i, f);
    }

    public static final boolean h(int i) {
        return e(i, d) || e(i, e);
    }

    public static String i(int i) {
        return e(i, c) ? "None" : e(i, d) ? "All" : e(i, e) ? "Weight" : e(i, f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return f(this.a);
    }

    public final /* synthetic */ int j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }

    public static int c(int i) {
        return i;
    }

    public static int f(int i) {
        return i;
    }
}
