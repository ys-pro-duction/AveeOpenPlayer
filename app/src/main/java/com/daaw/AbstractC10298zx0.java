package com.daaw;

/* JADX INFO: renamed from: com.daaw.zx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10298zx0 {
    public static final a a = new a(null);
    public static final int b = f(0);
    public static final int c = f(1);
    public static final int d = f(2);
    public static final int e = f(3);
    public static final int f = f(4);

    /* JADX INFO: renamed from: com.daaw.zx0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return AbstractC10298zx0.f;
        }

        public final int b() {
            return AbstractC10298zx0.d;
        }

        public final int c() {
            return AbstractC10298zx0.e;
        }

        public final int d() {
            return AbstractC10298zx0.c;
        }

        public final int e() {
            return AbstractC10298zx0.b;
        }

        public a() {
        }
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static String i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public static int f(int i) {
        return i;
    }

    public static int h(int i) {
        return i;
    }
}
