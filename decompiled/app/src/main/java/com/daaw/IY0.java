package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class IY0 {
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
            return IY0.e;
        }

        public final int b() {
            return IY0.c;
        }

        public final int c() {
            return IY0.d;
        }

        public a() {
        }
    }

    public /* synthetic */ IY0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ IY0 d(int i) {
        return new IY0(i);
    }

    public static boolean f(int i, Object obj) {
        return (obj instanceof IY0) && i == ((IY0) obj).j();
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static String i(int i) {
        return g(i, c) ? "Miter" : g(i, d) ? "Round" : g(i, e) ? "Bevel" : "Unknown";
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
