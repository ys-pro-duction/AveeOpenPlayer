package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class K31 {
    public final Object a;
    public final long b;

    public /* synthetic */ K31(Object obj, long j, AbstractC2911Yw abstractC2911Yw) {
        this(obj, j);
    }

    public final long a() {
        return this.b;
    }

    public final Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K31)) {
            return false;
        }
        K31 k31 = (K31) obj;
        return G10.c(this.a, k31.a) && LE.m(this.b, k31.b);
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + LE.A(this.b);
    }

    public String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) LE.I(this.b)) + ')';
    }

    public K31(Object obj, long j) {
        this.a = obj;
        this.b = j;
    }
}
