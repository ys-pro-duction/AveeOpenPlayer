package com.daaw;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.it0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5520it0 extends AbstractC9688xm0 {
    public final C7465pp0 d;
    public final C5642jK e;

    public C5520it0(TC tc, C7465pp0 c7465pp0, C5642jK c5642jK, C6669my0 c6669my0) {
        this(tc, c7465pp0, c5642jK, c6669my0, new ArrayList());
    }

    @Override // com.daaw.AbstractC9688xm0
    public C5642jK a(C4083dm0 c4083dm0, C5642jK c5642jK, Timestamp timestamp) {
        n(c4083dm0);
        if (!h().e(c4083dm0)) {
            return c5642jK;
        }
        Map mapL = l(timestamp, c4083dm0);
        Map mapP = p();
        C7465pp0 c7465pp0H = c4083dm0.h();
        c7465pp0H.m(mapP);
        c7465pp0H.m(mapL);
        c4083dm0.l(c4083dm0.k(), c4083dm0.h()).u();
        if (c5642jK == null) {
            return null;
        }
        HashSet hashSet = new HashSet(c5642jK.b());
        hashSet.addAll(this.e.b());
        hashSet.addAll(o());
        return C5642jK.a(hashSet);
    }

    @Override // com.daaw.AbstractC9688xm0
    public void b(C4083dm0 c4083dm0, C0448Bm0 c0448Bm0) {
        n(c4083dm0);
        if (!h().e(c4083dm0)) {
            c4083dm0.n(c0448Bm0.b());
            return;
        }
        Map mapM = m(c4083dm0, c0448Bm0.a());
        C7465pp0 c7465pp0H = c4083dm0.h();
        c7465pp0H.m(p());
        c7465pp0H.m(mapM);
        c4083dm0.l(c0448Bm0.b(), c4083dm0.h()).t();
    }

    @Override // com.daaw.AbstractC9688xm0
    public C5642jK e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5520it0.class == obj.getClass()) {
            C5520it0 c5520it0 = (C5520it0) obj;
            if (i(c5520it0) && this.d.equals(c5520it0.d) && f().equals(c5520it0.f())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (j() * 31) + this.d.hashCode();
    }

    public final List o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = f().iterator();
        while (it.hasNext()) {
            arrayList.add(((C8161sK) it.next()).a());
        }
        return arrayList;
    }

    public final Map p() {
        HashMap map = new HashMap();
        for (C6488mK c6488mK : this.e.b()) {
            if (!c6488mK.n()) {
                map.put(c6488mK, this.d.i(c6488mK));
            }
        }
        return map;
    }

    public C7465pp0 q() {
        return this.d;
    }

    public String toString() {
        return "PatchMutation{" + k() + ", mask=" + this.e + ", value=" + this.d + "}";
    }

    public C5520it0(TC tc, C7465pp0 c7465pp0, C5642jK c5642jK, C6669my0 c6669my0, List list) {
        super(tc, c6669my0, list);
        this.d = c7465pp0;
        this.e = c5642jK;
    }
}
