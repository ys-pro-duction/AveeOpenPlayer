package com.daaw;

/* JADX INFO: renamed from: com.daaw.gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4943gp {
    public static final a d = a.a;

    /* JADX INFO: renamed from: com.daaw.gp$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final LQ b = E90.u0.a();
        public static final InterfaceC3429bR c = d.B;
        public static final InterfaceC3429bR d = C0181a.B;
        public static final InterfaceC3429bR e = c.B;
        public static final InterfaceC3429bR f = b.B;
        public static final InterfaceC3429bR g = e.B;

        /* JADX INFO: renamed from: com.daaw.gp$a$a, reason: collision with other inner class name */
        public static final class C0181a extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final C0181a B = new C0181a();

            public C0181a() {
                super(2);
            }

            public final void a(InterfaceC4943gp interfaceC4943gp, InterfaceC4988gz interfaceC4988gz) {
                G10.g(interfaceC4943gp, "$this$null");
                G10.g(interfaceC4988gz, "it");
                interfaceC4943gp.f(interfaceC4988gz);
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC4943gp) obj, (InterfaceC4988gz) obj2);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.gp$a$b */
        public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final b B = new b();

            public b() {
                super(2);
            }

            public final void a(InterfaceC4943gp interfaceC4943gp, EnumC7560q90 enumC7560q90) {
                G10.g(interfaceC4943gp, "$this$null");
                G10.g(enumC7560q90, "it");
                interfaceC4943gp.c(enumC7560q90);
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC4943gp) obj, (EnumC7560q90) obj2);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.gp$a$c */
        public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final c B = new c();

            public c() {
                super(2);
            }

            public final void a(InterfaceC4943gp interfaceC4943gp, InterfaceC0957Gh0 interfaceC0957Gh0) {
                G10.g(interfaceC4943gp, "$this$null");
                G10.g(interfaceC0957Gh0, "it");
                interfaceC4943gp.e(interfaceC0957Gh0);
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC4943gp) obj, (InterfaceC0957Gh0) obj2);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.gp$a$d */
        public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final d B = new d();

            public d() {
                super(2);
            }

            public final void a(InterfaceC4943gp interfaceC4943gp, InterfaceC1073Hk0 interfaceC1073Hk0) {
                G10.g(interfaceC4943gp, "$this$null");
                G10.g(interfaceC1073Hk0, "it");
                interfaceC4943gp.a(interfaceC1073Hk0);
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC4943gp) obj, (InterfaceC1073Hk0) obj2);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.gp$a$e */
        public static final class e extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final e B = new e();

            public e() {
                super(2);
            }

            public final void a(InterfaceC4943gp interfaceC4943gp, InterfaceC2733Xd1 interfaceC2733Xd1) {
                G10.g(interfaceC4943gp, "$this$null");
                G10.g(interfaceC2733Xd1, "it");
                interfaceC4943gp.h(interfaceC2733Xd1);
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC4943gp) obj, (InterfaceC2733Xd1) obj2);
                return G91.a;
            }
        }

        public final LQ a() {
            return b;
        }

        public final InterfaceC3429bR b() {
            return d;
        }

        public final InterfaceC3429bR c() {
            return f;
        }

        public final InterfaceC3429bR d() {
            return e;
        }

        public final InterfaceC3429bR e() {
            return c;
        }

        public final InterfaceC3429bR f() {
            return g;
        }
    }

    void a(InterfaceC1073Hk0 interfaceC1073Hk0);

    void c(EnumC7560q90 enumC7560q90);

    void e(InterfaceC0957Gh0 interfaceC0957Gh0);

    void f(InterfaceC4988gz interfaceC4988gz);

    void h(InterfaceC2733Xd1 interfaceC2733Xd1);
}
