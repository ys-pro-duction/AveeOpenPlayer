package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ZS0 extends YS0 {
    public final C71 C;
    public final List D;
    public final boolean E;
    public final InterfaceC4346ej0 F;
    public final NQ G;

    public ZS0(C71 c71, List list, boolean z, InterfaceC4346ej0 interfaceC4346ej0, NQ nq) {
        G10.g(c71, "constructor");
        G10.g(list, "arguments");
        G10.g(interfaceC4346ej0, "memberScope");
        G10.g(nq, "refinedTypeFactory");
        this.C = c71;
        this.D = list;
        this.E = z;
        this.F = interfaceC4346ej0;
        this.G = nq;
        if (!(q() instanceof C9272wH) || (q() instanceof C10048z31)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + q() + '\n' + N0());
    }

    @Override // com.daaw.I80
    public List L0() {
        return this.D;
    }

    @Override // com.daaw.I80
    public C8387t71 M0() {
        return C8387t71.C.j();
    }

    @Override // com.daaw.I80
    public C71 N0() {
        return this.C;
    }

    @Override // com.daaw.I80
    public boolean O0() {
        return this.E;
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: U0 */
    public YS0 R0(boolean z) {
        return z == O0() ? this : z ? new C4376ep0(this) : new C0985Go0(this);
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: V0 */
    public YS0 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return c8387t71.isEmpty() ? this : new C3438bT0(this, c8387t71);
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public YS0 X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        YS0 ys0 = (YS0) this.G.invoke(q80);
        return ys0 == null ? this : ys0;
    }

    @Override // com.daaw.I80
    public InterfaceC4346ej0 q() {
        return this.F;
    }
}
