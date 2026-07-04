package com.daaw;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Gf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0950Gf1 {
    public static final InterfaceC1583Mi a(Collection collection) {
        Integer numD;
        G10.g(collection, "descriptors");
        collection.isEmpty();
        Iterator it = collection.iterator();
        InterfaceC1583Mi interfaceC1583Mi = null;
        while (it.hasNext()) {
            InterfaceC1583Mi interfaceC1583Mi2 = (InterfaceC1583Mi) it.next();
            if (interfaceC1583Mi == null || ((numD = AbstractC8679uA.d(interfaceC1583Mi.getVisibility(), interfaceC1583Mi2.getVisibility())) != null && numD.intValue() < 0)) {
                interfaceC1583Mi = interfaceC1583Mi2;
            }
        }
        G10.d(interfaceC1583Mi);
        return interfaceC1583Mi;
    }
}
