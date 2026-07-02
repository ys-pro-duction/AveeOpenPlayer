package com.daaw;

/* JADX INFO: renamed from: com.daaw.qx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7781qx0 extends H90 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7781qx0(K90 k90, InterfaceC9461wx0 interfaceC9461wx0) {
        super(k90, interfaceC9461wx0);
        G10.g(k90, "layoutNodeWrapper");
        G10.g(interfaceC9461wx0, "modifier");
    }

    @Override // com.daaw.H90
    public void g() {
        super.g();
        ((InterfaceC9461wx0) c()).C().n0(b());
        ((InterfaceC9461wx0) c()).C().m0(true);
    }

    @Override // com.daaw.H90
    public void h() {
        super.h();
        ((InterfaceC9461wx0) c()).C().m0(false);
    }

    public final boolean j() {
        if (((InterfaceC9461wx0) c()).C().i0()) {
            return true;
        }
        C7781qx0 c7781qx0 = (C7781qx0) d();
        return c7781qx0 != null ? c7781qx0.j() : false;
    }
}
