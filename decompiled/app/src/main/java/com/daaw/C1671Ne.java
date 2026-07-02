package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1671Ne {
    public static final a b = new a(null);
    public static final float c = c(0.5f);
    public static final float d = c(-0.5f);
    public static final float e = c(0.0f);
    public final float a;

    /* JADX INFO: renamed from: com.daaw.Ne$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final float a() {
            return C1671Ne.e;
        }

        public a() {
        }
    }

    public /* synthetic */ C1671Ne(float f) {
        this.a = f;
    }

    public static final /* synthetic */ C1671Ne b(float f) {
        return new C1671Ne(f);
    }

    public static boolean d(float f, Object obj) {
        if (obj instanceof C1671Ne) {
            return G10.c(Float.valueOf(f), Float.valueOf(((C1671Ne) obj).h()));
        }
        return false;
    }

    public static final boolean e(float f, float f2) {
        return G10.c(Float.valueOf(f), Float.valueOf(f2));
    }

    public static int f(float f) {
        return Float.floatToIntBits(f);
    }

    public static String g(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public final /* synthetic */ float h() {
        return this.a;
    }

    public int hashCode() {
        return f(this.a);
    }

    public String toString() {
        return g(this.a);
    }

    public static float c(float f) {
        return f;
    }
}
