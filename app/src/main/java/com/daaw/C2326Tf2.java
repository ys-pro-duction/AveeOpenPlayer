package com.daaw;

/* JADX INFO: renamed from: com.daaw.Tf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2326Tf2 {
    public static final C2326Tf2 e = new C2326Tf2(0, 0, 0, 1.0f);
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(2, 36);
    public static final String i = Integer.toString(3, 36);
    public static final InterfaceC9666xh3 j = new InterfaceC9666xh3() { // from class: com.daaw.pf2
    };
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    public C2326Tf2(int i2, int i3, int i4, float f2) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2326Tf2) {
            C2326Tf2 c2326Tf2 = (C2326Tf2) obj;
            if (this.a == c2326Tf2.a && this.b == c2326Tf2.b && this.c == c2326Tf2.c && this.d == c2326Tf2.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a + 217) * 31) + this.b) * 31) + this.c) * 31) + Float.floatToRawIntBits(this.d);
    }
}
