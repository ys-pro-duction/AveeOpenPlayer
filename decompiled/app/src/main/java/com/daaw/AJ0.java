package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class AJ0 implements InterfaceC9344wZ {
    public final boolean a;
    public final float b;
    public final InterfaceC6258lW0 c;

    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ Z00 H;
        public final /* synthetic */ JJ0 I;

        /* JADX INFO: renamed from: com.daaw.AJ0$a$a, reason: collision with other inner class name */
        public static final class C0045a implements InterfaceC7337pN {
            public final /* synthetic */ JJ0 B;
            public final /* synthetic */ InterfaceC7484pt C;

            public C0045a(JJ0 jj0, InterfaceC7484pt interfaceC7484pt) {
                this.B = jj0;
                this.C = interfaceC7484pt;
            }

            @Override // com.daaw.InterfaceC7337pN
            public Object c(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                Y00 y00 = (Y00) obj;
                if (y00 instanceof C6115kz0) {
                    this.B.e((C6115kz0) y00, this.C);
                } else if (y00 instanceof C6394lz0) {
                    this.B.g(((C6394lz0) y00).a());
                } else if (y00 instanceof C5827jz0) {
                    this.B.g(((C5827jz0) y00).a());
                } else {
                    this.B.h(y00, this.C);
                }
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z00 z00, JJ0 jj0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = z00;
            this.I = jj0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = new a(this.H, this.I, interfaceC1416Ks);
            aVar.G = obj;
            return aVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.G;
                InterfaceC7058oN interfaceC7058oNB = this.H.b();
                C0045a c0045a = new C0045a(this.I, interfaceC7484pt);
                this.F = 1;
                if (interfaceC7058oNB.a(c0045a, this) == objC) {
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

    public /* synthetic */ AJ0(boolean z, float f, InterfaceC6258lW0 interfaceC6258lW0, AbstractC2911Yw abstractC2911Yw) {
        this(z, f, interfaceC6258lW0);
    }

    @Override // com.daaw.InterfaceC9344wZ
    public final InterfaceC9623xZ a(Z00 z00, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(z00, "interactionSource");
        interfaceC5781jp.e(988743187);
        LJ0 lj0 = (LJ0) interfaceC5781jp.O(MJ0.d());
        interfaceC5781jp.e(-1524341038);
        long jW = ((C2559Vm) this.c.getValue()).w() != C2559Vm.b.g() ? ((C2559Vm) this.c.getValue()).w() : lj0.b(interfaceC5781jp, 0);
        interfaceC5781jp.L();
        JJ0 jj0B = b(z00, this.a, this.b, AbstractC7923rU0.i(C2559Vm.i(jW), interfaceC5781jp, 0), AbstractC7923rU0.i(lj0.a(interfaceC5781jp, 0), interfaceC5781jp, 0), interfaceC5781jp, (i & 14) | ((i << 12) & 458752));
        AbstractC8420tF.d(jj0B, z00, new a(z00, jj0B, null), interfaceC5781jp, ((i << 3) & 112) | 520);
        interfaceC5781jp.L();
        return jj0B;
    }

    public abstract JJ0 b(Z00 z00, boolean z, float f, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, InterfaceC5781jp interfaceC5781jp, int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AJ0)) {
            return false;
        }
        AJ0 aj0 = (AJ0) obj;
        return this.a == aj0.a && C6460mD.n(this.b, aj0.b) && G10.c(this.c, aj0.c);
    }

    public int hashCode() {
        return (((AbstractC8813ug.a(this.a) * 31) + C6460mD.o(this.b)) * 31) + this.c.hashCode();
    }

    public AJ0(boolean z, float f, InterfaceC6258lW0 interfaceC6258lW0) {
        this.a = z;
        this.b = f;
        this.c = interfaceC6258lW0;
    }
}
