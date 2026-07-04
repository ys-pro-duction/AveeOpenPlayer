package com.daaw;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.fj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4635fj0 implements InterfaceC4346ej0 {
    @Override // com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set b() {
        Collection collectionF = f(C1651Mz.v, HR.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof IS0) {
                C2352Tm0 name = ((IS0) obj).getName();
                G10.f(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set d() {
        Collection collectionF = f(C1651Mz.w, HR.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof IS0) {
                C2352Tm0 name = ((IS0) obj).getName();
                G10.f(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set e() {
        return null;
    }

    @Override // com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return null;
    }
}
