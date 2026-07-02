package com.daaw;

/* JADX INFO: renamed from: com.daaw.yY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9898yY implements InterfaceC2283Sv {
    public final NI0 B;
    public final NI0 C;
    public final OI0 D;
    public final CG E;

    public C9898yY(InterfaceC2283Sv interfaceC2283Sv, InterfaceC2283Sv interfaceC2283Sv2, InterfaceC1883Pf interfaceC1883Pf) {
        DS ds = new DS(interfaceC2283Sv.e(), interfaceC2283Sv2.e(), interfaceC1883Pf);
        this.B = new SK(new FS(ds));
        this.C = ds;
        this.D = new ES(interfaceC2283Sv.d(), interfaceC2283Sv2.d());
        this.E = interfaceC2283Sv.b();
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
