package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.mJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6485mJ0 {
    public final int a;
    public final long b;
    public final long c;
    public final double d;
    public final Long e;
    public final Set f;

    public C6485mJ0(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = PY.G(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6485mJ0)) {
            return false;
        }
        C6485mJ0 c6485mJ0 = (C6485mJ0) obj;
        return this.a == c6485mJ0.a && this.b == c6485mJ0.b && this.c == c6485mJ0.c && Double.compare(this.d, c6485mJ0.d) == 0 && AbstractC8301sp0.a(this.e, c6485mJ0.e) && AbstractC8301sp0.a(this.f, c6485mJ0.f);
    }

    public int hashCode() {
        return AbstractC8301sp0.b(Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f);
    }

    public String toString() {
        return AbstractC6329ll0.b(this).b("maxAttempts", this.a).c("initialBackoffNanos", this.b).c("maxBackoffNanos", this.c).a("backoffMultiplier", this.d).d("perAttemptRecvTimeoutNanos", this.e).d("retryableStatusCodes", this.f).toString();
    }
}
