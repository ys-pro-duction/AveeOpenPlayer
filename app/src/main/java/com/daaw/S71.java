package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class S71 extends AbstractC5831k0 {
    public static final a d = new a(null);
    public final String b;
    public final InterfaceC4346ej0 c;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final InterfaceC4346ej0 a(String str, Collection collection) {
            G10.g(str, "message");
            G10.g(collection, "types");
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((I80) it.next()).q());
            }
            UT0 ut0B = RN0.b(arrayList);
            InterfaceC4346ej0 interfaceC4346ej0B = C2859Yj.d.b(str, ut0B);
            return ut0B.size() <= 1 ? interfaceC4346ej0B : new S71(str, interfaceC4346ej0B, null);
        }

        public a() {
        }
    }

    public /* synthetic */ S71(String str, InterfaceC4346ej0 interfaceC4346ej0, AbstractC2911Yw abstractC2911Yw) {
        this(str, interfaceC4346ej0);
    }

    public static final InterfaceC4346ej0 m(String str, Collection collection) {
        return d.a(str, collection);
    }

    public static final InterfaceC1376Ki n(InterfaceC1376Ki interfaceC1376Ki) {
        G10.g(interfaceC1376Ki, "$this$selectMostSpecificInEachOverridableGroup");
        return interfaceC1376Ki;
    }

    public static final InterfaceC1376Ki o(IS0 is0) {
        G10.g(is0, "$this$selectMostSpecificInEachOverridableGroup");
        return is0;
    }

    public static final InterfaceC1376Ki p(InterfaceC4476fA0 interfaceC4476fA0) {
        G10.g(interfaceC4476fA0, "$this$selectMostSpecificInEachOverridableGroup");
        return interfaceC4476fA0;
    }

    @Override // com.daaw.AbstractC5831k0, com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return AbstractC1101Hr0.b(super.a(c2352Tm0, interfaceC7689qe0), Q71.B);
    }

    @Override // com.daaw.AbstractC5831k0, com.daaw.InterfaceC4346ej0
    public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return AbstractC1101Hr0.b(super.c(c2352Tm0, interfaceC7689qe0), P71.B);
    }

    @Override // com.daaw.AbstractC5831k0, com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        Collection collectionF = super.f(c1651Mz, nq);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionF) {
            if (((InterfaceC8612tw) obj) instanceof InterfaceC1376Ki) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        C0576Cs0 c0576Cs0 = new C0576Cs0(arrayList, arrayList2);
        List list = (List) c0576Cs0.a();
        List list2 = (List) c0576Cs0.b();
        G10.e(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return AbstractC2455Um.z0(AbstractC1101Hr0.b(list, R71.B), list2);
    }

    @Override // com.daaw.AbstractC5831k0
    public InterfaceC4346ej0 i() {
        return this.c;
    }

    public S71(String str, InterfaceC4346ej0 interfaceC4346ej0) {
        this.b = str;
        this.c = interfaceC4346ej0;
    }
}
