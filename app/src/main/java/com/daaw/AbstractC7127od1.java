package com.daaw;

/* JADX INFO: renamed from: com.daaw.od1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7127od1 {
    public static final a a = new a(null);
    public static final long b = AbstractC7685qd1.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: com.daaw.od1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public static final float b(long j) {
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static long a(long j) {
        return j;
    }
}
