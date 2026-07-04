package com.daaw;

/* JADX INFO: renamed from: com.daaw.vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9099vg extends AbstractC6399m00 implements InterfaceC2272Ss0 {
    public H3 C;
    public boolean D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9099vg(H3 h3, boolean z, NQ nq) {
        super(nq);
        G10.g(h3, "alignment");
        G10.g(nq, "inspectorInfo");
        this.C = h3;
        this.D = z;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public final H3 c() {
        return this.C;
    }

    public final boolean d() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C9099vg c9099vg = obj instanceof C9099vg ? (C9099vg) obj : null;
        return c9099vg != null && G10.c(this.C, c9099vg.C) && this.D == c9099vg.D;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    @Override // com.daaw.InterfaceC2272Ss0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C9099vg L(InterfaceC4988gz interfaceC4988gz, Object obj) {
        G10.g(interfaceC4988gz, "<this>");
        return this;
    }

    public int hashCode() {
        return (this.C.hashCode() * 31) + AbstractC8813ug.a(this.D);
    }

    public String toString() {
        return "BoxChildData(alignment=" + this.C + ", matchParentSize=" + this.D + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
