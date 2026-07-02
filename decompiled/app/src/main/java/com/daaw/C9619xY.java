package com.daaw;

/* JADX INFO: renamed from: com.daaw.xY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9619xY implements InterfaceC2283Sv {
    public final C9340wY B;
    public final NI0 C;
    public final OI0 D;
    public final BY E;

    public C9619xY(InterfaceC2283Sv interfaceC2283Sv, InterfaceC2283Sv interfaceC2283Sv2) {
        this.D = interfaceC2283Sv.d();
        this.E = new BY(interfaceC2283Sv.b(), interfaceC2283Sv2.b());
        this.C = interfaceC2283Sv.f();
        this.B = new C9340wY(interfaceC2283Sv.e(), interfaceC2283Sv2.e());
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
        return this.B;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 f() {
        return this.C;
    }
}
