package com.daaw;

import com.daaw.C10202zd1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.xB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9527xB extends AbstractC3922dB {
    public final InterfaceC2372Tr0 g;
    public final String h;
    public final AP i;

    public C9527xB(InterfaceC2372Tr0 interfaceC2372Tr0, FA0 fa0, InterfaceC2664Wm0 interfaceC2664Wm0, AbstractC1156If abstractC1156If, WA wa, C9523xA c9523xA, String str, LQ lq) {
        G10.g(interfaceC2372Tr0, "packageDescriptor");
        G10.g(fa0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(abstractC1156If, "metadataVersion");
        G10.g(c9523xA, "components");
        G10.g(str, "debugName");
        G10.g(lq, "classNames");
        NA0 na0Z = fa0.Z();
        G10.f(na0Z, "getTypeTable(...)");
        B81 b81 = new B81(na0Z);
        C10202zd1.a aVar = C10202zd1.b;
        QA0 qa0A0 = fa0.a0();
        G10.f(qa0A0, "getVersionRequirementTable(...)");
        BA baA = c9523xA.a(interfaceC2372Tr0, interfaceC2664Wm0, b81, aVar.a(qa0A0), abstractC1156If, wa);
        List listS = fa0.S();
        G10.f(listS, "getFunctionList(...)");
        List listV = fa0.V();
        G10.f(listV, "getPropertyList(...)");
        List listY = fa0.Y();
        G10.f(listY, "getTypeAliasList(...)");
        super(baA, listS, listV, listY, lq);
        this.g = interfaceC2372Tr0;
        this.h = str;
        this.i = interfaceC2372Tr0.d();
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public List f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        Collection collectionM = m(c1651Mz, nq, EnumC5496io0.N);
        Iterable iterableL = s().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(arrayList, ((InterfaceC5480il) it.next()).c(this.i));
        }
        return AbstractC2455Um.z0(collectionM, arrayList);
    }

    public void C(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        AbstractC1038Hb1.b(s().c().p(), interfaceC7689qe0, this.g, c2352Tm0);
    }

    @Override // com.daaw.AbstractC3922dB, com.daaw.AbstractC4635fj0, com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        C(c2352Tm0, interfaceC7689qe0);
        return super.g(c2352Tm0, interfaceC7689qe0);
    }

    @Override // com.daaw.AbstractC3922dB
    public void j(Collection collection, NQ nq) {
        G10.g(collection, "result");
        G10.g(nq, "nameFilter");
    }

    @Override // com.daaw.AbstractC3922dB
    public C6607ml p(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        return new C6607ml(this.i, c2352Tm0);
    }

    public String toString() {
        return this.h;
    }

    @Override // com.daaw.AbstractC3922dB
    public Set v() {
        return AbstractC9867yQ0.d();
    }

    @Override // com.daaw.AbstractC3922dB
    public Set w() {
        return AbstractC9867yQ0.d();
    }

    @Override // com.daaw.AbstractC3922dB
    public Set x() {
        return AbstractC9867yQ0.d();
    }

    @Override // com.daaw.AbstractC3922dB
    public boolean z(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        if (super.z(c2352Tm0)) {
            return true;
        }
        Iterable iterableL = s().c().l();
        if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
            return false;
        }
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            if (((InterfaceC5480il) it.next()).b(this.i, c2352Tm0)) {
                return true;
            }
        }
        return false;
    }
}
