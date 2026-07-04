package com.daaw;

/* JADX INFO: renamed from: com.daaw.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3808cn {
    public static final a a = new a(null);
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;

    /* JADX INFO: renamed from: com.daaw.cn$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return AbstractC3808cn.d;
        }

        public final long b() {
            return AbstractC3808cn.b;
        }

        public final long c() {
            return AbstractC3808cn.c;
        }

        public a() {
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        b = d((((long) 0) & 4294967295L) | j2);
        c = d((((long) 1) & 4294967295L) | j2);
        d = d(j2 | (((long) 2) & 4294967295L));
        e = d((j & 4294967295L) | (((long) 4) << 32));
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final int f(long j) {
        return (int) (j >> 32);
    }

    public static int g(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String h(long j) {
        return e(j, b) ? "Rgb" : e(j, c) ? "Xyz" : e(j, d) ? "Lab" : e(j, e) ? "Cmyk" : "Unknown";
    }

    public static long d(long j) {
        return j;
    }
}
