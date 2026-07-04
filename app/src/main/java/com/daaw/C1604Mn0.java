package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Mn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1604Mn0 extends YS0 implements InterfaceC1068Hj {
    public final EnumC9951yj C;
    public final C2146Rn0 D;
    public final AbstractC5708ja1 E;
    public final C8387t71 F;
    public final boolean G;
    public final boolean H;

    public /* synthetic */ C1604Mn0(EnumC9951yj enumC9951yj, C2146Rn0 c2146Rn0, AbstractC5708ja1 abstractC5708ja1, C8387t71 c8387t71, boolean z, boolean z2, int i, AbstractC2911Yw abstractC2911Yw) {
        this(enumC9951yj, c2146Rn0, abstractC5708ja1, (i & 8) != 0 ? C8387t71.C.j() : c8387t71, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
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
        return this.G;
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: V0 */
    public YS0 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return new C1604Mn0(this.C, N0(), this.E, c8387t71, O0(), this.H);
    }

    public final EnumC9951yj W0() {
        return this.C;
    }

    @Override // com.daaw.I80
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C2146Rn0 N0() {
        return this.D;
    }

    public final AbstractC5708ja1 Y0() {
        return this.E;
    }

    public final boolean Z0() {
        return this.H;
    }

    @Override // com.daaw.YS0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C1604Mn0 R0(boolean z) {
        return new C1604Mn0(this.C, N0(), this.E, M0(), z, false, 32, null);
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C1604Mn0 X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        EnumC9951yj enumC9951yj = this.C;
        C2146Rn0 c2146Rn0A = N0().a(q80);
        AbstractC5708ja1 abstractC5708ja1 = this.E;
        return new C1604Mn0(enumC9951yj, c2146Rn0A, abstractC5708ja1 != null ? q80.a(abstractC5708ja1).Q0() : null, M0(), O0(), false, 32, null);
    }

    @Override // com.daaw.I80
    public InterfaceC4346ej0 q() {
        return BH.a(EnumC9551xH.C, true, new String[0]);
    }

    public C1604Mn0(EnumC9951yj enumC9951yj, C2146Rn0 c2146Rn0, AbstractC5708ja1 abstractC5708ja1, C8387t71 c8387t71, boolean z, boolean z2) {
        G10.g(enumC9951yj, "captureStatus");
        G10.g(c2146Rn0, "constructor");
        G10.g(c8387t71, "attributes");
        this.C = enumC9951yj;
        this.D = c2146Rn0;
        this.E = abstractC5708ja1;
        this.F = c8387t71;
        this.G = z;
        this.H = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1604Mn0(EnumC9951yj enumC9951yj, AbstractC5708ja1 abstractC5708ja1, InterfaceC6440m81 interfaceC6440m81, Z71 z71) {
        this(enumC9951yj, new C2146Rn0(interfaceC6440m81, null, null, z71, 6, null), abstractC5708ja1, null, false, false, 56, null);
        G10.g(enumC9951yj, "captureStatus");
        G10.g(interfaceC6440m81, "projection");
        G10.g(z71, "typeParameter");
    }
}
