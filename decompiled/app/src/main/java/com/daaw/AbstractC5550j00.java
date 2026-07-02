package com.daaw;

/* JADX INFO: renamed from: com.daaw.j00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5550j00 {
    public static final NQ a = a.B;
    public static boolean b;

    /* JADX INFO: renamed from: com.daaw.j00$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        public final void a(AbstractC6120l00 abstractC6120l00) {
            G10.g(abstractC6120l00, "$this$null");
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC6314li0.a(obj);
            a(null);
            return G91.a;
        }
    }

    public static final NQ a() {
        return a;
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq, InterfaceC1073Hk0 interfaceC1073Hk02) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(nq, "inspectorInfo");
        G10.g(interfaceC1073Hk02, "wrapped");
        C5273i00 c5273i00 = new C5273i00(nq);
        return interfaceC1073Hk0.g(c5273i00).g(interfaceC1073Hk02).g(c5273i00.c());
    }

    public static final boolean c() {
        return b;
    }
}
