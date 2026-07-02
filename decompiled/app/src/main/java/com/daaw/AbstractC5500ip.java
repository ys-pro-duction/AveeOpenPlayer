package com.daaw;

import com.daaw.InterfaceC1073Hk0;

/* JADX INFO: renamed from: com.daaw.ip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5500ip {
    public static final InterfaceC3986dR a = a.B;
    public static final InterfaceC3986dR b = b.B;

    /* JADX INFO: renamed from: com.daaw.ip$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final a B = new a();

        /* JADX INFO: renamed from: com.daaw.ip$a$a, reason: collision with other inner class name */
        public static final class C0194a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ KN B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0194a(KN kn) {
                super(0);
                this.B = kn;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m50invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m50invoke() {
                this.B.h();
            }
        }

        /* JADX INFO: renamed from: com.daaw.ip$a$b */
        public /* synthetic */ class b extends AbstractC9591xR implements NQ {
            public b(Object obj) {
                super(1, obj, IN.class, "onFocusEvent", "onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V", 0);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                o((InterfaceC3974dO) obj);
                return G91.a;
            }

            public final void o(InterfaceC3974dO interfaceC3974dO) {
                G10.g(interfaceC3974dO, "p0");
                AbstractC6314li0.a(this.receiver);
                throw null;
            }
        }

        public a() {
            super(3);
        }

        public final KN a(IN in, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(in, "mod");
            interfaceC5781jp.e(-1790596922);
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(in);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new KN(new b(in));
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            KN kn = (KN) objF;
            AbstractC8420tF.g(new C0194a(kn), interfaceC5781jp, 0);
            interfaceC5781jp.L();
            return kn;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            AbstractC6314li0.a(obj);
            return a(null, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ip$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final b B = new b();

        public b() {
            super(3);
        }

        public final C3695cO a(InterfaceC3138aO interfaceC3138aO, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC3138aO, "mod");
            interfaceC5781jp.e(945678692);
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(interfaceC3138aO);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new C3695cO(interfaceC3138aO.y());
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            C3695cO c3695cO = (C3695cO) objF;
            interfaceC5781jp.L();
            return c3695cO;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            AbstractC6314li0.a(obj);
            return a(null, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ip$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public static final c B = new c();

        public c() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1073Hk0.b bVar) {
            G10.g(bVar, "it");
            return Boolean.valueOf(!(bVar instanceof C5222hp));
        }
    }

    /* JADX INFO: renamed from: com.daaw.ip$d */
    public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC5781jp B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC5781jp interfaceC5781jp) {
            super(2);
            this.B = interfaceC5781jp;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1073Hk0 invoke(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC1073Hk0.b bVar) {
            G10.g(interfaceC1073Hk0, "acc");
            G10.g(bVar, "element");
            boolean z = bVar instanceof C5222hp;
            InterfaceC1073Hk0 interfaceC1073Hk0B = bVar;
            if (z) {
                interfaceC1073Hk0B = AbstractC5500ip.b(this.B, (InterfaceC1073Hk0) ((InterfaceC3986dR) V71.e(((C5222hp) bVar).c(), 3)).invoke(InterfaceC1073Hk0.m, this.B, 0));
            }
            return interfaceC1073Hk0.g(interfaceC1073Hk0B);
        }
    }

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq, InterfaceC3986dR interfaceC3986dR) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(nq, "inspectorInfo");
        G10.g(interfaceC3986dR, "factory");
        return interfaceC1073Hk0.g(new C5222hp(nq, interfaceC3986dR));
    }

    public static final InterfaceC1073Hk0 b(InterfaceC5781jp interfaceC5781jp, InterfaceC1073Hk0 interfaceC1073Hk0) {
        G10.g(interfaceC5781jp, "<this>");
        G10.g(interfaceC1073Hk0, "modifier");
        if (interfaceC1073Hk0.I(c.B)) {
            return interfaceC1073Hk0;
        }
        interfaceC5781jp.e(1219399079);
        InterfaceC1073Hk0 interfaceC1073Hk02 = (InterfaceC1073Hk0) interfaceC1073Hk0.x(InterfaceC1073Hk0.m, new d(interfaceC5781jp));
        interfaceC5781jp.L();
        return interfaceC1073Hk02;
    }
}
