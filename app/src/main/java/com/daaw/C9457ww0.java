package com.daaw;

/* JADX INFO: renamed from: com.daaw.ww0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9457ww0 {
    public static final C9457ww0 e = new C9457ww0(1.0f);
    public final float a;
    public final float b;
    public final boolean c;
    public final int d;

    public C9457ww0(float f) {
        this(f, 1.0f, false);
    }

    public long a(long j) {
        return j * ((long) this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9457ww0.class == obj.getClass()) {
            C9457ww0 c9457ww0 = (C9457ww0) obj;
            if (this.a == c9457ww0.a && this.b == c9457ww0.b && this.c == c9457ww0.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.a)) * 31) + Float.floatToRawIntBits(this.b)) * 31) + (this.c ? 1 : 0);
    }

    public C9457ww0(float f, float f2, boolean z) {
        AbstractC7115ob.a(f > 0.0f);
        AbstractC7115ob.a(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = Math.round(f * 1000.0f);
    }
}
