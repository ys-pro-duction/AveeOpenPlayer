package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1595Ml {
    public final InterfaceC2733Xd1 a;
    public int b;
    public C7223ox0 c;

    public C1595Ml(InterfaceC2733Xd1 interfaceC2733Xd1) {
        G10.g(interfaceC2733Xd1, "viewConfiguration");
        this.a = interfaceC2733Xd1;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b(C7223ox0 c7223ox0, C7223ox0 c7223ox02) {
        G10.g(c7223ox0, "prevClick");
        G10.g(c7223ox02, "newClick");
        return ((double) C9982yp0.j(C9982yp0.p(c7223ox02.f(), c7223ox0.f()))) < 100.0d;
    }

    public final boolean c(C7223ox0 c7223ox0, C7223ox0 c7223ox02) {
        G10.g(c7223ox0, "prevClick");
        G10.g(c7223ox02, "newClick");
        return c7223ox02.k() - c7223ox0.k() < this.a.a();
    }

    public final void d(C4134dx0 c4134dx0) {
        G10.g(c4134dx0, "event");
        C7223ox0 c7223ox0 = this.c;
        C7223ox0 c7223ox02 = (C7223ox0) c4134dx0.c().get(0);
        if (c7223ox0 != null && c(c7223ox0, c7223ox02) && b(c7223ox0, c7223ox02)) {
            this.b++;
        } else {
            this.b = 1;
        }
        this.c = c7223ox02;
    }
}
