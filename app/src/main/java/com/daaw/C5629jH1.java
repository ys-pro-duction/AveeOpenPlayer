package com.daaw;

import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.jH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5629jH1 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        BM1 bm1 = (BM1) obj;
        BM1 bm12 = (BM1) obj2;
        FG1 fg1 = new FG1(bm1);
        FG1 fg12 = new FG1(bm12);
        while (fg1.hasNext() && fg12.hasNext()) {
            int iCompareTo = Integer.valueOf(fg1.zza() & 255).compareTo(Integer.valueOf(fg12.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(bm1.s()).compareTo(Integer.valueOf(bm12.s()));
    }
}
