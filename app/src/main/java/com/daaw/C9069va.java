package com.daaw;

/* JADX INFO: renamed from: com.daaw.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9069va {
    public final Object a;
    public final Object b;

    public C9069va(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final Object c() {
        return this.a;
    }

    public final Object d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9069va)) {
            return false;
        }
        C9069va c9069va = (C9069va) obj;
        return G10.c(this.a, c9069va.a) && G10.c(this.b, c9069va.b);
    }

    public int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.a + ", upper=" + this.b + ')';
    }
}
