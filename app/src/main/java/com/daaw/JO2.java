package com.daaw;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JO2 extends AbstractC3981dP2 implements InterfaceC3706cQ2 {
    public JO2(Map map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.AbstractC3981dP2
    public final Collection h(Collection collection) {
        return DesugarCollections.unmodifiableList(collection);
    }

    @Override // com.daaw.AbstractC3981dP2
    public final Collection i(Object obj, Collection collection) {
        return k(obj, (List) collection, null);
    }
}
