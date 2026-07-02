package com.daaw;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5536ix implements InterfaceC9001vJ {
    public final InterfaceC2595Vv b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    public C5536ix(InterfaceC2595Vv interfaceC2595Vv, long j, long j2) {
        this.b = interfaceC2595Vv;
        this.d = j;
        this.c = j2;
    }

    @Override // com.daaw.InterfaceC9001vJ
    public int a(int i) throws InterruptedException, EOFException {
        int iQ = q(i);
        if (iQ == 0) {
            byte[] bArr = this.a;
            iQ = o(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m(iQ);
        return iQ;
    }

    @Override // com.daaw.InterfaceC9001vJ
    public long b() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC9001vJ
    public int c(byte[] bArr, int i, int i2) throws InterruptedException, EOFException {
        int iP = p(bArr, i, i2);
        if (iP == 0) {
            iP = o(bArr, i, i2, 0, true);
        }
        m(iP);
        return iP;
    }

    @Override // com.daaw.InterfaceC9001vJ
    public boolean d(byte[] bArr, int i, int i2, boolean z) throws InterruptedException, EOFException {
        int iP = p(bArr, i, i2);
        while (iP < i2 && iP != -1) {
            iP = o(bArr, i, i2, iP, z);
        }
        m(iP);
        return iP != -1;
    }

    @Override // com.daaw.InterfaceC9001vJ
    public boolean e(byte[] bArr, int i, int i2, boolean z) {
        if (!l(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // com.daaw.InterfaceC9001vJ
    public long f() {
        return this.d + ((long) this.f);
    }

    @Override // com.daaw.InterfaceC9001vJ
    public void g(byte[] bArr, int i, int i2) throws InterruptedException, EOFException {
        d(bArr, i, i2, false);
    }

    @Override // com.daaw.InterfaceC9001vJ
    public long getPosition() {
        return this.d;
    }

    @Override // com.daaw.InterfaceC9001vJ
    public void h(int i) throws InterruptedException, EOFException {
        l(i, false);
    }

    @Override // com.daaw.InterfaceC9001vJ
    public void i() {
        this.f = 0;
    }

    @Override // com.daaw.InterfaceC9001vJ
    public void j(int i) throws InterruptedException, EOFException {
        r(i, false);
    }

    @Override // com.daaw.InterfaceC9001vJ
    public void k(byte[] bArr, int i, int i2) {
        e(bArr, i, i2, false);
    }

    public boolean l(int i, boolean z) throws InterruptedException, EOFException {
        n(i);
        int iMin = Math.min(this.g - this.f, i);
        while (iMin < i) {
            int i2 = i;
            boolean z2 = z;
            iMin = o(this.e, this.f, i2, iMin, z2);
            if (iMin == -1) {
                return false;
            }
            i = i2;
            z = z2;
        }
        int i3 = this.f + i;
        this.f = i3;
        this.g = Math.max(this.g, i3);
        return true;
    }

    public final void m(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }

    public final void n(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, AbstractC6280lb1.l(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int o(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, EOFException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iC = this.b.c(bArr, i + i3, i2 - i3);
        if (iC != -1) {
            return i3 + iC;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int p(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, iMin);
        s(iMin);
        return iMin;
    }

    public final int q(int i) {
        int iMin = Math.min(this.g, i);
        s(iMin);
        return iMin;
    }

    public boolean r(int i, boolean z) throws InterruptedException, EOFException {
        int iQ = q(i);
        while (iQ < i && iQ != -1) {
            iQ = o(this.a, -iQ, Math.min(i, this.a.length + iQ), iQ, z);
        }
        m(iQ);
        return iQ != -1;
    }

    public final void s(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }
}
