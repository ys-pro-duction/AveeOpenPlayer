package com.daaw;

import com.daaw.C0745Eg0;
import com.daaw.C6564mc1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.pp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7465pp0 implements Cloneable {
    public C6564mc1 B;
    public final Map C;

    public C7465pp0(C6564mc1 c6564mc1) {
        this.C = new HashMap();
        AbstractC6557mb.d(c6564mc1.w0() == C6564mc1.c.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        AbstractC6557mb.d(!AbstractC3704cQ0.c(c6564mc1), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.B = c6564mc1;
    }

    public static C7465pp0 h(Map map) {
        return new C7465pp0((C6564mc1) C6564mc1.x0().E(C0745Eg0.j0().y(map)).n());
    }

    public final C0745Eg0 b(C6488mK c6488mK, Map map) {
        C6564mc1 c6564mc1G = g(this.B, c6488mK);
        C0745Eg0.b bVarJ0 = AbstractC0513Cc1.w(c6564mc1G) ? (C0745Eg0.b) c6564mc1G.s0().Y() : C0745Eg0.j0();
        boolean z = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                C0745Eg0 c0745Eg0B = b((C6488mK) c6488mK.c(str), (Map) value);
                if (c0745Eg0B != null) {
                    bVarJ0.z(str, (C6564mc1) C6564mc1.x0().G(c0745Eg0B).n());
                    z = true;
                }
            } else {
                if (value instanceof C6564mc1) {
                    bVarJ0.z(str, (C6564mc1) value);
                } else if (bVarJ0.x(str)) {
                    AbstractC6557mb.d(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    bVarJ0.A(str);
                }
                z = true;
            }
        }
        if (z) {
            return (C0745Eg0) bVarJ0.n();
        }
        return null;
    }

    public final C6564mc1 c() {
        synchronized (this.C) {
            try {
                C0745Eg0 c0745Eg0B = b(C6488mK.D, this.C);
                if (c0745Eg0B != null) {
                    this.B = (C6564mc1) C6564mc1.x0().G(c0745Eg0B).n();
                    this.C.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.B;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C7465pp0 clone() {
        return new C7465pp0(c());
    }

    public void e(C6488mK c6488mK) {
        AbstractC6557mb.d(!c6488mK.n(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        n(c6488mK, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7465pp0) {
            return AbstractC0513Cc1.q(c(), ((C7465pp0) obj).c());
        }
        return false;
    }

    public final C5642jK f(C0745Eg0 c0745Eg0) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : c0745Eg0.d0().entrySet()) {
            C6488mK c6488mKV = C6488mK.v((String) entry.getKey());
            if (AbstractC0513Cc1.w((C6564mc1) entry.getValue())) {
                Set setB = f(((C6564mc1) entry.getValue()).s0()).b();
                if (setB.isEmpty()) {
                    hashSet.add(c6488mKV);
                } else {
                    Iterator it = setB.iterator();
                    while (it.hasNext()) {
                        hashSet.add((C6488mK) c6488mKV.a((C6488mK) it.next()));
                    }
                }
            } else {
                hashSet.add(c6488mKV);
            }
        }
        return C5642jK.a(hashSet);
    }

    public final C6564mc1 g(C6564mc1 c6564mc1, C6488mK c6488mK) {
        if (c6488mK.n()) {
            return c6564mc1;
        }
        for (int i = 0; i < c6488mK.p() - 1; i++) {
            c6564mc1 = c6564mc1.s0().e0(c6488mK.m(i), null);
            if (!AbstractC0513Cc1.w(c6564mc1)) {
                return null;
            }
        }
        return c6564mc1.s0().e0(c6488mK.l(), null);
    }

    public int hashCode() {
        return c().hashCode();
    }

    public C6564mc1 i(C6488mK c6488mK) {
        return g(c(), c6488mK);
    }

    public C5642jK j() {
        return f(c().s0());
    }

    public Map k() {
        return c().s0().d0();
    }

    public void l(C6488mK c6488mK, C6564mc1 c6564mc1) {
        AbstractC6557mb.d(!c6488mK.n(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        n(c6488mK, c6564mc1);
    }

    public void m(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            C6488mK c6488mK = (C6488mK) entry.getKey();
            if (entry.getValue() == null) {
                e(c6488mK);
            } else {
                l(c6488mK, (C6564mc1) entry.getValue());
            }
        }
    }

    public final void n(C6488mK c6488mK, C6564mc1 c6564mc1) {
        Map map;
        Map map2 = this.C;
        for (int i = 0; i < c6488mK.p() - 1; i++) {
            String strM = c6488mK.m(i);
            Object obj = map2.get(strM);
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                if (obj instanceof C6564mc1) {
                    C6564mc1 c6564mc12 = (C6564mc1) obj;
                    if (c6564mc12.w0() == C6564mc1.c.MAP_VALUE) {
                        HashMap map3 = new HashMap(c6564mc12.s0().d0());
                        map2.put(strM, map3);
                        map2 = map3;
                    }
                }
                map = new HashMap();
                map2.put(strM, map);
            }
            map2 = map;
        }
        map2.put(c6488mK.l(), c6564mc1);
    }

    public String toString() {
        return "ObjectValue{internalValue=" + AbstractC0513Cc1.b(c()) + '}';
    }

    public C7465pp0() {
        this((C6564mc1) C6564mc1.x0().G(C0745Eg0.b0()).n());
    }
}
