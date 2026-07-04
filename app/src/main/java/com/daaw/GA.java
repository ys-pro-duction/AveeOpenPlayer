package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class GA implements InterfaceC4077dl {
    public final InterfaceC2580Vr0 a;

    public GA(InterfaceC2580Vr0 interfaceC2580Vr0) {
        G10.g(interfaceC2580Vr0, "packageFragmentProvider");
        this.a = interfaceC2580Vr0;
    }

    @Override // com.daaw.InterfaceC4077dl
    public C3798cl a(C6607ml c6607ml) {
        C3798cl c3798clA;
        G10.g(c6607ml, "classId");
        for (InterfaceC2372Tr0 interfaceC2372Tr0 : AbstractC2996Zr0.c(this.a, c6607ml.f())) {
            if ((interfaceC2372Tr0 instanceof AbstractC8404tB) && (c3798clA = ((AbstractC8404tB) interfaceC2372Tr0).F0().a(c6607ml)) != null) {
                return c3798clA;
            }
        }
        return null;
    }
}
