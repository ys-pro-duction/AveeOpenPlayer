package com.daaw;

/* JADX INFO: renamed from: com.daaw.t90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8396t90 {

    /* JADX INFO: renamed from: com.daaw.t90$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Object B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.B = obj;
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

    public static final Object a(InterfaceC0645Dh0 interfaceC0645Dh0) {
        G10.g(interfaceC0645Dh0, "<this>");
        Object objL = interfaceC0645Dh0.L();
        InterfaceC8675u90 interfaceC8675u90 = objL instanceof InterfaceC8675u90 ? (InterfaceC8675u90) objL : null;
        if (interfaceC8675u90 != null) {
            return interfaceC8675u90.a();
        }
        return null;
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, Object obj) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(obj, "layoutId");
        return interfaceC1073Hk0.g(new C8117s90(obj, AbstractC5550j00.c() ? new a(obj) : AbstractC5550j00.a()));
    }
}
