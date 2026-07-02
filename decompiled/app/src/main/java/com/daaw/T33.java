package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class T33 {
    public final Object a;
    public final int b;

    public T33(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof T33)) {
            return false;
        }
        T33 t33 = (T33) obj;
        return this.a == t33.a && this.b == t33.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
