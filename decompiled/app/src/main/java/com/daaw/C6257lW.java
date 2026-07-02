package com.daaw;

import com.daaw.H3;

/* JADX INFO: renamed from: com.daaw.lW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6257lW extends AbstractC6399m00 implements InterfaceC2272Ss0 {
    public final H3.b C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6257lW(H3.b bVar, NQ nq) {
        super(nq);
        G10.g(bVar, "horizontal");
        G10.g(nq, "inspectorInfo");
        this.C = bVar;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.InterfaceC2272Ss0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6489mK0 L(InterfaceC4988gz interfaceC4988gz, Object obj) {
        G10.g(interfaceC4988gz, "<this>");
        C6489mK0 c6489mK0 = obj instanceof C6489mK0 ? (C6489mK0) obj : null;
        if (c6489mK0 == null) {
            c6489mK0 = new C6489mK0(0.0f, false, null, 7, null);
        }
        c6489mK0.d(AbstractC0696Du.a.a(this.C));
        return c6489mK0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C6257lW c6257lW = obj instanceof C6257lW ? (C6257lW) obj : null;
        if (c6257lW == null) {
            return false;
        }
        return G10.c(this.C, c6257lW.C);
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
        return this.C.hashCode();
    }

    public String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.C + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
