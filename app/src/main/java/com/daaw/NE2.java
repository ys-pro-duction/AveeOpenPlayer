package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class NE2 {
    public static final NE2 c = new NE2(-1, -1);
    public static final NE2 d = new NE2(0, 0);
    public final int a;
    public final int b;

    public NE2(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        AbstractC6048km2.d(z);
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof NE2) {
            NE2 ne2 = (NE2) obj;
            if (this.a == ne2.a && this.b == ne2.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
