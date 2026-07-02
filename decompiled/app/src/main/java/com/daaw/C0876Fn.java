package com.daaw;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.Fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0876Fn extends AbstractC5511ir0 implements Serializable {
    public final Comparator B;

    public C0876Fn(Comparator comparator) {
        this.B = (Comparator) AbstractC7785qy0.n(comparator);
    }

    @Override // com.daaw.AbstractC5511ir0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.B.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0876Fn) {
            return this.B.equals(((C0876Fn) obj).B);
        }
        return false;
    }

    public int hashCode() {
        return this.B.hashCode();
    }

    public String toString() {
        return this.B.toString();
    }
}
