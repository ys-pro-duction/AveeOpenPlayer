package com.daaw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.nj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6877nj0 implements VC {
    public final TreeMap a = new TreeMap();
    public final Map b = new HashMap();

    @Override // com.daaw.VC
    public AbstractC10271zr0 a(TC tc) {
        return (AbstractC10271zr0) this.a.get(tc);
    }

    @Override // com.daaw.VC
    public Map b(SortedSet sortedSet) {
        HashMap map = new HashMap();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            TC tc = (TC) it.next();
            AbstractC10271zr0 abstractC10271zr0 = (AbstractC10271zr0) this.a.get(tc);
            if (abstractC10271zr0 != null) {
                map.put(tc, abstractC10271zr0);
            }
        }
        return map;
    }

    @Override // com.daaw.VC
    public Map c(UI0 ui0, int i) {
        HashMap map = new HashMap();
        int iP = ui0.p() + 1;
        for (AbstractC10271zr0 abstractC10271zr0 : this.a.tailMap(TC.l((UI0) ui0.c(""))).values()) {
            TC tcB = abstractC10271zr0.b();
            if (!ui0.o(tcB.q())) {
                break;
            }
            if (tcB.q().p() == iP && abstractC10271zr0.c() > i) {
                map.put(abstractC10271zr0.b(), abstractC10271zr0);
            }
        }
        return map;
    }

    @Override // com.daaw.VC
    public void d(int i) {
        if (this.b.containsKey(Integer.valueOf(i))) {
            Set set = (Set) this.b.get(Integer.valueOf(i));
            this.b.remove(Integer.valueOf(i));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.a.remove((TC) it.next());
            }
        }
    }

    @Override // com.daaw.VC
    public void e(int i, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            g(i, (AbstractC9688xm0) AbstractC8342sy0.d((AbstractC9688xm0) entry.getValue(), "null value for key: %s", entry.getKey()));
        }
    }

    @Override // com.daaw.VC
    public Map f(String str, int i, int i2) {
        TreeMap treeMap = new TreeMap();
        for (AbstractC10271zr0 abstractC10271zr0 : this.a.values()) {
            if (abstractC10271zr0.b().n().equals(str) && abstractC10271zr0.c() > i) {
                Map map = (Map) treeMap.get(Integer.valueOf(abstractC10271zr0.c()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(abstractC10271zr0.c()), map);
                }
                map.put(abstractC10271zr0.b(), abstractC10271zr0);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            map2.putAll((Map) it.next());
            if (map2.size() >= i2) {
                break;
            }
        }
        return map2;
    }

    public final void g(int i, AbstractC9688xm0 abstractC9688xm0) {
        AbstractC10271zr0 abstractC10271zr0 = (AbstractC10271zr0) this.a.get(abstractC9688xm0.g());
        if (abstractC10271zr0 != null) {
            ((Set) this.b.get(Integer.valueOf(abstractC10271zr0.c()))).remove(abstractC9688xm0.g());
        }
        this.a.put(abstractC9688xm0.g(), AbstractC10271zr0.a(i, abstractC9688xm0));
        if (this.b.get(Integer.valueOf(i)) == null) {
            this.b.put(Integer.valueOf(i), new HashSet());
        }
        ((Set) this.b.get(Integer.valueOf(i))).add(abstractC9688xm0.g());
    }
}
