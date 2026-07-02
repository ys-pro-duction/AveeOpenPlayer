package com.daaw;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MQ2 extends DQ2 implements Serializable {
    public final DQ2 B;

    public MQ2(DQ2 dq2) {
        this.B = dq2;
    }

    @Override // com.daaw.DQ2
    public final DQ2 a() {
        return this.B;
    }

    @Override // com.daaw.DQ2, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.B.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MQ2) {
            return this.B.equals(((MQ2) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return -this.B.hashCode();
    }

    public final String toString() {
        return this.B.toString().concat(".reverse()");
    }
}
