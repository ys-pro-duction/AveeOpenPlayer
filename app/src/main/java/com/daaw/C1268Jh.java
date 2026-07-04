package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1268Jh extends AbstractC6533mV0 {
    public static final C1268Jh o = new C1268Jh();

    public static final boolean l(IS0 is0, InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(is0, "$functionDescriptor");
        G10.g(interfaceC1583Mi, "it");
        return AbstractC6533mV0.a.j().containsKey(AbstractC7440pk0.d(is0));
    }

    public final C2352Tm0 j(IS0 is0) {
        G10.g(is0, "functionDescriptor");
        Map mapJ = AbstractC6533mV0.a.j();
        String strD = AbstractC7440pk0.d(is0);
        if (strD == null) {
            return null;
        }
        return (C2352Tm0) mapJ.get(strD);
    }

    public final boolean k(IS0 is0) {
        G10.g(is0, "functionDescriptor");
        return AbstractC8670u80.g0(is0) && AbstractC8400tA.i(is0, false, new C1164Ih(is0), 1, null) != null;
    }

    public final boolean m(IS0 is0) {
        G10.g(is0, "<this>");
        return G10.c(is0.getName().c(), "removeAt") && G10.c(AbstractC7440pk0.d(is0), AbstractC6533mV0.a.h().d());
    }
}
