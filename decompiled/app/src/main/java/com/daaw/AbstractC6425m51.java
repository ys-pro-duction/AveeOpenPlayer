package com.daaw;

/* JADX INFO: renamed from: com.daaw.m51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6425m51 {
    public static final a a = new a(null);
    public static final long b = AbstractC6704n51.a(0.5f, 0.5f);

    /* JADX INFO: renamed from: com.daaw.m51$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return AbstractC6425m51.b;
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
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public static long b(long j) {
        return j;
    }
}
