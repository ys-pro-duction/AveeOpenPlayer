package com.daaw;

import android.graphics.Rect;
import android.graphics.Region;
import com.daaw.C7260p5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7539q5 {

    /* JADX INFO: renamed from: com.daaw.q5$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(com.daaw.E90 r3) {
            /*
                r2 = this;
                java.lang.String r0 = "it"
                com.daaw.G10.g(r3, r0)
                com.daaw.pP0 r3 = com.daaw.AbstractC8740uP0.j(r3)
                if (r3 == 0) goto L10
                com.daaw.nP0 r3 = r3.j()
                goto L11
            L10:
                r3 = 0
            L11:
                if (r3 == 0) goto L27
                boolean r0 = r3.E()
                r1 = 1
                if (r0 != r1) goto L27
                com.daaw.mP0 r0 = com.daaw.C6509mP0.a
                com.daaw.BP0 r0 = r0.o()
                boolean r3 = r3.p(r0)
                if (r3 == 0) goto L27
                goto L28
            L27:
                r1 = 0
            L28:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7539q5.a.invoke(com.daaw.E90):java.lang.Boolean");
        }
    }

    public static final boolean j(C4998h1 c4998h1, Object obj) {
        if (c4998h1 == obj) {
            return true;
        }
        if (!(obj instanceof C4998h1)) {
            return false;
        }
        C4998h1 c4998h12 = (C4998h1) obj;
        if (!G10.c(c4998h1.b(), c4998h12.b())) {
            return false;
        }
        if (c4998h1.a() != null || c4998h12.a() == null) {
            return c4998h1.a() == null || c4998h12.a() != null;
        }
        return false;
    }

    public static final boolean k(C8461tP0 c8461tP0) {
        return AbstractC7067oP0.a(c8461tP0.h(), C9584xP0.a.d()) == null;
    }

    public static final boolean l(C8461tP0 c8461tP0) {
        C6788nP0 c6788nP0J;
        if (t(c8461tP0) && !G10.c(AbstractC7067oP0.a(c8461tP0.s(), C9584xP0.a.g()), Boolean.TRUE)) {
            return true;
        }
        E90 e90N = n(c8461tP0.k(), a.B);
        if (e90N != null) {
            C7346pP0 c7346pP0J = AbstractC8740uP0.j(e90N);
            if (!((c7346pP0J == null || (c6788nP0J = c7346pP0J.j()) == null) ? false : G10.c(AbstractC7067oP0.a(c6788nP0J, C9584xP0.a.g()), Boolean.TRUE))) {
                return true;
            }
        }
        return false;
    }

    public static final ZN0 m(List list, int i) {
        G10.g(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ZN0) list.get(i2)).d() == i) {
                return (ZN0) list.get(i2);
            }
        }
        return null;
    }

    public static final E90 n(E90 e90, NQ nq) {
        for (E90 e90L0 = e90.l0(); e90L0 != null; e90L0 = e90L0.l0()) {
            if (((Boolean) nq.invoke(e90L0)).booleanValue()) {
                return e90L0;
            }
        }
        return null;
    }

    public static final Map o(C9305wP0 c9305wP0) {
        G10.g(c9305wP0, "<this>");
        C8461tP0 c8461tP0A = c9305wP0.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c8461tP0A.k().g() && c8461tP0A.k().C0()) {
            Region region = new Region();
            region.set(AbstractC3660cF0.a(c8461tP0A.f()));
            p(region, c8461tP0A, linkedHashMap, c8461tP0A);
        }
        return linkedHashMap;
    }

    public static final void p(Region region, C8461tP0 c8461tP0, Map map, C8461tP0 c8461tP02) {
        InterfaceC9519x90 interfaceC9519x90J;
        boolean z = (c8461tP02.k().g() && c8461tP02.k().C0()) ? false : true;
        if (!region.isEmpty() || c8461tP02.i() == c8461tP0.i()) {
            if (!z || c8461tP02.t()) {
                Rect rectA = AbstractC3660cF0.a(c8461tP02.r());
                Region region2 = new Region();
                region2.set(rectA);
                int i = c8461tP02.i() == c8461tP0.i() ? -1 : c8461tP02.i();
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer numValueOf = Integer.valueOf(i);
                    Rect bounds = region2.getBounds();
                    G10.f(bounds, "region.bounds");
                    map.put(numValueOf, new C9026vP0(c8461tP02, bounds));
                    List listO = c8461tP02.o();
                    for (int size = listO.size() - 1; -1 < size; size--) {
                        p(region, c8461tP0, map, (C8461tP0) listO.get(size));
                    }
                    region.op(rectA, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (c8461tP02.t()) {
                    C8461tP0 c8461tP0M = c8461tP02.m();
                    map.put(Integer.valueOf(i), new C9026vP0(c8461tP02, AbstractC3660cF0.a((c8461tP0M == null || (interfaceC9519x90J = c8461tP0M.j()) == null || !interfaceC9519x90J.g()) ? new C3103aF0(0.0f, 0.0f, 10.0f, 10.0f) : c8461tP0M.f())));
                } else if (i == -1) {
                    Integer numValueOf2 = Integer.valueOf(i);
                    Rect bounds2 = region2.getBounds();
                    G10.f(bounds2, "region.bounds");
                    map.put(numValueOf2, new C9026vP0(c8461tP02, bounds2));
                }
            }
        }
    }

    public static final boolean q(C8461tP0 c8461tP0) {
        return c8461tP0.h().p(C9584xP0.a.n());
    }

    public static final boolean r(C8461tP0 c8461tP0) {
        return c8461tP0.h().p(C9584xP0.a.o());
    }

    public static final boolean s(C8461tP0 c8461tP0) {
        return c8461tP0.j().getLayoutDirection() == EnumC7560q90.Rtl;
    }

    public static final boolean t(C8461tP0 c8461tP0) {
        return c8461tP0.s().p(C6509mP0.a.o());
    }

    public static final boolean u(C8461tP0 c8461tP0, C7260p5.g gVar) {
        Iterator it = gVar.b().iterator();
        while (it.hasNext()) {
            if (!c8461tP0.h().p((BP0) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }
}
