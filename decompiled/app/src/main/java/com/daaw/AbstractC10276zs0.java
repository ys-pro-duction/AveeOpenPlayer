package com.daaw;

/* JADX INFO: renamed from: com.daaw.zs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10276zs0 {

    /* JADX INFO: renamed from: com.daaw.zs0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC9718xs0 B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ H3 D;
        public final /* synthetic */ InterfaceC7479ps E;
        public final /* synthetic */ float F;
        public final /* synthetic */ C2871Ym G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC9718xs0 abstractC9718xs0, boolean z, H3 h3, InterfaceC7479ps interfaceC7479ps, float f, C2871Ym c2871Ym) {
            super(1);
            this.B = abstractC9718xs0;
            this.C = z;
            this.D = h3;
            this.E = interfaceC7479ps;
            this.F = f;
            this.G = c2871Ym;
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

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, AbstractC9718xs0 abstractC9718xs0, boolean z, H3 h3, InterfaceC7479ps interfaceC7479ps, float f, C2871Ym c2871Ym) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(abstractC9718xs0, "painter");
        G10.g(h3, "alignment");
        G10.g(interfaceC7479ps, "contentScale");
        return interfaceC1073Hk0.g(new C9997ys0(abstractC9718xs0, z, h3, interfaceC7479ps, f, c2871Ym, AbstractC5550j00.c() ? new a(abstractC9718xs0, z, h3, interfaceC7479ps, f, c2871Ym) : AbstractC5550j00.a()));
    }

    public static /* synthetic */ InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, AbstractC9718xs0 abstractC9718xs0, boolean z, H3 h3, InterfaceC7479ps interfaceC7479ps, float f, C2871Ym c2871Ym, int i, Object obj) {
        boolean z2 = (i & 2) != 0 ? true : z;
        if ((i & 4) != 0) {
            h3 = H3.a.b();
        }
        H3 h32 = h3;
        if ((i & 8) != 0) {
            interfaceC7479ps = InterfaceC7479ps.a.c();
        }
        InterfaceC7479ps interfaceC7479ps2 = interfaceC7479ps;
        float f2 = (i & 16) != 0 ? 1.0f : f;
        if ((i & 32) != 0) {
            c2871Ym = null;
        }
        return a(interfaceC1073Hk0, abstractC9718xs0, z2, h32, interfaceC7479ps2, f2, c2871Ym);
    }
}
