package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.h61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5025h61 implements Serializable {
    public final Object B;
    public final Object C;
    public final Object D;

    public C5025h61(Object obj, Object obj2, Object obj3) {
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public final Object a() {
        return this.B;
    }

    public final Object b() {
        return this.C;
    }

    public final Object c() {
        return this.D;
    }

    public final Object d() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5025h61)) {
            return false;
        }
        C5025h61 c5025h61 = (C5025h61) obj;
        return G10.c(this.B, c5025h61.B) && G10.c(this.C, c5025h61.C) && G10.c(this.D, c5025h61.D);
    }

    public int hashCode() {
        Object obj = this.B;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.C;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.D;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.B + ", " + this.C + ", " + this.D + ')';
    }
}
