package com.daaw;

import android.util.SparseArray;
import com.daaw.C0524Cf0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.rj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7992rj0 implements InterfaceC7585qF0, InterfaceC9932yf0 {
    public final C8829uj0 a;
    public final C1872Pc0 b;
    public C7863rF0 d;
    public final C0524Cf0 e;
    public final C7957rc0 f;
    public final Map c = new HashMap();
    public long g = -1;

    public C7992rj0(C8829uj0 c8829uj0, C0524Cf0.b bVar, C1872Pc0 c1872Pc0) {
        this.a = c8829uj0;
        this.b = c1872Pc0;
        this.f = new C7957rc0(c8829uj0.h().m());
        this.e = new C0524Cf0(this, bVar);
    }

    public static /* synthetic */ void q(long[] jArr, Long l) {
        jArr[0] = jArr[0] + 1;
    }

    @Override // com.daaw.InterfaceC9932yf0
    public int a(long j, SparseArray sparseArray) {
        return this.a.h().p(j, sparseArray);
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void b() {
        AbstractC6557mb.d(this.g != -1, "Committing a transaction without having started one", new Object[0]);
        this.g = -1L;
    }

    @Override // com.daaw.InterfaceC9932yf0
    public C0524Cf0 c() {
        return this.e;
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void d() {
        AbstractC6557mb.d(this.g == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.g = this.f.a();
    }

    @Override // com.daaw.InterfaceC9932yf0
    public void e(InterfaceC8310sr interfaceC8310sr) {
        this.a.h().k(interfaceC8310sr);
    }

    @Override // com.daaw.InterfaceC7585qF0
    public long f() {
        AbstractC6557mb.d(this.g != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.g;
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void g(TC tc) {
        this.c.put(tc, Long.valueOf(f()));
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void h(TC tc) {
        this.c.put(tc, Long.valueOf(f()));
    }

    @Override // com.daaw.InterfaceC9932yf0
    public long i() {
        long jN = this.a.h().n();
        final long[] jArr = new long[1];
        n(new InterfaceC8310sr() { // from class: com.daaw.qj0
            @Override // com.daaw.InterfaceC8310sr
            public final void accept(Object obj) {
                C7992rj0.q(jArr, (Long) obj);
            }
        });
        return jN + jArr[0];
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void j(C7863rF0 c7863rF0) {
        this.d = c7863rF0;
    }

    @Override // com.daaw.InterfaceC9932yf0
    public int k(long j) {
        C9115vj0 c9115vj0G = this.a.g();
        ArrayList arrayList = new ArrayList();
        Iterator it = c9115vj0G.i().iterator();
        while (it.hasNext()) {
            TC key = ((LC) it.next()).getKey();
            if (!r(key, j)) {
                arrayList.add(key);
                this.c.remove(key);
            }
        }
        c9115vj0G.removeAll(arrayList);
        return arrayList.size();
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void l(TC tc) {
        this.c.put(tc, Long.valueOf(f()));
    }

    @Override // com.daaw.InterfaceC9932yf0
    public long m() {
        long jL = this.a.h().l(this.b) + this.a.g().h(this.b);
        Iterator it = this.a.p().iterator();
        while (it.hasNext()) {
            jL += ((C8271sj0) it.next()).l(this.b);
        }
        return jL;
    }

    @Override // com.daaw.InterfaceC9932yf0
    public void n(InterfaceC8310sr interfaceC8310sr) {
        for (Map.Entry entry : this.c.entrySet()) {
            if (!r((TC) entry.getKey(), ((Long) entry.getValue()).longValue())) {
                interfaceC8310sr.accept((Long) entry.getValue());
            }
        }
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void o(TC tc) {
        this.c.put(tc, Long.valueOf(f()));
    }

    @Override // com.daaw.InterfaceC7585qF0
    public void p(C5000h11 c5000h11) {
        this.a.h().a(c5000h11.l(f()));
    }

    public final boolean r(TC tc, long j) {
        if (s(tc) || this.d.c(tc) || this.a.h().j(tc)) {
            return true;
        }
        Long l = (Long) this.c.get(tc);
        return l != null && l.longValue() > j;
    }

    public final boolean s(TC tc) {
        Iterator it = this.a.p().iterator();
        while (it.hasNext()) {
            if (((C8271sj0) it.next()).k(tc)) {
                return true;
            }
        }
        return false;
    }
}
