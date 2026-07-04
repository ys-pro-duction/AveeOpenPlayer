package com.daaw;

/* JADX INFO: renamed from: com.daaw.js0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5797js0 {
    public static final a a = a.a;

    /* JADX INFO: renamed from: com.daaw.js0$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C2448Uk0 b = new C2448Uk0("PackageViewDescriptorFactory");

        public final C2448Uk0 a() {
            return b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.js0$b */
    public static final class b implements InterfaceC5797js0 {
        public static final b b = new b();

        @Override // com.daaw.InterfaceC5797js0
        public InterfaceC5516is0 a(C3799cl0 c3799cl0, AP ap, InterfaceC10174zX0 interfaceC10174zX0) {
            G10.g(c3799cl0, "module");
            G10.g(ap, "fqName");
            G10.g(interfaceC10174zX0, "storageManager");
            return new C4595fb0(c3799cl0, ap, interfaceC10174zX0);
        }
    }

    InterfaceC5516is0 a(C3799cl0 c3799cl0, AP ap, InterfaceC10174zX0 interfaceC10174zX0);
}
