package com.daaw;

import com.daaw.AbstractC5738jg1;
import com.daaw.C4208eD;
import com.daaw.C4619fg;
import com.daaw.H11;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.kg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6017kg1 {
    public final c a;
    public final Map b = new HashMap();
    public Map c = new HashMap();
    public Map d = new HashMap();
    public Map e = new HashMap();

    /* JADX INFO: renamed from: com.daaw.kg1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC5738jg1.e.values().length];
            a = iArr;
            try {
                iArr[AbstractC5738jg1.e.NoChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC5738jg1.e.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AbstractC5738jg1.e.Removed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AbstractC5738jg1.e.Current.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AbstractC5738jg1.e.Reset.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.kg1$b */
    public enum b {
        SUCCESS,
        SKIPPED,
        FALSE_POSITIVE
    }

    /* JADX INFO: renamed from: com.daaw.kg1$c */
    public interface c {
        C5000h11 a(int i);

        UY b(int i);

        C3851cw c();
    }

    public C6017kg1(c cVar) {
        this.a = cVar;
    }

    public final void a(int i, C4083dm0 c4083dm0) {
        if (l(i)) {
            e(i).a(c4083dm0.getKey(), r(i, c4083dm0.getKey()) ? C4208eD.a.MODIFIED : C4208eD.a.ADDED);
            this.c.put(c4083dm0.getKey(), c4083dm0);
            d(c4083dm0.getKey()).add(Integer.valueOf(i));
        }
    }

    public final b b(AbstractC5738jg1.c cVar, int i) {
        int iA = cVar.a().a();
        C4898gg c4898ggB = cVar.a().b();
        if (c4898ggB == null || !c4898ggB.d0()) {
            return b.SKIPPED;
        }
        try {
            C4619fg c4619fgA = C4619fg.a(c4898ggB.a0().a0(), c4898ggB.a0().c0(), c4898ggB.c0());
            return c4619fgA.c() == 0 ? b.SKIPPED : iA != i - f(c4619fgA, cVar.b()) ? b.FALSE_POSITIVE : b.SUCCESS;
        } catch (C4619fg.a e) {
            AbstractC2212Sd0.d("WatchChangeAggregator", "Applying bloom filter failed: (" + e.getMessage() + "); ignoring the bloom filter and falling back to full re-query.", new Object[0]);
            return b.SKIPPED;
        }
    }

    public KG0 c(CU0 cu0) {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int iIntValue = num.intValue();
            C6405m11 c6405m11 = (C6405m11) entry.getValue();
            C5000h11 c5000h11M = m(iIntValue);
            if (c5000h11M != null) {
                if (c6405m11.d() && c5000h11M.g().s()) {
                    TC tcL = TC.l(c5000h11M.g().n());
                    if (this.c.get(tcL) == null && !r(iIntValue, tcL)) {
                        o(iIntValue, tcL, C4083dm0.r(tcL, cu0));
                    }
                }
                if (c6405m11.c()) {
                    map.put(num, c6405m11.j());
                    c6405m11.b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : this.d.entrySet()) {
            TC tc = (TC) entry2.getKey();
            Iterator it = ((Set) entry2.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.add(tc);
                    break;
                }
                C5000h11 c5000h11M2 = m(((Integer) it.next()).intValue());
                if (c5000h11M2 == null || c5000h11M2.c().equals(EnumC7573qC0.LIMBO_RESOLUTION)) {
                }
            }
        }
        Iterator it2 = this.c.values().iterator();
        while (it2.hasNext()) {
            ((C4083dm0) it2.next()).v(cu0);
        }
        KG0 kg0 = new KG0(cu0, DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(this.e), DesugarCollections.unmodifiableMap(this.c), DesugarCollections.unmodifiableSet(hashSet));
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        return kg0;
    }

    public final Set d(TC tc) {
        Set set = (Set) this.d.get(tc);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.d.put(tc, hashSet);
        return hashSet;
    }

    public final C6405m11 e(int i) {
        C6405m11 c6405m11 = (C6405m11) this.b.get(Integer.valueOf(i));
        if (c6405m11 != null) {
            return c6405m11;
        }
        C6405m11 c6405m112 = new C6405m11();
        this.b.put(Integer.valueOf(i), c6405m112);
        return c6405m112;
    }

    public final int f(C4619fg c4619fg, int i) {
        int i2 = 0;
        for (TC tc : this.a.b(i)) {
            C3851cw c3851cwC = this.a.c();
            if (!c4619fg.h("projects/" + c3851cwC.k() + "/databases/" + c3851cwC.h() + "/documents/" + tc.q().g())) {
                o(i, tc, null);
                i2++;
            }
        }
        return i2;
    }

    public final int g(int i) {
        C4721g11 c4721g11J = e(i).j();
        return (this.a.b(i).size() + c4721g11J.b().size()) - c4721g11J.d().size();
    }

    public final Collection h(AbstractC5738jg1.d dVar) {
        List listD = dVar.d();
        if (!listD.isEmpty()) {
            return listD;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.b.keySet()) {
            if (l(num.intValue())) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    public void i(AbstractC5738jg1.b bVar) {
        C4083dm0 c4083dm0B = bVar.b();
        TC tcA = bVar.a();
        Iterator it = bVar.d().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (c4083dm0B == null || !c4083dm0B.b()) {
                o(iIntValue, tcA, c4083dm0B);
            } else {
                a(iIntValue, c4083dm0B);
            }
        }
        Iterator it2 = bVar.c().iterator();
        while (it2.hasNext()) {
            o(((Integer) it2.next()).intValue(), tcA, bVar.b());
        }
    }

    public void j(AbstractC5738jg1.c cVar) {
        int iB = cVar.b();
        int iA = cVar.a().a();
        C5000h11 c5000h11M = m(iB);
        if (c5000h11M != null) {
            Z01 z01G = c5000h11M.g();
            if (z01G.s()) {
                if (iA != 0) {
                    AbstractC6557mb.d(iA == 1, "Single document existence filter with count: %d", Integer.valueOf(iA));
                    return;
                } else {
                    TC tcL = TC.l(z01G.n());
                    o(iB, tcL, C4083dm0.r(tcL, CU0.C));
                    return;
                }
            }
            int iG = g(iB);
            if (iG != iA) {
                b bVarB = b(cVar, iG);
                b bVar = b.SUCCESS;
                if (bVarB != bVar) {
                    q(iB);
                    this.e.put(Integer.valueOf(iB), bVarB == b.FALSE_POSITIVE ? EnumC7573qC0.EXISTENCE_FILTER_MISMATCH_BLOOM : EnumC7573qC0.EXISTENCE_FILTER_MISMATCH);
                }
                H11.a().b(H11.b.d(bVarB == bVar, iG, cVar.a()));
            }
        }
    }

    public void k(AbstractC5738jg1.d dVar) {
        Iterator it = h(dVar).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            C6405m11 c6405m11E = e(iIntValue);
            int i = a.a[dVar.b().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c6405m11E.h();
                    if (!c6405m11E.e()) {
                        c6405m11E.b();
                    }
                    c6405m11E.k(dVar.c());
                } else if (i == 3) {
                    c6405m11E.h();
                    if (!c6405m11E.e()) {
                        p(iIntValue);
                    }
                    AbstractC6557mb.d(dVar.a() == null, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i != 4) {
                    if (i != 5) {
                        throw AbstractC6557mb.a("Unknown target watch change state: %s", dVar.b());
                    }
                    if (l(iIntValue)) {
                        q(iIntValue);
                        c6405m11E.k(dVar.c());
                    }
                } else if (l(iIntValue)) {
                    c6405m11E.f();
                    c6405m11E.k(dVar.c());
                }
            } else if (l(iIntValue)) {
                c6405m11E.k(dVar.c());
            }
        }
    }

    public final boolean l(int i) {
        return m(i) != null;
    }

    public final C5000h11 m(int i) {
        C6405m11 c6405m11 = (C6405m11) this.b.get(Integer.valueOf(i));
        if (c6405m11 == null || !c6405m11.e()) {
            return this.a.a(i);
        }
        return null;
    }

    public void n(int i) {
        e(i).g();
    }

    public final void o(int i, TC tc, C4083dm0 c4083dm0) {
        if (l(i)) {
            C6405m11 c6405m11E = e(i);
            if (r(i, tc)) {
                c6405m11E.a(tc, C4208eD.a.REMOVED);
            } else {
                c6405m11E.i(tc);
            }
            d(tc).add(Integer.valueOf(i));
            if (c4083dm0 != null) {
                this.c.put(tc, c4083dm0);
            }
        }
    }

    public void p(int i) {
        this.b.remove(Integer.valueOf(i));
    }

    public final void q(int i) {
        AbstractC6557mb.d((this.b.get(Integer.valueOf(i)) == null || ((C6405m11) this.b.get(Integer.valueOf(i))).e()) ? false : true, "Should only reset active targets", new Object[0]);
        this.b.put(Integer.valueOf(i), new C6405m11());
        Iterator it = this.a.b(i).iterator();
        while (it.hasNext()) {
            o(i, (TC) it.next(), null);
        }
    }

    public final boolean r(int i, TC tc) {
        return this.a.b(i).contains(tc);
    }
}
