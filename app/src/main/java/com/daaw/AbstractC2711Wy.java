package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2711Wy extends YS0 {
    @Override // com.daaw.I80
    public List L0() {
        return W0().L0();
    }

    @Override // com.daaw.I80
    public C8387t71 M0() {
        return W0().M0();
    }

    @Override // com.daaw.I80
    public C71 N0() {
        return W0().N0();
    }

    @Override // com.daaw.I80
    public boolean O0() {
        return W0().O0();
    }

    public abstract YS0 W0();

    @Override // com.daaw.AbstractC5708ja1
    public YS0 X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        I80 i80A = q80.a(W0());
        G10.e(i80A, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Y0((YS0) i80A);
    }

    public abstract AbstractC2711Wy Y0(YS0 ys0);

    @Override // com.daaw.I80
    public InterfaceC4346ej0 q() {
        return W0().q();
    }
}
