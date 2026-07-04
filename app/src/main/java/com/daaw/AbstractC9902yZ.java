package com.daaw;

/* JADX INFO: renamed from: com.daaw.yZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9902yZ {
    public static final AbstractC6453mB0 a = AbstractC2153Rp.d(a.B);

    /* JADX INFO: renamed from: com.daaw.yZ$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC9344wZ invoke() {
            return C3855cx.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.yZ$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC9344wZ B;
        public final /* synthetic */ Z00 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC9344wZ interfaceC9344wZ, Z00 z00) {
            super(1);
            this.B = interfaceC9344wZ;
            this.C = z00;
        }

        public final void a(AbstractC6120l00 abstractC6120l00) {
            G10.g(abstractC6120l00, "$this$null");
            throw null;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC6314li0.a(obj);
            a(null);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.yZ$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ InterfaceC9344wZ B;
        public final /* synthetic */ Z00 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC9344wZ interfaceC9344wZ, Z00 z00) {
            super(3);
            this.B = interfaceC9344wZ;
            this.C = z00;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(-353972293);
            InterfaceC9344wZ interfaceC9344wZ = this.B;
            if (interfaceC9344wZ == null) {
                interfaceC9344wZ = C5218ho0.a;
            }
            InterfaceC9623xZ interfaceC9623xZA = interfaceC9344wZ.a(this.C, interfaceC5781jp, 0);
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(interfaceC9623xZA);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new C10181zZ(interfaceC9623xZA);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            C10181zZ c10181zZ = (C10181zZ) objF;
            interfaceC5781jp.L();
            return c10181zZ;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final AbstractC6453mB0 a() {
        return a;
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, Z00 z00, InterfaceC9344wZ interfaceC9344wZ) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(z00, "interactionSource");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new b(interfaceC9344wZ, z00) : AbstractC5550j00.a(), new c(interfaceC9344wZ, z00));
    }
}
