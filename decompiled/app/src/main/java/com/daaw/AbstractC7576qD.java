package com.daaw;

import com.daaw.C6460mD;

/* JADX INFO: renamed from: com.daaw.qD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7576qD {
    public static final a a = new a(null);
    public static final long b;
    public static final long c;

    /* JADX INFO: renamed from: com.daaw.qD$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return AbstractC7576qD.c;
        }

        public final long b() {
            return AbstractC7576qD.b;
        }

        public a() {
        }
    }

    static {
        float f = 0;
        b = AbstractC7018oD.b(C6460mD.l(f), C6460mD.l(f));
        C6460mD.a aVar = C6460mD.C;
        c = AbstractC7018oD.b(aVar.b(), aVar.b());
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final float e(long j) {
        if (j == c) {
            throw new IllegalStateException("DpSize is unspecified");
        }
        C3970dN c3970dN = C3970dN.a;
        return C6460mD.l(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final float f(long j) {
        if (j == c) {
            throw new IllegalStateException("DpSize is unspecified");
        }
        C3970dN c3970dN = C3970dN.a;
        return C6460mD.l(Float.intBitsToFloat((int) (j >> 32)));
    }

    public static int g(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static long c(long j) {
        return j;
    }
}
