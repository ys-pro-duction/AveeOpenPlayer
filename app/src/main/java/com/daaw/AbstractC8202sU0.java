package com.daaw;

/* JADX INFO: renamed from: com.daaw.sU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8202sU0 {
    public static final BU0 a = new BU0();
    public static final BU0 b = new BU0();

    public static final InterfaceC6258lW0 c(LQ lq) {
        G10.g(lq, "calculation");
        return new C10026yz(lq);
    }

    public static final void d(NQ nq, NQ nq2, LQ lq) {
        G10.g(nq, "start");
        G10.g(nq2, "done");
        G10.g(lq, "block");
        BU0 bu0 = a;
        InterfaceC4969gu0 interfaceC4969gu0 = (InterfaceC4969gu0) bu0.a();
        try {
            InterfaceC4969gu0 interfaceC4969gu0B = (InterfaceC4969gu0) bu0.a();
            if (interfaceC4969gu0B == null) {
                interfaceC4969gu0B = AbstractC7878rJ.b();
            }
            bu0.b(interfaceC4969gu0B.add((Object) D61.a(nq, nq2)));
            lq.invoke();
            bu0.b(interfaceC4969gu0);
        } catch (Throwable th) {
            a.b(interfaceC4969gu0);
            throw th;
        }
    }
}
