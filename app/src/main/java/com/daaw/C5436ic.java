package com.daaw;

/* JADX INFO: renamed from: com.daaw.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5436ic implements InterfaceC9986yq {
    public static final InterfaceC9986yq a = new C5436ic();

    /* JADX INFO: renamed from: com.daaw.ic$a */
    public static final class a implements InterfaceC6349lp0 {
        public static final a a = new a();
        public static final C3122aK b = C3122aK.a("window").b(C0724Eb.b().c(1).a()).a();
        public static final C3122aK c = C3122aK.a("logSourceMetrics").b(C0724Eb.b().c(2).a()).a();
        public static final C3122aK d = C3122aK.a("globalMetrics").b(C0724Eb.b().c(3).a()).a();
        public static final C3122aK e = C3122aK.a("appNamespace").b(C0724Eb.b().c(4).a()).a();

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2659Wl c2659Wl, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.e(b, c2659Wl.d());
            interfaceC6628mp0.e(c, c2659Wl.c());
            interfaceC6628mp0.e(d, c2659Wl.b());
            interfaceC6628mp0.e(e, c2659Wl.a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ic$b */
    public static final class b implements InterfaceC6349lp0 {
        public static final b a = new b();
        public static final C3122aK b = C3122aK.a("storageMetrics").b(C0724Eb.b().c(1).a()).a();

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5957kT c5957kT, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.e(b, c5957kT.a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ic$c */
    public static final class c implements InterfaceC6349lp0 {
        public static final c a = new c();
        public static final C3122aK b = C3122aK.a("eventsDroppedCount").b(C0724Eb.b().c(1).a()).a();
        public static final C3122aK c = C3122aK.a("reason").b(C0724Eb.b().c(3).a()).a();

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C0629Dd0 c0629Dd0, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.b(b, c0629Dd0.a());
            interfaceC6628mp0.e(c, c0629Dd0.b());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ic$d */
    public static final class d implements InterfaceC6349lp0 {
        public static final d a = new d();
        public static final C3122aK b = C3122aK.a("logSource").b(C0724Eb.b().c(1).a()).a();
        public static final C3122aK c = C3122aK.a("logEventDropped").b(C0724Eb.b().c(2).a()).a();

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1253Jd0 c1253Jd0, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.e(b, c1253Jd0.b());
            interfaceC6628mp0.e(c, c1253Jd0.a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ic$e */
    public static final class e implements InterfaceC6349lp0 {
        public static final e a = new e();
        public static final C3122aK b = C3122aK.d("clientMetrics");

        @Override // com.daaw.BG
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            AbstractC6314li0.a(obj);
            b(null, (InterfaceC6628mp0) obj2);
        }

        public void b(UA0 ua0, InterfaceC6628mp0 interfaceC6628mp0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ic$f */
    public static final class f implements InterfaceC6349lp0 {
        public static final f a = new f();
        public static final C3122aK b = C3122aK.a("currentCacheSizeBytes").b(C0724Eb.b().c(1).a()).a();
        public static final C3122aK c = C3122aK.a("maxCacheSizeBytes").b(C0724Eb.b().c(2).a()).a();

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AX0 ax0, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.b(b, ax0.a());
            interfaceC6628mp0.b(c, ax0.b());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ic$g */
    public static final class g implements InterfaceC6349lp0 {
        public static final g a = new g();
        public static final C3122aK b = C3122aK.a("startMs").b(C0724Eb.b().c(1).a()).a();
        public static final C3122aK c = C3122aK.a("endMs").b(C0724Eb.b().c(2).a()).a();

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(J31 j31, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.b(b, j31.b());
            interfaceC6628mp0.b(c, j31.a());
        }
    }

    @Override // com.daaw.InterfaceC9986yq
    public void a(DG dg) {
        dg.a(UA0.class, e.a);
        dg.a(C2659Wl.class, a.a);
        dg.a(J31.class, g.a);
        dg.a(C1253Jd0.class, d.a);
        dg.a(C0629Dd0.class, c.a);
        dg.a(C5957kT.class, b.a);
        dg.a(AX0.class, f.a);
    }
}
