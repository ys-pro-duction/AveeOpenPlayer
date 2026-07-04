package com.daaw;

import com.daaw.C1669Nd1;
import com.daaw.C1881Pe1;
import com.daaw.C2620Wb0;
import com.daaw.C6262lX0;
import com.daaw.QG0;
import com.google.firebase.firestore.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ZZ0 implements QG0.c {
    public static final String o = "ZZ0";
    public final C3481bd0 a;
    public final QG0 b;
    public final int e;
    public C0722Ea1 m;
    public c n;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final LinkedHashSet f = new LinkedHashSet();
    public final Map g = new HashMap();
    public final Map h = new HashMap();
    public final C7863rF0 i = new C7863rF0();
    public final Map j = new HashMap();
    public final C5556j11 l = C5556j11.a();
    public final Map k = new HashMap();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C2620Wb0.a.values().length];
            a = iArr;
            try {
                iArr[C2620Wb0.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C2620Wb0.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {
        public final TC a;
        public boolean b;

        public b(TC tc) {
            this.a = tc;
        }
    }

    public interface c {
        void a(EnumC1409Kq0 enumC1409Kq0);

        void b(List list);

        void c(C5890kC0 c5890kC0, C6262lX0 c6262lX0);
    }

    public ZZ0(C3481bd0 c3481bd0, QG0 qg0, C0722Ea1 c0722Ea1, int i) {
        this.a = c3481bd0;
        this.b = qg0;
        this.e = i;
        this.m = c0722Ea1;
    }

    @Override // com.daaw.QG0.c
    public void a(EnumC1409Kq0 enumC1409Kq0) {
        h("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            C2107Rd1 c2107Rd1D = ((C8409tC0) ((Map.Entry) it.next()).getValue()).c().d(enumC1409Kq0);
            AbstractC6557mb.d(c2107Rd1D.a().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (c2107Rd1D.b() != null) {
                arrayList.add(c2107Rd1D.b());
            }
        }
        this.n.b(arrayList);
        this.n.a(enumC1409Kq0);
    }

    @Override // com.daaw.QG0.c
    public UY b(int i) {
        b bVar = (b) this.h.get(Integer.valueOf(i));
        if (bVar != null && bVar.b) {
            return TC.h().p(bVar.a);
        }
        UY uyH = TC.h();
        if (this.d.containsKey(Integer.valueOf(i))) {
            for (C5890kC0 c5890kC0 : (List) this.d.get(Integer.valueOf(i))) {
                if (this.c.containsKey(c5890kC0)) {
                    uyH = uyH.v(((C8409tC0) this.c.get(c5890kC0)).c().j());
                }
            }
        }
        return uyH;
    }

    @Override // com.daaw.QG0.c
    public void c(KG0 kg0) {
        h("handleRemoteEvent");
        for (Map.Entry entry : kg0.d().entrySet()) {
            Integer num = (Integer) entry.getKey();
            C4721g11 c4721g11 = (C4721g11) entry.getValue();
            b bVar = (b) this.h.get(num);
            if (bVar != null) {
                AbstractC6557mb.d((c4721g11.b().size() + c4721g11.c().size()) + c4721g11.d().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (c4721g11.b().size() > 0) {
                    bVar.b = true;
                } else if (c4721g11.c().size() > 0) {
                    AbstractC6557mb.d(bVar.b, "Received change for limbo target document without add.", new Object[0]);
                } else if (c4721g11.d().size() > 0) {
                    AbstractC6557mb.d(bVar.b, "Received remove for limbo target document without add.", new Object[0]);
                    bVar.b = false;
                }
            }
        }
        i(this.a.n(kg0), kg0);
    }

    @Override // com.daaw.QG0.c
    public void d(int i, C6262lX0 c6262lX0) {
        h("handleRejectedWrite");
        SY syC = this.a.C(i);
        if (!syC.isEmpty()) {
            o(c6262lX0, "Write failed at %s", ((TC) syC.s()).q());
        }
        p(i, c6262lX0);
        t(i);
        i(syC, null);
    }

    @Override // com.daaw.QG0.c
    public void e(int i, C6262lX0 c6262lX0) {
        h("handleRejectedListen");
        b bVar = (b) this.h.get(Integer.valueOf(i));
        TC tc = bVar != null ? bVar.a : null;
        if (tc == null) {
            this.a.D(i);
            r(i, c6262lX0);
            return;
        }
        this.g.remove(tc);
        this.h.remove(Integer.valueOf(i));
        q();
        CU0 cu0 = CU0.C;
        Map mapSingletonMap = Collections.singletonMap(tc, C4083dm0.r(tc, cu0));
        Set setSingleton = Collections.singleton(tc);
        Map map = Collections.EMPTY_MAP;
        c(new KG0(cu0, map, map, mapSingletonMap, setSingleton));
    }

    @Override // com.daaw.QG0.c
    public void f(C10246zm0 c10246zm0) {
        h("handleSuccessfulWrite");
        p(c10246zm0.b().e(), null);
        t(c10246zm0.b().e());
        i(this.a.l(c10246zm0), null);
    }

    public final void g(int i, C7521q11 c7521q11) {
        Map map = (Map) this.j.get(this.m);
        if (map == null) {
            map = new HashMap();
            this.j.put(this.m, map);
        }
        map.put(Integer.valueOf(i), c7521q11);
    }

    public final void h(String str) {
        AbstractC6557mb.d(this.n != null, "Trying to call %s before setting callback", str);
    }

    public final void i(SY sy, KG0 kg0) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            C8409tC0 c8409tC0 = (C8409tC0) ((Map.Entry) it.next()).getValue();
            C1669Nd1 c1669Nd1C = c8409tC0.c();
            C1669Nd1.b bVarG = c1669Nd1C.g(sy);
            if (bVarG.b()) {
                bVarG = c1669Nd1C.h(this.a.q(c8409tC0.a(), false).a(), bVarG);
            }
            C2107Rd1 c2107Rd1C = c8409tC0.c().c(bVarG, kg0 == null ? null : (C4721g11) kg0.d().get(Integer.valueOf(c8409tC0.b())));
            x(c2107Rd1C.a(), c8409tC0.b());
            if (c2107Rd1C.b() != null) {
                arrayList.add(c2107Rd1C.b());
                arrayList2.add(C4038dd0.a(c8409tC0.b(), c2107Rd1C.b()));
            }
        }
        this.n.b(arrayList);
        this.a.A(arrayList2);
    }

    public final boolean j(C6262lX0 c6262lX0) {
        C6262lX0.b bVarM = c6262lX0.m();
        return (bVarM == C6262lX0.b.FAILED_PRECONDITION && (c6262lX0.n() != null ? c6262lX0.n() : "").contains("requires an index")) || bVarM == C6262lX0.b.PERMISSION_DENIED;
    }

    public final void k() {
        Iterator it = this.k.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
            while (it2.hasNext()) {
                ((C7521q11) it2.next()).b(new com.google.firebase.firestore.c("'waitForPendingWrites' task is cancelled due to User change.", c.a.CANCELLED));
            }
        }
        this.k.clear();
    }

    public void l(C0722Ea1 c0722Ea1) {
        boolean zEquals = this.m.equals(c0722Ea1);
        this.m = c0722Ea1;
        if (!zEquals) {
            k();
            i(this.a.y(c0722Ea1), null);
        }
        this.b.t();
    }

    public final C1881Pe1 m(C5890kC0 c5890kC0, int i, AbstractC4340ei abstractC4340ei) {
        C7851rC0 c7851rC0Q = this.a.q(c5890kC0, true);
        C1881Pe1.a aVarI = C1881Pe1.a.NONE;
        if (this.d.get(Integer.valueOf(i)) != null) {
            aVarI = ((C8409tC0) this.c.get((C5890kC0) ((List) this.d.get(Integer.valueOf(i))).get(0))).c().i();
        }
        C4721g11 c4721g11A = C4721g11.a(aVarI == C1881Pe1.a.SYNCED, abstractC4340ei);
        C1669Nd1 c1669Nd1 = new C1669Nd1(c5890kC0, c7851rC0Q.b());
        C2107Rd1 c2107Rd1C = c1669Nd1.c(c1669Nd1.g(c7851rC0Q.a()), c4721g11A);
        x(c2107Rd1C.a(), i);
        this.c.put(c5890kC0, new C8409tC0(c5890kC0, i, c1669Nd1));
        if (!this.d.containsKey(Integer.valueOf(i))) {
            this.d.put(Integer.valueOf(i), new ArrayList(1));
        }
        ((List) this.d.get(Integer.valueOf(i))).add(c5890kC0);
        return c2107Rd1C.b();
    }

    public int n(C5890kC0 c5890kC0) {
        h("listen");
        AbstractC6557mb.d(!this.c.containsKey(c5890kC0), "We already listen to query: %s", c5890kC0);
        C5000h11 c5000h11M = this.a.m(c5890kC0.z());
        this.n.b(Collections.singletonList(m(c5890kC0, c5000h11M.h(), c5000h11M.d())));
        this.b.C(c5000h11M);
        return c5000h11M.h();
    }

    public final void o(C6262lX0 c6262lX0, String str, Object... objArr) {
        if (j(c6262lX0)) {
            AbstractC2212Sd0.d("Firestore", "%s: %s", String.format(str, objArr), c6262lX0);
        }
    }

    public final void p(int i, C6262lX0 c6262lX0) {
        Map map = (Map) this.j.get(this.m);
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            C7521q11 c7521q11 = (C7521q11) map.get(numValueOf);
            if (c7521q11 != null) {
                if (c6262lX0 != null) {
                    c7521q11.b(AbstractC6838nb1.s(c6262lX0));
                } else {
                    c7521q11.c(null);
                }
                map.remove(numValueOf);
            }
        }
    }

    public final void q() {
        while (!this.f.isEmpty() && this.g.size() < this.e) {
            Iterator it = this.f.iterator();
            TC tc = (TC) it.next();
            it.remove();
            int iC = this.l.c();
            this.h.put(Integer.valueOf(iC), new b(tc));
            this.g.put(tc, Integer.valueOf(iC));
            this.b.C(new C5000h11(C5890kC0.b(tc.q()).z(), iC, -1L, EnumC7573qC0.LIMBO_RESOLUTION));
        }
    }

    public final void r(int i, C6262lX0 c6262lX0) {
        for (C5890kC0 c5890kC0 : (List) this.d.get(Integer.valueOf(i))) {
            this.c.remove(c5890kC0);
            if (!c6262lX0.o()) {
                this.n.c(c5890kC0, c6262lX0);
                o(c6262lX0, "Listen for %s failed", c5890kC0);
            }
        }
        this.d.remove(Integer.valueOf(i));
        UY<TC> uyD = this.i.d(i);
        this.i.h(i);
        for (TC tc : uyD) {
            if (!this.i.c(tc)) {
                s(tc);
            }
        }
    }

    public final void s(TC tc) {
        this.f.remove(tc);
        Integer num = (Integer) this.g.get(tc);
        if (num != null) {
            this.b.N(num.intValue());
            this.g.remove(tc);
            this.h.remove(num);
            q();
        }
    }

    public final void t(int i) {
        if (this.k.containsKey(Integer.valueOf(i))) {
            Iterator it = ((List) this.k.get(Integer.valueOf(i))).iterator();
            while (it.hasNext()) {
                ((C7521q11) it.next()).c(null);
            }
            this.k.remove(Integer.valueOf(i));
        }
    }

    public void u(c cVar) {
        this.n = cVar;
    }

    public void v(C5890kC0 c5890kC0) {
        h("stopListening");
        C8409tC0 c8409tC0 = (C8409tC0) this.c.get(c5890kC0);
        AbstractC6557mb.d(c8409tC0 != null, "Trying to stop listening to a query not found", new Object[0]);
        this.c.remove(c5890kC0);
        int iB = c8409tC0.b();
        List list = (List) this.d.get(Integer.valueOf(iB));
        list.remove(c5890kC0);
        if (list.isEmpty()) {
            this.a.D(iB);
            this.b.N(iB);
            r(iB, C6262lX0.f);
        }
    }

    public final void w(C2620Wb0 c2620Wb0) {
        TC tcA = c2620Wb0.a();
        if (this.g.containsKey(tcA) || this.f.contains(tcA)) {
            return;
        }
        AbstractC2212Sd0.a(o, "New document in limbo: %s", tcA);
        this.f.add(tcA);
        q();
    }

    public final void x(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2620Wb0 c2620Wb0 = (C2620Wb0) it.next();
            int i2 = a.a[c2620Wb0.b().ordinal()];
            if (i2 == 1) {
                this.i.a(c2620Wb0.a(), i);
                w(c2620Wb0);
            } else {
                if (i2 != 2) {
                    throw AbstractC6557mb.a("Unknown limbo change type: %s", c2620Wb0.b());
                }
                AbstractC2212Sd0.a(o, "Document no longer in limbo: %s", c2620Wb0.a());
                TC tcA = c2620Wb0.a();
                this.i.e(tcA, i);
                if (!this.i.c(tcA)) {
                    s(tcA);
                }
            }
        }
    }

    public void y(List list, C7521q11 c7521q11) {
        h("writeMutations");
        C1664Nc0 c1664Nc0J = this.a.J(list);
        g(c1664Nc0J.b(), c7521q11);
        i(c1664Nc0J.c(), null);
        this.b.s();
    }
}
