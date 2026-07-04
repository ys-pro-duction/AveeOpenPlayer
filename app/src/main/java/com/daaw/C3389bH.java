package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.bH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3389bH extends J implements YG, Serializable {
    public final Enum[] C;

    public C3389bH(Enum[] enumArr) {
        G10.g(enumArr, "entries");
        this.C = enumArr;
    }

    public int D(Enum r2) {
        G10.g(r2, "element");
        return indexOf(r2);
    }

    @Override // com.daaw.AbstractC9193w, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return s((Enum) obj);
        }
        return false;
    }

    @Override // com.daaw.AbstractC9193w
    public int e() {
        return this.C.length;
    }

    @Override // com.daaw.J, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return y((Enum) obj);
        }
        return -1;
    }

    @Override // com.daaw.J, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return D((Enum) obj);
        }
        return -1;
    }

    public boolean s(Enum r3) {
        G10.g(r3, "element");
        return ((Enum) AbstractC5431ib.J(this.C, r3.ordinal())) == r3;
    }

    @Override // com.daaw.J, java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Enum get(int i) {
        J.B.a(i, this.C.length);
        return this.C[i];
    }

    public int y(Enum r3) {
        G10.g(r3, "element");
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC5431ib.J(this.C, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
