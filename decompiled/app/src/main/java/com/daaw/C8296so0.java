package com.daaw;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.so0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8296so0 extends AbstractC9751y implements U30 {
    public static final C8296so0 C = new C8296so0();

    public C8296so0() {
        super(U30.k);
    }

    @Override // com.daaw.U30
    public InterfaceC9531xC E0(NQ nq) {
        return C8575to0.B;
    }

    @Override // com.daaw.U30
    public CancellationException R() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // com.daaw.U30
    public InterfaceC9531xC Y(boolean z, boolean z2, NQ nq) {
        return C8575to0.B;
    }

    @Override // com.daaw.U30
    public boolean d() {
        return true;
    }

    @Override // com.daaw.U30
    public U30 getParent() {
        return null;
    }

    @Override // com.daaw.U30
    public Object o0(InterfaceC1416Ks interfaceC1416Ks) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // com.daaw.U30
    public InterfaceC1176Ik s0(InterfaceC1384Kk interfaceC1384Kk) {
        return C8575to0.B;
    }

    @Override // com.daaw.U30
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // com.daaw.U30, com.daaw.QE0
    public void j(CancellationException cancellationException) {
    }
}
