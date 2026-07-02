package com.daaw;

import com.daaw.AbstractC5362iK;

/* JADX INFO: renamed from: com.daaw.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2415Uc extends AbstractC5362iK.b {
    public final long a;
    public final AbstractC5362iK.a b;

    public C2415Uc(long j, AbstractC5362iK.a aVar) {
        this.a = j;
        if (aVar == null) {
            throw new NullPointerException("Null offset");
        }
        this.b = aVar;
    }

    @Override // com.daaw.AbstractC5362iK.b
    public AbstractC5362iK.a c() {
        return this.b;
    }

    @Override // com.daaw.AbstractC5362iK.b
    public long d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5362iK.b) {
            AbstractC5362iK.b bVar = (AbstractC5362iK.b) obj;
            if (this.a == bVar.d() && this.b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.a + ", offset=" + this.b + "}";
    }
}
