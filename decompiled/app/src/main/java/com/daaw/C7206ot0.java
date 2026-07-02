package com.daaw;

/* JADX INFO: renamed from: com.daaw.ot0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7206ot0 {
    public static final a b = new a(null);
    public static final int c = d(0);
    public static final int d = d(1);
    public final int a;

    /* JADX INFO: renamed from: com.daaw.ot0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return C7206ot0.d;
        }

        public final int b() {
            return C7206ot0.c;
        }

        public a() {
        }
    }

    public /* synthetic */ C7206ot0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ C7206ot0 c(int i) {
        return new C7206ot0(i);
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof C7206ot0) && i == ((C7206ot0) obj).i();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static String h(int i) {
        return f(i, c) ? "NonZero" : f(i, d) ? "EvenOdd" : "Unknown";
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
