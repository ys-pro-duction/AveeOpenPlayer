package com.daaw;

import com.daaw.AbstractC2835Yd;

/* JADX INFO: renamed from: com.daaw.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6841nc extends AbstractC2835Yd {
    public final AbstractC2835Yd.a a;
    public final long b;

    public C6841nc(AbstractC2835Yd.a aVar, long j) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.a = aVar;
        this.b = j;
    }

    @Override // com.daaw.AbstractC2835Yd
    public long b() {
        return this.b;
    }

    @Override // com.daaw.AbstractC2835Yd
    public AbstractC2835Yd.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2835Yd) {
            AbstractC2835Yd abstractC2835Yd = (AbstractC2835Yd) obj;
            if (this.a.equals(abstractC2835Yd.c()) && this.b == abstractC2835Yd.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}
