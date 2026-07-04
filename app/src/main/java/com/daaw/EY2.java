package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class EY2 extends AbstractC5705jZ2 {
    public final int a;
    public final int b;
    public final CY2 c;

    public /* synthetic */ EY2(int i, int i2, CY2 cy2, DY2 dy2) {
        this.a = i;
        this.b = i2;
        this.c = cy2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        CY2 cy2 = this.c;
        if (cy2 == CY2.e) {
            return this.b;
        }
        if (cy2 == CY2.b || cy2 == CY2.c || cy2 == CY2.d) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final CY2 d() {
        return this.c;
    }

    public final boolean e() {
        return this.c != CY2.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EY2)) {
            return false;
        }
        EY2 ey2 = (EY2) obj;
        return ey2.a == this.a && ey2.c() == c() && ey2.c == this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{EY2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.c) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
