package com.daaw;

/* JADX INFO: renamed from: com.daaw.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3763ce {

    /* JADX INFO: renamed from: com.daaw.ce$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ long B;
        public final /* synthetic */ InterfaceC5391iR0 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, InterfaceC5391iR0 interfaceC5391iR0) {
            super(1);
            this.B = j;
            this.C = interfaceC5391iR0;
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

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, long j, InterfaceC5391iR0 interfaceC5391iR0) {
        G10.g(interfaceC1073Hk0, "$this$background");
        G10.g(interfaceC5391iR0, "shape");
        return interfaceC1073Hk0.g(new C3206ae(C2559Vm.i(j), null, 0.0f, interfaceC5391iR0, AbstractC5550j00.c() ? new a(j, interfaceC5391iR0) : AbstractC5550j00.a(), 6, null));
    }

    public static /* synthetic */ InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, long j, InterfaceC5391iR0 interfaceC5391iR0, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC5391iR0 = AbstractC4785gF0.a();
        }
        return a(interfaceC1073Hk0, j, interfaceC5391iR0);
    }
}
