package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class MZ extends AbstractC4635fj0 {
    public final InterfaceC4346ej0 b;

    public MZ(InterfaceC4346ej0 interfaceC4346ej0) {
        G10.g(interfaceC4346ej0, "workerScope");
        this.b = interfaceC4346ej0;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Set b() {
        return this.b.b();
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Set d() {
        return this.b.d();
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Set e() {
        return this.b.e();
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        InterfaceC10240zl interfaceC10240zlG = this.b.g(c2352Tm0, interfaceC7689qe0);
        if (interfaceC10240zlG != null) {
            InterfaceC4923gl interfaceC4923gl = interfaceC10240zlG instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlG : null;
            if (interfaceC4923gl != null) {
                return interfaceC4923gl;
            }
            if (interfaceC10240zlG instanceof InterfaceC5586j71) {
                return (InterfaceC5586j71) interfaceC10240zlG;
            }
        }
        return null;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        C1651Mz c1651MzN = c1651Mz.n(C1651Mz.c.c());
        if (c1651MzN == null) {
            return AbstractC1599Mm.k();
        }
        Collection collectionF = this.b.f(c1651MzN, nq);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionF) {
            if (obj instanceof InterfaceC0339Al) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.b;
    }
}
