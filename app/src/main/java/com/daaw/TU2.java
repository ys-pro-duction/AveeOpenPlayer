package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class TU2 extends AbstractC4568fU2 {
    public final int a;
    public final int b;
    public final int c = 16;
    public final RU2 d;

    public /* synthetic */ TU2(int i, int i2, int i3, RU2 ru2, SU2 su2) {
        this.a = i;
        this.b = i2;
        this.d = ru2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final RU2 c() {
        return this.d;
    }

    public final boolean d() {
        return this.d != RU2.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TU2)) {
            return false;
        }
        TU2 tu2 = (TU2) obj;
        return tu2.a == this.a && tu2.b == this.b && tu2.d == this.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{TU2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.d});
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.d) + ", " + this.b + "-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
