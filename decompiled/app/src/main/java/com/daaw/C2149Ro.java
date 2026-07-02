package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2149Ro {
    public static final C2149Ro a = new C2149Ro();
    public static InterfaceC3429bR b = AbstractC1815Oo.c(954879418, false, a.B);
    public static InterfaceC3429bR c = AbstractC1815Oo.c(1918065384, false, b.B);

    /* JADX INFO: renamed from: com.daaw.Ro$a */
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

    /* JADX INFO: renamed from: com.daaw.Ro$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final b B = new b();

        public b() {
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

    public final InterfaceC3429bR b() {
        return c;
    }
}
