package com.daaw;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes4.dex */
public final class J30 {
    public final EnumMap a;

    public J30(EnumMap enumMap) {
        G10.g(enumMap, "defaultQualifiers");
        this.a = enumMap;
    }

    public final N20 a(S7 s7) {
        return (N20) this.a.get(s7);
    }

    public final EnumMap b() {
        return this.a;
    }
}
