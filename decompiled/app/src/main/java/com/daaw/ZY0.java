package com.daaw;

import com.daaw.AbstractC1547Lz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class ZY0 extends AbstractC4635fj0 {
    public final InterfaceC2968Zk0 b;
    public final AP c;

    public ZY0(InterfaceC2968Zk0 interfaceC2968Zk0, AP ap) {
        G10.g(interfaceC2968Zk0, "moduleDescriptor");
        G10.g(ap, "fqName");
        this.b = interfaceC2968Zk0;
        this.c = ap;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Set e() {
        return AbstractC9867yQ0.d();
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        if (!c1651Mz.a(C1651Mz.c.f())) {
            return AbstractC1599Mm.k();
        }
        if (this.c.d() && c1651Mz.l().contains(AbstractC1547Lz.b.a)) {
            return AbstractC1599Mm.k();
        }
        Collection collectionU = this.b.u(this.c, nq);
        ArrayList arrayList = new ArrayList(collectionU.size());
        Iterator it = collectionU.iterator();
        while (it.hasNext()) {
            C2352Tm0 c2352Tm0G = ((AP) it.next()).g();
            G10.f(c2352Tm0G, "shortName(...)");
            if (((Boolean) nq.invoke(c2352Tm0G)).booleanValue()) {
                AbstractC1392Km.a(arrayList, h(c2352Tm0G));
            }
        }
        return arrayList;
    }

    public final InterfaceC5516is0 h(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        if (c2352Tm0.m()) {
            return null;
        }
        InterfaceC2968Zk0 interfaceC2968Zk0 = this.b;
        AP apC = this.c.c(c2352Tm0);
        G10.f(apC, "child(...)");
        InterfaceC5516is0 interfaceC5516is0R0 = interfaceC2968Zk0.r0(apC);
        if (interfaceC5516is0R0.isEmpty()) {
            return null;
        }
        return interfaceC5516is0R0;
    }

    public String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
