package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class EK implements InterfaceC2283Sv {
    public final NI0 B;
    public final FK C;
    public final C1571Mf D = new C1571Mf();
    public final CG E = C1920Po0.b();

    public EK(InterfaceC1883Pf interfaceC1883Pf, EnumC0591Cw enumC0591Cw) {
        this.B = new SK(new OX0(interfaceC1883Pf, enumC0591Cw));
        this.C = new FK(interfaceC1883Pf, enumC0591Cw);
    }

    @Override // com.daaw.InterfaceC2283Sv
    public CG b() {
        return this.E;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public OI0 d() {
        return this.D;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 e() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 f() {
        return this.B;
    }
}
