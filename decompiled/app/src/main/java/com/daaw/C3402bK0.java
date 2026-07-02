package com.daaw;

/* JADX INFO: renamed from: com.daaw.bK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3402bK0 implements EN {
    public final float a;
    public final float b;
    public final long c;

    public C3402bK0(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3402bK0)) {
            return false;
        }
        C3402bK0 c3402bK0 = (C3402bK0) obj;
        return c3402bK0.a == this.a && c3402bK0.b == this.b && c3402bK0.c == this.c;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + AbstractC2687Ws.a(this.c);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.a + ",horizontalScrollPixels=" + this.b + ",uptimeMillis=" + this.c + ')';
    }
}
