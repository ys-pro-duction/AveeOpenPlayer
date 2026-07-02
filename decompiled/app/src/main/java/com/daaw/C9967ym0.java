package com.daaw;

import com.google.firebase.Timestamp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ym0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9967ym0 {
    public final int a;
    public final Timestamp b;
    public final List c;
    public final List d;

    public C9967ym0(int i, Timestamp timestamp, List list, List list2) {
        AbstractC6557mb.d(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.a = i;
        this.b = timestamp;
        this.c = list;
        this.d = list2;
    }

    public Map a(Map map, Set set) {
        HashMap map2 = new HashMap();
        for (TC tc : f()) {
            C4083dm0 c4083dm0 = (C4083dm0) ((C0468Br0) map.get(tc)).a();
            C5642jK c5642jKB = b(c4083dm0, ((C0468Br0) map.get(tc)).b());
            if (set.contains(tc)) {
                c5642jKB = null;
            }
            AbstractC9688xm0 abstractC9688xm0C = AbstractC9688xm0.c(c4083dm0, c5642jKB);
            if (abstractC9688xm0C != null) {
                map2.put(tc, abstractC9688xm0C);
            }
            if (!c4083dm0.o()) {
                c4083dm0.m(CU0.C);
            }
        }
        return map2;
    }

    public C5642jK b(C4083dm0 c4083dm0, C5642jK c5642jK) {
        for (int i = 0; i < this.c.size(); i++) {
            AbstractC9688xm0 abstractC9688xm0 = (AbstractC9688xm0) this.c.get(i);
            if (abstractC9688xm0.g().equals(c4083dm0.getKey())) {
                c5642jK = abstractC9688xm0.a(c4083dm0, c5642jK, this.b);
            }
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            AbstractC9688xm0 abstractC9688xm02 = (AbstractC9688xm0) this.d.get(i2);
            if (abstractC9688xm02.g().equals(c4083dm0.getKey())) {
                c5642jK = abstractC9688xm02.a(c4083dm0, c5642jK, this.b);
            }
        }
        return c5642jK;
    }

    public void c(C4083dm0 c4083dm0, C10246zm0 c10246zm0) {
        int size = this.d.size();
        List listE = c10246zm0.e();
        AbstractC6557mb.d(listE.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(listE.size()));
        for (int i = 0; i < size; i++) {
            AbstractC9688xm0 abstractC9688xm0 = (AbstractC9688xm0) this.d.get(i);
            if (abstractC9688xm0.g().equals(c4083dm0.getKey())) {
                abstractC9688xm0.b(c4083dm0, (C0448Bm0) listE.get(i));
            }
        }
    }

    public List d() {
        return this.c;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9967ym0.class == obj.getClass()) {
            C9967ym0 c9967ym0 = (C9967ym0) obj;
            if (this.a == c9967ym0.a && this.b.equals(c9967ym0.b) && this.c.equals(c9967ym0.c) && this.d.equals(c9967ym0.d)) {
                return true;
            }
        }
        return false;
    }

    public Set f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            hashSet.add(((AbstractC9688xm0) it.next()).g());
        }
        return hashSet;
    }

    public Timestamp g() {
        return this.b;
    }

    public List h() {
        return this.d;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.a + ", localWriteTime=" + this.b + ", baseMutations=" + this.c + ", mutations=" + this.d + ')';
    }
}
