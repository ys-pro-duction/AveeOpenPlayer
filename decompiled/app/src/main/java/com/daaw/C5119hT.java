package com.daaw;

/* JADX INFO: renamed from: com.daaw.hT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5119hT implements InterfaceC5590j80 {
    public static final C5119hT a = new C5119hT();
    public static C4755g80 b;
    public static C5034h80 c;

    public final void a(C5034h80 c5034h80) throws C5313i80 {
        if (b != null) {
            throw new C5313i80("A Koin Application has already been started");
        }
        c = c5034h80;
        b = c5034h80.b();
    }

    public C5034h80 b(NQ nq) {
        C5034h80 c5034h80A;
        G10.g(nq, "appDeclaration");
        synchronized (this) {
            c5034h80A = C5034h80.c.a();
            a.a(c5034h80A);
            nq.invoke(c5034h80A);
            c5034h80A.a();
        }
        return c5034h80A;
    }

    @Override // com.daaw.InterfaceC5590j80
    public C4755g80 get() {
        C4755g80 c4755g80 = b;
        if (c4755g80 != null) {
            return c4755g80;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }
}
