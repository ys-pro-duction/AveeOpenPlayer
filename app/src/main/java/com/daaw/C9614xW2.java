package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.xW2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9614xW2 extends AbstractC4568fU2 {
    public final C9335wW2 a;

    public C9614xW2(C9335wW2 c9335wW2) {
        this.a = c9335wW2;
    }

    public static C9614xW2 b(C9335wW2 c9335wW2) {
        return new C9614xW2(c9335wW2);
    }

    public final C9335wW2 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9614xW2) && ((C9614xW2) obj).a == this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C9614xW2.class, this.a});
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.a.toString() + ")";
    }
}
