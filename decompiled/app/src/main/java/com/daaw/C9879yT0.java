package com.daaw;

/* JADX INFO: renamed from: com.daaw.yT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9879yT0 {
    public static final a b = new a(null);
    public static final long c = BT0.a(0.0f, 0.0f);
    public static final long d = BT0.a(Float.NaN, Float.NaN);
    public final long a;

    /* JADX INFO: renamed from: com.daaw.yT0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return C9879yT0.d;
        }

        public final long b() {
            return C9879yT0.c;
        }

        public a() {
        }
    }

    public /* synthetic */ C9879yT0(long j) {
        this.a = j;
    }

    public static final /* synthetic */ C9879yT0 c(long j) {
        return new C9879yT0(j);
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof C9879yT0) && j == ((C9879yT0) obj).l();
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final float g(long j) {
        if (j == d) {
            throw new IllegalStateException("Size is unspecified");
        }
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float h(long j) {
        return Math.min(Math.abs(i(j)), Math.abs(g(j)));
    }

    public static final float i(long j) {
        if (j == d) {
            throw new IllegalStateException("Size is unspecified");
        }
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int j(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String k(long j) {
        if (j == b.a()) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC8472tS.a(i(j), 1) + ", " + AbstractC8472tS.a(g(j), 1) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ long l() {
        return this.a;
    }

    public String toString() {
        return k(this.a);
    }

    public static long d(long j) {
        return j;
    }
}
