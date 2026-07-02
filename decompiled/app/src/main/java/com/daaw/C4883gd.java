package com.daaw;

/* JADX INFO: renamed from: com.daaw.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4883gd extends AbstractC1628Mt0 {
    public final long a;
    public final H51 b;
    public final KH c;

    public C4883gd(long j, H51 h51, KH kh) {
        this.a = j;
        if (h51 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = h51;
        if (kh == null) {
            throw new NullPointerException("Null event");
        }
        this.c = kh;
    }

    @Override // com.daaw.AbstractC1628Mt0
    public KH b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1628Mt0
    public long c() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1628Mt0
    public H51 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1628Mt0) {
            AbstractC1628Mt0 abstractC1628Mt0 = (AbstractC1628Mt0) obj;
            if (this.a == abstractC1628Mt0.c() && this.b.equals(abstractC1628Mt0.d()) && this.c.equals(abstractC1628Mt0.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
