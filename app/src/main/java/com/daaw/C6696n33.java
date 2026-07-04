package com.daaw;

import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.n33, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6696n33 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC9213w33 abstractC9213w33 = (AbstractC9213w33) obj;
        AbstractC9213w33 abstractC9213w332 = (AbstractC9213w33) obj2;
        InterfaceC7533q33 it = abstractC9213w33.iterator();
        InterfaceC7533q33 it2 = abstractC9213w332.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC9213w33.y()).compareTo(Integer.valueOf(abstractC9213w332.y()));
    }
}
