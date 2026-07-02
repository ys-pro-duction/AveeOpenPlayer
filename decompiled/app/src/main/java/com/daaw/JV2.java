package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class JV2 extends AbstractC4568fU2 {
    public final int a;
    public final HV2 b;

    public /* synthetic */ JV2(int i, HV2 hv2, IV2 iv2) {
        this.a = i;
        this.b = hv2;
    }

    public final int a() {
        return this.a;
    }

    public final HV2 b() {
        return this.b;
    }

    public final boolean c() {
        return this.b != HV2.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof JV2)) {
            return false;
        }
        JV2 jv2 = (JV2) obj;
        return jv2.a == this.a && jv2.b == this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{JV2.class, Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
