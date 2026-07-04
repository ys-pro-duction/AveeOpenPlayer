package com.daaw;

/* JADX INFO: renamed from: com.daaw.ci1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3785ci1 {

    /* JADX INFO: renamed from: com.daaw.ci1$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public a() {
            super(1);
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

    /* JADX INFO: renamed from: com.daaw.ci1$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public b() {
            super(3);
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(359872873);
            C2957Zh1 c2957Zh1C = C2957Zh1.v.c(interfaceC5781jp, 8);
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(c2957Zh1C);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new C4426f00(c2957Zh1C.d(), null, 2, null);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            C4426f00 c4426f00 = (C4426f00) objF;
            interfaceC5781jp.L();
            return c4426f00;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0) {
        G10.g(interfaceC1073Hk0, "<this>");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new a() : AbstractC5550j00.a(), new b());
    }
}
