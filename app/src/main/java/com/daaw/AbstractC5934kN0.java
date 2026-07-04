package com.daaw;

/* JADX INFO: renamed from: com.daaw.kN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5934kN0 {
    public static final a a = new a(null);
    public static final long b = AbstractC6222lN0.a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: com.daaw.kN0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public static final float b(long j) {
        if (j == b) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        if (j == b) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static long a(long j) {
        return j;
    }
}
