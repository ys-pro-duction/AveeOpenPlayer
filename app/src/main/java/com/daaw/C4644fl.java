package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4644fl implements InterfaceC0487Bw {
    public final C20 a;
    public final NQ b;
    public final NQ c;
    public final Map d;
    public final Map e;
    public final Map f;

    public C4644fl(C20 c20, NQ nq) {
        G10.g(c20, "jClass");
        G10.g(nq, "memberFilter");
        this.a = c20;
        this.b = nq;
        C4355el c4355el = new C4355el(this);
        this.c = c4355el;
        KP0 kp0N = UP0.n(AbstractC2455Um.V(c20.N()), c4355el);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kp0N) {
            C2352Tm0 name = ((InterfaceC3605c30) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.d = linkedHashMap;
        KP0 kp0N2 = UP0.n(AbstractC2455Um.V(this.a.C()), this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : kp0N2) {
            linkedHashMap2.put(((V20) obj2).getName(), obj2);
        }
        this.e = linkedHashMap2;
        Collection collectionL = this.a.l();
        NQ nq2 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionL) {
            if (((Boolean) nq2.invoke(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((InterfaceC6693n30) obj4).getName(), obj4);
        }
        this.f = linkedHashMap3;
    }

    public static final boolean h(C4644fl c4644fl, InterfaceC3605c30 interfaceC3605c30) {
        G10.g(c4644fl, "this$0");
        G10.g(interfaceC3605c30, "m");
        return ((Boolean) c4644fl.b.invoke(interfaceC3605c30)).booleanValue() && !AbstractC3048a30.c(interfaceC3605c30);
    }

    @Override // com.daaw.InterfaceC0487Bw
    public Set a() {
        KP0 kp0N = UP0.n(AbstractC2455Um.V(this.a.N()), this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = kp0N.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC3605c30) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // com.daaw.InterfaceC0487Bw
    public Collection b(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        List list = (List) this.d.get(c2352Tm0);
        return list != null ? list : AbstractC1599Mm.k();
    }

    @Override // com.daaw.InterfaceC0487Bw
    public V20 c(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        return (V20) this.e.get(c2352Tm0);
    }

    @Override // com.daaw.InterfaceC0487Bw
    public Set d() {
        return this.f.keySet();
    }

    @Override // com.daaw.InterfaceC0487Bw
    public Set e() {
        KP0 kp0N = UP0.n(AbstractC2455Um.V(this.a.C()), this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = kp0N.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((V20) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // com.daaw.InterfaceC0487Bw
    public InterfaceC6693n30 f(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        return (InterfaceC6693n30) this.f.get(c2352Tm0);
    }
}
