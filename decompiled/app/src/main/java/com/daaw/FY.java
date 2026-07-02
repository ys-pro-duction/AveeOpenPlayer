package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class FY {
    public static final a b = new a(null);
    public static final int c = j(1);
    public static final int d = j(0);
    public static final int e = j(2);
    public static final int f = j(3);
    public static final int g = j(4);
    public static final int h = j(5);
    public static final int i = j(6);
    public static final int j = j(7);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return FY.c;
        }

        public final int b() {
            return FY.j;
        }

        public final int c() {
            return FY.e;
        }

        public final int d() {
            return FY.i;
        }

        public final int e() {
            return FY.d;
        }

        public final int f() {
            return FY.h;
        }

        public final int g() {
            return FY.f;
        }

        public final int h() {
            return FY.g;
        }

        public a() {
        }
    }

    public /* synthetic */ FY(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ FY i(int i2) {
        return new FY(i2);
    }

    public static boolean k(int i2, Object obj) {
        return (obj instanceof FY) && i2 == ((FY) obj).o();
    }

    public static final boolean l(int i2, int i3) {
        return i2 == i3;
    }

    public static String n(int i2) {
        return l(i2, d) ? "None" : l(i2, c) ? "Default" : l(i2, e) ? "Go" : l(i2, f) ? "Search" : l(i2, g) ? "Send" : l(i2, h) ? "Previous" : l(i2, i) ? "Next" : l(i2, j) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.a, obj);
    }

    public int hashCode() {
        return m(this.a);
    }

    public final /* synthetic */ int o() {
        return this.a;
    }

    public String toString() {
        return n(this.a);
    }

    public static int j(int i2) {
        return i2;
    }

    public static int m(int i2) {
        return i2;
    }
}
