package com.daaw;

import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.pW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7375pW1 {
    public static final C7375pW1 d = new C7375pW1(1.0f, 1.0f);
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public static final InterfaceC9666xh3 g = new InterfaceC9666xh3() { // from class: com.daaw.JV1
    };
    public final float a;
    public final float b;
    public final int c;

    public C7375pW1(float f2, float f3) {
        AbstractC6048km2.d(f2 > 0.0f);
        AbstractC6048km2.d(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final long a(long j) {
        return j * ((long) this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7375pW1.class == obj.getClass()) {
            C7375pW1 c7375pW1 = (C7375pW1) obj;
            if (this.a == c7375pW1.a && this.b == c7375pW1.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.a) + 527) * 31) + Float.floatToRawIntBits(this.b);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.a), Float.valueOf(this.b));
    }
}
