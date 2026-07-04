package com.daaw;

/* JADX INFO: renamed from: com.daaw.nE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6743nE {
    public static final a b = new a(null);
    public final XZ0 a;

    /* JADX INFO: renamed from: com.daaw.nE$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.nE$a$a, reason: collision with other inner class name */
        public static final class C0218a extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final C0218a B = new C0218a();

            public C0218a() {
                super(2);
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EnumC7022oE invoke(InterfaceC4249eN0 interfaceC4249eN0, C6743nE c6743nE) {
                G10.g(interfaceC4249eN0, "$this$Saver");
                G10.g(c6743nE, "it");
                return c6743nE.c();
            }
        }

        /* JADX INFO: renamed from: com.daaw.nE$a$b */
        public static final class b extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ NQ B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(NQ nq) {
                super(1);
                this.B = nq;
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6743nE invoke(EnumC7022oE enumC7022oE) {
                G10.g(enumC7022oE, "it");
                return new C6743nE(enumC7022oE, this.B);
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final InterfaceC3692cN0 a(NQ nq) {
            G10.g(nq, "confirmStateChange");
            return AbstractC3971dN0.a(C0218a.B, new b(nq));
        }

        public a() {
        }
    }

    public C6743nE(EnumC7022oE enumC7022oE, NQ nq) {
        G10.g(enumC7022oE, "initialValue");
        G10.g(nq, "confirmStateChange");
        this.a = new XZ0(enumC7022oE, AbstractC6185lE.c, nq);
    }

    public final Object a(EnumC7022oE enumC7022oE, InterfaceC5866k7 interfaceC5866k7, InterfaceC1416Ks interfaceC1416Ks) {
        Object objI = this.a.i(enumC7022oE, interfaceC5866k7, interfaceC1416Ks);
        return objI == I10.c() ? objI : G91.a;
    }

    public final Object b(InterfaceC1416Ks interfaceC1416Ks) {
        Object objA = a(EnumC7022oE.Closed, AbstractC6185lE.c, interfaceC1416Ks);
        return objA == I10.c() ? objA : G91.a;
    }

    public final EnumC7022oE c() {
        return (EnumC7022oE) this.a.o();
    }

    public final InterfaceC6258lW0 d() {
        return this.a.s();
    }

    public final XZ0 e() {
        return this.a;
    }

    public final boolean f() {
        return c() == EnumC7022oE.Open;
    }
}
