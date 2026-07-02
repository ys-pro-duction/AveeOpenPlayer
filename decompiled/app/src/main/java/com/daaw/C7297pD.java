package com.daaw;

import com.daaw.C6460mD;

/* JADX INFO: renamed from: com.daaw.pD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7297pD {
    public static final a b = new a(null);
    public static final long c;
    public static final long d;
    public final long a;

    /* JADX INFO: renamed from: com.daaw.pD$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final long a() {
            return C7297pD.d;
        }

        public a() {
        }
    }

    static {
        float f = 0;
        c = AbstractC7018oD.a(C6460mD.l(f), C6460mD.l(f));
        C6460mD.a aVar = C6460mD.C;
        d = AbstractC7018oD.a(aVar.b(), aVar.b());
    }

    public /* synthetic */ C7297pD(long j) {
        this.a = j;
    }

    public static final /* synthetic */ C7297pD b(long j) {
        return new C7297pD(j);
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof C7297pD) && j == ((C7297pD) obj).i();
    }

    public static final float e(long j) {
        if (j == d) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        C3970dN c3970dN = C3970dN.a;
        return C6460mD.l(Float.intBitsToFloat((int) (j >> 32)));
    }

    public static final float f(long j) {
        if (j == d) {
            throw new IllegalStateException("DpOffset is unspecified");
        }
        C3970dN c3970dN = C3970dN.a;
        return C6460mD.l(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static int g(long j) {
        return AbstractC2687Ws.a(j);
    }

    public static String h(long j) {
        if (j == b.a()) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) C6460mD.p(e(j))) + ", " + ((Object) C6460mD.p(f(j))) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return g(this.a);
    }

    public final /* synthetic */ long i() {
        return this.a;
    }

    public String toString() {
        return h(this.a);
    }

    public static long c(long j) {
        return j;
    }
}
