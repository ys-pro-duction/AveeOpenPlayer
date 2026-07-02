package com.daaw;

/* JADX INFO: renamed from: com.daaw.Jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1280Jk extends W30 implements InterfaceC1176Ik {
    public final InterfaceC1384Kk F;

    public C1280Jk(InterfaceC1384Kk interfaceC1384Kk) {
        this.F = interfaceC1384Kk;
    }

    @Override // com.daaw.InterfaceC1176Ik
    public boolean c(Throwable th) {
        return x().D(th);
    }

    @Override // com.daaw.InterfaceC1176Ik
    public U30 getParent() {
        return x();
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        w((Throwable) obj);
        return G91.a;
    }

    @Override // com.daaw.AbstractC2251Sn
    public void w(Throwable th) {
        this.F.b1(x());
    }
}
