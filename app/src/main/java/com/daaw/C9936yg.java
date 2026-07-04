package com.daaw;

/* JADX INFO: renamed from: com.daaw.yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9936yg implements InterfaceC9657xg {
    public static final C9936yg a = new C9936yg();

    /* JADX INFO: renamed from: com.daaw.yg$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ H3 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H3 h3) {
            super(1);
            this.B = h3;
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

    @Override // com.daaw.InterfaceC9657xg
    public InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, H3 h3) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(h3, "alignment");
        return interfaceC1073Hk0.g(new C9099vg(h3, false, AbstractC5550j00.c() ? new a(h3) : AbstractC5550j00.a()));
    }
}
