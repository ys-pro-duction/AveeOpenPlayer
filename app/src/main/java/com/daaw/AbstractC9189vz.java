package com.daaw;

/* JADX INFO: renamed from: com.daaw.vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9189vz implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC9189vz abstractC9189vz) {
        G10.g(abstractC9189vz, "other");
        int iCompareTo = c().compareTo(abstractC9189vz.c());
        if (iCompareTo == 0 && !g() && abstractC9189vz.g()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract EnumC9468wz c();

    public abstract boolean g();
}
