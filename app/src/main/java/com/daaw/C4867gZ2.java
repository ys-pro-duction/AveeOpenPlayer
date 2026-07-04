package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.gZ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4867gZ2 extends AbstractC5705jZ2 {
    public final int a;
    public final int b;
    public final C4299eZ2 c;
    public final C4021dZ2 d;

    public /* synthetic */ C4867gZ2(int i, int i2, C4299eZ2 c4299eZ2, C4021dZ2 c4021dZ2, AbstractC4588fZ2 abstractC4588fZ2) {
        this.a = i;
        this.b = i2;
        this.c = c4299eZ2;
        this.d = c4021dZ2;
    }

    public static YY2 d() {
        return new YY2(null);
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        C4299eZ2 c4299eZ2 = this.c;
        if (c4299eZ2 == C4299eZ2.e) {
            return this.b;
        }
        if (c4299eZ2 == C4299eZ2.b || c4299eZ2 == C4299eZ2.c || c4299eZ2 == C4299eZ2.d) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final C4021dZ2 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4867gZ2)) {
            return false;
        }
        C4867gZ2 c4867gZ2 = (C4867gZ2) obj;
        return c4867gZ2.a == this.a && c4867gZ2.c() == c() && c4867gZ2.c == this.c && c4867gZ2.d == this.d;
    }

    public final C4299eZ2 f() {
        return this.c;
    }

    public final boolean g() {
        return this.c != C4299eZ2.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C4867gZ2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        C4021dZ2 c4021dZ2 = this.d;
        return "HMAC Parameters (variant: " + String.valueOf(this.c) + ", hashType: " + String.valueOf(c4021dZ2) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
