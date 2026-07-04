package com.daaw;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.s82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8114s82 extends AbstractC4373eo2 {
    public final Map b;
    public final Map c;
    public long d;

    public C8114s82(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.c = new C2407Ua();
        this.b = new C2407Ua();
    }

    public static /* synthetic */ void e(C8114s82 c8114s82, String str, long j) {
        c8114s82.d();
        AbstractC7506py0.f(str);
        if (c8114s82.c.isEmpty()) {
            c8114s82.d = j;
        }
        Integer num = (Integer) c8114s82.c.get(str);
        if (num != null) {
            c8114s82.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c8114s82.c.size() >= 100) {
            c8114s82.a.w().t().a("Too many ads visible");
        } else {
            c8114s82.c.put(str, 1);
            c8114s82.b.put(str, Long.valueOf(j));
        }
    }

    public static /* synthetic */ void f(C8114s82 c8114s82, String str, long j) {
        c8114s82.d();
        AbstractC7506py0.f(str);
        Integer num = (Integer) c8114s82.c.get(str);
        if (num == null) {
            c8114s82.a.w().n().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C5715jb3 c5715jb3O = c8114s82.a.K().o(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            c8114s82.c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        c8114s82.c.remove(str);
        Long l = (Long) c8114s82.b.get(str);
        if (l == null) {
            c8114s82.a.w().n().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            c8114s82.b.remove(str);
            c8114s82.l(str, jLongValue, c5715jb3O);
        }
        if (c8114s82.c.isEmpty()) {
            long j2 = c8114s82.d;
            if (j2 == 0) {
                c8114s82.a.w().n().a("First ad exposure time was never set");
            } else {
                c8114s82.k(j - j2, c5715jb3O);
                c8114s82.d = 0L;
            }
        }
    }

    public final void h(String str, long j) {
        if (str == null || str.length() == 0) {
            this.a.w().n().a("Ad unit id must be a non-empty string");
        } else {
            this.a.x().z(new RunnableC9131vm1(this, str, j));
        }
    }

    public final void i(String str, long j) {
        if (str == null || str.length() == 0) {
            this.a.w().n().a("Ad unit id must be a non-empty string");
        } else {
            this.a.x().z(new MC1(this, str, j));
        }
    }

    public final void j(long j) {
        C5715jb3 c5715jb3O = this.a.K().o(false);
        for (String str : this.b.keySet()) {
            l(str, j - ((Long) this.b.get(str)).longValue(), c5715jb3O);
        }
        if (!this.b.isEmpty()) {
            k(j - this.d, c5715jb3O);
        }
        m(j);
    }

    public final void k(long j, C5715jb3 c5715jb3) {
        if (c5715jb3 == null) {
            this.a.w().s().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.a.w().s().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        Pf3.y(c5715jb3, bundle, true);
        this.a.I().r("am", "_xa", bundle);
    }

    public final void l(String str, long j, C5715jb3 c5715jb3) {
        if (c5715jb3 == null) {
            this.a.w().s().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.a.w().s().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        Pf3.y(c5715jb3, bundle, true);
        this.a.I().r("am", "_xu", bundle);
    }

    public final void m(long j) {
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            this.b.put((String) it.next(), Long.valueOf(j));
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.d = j;
    }
}
