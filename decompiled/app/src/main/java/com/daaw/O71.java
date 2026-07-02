package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class O71 {
    public static final I30 a(I30 i30, Collection collection, boolean z, boolean z2, boolean z3) {
        EnumC3262ap0 enumC3262ap0D;
        boolean z4;
        G10.g(i30, "<this>");
        G10.g(collection, "superQualifiers");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            EnumC3262ap0 enumC3262ap0B = b((I30) it.next());
            if (enumC3262ap0B != null) {
                arrayList.add(enumC3262ap0B);
            }
        }
        EnumC3262ap0 enumC3262ap0D2 = d(AbstractC2455Um.Q0(arrayList), b(i30), z);
        if (enumC3262ap0D2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                EnumC3262ap0 enumC3262ap0D3 = ((I30) it2.next()).d();
                if (enumC3262ap0D3 != null) {
                    arrayList2.add(enumC3262ap0D3);
                }
            }
            enumC3262ap0D = d(AbstractC2455Um.Q0(arrayList2), i30.d(), z);
        } else {
            enumC3262ap0D = enumC3262ap0D2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = collection2.iterator();
        while (it3.hasNext()) {
            EnumC3247am0 enumC3247am0C = ((I30) it3.next()).c();
            if (enumC3247am0C != null) {
                arrayList3.add(enumC3247am0C);
            }
        }
        EnumC3247am0 enumC3247am0 = (EnumC3247am0) e(AbstractC2455Um.Q0(arrayList3), EnumC3247am0.C, EnumC3247am0.B, i30.c(), z);
        EnumC3262ap0 enumC3262ap0 = null;
        if (enumC3262ap0D != null && !z3 && (!z2 || enumC3262ap0D != EnumC3262ap0.C)) {
            enumC3262ap0 = enumC3262ap0D;
        }
        boolean z5 = false;
        if (enumC3262ap0 == EnumC3262ap0.D) {
            if (!i30.b()) {
                if (!collection2.isEmpty()) {
                    Iterator it4 = collection2.iterator();
                    while (it4.hasNext()) {
                        if (((I30) it4.next()).b()) {
                        }
                    }
                }
                z4 = false;
            }
            z4 = true;
            break;
        }
        z4 = false;
        if (enumC3262ap0 != null && enumC3262ap0D2 != enumC3262ap0D) {
            z5 = true;
        }
        return new I30(enumC3262ap0, enumC3247am0, z4, z5);
    }

    public static final EnumC3262ap0 b(I30 i30) {
        if (i30.e()) {
            return null;
        }
        return i30.d();
    }

    public static final boolean c(InterfaceC9236w81 interfaceC9236w81, O80 o80) {
        G10.g(interfaceC9236w81, "<this>");
        G10.g(o80, "type");
        AP ap = B40.v;
        G10.f(ap, "ENHANCED_NULLABILITY_ANNOTATION");
        return interfaceC9236w81.o(o80, ap);
    }

    public static final EnumC3262ap0 d(Set set, EnumC3262ap0 enumC3262ap0, boolean z) {
        EnumC3262ap0 enumC3262ap02 = EnumC3262ap0.B;
        return enumC3262ap0 == enumC3262ap02 ? enumC3262ap02 : (EnumC3262ap0) e(set, EnumC3262ap0.D, EnumC3262ap0.C, enumC3262ap0, z);
    }

    public static final Object e(Set set, Object obj, Object obj2, Object obj3, boolean z) {
        Set setQ0;
        if (!z) {
            if (obj3 != null && (setQ0 = AbstractC2455Um.Q0(AbstractC10146zQ0.k(set, obj3))) != null) {
                set = setQ0;
            }
            return AbstractC2455Um.D0(set);
        }
        Object obj4 = set.contains(obj) ? obj : set.contains(obj2) ? obj2 : null;
        if (G10.c(obj4, obj) && G10.c(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }
}
