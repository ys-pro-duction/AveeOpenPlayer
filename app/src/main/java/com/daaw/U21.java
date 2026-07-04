package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class U21 {
    public static final a b = new a(null);
    public static final long c = e(0);
    public static final long d = e(4294967296L);
    public static final long e = e(8589934592L);
    public final long a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return U21.e;
        }

        public final long b() {
            return U21.d;
        }

        public final long c() {
            return U21.c;
        }

        public a() {
        }
    }

    public /* synthetic */ U21(long j) {
        this.a = j;
    }

    public static final /* synthetic */ U21 d(long j) {
        return new U21(j);
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof U21) && j == ((U21) obj).j();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static int h(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String i(long j) {
        return g(j, c) ? "Unspecified" : g(j, d) ? "Sp" : g(j, e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return h(this.a);
    }

    public final /* synthetic */ long j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }

    public static long e(long j) {
        return j;
    }
}
