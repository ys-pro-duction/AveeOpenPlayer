package com.daaw;

/* JADX INFO: renamed from: com.daaw.Rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2145Rn {
    public final Object a;
    public final NQ b;

    public C2145Rn(Object obj, NQ nq) {
        this.a = obj;
        this.b = nq;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2145Rn)) {
            return false;
        }
        C2145Rn c2145Rn = (C2145Rn) obj;
        return G10.c(this.a, c2145Rn.a) && G10.c(this.b, c2145Rn.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
