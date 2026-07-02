package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.xn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9694xn1 implements InterfaceC1190In1 {
    public final InterfaceC8304sp3 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        DM1.b("media3.extractor");
    }

    public C9694xn1(InterfaceC8304sp3 interfaceC8304sp3, long j, long j2) {
        this.b = interfaceC8304sp3;
        this.d = j;
        this.c = j2;
    }

    @Override // com.daaw.InterfaceC1190In1
    public final void b(int i) throws EOFException, InterruptedIOException {
        l(i, false);
    }

    @Override // com.daaw.InterfaceC1190In1
    public final int c(int i) throws EOFException, InterruptedIOException {
        int iP = p(1);
        if (iP == 0) {
            iP = o(this.a, 0, Math.min(1, 4096), 0, true);
        }
        q(iP);
        return iP;
    }

    @Override // com.daaw.InterfaceC1190In1, com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iN = n(bArr, i, i2);
        if (iN == 0) {
            iN = o(bArr, i, i2, 0, true);
        }
        q(iN);
        return iN;
    }

    @Override // com.daaw.InterfaceC1190In1
    public final void e(int i) throws EOFException, InterruptedIOException {
        m(i, false);
    }

    @Override // com.daaw.InterfaceC1190In1
    public final boolean f(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iN = n(bArr, i, i2);
        while (iN < i2 && iN != -1) {
            iN = o(bArr, i, i2, iN, z);
        }
        q(iN);
        return iN != -1;
    }

    @Override // com.daaw.InterfaceC1190In1
    public final int g(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        C9694xn1 c9694xn1;
        int iMin;
        r(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            c9694xn1 = this;
            iMin = c9694xn1.o(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c9694xn1.g += iMin;
        } else {
            c9694xn1 = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(c9694xn1.e, c9694xn1.f, bArr, i, iMin);
        c9694xn1.f += iMin;
        return iMin;
    }

    @Override // com.daaw.InterfaceC1190In1
    public final boolean h(byte[] bArr, int i, int i2, boolean z) {
        if (!l(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // com.daaw.InterfaceC1190In1
    public final void i(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        f(bArr, i, i2, false);
    }

    @Override // com.daaw.InterfaceC1190In1
    public final void j(byte[] bArr, int i, int i2) {
        h(bArr, i, i2, false);
    }

    public final boolean l(int i, boolean z) throws EOFException, InterruptedIOException {
        r(i);
        int iO = this.g - this.f;
        while (iO < i) {
            int i2 = i;
            boolean z2 = z;
            iO = o(this.e, this.f, i2, iO, z2);
            if (iO == -1) {
                return false;
            }
            this.g = this.f + iO;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final boolean m(int i, boolean z) throws EOFException, InterruptedIOException {
        int iP = p(i);
        while (iP < i && iP != -1) {
            iP = o(this.a, -iP, Math.min(i, iP + 4096), iP, false);
        }
        q(iP);
        return iP != -1;
    }

    public final int n(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, iMin);
        s(iMin);
        return iMin;
    }

    public final int o(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iD = this.b.d(bArr, i + i3, i2 - i3);
        if (iD != -1) {
            return i3 + iD;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int p(int i) {
        int iMin = Math.min(this.g, i);
        s(iMin);
        return iMin;
    }

    public final void q(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }

    public final void r(int i) {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    public final void s(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // com.daaw.InterfaceC1190In1
    public final long zzd() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC1190In1
    public final long zze() {
        return this.d + ((long) this.f);
    }

    @Override // com.daaw.InterfaceC1190In1
    public final long zzf() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC1190In1
    public final void zzj() {
        this.f = 0;
    }
}
