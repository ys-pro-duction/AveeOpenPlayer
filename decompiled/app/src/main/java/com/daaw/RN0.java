package com.daaw;

import com.daaw.InterfaceC4346ej0;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RN0 {
    public static final Collection a(Collection collection, Collection collection2) {
        G10.g(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final UT0 b(Iterable iterable) {
        G10.g(iterable, "scopes");
        UT0 ut0 = new UT0();
        for (Object obj : iterable) {
            InterfaceC4346ej0 interfaceC4346ej0 = (InterfaceC4346ej0) obj;
            if (interfaceC4346ej0 != null && interfaceC4346ej0 != InterfaceC4346ej0.b.b) {
                ut0.add(obj);
            }
        }
        return ut0;
    }
}
