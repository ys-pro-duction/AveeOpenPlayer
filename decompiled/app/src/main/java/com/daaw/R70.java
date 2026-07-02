package com.daaw;

import com.daaw.InterfaceC1073Hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class R70 {
    public static final C6732nB0 a = AbstractC1592Mk0.a(a.B);

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Q70 invoke() {
            return null;
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NQ nq) {
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

    public static final C6732nB0 a() {
        return a;
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(nq, "onKeyEvent");
        NQ bVar = AbstractC5550j00.c() ? new b(nq) : AbstractC5550j00.a();
        InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
        return AbstractC5550j00.b(interfaceC1073Hk0, bVar, new Q70(nq, null));
    }
}
