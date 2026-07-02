package com.daaw;

import com.daaw.AbstractC5362iK;
import com.google.firebase.Timestamp;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.daaw.Oc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1768Oc0 {
    public final JG0 a;
    public final InterfaceC0344Am0 b;
    public final VC c;
    public final InterfaceC7942rZ d;

    public C1768Oc0(JG0 jg0, InterfaceC0344Am0 interfaceC0344Am0, VC vc, InterfaceC7942rZ interfaceC7942rZ) {
        this.a = jg0;
        this.b = interfaceC0344Am0;
        this.c = vc;
        this.d = interfaceC7942rZ;
    }

    public final Map a(Map map, Map map2, Set set) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (C4083dm0 c4083dm0 : map.values()) {
            AbstractC10271zr0 abstractC10271zr0 = (AbstractC10271zr0) map2.get(c4083dm0.getKey());
            if (set.contains(c4083dm0.getKey()) && (abstractC10271zr0 == null || (abstractC10271zr0.d() instanceof C5520it0))) {
                map3.put(c4083dm0.getKey(), c4083dm0);
            } else if (abstractC10271zr0 != null) {
                map4.put(c4083dm0.getKey(), abstractC10271zr0.d().e());
                abstractC10271zr0.d().a(c4083dm0, abstractC10271zr0.d().e(), Timestamp.h());
            } else {
                map4.put(c4083dm0.getKey(), C5642jK.b);
            }
        }
        map4.putAll(m(map3));
        HashMap map5 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map5.put((TC) entry.getKey(), new C0468Br0((LC) entry.getValue(), (C5642jK) map4.get(entry.getKey())));
        }
        return map5;
    }

    public final C4083dm0 b(TC tc, AbstractC10271zr0 abstractC10271zr0) {
        return (abstractC10271zr0 == null || (abstractC10271zr0.d() instanceof C5520it0)) ? this.a.e(tc) : C4083dm0.q(tc);
    }

    public LC c(TC tc) {
        AbstractC10271zr0 abstractC10271zr0A = this.c.a(tc);
        C4083dm0 c4083dm0B = b(tc, abstractC10271zr0A);
        if (abstractC10271zr0A != null) {
            abstractC10271zr0A.d().a(c4083dm0B, C5642jK.b, Timestamp.h());
        }
        return c4083dm0B;
    }

    public SY d(Iterable iterable) {
        return i(this.a.c(iterable), new HashSet());
    }

    public final SY e(C5890kC0 c5890kC0, AbstractC5362iK.a aVar) {
        AbstractC6557mb.d(c5890kC0.m().n(), "Currently we only support collection group queries at the root.", new Object[0]);
        String strE = c5890kC0.e();
        SY syA = NC.a();
        Iterator it = this.d.d(strE).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : f(c5890kC0.a((UI0) ((UI0) it.next()).c(strE)), aVar)) {
                syA = syA.v((TC) entry.getKey(), (LC) entry.getValue());
            }
        }
        return syA;
    }

    public final SY f(C5890kC0 c5890kC0, AbstractC5362iK.a aVar) {
        Map mapC = this.c.c(c5890kC0.m(), aVar.m());
        Map mapA = this.a.a(c5890kC0, aVar, mapC.keySet());
        for (Map.Entry entry : mapC.entrySet()) {
            if (!mapA.containsKey(entry.getKey())) {
                mapA.put((TC) entry.getKey(), C4083dm0.q((TC) entry.getKey()));
            }
        }
        SY syA = NC.a();
        for (Map.Entry entry2 : mapA.entrySet()) {
            AbstractC10271zr0 abstractC10271zr0 = (AbstractC10271zr0) mapC.get(entry2.getKey());
            if (abstractC10271zr0 != null) {
                abstractC10271zr0.d().a((C4083dm0) entry2.getValue(), C5642jK.b, Timestamp.h());
            }
            if (c5890kC0.t((LC) entry2.getValue())) {
                syA = syA.v((TC) entry2.getKey(), (LC) entry2.getValue());
            }
        }
        return syA;
    }

    public final SY g(UI0 ui0) {
        SY syA = NC.a();
        LC lcC = c(TC.l(ui0));
        return lcC.b() ? syA.v(lcC.getKey(), lcC) : syA;
    }

    public SY h(C5890kC0 c5890kC0, AbstractC5362iK.a aVar) {
        return c5890kC0.r() ? g(c5890kC0.m()) : c5890kC0.q() ? e(c5890kC0, aVar) : f(c5890kC0, aVar);
    }

    public SY i(Map map, Set set) {
        HashMap map2 = new HashMap();
        l(map2, map.keySet());
        SY syA = NC.a();
        for (Map.Entry entry : a(map, map2, set).entrySet()) {
            syA = syA.v((TC) entry.getKey(), ((C0468Br0) entry.getValue()).a());
        }
        return syA;
    }

    public C1664Nc0 j(String str, AbstractC5362iK.a aVar, int i) {
        Map mapD = this.a.d(str, aVar, i);
        Map mapF = i - mapD.size() > 0 ? this.c.f(str, aVar.m(), i - mapD.size()) : Collections.EMPTY_MAP;
        int iMax = -1;
        for (AbstractC10271zr0 abstractC10271zr0 : mapF.values()) {
            if (!mapD.containsKey(abstractC10271zr0.b())) {
                mapD.put(abstractC10271zr0.b(), b(abstractC10271zr0.b(), abstractC10271zr0));
            }
            iMax = Math.max(iMax, abstractC10271zr0.c());
        }
        l(mapF, mapD.keySet());
        return C1664Nc0.a(iMax, a(mapD, mapF, Collections.EMPTY_SET));
    }

    public Map k(Map map) {
        HashMap map2 = new HashMap();
        l(map2, map.keySet());
        return a(map, map2, new HashSet());
    }

    public final void l(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            TC tc = (TC) it.next();
            if (!map.containsKey(tc)) {
                treeSet.add(tc);
            }
        }
        map.putAll(this.c.b(treeSet));
    }

    public final Map m(Map map) {
        List<C9967ym0> listB = this.b.b(map.keySet());
        HashMap map2 = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (C9967ym0 c9967ym0 : listB) {
            for (TC tc : c9967ym0.f()) {
                C4083dm0 c4083dm0 = (C4083dm0) map.get(tc);
                if (c4083dm0 != null) {
                    map2.put(tc, c9967ym0.b(c4083dm0, map2.containsKey(tc) ? (C5642jK) map2.get(tc) : C5642jK.b));
                    int iE = c9967ym0.e();
                    if (!treeMap.containsKey(Integer.valueOf(iE))) {
                        treeMap.put(Integer.valueOf(iE), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(iE))).add(tc);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap map3 = new HashMap();
            for (TC tc2 : (Set) entry.getValue()) {
                if (!hashSet.contains(tc2)) {
                    AbstractC9688xm0 abstractC9688xm0C = AbstractC9688xm0.c((C4083dm0) map.get(tc2), (C5642jK) map2.get(tc2));
                    if (abstractC9688xm0C != null) {
                        map3.put(tc2, abstractC9688xm0C);
                    }
                    hashSet.add(tc2);
                }
            }
            this.c.e(((Integer) entry.getKey()).intValue(), map3);
        }
        return map2;
    }

    public void n(Set set) {
        m(this.a.c(set));
    }
}
