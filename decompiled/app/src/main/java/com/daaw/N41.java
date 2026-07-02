package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class N41 {
    public static final AbstractC6453mB0 a = AbstractC2153Rp.d(a.B);

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public b() {
            super(1);
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

    public static final class c extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final c B = new c();

        public c() {
            super(3);
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(1220403677);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(1220403677, i, -1, "androidx.compose.material.minimumTouchTargetSize.<anonymous> (TouchTarget.kt:42)");
            }
            InterfaceC1073Hk0 c9120vk0 = ((Boolean) interfaceC5781jp.O(N41.a())).booleanValue() ? new C9120vk0(((InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i())).d(), null) : InterfaceC1073Hk0.m;
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
            interfaceC5781jp.L();
            return c9120vk0;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final AbstractC6453mB0 a() {
        return a;
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0) {
        G10.g(interfaceC1073Hk0, "<this>");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new b() : AbstractC5550j00.a(), c.B);
    }
}
