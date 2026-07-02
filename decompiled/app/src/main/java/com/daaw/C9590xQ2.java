package com.daaw;

import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.xQ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9590xQ2 extends DQ2 implements Serializable {
    public static final C9590xQ2 B = new C9590xQ2();

    @Override // com.daaw.DQ2
    public final DQ2 a() {
        return LQ2.B;
    }

    @Override // com.daaw.DQ2, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
