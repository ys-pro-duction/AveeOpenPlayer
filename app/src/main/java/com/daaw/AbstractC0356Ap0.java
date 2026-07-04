package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ap0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0356Ap0 {

    /* JADX INFO: renamed from: com.daaw.Ap0$a */
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

    /* JADX INFO: renamed from: com.daaw.Ap0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ float B;
        public final /* synthetic */ float C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, float f2) {
            super(1);
            this.B = f;
            this.C = f2;
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
        G10.g(nq, "offset");
        return interfaceC1073Hk0.g(new C0677Dp0(nq, true, AbstractC5550j00.c() ? new a(nq) : AbstractC5550j00.a()));
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, float f, float f2) {
        G10.g(interfaceC1073Hk0, "$this$offset");
        return interfaceC1073Hk0.g(new C0564Cp0(f, f2, true, AbstractC5550j00.c() ? new b(f, f2) : AbstractC5550j00.a(), null));
    }

    public static /* synthetic */ InterfaceC1073Hk0 c(InterfaceC1073Hk0 interfaceC1073Hk0, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C6460mD.l(0);
        }
        if ((i & 2) != 0) {
            f2 = C6460mD.l(0);
        }
        return b(interfaceC1073Hk0, f, f2);
    }
}
