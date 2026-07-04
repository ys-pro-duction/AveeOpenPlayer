package com.daaw;

/* JADX INFO: renamed from: com.daaw.ks0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6085ks0 {

    /* JADX INFO: renamed from: com.daaw.ks0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC6643ms0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6643ms0 interfaceC6643ms0) {
            super(1);
            this.B = interfaceC6643ms0;
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

    /* JADX INFO: renamed from: com.daaw.ks0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ float B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f) {
            super(1);
            this.B = f;
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

    /* JADX INFO: renamed from: com.daaw.ks0$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ float B;
        public final /* synthetic */ float C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f, float f2) {
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

    /* JADX INFO: renamed from: com.daaw.ks0$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ float B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;
        public final /* synthetic */ float E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f, float f2, float f3, float f4) {
            super(1);
            this.B = f;
            this.C = f2;
            this.D = f3;
            this.E = f4;
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

    public static final InterfaceC6643ms0 a(float f, float f2, float f3, float f4) {
        return new C6922ns0(f, f2, f3, f4, null);
    }

    public static /* synthetic */ InterfaceC6643ms0 b(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C6460mD.l(0);
        }
        if ((i & 2) != 0) {
            f2 = C6460mD.l(0);
        }
        if ((i & 4) != 0) {
            f3 = C6460mD.l(0);
        }
        if ((i & 8) != 0) {
            f4 = C6460mD.l(0);
        }
        return a(f, f2, f3, f4);
    }

    public static final InterfaceC1073Hk0 c(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC6643ms0 interfaceC6643ms0) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(interfaceC6643ms0, "paddingValues");
        return interfaceC1073Hk0.g(new C7201os0(interfaceC6643ms0, AbstractC5550j00.c() ? new a(interfaceC6643ms0) : AbstractC5550j00.a()));
    }

    public static final InterfaceC1073Hk0 d(InterfaceC1073Hk0 interfaceC1073Hk0, float f) {
        G10.g(interfaceC1073Hk0, "$this$padding");
        return interfaceC1073Hk0.g(new C6364ls0(f, f, f, f, true, AbstractC5550j00.c() ? new b(f) : AbstractC5550j00.a(), null));
    }

    public static final InterfaceC1073Hk0 e(InterfaceC1073Hk0 interfaceC1073Hk0, float f, float f2) {
        G10.g(interfaceC1073Hk0, "$this$padding");
        return interfaceC1073Hk0.g(new C6364ls0(f, f2, f, f2, true, AbstractC5550j00.c() ? new c(f, f2) : AbstractC5550j00.a(), null));
    }

    public static /* synthetic */ InterfaceC1073Hk0 f(InterfaceC1073Hk0 interfaceC1073Hk0, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C6460mD.l(0);
        }
        if ((i & 2) != 0) {
            f2 = C6460mD.l(0);
        }
        return e(interfaceC1073Hk0, f, f2);
    }

    public static final InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0, float f, float f2, float f3, float f4) {
        G10.g(interfaceC1073Hk0, "$this$padding");
        return interfaceC1073Hk0.g(new C6364ls0(f, f2, f3, f4, true, AbstractC5550j00.c() ? new d(f, f2, f3, f4) : AbstractC5550j00.a(), null));
    }

    public static /* synthetic */ InterfaceC1073Hk0 h(InterfaceC1073Hk0 interfaceC1073Hk0, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C6460mD.l(0);
        }
        if ((i & 2) != 0) {
            f2 = C6460mD.l(0);
        }
        if ((i & 4) != 0) {
            f3 = C6460mD.l(0);
        }
        if ((i & 8) != 0) {
            f4 = C6460mD.l(0);
        }
        return g(interfaceC1073Hk0, f, f2, f3, f4);
    }
}
