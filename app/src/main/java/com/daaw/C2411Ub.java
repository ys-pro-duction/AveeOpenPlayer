package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2411Ub extends AbstractC8699uF {
    public InterfaceC10173zX G;

    public C2411Ub() {
        super(0, 0.5f, 0.5f);
        this.G = null;
        Y(null);
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        super.B(th0, abstractC7070oQ);
    }

    public void Y(InterfaceC10173zX interfaceC10173zX) {
        this.G = interfaceC10173zX;
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "AudioProvider";
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        InterfaceC10173zX interfaceC10173zXA = NO0.a(c2591Vu.h("sampleProvider").D("Spectrum"), this.G);
        this.G = interfaceC10173zXA;
        if (interfaceC10173zXA != null) {
            interfaceC10173zXA.a(c2591Vu);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        return super.v(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        InterfaceC10173zX interfaceC10173zX = this.G;
        if (interfaceC10173zX != null) {
            interfaceC10173zX.p(interfaceC9336wX, interfaceC9336wX.b().b());
            interfaceC9336wX.b().a().p(this.G.c());
            interfaceC9336wX.b().a().q(this.G.j());
        }
        interfaceC9336wX.b().a().a(this.G);
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        c2591Vu.s0(j(JD0.y6));
        c2591Vu.G("sampleProvider", NO0.b(this.G, "Spectrum"), "0_general", NO0.a);
        InterfaceC10173zX interfaceC10173zX = this.G;
        if (interfaceC10173zX != null) {
            interfaceC10173zX.q(c2591Vu);
        }
    }
}
