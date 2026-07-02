package com.daaw;

/* JADX INFO: renamed from: com.daaw.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4604fd extends AbstractC10271zr0 {
    public final int a;
    public final AbstractC9688xm0 b;

    public C4604fd(int i, AbstractC9688xm0 abstractC9688xm0) {
        this.a = i;
        if (abstractC9688xm0 == null) {
            throw new NullPointerException("Null mutation");
        }
        this.b = abstractC9688xm0;
    }

    @Override // com.daaw.AbstractC10271zr0
    public int c() {
        return this.a;
    }

    @Override // com.daaw.AbstractC10271zr0
    public AbstractC9688xm0 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10271zr0) {
            AbstractC10271zr0 abstractC10271zr0 = (AbstractC10271zr0) obj;
            if (this.a == abstractC10271zr0.c() && this.b.equals(abstractC10271zr0.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.a + ", mutation=" + this.b + "}";
    }
}
