package com.daaw;

import java.io.EOFException;

/* JADX INFO: renamed from: com.daaw.Gn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0982Gn1 implements InterfaceC8576to1 {
    public final byte[] a = new byte[4096];

    @Override // com.daaw.InterfaceC8576to1
    public final void a(C5900kE2 c5900kE2, int i, int i2) {
        c5900kE2.h(i);
    }

    @Override // com.daaw.InterfaceC8576to1
    public final /* synthetic */ void b(C5900kE2 c5900kE2, int i) {
        AbstractC8018ro1.b(this, c5900kE2, i);
    }

    @Override // com.daaw.InterfaceC8576to1
    public final int d(InterfaceC8304sp3 interfaceC8304sp3, int i, boolean z, int i2) throws EOFException {
        int iD = interfaceC8304sp3.d(this.a, 0, Math.min(4096, i));
        if (iD != -1) {
            return iD;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.daaw.InterfaceC8576to1
    public final /* synthetic */ int f(InterfaceC8304sp3 interfaceC8304sp3, int i, boolean z) {
        return AbstractC8018ro1.a(this, interfaceC8304sp3, i, z);
    }

    @Override // com.daaw.InterfaceC8576to1
    public final void e(C2485Ut1 c2485Ut1) {
    }

    @Override // com.daaw.InterfaceC8576to1
    public final void c(long j, int i, int i2, int i3, C8297so1 c8297so1) {
    }
}
