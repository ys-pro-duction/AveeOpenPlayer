package com.daaw;

/* JADX INFO: renamed from: com.daaw.yp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9982yp0 {
    public static final a b = new a(null);
    public static final long c = AbstractC0460Bp0.a(0.0f, 0.0f);
    public static final long d = AbstractC0460Bp0.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final long e = AbstractC0460Bp0.a(Float.NaN, Float.NaN);
    public final long a;

    /* JADX INFO: renamed from: com.daaw.yp0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return C9982yp0.d;
        }

        public final long b() {
            return C9982yp0.e;
        }

        public final long c() {
            return C9982yp0.c;
        }

        public a() {
        }
    }

    public /* synthetic */ C9982yp0(long j) {
        this.a = j;
    }

    public static final /* synthetic */ C9982yp0 d(long j) {
        return new C9982yp0(j);
    }

    public static final float e(long j) {
        return l(j);
    }

    public static final float f(long j) {
        return m(j);
    }

    public static boolean h(long j, Object obj) {
        return (obj instanceof C9982yp0) && j == ((C9982yp0) obj).t();
    }

    public static final boolean i(long j, long j2) {
        return j == j2;
    }

    public static final float j(long j) {
        return (float) Math.sqrt((l(j) * l(j)) + (m(j) * m(j)));
    }

    public static final float k(long j) {
        return (l(j) * l(j)) + (m(j) * m(j));
    }

    public static final float l(long j) {
        if (j == e) {
            throw new IllegalStateException("Offset is unspecified");
        }
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float m(long j) {
        if (j == e) {
            throw new IllegalStateException("Offset is unspecified");
        }
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int n(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static final boolean o(long j) {
        if (Float.isNaN(l(j)) || Float.isNaN(m(j))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        return true;
    }

    public static final long p(long j, long j2) {
        return AbstractC0460Bp0.a(l(j) - l(j2), m(j) - m(j2));
    }

    public static final long q(long j, long j2) {
        return AbstractC0460Bp0.a(l(j) + l(j2), m(j) + m(j2));
    }

    public static final long r(long j, float f) {
        return AbstractC0460Bp0.a(l(j) * f, m(j) * f);
    }

    public static String s(long j) {
        if (!AbstractC0460Bp0.c(j)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC8472tS.a(l(j), 1) + ", " + AbstractC8472tS.a(m(j), 1) + ')';
    }

    public boolean equals(Object obj) {
        return h(this.a, obj);
    }

    public int hashCode() {
        return n(this.a);
    }

    public final /* synthetic */ long t() {
        return this.a;
    }

    public String toString() {
        return s(this.a);
    }

    public static long g(long j) {
        return j;
    }
}
