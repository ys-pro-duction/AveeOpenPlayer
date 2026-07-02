package com.daaw;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.daaw.Am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0343Am {
    public final byte[] a;
    public final int b;
    public final OutputStream e;
    public int d = 0;
    public int c = 0;

    /* JADX INFO: renamed from: com.daaw.Am$a */
    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public C0343Am(OutputStream outputStream, byte[] bArr) {
        this.e = outputStream;
        this.a = bArr;
        this.b = bArr.length;
    }

    public static int A(long j) {
        return v(G(j));
    }

    public static int B(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return u(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static int C(int i) {
        return u(AbstractC6315li1.c(i, 0));
    }

    public static int D(int i) {
        return u(i);
    }

    public static int E(long j) {
        return v(j);
    }

    public static int F(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long G(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static C0343Am I(OutputStream outputStream, int i) {
        return new C0343Am(outputStream, new byte[i]);
    }

    public static int a(int i, boolean z) {
        return C(i) + b(z);
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int c(byte[] bArr) {
        return u(bArr.length) + bArr.length;
    }

    public static int d(int i, AbstractC4629fi abstractC4629fi) {
        return C(i) + e(abstractC4629fi);
    }

    public static int e(AbstractC4629fi abstractC4629fi) {
        return u(abstractC4629fi.size()) + abstractC4629fi.size();
    }

    public static int f(int i, double d) {
        return C(i) + g(d);
    }

    public static int g(double d) {
        return 8;
    }

    public static int h(int i, int i2) {
        return C(i) + i(i2);
    }

    public static int i(int i) {
        return p(i);
    }

    public static int j(int i) {
        return 4;
    }

    public static int k(long j) {
        return 8;
    }

    public static int l(int i, float f) {
        return C(i) + m(f);
    }

    public static int m(float f) {
        return 4;
    }

    public static int n(InterfaceC2026Qj0 interfaceC2026Qj0) {
        return interfaceC2026Qj0.c();
    }

    public static int o(int i, int i2) {
        return C(i) + p(i2);
    }

    public static int p(int i) {
        if (i >= 0) {
            return u(i);
        }
        return 10;
    }

    public static int q(long j) {
        return v(j);
    }

    public static int r(int i, InterfaceC2026Qj0 interfaceC2026Qj0) {
        return C(i) + s(interfaceC2026Qj0);
    }

    public static int s(InterfaceC2026Qj0 interfaceC2026Qj0) {
        int iC = interfaceC2026Qj0.c();
        return u(iC) + iC;
    }

    public static int t(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int u(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int v(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int w(int i) {
        return 4;
    }

    public static int x(long j) {
        return 8;
    }

    public static int y(int i) {
        return u(F(i));
    }

    public static int z(int i, long j) {
        return C(i) + A(j);
    }

    public void H() throws IOException {
        if (this.e != null) {
            J();
        }
    }

    public final void J() throws IOException {
        OutputStream outputStream = this.e;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.a, 0, this.c);
        this.c = 0;
    }

    public void K(int i, boolean z) throws IOException {
        v0(i, 0);
        L(z);
    }

    public void L(boolean z) throws IOException {
        g0(z ? 1 : 0);
    }

    public void M(byte[] bArr) throws IOException {
        n0(bArr.length);
        j0(bArr);
    }

    public void N(int i, AbstractC4629fi abstractC4629fi) throws IOException {
        v0(i, 2);
        O(abstractC4629fi);
    }

    public void O(AbstractC4629fi abstractC4629fi) throws IOException {
        n0(abstractC4629fi.size());
        h0(abstractC4629fi);
    }

    public void P(int i, double d) throws IOException {
        v0(i, 1);
        Q(d);
    }

    public void Q(double d) throws IOException {
        m0(Double.doubleToRawLongBits(d));
    }

    public void R(int i, int i2) throws IOException {
        v0(i, 0);
        S(i2);
    }

    public void S(int i) throws IOException {
        a0(i);
    }

    public void T(int i) throws IOException {
        l0(i);
    }

    public void U(long j) throws IOException {
        m0(j);
    }

    public void V(int i, float f) throws IOException {
        v0(i, 5);
        W(f);
    }

    public void W(float f) throws IOException {
        l0(Float.floatToRawIntBits(f));
    }

    public void X(int i, InterfaceC2026Qj0 interfaceC2026Qj0) throws IOException {
        v0(i, 3);
        Y(interfaceC2026Qj0);
        v0(i, 4);
    }

    public void Y(InterfaceC2026Qj0 interfaceC2026Qj0) {
        interfaceC2026Qj0.g(this);
    }

    public void Z(int i, int i2) throws IOException {
        v0(i, 0);
        a0(i2);
    }

    public void a0(int i) throws IOException {
        if (i >= 0) {
            n0(i);
        } else {
            o0(i);
        }
    }

    public void b0(long j) throws IOException {
        o0(j);
    }

    public void c0(int i, InterfaceC2026Qj0 interfaceC2026Qj0) throws IOException {
        v0(i, 2);
        d0(interfaceC2026Qj0);
    }

    public void d0(InterfaceC2026Qj0 interfaceC2026Qj0) throws IOException {
        n0(interfaceC2026Qj0.c());
        interfaceC2026Qj0.g(this);
    }

    public void e0(int i, InterfaceC2026Qj0 interfaceC2026Qj0) throws IOException {
        v0(1, 3);
        w0(2, i);
        c0(3, interfaceC2026Qj0);
        v0(1, 4);
    }

    public void f0(byte b) throws IOException {
        if (this.c == this.b) {
            J();
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
        this.d++;
    }

    public void g0(int i) throws IOException {
        f0((byte) i);
    }

    public void h0(AbstractC4629fi abstractC4629fi) throws IOException {
        i0(abstractC4629fi, 0, abstractC4629fi.size());
    }

    public void i0(AbstractC4629fi abstractC4629fi, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            abstractC4629fi.w(this.a, i, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        int i5 = i3 - i4;
        abstractC4629fi.w(this.a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        this.d += i5;
        J();
        if (i7 <= this.b) {
            abstractC4629fi.w(this.a, i6, 0, i7);
            this.c = i7;
        } else {
            abstractC4629fi.N(this.e, i6, i7);
        }
        this.d += i7;
    }

    public void j0(byte[] bArr) throws IOException {
        k0(bArr, 0, bArr.length);
    }

    public void k0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        this.d += i5;
        J();
        if (i7 <= this.b) {
            System.arraycopy(bArr, i6, this.a, 0, i7);
            this.c = i7;
        } else {
            this.e.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    public void l0(int i) throws IOException {
        g0(i & 255);
        g0((i >> 8) & 255);
        g0((i >> 16) & 255);
        g0((i >> 24) & 255);
    }

    public void m0(long j) throws IOException {
        g0(((int) j) & 255);
        g0(((int) (j >> 8)) & 255);
        g0(((int) (j >> 16)) & 255);
        g0(((int) (j >> 24)) & 255);
        g0(((int) (j >> 32)) & 255);
        g0(((int) (j >> 40)) & 255);
        g0(((int) (j >> 48)) & 255);
        g0(((int) (j >> 56)) & 255);
    }

    public void n0(int i) throws IOException {
        while ((i & (-128)) != 0) {
            g0((i & 127) | 128);
            i >>>= 7;
        }
        g0(i);
    }

    public void o0(long j) throws IOException {
        while (((-128) & j) != 0) {
            g0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        g0((int) j);
    }

    public void p0(int i) throws IOException {
        l0(i);
    }

    public void q0(long j) throws IOException {
        m0(j);
    }

    public void r0(int i) throws IOException {
        n0(F(i));
    }

    public void s0(int i, long j) throws IOException {
        v0(i, 0);
        t0(j);
    }

    public void t0(long j) throws IOException {
        o0(G(j));
    }

    public void u0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        n0(bytes.length);
        j0(bytes);
    }

    public void v0(int i, int i2) throws IOException {
        n0(AbstractC6315li1.c(i, i2));
    }

    public void w0(int i, int i2) throws IOException {
        v0(i, 0);
        x0(i2);
    }

    public void x0(int i) throws IOException {
        n0(i);
    }

    public void y0(long j) throws IOException {
        o0(j);
    }
}
