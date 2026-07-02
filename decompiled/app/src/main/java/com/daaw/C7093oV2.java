package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.oV2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7093oV2 extends AbstractC4568fU2 {
    public final int a;
    public final int b = 12;
    public final int c = 16;
    public final C6535mV2 d;

    public /* synthetic */ C7093oV2(int i, int i2, int i3, C6535mV2 c6535mV2, AbstractC6814nV2 abstractC6814nV2) {
        this.a = i;
        this.d = c6535mV2;
    }

    public final int a() {
        return this.a;
    }

    public final C6535mV2 b() {
        return this.d;
    }

    public final boolean c() {
        return this.d != C6535mV2.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7093oV2)) {
            return false;
        }
        C7093oV2 c7093oV2 = (C7093oV2) obj;
        return c7093oV2.a == this.a && c7093oV2.d == this.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C7093oV2.class, Integer.valueOf(this.a), 12, 16, this.d});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.d) + ", 12-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
