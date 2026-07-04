package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.mA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6448mA {
    public static /* synthetic */ void a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static C8957v81 b(List list, AbstractC8392t81 abstractC8392t81, InterfaceC8612tw interfaceC8612tw, List list2) {
        if (list == null) {
            a(0);
        }
        if (abstractC8392t81 == null) {
            a(1);
        }
        if (interfaceC8612tw == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        C8957v81 c8957v81C = c(list, abstractC8392t81, interfaceC8612tw, list2, null);
        if (c8957v81C != null) {
            return c8957v81C;
        }
        throw new AssertionError("Substitution failed");
    }

    public static C8957v81 c(List list, AbstractC8392t81 abstractC8392t81, InterfaceC8612tw interfaceC8612tw, List list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (abstractC8392t81 == null) {
            a(6);
        }
        if (interfaceC8612tw == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Z71 z71 = (Z71) it.next();
            C3074a81 c3074a81Q0 = C3074a81.Q0(interfaceC8612tw, z71.getAnnotations(), z71.D(), z71.o(), z71.getName(), i, RU0.a, z71.e0());
            map.put(z71.k(), new C6998o81(c3074a81Q0.s()));
            map2.put(z71, c3074a81Q0);
            list2.add(c3074a81Q0);
            i++;
        }
        E71 e71J = E71.j(map);
        C8957v81 c8957v81H = C8957v81.h(abstractC8392t81, e71J);
        C8957v81 c8957v81H2 = C8957v81.h(abstractC8392t81.h(), e71J);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Z71 z712 = (Z71) it2.next();
            C3074a81 c3074a81 = (C3074a81) map2.get(z712);
            for (I80 i80 : z712.getUpperBounds()) {
                InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
                I80 i80P = (((interfaceC10240zlC instanceof Z71) && H81.p((Z71) interfaceC10240zlC)) ? c8957v81H : c8957v81H2).p(i80, EnumC1042Hc1.H);
                if (i80P == null) {
                    return null;
                }
                if (i80P != i80 && zArr != null) {
                    zArr[0] = true;
                }
                c3074a81.M0(i80P);
            }
            c3074a81.V0();
        }
        return c8957v81H;
    }
}
