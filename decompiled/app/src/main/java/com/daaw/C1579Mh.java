package com.daaw;

import com.daaw.AbstractC6533mV0;

/* JADX INFO: renamed from: com.daaw.Mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1579Mh extends AbstractC6533mV0 {
    public static final C1579Mh o = new C1579Mh();

    public static final InterfaceC8468tR l(InterfaceC8468tR interfaceC8468tR) {
        G10.g(interfaceC8468tR, "functionDescriptor");
        C1579Mh c1579Mh = o;
        C2352Tm0 name = interfaceC8468tR.getName();
        G10.f(name, "getName(...)");
        if (c1579Mh.n(name)) {
            return (InterfaceC8468tR) AbstractC8400tA.i(interfaceC8468tR, false, C1372Kh.B, 1, null);
        }
        return null;
    }

    public static final boolean m(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "it");
        return o.k(interfaceC1583Mi);
    }

    public static final AbstractC6533mV0.b o(InterfaceC1583Mi interfaceC1583Mi) {
        InterfaceC1583Mi interfaceC1583MiI;
        String strD;
        G10.g(interfaceC1583Mi, "<this>");
        AbstractC6533mV0.a aVar = AbstractC6533mV0.a;
        if (!aVar.d().contains(interfaceC1583Mi.getName()) || (interfaceC1583MiI = AbstractC8400tA.i(interfaceC1583Mi, false, C1476Lh.B, 1, null)) == null || (strD = AbstractC7440pk0.d(interfaceC1583MiI)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    public static final boolean p(InterfaceC1583Mi interfaceC1583Mi) {
        G10.g(interfaceC1583Mi, "it");
        return (interfaceC1583Mi instanceof InterfaceC8468tR) && o.k(interfaceC1583Mi);
    }

    public final boolean k(InterfaceC1583Mi interfaceC1583Mi) {
        return AbstractC2455Um.W(AbstractC6533mV0.a.e(), AbstractC7440pk0.d(interfaceC1583Mi));
    }

    public final boolean n(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "<this>");
        return AbstractC6533mV0.a.d().contains(c2352Tm0);
    }
}
