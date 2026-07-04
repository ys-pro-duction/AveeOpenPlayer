package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class L33 extends P33 {
    public final byte[] d;
    public final int e;
    public int f;

    public L33(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.d = bArr;
        this.f = 0;
        this.e = i2;
    }

    public final void D(byte[] bArr, int i, int i2) throws M33 {
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new M33(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
        }
    }

    public final void E(String str) throws M33 {
        int i = this.f;
        try {
            int iB = P33.b(str.length() * 3);
            int iB2 = P33.b(str.length());
            if (iB2 != iB) {
                w(P53.e(str));
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = P53.d(str, bArr, i2, this.e - i2);
                return;
            }
            int i3 = i + iB2;
            this.f = i3;
            int iD = P53.d(str, this.d, i3, this.e - i3);
            this.f = i;
            w((iD - i) - iB2);
            this.f = iD;
        } catch (O53 e) {
            this.f = i;
            f(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new M33(e2);
        }
    }

    @Override // com.daaw.P33, com.daaw.AbstractC6138l33
    public final void a(byte[] bArr, int i, int i2) throws M33 {
        D(bArr, i, i2);
    }

    @Override // com.daaw.P33
    public final void i(byte b) throws M33 {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new M33(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.P33
    public final void j(int i, boolean z) throws M33 {
        w(i << 3);
        i(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.daaw.P33
    public final void k(int i, AbstractC9213w33 abstractC9213w33) throws M33 {
        w((i << 3) | 2);
        w(abstractC9213w33.y());
        abstractC9213w33.M(this);
    }

    @Override // com.daaw.P33
    public final int l() {
        return this.e - this.f;
    }

    @Override // com.daaw.P33
    public final void m(int i, int i2) throws M33 {
        w((i << 3) | 5);
        n(i2);
    }

    @Override // com.daaw.P33
    public final void n(int i) throws M33 {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new M33(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.P33
    public final void o(int i, long j) throws M33 {
        w((i << 3) | 1);
        p(j);
    }

    @Override // com.daaw.P33
    public final void p(long j) throws M33 {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new M33(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.P33
    public final void q(int i, int i2) throws M33 {
        w(i << 3);
        r(i2);
    }

    @Override // com.daaw.P33
    public final void r(int i) throws M33 {
        if (i >= 0) {
            w(i);
        } else {
            y(i);
        }
    }

    @Override // com.daaw.P33
    public final void s(int i, U43 u43, InterfaceC7821r53 interfaceC7821r53) throws M33 {
        w((i << 3) | 2);
        w(((AbstractC4444f33) u43).a(interfaceC7821r53));
        interfaceC7821r53.g(u43, this.a);
    }

    @Override // com.daaw.P33
    public final void t(int i, String str) throws M33 {
        w((i << 3) | 2);
        E(str);
    }

    @Override // com.daaw.P33
    public final void u(int i, int i2) throws M33 {
        w((i << 3) | i2);
    }

    @Override // com.daaw.P33
    public final void v(int i, int i2) throws M33 {
        w(i << 3);
        w(i2);
    }

    @Override // com.daaw.P33
    public final void w(int i) throws M33 {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new M33(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr2 = this.d;
        int i3 = this.f;
        this.f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.daaw.P33
    public final void x(int i, long j) throws M33 {
        w(i << 3);
        y(j);
    }

    @Override // com.daaw.P33
    public final void y(long j) throws M33 {
        if (!P33.c || this.e - this.f < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.d;
                    int i = this.f;
                    this.f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new M33(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            byte[] bArr2 = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while (true) {
            int i3 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.d;
                int i4 = this.f;
                this.f = 1 + i4;
                K53.y(bArr3, i4, (byte) i3);
                return;
            }
            byte[] bArr4 = this.d;
            int i5 = this.f;
            this.f = i5 + 1;
            K53.y(bArr4, i5, (byte) ((i3 & 127) | 128));
            j >>>= 7;
        }
    }

    @Override // com.daaw.P33
    public final void h() {
    }
}
