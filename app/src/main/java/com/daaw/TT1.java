package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class TT1 {
    public final Object a;
    public final int b;

    public TT1(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TT1)) {
            return false;
        }
        TT1 tt1 = (TT1) obj;
        return this.a == tt1.a && this.b == tt1.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
