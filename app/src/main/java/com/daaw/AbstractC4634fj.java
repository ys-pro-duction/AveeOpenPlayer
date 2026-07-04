package com.daaw;

/* JADX INFO: renamed from: com.daaw.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4634fj {
    public static final void a(InterfaceC3788cj interfaceC3788cj, InterfaceC9531xC interfaceC9531xC) {
        interfaceC3788cj.r(new AC(interfaceC9531xC));
    }

    public static final C4067dj b(InterfaceC1416Ks interfaceC1416Ks) {
        if (!(interfaceC1416Ks instanceof C6177lC)) {
            return new C4067dj(interfaceC1416Ks, 1);
        }
        C4067dj c4067djJ = ((C6177lC) interfaceC1416Ks).j();
        if (c4067djJ != null) {
            if (!c4067djJ.J()) {
                c4067djJ = null;
            }
            if (c4067djJ != null) {
                return c4067djJ;
            }
        }
        return new C4067dj(interfaceC1416Ks, 2);
    }
}
