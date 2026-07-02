package com.daaw;

/* JADX INFO: renamed from: com.daaw.mD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6460mD implements Comparable {
    public static final a C = new a(null);
    public static final float D = l(0.0f);
    public static final float E = l(Float.POSITIVE_INFINITY);
    public static final float F = l(Float.NaN);
    public final float B;

    /* JADX INFO: renamed from: com.daaw.mD$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final float a() {
            return C6460mD.D;
        }

        public final float b() {
            return C6460mD.F;
        }

        public a() {
        }
    }

    public /* synthetic */ C6460mD(float f) {
        this.B = f;
    }

    public static final /* synthetic */ C6460mD g(float f) {
        return new C6460mD(f);
    }

    public static int k(float f, float f2) {
        return Float.compare(f, f2);
    }

    public static boolean m(float f, Object obj) {
        if (obj instanceof C6460mD) {
            return G10.c(Float.valueOf(f), Float.valueOf(((C6460mD) obj).q()));
        }
        return false;
    }

    public static final boolean n(float f, float f2) {
        return G10.c(Float.valueOf(f), Float.valueOf(f2));
    }

    public static int o(float f) {
        return Float.floatToIntBits(f);
    }

    public static String p(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return h(((C6460mD) obj).q());
    }

    public boolean equals(Object obj) {
        return m(this.B, obj);
    }

    public int h(float f) {
        return k(this.B, f);
    }

    public int hashCode() {
        return o(this.B);
    }

    public final /* synthetic */ float q() {
        return this.B;
    }

    public String toString() {
        return p(this.B);
    }

    public static float l(float f) {
        return f;
    }
}
