package com.daaw;

import com.daaw.FI0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VS extends AbstractC4635fj0 {
    public static final /* synthetic */ W60[] d = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(VS.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    public final InterfaceC4923gl b;
    public final InterfaceC0881Fo0 c;

    public static final class a extends AbstractC9419wo0 {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ VS b;

        public a(ArrayList arrayList, VS vs) {
            this.a = arrayList;
            this.b = vs;
        }

        @Override // com.daaw.AbstractC0685Dr0
        public void a(InterfaceC1583Mi interfaceC1583Mi) {
            G10.g(interfaceC1583Mi, "fakeOverride");
            C0789Er0.K(interfaceC1583Mi, null);
            this.a.add(interfaceC1583Mi);
        }

        @Override // com.daaw.AbstractC9419wo0
        public void e(InterfaceC1583Mi interfaceC1583Mi, InterfaceC1583Mi interfaceC1583Mi2) {
            G10.g(interfaceC1583Mi, "fromSuper");
            G10.g(interfaceC1583Mi2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.b.m() + ": " + interfaceC1583Mi + " vs " + interfaceC1583Mi2).toString());
        }
    }

    public VS(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC4923gl, "containingClass");
        this.b = interfaceC4923gl;
        this.c = interfaceC10174zX0.h(new US(this));
    }

    public static final List i(VS vs) {
        G10.g(vs, "this$0");
        List listJ = vs.j();
        return AbstractC2455Um.z0(listJ, vs.k(listJ));
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Collection a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        List listK;
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        List listL = l();
        if (listL.isEmpty()) {
            listK = AbstractC1599Mm.k();
        } else {
            UT0 ut0 = new UT0();
            for (Object obj : listL) {
                if ((obj instanceof InterfaceC4476fA0) && G10.c(((InterfaceC4476fA0) obj).getName(), c2352Tm0)) {
                    ut0.add(obj);
                }
            }
            listK = ut0;
        }
        return listK;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.InterfaceC4346ej0
    public Collection c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        List listK;
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        List listL = l();
        if (listL.isEmpty()) {
            listK = AbstractC1599Mm.k();
        } else {
            UT0 ut0 = new UT0();
            for (Object obj : listL) {
                if ((obj instanceof IS0) && G10.c(((IS0) obj).getName(), c2352Tm0)) {
                    ut0.add(obj);
                }
            }
            listK = ut0;
        }
        return listK;
    }

    @Override // com.daaw.AbstractC4635fj0, com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        return !c1651Mz.a(C1651Mz.p.m()) ? AbstractC1599Mm.k() : l();
    }

    public abstract List j();

    public final List k(List list) {
        Collection collectionK;
        ArrayList arrayList = new ArrayList(3);
        Collection collectionB = this.b.k().b();
        G10.f(collectionB, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(arrayList2, FI0.a.a(((I80) it.next()).q(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC1583Mi) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            C2352Tm0 name = ((InterfaceC1583Mi) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            G10.f(key, "component1(...)");
            C2352Tm0 c2352Tm0 = (C2352Tm0) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC1583Mi) obj3) instanceof InterfaceC8468tR);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                C0789Er0 c0789Er0 = C0789Er0.f;
                List list4 = list3;
                if (zBooleanValue) {
                    collectionK = new ArrayList();
                    for (Object obj4 : list) {
                        if (G10.c(((InterfaceC8468tR) obj4).getName(), c2352Tm0)) {
                            collectionK.add(obj4);
                        }
                    }
                } else {
                    collectionK = AbstractC1599Mm.k();
                }
                c0789Er0.v(c2352Tm0, list4, collectionK, this.b, new a(arrayList, this));
            }
        }
        return AbstractC1392Km.c(arrayList);
    }

    public final List l() {
        return (List) AbstractC9895yX0.a(this.c, this, d[0]);
    }

    public final InterfaceC4923gl m() {
        return this.b;
    }
}
