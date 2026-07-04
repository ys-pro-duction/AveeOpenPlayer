package com.daaw;

import com.daaw.AbstractC8869ur0;

/* JADX INFO: renamed from: com.daaw.vr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9155vr0 {
    public static final void b(OD od, AbstractC8869ur0 abstractC8869ur0, AbstractC2117Rg abstractC2117Rg, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(od, "$this$drawOutline");
        G10.g(abstractC8869ur0, "outline");
        G10.g(abstractC2117Rg, "brush");
        G10.g(pd, "style");
        if (abstractC8869ur0 instanceof AbstractC8869ur0.a) {
            C3103aF0 c3103aF0A = ((AbstractC8869ur0.a) abstractC8869ur0).a();
            od.a0(abstractC2117Rg, i(c3103aF0A), g(c3103aF0A), f, pd, c2871Ym, i);
        } else {
            if (!(abstractC8869ur0 instanceof AbstractC8869ur0.b)) {
                throw new C6902no0();
            }
            AbstractC8869ur0.b bVar = (AbstractC8869ur0.b) abstractC8869ur0;
            InterfaceC6090kt0 interfaceC6090kt0B = bVar.b();
            if (interfaceC6090kt0B != null) {
                od.N(interfaceC6090kt0B, abstractC2117Rg, f, pd, c2871Ym, i);
                return;
            }
            C3680cK0 c3680cK0A = bVar.a();
            od.D(abstractC2117Rg, j(c3680cK0A), h(c3680cK0A), AbstractC2895Ys.b(AbstractC2791Xs.d(c3680cK0A.b()), 0.0f, 2, null), f, pd, c2871Ym, i);
        }
    }

    public static /* synthetic */ void c(OD od, AbstractC8869ur0 abstractC8869ur0, AbstractC2117Rg abstractC2117Rg, float f, PD pd, C2871Ym c2871Ym, int i, int i2, Object obj) {
        float f2 = (i2 & 4) != 0 ? 1.0f : f;
        if ((i2 & 8) != 0) {
            pd = WK.a;
        }
        PD pd2 = pd;
        if ((i2 & 16) != 0) {
            c2871Ym = null;
        }
        C2871Ym c2871Ym2 = c2871Ym;
        if ((i2 & 32) != 0) {
            i = OD.g.a();
        }
        b(od, abstractC8869ur0, abstractC2117Rg, f2, pd2, c2871Ym2, i);
    }

    public static final void d(OD od, AbstractC8869ur0 abstractC8869ur0, long j, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(od, "$this$drawOutline");
        G10.g(abstractC8869ur0, "outline");
        G10.g(pd, "style");
        if (abstractC8869ur0 instanceof AbstractC8869ur0.a) {
            C3103aF0 c3103aF0A = ((AbstractC8869ur0.a) abstractC8869ur0).a();
            od.B(j, i(c3103aF0A), g(c3103aF0A), f, pd, c2871Ym, i);
        } else {
            if (!(abstractC8869ur0 instanceof AbstractC8869ur0.b)) {
                throw new C6902no0();
            }
            AbstractC8869ur0.b bVar = (AbstractC8869ur0.b) abstractC8869ur0;
            InterfaceC6090kt0 interfaceC6090kt0B = bVar.b();
            if (interfaceC6090kt0B != null) {
                od.E(interfaceC6090kt0B, j, f, pd, c2871Ym, i);
                return;
            }
            C3680cK0 c3680cK0A = bVar.a();
            od.u(j, j(c3680cK0A), h(c3680cK0A), AbstractC2895Ys.b(AbstractC2791Xs.d(c3680cK0A.b()), 0.0f, 2, null), pd, f, c2871Ym, i);
        }
    }

    public static /* synthetic */ void e(OD od, AbstractC8869ur0 abstractC8869ur0, long j, float f, PD pd, C2871Ym c2871Ym, int i, int i2, Object obj) {
        float f2 = (i2 & 4) != 0 ? 1.0f : f;
        if ((i2 & 8) != 0) {
            pd = WK.a;
        }
        PD pd2 = pd;
        if ((i2 & 16) != 0) {
            c2871Ym = null;
        }
        d(od, abstractC8869ur0, j, f2, pd2, c2871Ym, (i2 & 32) != 0 ? OD.g.a() : i);
    }

    public static final boolean f(C3680cK0 c3680cK0) {
        return ((AbstractC2791Xs.d(c3680cK0.b()) > AbstractC2791Xs.d(c3680cK0.c()) ? 1 : (AbstractC2791Xs.d(c3680cK0.b()) == AbstractC2791Xs.d(c3680cK0.c()) ? 0 : -1)) == 0 && (AbstractC2791Xs.d(c3680cK0.c()) > AbstractC2791Xs.d(c3680cK0.i()) ? 1 : (AbstractC2791Xs.d(c3680cK0.c()) == AbstractC2791Xs.d(c3680cK0.i()) ? 0 : -1)) == 0 && (AbstractC2791Xs.d(c3680cK0.i()) > AbstractC2791Xs.d(c3680cK0.h()) ? 1 : (AbstractC2791Xs.d(c3680cK0.i()) == AbstractC2791Xs.d(c3680cK0.h()) ? 0 : -1)) == 0) && ((AbstractC2791Xs.e(c3680cK0.b()) > AbstractC2791Xs.e(c3680cK0.c()) ? 1 : (AbstractC2791Xs.e(c3680cK0.b()) == AbstractC2791Xs.e(c3680cK0.c()) ? 0 : -1)) == 0 && (AbstractC2791Xs.e(c3680cK0.c()) > AbstractC2791Xs.e(c3680cK0.i()) ? 1 : (AbstractC2791Xs.e(c3680cK0.c()) == AbstractC2791Xs.e(c3680cK0.i()) ? 0 : -1)) == 0 && (AbstractC2791Xs.e(c3680cK0.i()) > AbstractC2791Xs.e(c3680cK0.h()) ? 1 : (AbstractC2791Xs.e(c3680cK0.i()) == AbstractC2791Xs.e(c3680cK0.h()) ? 0 : -1)) == 0);
    }

    public static final long g(C3103aF0 c3103aF0) {
        return BT0.a(c3103aF0.j(), c3103aF0.e());
    }

    public static final long h(C3680cK0 c3680cK0) {
        return BT0.a(c3680cK0.j(), c3680cK0.d());
    }

    public static final long i(C3103aF0 c3103aF0) {
        return AbstractC0460Bp0.a(c3103aF0.f(), c3103aF0.i());
    }

    public static final long j(C3680cK0 c3680cK0) {
        return AbstractC0460Bp0.a(c3680cK0.e(), c3680cK0.g());
    }
}
