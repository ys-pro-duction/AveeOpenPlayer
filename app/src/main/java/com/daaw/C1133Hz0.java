package com.daaw;

import com.daaw.HP0;

/* JADX INFO: renamed from: com.daaw.Hz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1133Hz0 extends AbstractC3793ck implements InterfaceC1237Iz0 {
    public C1133Hz0(InterfaceC4684ft interfaceC4684ft, InterfaceC3236ak interfaceC3236ak) {
        super(interfaceC4684ft, interfaceC3236ak, true, true);
    }

    @Override // com.daaw.AbstractC9472x
    public void S0(Throwable th, boolean z) {
        if (V0().g(th) || z) {
            return;
        }
        AbstractC6926nt.a(getContext(), th);
    }

    @Override // com.daaw.AbstractC9472x
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public void T0(G91 g91) {
        HP0.a.a(V0(), null, 1, null);
    }

    @Override // com.daaw.AbstractC9472x, com.daaw.C3889d40, com.daaw.U30
    public boolean d() {
        return super.d();
    }
}
