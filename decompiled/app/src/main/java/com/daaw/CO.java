package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class CO {
    public static final a a = new a(null);
    public static final int b = d(0);
    public static final int c = d(1);
    public static final int d = d(2);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return CO.d;
        }

        public final int b() {
            return CO.b;
        }

        public final int c() {
            return CO.c;
        }

        public a() {
        }
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }

    public static String g(int i) {
        if (e(i, b)) {
            return "Blocking";
        }
        if (e(i, c)) {
            return "Optional";
        }
        if (e(i, d)) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }

    public static int d(int i) {
        return i;
    }

    public static int f(int i) {
        return i;
    }
}
