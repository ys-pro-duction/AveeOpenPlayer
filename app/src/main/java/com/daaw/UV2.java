package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class UV2 extends AbstractC4568fU2 {
    public final TV2 a;

    public UV2(TV2 tv2) {
        this.a = tv2;
    }

    public static UV2 b(TV2 tv2) {
        return new UV2(tv2);
    }

    public final TV2 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UV2) && ((UV2) obj).a == this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{UV2.class, this.a});
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.a.toString() + ")";
    }
}
