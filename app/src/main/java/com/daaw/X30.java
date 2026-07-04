package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class X30 extends C3889d40 implements InterfaceC1707Nn {
    public final boolean D;

    public X30(U30 u30) {
        super(true);
        d0(u30);
        this.D = R0();
    }

    public final boolean R0() {
        C3889d40 c3889d40X;
        InterfaceC1176Ik interfaceC1176IkZ = Z();
        C1280Jk c1280Jk = interfaceC1176IkZ instanceof C1280Jk ? (C1280Jk) interfaceC1176IkZ : null;
        if (c1280Jk != null && (c3889d40X = c1280Jk.x()) != null) {
            while (!c3889d40X.T()) {
                InterfaceC1176Ik interfaceC1176IkZ2 = c3889d40X.Z();
                C1280Jk c1280Jk2 = interfaceC1176IkZ2 instanceof C1280Jk ? (C1280Jk) interfaceC1176IkZ2 : null;
                if (c1280Jk2 == null || (c3889d40X = c1280Jk2.x()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.C3889d40
    public boolean T() {
        return this.D;
    }

    @Override // com.daaw.C3889d40
    public boolean V() {
        return true;
    }

    @Override // com.daaw.InterfaceC1707Nn
    public boolean c(Throwable th) {
        return j0(new C2041Qn(th, false, 2, null));
    }
}
