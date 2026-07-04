package com.daaw;

/* JADX INFO: renamed from: com.daaw.pP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7346pP0 extends H90 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7346pP0(K90 k90, InterfaceC7625qP0 interfaceC7625qP0) {
        super(k90, interfaceC7625qP0);
        G10.g(k90, "wrapped");
        G10.g(interfaceC7625qP0, "modifier");
    }

    @Override // com.daaw.H90
    public void g() {
        super.g();
        InterfaceC1413Kr0 interfaceC1413Kr0K0 = a().k0();
        if (interfaceC1413Kr0K0 != null) {
            interfaceC1413Kr0K0.l();
        }
    }

    @Override // com.daaw.H90
    public void h() {
        super.h();
        InterfaceC1413Kr0 interfaceC1413Kr0K0 = a().k0();
        if (interfaceC1413Kr0K0 != null) {
            interfaceC1413Kr0K0.l();
        }
    }

    public final C6788nP0 j() {
        C7346pP0 c7346pP0 = (C7346pP0) d();
        C7346pP0 c7346pP02 = null;
        if (c7346pP0 == null) {
            K90 k90F1 = b().f1();
            if (k90F1 != null) {
                while (k90F1 != null && !XG.m(k90F1.S0(), XG.a.f())) {
                    k90F1 = k90F1.f1();
                }
                if (k90F1 != null && (c7346pP0 = (C7346pP0) XG.n(k90F1.S0(), XG.a.f())) != null) {
                    K90 k90B = c7346pP0.b();
                    while (k90B != null) {
                        if (c7346pP0 != null) {
                            c7346pP02 = c7346pP0;
                            break;
                        }
                        k90B = k90B.f1();
                        c7346pP0 = k90B != null ? (C7346pP0) XG.n(k90B.S0(), XG.a.f()) : null;
                    }
                }
            }
        } else {
            K90 k90B2 = c7346pP0.b();
            while (k90B2 != null) {
                if (c7346pP0 != null) {
                    c7346pP02 = c7346pP0;
                    break;
                }
                k90B2 = k90B2.f1();
                c7346pP0 = k90B2 != null ? (C7346pP0) XG.n(k90B2.S0(), XG.a.f()) : null;
            }
        }
        if (c7346pP02 == null || ((InterfaceC7625qP0) c()).M().D()) {
            return ((InterfaceC7625qP0) c()).M();
        }
        C6788nP0 c6788nP0S = ((InterfaceC7625qP0) c()).M().s();
        c6788nP0S.m(c7346pP02.j());
        return c6788nP0S;
    }

    public final boolean k() {
        return AbstractC7067oP0.a(((InterfaceC7625qP0) c()).M(), C6509mP0.a.h()) != null;
    }

    public final C3103aF0 l() {
        return !f() ? C3103aF0.e.a() : !k() ? AbstractC7281p90.b(b()) : b().H1();
    }

    public String toString() {
        return super.toString() + " id: " + ((InterfaceC7625qP0) c()).getId() + " config: " + ((InterfaceC7625qP0) c()).M();
    }
}
