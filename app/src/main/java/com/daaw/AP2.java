package com.daaw;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class AP2 extends DP2 {
    public AP2() {
        super(null);
    }

    public static final DP2 j(int i) {
        return i < 0 ? DP2.b : i > 0 ? DP2.c : DP2.a;
    }

    @Override // com.daaw.DP2
    public final int a() {
        return 0;
    }

    @Override // com.daaw.DP2
    public final DP2 b(int i, int i2) {
        return j(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.daaw.DP2
    public final DP2 c(Object obj, Object obj2, Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.daaw.DP2
    public final DP2 d(boolean z, boolean z2) {
        return j(AbstractC3432bR2.a(z, z2));
    }

    @Override // com.daaw.DP2
    public final DP2 e(boolean z, boolean z2) {
        return j(AbstractC3432bR2.a(false, false));
    }
}
