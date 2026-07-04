package com.daaw;

/* JADX INFO: renamed from: com.daaw.Tj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2341Tj1 extends AbstractC2549Vj1 {
    public final long a;

    public C2341Tj1(int i, long j) {
        this.a = j;
    }

    @Override // com.daaw.AbstractC2549Vj1
    public final int a() {
        return 3;
    }

    @Override // com.daaw.AbstractC2549Vj1
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2549Vj1) {
            AbstractC2549Vj1 abstractC2549Vj1 = (AbstractC2549Vj1) obj;
            abstractC2549Vj1.a();
            if (this.a == abstractC2549Vj1.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (-724379968) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.a + "}";
    }
}
