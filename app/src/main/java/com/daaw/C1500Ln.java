package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1500Ln extends C3889d40 implements InterfaceC1396Kn {
    public C1500Ln(U30 u30) {
        super(true);
        d0(u30);
    }

    @Override // com.daaw.InterfaceC1396Kn
    public boolean B0(Object obj) {
        return j0(obj);
    }

    @Override // com.daaw.C3889d40
    public boolean V() {
        return true;
    }

    @Override // com.daaw.InterfaceC1396Kn
    public boolean c(Throwable th) {
        return j0(new C2041Qn(th, false, 2, null));
    }

    @Override // com.daaw.InterfaceC8062ry
    public Object s() {
        return P();
    }

    @Override // com.daaw.InterfaceC8062ry
    public Object w0(InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        Object objT = t(interfaceC1416Ks);
        I10.c();
        return objT;
    }
}
