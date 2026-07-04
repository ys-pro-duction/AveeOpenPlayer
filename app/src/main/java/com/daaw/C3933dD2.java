package com.daaw;

/* JADX INFO: renamed from: com.daaw.dD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3933dD2 implements TG2 {
    public final PD2 a;

    public C3933dD2(PD2 pd2) {
        this.a = pd2;
    }

    @Override // com.daaw.TG2
    public final InterfaceFutureC8236sc0 a(UG2 ug2) {
        C4211eD2 c4211eD2 = (C4211eD2) ug2;
        return ((C3097aD2) this.a).c(c4211eD2.b, c4211eD2.a, null);
    }

    @Override // com.daaw.TG2
    public final void b(IG2 ig2) {
        ig2.a = ((C3097aD2) this.a).b();
    }
}
