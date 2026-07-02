package com.daaw;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7181oo0 extends C8017ro0 {
    public final AbstractC9182vx0 b;
    public final C8565tm0 c;
    public final Map d;
    public InterfaceC7002o90 e;
    public C4134dx0 f;
    public boolean g;
    public boolean h;
    public boolean i;

    public C7181oo0(AbstractC9182vx0 abstractC9182vx0) {
        G10.g(abstractC9182vx0, "pointerInputFilter");
        this.b = abstractC9182vx0;
        this.c = new C8565tm0(new C6944nx0[16], 0);
        this.d = new LinkedHashMap();
        this.h = true;
        this.i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01c8  */
    @Override // com.daaw.C8017ro0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.util.Map r34, com.daaw.InterfaceC7002o90 r35, com.daaw.C7241p10 r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7181oo0.a(java.util.Map, com.daaw.o90, com.daaw.p10, boolean):boolean");
    }

    @Override // com.daaw.C8017ro0
    public void b(C7241p10 c7241p10) {
        G10.g(c7241p10, "internalPointerEvent");
        super.b(c7241p10);
        C4134dx0 c4134dx0 = this.f;
        if (c4134dx0 == null) {
            return;
        }
        this.g = this.h;
        List listC = c4134dx0.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            C7223ox0 c7223ox0 = (C7223ox0) listC.get(i);
            if (!c7223ox0.g() && (!c7241p10.d(c7223ox0.e()) || !this.h)) {
                this.c.w(C6944nx0.a(c7223ox0.e()));
            }
        }
        this.h = false;
        this.i = AbstractC5260hx0.i(c4134dx0.e(), AbstractC5260hx0.a.b());
    }

    @Override // com.daaw.C8017ro0
    public void d() {
        C8565tm0 c8565tm0G = g();
        int iR = c8565tm0G.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0G.q();
            int i = 0;
            do {
                ((C7181oo0) objArrQ[i]).d();
                i++;
            } while (i < iR);
        }
        this.b.k0();
    }

    @Override // com.daaw.C8017ro0
    public boolean e(C7241p10 c7241p10) {
        C8565tm0 c8565tm0G;
        int iR;
        G10.g(c7241p10, "internalPointerEvent");
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.d.isEmpty() && this.b.j0()) {
            C4134dx0 c4134dx0 = this.f;
            G10.d(c4134dx0);
            InterfaceC7002o90 interfaceC7002o90 = this.e;
            G10.d(interfaceC7002o90);
            this.b.l0(c4134dx0, EnumC4702fx0.Final, interfaceC7002o90.d());
            if (this.b.j0() && (iR = (c8565tm0G = g()).r()) > 0) {
                Object[] objArrQ = c8565tm0G.q();
                do {
                    ((C7181oo0) objArrQ[i]).e(c7241p10);
                    i++;
                } while (i < iR);
            }
            z = true;
        }
        b(c7241p10);
        i();
        return z;
    }

    @Override // com.daaw.C8017ro0
    public boolean f(Map map, InterfaceC7002o90 interfaceC7002o90, C7241p10 c7241p10, boolean z) {
        C8565tm0 c8565tm0G;
        int iR;
        G10.g(map, "changes");
        G10.g(interfaceC7002o90, "parentCoordinates");
        G10.g(c7241p10, "internalPointerEvent");
        int i = 0;
        if (this.d.isEmpty() || !this.b.j0()) {
            return false;
        }
        C4134dx0 c4134dx0 = this.f;
        G10.d(c4134dx0);
        InterfaceC7002o90 interfaceC7002o902 = this.e;
        G10.d(interfaceC7002o902);
        long jD = interfaceC7002o902.d();
        this.b.l0(c4134dx0, EnumC4702fx0.Initial, jD);
        if (this.b.j0() && (iR = (c8565tm0G = g()).r()) > 0) {
            Object[] objArrQ = c8565tm0G.q();
            do {
                C7181oo0 c7181oo0 = (C7181oo0) objArrQ[i];
                Map map2 = this.d;
                InterfaceC7002o90 interfaceC7002o903 = this.e;
                G10.d(interfaceC7002o903);
                c7181oo0.f(map2, interfaceC7002o903, c7241p10, z);
                i++;
            } while (i < iR);
        }
        if (this.b.j0()) {
            this.b.l0(c4134dx0, EnumC4702fx0.Main, jD);
        }
        return true;
    }

    public final void i() {
        this.d.clear();
        this.e = null;
    }

    public final C8565tm0 j() {
        return this.c;
    }

    public final AbstractC9182vx0 k() {
        return this.b;
    }

    public final boolean l(C4134dx0 c4134dx0, C4134dx0 c4134dx02) {
        if (c4134dx0 == null || c4134dx0.c().size() != c4134dx02.c().size()) {
            return true;
        }
        int size = c4134dx02.c().size();
        for (int i = 0; i < size; i++) {
            if (!C9982yp0.i(((C7223ox0) c4134dx0.c().get(i)).f(), ((C7223ox0) c4134dx02.c().get(i)).f())) {
                return true;
            }
        }
        return false;
    }

    public final void m() {
        this.h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.b + ", children=" + g() + ", pointerIds=" + this.c + ')';
    }
}
