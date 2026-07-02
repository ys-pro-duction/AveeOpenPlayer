package com.daaw;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.eq3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4384eq3 {
    public String a;
    public boolean b;
    public C6822nX2 c;
    public BitSet d;
    public BitSet e;
    public Map f;
    public Map g;
    public final /* synthetic */ C1705Nm1 h;

    public /* synthetic */ C4384eq3(C1705Nm1 c1705Nm1, String str, AbstractC9427wp3 abstractC9427wp3) {
        this.h = c1705Nm1;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new C2407Ua();
        this.g = new C2407Ua();
    }

    public final C3969dM2 a(int i) {
        ArrayList arrayList;
        List list;
        GL2 gl2C = C3969dM2.C();
        gl2C.p(i);
        gl2C.r(this.b);
        C6822nX2 c6822nX2 = this.c;
        if (c6822nX2 != null) {
            gl2C.t(c6822nX2);
        }
        KW2 kw2F = C6822nX2.F();
        kw2F.q(Af3.J(this.d));
        kw2F.t(Af3.J(this.e));
        Map map = this.f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) this.f.get(num);
                if (l != null) {
                    BM2 bm2D = C5098hN2.D();
                    bm2D.q(iIntValue);
                    bm2D.p(l.longValue());
                    arrayList2.add((C5098hN2) bm2D.l());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            kw2F.p(arrayList);
        }
        Map map2 = this.g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.g.keySet()) {
                RX2 rx2E = C9064vY2.E();
                rx2E.q(num2.intValue());
                List list2 = (List) this.g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    rx2E.p(list2);
                }
                arrayList3.add((C9064vY2) rx2E.l());
            }
            list = arrayList3;
        }
        kw2F.r(list);
        gl2C.q(kw2F);
        return (C3969dM2) gl2C.l();
    }

    public final void c(Xs3 xs3) {
        int iA = xs3.a();
        if (xs3.c != null) {
            this.e.set(iA, true);
        }
        Boolean bool = xs3.d;
        if (bool != null) {
            this.d.set(iA, bool.booleanValue());
        }
        if (xs3.e != null) {
            Map map = this.f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l = (Long) map.get(numValueOf);
            long jLongValue = xs3.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (xs3.f != null) {
            Map map2 = this.g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.g.put(numValueOf2, arrayList);
            }
            if (xs3.c()) {
                arrayList.clear();
            }
            Bk3.b();
            C5788jq1 c5788jq1Z = this.h.a.z();
            String str = this.a;
            C4388er2 c4388er2 = AbstractC1311Jr2.a0;
            if (c5788jq1Z.B(str, c4388er2) && xs3.b()) {
                arrayList.clear();
            }
            Bk3.b();
            if (!this.h.a.z().B(this.a, c4388er2)) {
                arrayList.add(Long.valueOf(xs3.f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(xs3.f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public /* synthetic */ C4384eq3(C1705Nm1 c1705Nm1, String str, C6822nX2 c6822nX2, BitSet bitSet, BitSet bitSet2, Map map, Map map2, AbstractC9427wp3 abstractC9427wp3) {
        this.h = c1705Nm1;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new C2407Ua();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = c6822nX2;
    }
}
