package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.daaw.bo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3537bo1 implements InterfaceC1190In1 {
    public final InterfaceC1190In1 a;

    public AbstractC3537bo1(InterfaceC1190In1 interfaceC1190In1) {
        this.a = interfaceC1190In1;
    }

    @Override // com.daaw.InterfaceC1190In1
    public final void b(int i) throws EOFException, InterruptedIOException {
        ((C9694xn1) this.a).l(i, false);
    }

    @Override // com.daaw.InterfaceC1190In1
    public final int c(int i) {
        throw null;
    }

    @Override // com.daaw.InterfaceC1190In1, com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) {
        return this.a.d(bArr, i, i2);
    }

    @Override // com.daaw.InterfaceC1190In1
    public final void e(int i) throws EOFException, InterruptedIOException {
        ((C9694xn1) this.a).m(i, false);
    }

    @Override // com.daaw.InterfaceC1190In1
    public final boolean f(byte[] bArr, int i, int i2, boolean z) {
        return this.a.f(bArr, 0, 8, true);
    }

    @Override // com.daaw.InterfaceC1190In1
    public final int g(byte[] bArr, int i, int i2) {
        throw null;
    }

    @Override // com.daaw.InterfaceC1190In1
    public final boolean h(byte[] bArr, int i, int i2, boolean z) {
        return this.a.h(bArr, 0, 8, true);
    }

    @Override // com.daaw.InterfaceC1190In1
    public final void i(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        ((C9694xn1) this.a).f(bArr, i, i2, false);
    }

    @Override // com.daaw.InterfaceC1190In1
    public final void j(byte[] bArr, int i, int i2) {
        ((C9694xn1) this.a).h(bArr, i, i2, false);
    }

    @Override // com.daaw.InterfaceC1190In1
    public long zzd() {
        return this.a.zzd();
    }

    @Override // com.daaw.InterfaceC1190In1
    public long zze() {
        return this.a.zze();
    }

    @Override // com.daaw.InterfaceC1190In1
    public long zzf() {
        return this.a.zzf();
    }

    @Override // com.daaw.InterfaceC1190In1
    public final void zzj() {
        this.a.zzj();
    }
}
