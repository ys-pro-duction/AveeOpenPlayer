package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.Cs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0576Cs0 implements Serializable {
    public final Object B;
    public final Object C;

    public C0576Cs0(Object obj, Object obj2) {
        this.B = obj;
        this.C = obj2;
    }

    public final Object a() {
        return this.B;
    }

    public final Object b() {
        return this.C;
    }

    public final Object c() {
        return this.B;
    }

    public final Object d() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0576Cs0)) {
            return false;
        }
        C0576Cs0 c0576Cs0 = (C0576Cs0) obj;
        return G10.c(this.B, c0576Cs0.B) && G10.c(this.C, c0576Cs0.C);
    }

    public int hashCode() {
        Object obj = this.B;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.C;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.B + ", " + this.C + ')';
    }
}
