package com.daaw;

/* JADX INFO: renamed from: com.daaw.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4037dd extends AbstractC1149Id0 {
    public final long a;

    public C4037dd(long j) {
        this.a = j;
    }

    @Override // com.daaw.AbstractC1149Id0
    public long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC1149Id0) && this.a == ((AbstractC1149Id0) obj).c();
    }

    public int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
