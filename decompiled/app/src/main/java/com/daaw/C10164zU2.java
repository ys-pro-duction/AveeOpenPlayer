package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.zU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10164zU2 extends AbstractC4568fU2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final C8483tU2 e;
    public final C8204sU2 f;

    public /* synthetic */ C10164zU2(int i, int i2, int i3, int i4, C8483tU2 c8483tU2, C8204sU2 c8204sU2, AbstractC9885yU2 abstractC9885yU2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = c8483tU2;
        this.f = c8204sU2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final C8204sU2 e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10164zU2)) {
            return false;
        }
        C10164zU2 c10164zU2 = (C10164zU2) obj;
        return c10164zU2.a == this.a && c10164zU2.b == this.b && c10164zU2.c == this.c && c10164zU2.d == this.d && c10164zU2.e == this.e && c10164zU2.f == this.f;
    }

    public final C8483tU2 f() {
        return this.e;
    }

    public final boolean g() {
        return this.e != C8483tU2.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C10164zU2.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        C8204sU2 c8204sU2 = this.f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.e) + ", hashType: " + String.valueOf(c8204sU2) + ", " + this.c + "-byte IV, and " + this.d + "-byte tags, and " + this.a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }
}
