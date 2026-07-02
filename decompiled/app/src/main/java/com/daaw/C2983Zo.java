package com.daaw;

/* JADX INFO: renamed from: com.daaw.Zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2983Zo {
    public static final C2983Zo a = new C2983Zo();
    public static InterfaceC3429bR b = AbstractC1815Oo.c(-1741544742, false, a.B);

    /* JADX INFO: renamed from: com.daaw.Zo$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
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
