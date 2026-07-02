package com.daaw;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7345pP implements InterfaceC8464tQ, AutoCloseable {
    public final InterfaceC8464tQ B;

    public AbstractC7345pP(InterfaceC8464tQ interfaceC8464tQ) {
        this.B = (InterfaceC8464tQ) AbstractC7785qy0.o(interfaceC8464tQ, "delegate");
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void D0(int i, EnumC7034oH enumC7034oH, byte[] bArr) {
        this.B.D0(i, enumC7034oH, bArr);
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void M() {
        this.B.M();
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void R0(CQ0 cq0) {
        this.B.R0(cq0);
    }

    @Override // com.daaw.InterfaceC8464tQ
    public int V0() {
        return this.B.V0();
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void W0(boolean z, boolean z2, int i, int i2, List list) {
        this.B.W0(z, z2, i, i2, list);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.B.close();
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void f(int i, EnumC7034oH enumC7034oH) {
        this.B.f(i, enumC7034oH);
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void flush() {
        this.B.flush();
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void g(int i, long j) {
        this.B.g(i, j);
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void h(boolean z, int i, int i2) {
        this.B.h(z, i, i2);
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void k0(CQ0 cq0) {
        this.B.k0(cq0);
    }

    @Override // com.daaw.InterfaceC8464tQ
    public void x(boolean z, int i, C4057dh c4057dh, int i2) {
        this.B.x(z, i, c4057dh, i2);
    }
}
