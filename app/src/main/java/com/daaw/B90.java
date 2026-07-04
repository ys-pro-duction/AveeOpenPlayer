package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class B90 {

    public static final class a extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ InterfaceC1073Hk0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1073Hk0 interfaceC1073Hk0) {
            super(3);
            this.B = interfaceC1073Hk0;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, InterfaceC5781jp interfaceC5781jp2, int i) {
            G10.g(interfaceC5781jp, "$this$null");
            InterfaceC1073Hk0 interfaceC1073Hk0B = AbstractC5500ip.b(interfaceC5781jp2, this.B);
            interfaceC5781jp.e(509942095);
            AbstractC5987ka1.b(AbstractC5987ka1.a(interfaceC5781jp), interfaceC1073Hk0B, InterfaceC4943gp.d.e());
            interfaceC5781jp.L();
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((GT0) obj).f(), (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
            return G91.a;
        }
    }

    public static final InterfaceC3986dR a(InterfaceC1073Hk0 interfaceC1073Hk0) {
        G10.g(interfaceC1073Hk0, "modifier");
        return AbstractC1815Oo.c(-1586257396, true, new a(interfaceC1073Hk0));
    }
}
