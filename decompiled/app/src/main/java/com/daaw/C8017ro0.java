package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.ro0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8017ro0 {
    public final C8565tm0 a = new C8565tm0(new C7181oo0[16], 0);

    public boolean a(Map map, InterfaceC7002o90 interfaceC7002o90, C7241p10 c7241p10, boolean z) {
        G10.g(map, "changes");
        G10.g(interfaceC7002o90, "parentCoordinates");
        G10.g(c7241p10, "internalPointerEvent");
        C8565tm0 c8565tm0 = this.a;
        int iR = c8565tm0.r();
        if (iR <= 0) {
            return false;
        }
        Object[] objArrQ = c8565tm0.q();
        int i = 0;
        boolean z2 = false;
        do {
            z2 = ((C7181oo0) objArrQ[i]).a(map, interfaceC7002o90, c7241p10, z) || z2;
            i++;
        } while (i < iR);
        return z2;
    }

    public void b(C7241p10 c7241p10) {
        G10.g(c7241p10, "internalPointerEvent");
        int iR = this.a.r();
        while (true) {
            iR--;
            if (-1 >= iR) {
                return;
            }
            if (((C7181oo0) this.a.q()[iR]).j().t()) {
                this.a.z(iR);
            }
        }
    }

    public final void c() {
        this.a.k();
    }

    public void d() {
        C8565tm0 c8565tm0 = this.a;
        int iR = c8565tm0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i = 0;
            do {
                ((C7181oo0) objArrQ[i]).d();
                i++;
            } while (i < iR);
        }
    }

    public boolean e(C7241p10 c7241p10) {
        G10.g(c7241p10, "internalPointerEvent");
        C8565tm0 c8565tm0 = this.a;
        int iR = c8565tm0.r();
        boolean z = false;
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i = 0;
            boolean z2 = false;
            do {
                z2 = ((C7181oo0) objArrQ[i]).e(c7241p10) || z2;
                i++;
            } while (i < iR);
            z = z2;
        }
        b(c7241p10);
        return z;
    }

    public boolean f(Map map, InterfaceC7002o90 interfaceC7002o90, C7241p10 c7241p10, boolean z) {
        G10.g(map, "changes");
        G10.g(interfaceC7002o90, "parentCoordinates");
        G10.g(c7241p10, "internalPointerEvent");
        C8565tm0 c8565tm0 = this.a;
        int iR = c8565tm0.r();
        if (iR <= 0) {
            return false;
        }
        Object[] objArrQ = c8565tm0.q();
        int i = 0;
        boolean z2 = false;
        do {
            z2 = ((C7181oo0) objArrQ[i]).f(map, interfaceC7002o90, c7241p10, z) || z2;
            i++;
        } while (i < iR);
        return z2;
    }

    public final C8565tm0 g() {
        return this.a;
    }

    public final void h() {
        int i = 0;
        while (i < this.a.r()) {
            C7181oo0 c7181oo0 = (C7181oo0) this.a.q()[i];
            if (c7181oo0.k().j0()) {
                i++;
                c7181oo0.h();
            } else {
                this.a.z(i);
                c7181oo0.d();
            }
        }
    }
}
