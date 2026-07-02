package com.daaw;

/* JADX INFO: renamed from: com.daaw.qZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7664qZ implements Comparable {
    public static AbstractC7664qZ c(int i, TC tc, byte[] bArr, byte[] bArr2) {
        return new C2727Xc(i, tc, bArr, bArr2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC7664qZ abstractC7664qZ) {
        int iCompare = Integer.compare(l(), abstractC7664qZ.l());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = k().compareTo(abstractC7664qZ.k());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = AbstractC6838nb1.i(g(), abstractC7664qZ.g());
        return i != 0 ? i : AbstractC6838nb1.i(h(), abstractC7664qZ.h());
    }

    public abstract byte[] g();

    public abstract byte[] h();

    public abstract TC k();

    public abstract int l();
}
