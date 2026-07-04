package com.daaw;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.s33, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8090s33 extends AbstractC7811r33 {
    public final byte[] F;

    public C8090s33(byte[] bArr) {
        bArr.getClass();
        this.F = bArr;
    }

    @Override // com.daaw.AbstractC9213w33
    public void D(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.F, i, bArr, i2, i3);
    }

    @Override // com.daaw.AbstractC9213w33
    public final int G(int i, int i2, int i3) {
        return AbstractC8374t43.b(i, this.F, Z() + i2, i3);
    }

    @Override // com.daaw.AbstractC9213w33
    public final int H(int i, int i2, int i3) {
        int iZ = Z() + i2;
        return P53.f(i, this.F, iZ, i3 + iZ);
    }

    @Override // com.daaw.AbstractC9213w33
    public final AbstractC9213w33 I(int i, int i2) {
        int iO = AbstractC9213w33.O(i, i2, y());
        return iO == 0 ? AbstractC9213w33.C : new C7254p33(this.F, Z() + i, iO);
    }

    @Override // com.daaw.AbstractC9213w33
    public final E33 J() {
        return E33.h(this.F, Z(), y(), true);
    }

    @Override // com.daaw.AbstractC9213w33
    public final String K(Charset charset) {
        return new String(this.F, Z(), y(), charset);
    }

    @Override // com.daaw.AbstractC9213w33
    public final ByteBuffer L() {
        return ByteBuffer.wrap(this.F, Z(), y()).asReadOnlyBuffer();
    }

    @Override // com.daaw.AbstractC9213w33
    public final void M(AbstractC6138l33 abstractC6138l33) {
        abstractC6138l33.a(this.F, Z(), y());
    }

    @Override // com.daaw.AbstractC9213w33
    public final boolean N() {
        int iZ = Z();
        return P53.j(this.F, iZ, y() + iZ);
    }

    @Override // com.daaw.AbstractC7811r33
    public final boolean Y(AbstractC9213w33 abstractC9213w33, int i, int i2) {
        if (i2 > abstractC9213w33.y()) {
            throw new IllegalArgumentException("Length too large: " + i2 + y());
        }
        int i3 = i + i2;
        if (i3 > abstractC9213w33.y()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abstractC9213w33.y());
        }
        if (!(abstractC9213w33 instanceof C8090s33)) {
            return abstractC9213w33.I(i, i3).equals(I(0, i2));
        }
        C8090s33 c8090s33 = (C8090s33) abstractC9213w33;
        byte[] bArr = this.F;
        byte[] bArr2 = c8090s33.F;
        int iZ = Z() + i2;
        int iZ2 = Z();
        int iZ3 = c8090s33.Z() + i;
        while (iZ2 < iZ) {
            if (bArr[iZ2] != bArr2[iZ3]) {
                return false;
            }
            iZ2++;
            iZ3++;
        }
        return true;
    }

    public int Z() {
        return 0;
    }

    @Override // com.daaw.AbstractC9213w33
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9213w33) || y() != ((AbstractC9213w33) obj).y()) {
            return false;
        }
        if (y() == 0) {
            return true;
        }
        if (!(obj instanceof C8090s33)) {
            return obj.equals(this);
        }
        C8090s33 c8090s33 = (C8090s33) obj;
        int iP = P();
        int iP2 = c8090s33.P();
        if (iP == 0 || iP2 == 0 || iP == iP2) {
            return Y(c8090s33, 0, y());
        }
        return false;
    }

    @Override // com.daaw.AbstractC9213w33
    public byte q(int i) {
        return this.F[i];
    }

    @Override // com.daaw.AbstractC9213w33
    public byte s(int i) {
        return this.F[i];
    }

    @Override // com.daaw.AbstractC9213w33
    public int y() {
        return this.F.length;
    }
}
