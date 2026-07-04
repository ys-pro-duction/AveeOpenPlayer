package com.daaw;

/* JADX INFO: renamed from: com.daaw.Gs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1001Gs0 {
    public final InterfaceC1105Hs0 a;
    public final int b;
    public final int c;

    public C1001Gs0(InterfaceC1105Hs0 interfaceC1105Hs0, int i, int i2) {
        G10.g(interfaceC1105Hs0, "intrinsics");
        this.a = interfaceC1105Hs0;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final InterfaceC1105Hs0 b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1001Gs0)) {
            return false;
        }
        C1001Gs0 c1001Gs0 = (C1001Gs0) obj;
        return G10.c(this.a, c1001Gs0.a) && this.b == c1001Gs0.b && this.c == c1001Gs0.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}
