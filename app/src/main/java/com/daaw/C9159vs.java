package com.daaw;

/* JADX INFO: renamed from: com.daaw.vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9159vs extends AbstractC4993h0 implements XY {
    public final InterfaceC4923gl c;
    public final C2352Tm0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9159vs(InterfaceC4923gl interfaceC4923gl, I80 i80, C2352Tm0 c2352Tm0, TE0 te0) {
        super(i80, te0);
        G10.g(interfaceC4923gl, "classDescriptor");
        G10.g(i80, "receiverType");
        this.c = interfaceC4923gl;
        this.d = c2352Tm0;
    }

    @Override // com.daaw.XY
    public C2352Tm0 a() {
        return this.d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.c + " }";
    }
}
