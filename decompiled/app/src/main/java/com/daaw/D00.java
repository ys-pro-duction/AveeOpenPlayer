package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class D00 {
    public static final a b = new a(null);
    public static final long c = E00.a(0, 0);
    public final long a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return D00.c;
        }

        public a() {
        }
    }

    public /* synthetic */ D00(long j) {
        this.a = j;
    }

    public static final /* synthetic */ D00 b(long j) {
        return new D00(j);
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof D00) && j == ((D00) obj).j();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final int f(long j) {
        return (int) (j >> 32);
    }

    public static final int g(long j) {
        return (int) (j & 4294967295L);
    }

    public static int h(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String i(long j) {
        return '(' + f(j) + ", " + g(j) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
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

    public static long c(long j) {
        return j;
    }
}
