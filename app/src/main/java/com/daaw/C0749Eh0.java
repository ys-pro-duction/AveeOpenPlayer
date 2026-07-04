package com.daaw;

import com.daaw.E90;
import com.daaw.InterfaceC1413Kr0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Eh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0749Eh0 {
    public final E90 a;
    public final C9747xz b;
    public boolean c;
    public final C9708xq0 d;
    public final C8565tm0 e;
    public long f;
    public final List g;
    public C6079kr h;
    public final M90 i;

    /* JADX INFO: renamed from: com.daaw.Eh0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[E90.g.values().length];
            iArr[E90.g.Measuring.ordinal()] = 1;
            iArr[E90.g.LayingOut.ordinal()] = 2;
            iArr[E90.g.Idle.ordinal()] = 3;
            a = iArr;
        }
    }

    public C0749Eh0(E90 e90) {
        G10.g(e90, "root");
        this.a = e90;
        InterfaceC1413Kr0.a aVar = InterfaceC1413Kr0.p;
        C9747xz c9747xz = new C9747xz(aVar.a());
        this.b = c9747xz;
        this.d = new C9708xq0();
        this.e = new C8565tm0(new InterfaceC1413Kr0.b[16], 0);
        this.f = 1L;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.i = aVar.a() ? new M90(e90, c9747xz, arrayList) : null;
    }

    public static /* synthetic */ void e(C0749Eh0 c0749Eh0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c0749Eh0.d(z);
    }

    public static /* synthetic */ boolean p(C0749Eh0 c0749Eh0, E90 e90, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c0749Eh0.o(e90, z);
    }

    public static /* synthetic */ boolean r(C0749Eh0 c0749Eh0, E90 e90, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c0749Eh0.q(e90, z);
    }

    public final void c() {
        C8565tm0 c8565tm0 = this.e;
        int iR = c8565tm0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i = 0;
            do {
                ((InterfaceC1413Kr0.b) objArrQ[i]).b();
                i++;
            } while (i < iR);
        }
        this.e.k();
    }

    public final void d(boolean z) {
        if (z) {
            this.d.d(this.a);
        }
        this.d.a();
    }

    public final boolean f(E90 e90, C6079kr c6079kr) {
        boolean zT0 = c6079kr != null ? e90.T0(c6079kr) : E90.U0(e90, null, 1, null);
        E90 e90L0 = e90.l0();
        if (zT0 && e90L0 != null) {
            if (e90.d0() == E90.i.InMeasureBlock) {
                r(this, e90L0, false, 2, null);
                return zT0;
            }
            if (e90.d0() == E90.i.InLayoutBlock) {
                p(this, e90L0, false, 2, null);
            }
        }
        return zT0;
    }

    public final void g(E90 e90) {
        G10.g(e90, "layoutNode");
        if (this.b.d()) {
            return;
        }
        if (!this.c) {
            throw new IllegalStateException("Check failed.");
        }
        if (e90.a0()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C8565tm0 c8565tm0R0 = e90.r0();
        int iR = c8565tm0R0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0R0.q();
            int i = 0;
            do {
                E90 e902 = (E90) objArrQ[i];
                if (e902.a0() && this.b.f(e902)) {
                    n(e902);
                }
                if (!e902.a0()) {
                    g(e902);
                }
                i++;
            } while (i < iR);
        }
        if (e90.a0() && this.b.f(e90)) {
            n(e90);
        }
    }

    public final boolean h(E90 e90) {
        if (e90.a0()) {
            return e90.d0() == E90.i.InMeasureBlock || e90.N().e();
        }
        return false;
    }

    public final boolean i() {
        return !this.b.d();
    }

    public final long j() {
        if (this.c) {
            return this.f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
    }

    public final boolean k(LQ lq) {
        boolean z;
        if (!this.a.C0()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.a.g()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        boolean z2 = false;
        if (this.h != null) {
            this.c = true;
            try {
                if (this.b.d()) {
                    z = false;
                } else {
                    C9747xz c9747xz = this.b;
                    z = false;
                    while (!c9747xz.d()) {
                        E90 e90E = c9747xz.e();
                        boolean zN = n(e90E);
                        if (e90E == this.a && zN) {
                            z = true;
                        }
                    }
                    if (lq != null) {
                        lq.invoke();
                    }
                }
                this.c = false;
                M90 m90 = this.i;
                if (m90 != null) {
                    m90.a();
                }
                z2 = z;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
        c();
        return z2;
    }

    public final void l(E90 e90) {
        G10.g(e90, "node");
        this.b.f(e90);
    }

    public final void m(InterfaceC1413Kr0.b bVar) {
        G10.g(bVar, "listener");
        this.e.d(bVar);
    }

    public final boolean n(E90 e90) {
        boolean zF;
        C6079kr c6079kr;
        if (!e90.g() && !h(e90) && !e90.N().e()) {
            return false;
        }
        if (e90.a0()) {
            if (e90 == this.a) {
                c6079kr = this.h;
                G10.d(c6079kr);
            } else {
                c6079kr = null;
            }
            zF = f(e90, c6079kr);
        } else {
            zF = false;
        }
        if (e90.X() && e90.g()) {
            if (e90 == this.a) {
                e90.R0(0, 0);
            } else {
                e90.X0();
            }
            this.d.c(e90);
            M90 m90 = this.i;
            if (m90 != null) {
                m90.a();
            }
        }
        if (!this.g.isEmpty()) {
            List list = this.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                E90 e902 = (E90) list.get(i);
                if (e902.C0()) {
                    r(this, e902, false, 2, null);
                }
            }
            this.g.clear();
        }
        return zF;
    }

    public final boolean o(E90 e90, boolean z) {
        E90 e90L0;
        G10.g(e90, "layoutNode");
        int i = a.a[e90.Y().ordinal()];
        if (i == 1 || i == 2) {
            M90 m90 = this.i;
            if (m90 != null) {
                m90.a();
            }
            return false;
        }
        if (i != 3) {
            throw new C6902no0();
        }
        if ((e90.a0() || e90.X()) && !z) {
            M90 m902 = this.i;
            if (m902 != null) {
                m902.a();
            }
            return false;
        }
        e90.E0();
        if (e90.g() && (((e90L0 = e90.l0()) == null || !e90L0.X()) && (e90L0 == null || !e90L0.a0()))) {
            this.b.a(e90);
        }
        return !this.c;
    }

    public final boolean q(E90 e90, boolean z) {
        E90 e90L0;
        G10.g(e90, "layoutNode");
        int i = a.a[e90.Y().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C6902no0();
                }
                if (e90.a0() && !z) {
                    return false;
                }
                e90.F0();
                if ((e90.g() || h(e90)) && ((e90L0 = e90.l0()) == null || !e90L0.a0())) {
                    this.b.a(e90);
                }
                return !this.c;
            }
            this.g.add(e90);
            M90 m90 = this.i;
            if (m90 != null) {
                m90.a();
            }
        }
        return false;
    }

    public final void s(long j) {
        C6079kr c6079kr = this.h;
        if (c6079kr == null ? false : C6079kr.g(c6079kr.s(), j)) {
            return;
        }
        if (this.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.h = C6079kr.b(j);
        this.a.F0();
        this.b.a(this.a);
    }
}
