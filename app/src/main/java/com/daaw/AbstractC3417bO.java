package com.daaw;

/* JADX INFO: renamed from: com.daaw.bO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3417bO {
    public static final C6732nB0 a = AbstractC1592Mk0.a(a.B);

    /* JADX INFO: renamed from: com.daaw.bO$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3695cO invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.bO$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ ZN B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ZN zn) {
            super(1);
            this.B = zn;
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

    /* JADX INFO: renamed from: com.daaw.bO$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ ZN B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ZN zn) {
            super(3);
            this.B = zn;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(-307396750);
            ZN zn = this.B;
            int i2 = C8565tm0.E;
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(zn);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new C3695cO(zn);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            C3695cO c3695cO = (C3695cO) objF;
            interfaceC5781jp.L();
            return c3695cO;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, ZN zn) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(zn, "focusRequester");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new b(zn) : AbstractC5550j00.a(), new c(zn));
    }

    public static final C6732nB0 b() {
        return a;
    }
}
