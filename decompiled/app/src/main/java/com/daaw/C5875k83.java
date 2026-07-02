package com.daaw;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.k83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5875k83 extends X73 {
    public static final InterfaceC8394t83 b = C5037h83.a(Collections.EMPTY_MAP);

    public /* synthetic */ C5875k83(Map map, AbstractC5316i83 abstractC5316i83) {
        super(map);
    }

    public static C5593j83 b(int i) {
        return new C5593j83(i, null);
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapB = Y73.b(a().size());
        for (Map.Entry entry : a().entrySet()) {
            linkedHashMapB.put(entry.getKey(), ((InterfaceC8394t83) entry.getValue()).zzb());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMapB);
    }
}
