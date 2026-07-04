package com.daaw;

/* JADX INFO: renamed from: com.daaw.Vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2567Vo {
    public static final C2567Vo a = new C2567Vo();
    public static InterfaceC3429bR b = AbstractC1815Oo.c(-985537615, false, a.B);

    /* JADX INFO: renamed from: com.daaw.Vo$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
            } else {
                AbstractC8641u21.c("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5781jp, 6, 0, 65534);
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public final InterfaceC3429bR a() {
        return b;
    }
}
