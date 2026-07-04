package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8237sc1 {
    public static final AbstractC7958rc1 a(C9245wA0 c9245wA0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, NQ nq, NQ nq2) {
        InterfaceC3159aT0 interfaceC3159aT0;
        List listV0;
        G10.g(c9245wA0, "<this>");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        G10.g(nq, "typeDeserializer");
        G10.g(nq2, "typeOfPublicProperty");
        if (c9245wA0.P0() <= 0) {
            if (!c9245wA0.r1()) {
                return null;
            }
            C2352Tm0 c2352Tm0B = AbstractC3252an0.b(interfaceC2664Wm0, c9245wA0.M0());
            KA0 ka0I = AbstractC3366bB0.i(c9245wA0, b81);
            if ((ka0I != null && (interfaceC3159aT0 = (InterfaceC3159aT0) nq.invoke(ka0I)) != null) || (interfaceC3159aT0 = (InterfaceC3159aT0) nq2.invoke(c2352Tm0B)) != null) {
                return new IZ(c2352Tm0B, interfaceC3159aT0);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + AbstractC3252an0.b(interfaceC2664Wm0, c9245wA0.I0()) + " with property " + c2352Tm0B).toString());
        }
        List listQ0 = c9245wA0.Q0();
        G10.f(listQ0, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = listQ0;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        for (Integer num : list) {
            G10.d(num);
            arrayList.add(AbstractC3252an0.b(interfaceC2664Wm0, num.intValue()));
        }
        C0576Cs0 c0576Cs0A = D61.a(Integer.valueOf(c9245wA0.T0()), Integer.valueOf(c9245wA0.S0()));
        if (G10.c(c0576Cs0A, D61.a(Integer.valueOf(arrayList.size()), 0))) {
            List listU0 = c9245wA0.U0();
            G10.f(listU0, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = listU0;
            listV0 = new ArrayList(AbstractC1703Nm.v(list2, 10));
            for (Integer num2 : list2) {
                G10.d(num2);
                listV0.add(b81.a(num2.intValue()));
            }
        } else {
            if (!G10.c(c0576Cs0A, D61.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + AbstractC3252an0.b(interfaceC2664Wm0, c9245wA0.I0()) + " has illegal multi-field value class representation").toString());
            }
            listV0 = c9245wA0.V0();
        }
        G10.d(listV0);
        List list3 = listV0;
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(nq.invoke(it.next()));
        }
        return new C2034Ql0(AbstractC2455Um.T0(arrayList, arrayList2));
    }
}
