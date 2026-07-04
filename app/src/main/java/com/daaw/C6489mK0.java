package com.daaw;

/* JADX INFO: renamed from: com.daaw.mK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6489mK0 {
    public float a;
    public boolean b;
    public AbstractC0696Du c;

    public C6489mK0(float f, boolean z, AbstractC0696Du abstractC0696Du) {
        this.a = f;
        this.b = z;
        this.c = abstractC0696Du;
    }

    public final AbstractC0696Du a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final float c() {
        return this.a;
    }

    public final void d(AbstractC0696Du abstractC0696Du) {
        this.c = abstractC0696Du;
    }

    public final void e(boolean z) {
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6489mK0)) {
            return false;
        }
        C6489mK0 c6489mK0 = (C6489mK0) obj;
        return G10.c(Float.valueOf(this.a), Float.valueOf(c6489mK0.a)) && this.b == c6489mK0.b && G10.c(this.c, c6489mK0.c);
    }

    public final void f(float f) {
        this.a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iFloatToIntBits + r1) * 31;
        AbstractC0696Du abstractC0696Du = this.c;
        return i + (abstractC0696Du == null ? 0 : abstractC0696Du.hashCode());
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ')';
    }

    public /* synthetic */ C6489mK0(float f, boolean z, AbstractC0696Du abstractC0696Du, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : abstractC0696Du);
    }
}
