package com.daaw;

import com.daaw.P80;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Sn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2252Sn0 {
    public static final List a(AbstractC5708ja1 abstractC5708ja1, EnumC9951yj enumC9951yj) {
        if (abstractC5708ja1.L0().size() != abstractC5708ja1.N0().getParameters().size()) {
            return null;
        }
        List listL0 = abstractC5708ja1.L0();
        List list = listL0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC6440m81) it.next()).b() != EnumC1042Hc1.F) {
                    List parameters = abstractC5708ja1.N0().getParameters();
                    G10.f(parameters, "getParameters(...)");
                    List<C0576Cs0> listT0 = AbstractC2455Um.T0(list, parameters);
                    ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listT0, 10));
                    for (C0576Cs0 c0576Cs0 : listT0) {
                        InterfaceC6440m81 interfaceC6440m81D = (InterfaceC6440m81) c0576Cs0.a();
                        Z71 z71 = (Z71) c0576Cs0.b();
                        if (interfaceC6440m81D.b() != EnumC1042Hc1.F) {
                            AbstractC5708ja1 abstractC5708ja1Q0 = (interfaceC6440m81D.c() || interfaceC6440m81D.b() != EnumC1042Hc1.G) ? null : interfaceC6440m81D.getType().Q0();
                            G10.d(z71);
                            interfaceC6440m81D = H81.d(new C1604Mn0(enumC9951yj, abstractC5708ja1Q0, interfaceC6440m81D, z71));
                        }
                        arrayList.add(interfaceC6440m81D);
                    }
                    C8957v81 c8957v81C = E71.c.b(abstractC5708ja1.N0(), arrayList).c();
                    int size = listL0.size();
                    for (int i = 0; i < size; i++) {
                        InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) listL0.get(i);
                        InterfaceC6440m81 interfaceC6440m812 = (InterfaceC6440m81) arrayList.get(i);
                        if (interfaceC6440m81.b() != EnumC1042Hc1.F) {
                            List upperBounds = ((Z71) abstractC5708ja1.N0().getParameters().get(i)).getUpperBounds();
                            G10.f(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(P80.a.a.a(c8957v81C.n((I80) it2.next(), EnumC1042Hc1.F).Q0()));
                            }
                            if (!interfaceC6440m81.c() && interfaceC6440m81.b() == EnumC1042Hc1.H) {
                                arrayList2.add(P80.a.a.a(interfaceC6440m81.getType().Q0()));
                            }
                            I80 type = interfaceC6440m812.getType();
                            G10.e(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((C1604Mn0) type).N0().n(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final YS0 b(YS0 ys0, EnumC9951yj enumC9951yj) {
        G10.g(ys0, "type");
        G10.g(enumC9951yj, "status");
        List listA = a(ys0, enumC9951yj);
        if (listA != null) {
            return c(ys0, listA);
        }
        return null;
    }

    public static final YS0 c(AbstractC5708ja1 abstractC5708ja1, List list) {
        return M80.k(abstractC5708ja1.M0(), abstractC5708ja1.N0(), list, abstractC5708ja1.O0(), null, 16, null);
    }
}
