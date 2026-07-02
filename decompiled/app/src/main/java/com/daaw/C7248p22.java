package com.daaw;

/* JADX INFO: renamed from: com.daaw.p22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7248p22 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C7248p22(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        C8068rz1 c8068rz1 = (C8068rz1) this.a.zzb();
        EL1 el1 = (EL1) this.b.zzb();
        PS2 ps2A = AbstractC5074hH2.a();
        AbstractC7000o83.b(ps2A);
        return new C5285i22(c8068rz1.c(), el1, ps2A);
    }
}
