package com.daaw;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class N33 extends K33 {
    public final OutputStream h;

    public N33(OutputStream outputStream, int i) {
        super(i);
        this.h = outputStream;
    }

    public final void I() throws IOException {
        this.h.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void J(int i) throws IOException {
        if (this.e - this.f < i) {
            I();
        }
    }

    public final void K(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.d, i4, i2);
            this.f += i2;
            this.g += i2;
            return;
        }
        System.arraycopy(bArr, i, this.d, i4, i5);
        int i6 = i + i5;
        this.f = this.e;
        this.g += i5;
        I();
        int i7 = i2 - i5;
        if (i7 <= this.e) {
            System.arraycopy(bArr, i6, this.d, 0, i7);
            this.f = i7;
        } else {
            this.h.write(bArr, i6, i7);
        }
        this.g += i7;
    }

    public final void L(String str) throws IOException {
        int iE;
        try {
            int length = str.length() * 3;
            int iB = P33.b(length);
            int i = iB + length;
            int i2 = this.e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iD = P53.d(str, bArr, 0, length);
                w(iD);
                K(bArr, 0, iD);
                return;
            }
            if (i > i2 - this.f) {
                I();
            }
            int iB2 = P33.b(str.length());
            int i3 = this.f;
            try {
                if (iB2 == iB) {
                    int i4 = i3 + iB2;
                    this.f = i4;
                    int iD2 = P53.d(str, this.d, i4, this.e - i4);
                    this.f = i3;
                    iE = (iD2 - i3) - iB2;
                    G(iE);
                    this.f = iD2;
                } else {
                    iE = P53.e(str);
                    G(iE);
                    this.f = P53.d(str, this.d, this.f, iE);
                }
                this.g += iE;
            } catch (O53 e) {
                this.g -= this.f - i3;
                this.f = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new M33(e2);
            }
        } catch (O53 e3) {
            f(str, e3);
        }
    }

    @Override // com.daaw.P33, com.daaw.AbstractC6138l33
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        K(bArr, i, i2);
    }

    @Override // com.daaw.P33
    public final void h() throws IOException {
        if (this.f > 0) {
            I();
        }
    }

    @Override // com.daaw.P33
    public final void i(byte b) throws IOException {
        if (this.f == this.e) {
            I();
        }
        D(b);
    }

    @Override // com.daaw.P33
    public final void j(int i, boolean z) throws IOException {
        J(11);
        G(i << 3);
        D(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.daaw.P33
    public final void k(int i, AbstractC9213w33 abstractC9213w33) throws IOException {
        w((i << 3) | 2);
        w(abstractC9213w33.y());
        abstractC9213w33.M(this);
    }

    @Override // com.daaw.P33
    public final void m(int i, int i2) throws IOException {
        J(14);
        G((i << 3) | 5);
        E(i2);
    }

    @Override // com.daaw.P33
    public final void n(int i) throws IOException {
        J(4);
        E(i);
    }

    @Override // com.daaw.P33
    public final void o(int i, long j) throws IOException {
        J(18);
        G((i << 3) | 1);
        F(j);
    }

    @Override // com.daaw.P33
    public final void p(long j) throws IOException {
        J(8);
        F(j);
    }

    @Override // com.daaw.P33
    public final void q(int i, int i2) throws IOException {
        J(20);
        G(i << 3);
        if (i2 >= 0) {
            G(i2);
        } else {
            H(i2);
        }
    }

    @Override // com.daaw.P33
    public final void r(int i) throws IOException {
        if (i >= 0) {
            w(i);
        } else {
            y(i);
        }
    }

    @Override // com.daaw.P33
    public final void s(int i, U43 u43, InterfaceC7821r53 interfaceC7821r53) throws IOException {
        w((i << 3) | 2);
        w(((AbstractC4444f33) u43).a(interfaceC7821r53));
        interfaceC7821r53.g(u43, this.a);
    }

    @Override // com.daaw.P33
    public final void t(int i, String str) throws IOException {
        w((i << 3) | 2);
        L(str);
    }

    @Override // com.daaw.P33
    public final void u(int i, int i2) throws IOException {
        w((i << 3) | i2);
    }

    @Override // com.daaw.P33
    public final void v(int i, int i2) throws IOException {
        J(20);
        G(i << 3);
        G(i2);
    }

    @Override // com.daaw.P33
    public final void w(int i) throws IOException {
        J(5);
        G(i);
    }

    @Override // com.daaw.P33
    public final void x(int i, long j) throws IOException {
        J(20);
        G(i << 3);
        H(j);
    }

    @Override // com.daaw.P33
    public final void y(long j) throws IOException {
        J(10);
        H(j);
    }
}
