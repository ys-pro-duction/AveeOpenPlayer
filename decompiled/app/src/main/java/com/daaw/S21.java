package com.daaw;

import com.daaw.U21;

/* JADX INFO: loaded from: classes.dex */
public final class S21 {
    public static final a b = new a(null);
    public static final U21[] c;
    public static final long d;
    public final long a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return S21.d;
        }

        public a() {
        }
    }

    static {
        U21.a aVar = U21.b;
        c = new U21[]{U21.d(aVar.c()), U21.d(aVar.b()), U21.d(aVar.a())};
        d = T21.f(0L, Float.NaN);
    }

    public /* synthetic */ S21(long j) {
        this.a = j;
    }

    public static final /* synthetic */ S21 b(long j) {
        return new S21(j);
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof S21) && j == ((S21) obj).k();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final long f(long j) {
        return j & 1095216660480L;
    }

    public static final long g(long j) {
        return c[(int) (f(j) >>> 32)].j();
    }

    public static final float h(long j) {
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int i(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String j(long j) {
        long jG = g(j);
        U21.a aVar = U21.b;
        if (U21.g(jG, aVar.c())) {
            return "Unspecified";
        }
        if (U21.g(jG, aVar.b())) {
            return h(j) + ".sp";
        }
        if (!U21.g(jG, aVar.a())) {
            return "Invalid";
        }
        return h(j) + ".em";
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return i(this.a);
    }

    public final /* synthetic */ long k() {
        return this.a;
    }

    public String toString() {
        return j(this.a);
    }

    public static long c(long j) {
        return j;
    }
}
