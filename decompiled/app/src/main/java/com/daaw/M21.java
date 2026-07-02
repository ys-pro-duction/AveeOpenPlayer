package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class M21 {
    public R11 a;
    public final long b;
    public NQ c;
    public InterfaceC5383iP0 d;
    public InterfaceC7002o90 e;
    public A21 f;
    public long g;
    public long h;
    public final InterfaceC8007rm0 i;

    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        public final void a(A21 a21) {
            G10.g(a21, "it");
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A21) obj);
            return G91.a;
        }
    }

    public M21(R11 r11, long j) {
        G10.g(r11, "textDelegate");
        this.a = r11;
        this.b = j;
        this.c = a.B;
        this.g = C9982yp0.b.c();
        this.h = C2559Vm.b.g();
        this.i = AbstractC7923rU0.d(G91.a, AbstractC7923rU0.f());
    }

    public final G91 a() {
        this.i.getValue();
        return G91.a;
    }

    public final InterfaceC7002o90 b() {
        return this.e;
    }

    public final A21 c() {
        return this.f;
    }

    public final NQ d() {
        return this.c;
    }

    public final long e() {
        return this.g;
    }

    public final InterfaceC5383iP0 f() {
        return this.d;
    }

    public final long g() {
        return this.b;
    }

    public final R11 h() {
        return this.a;
    }

    public final void i(G91 g91) {
        this.i.setValue(g91);
    }

    public final void j(InterfaceC7002o90 interfaceC7002o90) {
        this.e = interfaceC7002o90;
    }

    public final void k(A21 a21) {
        i(G91.a);
        this.f = a21;
    }

    public final void l(NQ nq) {
        G10.g(nq, "<set-?>");
        this.c = nq;
    }

    public final void m(long j) {
        this.g = j;
    }

    public final void n(long j) {
        this.h = j;
    }

    public final void o(R11 r11) {
        G10.g(r11, "<set-?>");
        this.a = r11;
    }
}
