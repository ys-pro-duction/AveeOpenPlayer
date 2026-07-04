package com.daaw;

/* JADX INFO: renamed from: com.daaw.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4599fc implements InterfaceC9986yq {
    public static final InterfaceC9986yq a = new C4599fc();

    /* JADX INFO: renamed from: com.daaw.fc$a */
    public static final class a implements InterfaceC6349lp0 {
        public static final a a = new a();
        public static final C3122aK b = C3122aK.d("sdkVersion");
        public static final C3122aK c = C3122aK.d("model");
        public static final C3122aK d = C3122aK.d("hardware");
        public static final C3122aK e = C3122aK.d("device");
        public static final C3122aK f = C3122aK.d("product");
        public static final C3122aK g = C3122aK.d("osBuild");
        public static final C3122aK h = C3122aK.d("manufacturer");
        public static final C3122aK i = C3122aK.d("fingerprint");
        public static final C3122aK j = C3122aK.d("locale");
        public static final C3122aK k = C3122aK.d("country");
        public static final C3122aK l = C3122aK.d("mccMnc");
        public static final C3122aK m = C3122aK.d("applicationBuild");

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC4171e5 abstractC4171e5, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.e(b, abstractC4171e5.m());
            interfaceC6628mp0.e(c, abstractC4171e5.j());
            interfaceC6628mp0.e(d, abstractC4171e5.f());
            interfaceC6628mp0.e(e, abstractC4171e5.d());
            interfaceC6628mp0.e(f, abstractC4171e5.l());
            interfaceC6628mp0.e(g, abstractC4171e5.k());
            interfaceC6628mp0.e(h, abstractC4171e5.h());
            interfaceC6628mp0.e(i, abstractC4171e5.e());
            interfaceC6628mp0.e(j, abstractC4171e5.g());
            interfaceC6628mp0.e(k, abstractC4171e5.c());
            interfaceC6628mp0.e(l, abstractC4171e5.i());
            interfaceC6628mp0.e(m, abstractC4171e5.b());
        }
    }

    /* JADX INFO: renamed from: com.daaw.fc$b */
    public static final class b implements InterfaceC6349lp0 {
        public static final b a = new b();
        public static final C3122aK b = C3122aK.d("logRequest");

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC2423Ue abstractC2423Ue, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.e(b, abstractC2423Ue.c());
        }
    }

    /* JADX INFO: renamed from: com.daaw.fc$c */
    public static final class c implements InterfaceC6349lp0 {
        public static final c a = new c();
        public static final C3122aK b = C3122aK.d("clientType");
        public static final C3122aK c = C3122aK.d("androidClientInfo");

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC2137Rl abstractC2137Rl, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.e(b, abstractC2137Rl.c());
            interfaceC6628mp0.e(c, abstractC2137Rl.b());
        }
    }

    /* JADX INFO: renamed from: com.daaw.fc$d */
    public static final class d implements InterfaceC6349lp0 {
        public static final d a = new d();
        public static final C3122aK b = C3122aK.d("eventTimeMs");
        public static final C3122aK c = C3122aK.d("eventCode");
        public static final C3122aK d = C3122aK.d("eventUptimeMs");
        public static final C3122aK e = C3122aK.d("sourceExtension");
        public static final C3122aK f = C3122aK.d("sourceExtensionJsonProto3");
        public static final C3122aK g = C3122aK.d("timezoneOffsetSeconds");
        public static final C3122aK h = C3122aK.d("networkConnectionInfo");

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC0516Cd0 abstractC0516Cd0, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.b(b, abstractC0516Cd0.c());
            interfaceC6628mp0.e(c, abstractC0516Cd0.b());
            interfaceC6628mp0.b(d, abstractC0516Cd0.d());
            interfaceC6628mp0.e(e, abstractC0516Cd0.f());
            interfaceC6628mp0.e(f, abstractC0516Cd0.g());
            interfaceC6628mp0.b(g, abstractC0516Cd0.h());
            interfaceC6628mp0.e(h, abstractC0516Cd0.e());
        }
    }

    /* JADX INFO: renamed from: com.daaw.fc$e */
    public static final class e implements InterfaceC6349lp0 {
        public static final e a = new e();
        public static final C3122aK b = C3122aK.d("requestTimeMs");
        public static final C3122aK c = C3122aK.d("requestUptimeMs");
        public static final C3122aK d = C3122aK.d("clientInfo");
        public static final C3122aK e = C3122aK.d("logSource");
        public static final C3122aK f = C3122aK.d("logSourceName");
        public static final C3122aK g = C3122aK.d("logEvent");
        public static final C3122aK h = C3122aK.d("qosTier");

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC1045Hd0 abstractC1045Hd0, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.b(b, abstractC1045Hd0.g());
            interfaceC6628mp0.b(c, abstractC1045Hd0.h());
            interfaceC6628mp0.e(d, abstractC1045Hd0.b());
            interfaceC6628mp0.e(e, abstractC1045Hd0.d());
            interfaceC6628mp0.e(f, abstractC1045Hd0.e());
            interfaceC6628mp0.e(g, abstractC1045Hd0.c());
            interfaceC6628mp0.e(h, abstractC1045Hd0.f());
        }
    }

    /* JADX INFO: renamed from: com.daaw.fc$f */
    public static final class f implements InterfaceC6349lp0 {
        public static final f a = new f();
        public static final C3122aK b = C3122aK.d("networkType");
        public static final C3122aK c = C3122aK.d("mobileSubtype");

        @Override // com.daaw.BG
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC0348An0 abstractC0348An0, InterfaceC6628mp0 interfaceC6628mp0) {
            interfaceC6628mp0.e(b, abstractC0348An0.c());
            interfaceC6628mp0.e(c, abstractC0348An0.b());
        }
    }

    @Override // com.daaw.InterfaceC9986yq
    public void a(DG dg) {
        b bVar = b.a;
        dg.a(AbstractC2423Ue.class, bVar);
        dg.a(C7120oc.class, bVar);
        e eVar = e.a;
        dg.a(AbstractC1045Hd0.class, eVar);
        dg.a(C3758cd.class, eVar);
        c cVar = c.a;
        dg.a(AbstractC2137Rl.class, cVar);
        dg.a(C7399pc.class, cVar);
        a aVar = a.a;
        dg.a(AbstractC4171e5.class, aVar);
        dg.a(C6283lc.class, aVar);
        d dVar = d.a;
        dg.a(AbstractC0516Cd0.class, dVar);
        dg.a(C3480bd.class, dVar);
        f fVar = f.a;
        dg.a(AbstractC0348An0.class, fVar);
        dg.a(C4315ed.class, fVar);
    }
}
