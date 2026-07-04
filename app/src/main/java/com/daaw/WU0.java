package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class WU0 {
    public final Object a;
    public final int b;
    public final int c;

    public WU0(Object obj, int i, int i2) {
        G10.g(obj, "span");
        this.a = obj;
        this.b = i;
        this.c = i2;
    }

    public final Object a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WU0)) {
            return false;
        }
        WU0 wu0 = (WU0) obj;
        return G10.c(this.a, wu0.a) && this.b == wu0.b && this.c == wu0.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        return "SpanRange(span=" + this.a + ", start=" + this.b + ", end=" + this.c + ')';
    }
}
