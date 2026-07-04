package com.daaw;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.oQ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7073oQ2 extends AbstractC8188sQ2 {
    public final /* synthetic */ Comparator a;

    public C7073oQ2(Comparator comparator) {
        this.a = comparator;
    }

    @Override // com.daaw.AbstractC8188sQ2
    public final Map a() {
        return new TreeMap(this.a);
    }
}
