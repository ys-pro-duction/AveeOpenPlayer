package com.daaw;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class Sc3 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC9646xd3 abstractC9646xd3 = (AbstractC9646xd3) obj;
        AbstractC9646xd3 abstractC9646xd32 = (AbstractC9646xd3) obj2;
        Oc3 oc3 = new Oc3(abstractC9646xd3);
        Oc3 oc32 = new Oc3(abstractC9646xd32);
        while (oc3.hasNext() && oc32.hasNext()) {
            int iCompareTo = Integer.valueOf(oc3.zza() & 255).compareTo(Integer.valueOf(oc32.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC9646xd3.s()).compareTo(Integer.valueOf(abstractC9646xd32.s()));
    }
}
