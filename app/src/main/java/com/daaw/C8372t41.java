package com.daaw;

/* JADX INFO: renamed from: com.daaw.t41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8372t41 {
    public final long a;
    public final long b;
    public final int c;

    public C8372t41(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8372t41)) {
            return false;
        }
        C8372t41 c8372t41 = (C8372t41) obj;
        return this.a == c8372t41.a && this.b == c8372t41.b && this.c == c8372t41.c;
    }

    public int hashCode() {
        return (((AbstractC2687Ws.a(this.a) * 31) + AbstractC2687Ws.a(this.b)) * 31) + this.c;
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.a + ", ModelVersion=" + this.b + ", TopicCode=" + this.c + " }");
    }
}
