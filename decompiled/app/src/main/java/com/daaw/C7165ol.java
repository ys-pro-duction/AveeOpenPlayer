package com.daaw;

/* JADX INFO: renamed from: com.daaw.ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7165ol {
    public final C6607ml a;
    public final int b;

    public C7165ol(C6607ml c6607ml, int i) {
        G10.g(c6607ml, "classId");
        this.a = c6607ml;
        this.b = i;
    }

    public final C6607ml a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final C6607ml d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7165ol)) {
            return false;
        }
        C7165ol c7165ol = (C7165ol) obj;
        return G10.c(this.a, c7165ol.a) && this.b == c7165ol.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.a);
        int i3 = this.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }
}
