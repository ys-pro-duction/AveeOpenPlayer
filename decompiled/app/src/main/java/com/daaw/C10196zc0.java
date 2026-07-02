package com.daaw;

/* JADX INFO: renamed from: com.daaw.zc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10196zc0 {
    public static final a b = new a(null);
    public static final int c = d(0);
    public static final int d = d(1);
    public final int a;

    /* JADX INFO: renamed from: com.daaw.zc0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return C10196zc0.d;
        }

        public final int b() {
            return C10196zc0.c;
        }

        public a() {
        }
    }

    public /* synthetic */ C10196zc0(int i) {
        this.a = i;
    }

    public static final /* synthetic */ C10196zc0 c(int i) {
        return new C10196zc0(i);
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof C10196zc0) && i == ((C10196zc0) obj).i();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static String h(int i) {
        return f(i, c) ? "Polite" : f(i, d) ? "Assertive" : "Unknown";
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
