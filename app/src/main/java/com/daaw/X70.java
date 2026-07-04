package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class X70 {
    public static final a a = new a(null);
    public static final int b = j(1);
    public static final int c = j(2);
    public static final int d = j(3);
    public static final int e = j(4);
    public static final int f = j(5);
    public static final int g = j(6);
    public static final int h = j(7);
    public static final int i = j(8);
    public static final int j = j(9);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return X70.c;
        }

        public final int b() {
            return X70.j;
        }

        public final int c() {
            return X70.g;
        }

        public final int d() {
            return X70.d;
        }

        public final int e() {
            return X70.i;
        }

        public final int f() {
            return X70.h;
        }

        public final int g() {
            return X70.e;
        }

        public final int h() {
            return X70.b;
        }

        public final int i() {
            return X70.f;
        }

        public a() {
        }
    }

    public static final boolean k(int i2, int i3) {
        return i2 == i3;
    }

    public static String m(int i2) {
        return k(i2, b) ? "Text" : k(i2, c) ? "Ascii" : k(i2, d) ? "Number" : k(i2, e) ? "Phone" : k(i2, f) ? "Uri" : k(i2, g) ? "Email" : k(i2, h) ? "Password" : k(i2, i) ? "NumberPassword" : k(i2, j) ? "Decimal" : "Invalid";
    }

    public static int j(int i2) {
        return i2;
    }

    public static int l(int i2) {
        return i2;
    }
}
