package com.daaw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class F90 {
    public final E90 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public E90 h;
    public final Map i;

    public F90(E90 e90) {
        G10.g(e90, "layoutNode");
        this.a = e90;
        this.b = true;
        this.i = new HashMap();
    }

    public static final void k(F90 f90, I3 i3, int i, K90 k90) {
        float f = i;
        long jA = AbstractC0460Bp0.a(f, f);
        while (true) {
            jA = k90.G1(jA);
            k90 = k90.g1();
            G10.d(k90);
            if (G10.c(k90, f90.a.V())) {
                break;
            } else if (k90.Y0().b().containsKey(i3)) {
                float fR = k90.r(i3);
                jA = AbstractC0460Bp0.a(fR, fR);
            }
        }
        int iB = i3 instanceof C6536mW ? AbstractC8261sh0.b(C9982yp0.m(jA)) : AbstractC8261sh0.b(C9982yp0.l(jA));
        Map map = f90.i;
        if (map.containsKey(i3)) {
            iB = K3.c(i3, ((Number) AbstractC1473Lg0.i(f90.i, i3)).intValue(), iB);
        }
        map.put(i3, Integer.valueOf(iB));
    }

    public final boolean a() {
        return this.b;
    }

    public final Map b() {
        return this.i;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        l();
        return this.h != null;
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.f;
    }

    public final boolean h() {
        return this.d;
    }

    public final boolean i() {
        return this.c;
    }

    public final void j() {
        this.i.clear();
        C8565tm0 c8565tm0R0 = this.a.r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i = 0;
            do {
                E90 e90 = (E90) objArrQ[i];
                if (e90.g()) {
                    if (e90.N().b) {
                        e90.D0();
                    }
                    for (Map.Entry entry : e90.N().i.entrySet()) {
                        k(this, (I3) entry.getKey(), ((Number) entry.getValue()).intValue(), e90.V());
                    }
                    K90 k90G1 = e90.V().g1();
                    G10.d(k90G1);
                    while (!G10.c(k90G1, this.a.V())) {
                        for (I3 i3 : k90G1.Y0().b().keySet()) {
                            k(this, i3, k90G1.r(i3), k90G1);
                        }
                        k90G1 = k90G1.g1();
                        G10.d(k90G1);
                    }
                }
                i++;
            } while (i < iR);
        }
        this.i.putAll(this.a.V().Y0().b());
        this.b = false;
    }

    public final void l() {
        E90 e90;
        F90 f90N;
        F90 f90N2;
        if (d()) {
            e90 = this.a;
        } else {
            E90 e90L0 = this.a.l0();
            if (e90L0 == null) {
                return;
            }
            e90 = e90L0.N().h;
            if (e90 == null || !e90.N().d()) {
                E90 e902 = this.h;
                if (e902 == null || e902.N().d()) {
                    return;
                }
                E90 e90L02 = e902.l0();
                if (e90L02 != null && (f90N2 = e90L02.N()) != null) {
                    f90N2.l();
                }
                E90 e90L03 = e902.l0();
                e90 = (e90L03 == null || (f90N = e90L03.N()) == null) ? null : f90N.h;
            }
        }
        this.h = e90;
    }

    public final void m() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.h = null;
    }

    public final void n(boolean z) {
        this.b = z;
    }

    public final void o(boolean z) {
        this.e = z;
    }

    public final void p(boolean z) {
        this.g = z;
    }

    public final void q(boolean z) {
        this.f = z;
    }

    public final void r(boolean z) {
        this.d = z;
    }

    public final void s(boolean z) {
        this.c = z;
    }
}
