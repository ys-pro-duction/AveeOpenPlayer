package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Md3 extends Vd3 {
    public final byte[] d;
    public final int e;
    public int f;

    public Md3(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.d = bArr;
        this.f = 0;
        this.e = i2;
    }

    public final void B(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new Pd3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
        }
    }

    public final void C(String str) throws Pd3 {
        int i = this.f;
        try {
            int iY = Vd3.y(str.length() * 3);
            int iY2 = Vd3.y(str.length());
            if (iY2 != iY) {
                r(AbstractC8548ti3.c(str));
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = AbstractC8548ti3.b(str, bArr, i2, this.e - i2);
                return;
            }
            int i3 = i + iY2;
            this.f = i3;
            int iB = AbstractC8548ti3.b(str, this.d, i3, this.e - i3);
            this.f = i;
            r((iB - i) - iY2);
            this.f = iB;
        } catch (C7990ri3 e) {
            this.f = i;
            b(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new Pd3(e2);
        }
    }

    @Override // com.daaw.Vd3
    public final int d() {
        return this.e - this.f;
    }

    @Override // com.daaw.Vd3
    public final void e(byte b) throws Pd3 {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new Pd3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.Vd3
    public final void f(int i, boolean z) throws Pd3 {
        r(i << 3);
        e(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.daaw.Vd3
    public final void g(int i, AbstractC9646xd3 abstractC9646xd3) throws Pd3 {
        r((i << 3) | 2);
        r(abstractC9646xd3.s());
        abstractC9646xd3.E(this);
    }

    @Override // com.daaw.Vd3
    public final void h(int i, int i2) throws Pd3 {
        r((i << 3) | 5);
        i(i2);
    }

    @Override // com.daaw.Vd3
    public final void i(int i) throws Pd3 {
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
            throw new Pd3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.Vd3
    public final void j(int i, long j) throws Pd3 {
        r((i << 3) | 1);
        k(j);
    }

    @Override // com.daaw.Vd3
    public final void k(long j) throws Pd3 {
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
            throw new Pd3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.Vd3
    public final void l(int i, int i2) throws Pd3 {
        r(i << 3);
        m(i2);
    }

    @Override // com.daaw.Vd3
    public final void m(int i) throws Pd3 {
        if (i >= 0) {
            r(i);
        } else {
            t(i);
        }
    }

    @Override // com.daaw.Vd3
    public final void n(byte[] bArr, int i, int i2) {
        B(bArr, 0, i2);
    }

    @Override // com.daaw.Vd3
    public final void o(int i, String str) throws Pd3 {
        r((i << 3) | 2);
        C(str);
    }

    @Override // com.daaw.Vd3
    public final void p(int i, int i2) throws Pd3 {
        r((i << 3) | i2);
    }

    @Override // com.daaw.Vd3
    public final void q(int i, int i2) throws Pd3 {
        r(i << 3);
        r(i2);
    }

    @Override // com.daaw.Vd3
    public final void r(int i) throws Pd3 {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new Pd3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr2 = this.d;
        int i3 = this.f;
        this.f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.daaw.Vd3
    public final void s(int i, long j) throws Pd3 {
        r(i << 3);
        t(j);
    }

    @Override // com.daaw.Vd3
    public final void t(long j) throws Pd3 {
        if (Vd3.c && this.e - this.f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                AbstractC5750ji3.s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i2 = this.f;
            this.f = 1 + i2;
            AbstractC5750ji3.s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.d;
                int i3 = this.f;
                this.f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new Pd3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr4 = this.d;
        int i4 = this.f;
        this.f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
