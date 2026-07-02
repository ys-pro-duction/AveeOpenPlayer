package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class C21 {
    public static final a a = new a(null);
    public static final int b = c(1);
    public static final int c = c(2);
    public static final int d = c(3);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return C21.b;
        }

        public final int b() {
            return C21.c;
        }

        public a() {
        }
    }

    public static final boolean d(int i, int i2) {
        return i == i2;
    }

    public static String f(int i) {
        return d(i, b) ? "Clip" : d(i, c) ? "Ellipsis" : d(i, d) ? "Visible" : "Invalid";
    }

    public static int c(int i) {
        return i;
    }

    public static int e(int i) {
        return i;
    }
}
