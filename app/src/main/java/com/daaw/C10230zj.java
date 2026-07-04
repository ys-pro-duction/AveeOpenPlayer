package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10230zj extends YS0 implements InterfaceC1068Hj {
    public final InterfaceC6440m81 C;
    public final InterfaceC0539Cj D;
    public final boolean E;
    public final C8387t71 F;

    public /* synthetic */ C10230zj(InterfaceC6440m81 interfaceC6440m81, InterfaceC0539Cj interfaceC0539Cj, boolean z, C8387t71 c8387t71, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC6440m81, (i & 2) != 0 ? new C0652Dj(interfaceC6440m81) : interfaceC0539Cj, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C8387t71.C.j() : c8387t71);
    }

    @Override // com.daaw.I80
    public List L0() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.I80
    public C8387t71 M0() {
        return this.F;
    }

    @Override // com.daaw.I80
    public boolean O0() {
        return this.E;
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: V0 */
    public YS0 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return new C10230zj(this.C, N0(), O0(), c8387t71);
    }

    @Override // com.daaw.I80
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public InterfaceC0539Cj N0() {
        return this.D;
    }

    @Override // com.daaw.YS0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C10230zj R0(boolean z) {
        return z == O0() ? this : new C10230zj(this.C, N0(), z, M0());
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C10230zj X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        InterfaceC6440m81 interfaceC6440m81A = this.C.a(q80);
        G10.f(interfaceC6440m81A, "refine(...)");
        return new C10230zj(interfaceC6440m81A, N0(), O0(), M0());
    }

    @Override // com.daaw.I80
    public InterfaceC4346ej0 q() {
        return BH.a(EnumC9551xH.C, true, new String[0]);
    }

    @Override // com.daaw.YS0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.C);
        sb.append(')');
        sb.append(O0() ? "?" : "");
        return sb.toString();
    }

    public C10230zj(InterfaceC6440m81 interfaceC6440m81, InterfaceC0539Cj interfaceC0539Cj, boolean z, C8387t71 c8387t71) {
        G10.g(interfaceC6440m81, "typeProjection");
        G10.g(interfaceC0539Cj, "constructor");
        G10.g(c8387t71, "attributes");
        this.C = interfaceC6440m81;
        this.D = interfaceC0539Cj;
        this.E = z;
        this.F = c8387t71;
    }
}
