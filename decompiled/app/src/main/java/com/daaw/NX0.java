package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class NX0 implements InterfaceC2283Sv {
    public final OX0 B;
    public final C1571Mf C;
    public final QX0 D = new QX0();
    public final SK E;

    public NX0(InterfaceC1883Pf interfaceC1883Pf, EnumC0591Cw enumC0591Cw) {
        OX0 ox0 = new OX0(interfaceC1883Pf, enumC0591Cw);
        this.B = ox0;
        this.C = new C1571Mf();
        this.E = new SK(ox0);
    }

    @Override // com.daaw.InterfaceC2283Sv
    public CG b() {
        return this.D;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public OI0 d() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 e() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 f() {
        return this.E;
    }
}
