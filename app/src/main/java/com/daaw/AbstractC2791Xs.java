package com.daaw;

/* JADX INFO: renamed from: com.daaw.Xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2791Xs {
    public static final a a = new a(null);
    public static final long b = AbstractC2895Ys.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: com.daaw.Xs$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return AbstractC2791Xs.b;
        }

        public a() {
        }
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float e(long j) {
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int f(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String g(long j) {
        if (d(j) == e(j)) {
            return "CornerRadius.circular(" + AbstractC8472tS.a(d(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC8472tS.a(d(j), 1) + ", " + AbstractC8472tS.a(e(j), 1) + ')';
    }

    public static long b(long j) {
        return j;
    }
}
