package com.daaw;

/* JADX INFO: renamed from: com.daaw.f21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4437f21 {
    public static final a c = new a(null);
    public static final C4437f21 d = new C4437f21(1.0f, 0.0f);
    public final float a;
    public final float b;

    /* JADX INFO: renamed from: com.daaw.f21$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C4437f21 a() {
            return C4437f21.d;
        }

        public a() {
        }
    }

    public C4437f21(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4437f21)) {
            return false;
        }
        C4437f21 c4437f21 = (C4437f21) obj;
        return this.a == c4437f21.a && this.b == c4437f21.b;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ')';
    }
}
