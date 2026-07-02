package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class ZX implements InterfaceC3578bx0, InterfaceC3299ax0 {
    public final BD a;
    public InterfaceC9535xD b;

    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ InterfaceC3429bR I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.I = interfaceC3429bR;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = ZX.this.new a(this.I, interfaceC1416Ks);
            aVar.G = obj;
            return aVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                ZX.this.c((InterfaceC9535xD) this.G);
                InterfaceC3429bR interfaceC3429bR = this.I;
                ZX zx = ZX.this;
                this.F = 1;
                if (interfaceC3429bR.invoke(zx, this) == objC) {
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
        public final Object invoke(InterfaceC9535xD interfaceC9535xD, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC9535xD, interfaceC1416Ks)).q(G91.a);
        }
    }

    public ZX(BD bd) {
        G10.g(bd, "origin");
        this.a = bd;
    }

    @Override // com.daaw.InterfaceC3578bx0
    public Object a(EnumC9130vm0 enumC9130vm0, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
        Object objA = this.a.a(enumC9130vm0, new a(interfaceC3429bR, null), interfaceC1416Ks);
        return objA == I10.c() ? objA : G91.a;
    }

    @Override // com.daaw.InterfaceC3299ax0
    public void b(float f, long j) {
        InterfaceC9535xD interfaceC9535xD = this.b;
        if (interfaceC9535xD != null) {
            interfaceC9535xD.a(f);
        }
    }

    public final void c(InterfaceC9535xD interfaceC9535xD) {
        this.b = interfaceC9535xD;
    }
}
