package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.uP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8740uP0 {
    public static final int e(C8461tP0 c8461tP0) {
        return c8461tP0.i() + 2000000000;
    }

    public static final E90 f(E90 e90, NQ nq) {
        for (E90 e90L0 = e90.l0(); e90L0 != null; e90L0 = e90L0.l0()) {
            if (((Boolean) nq.invoke(e90L0)).booleanValue()) {
                return e90L0;
            }
        }
        return null;
    }

    public static final List g(E90 e90, List list) {
        C8565tm0 c8565tm0Q0 = e90.q0();
        int iR = c8565tm0Q0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0Q0.q();
            int i = 0;
            do {
                E90 e902 = (E90) objArrQ[i];
                C7346pP0 c7346pP0J = j(e902);
                if (c7346pP0J != null) {
                    list.add(c7346pP0J);
                } else {
                    g(e902, list);
                }
                i++;
            } while (i < iR);
        }
        return list;
    }

    public static /* synthetic */ List h(E90 e90, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return g(e90, list);
    }

    public static final C7346pP0 i(E90 e90) {
        C7346pP0 c7346pP0;
        G10.g(e90, "<this>");
        K90 k90J0 = e90.j0();
        while (k90J0 != null && !XG.m(k90J0.S0(), XG.a.f())) {
            k90J0 = k90J0.f1();
        }
        if (k90J0 != null && (c7346pP0 = (C7346pP0) XG.n(k90J0.S0(), XG.a.f())) != null) {
            K90 k90B = c7346pP0.b();
            while (k90B != null) {
                while (c7346pP0 != null) {
                    if (((InterfaceC7625qP0) c7346pP0.c()).M().E()) {
                        return c7346pP0;
                    }
                    c7346pP0 = (C7346pP0) c7346pP0.d();
                }
                k90B = k90B.f1();
                c7346pP0 = k90B != null ? (C7346pP0) XG.n(k90B.S0(), XG.a.f()) : null;
            }
        }
        return null;
    }

    public static final C7346pP0 j(E90 e90) {
        C7346pP0 c7346pP0;
        G10.g(e90, "<this>");
        K90 k90J0 = e90.j0();
        while (k90J0 != null && !XG.m(k90J0.S0(), XG.a.f())) {
            k90J0 = k90J0.f1();
        }
        if (k90J0 != null && (c7346pP0 = (C7346pP0) XG.n(k90J0.S0(), XG.a.f())) != null) {
            K90 k90B = c7346pP0.b();
            while (k90B != null) {
                if (c7346pP0 != null) {
                    return c7346pP0;
                }
                k90B = k90B.f1();
                c7346pP0 = k90B != null ? (C7346pP0) XG.n(k90B.S0(), XG.a.f()) : null;
            }
        }
        return null;
    }

    public static final OJ0 k(C8461tP0 c8461tP0) {
        return (OJ0) AbstractC7067oP0.a(c8461tP0.s(), C9584xP0.a.q());
    }

    public static final int l(C8461tP0 c8461tP0) {
        return c8461tP0.i() + 1000000000;
    }
}
