package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Sl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2244Sl0 {
    public final C2348Tl0 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final List g;
    public final List h;

    public /* synthetic */ C2244Sl0(C2348Tl0 c2348Tl0, long j, int i, boolean z, AbstractC2911Yw abstractC2911Yw) {
        this(c2348Tl0, j, i, z);
    }

    public final D7 a() {
        return this.a.e();
    }

    public final C3103aF0 b(int i) {
        u(i);
        C0897Fs0 c0897Fs0 = (C0897Fs0) this.h.get(AbstractC2556Vl0.a(this.h, i));
        return c0897Fs0.i(c0897Fs0.e().g(c0897Fs0.n(i)));
    }

    public final boolean c() {
        return this.c;
    }

    public final float d() {
        if (this.h.isEmpty()) {
            return 0.0f;
        }
        return ((C0897Fs0) this.h.get(0)).e().e();
    }

    public final float e() {
        return this.e;
    }

    public final C2348Tl0 f() {
        return this.a;
    }

    public final float g() {
        if (this.h.isEmpty()) {
            return 0.0f;
        }
        C0897Fs0 c0897Fs0 = (C0897Fs0) AbstractC2455Um.p0(this.h);
        return c0897Fs0.l(c0897Fs0.e().c());
    }

    public final int h() {
        return this.f;
    }

    public final int i(int i, boolean z) {
        w(i);
        C0897Fs0 c0897Fs0 = (C0897Fs0) this.h.get(AbstractC2556Vl0.b(this.h, i));
        return c0897Fs0.j(c0897Fs0.e().j(c0897Fs0.o(i), z));
    }

    public final int j(int i) {
        v(i);
        C0897Fs0 c0897Fs0 = (C0897Fs0) this.h.get(i == a().length() ? AbstractC1599Mm.m(this.h) : AbstractC2556Vl0.a(this.h, i));
        return c0897Fs0.k(c0897Fs0.e().d(c0897Fs0.n(i)));
    }

    public final int k(float f) {
        C0897Fs0 c0897Fs0 = (C0897Fs0) this.h.get(f <= 0.0f ? 0 : f >= this.e ? AbstractC1599Mm.m(this.h) : AbstractC2556Vl0.c(this.h, f));
        return c0897Fs0.d() == 0 ? Math.max(0, c0897Fs0.f() - 1) : c0897Fs0.k(c0897Fs0.e().m(c0897Fs0.p(f)));
    }

    public final int l(int i) {
        w(i);
        C0897Fs0 c0897Fs0 = (C0897Fs0) this.h.get(AbstractC2556Vl0.b(this.h, i));
        return c0897Fs0.j(c0897Fs0.e().i(c0897Fs0.o(i)));
    }

    public final float m(int i) {
        w(i);
        C0897Fs0 c0897Fs0 = (C0897Fs0) this.h.get(AbstractC2556Vl0.b(this.h, i));
        return c0897Fs0.l(c0897Fs0.e().b(c0897Fs0.o(i)));
    }

    public final int n(long j) {
        C0897Fs0 c0897Fs0 = (C0897Fs0) this.h.get(C9982yp0.m(j) <= 0.0f ? 0 : C9982yp0.m(j) >= this.e ? AbstractC1599Mm.m(this.h) : AbstractC2556Vl0.c(this.h, C9982yp0.m(j)));
        return c0897Fs0.d() == 0 ? Math.max(0, c0897Fs0.f() - 1) : c0897Fs0.j(c0897Fs0.e().f(c0897Fs0.m(j)));
    }

    public final II0 o(int i) {
        v(i);
        C0897Fs0 c0897Fs0 = (C0897Fs0) this.h.get(i == a().length() ? AbstractC1599Mm.m(this.h) : AbstractC2556Vl0.a(this.h, i));
        return c0897Fs0.e().a(c0897Fs0.n(i));
    }

    public final List p() {
        return this.h;
    }

    public final List q() {
        return this.g;
    }

    public final float r() {
        return this.d;
    }

    public final void s(InterfaceC6318lj interfaceC6318lj, AbstractC2117Rg abstractC2117Rg, C4265eR0 c4265eR0, P11 p11) {
        G10.g(interfaceC6318lj, "canvas");
        G10.g(abstractC2117Rg, "brush");
        AbstractC3341b6.a(this, interfaceC6318lj, abstractC2117Rg, c4265eR0, p11);
    }

    public final void t(InterfaceC6318lj interfaceC6318lj, long j, C4265eR0 c4265eR0, P11 p11) {
        G10.g(interfaceC6318lj, "canvas");
        interfaceC6318lj.i();
        List list = this.h;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C0897Fs0 c0897Fs0 = (C0897Fs0) list.get(i);
            InterfaceC6318lj interfaceC6318lj2 = interfaceC6318lj;
            long j2 = j;
            c0897Fs0.e().n(interfaceC6318lj2, j2, c4265eR0, p11);
            interfaceC6318lj2.c(0.0f, c0897Fs0.e().getHeight());
            i++;
            interfaceC6318lj = interfaceC6318lj2;
            j = j2;
        }
        interfaceC6318lj.o();
    }

    public final void u(int i) {
        if (i < 0 || i >= a().g().length()) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + a().length() + ')').toString());
        }
    }

    public final void v(int i) {
        if (i < 0 || i > a().g().length()) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + a().length() + ']').toString());
        }
    }

    public final void w(int i) {
        if (i < 0 || i >= this.f) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i + ')').toString());
        }
    }

    public C2244Sl0(C2348Tl0 c2348Tl0, long j, int i, boolean z) {
        boolean z2;
        this.a = c2348Tl0;
        this.b = i;
        if (C6079kr.p(j) != 0 || C6079kr.o(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List listF = c2348Tl0.f();
        int size = listF.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        while (i2 < size) {
            C1001Gs0 c1001Gs0 = (C1001Gs0) listF.get(i2);
            InterfaceC0793Es0 interfaceC0793Es0A = AbstractC1313Js0.a(c1001Gs0.b(), AbstractC6916nr.b(0, C6079kr.n(j), 0, C6079kr.i(j) ? AbstractC8417tE0.d(C6079kr.m(j) - AbstractC1313Js0.b(f), 0) : C6079kr.m(j), 5, null), this.b - i3, z);
            float height = f + interfaceC0793Es0A.getHeight();
            int iK = i3 + interfaceC0793Es0A.k();
            arrayList.add(new C0897Fs0(interfaceC0793Es0A, c1001Gs0.c(), c1001Gs0.a(), i3, iK, f, height));
            if (interfaceC0793Es0A.l() || (iK == this.b && i2 != AbstractC1599Mm.m(this.a.f()))) {
                z2 = true;
                i3 = iK;
                f = height;
                break;
            } else {
                i2++;
                i3 = iK;
                f = height;
            }
        }
        z2 = false;
        this.e = f;
        this.f = i3;
        this.c = z2;
        this.h = arrayList;
        this.d = C6079kr.n(j);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C0897Fs0 c0897Fs0 = (C0897Fs0) arrayList.get(i4);
            List listH = c0897Fs0.e().h();
            ArrayList arrayList3 = new ArrayList(listH.size());
            int size3 = listH.size();
            for (int i5 = 0; i5 < size3; i5++) {
                C3103aF0 c3103aF0 = (C3103aF0) listH.get(i5);
                arrayList3.add(c3103aF0 != null ? c0897Fs0.i(c3103aF0) : null);
            }
            AbstractC2141Rm.A(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.g().size()) {
            int size4 = this.a.g().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i6 = 0; i6 < size4; i6++) {
                arrayList4.add(null);
            }
            arrayList2 = AbstractC2455Um.z0(arrayList2, arrayList4);
        }
        this.g = arrayList2;
    }
}
