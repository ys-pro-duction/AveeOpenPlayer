package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.ej1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4347ej1 extends I80 {
    public AbstractC4347ej1() {
        super(null);
    }

    @Override // com.daaw.I80
    public List L0() {
        return R0().L0();
    }

    @Override // com.daaw.I80
    public C8387t71 M0() {
        return R0().M0();
    }

    @Override // com.daaw.I80
    public C71 N0() {
        return R0().N0();
    }

    @Override // com.daaw.I80
    public boolean O0() {
        return R0().O0();
    }

    @Override // com.daaw.I80
    public final AbstractC5708ja1 Q0() {
        I80 i80R0 = R0();
        while (i80R0 instanceof AbstractC4347ej1) {
            i80R0 = ((AbstractC4347ej1) i80R0).R0();
        }
        G10.e(i80R0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (AbstractC5708ja1) i80R0;
    }

    public abstract I80 R0();

    public abstract boolean S0();

    @Override // com.daaw.I80
    public InterfaceC4346ej0 q() {
        return R0().q();
    }

    public String toString() {
        return S0() ? R0().toString() : "<Not computed yet>";
    }
}
