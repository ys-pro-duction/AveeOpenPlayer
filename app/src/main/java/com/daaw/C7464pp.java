package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7464pp implements InterfaceC3072a8 {
    public final List B;

    public C7464pp(List list) {
        G10.g(list, "delegates");
        this.B = list;
    }

    public static final O7 p(AP ap, InterfaceC3072a8 interfaceC3072a8) {
        G10.g(ap, "$fqName");
        G10.g(interfaceC3072a8, "it");
        return interfaceC3072a8.i(ap);
    }

    public static final KP0 s(InterfaceC3072a8 interfaceC3072a8) {
        G10.g(interfaceC3072a8, "it");
        return AbstractC2455Um.V(interfaceC3072a8);
    }

    @Override // com.daaw.InterfaceC3072a8
    public O7 i(AP ap) {
        G10.g(ap, "fqName");
        return (O7) UP0.q(UP0.u(AbstractC2455Um.V(this.B), new C6906np(ap)));
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean isEmpty() {
        List list = this.B;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC3072a8) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return UP0.r(AbstractC2455Um.V(this.B), C7185op.B).iterator();
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean z(AP ap) {
        G10.g(ap, "fqName");
        Iterator it = AbstractC2455Um.V(this.B).iterator();
        while (it.hasNext()) {
            if (((InterfaceC3072a8) it.next()).z(ap)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7464pp(InterfaceC3072a8... interfaceC3072a8Arr) {
        this(AbstractC5431ib.h0(interfaceC3072a8Arr));
        G10.g(interfaceC3072a8Arr, "delegates");
    }
}
