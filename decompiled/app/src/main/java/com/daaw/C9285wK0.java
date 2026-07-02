package com.daaw;

/* JADX INFO: renamed from: com.daaw.wK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9285wK0 implements InterfaceC8645u30 {
    public static final C9285wK0 a = new C9285wK0();

    /* JADX INFO: renamed from: com.daaw.wK0$a */
    public static final class a implements InterfaceC8366t30 {
        public final OF0 b;

        public a(OF0 of0) {
            G10.g(of0, "javaElement");
            this.b = of0;
        }

        @Override // com.daaw.RU0
        public SU0 a() {
            SU0 su0 = SU0.a;
            G10.f(su0, "NO_SOURCE_FILE");
            return su0;
        }

        @Override // com.daaw.InterfaceC8366t30
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public OF0 b() {
            return this.b;
        }

        public String toString() {
            return a.class.getName() + ": " + b();
        }
    }

    @Override // com.daaw.InterfaceC8645u30
    public InterfaceC8366t30 a(T20 t20) {
        G10.g(t20, "javaElement");
        return new a((OF0) t20);
    }
}
