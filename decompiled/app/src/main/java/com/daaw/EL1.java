package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class EL1 {
    public final C3685cL1 a;
    public InterfaceFutureC8236sc0 b;

    public EL1(C3685cL1 c3685cL1) {
        this.a = c3685cL1;
    }

    public final HL1 a(String str, InterfaceC5648jL1 interfaceC5648jL1, InterfaceC5368iL1 interfaceC5368iL1) {
        d();
        return new HL1(this.b, "google.afma.activeView.handleUpdate", interfaceC5648jL1, interfaceC5368iL1);
    }

    public final void b(final String str, final HI1 hi1) {
        d();
        this.b = AbstractC7360pS2.n(this.b, new WR2() { // from class: com.daaw.DL1
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                InterfaceC3964dL1 interfaceC3964dL1 = (InterfaceC3964dL1) obj;
                interfaceC3964dL1.g0(str, hi1);
                return AbstractC7360pS2.h(interfaceC3964dL1);
            }
        }, AbstractC9322wT1.f);
    }

    public final void c(final String str, final HI1 hi1) {
        this.b = AbstractC7360pS2.m(this.b, new WN2() { // from class: com.daaw.AL1
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                InterfaceC3964dL1 interfaceC3964dL1 = (InterfaceC3964dL1) obj;
                interfaceC3964dL1.r(str, hi1);
                return interfaceC3964dL1;
            }
        }, AbstractC9322wT1.f);
    }

    public final void d() {
        if (this.b == null) {
            final BT1 bt1 = new BT1();
            this.b = bt1;
            this.a.b(null).e(new FT1() { // from class: com.daaw.BL1
                @Override // com.daaw.FT1
                public final void zza(Object obj) {
                    bt1.b((InterfaceC3964dL1) obj);
                }
            }, new DT1() { // from class: com.daaw.CL1
                @Override // com.daaw.DT1
                public final void zza() {
                    bt1.c(new C4521fL1("Cannot get Javascript Engine"));
                }
            });
        }
    }
}
