package com.daaw;

/* JADX INFO: renamed from: com.daaw.s90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8117s90 extends AbstractC6399m00 implements InterfaceC2272Ss0, InterfaceC8675u90 {
    public final Object C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8117s90(Object obj, NQ nq) {
        super(nq);
        G10.g(obj, "layoutId");
        G10.g(nq, "inspectorInfo");
        this.C = obj;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.InterfaceC2272Ss0
    public Object L(InterfaceC4988gz interfaceC4988gz, Object obj) {
        G10.g(interfaceC4988gz, "<this>");
        return this;
    }

    @Override // com.daaw.InterfaceC8675u90
    public Object a() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C8117s90 c8117s90 = obj instanceof C8117s90 ? (C8117s90) obj : null;
        if (c8117s90 == null) {
            return false;
        }
        return G10.c(a(), c8117s90.a());
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "LayoutId(id=" + a() + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
