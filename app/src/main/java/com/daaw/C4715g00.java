package com.daaw;

/* JADX INFO: renamed from: com.daaw.g00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4715g00 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C4715g00(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4715g00)) {
            return false;
        }
        C4715g00 c4715g00 = (C4715g00) obj;
        return this.a == c4715g00.a && this.b == c4715g00.b && this.c == c4715g00.c && this.d == c4715g00.d;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ')';
    }
}
