package com.daaw;

/* JADX INFO: renamed from: com.daaw.tq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8585tq0 {

    /* JADX INFO: renamed from: com.daaw.tq0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NQ nq) {
            super(1);
            this.B = nq;
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

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(nq, "onGloballyPositioned");
        return interfaceC1073Hk0.g(new C8306sq0(nq, AbstractC5550j00.c() ? new a(nq) : AbstractC5550j00.a()));
    }
}
