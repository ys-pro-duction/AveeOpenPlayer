package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class W70 {
    public static final a a = new a(null);
    public static final int b = e(0);
    public static final int c = e(1);
    public static final int d = e(2);
    public static final int e = e(3);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return W70.c;
        }

        public final int b() {
            return W70.b;
        }

        public final int c() {
            return W70.e;
        }

        public final int d() {
            return W70.d;
        }

        public a() {
        }
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static String h(int i) {
        return f(i, b) ? "None" : f(i, c) ? "Characters" : f(i, d) ? "Words" : f(i, e) ? "Sentences" : "Invalid";
    }

    public static int e(int i) {
        return i;
    }

    public static int g(int i) {
        return i;
    }
}
