package com.daaw;

/* JADX INFO: renamed from: com.daaw.Tg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2328Tg0 {
    public final String a;
    public final H00 b;

    public C2328Tg0(String str, H00 h00) {
        G10.g(str, "value");
        G10.g(h00, "range");
        this.a = str;
        this.b = h00;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2328Tg0)) {
            return false;
        }
        C2328Tg0 c2328Tg0 = (C2328Tg0) obj;
        return G10.c(this.a, c2328Tg0.a) && G10.c(this.b, c2328Tg0.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
