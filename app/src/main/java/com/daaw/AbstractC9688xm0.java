package com.daaw;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.xm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9688xm0 {
    public final TC a;
    public final C6669my0 b;
    public final List c;

    public AbstractC9688xm0(TC tc, C6669my0 c6669my0) {
        this(tc, c6669my0, new ArrayList());
    }

    public static AbstractC9688xm0 c(C4083dm0 c4083dm0, C5642jK c5642jK) {
        if (!c4083dm0.d()) {
            return null;
        }
        if (c5642jK != null && c5642jK.b().isEmpty()) {
            return null;
        }
        if (c5642jK == null) {
            return c4083dm0.i() ? new C2919Yy(c4083dm0.getKey(), C6669my0.c) : new C8744uQ0(c4083dm0.getKey(), c4083dm0.h(), C6669my0.c);
        }
        C7465pp0 c7465pp0H = c4083dm0.h();
        C7465pp0 c7465pp0 = new C7465pp0();
        HashSet hashSet = new HashSet();
        for (C6488mK c6488mK : c5642jK.b()) {
            if (!hashSet.contains(c6488mK)) {
                if (c7465pp0H.i(c6488mK) == null && c6488mK.p() > 1) {
                    c6488mK = (C6488mK) c6488mK.r();
                }
                c7465pp0.l(c6488mK, c7465pp0H.i(c6488mK));
                hashSet.add(c6488mK);
            }
        }
        return new C5520it0(c4083dm0.getKey(), c7465pp0, C5642jK.a(hashSet), C6669my0.c);
    }

    public abstract C5642jK a(C4083dm0 c4083dm0, C5642jK c5642jK, Timestamp timestamp);

    public abstract void b(C4083dm0 c4083dm0, C0448Bm0 c0448Bm0);

    public C7465pp0 d(LC lc) {
        C7465pp0 c7465pp0 = null;
        for (C8161sK c8161sK : this.c) {
            C6564mc1 c6564mc1B = c8161sK.b().b(lc.e(c8161sK.a()));
            if (c6564mc1B != null) {
                if (c7465pp0 == null) {
                    c7465pp0 = new C7465pp0();
                }
                c7465pp0.l(c8161sK.a(), c6564mc1B);
            }
        }
        return c7465pp0;
    }

    public abstract C5642jK e();

    public List f() {
        return this.c;
    }

    public TC g() {
        return this.a;
    }

    public C6669my0 h() {
        return this.b;
    }

    public boolean i(AbstractC9688xm0 abstractC9688xm0) {
        return this.a.equals(abstractC9688xm0.a) && this.b.equals(abstractC9688xm0.b);
    }

    public int j() {
        return (g().hashCode() * 31) + this.b.hashCode();
    }

    public String k() {
        return "key=" + this.a + ", precondition=" + this.b;
    }

    public Map l(Timestamp timestamp, C4083dm0 c4083dm0) {
        HashMap map = new HashMap(this.c.size());
        for (C8161sK c8161sK : this.c) {
            map.put(c8161sK.a(), c8161sK.b().a(c4083dm0.e(c8161sK.a()), timestamp));
        }
        return map;
    }

    public Map m(C4083dm0 c4083dm0, List list) {
        HashMap map = new HashMap(this.c.size());
        AbstractC6557mb.d(this.c.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.c.size()));
        for (int i = 0; i < list.size(); i++) {
            C8161sK c8161sK = (C8161sK) this.c.get(i);
            map.put(c8161sK.a(), c8161sK.b().c(c4083dm0.e(c8161sK.a()), (C6564mc1) list.get(i)));
        }
        return map;
    }

    public void n(C4083dm0 c4083dm0) {
        AbstractC6557mb.d(c4083dm0.getKey().equals(g()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    public AbstractC9688xm0(TC tc, C6669my0 c6669my0, List list) {
        this.a = tc;
        this.b = c6669my0;
        this.c = list;
    }
}
