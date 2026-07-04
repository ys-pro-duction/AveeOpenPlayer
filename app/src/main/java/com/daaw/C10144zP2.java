package com.daaw;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.zP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10144zP2 extends DQ2 implements Serializable {
    public final Comparator B;

    public C10144zP2(Comparator comparator) {
        this.B = comparator;
    }

    @Override // com.daaw.DQ2, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.B.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10144zP2) {
            return this.B.equals(((C10144zP2) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    public final String toString() {
        return this.B.toString();
    }
}
