package com.daaw;

import com.daaw.H3;

/* JADX INFO: renamed from: com.daaw.un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8848un implements InterfaceC8569tn {
    public static final C8848un a = new C8848un();

    /* JADX INFO: renamed from: com.daaw.un$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ H3.b B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H3.b bVar) {
            super(1);
            this.B = bVar;
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

    /* JADX INFO: renamed from: com.daaw.un$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ float B;
        public final /* synthetic */ boolean C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, boolean z) {
            super(1);
            this.B = f;
            this.C = z;
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

    @Override // com.daaw.InterfaceC8569tn
    public InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, H3.b bVar) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(bVar, "alignment");
        return interfaceC1073Hk0.g(new C6257lW(bVar, AbstractC5550j00.c() ? new a(bVar) : AbstractC5550j00.a()));
    }

    @Override // com.daaw.InterfaceC8569tn
    public InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, float f, boolean z) {
        G10.g(interfaceC1073Hk0, "<this>");
        if (f > 0.0d) {
            return interfaceC1073Hk0.g(new N90(f, z, AbstractC5550j00.c() ? new b(f, z) : AbstractC5550j00.a()));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }
}
