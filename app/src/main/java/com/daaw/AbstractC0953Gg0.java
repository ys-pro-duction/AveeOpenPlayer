package com.daaw;

import com.daaw.E71;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Gg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0953Gg0 {
    public static final E71 a(InterfaceC4923gl interfaceC4923gl, InterfaceC4923gl interfaceC4923gl2) {
        G10.g(interfaceC4923gl, "from");
        G10.g(interfaceC4923gl2, "to");
        interfaceC4923gl.v().size();
        interfaceC4923gl2.v().size();
        E71.a aVar = E71.c;
        List listV = interfaceC4923gl.v();
        G10.f(listV, "getDeclaredTypeParameters(...)");
        List list = listV;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Z71) it.next()).k());
        }
        List listV2 = interfaceC4923gl2.v();
        G10.f(listV2, "getDeclaredTypeParameters(...)");
        List list2 = listV2;
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            YS0 ys0S = ((Z71) it2.next()).s();
            G10.f(ys0S, "getDefaultType(...)");
            arrayList2.add(H81.d(ys0S));
        }
        return E71.a.e(aVar, AbstractC1473Lg0.t(AbstractC2455Um.T0(arrayList, arrayList2)), false, 2, null);
    }
}
