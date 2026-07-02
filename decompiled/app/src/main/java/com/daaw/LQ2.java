package com.daaw;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class LQ2 extends DQ2 implements Serializable {
    public static final LQ2 B = new LQ2();

    @Override // com.daaw.DQ2
    public final DQ2 a() {
        return C9590xQ2.B;
    }

    @Override // com.daaw.DQ2, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
