package com.daaw;

/* JADX INFO: renamed from: com.daaw.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6288ld extends AbstractC5691jW0 {
    public final long a;
    public final long b;
    public final long c;

    public C6288ld(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // com.daaw.AbstractC5691jW0
    public long b() {
        return this.b;
    }

    @Override // com.daaw.AbstractC5691jW0
    public long c() {
        return this.a;
    }

    @Override // com.daaw.AbstractC5691jW0
    public long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5691jW0) {
            AbstractC5691jW0 abstractC5691jW0 = (AbstractC5691jW0) obj;
            if (this.a == abstractC5691jW0.c() && this.b == abstractC5691jW0.b() && this.c == abstractC5691jW0.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return ((int) (j3 ^ (j3 >>> 32))) ^ i;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }
}
