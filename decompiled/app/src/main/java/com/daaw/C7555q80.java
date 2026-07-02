package com.daaw;

/* JADX INFO: renamed from: com.daaw.q80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7555q80 {
    public static final C7555q80 a = new C7555q80();

    public static final Object b(Class cls, InterfaceC4484fC0 interfaceC4484fC0, LQ lq) {
        G10.g(cls, "clazz");
        return c().b(X40.e(cls), interfaceC4484fC0, lq);
    }

    public static final C4755g80 c() {
        return C8112s80.a.a().get();
    }

    public static final O90 d(Class cls) {
        G10.g(cls, "clazz");
        return f(cls, null, null, 6, null);
    }

    public static final O90 e(final Class cls, final InterfaceC4484fC0 interfaceC4484fC0, final LQ lq) {
        G10.g(cls, "clazz");
        return AbstractC3192ab0.b(EnumC7395pb0.B, new LQ() { // from class: com.daaw.p80
            @Override // com.daaw.LQ
            public final Object invoke() {
                return C7555q80.g(cls, interfaceC4484fC0, lq);
            }
        });
    }

    public static /* synthetic */ O90 f(Class cls, InterfaceC4484fC0 interfaceC4484fC0, LQ lq, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC4484fC0 = null;
        }
        if ((i & 4) != 0) {
            lq = null;
        }
        return e(cls, interfaceC4484fC0, lq);
    }

    public static final Object g(Class cls, InterfaceC4484fC0 interfaceC4484fC0, LQ lq) {
        return b(cls, interfaceC4484fC0, lq);
    }
}
