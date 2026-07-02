package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class HN {
    public static final a b = new a(null);
    public static final int c = j(1);
    public static final int d = j(2);
    public static final int e = j(3);
    public static final int f = j(4);
    public static final int g = j(5);
    public static final int h = j(6);
    public static final int i = j(7);
    public static final int j = j(8);
    public final int a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return HN.h;
        }

        public final int b() {
            return HN.i;
        }

        public final int c() {
            return HN.e;
        }

        public final int d() {
            return HN.c;
        }

        public final int e() {
            return HN.j;
        }

        public final int f() {
            return HN.d;
        }

        public final int g() {
            return HN.f;
        }

        public final int h() {
            return HN.g;
        }

        public a() {
        }
    }

    public /* synthetic */ HN(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ HN i(int i2) {
        return new HN(i2);
    }

    public static boolean k(int i2, Object obj) {
        return (obj instanceof HN) && i2 == ((HN) obj).o();
    }

    public static final boolean l(int i2, int i3) {
        return i2 == i3;
    }

    public static String n(int i2) {
        return l(i2, c) ? "Next" : l(i2, d) ? "Previous" : l(i2, e) ? "Left" : l(i2, f) ? "Right" : l(i2, g) ? "Up" : l(i2, h) ? "Down" : l(i2, i) ? "In" : l(i2, j) ? "Out" : "Invalid FocusDirection";
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
