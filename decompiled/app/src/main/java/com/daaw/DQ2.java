package com.daaw;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DQ2 implements Comparator {
    public static DQ2 b(Comparator comparator) {
        return comparator instanceof DQ2 ? (DQ2) comparator : new C10144zP2(comparator);
    }

    public static DQ2 c() {
        return C9590xQ2.B;
    }

    public DQ2 a() {
        return new MQ2(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
