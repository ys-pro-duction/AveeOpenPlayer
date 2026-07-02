package com.daaw;

import com.daaw.AbstractC7898rO;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class R11 {
    public static final a k = new a(null);
    public final D7 a;
    public final O21 b;
    public final int c;
    public final boolean d;
    public final int e;
    public final InterfaceC4988gz f;
    public final AbstractC7898rO.b g;
    public final List h;
    public C2348Tl0 i;
    public EnumC7560q90 j;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final void a(InterfaceC6318lj interfaceC6318lj, A21 a21) throws Throwable {
            G10.g(interfaceC6318lj, "canvas");
            G10.g(a21, "textLayoutResult");
            E21.a.a(interfaceC6318lj, a21);
        }

        public a() {
        }
    }

    public /* synthetic */ R11(D7 d7, O21 o21, int i, boolean z, int i2, InterfaceC4988gz interfaceC4988gz, AbstractC7898rO.b bVar, List list, AbstractC2911Yw abstractC2911Yw) {
        this(d7, o21, i, z, i2, interfaceC4988gz, bVar, list);
    }

    public final InterfaceC4988gz a() {
        return this.f;
    }

    public final AbstractC7898rO.b b() {
        return this.g;
    }

    public final int c() {
        return (int) Math.ceil(e().c());
    }

    public final int d() {
        return this.c;
    }

    public final C2348Tl0 e() {
        C2348Tl0 c2348Tl0 = this.i;
        if (c2348Tl0 != null) {
            return c2348Tl0;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int f() {
        return this.e;
    }

    public final List g() {
        return this.h;
    }

    public final boolean h() {
        return this.d;
    }

    public final O21 i() {
        return this.b;
    }

    public final D7 j() {
        return this.a;
    }

    public final A21 k(long j, EnumC7560q90 enumC7560q90, A21 a21) {
        G10.g(enumC7560q90, "layoutDirection");
        if (a21 != null && AbstractC9485x21.a(a21, this.a, this.b, this.h, this.c, this.d, this.e, this.f, enumC7560q90, this.g, j)) {
            return a21.a(new C9764y21(a21.h().j(), this.b, a21.h().g(), a21.h().e(), a21.h().h(), a21.h().f(), a21.h().b(), a21.h().d(), a21.h().c(), j, (AbstractC2911Yw) null), AbstractC6916nr.d(j, J00.a((int) Math.ceil(a21.p().r()), (int) Math.ceil(a21.p().e()))));
        }
        return new A21(new C9764y21(this.a, this.b, this.h, this.c, this.d, this.e, this.f, enumC7560q90, this.g, j, (AbstractC2911Yw) null), m(j, enumC7560q90), AbstractC6916nr.d(j, J00.a((int) Math.ceil(r14.r()), (int) Math.ceil(r14.e()))), null);
    }

    public final void l(EnumC7560q90 enumC7560q90) {
        G10.g(enumC7560q90, "layoutDirection");
        C2348Tl0 c2348Tl0 = this.i;
        if (c2348Tl0 == null || enumC7560q90 != this.j || c2348Tl0.a()) {
            this.j = enumC7560q90;
            c2348Tl0 = new C2348Tl0(this.a, P21.c(this.b, enumC7560q90), this.h, this.f, this.g);
        }
        this.i = c2348Tl0;
    }

    public final C2244Sl0 m(long j, EnumC7560q90 enumC7560q90) {
        l(enumC7560q90);
        int iP = C6079kr.p(j);
        int iN = ((this.d || C21.d(this.e, C21.a.b())) && C6079kr.j(j)) ? C6079kr.n(j) : Integer.MAX_VALUE;
        int i = (this.d || !C21.d(this.e, C21.a.b())) ? this.c : 1;
        if (iP != iN) {
            iN = AbstractC8417tE0.l(c(), iP, iN);
        }
        return new C2244Sl0(e(), AbstractC6916nr.b(0, iN, 0, C6079kr.m(j), 5, null), i, C21.d(this.e, C21.a.b()), null);
    }

    public R11(D7 d7, O21 o21, int i, boolean z, int i2, InterfaceC4988gz interfaceC4988gz, AbstractC7898rO.b bVar, List list) {
        this.a = d7;
        this.b = o21;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = interfaceC4988gz;
        this.g = bVar;
        this.h = list;
        if (i <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public /* synthetic */ R11(D7 d7, O21 o21, int i, boolean z, int i2, InterfaceC4988gz interfaceC4988gz, AbstractC7898rO.b bVar, List list, int i3, AbstractC2911Yw abstractC2911Yw) {
        this(d7, o21, (i3 & 4) != 0 ? Integer.MAX_VALUE : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? C21.a.a() : i2, interfaceC4988gz, bVar, (i3 & 128) != 0 ? AbstractC1599Mm.k() : list, null);
    }
}
