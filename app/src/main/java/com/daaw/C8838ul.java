package com.daaw;

import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8838ul {
    public static final C8838ul a = new C8838ul();

    public static final boolean c(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "it");
        return a.d(interfaceC1583Mi);
    }

    public final String b(InterfaceC1583Mi interfaceC1583Mi) {
        C2352Tm0 c2352Tm0;
        G10.g(interfaceC1583Mi, "<this>");
        AbstractC8670u80.g0(interfaceC1583Mi);
        InterfaceC1583Mi interfaceC1583MiI = AbstractC8400tA.i(AbstractC8400tA.w(interfaceC1583Mi), false, C8559tl.B, 1, null);
        if (interfaceC1583MiI == null || (c2352Tm0 = (C2352Tm0) C1683Nh.a.a().get(AbstractC8400tA.o(interfaceC1583MiI))) == null) {
            return null;
        }
        return c2352Tm0.c();
    }

    public final boolean d(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "callableMemberDescriptor");
        if (C1683Nh.a.d().contains(interfaceC1583Mi.getName())) {
            return e(interfaceC1583Mi);
        }
        return false;
    }

    public final boolean e(InterfaceC1583Mi interfaceC1583Mi) {
        if (AbstractC2455Um.W(C1683Nh.a.c(), AbstractC8400tA.k(interfaceC1583Mi)) && interfaceC1583Mi.h().isEmpty()) {
            return true;
        }
        if (!AbstractC8670u80.g0(interfaceC1583Mi)) {
            return false;
        }
        Collection collectionE = interfaceC1583Mi.e();
        G10.f(collectionE, "getOverriddenDescriptors(...)");
        Collection<InterfaceC1583Mi> collection = collectionE;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC1583Mi interfaceC1583Mi2 : collection) {
            C8838ul c8838ul = a;
            G10.d(interfaceC1583Mi2);
            if (c8838ul.d(interfaceC1583Mi2)) {
                return true;
            }
        }
        return false;
    }
}
