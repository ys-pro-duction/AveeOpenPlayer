package com.daaw;

/* JADX INFO: renamed from: com.daaw.As, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0367As extends AbstractC4993h0 implements XY {
    public final InterfaceC1376Ki c;
    public final C2352Tm0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0367As(InterfaceC1376Ki interfaceC1376Ki, I80 i80, C2352Tm0 c2352Tm0, TE0 te0) {
        super(i80, te0);
        G10.g(interfaceC1376Ki, "declarationDescriptor");
        G10.g(i80, "receiverType");
        this.c = interfaceC1376Ki;
        this.d = c2352Tm0;
    }

    @Override // com.daaw.XY
    public C2352Tm0 a() {
        return this.d;
    }

    public InterfaceC1376Ki c() {
        return this.c;
    }

    public String toString() {
        return "Cxt { " + c() + " }";
    }
}
