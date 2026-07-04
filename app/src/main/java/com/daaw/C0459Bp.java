package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0459Bp implements InterfaceC3277as0 {
    public final List a;
    public final String b;

    public C0459Bp(List list, String str) {
        G10.g(list, "providers");
        G10.g(str, "debugName");
        this.a = list;
        this.b = str;
        list.size();
        AbstractC2455Um.Q0(list).size();
    }

    @Override // com.daaw.InterfaceC3277as0
    public boolean a(AP ap) {
        G10.g(ap, "fqName");
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC2996Zr0.b((InterfaceC2580Vr0) it.next(), ap)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.InterfaceC3277as0
    public void b(AP ap, Collection collection) {
        G10.g(ap, "fqName");
        G10.g(collection, "packageFragments");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            AbstractC2996Zr0.a((InterfaceC2580Vr0) it.next(), ap, collection);
        }
    }

    @Override // com.daaw.InterfaceC2580Vr0
    public List c(AP ap) {
        G10.g(ap, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            AbstractC2996Zr0.a((InterfaceC2580Vr0) it.next(), ap, arrayList);
        }
        return AbstractC2455Um.M0(arrayList);
    }

    public String toString() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2580Vr0
    public Collection u(AP ap, NQ nq) {
        G10.g(ap, "fqName");
        G10.g(nq, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC2580Vr0) it.next()).u(ap, nq));
        }
        return hashSet;
    }
}
