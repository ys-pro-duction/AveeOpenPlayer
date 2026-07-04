package com.daaw;

import android.graphics.Outline;
import android.os.Build;
import com.daaw.AbstractC8869ur0;
import com.daaw.C9879yT0;

/* JADX INFO: renamed from: com.daaw.wr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9434wr0 {
    public InterfaceC4988gz a;
    public boolean b;
    public final Outline c;
    public long d;
    public InterfaceC5391iR0 e;
    public InterfaceC6090kt0 f;
    public InterfaceC6090kt0 g;
    public boolean h;
    public boolean i;
    public InterfaceC6090kt0 j;
    public C3680cK0 k;
    public float l;
    public long m;
    public long n;
    public boolean o;
    public EnumC7560q90 p;
    public InterfaceC6090kt0 q;
    public InterfaceC6090kt0 r;
    public AbstractC8869ur0 s;

    public C9434wr0(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "density");
        this.a = interfaceC4988gz;
        this.b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        C9879yT0.a aVar = C9879yT0.b;
        this.d = aVar.b();
        this.e = AbstractC4785gF0.a();
        this.m = C9982yp0.b.c();
        this.n = aVar.b();
        this.p = EnumC7560q90.Ltr;
    }

    public final void a(InterfaceC6318lj interfaceC6318lj) {
        C9434wr0 c9434wr0;
        G10.g(interfaceC6318lj, "canvas");
        InterfaceC6090kt0 interfaceC6090kt0B = b();
        if (interfaceC6090kt0B != null) {
            AbstractC6030kj.c(interfaceC6318lj, interfaceC6090kt0B, 0, 2, null);
            return;
        }
        float f = this.l;
        if (f <= 0.0f) {
            AbstractC6030kj.d(interfaceC6318lj, C9982yp0.l(this.m), C9982yp0.m(this.m), C9879yT0.i(this.n) + C9982yp0.l(this.m), C9879yT0.g(this.n) + C9982yp0.m(this.m), 0, 16, null);
            return;
        }
        InterfaceC6090kt0 interfaceC6090kt0A = this.j;
        C3680cK0 c3680cK0 = this.k;
        if (interfaceC6090kt0A != null) {
            c9434wr0 = this;
            if (!f(c3680cK0, this.m, this.n, f)) {
            }
            AbstractC6030kj.c(interfaceC6318lj, interfaceC6090kt0A, 0, 2, null);
        }
        c9434wr0 = this;
        C3680cK0 c3680cK0C = AbstractC3959dK0.c(C9982yp0.l(c9434wr0.m), C9982yp0.m(c9434wr0.m), C9982yp0.l(c9434wr0.m) + C9879yT0.i(c9434wr0.n), C9982yp0.m(c9434wr0.m) + C9879yT0.g(c9434wr0.n), AbstractC2895Ys.b(c9434wr0.l, 0.0f, 2, null));
        if (interfaceC6090kt0A == null) {
            interfaceC6090kt0A = AbstractC6428m6.a();
        } else {
            interfaceC6090kt0A.reset();
        }
        interfaceC6090kt0A.l(c3680cK0C);
        c9434wr0.k = c3680cK0C;
        c9434wr0.j = interfaceC6090kt0A;
        AbstractC6030kj.c(interfaceC6318lj, interfaceC6090kt0A, 0, 2, null);
    }

    public final InterfaceC6090kt0 b() {
        i();
        return this.g;
    }

    public final Outline c() {
        i();
        if (this.o && this.b) {
            return this.c;
        }
        return null;
    }

    public final boolean d() {
        return !this.i;
    }

    public final boolean e(long j) {
        AbstractC8869ur0 abstractC8869ur0;
        if (this.o && (abstractC8869ur0 = this.s) != null) {
            return AbstractC6238lR0.b(abstractC8869ur0, C9982yp0.l(j), C9982yp0.m(j), this.q, this.r);
        }
        return true;
    }

    public final boolean f(C3680cK0 c3680cK0, long j, long j2, float f) {
        return c3680cK0 != null && AbstractC3959dK0.d(c3680cK0) && c3680cK0.e() == C9982yp0.l(j) && c3680cK0.g() == C9982yp0.m(j) && c3680cK0.f() == C9982yp0.l(j) + C9879yT0.i(j2) && c3680cK0.a() == C9982yp0.m(j) + C9879yT0.g(j2) && AbstractC2791Xs.d(c3680cK0.h()) == f;
    }

    public final boolean g(InterfaceC5391iR0 interfaceC5391iR0, float f, boolean z, float f2, EnumC7560q90 enumC7560q90, InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC5391iR0, "shape");
        G10.g(enumC7560q90, "layoutDirection");
        G10.g(interfaceC4988gz, "density");
        this.c.setAlpha(f);
        boolean zC = G10.c(this.e, interfaceC5391iR0);
        boolean z2 = !zC;
        if (!zC) {
            this.e = interfaceC5391iR0;
            this.h = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.o != z3) {
            this.o = z3;
            this.h = true;
        }
        if (this.p != enumC7560q90) {
            this.p = enumC7560q90;
            this.h = true;
        }
        if (!G10.c(this.a, interfaceC4988gz)) {
            this.a = interfaceC4988gz;
            this.h = true;
        }
        return z2;
    }

    public final void h(long j) {
        if (C9879yT0.f(this.d, j)) {
            return;
        }
        this.d = j;
        this.h = true;
    }

    public final void i() {
        if (this.h) {
            this.m = C9982yp0.b.c();
            long j = this.d;
            this.n = j;
            this.l = 0.0f;
            this.g = null;
            this.h = false;
            this.i = false;
            if (!this.o || C9879yT0.i(j) <= 0.0f || C9879yT0.g(this.d) <= 0.0f) {
                this.c.setEmpty();
                return;
            }
            this.b = true;
            AbstractC8869ur0 abstractC8869ur0A = this.e.a(this.d, this.p, this.a);
            this.s = abstractC8869ur0A;
            if (abstractC8869ur0A instanceof AbstractC8869ur0.a) {
                k(((AbstractC8869ur0.a) abstractC8869ur0A).a());
            } else if (abstractC8869ur0A instanceof AbstractC8869ur0.b) {
                l(((AbstractC8869ur0.b) abstractC8869ur0A).a());
            }
        }
    }

    public final void j(InterfaceC6090kt0 interfaceC6090kt0) {
        if (Build.VERSION.SDK_INT > 28 || interfaceC6090kt0.d()) {
            Outline outline = this.c;
            if (!(interfaceC6090kt0 instanceof C5579j6)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C5579j6) interfaceC6090kt0).p());
            this.i = !this.c.canClip();
        } else {
            this.b = false;
            this.c.setEmpty();
            this.i = true;
        }
        this.g = interfaceC6090kt0;
    }

    public final void k(C3103aF0 c3103aF0) {
        this.m = AbstractC0460Bp0.a(c3103aF0.f(), c3103aF0.i());
        this.n = BT0.a(c3103aF0.j(), c3103aF0.e());
        this.c.setRect(AbstractC8261sh0.b(c3103aF0.f()), AbstractC8261sh0.b(c3103aF0.i()), AbstractC8261sh0.b(c3103aF0.g()), AbstractC8261sh0.b(c3103aF0.c()));
    }

    public final void l(C3680cK0 c3680cK0) {
        float fD = AbstractC2791Xs.d(c3680cK0.h());
        this.m = AbstractC0460Bp0.a(c3680cK0.e(), c3680cK0.g());
        this.n = BT0.a(c3680cK0.j(), c3680cK0.d());
        if (AbstractC3959dK0.d(c3680cK0)) {
            this.c.setRoundRect(AbstractC8261sh0.b(c3680cK0.e()), AbstractC8261sh0.b(c3680cK0.g()), AbstractC8261sh0.b(c3680cK0.f()), AbstractC8261sh0.b(c3680cK0.a()), fD);
            this.l = fD;
            return;
        }
        InterfaceC6090kt0 interfaceC6090kt0A = this.f;
        if (interfaceC6090kt0A == null) {
            interfaceC6090kt0A = AbstractC6428m6.a();
            this.f = interfaceC6090kt0A;
        }
        interfaceC6090kt0A.reset();
        interfaceC6090kt0A.l(c3680cK0);
        j(interfaceC6090kt0A);
    }
}
