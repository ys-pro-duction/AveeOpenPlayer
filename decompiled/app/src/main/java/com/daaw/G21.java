package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class G21 {
    public static final a b = new a(null);
    public static final long c = H21.a(0);
    public final long a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return G21.c;
        }

        public a() {
        }
    }

    public /* synthetic */ G21(long j) {
        this.a = j;
    }

    public static final /* synthetic */ G21 b(long j) {
        return new G21(j);
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof G21) && j == ((G21) obj).m();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final boolean f(long j) {
        return j(j) == g(j);
    }

    public static final int g(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int h(long j) {
        return j(j) > g(j) ? j(j) : g(j);
    }

    public static final int i(long j) {
        return j(j) > g(j) ? g(j) : j(j);
    }

    public static final int j(long j) {
        return (int) (j >> 32);
    }

    public static int k(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String l(long j) {
        return "TextRange(" + j(j) + ", " + g(j) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return k(this.a);
    }

    public final /* synthetic */ long m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }

    public static long c(long j) {
        return j;
    }
}
