package com.daaw;

import com.daaw.AbstractC5362iK;
import com.daaw.C5890kC0;
import com.daaw.InterfaceC7942rZ;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.mC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6457mC0 {
    public C1768Oc0 a;
    public InterfaceC7942rZ b;
    public boolean c;

    public final SY a(Iterable iterable, C5890kC0 c5890kC0, AbstractC5362iK.a aVar) {
        SY syH = this.a.h(c5890kC0, aVar);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            LC lc = (LC) it.next();
            syH = syH.v(lc.getKey(), lc);
        }
        return syH;
    }

    public final UY b(C5890kC0 c5890kC0, SY sy) {
        UY uy = new UY(Collections.EMPTY_LIST, c5890kC0.c());
        Iterator it = sy.iterator();
        while (it.hasNext()) {
            LC lc = (LC) ((Map.Entry) it.next()).getValue();
            if (c5890kC0.t(lc)) {
                uy = uy.p(lc);
            }
        }
        return uy;
    }

    public final SY c(C5890kC0 c5890kC0) {
        if (AbstractC2212Sd0.c()) {
            AbstractC2212Sd0.a("QueryEngine", "Using full collection scan to execute query: %s", c5890kC0.toString());
        }
        return this.a.h(c5890kC0, AbstractC5362iK.a.B);
    }

    public SY d(C5890kC0 c5890kC0, CU0 cu0, UY uy) {
        AbstractC6557mb.d(this.c, "initialize() not called", new Object[0]);
        SY syG = g(c5890kC0);
        if (syG != null) {
            return syG;
        }
        SY syH = h(c5890kC0, uy, cu0);
        return syH != null ? syH : c(c5890kC0);
    }

    public void e(C1768Oc0 c1768Oc0, InterfaceC7942rZ interfaceC7942rZ) {
        this.a = c1768Oc0;
        this.b = interfaceC7942rZ;
        this.c = true;
    }

    public final boolean f(C5890kC0 c5890kC0, int i, UY uy, CU0 cu0) {
        if (!c5890kC0.o()) {
            return false;
        }
        if (i != uy.size()) {
            return true;
        }
        LC lc = c5890kC0.k() == C5890kC0.a.LIMIT_TO_FIRST ? (LC) uy.e() : (LC) uy.m();
        if (lc == null) {
            return false;
        }
        return lc.f() || lc.k().compareTo(cu0) > 0;
    }

    public final SY g(C5890kC0 c5890kC0) {
        if (c5890kC0.u()) {
            return null;
        }
        Z01 z01Z = c5890kC0.z();
        InterfaceC7942rZ.a aVarA = this.b.a(z01Z);
        if (aVarA.equals(InterfaceC7942rZ.a.NONE)) {
            return null;
        }
        if (c5890kC0.o() && aVarA.equals(InterfaceC7942rZ.a.PARTIAL)) {
            return g(c5890kC0.s(-1L));
        }
        List listG = this.b.g(z01Z);
        AbstractC6557mb.d(listG != null, "index manager must return results for partial and full indexes.", new Object[0]);
        SY syD = this.a.d(listG);
        AbstractC5362iK.a aVarE = this.b.e(z01Z);
        UY uyB = b(c5890kC0, syD);
        return f(c5890kC0, listG.size(), uyB, aVarE.n()) ? g(c5890kC0.s(-1L)) : a(uyB, c5890kC0, aVarE);
    }

    public final SY h(C5890kC0 c5890kC0, UY uy, CU0 cu0) {
        if (c5890kC0.u() || cu0.equals(CU0.C)) {
            return null;
        }
        UY uyB = b(c5890kC0, this.a.d(uy));
        if (f(c5890kC0, uy.size(), uyB, cu0)) {
            return null;
        }
        if (AbstractC2212Sd0.c()) {
            AbstractC2212Sd0.a("QueryEngine", "Re-using previous result from %s to execute query: %s", cu0.toString(), c5890kC0.toString());
        }
        return a(uyB, c5890kC0, AbstractC5362iK.a.h(cu0, -1));
    }
}
