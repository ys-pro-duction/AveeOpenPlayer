package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.tP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8461tP0 {
    public final C7346pP0 a;
    public final boolean b;
    public boolean c;
    public C8461tP0 d;
    public final C6788nP0 e;
    public final int f;
    public final E90 g;

    /* JADX INFO: renamed from: com.daaw.tP0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ OJ0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OJ0 oj0) {
            super(1);
            this.B = oj0;
        }

        public final void a(CP0 cp0) {
            G10.g(cp0, "$this$fakeSemanticsNode");
            AP0.p(cp0, this.B.m());
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CP0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.tP0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ String B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.B = str;
        }

        public final void a(CP0 cp0) {
            G10.g(cp0, "$this$fakeSemanticsNode");
            AP0.l(cp0, this.B);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CP0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.tP0$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public static final c B = new c();

        public c() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E90 e90) {
            C6788nP0 c6788nP0J;
            G10.g(e90, "it");
            C7346pP0 c7346pP0J = AbstractC8740uP0.j(e90);
            boolean z = false;
            if (c7346pP0J != null && (c6788nP0J = c7346pP0J.j()) != null && c6788nP0J.E()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: com.daaw.tP0$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public static final d B = new d();

        public d() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E90 e90) {
            G10.g(e90, "it");
            return Boolean.valueOf(AbstractC8740uP0.j(e90) != null);
        }
    }

    public C8461tP0(C7346pP0 c7346pP0, boolean z) {
        G10.g(c7346pP0, "outerSemanticsEntity");
        this.a = c7346pP0;
        this.b = z;
        this.e = c7346pP0.j();
        this.f = ((InterfaceC7625qP0) c7346pP0.c()).getId();
        this.g = c7346pP0.a();
    }

    public static /* synthetic */ List d(C8461tP0 c8461tP0, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return c8461tP0.c(list, z);
    }

    public static /* synthetic */ List x(C8461tP0 c8461tP0, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c8461tP0.w(z, z2);
    }

    public final void a(List list) {
        OJ0 oj0K = AbstractC8740uP0.k(this);
        if (oj0K != null && this.e.E() && !list.isEmpty()) {
            list.add(b(oj0K, new a(oj0K)));
        }
        C6788nP0 c6788nP0 = this.e;
        C9584xP0 c9584xP0 = C9584xP0.a;
        if (c6788nP0.p(c9584xP0.c()) && !list.isEmpty() && this.e.E()) {
            List list2 = (List) AbstractC7067oP0.a(this.e, c9584xP0.c());
            String str = list2 != null ? (String) AbstractC2455Um.g0(list2) : null;
            if (str != null) {
                list.add(0, b(null, new b(str)));
            }
        }
    }

    public final C8461tP0 b(OJ0 oj0, NQ nq) {
        C8461tP0 c8461tP0 = new C8461tP0(new C7346pP0(new E90(true).V(), new C7903rP0(oj0 != null ? AbstractC8740uP0.l(this) : AbstractC8740uP0.e(this), false, false, nq)), false);
        c8461tP0.c = true;
        c8461tP0.d = this;
        return c8461tP0;
    }

    public final List c(List list, boolean z) {
        List listX = x(this, z, false, 2, null);
        int size = listX.size();
        for (int i = 0; i < size; i++) {
            C8461tP0 c8461tP0 = (C8461tP0) listX.get(i);
            if (c8461tP0.u()) {
                list.add(c8461tP0);
            } else if (!c8461tP0.e.D()) {
                d(c8461tP0, list, false, 2, null);
            }
        }
        return list;
    }

    public final K90 e() {
        if (!this.e.E()) {
            return this.a.b();
        }
        C7346pP0 c7346pP0I = AbstractC8740uP0.i(this.g);
        if (c7346pP0I == null) {
            c7346pP0I = this.a;
        }
        return c7346pP0I.b();
    }

    public final C3103aF0 f() {
        return !this.g.C0() ? C3103aF0.e.a() : AbstractC7281p90.b(e());
    }

    public final List g(boolean z, boolean z2, boolean z3) {
        return (z2 || !this.e.D()) ? u() ? d(this, null, z, 1, null) : w(z, z3) : AbstractC1599Mm.k();
    }

    public final C6788nP0 h() {
        if (!u()) {
            return this.e;
        }
        C6788nP0 c6788nP0S = this.e.s();
        v(c6788nP0S);
        return c6788nP0S;
    }

    public final int i() {
        return this.f;
    }

    public final InterfaceC9519x90 j() {
        return this.g;
    }

    public final E90 k() {
        return this.g;
    }

    public final C7346pP0 l() {
        return this.a;
    }

    public final C8461tP0 m() {
        C8461tP0 c8461tP0 = this.d;
        if (c8461tP0 != null) {
            return c8461tP0;
        }
        E90 e90F = this.b ? AbstractC8740uP0.f(this.g, c.B) : null;
        if (e90F == null) {
            e90F = AbstractC8740uP0.f(this.g, d.B);
        }
        C7346pP0 c7346pP0J = e90F != null ? AbstractC8740uP0.j(e90F) : null;
        if (c7346pP0J == null) {
            return null;
        }
        return new C8461tP0(c7346pP0J, this.b);
    }

    public final long n() {
        return !this.g.C0() ? C9982yp0.b.c() : AbstractC7281p90.d(e());
    }

    public final List o() {
        return g(false, false, true);
    }

    public final List p() {
        return g(true, false, true);
    }

    public final long q() {
        return e().d();
    }

    public final C3103aF0 r() {
        C7346pP0 c7346pP0I;
        if (!this.e.E() || (c7346pP0I = AbstractC8740uP0.i(this.g)) == null) {
            c7346pP0I = this.a;
        }
        return c7346pP0I.l();
    }

    public final C6788nP0 s() {
        return this.e;
    }

    public final boolean t() {
        return this.c;
    }

    public final boolean u() {
        return this.b && this.e.E();
    }

    public final void v(C6788nP0 c6788nP0) {
        if (this.e.D()) {
            return;
        }
        List listX = x(this, false, false, 3, null);
        int size = listX.size();
        for (int i = 0; i < size; i++) {
            C8461tP0 c8461tP0 = (C8461tP0) listX.get(i);
            if (!c8461tP0.u()) {
                c6788nP0.F(c8461tP0.e);
                c8461tP0.v(c6788nP0);
            }
        }
    }

    public final List w(boolean z, boolean z2) {
        if (this.c) {
            return AbstractC1599Mm.k();
        }
        ArrayList arrayList = new ArrayList();
        List listC = z ? DP0.c(this.g, null, 1, null) : AbstractC8740uP0.h(this.g, null, 1, null);
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C8461tP0((C7346pP0) listC.get(i), this.b));
        }
        if (z2) {
            a(arrayList);
        }
        return arrayList;
    }
}
