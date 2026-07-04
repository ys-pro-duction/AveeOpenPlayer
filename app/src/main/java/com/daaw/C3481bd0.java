package com.daaw;

import android.util.SparseArray;
import com.daaw.C0524Cf0;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.bd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3481bd0 {
    public static final long n = TimeUnit.MINUTES.toSeconds(5);
    public final AbstractC1940Pt0 a;
    public InterfaceC7942rZ b;
    public InterfaceC0344Am0 c;
    public VC d;
    public final JG0 e;
    public C1768Oc0 f;
    public final C6457mC0 g;
    public final C7863rF0 h;
    public final InterfaceC4153e11 i;
    public final InterfaceC2017Qh j;
    public final SparseArray k;
    public final Map l;
    public final C5556j11 m;

    /* JADX INFO: renamed from: com.daaw.bd0$b */
    public static class b {
        public C5000h11 a;
        public int b;

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.bd0$c */
    public static class c {
        public final Map a;
        public final Set b;

        public c(Map map, Set set) {
            this.a = map;
            this.b = set;
        }
    }

    public C3481bd0(AbstractC1940Pt0 abstractC1940Pt0, C6457mC0 c6457mC0, C0722Ea1 c0722Ea1) {
        AbstractC6557mb.d(abstractC1940Pt0.i(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.a = abstractC1940Pt0;
        this.g = c6457mC0;
        InterfaceC4153e11 interfaceC4153e11H = abstractC1940Pt0.h();
        this.i = interfaceC4153e11H;
        this.j = abstractC1940Pt0.a();
        this.m = C5556j11.b(interfaceC4153e11H.d());
        this.e = abstractC1940Pt0.g();
        C7863rF0 c7863rF0 = new C7863rF0();
        this.h = c7863rF0;
        this.k = new SparseArray();
        this.l = new HashMap();
        abstractC1940Pt0.f().j(c7863rF0);
        z(c0722Ea1);
    }

    public static boolean F(C5000h11 c5000h11, C5000h11 c5000h112, C4721g11 c4721g11) {
        if (c5000h11.d().isEmpty()) {
            return true;
        }
        long jG = c5000h112.f().c().g() - c5000h11.f().c().g();
        long j = n;
        if (jG < j && c5000h112.b().c().g() - c5000h11.b().c().g() < j) {
            return c4721g11 != null && (c4721g11.b().size() + c4721g11.c().size()) + c4721g11.d().size() > 0;
        }
        return true;
    }

    public static /* synthetic */ SY a(C3481bd0 c3481bd0, int i) {
        C9967ym0 c9967ym0F = c3481bd0.c.f(i);
        AbstractC6557mb.d(c9967ym0F != null, "Attempt to reject nonexistent batch!", new Object[0]);
        c3481bd0.c.d(c9967ym0F);
        c3481bd0.c.a();
        c3481bd0.d.d(i);
        c3481bd0.f.n(c9967ym0F.f());
        return c3481bd0.f.d(c9967ym0F.f());
    }

    public static /* synthetic */ void b(C3481bd0 c3481bd0, List list) {
        c3481bd0.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4038dd0 c4038dd0 = (C4038dd0) it.next();
            int iD = c4038dd0.d();
            c3481bd0.h.b(c4038dd0.b(), iD);
            UY uyC = c4038dd0.c();
            Iterator it2 = uyC.iterator();
            while (it2.hasNext()) {
                c3481bd0.a.f().l((TC) it2.next());
            }
            c3481bd0.h.g(uyC, iD);
            if (!c4038dd0.e()) {
                C5000h11 c5000h11 = (C5000h11) c3481bd0.k.get(iD);
                AbstractC6557mb.d(c5000h11 != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(iD));
                C5000h11 c5000h11J = c5000h11.j(c5000h11.f());
                c3481bd0.k.put(iD, c5000h11J);
                if (F(c5000h11, c5000h11J, null)) {
                    c3481bd0.i.a(c5000h11J);
                }
            }
        }
    }

    public static /* synthetic */ C1664Nc0 c(C3481bd0 c3481bd0, Set set, List list, Timestamp timestamp) {
        Map mapC = c3481bd0.e.c(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : mapC.entrySet()) {
            if (!((C4083dm0) entry.getValue()).o()) {
                hashSet.add((TC) entry.getKey());
            }
        }
        Map mapK = c3481bd0.f.k(mapC);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC9688xm0 abstractC9688xm0 = (AbstractC9688xm0) it.next();
            C7465pp0 c7465pp0D = abstractC9688xm0.d(((C0468Br0) mapK.get(abstractC9688xm0.g())).a());
            if (c7465pp0D != null) {
                arrayList.add(new C5520it0(abstractC9688xm0.g(), c7465pp0D, c7465pp0D.j(), C6669my0.a(true)));
            }
        }
        C9967ym0 c9967ym0C = c3481bd0.c.c(timestamp, arrayList, list);
        c3481bd0.d.e(c9967ym0C.e(), c9967ym0C.a(mapK, hashSet));
        return C1664Nc0.a(c9967ym0C.e(), mapK);
    }

    public static /* synthetic */ SY e(C3481bd0 c3481bd0, KG0 kg0, CU0 cu0) {
        c3481bd0.getClass();
        Map mapD = kg0.d();
        long jF = c3481bd0.a.f().f();
        for (Map.Entry entry : mapD.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            C4721g11 c4721g11 = (C4721g11) entry.getValue();
            C5000h11 c5000h11 = (C5000h11) c3481bd0.k.get(iIntValue);
            if (c5000h11 != null) {
                c3481bd0.i.g(c4721g11.d(), iIntValue);
                c3481bd0.i.i(c4721g11.b(), iIntValue);
                C5000h11 c5000h11L = c5000h11.l(jF);
                if (kg0.e().containsKey(num)) {
                    AbstractC4340ei abstractC4340ei = AbstractC4340ei.C;
                    CU0 cu02 = CU0.C;
                    c5000h11L = c5000h11L.k(abstractC4340ei, cu02).j(cu02);
                } else if (!c4721g11.e().isEmpty()) {
                    c5000h11L = c5000h11L.k(c4721g11.e(), kg0.c());
                }
                c3481bd0.k.put(iIntValue, c5000h11L);
                if (F(c5000h11, c5000h11L, c4721g11)) {
                    c3481bd0.i.a(c5000h11L);
                }
            }
        }
        Map mapA = kg0.a();
        Set setB = kg0.b();
        for (TC tc : mapA.keySet()) {
            if (setB.contains(tc)) {
                c3481bd0.a.f().h(tc);
            }
        }
        c cVarB = c3481bd0.B(mapA);
        Map map = cVarB.a;
        CU0 cu0F = c3481bd0.i.f();
        if (!cu0.equals(CU0.C)) {
            AbstractC6557mb.d(cu0.compareTo(cu0F) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", cu0, cu0F);
            c3481bd0.i.b(cu0);
        }
        return c3481bd0.f.i(map, cVarB.b);
    }

    public static /* synthetic */ SY g(C3481bd0 c3481bd0, C10246zm0 c10246zm0) {
        c3481bd0.getClass();
        C9967ym0 c9967ym0B = c10246zm0.b();
        c3481bd0.c.i(c9967ym0B, c10246zm0.f());
        c3481bd0.o(c10246zm0);
        c3481bd0.c.a();
        c3481bd0.d.d(c10246zm0.b().e());
        c3481bd0.f.n(c3481bd0.s(c10246zm0));
        return c3481bd0.f.d(c9967ym0B.f());
    }

    public static /* synthetic */ void h(C3481bd0 c3481bd0, int i) {
        C5000h11 c5000h11 = (C5000h11) c3481bd0.k.get(i);
        AbstractC6557mb.d(c5000h11 != null, "Tried to release nonexistent target: %s", Integer.valueOf(i));
        Iterator it = c3481bd0.h.h(i).iterator();
        while (it.hasNext()) {
            c3481bd0.a.f().l((TC) it.next());
        }
        c3481bd0.a.f().p(c5000h11);
        c3481bd0.k.remove(i);
        c3481bd0.l.remove(c5000h11.g());
    }

    public static /* synthetic */ void i(C3481bd0 c3481bd0, b bVar, Z01 z01) {
        int iC = c3481bd0.m.c();
        bVar.b = iC;
        C5000h11 c5000h11 = new C5000h11(z01, iC, c3481bd0.a.f().f(), EnumC7573qC0.LISTEN);
        bVar.a = c5000h11;
        c3481bd0.i.c(c5000h11);
    }

    public void A(final List list) {
        this.a.k("notifyLocalViewChanges", new Runnable() { // from class: com.daaw.Wc0
            @Override // java.lang.Runnable
            public final void run() {
                C3481bd0.b(this.B, list);
            }
        });
    }

    public final c B(Map map) {
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map mapC = this.e.c(map.keySet());
        for (Map.Entry entry : map.entrySet()) {
            TC tc = (TC) entry.getKey();
            C4083dm0 c4083dm0 = (C4083dm0) entry.getValue();
            C4083dm0 c4083dm02 = (C4083dm0) mapC.get(tc);
            if (c4083dm0.b() != c4083dm02.b()) {
                hashSet.add(tc);
            }
            if (c4083dm0.i() && c4083dm0.k().equals(CU0.C)) {
                arrayList.add(c4083dm0.getKey());
                map2.put(tc, c4083dm0);
            } else if (!c4083dm02.o() || c4083dm0.k().compareTo(c4083dm02.k()) > 0 || (c4083dm0.k().compareTo(c4083dm02.k()) == 0 && c4083dm02.f())) {
                AbstractC6557mb.d(!CU0.C.equals(c4083dm0.g()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.e.f(c4083dm0, c4083dm0.g());
                map2.put(tc, c4083dm0);
            } else {
                AbstractC2212Sd0.a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", tc, c4083dm02.k(), c4083dm0.k());
            }
        }
        this.e.removeAll(arrayList);
        return new c(map2, hashSet);
    }

    public SY C(final int i) {
        return (SY) this.a.j("Reject batch", new BZ0() { // from class: com.daaw.Vc0
            @Override // com.daaw.BZ0
            public final Object get() {
                return C3481bd0.a(this.a, i);
            }
        });
    }

    public void D(final int i) {
        this.a.k("Release target", new Runnable() { // from class: com.daaw.Yc0
            @Override // java.lang.Runnable
            public final void run() {
                C3481bd0.h(this.B, i);
            }
        });
    }

    public void E(final AbstractC4340ei abstractC4340ei) {
        this.a.k("Set stream token", new Runnable() { // from class: com.daaw.Uc0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.c.h(abstractC4340ei);
            }
        });
    }

    public void G() {
        this.a.e().run();
        H();
        I();
    }

    public final void H() {
        this.a.k("Start IndexManager", new Runnable() { // from class: com.daaw.Qc0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.b.start();
            }
        });
    }

    public final void I() {
        this.a.k("Start MutationQueue", new Runnable() { // from class: com.daaw.Sc0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.c.start();
            }
        });
    }

    public C1664Nc0 J(final List list) {
        final Timestamp timestampH = Timestamp.h();
        final HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((AbstractC9688xm0) it.next()).g());
        }
        return (C1664Nc0) this.a.j("Locally write mutations", new BZ0() { // from class: com.daaw.Xc0
            @Override // com.daaw.BZ0
            public final Object get() {
                return C3481bd0.c(this.a, hashSet, list, timestampH);
            }
        });
    }

    public SY l(final C10246zm0 c10246zm0) {
        return (SY) this.a.j("Acknowledge batch", new BZ0() { // from class: com.daaw.Rc0
            @Override // com.daaw.BZ0
            public final Object get() {
                return C3481bd0.g(this.a, c10246zm0);
            }
        });
    }

    public C5000h11 m(final Z01 z01) {
        int iH;
        C5000h11 c5000h11H = this.i.h(z01);
        if (c5000h11H != null) {
            iH = c5000h11H.h();
        } else {
            final b bVar = new b();
            this.a.k("Allocate target", new Runnable() { // from class: com.daaw.Zc0
                @Override // java.lang.Runnable
                public final void run() {
                    C3481bd0.i(this.B, bVar, z01);
                }
            });
            iH = bVar.b;
            c5000h11H = bVar.a;
        }
        if (this.k.get(iH) == null) {
            this.k.put(iH, c5000h11H);
            this.l.put(z01, Integer.valueOf(iH));
        }
        return c5000h11H;
    }

    public SY n(final KG0 kg0) {
        final CU0 cu0C = kg0.c();
        return (SY) this.a.j("Apply remote event", new BZ0() { // from class: com.daaw.ad0
            @Override // com.daaw.BZ0
            public final Object get() {
                return C3481bd0.e(this.a, kg0, cu0C);
            }
        });
    }

    public final void o(C10246zm0 c10246zm0) {
        C9967ym0 c9967ym0B = c10246zm0.b();
        for (TC tc : c9967ym0B.f()) {
            C4083dm0 c4083dm0E = this.e.e(tc);
            CU0 cu0 = (CU0) c10246zm0.d().m(tc);
            AbstractC6557mb.d(cu0 != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (c4083dm0E.k().compareTo(cu0) < 0) {
                c9967ym0B.c(c4083dm0E, c10246zm0);
                if (c4083dm0E.o()) {
                    this.e.f(c4083dm0E, c10246zm0.c());
                }
            }
        }
        this.c.d(c9967ym0B);
    }

    public C0524Cf0.c p(final C0524Cf0 c0524Cf0) {
        return (C0524Cf0.c) this.a.j("Collect garbage", new BZ0() { // from class: com.daaw.Tc0
            @Override // com.daaw.BZ0
            public final Object get() {
                return c0524Cf0.f(this.a.k);
            }
        });
    }

    public C7851rC0 q(C5890kC0 c5890kC0, boolean z) {
        UY uyE;
        CU0 cu0B;
        C5000h11 c5000h11X = x(c5890kC0.z());
        CU0 cu0 = CU0.C;
        UY uyH = TC.h();
        if (c5000h11X != null) {
            cu0B = c5000h11X.b();
            uyE = this.i.e(c5000h11X.h());
        } else {
            uyE = uyH;
            cu0B = cu0;
        }
        C6457mC0 c6457mC0 = this.g;
        if (z) {
            cu0 = cu0B;
        }
        return new C7851rC0(c6457mC0.d(c5890kC0, cu0, uyE), uyE);
    }

    public InterfaceC7942rZ r() {
        return this.b;
    }

    public final Set s(C10246zm0 c10246zm0) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c10246zm0.e().size(); i++) {
            if (!((C0448Bm0) c10246zm0.e().get(i)).a().isEmpty()) {
                hashSet.add(((AbstractC9688xm0) c10246zm0.b().h().get(i)).g());
            }
        }
        return hashSet;
    }

    public CU0 t() {
        return this.i.f();
    }

    public AbstractC4340ei u() {
        return this.c.g();
    }

    public C1768Oc0 v() {
        return this.f;
    }

    public C9967ym0 w(int i) {
        return this.c.e(i);
    }

    public C5000h11 x(Z01 z01) {
        Integer num = (Integer) this.l.get(z01);
        return num != null ? (C5000h11) this.k.get(num.intValue()) : this.i.h(z01);
    }

    public SY y(C0722Ea1 c0722Ea1) {
        List listJ = this.c.j();
        z(c0722Ea1);
        H();
        I();
        List listJ2 = this.c.j();
        UY uyH = TC.h();
        Iterator it = Arrays.asList(listJ, listJ2).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C9967ym0) it2.next()).h().iterator();
                while (it3.hasNext()) {
                    uyH = uyH.p(((AbstractC9688xm0) it3.next()).g());
                }
            }
        }
        return this.f.d(uyH);
    }

    public final void z(C0722Ea1 c0722Ea1) {
        InterfaceC7942rZ interfaceC7942rZC = this.a.c(c0722Ea1);
        this.b = interfaceC7942rZC;
        this.c = this.a.d(c0722Ea1, interfaceC7942rZC);
        VC vcB = this.a.b(c0722Ea1);
        this.d = vcB;
        this.f = new C1768Oc0(this.e, this.c, vcB, this.b);
        this.e.b(this.b);
        this.g.e(this.f, this.b);
    }
}
