package com.daaw;

/* JADX INFO: renamed from: com.daaw.dx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4133dx implements BD {
    public final NQ a;
    public final InterfaceC9535xD b;
    public final C0769Em0 c;

    /* JADX INFO: renamed from: com.daaw.dx$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ EnumC9130vm0 H;
        public final /* synthetic */ InterfaceC3429bR I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC9130vm0 enumC9130vm0, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = enumC9130vm0;
            this.I = interfaceC3429bR;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return C4133dx.this.new a(this.H, this.I, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                C0769Em0 c0769Em0 = C4133dx.this.c;
                InterfaceC9535xD interfaceC9535xD = C4133dx.this.b;
                EnumC9130vm0 enumC9130vm0 = this.H;
                InterfaceC3429bR interfaceC3429bR = this.I;
                this.F = 1;
                if (c0769Em0.f(interfaceC9535xD, enumC9130vm0, interfaceC3429bR, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
            }
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.dx$b */
    public static final class b implements InterfaceC9535xD {
        public b() {
        }

        @Override // com.daaw.InterfaceC9535xD
        public void a(float f) {
            C4133dx.this.d().invoke(Float.valueOf(f));
        }
    }

    public C4133dx(NQ nq) {
        G10.g(nq, "onDelta");
        this.a = nq;
        this.b = new b();
        this.c = new C0769Em0();
    }

    @Override // com.daaw.BD
    public Object a(EnumC9130vm0 enumC9130vm0, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
        Object objE = AbstractC7763qt.e(new a(enumC9130vm0, interfaceC3429bR, null), interfaceC1416Ks);
        return objE == I10.c() ? objE : G91.a;
    }

    public final NQ d() {
        return this.a;
    }
}
