package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ub1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8790ub1 {
    public static final List a(Collection collection, Collection collection2, InterfaceC1376Ki interfaceC1376Ki) {
        G10.g(collection, "newValueParameterTypes");
        G10.g(collection2, "oldValueParameters");
        InterfaceC1376Ki interfaceC1376Ki2 = interfaceC1376Ki;
        G10.g(interfaceC1376Ki2, "newOwner");
        collection.size();
        collection2.size();
        List<C0576Cs0> listT0 = AbstractC2455Um.T0(collection, collection2);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listT0, 10));
        for (C0576Cs0 c0576Cs0 : listT0) {
            I80 i80 = (I80) c0576Cs0.a();
            InterfaceC9918yc1 interfaceC9918yc1 = (InterfaceC9918yc1) c0576Cs0.b();
            int index = interfaceC9918yc1.getIndex();
            InterfaceC3072a8 annotations = interfaceC9918yc1.getAnnotations();
            C2352Tm0 name = interfaceC9918yc1.getName();
            G10.f(name, "getName(...)");
            boolean zS0 = interfaceC9918yc1.s0();
            boolean Z = interfaceC9918yc1.Z();
            boolean zV = interfaceC9918yc1.V();
            I80 i80K = interfaceC9918yc1.g0() != null ? AbstractC8400tA.s(interfaceC1376Ki2).p().k(i80) : null;
            RU0 ru0J = interfaceC9918yc1.j();
            G10.f(ru0J, "getSource(...)");
            arrayList.add(new C10197zc1(interfaceC1376Ki2, null, index, annotations, name, i80, zS0, Z, zV, i80K, ru0J));
            interfaceC1376Ki2 = interfaceC1376Ki;
        }
        return arrayList;
    }

    public static final C2512Va0 b(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "<this>");
        InterfaceC4923gl interfaceC4923glX = AbstractC8400tA.x(interfaceC4923gl);
        if (interfaceC4923glX == null) {
            return null;
        }
        InterfaceC4346ej0 interfaceC4346ej0O = interfaceC4923glX.O();
        C2512Va0 c2512Va0 = interfaceC4346ej0O instanceof C2512Va0 ? (C2512Va0) interfaceC4346ej0O : null;
        return c2512Va0 == null ? b(interfaceC4923glX) : c2512Va0;
    }
}
