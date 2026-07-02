package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Yr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2892Yr0 implements InterfaceC3277as0 {
    public final Collection a;

    public C2892Yr0(Collection collection) {
        G10.g(collection, "packageFragments");
        this.a = collection;
    }

    public static final AP f(InterfaceC2372Tr0 interfaceC2372Tr0) {
        G10.g(interfaceC2372Tr0, "it");
        return interfaceC2372Tr0.d();
    }

    public static final boolean g(AP ap, AP ap2) {
        G10.g(ap, "$fqName");
        G10.g(ap2, "it");
        return !ap2.d() && G10.c(ap2.e(), ap);
    }

    @Override // com.daaw.InterfaceC3277as0
    public boolean a(AP ap) {
        G10.g(ap, "fqName");
        Collection collection = this.a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (G10.c(((InterfaceC2372Tr0) it.next()).d(), ap)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.InterfaceC3277as0
    public void b(AP ap, Collection collection) {
        G10.g(ap, "fqName");
        G10.g(collection, "packageFragments");
        for (Object obj : this.a) {
            if (G10.c(((InterfaceC2372Tr0) obj).d(), ap)) {
                collection.add(obj);
            }
        }
    }

    @Override // com.daaw.InterfaceC2580Vr0
    public List c(AP ap) {
        G10.g(ap, "fqName");
        Collection collection = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (G10.c(((InterfaceC2372Tr0) obj).d(), ap)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC2580Vr0
    public Collection u(AP ap, NQ nq) {
        G10.g(ap, "fqName");
        G10.g(nq, "nameFilter");
        return UP0.A(UP0.n(UP0.t(AbstractC2455Um.V(this.a), C2684Wr0.B), new C2788Xr0(ap)));
    }
}
