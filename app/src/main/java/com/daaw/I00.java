package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class I00 {
    public static final a b = new a(null);
    public static final long c = c(0);
    public final long a;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return I00.c;
        }

        public a() {
        }
    }

    public /* synthetic */ I00(long j) {
        this.a = j;
    }

    public static final /* synthetic */ I00 b(long j) {
        return new I00(j);
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof I00) && j == ((I00) obj).j();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final int f(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int g(long j) {
        return (int) (j >> 32);
    }

    public static int h(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String i(long j) {
        return g(j) + " x " + f(j);
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
