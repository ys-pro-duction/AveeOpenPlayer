package com.daaw;

import com.daaw.AbstractC3472bb1;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10245zm extends AbstractC3783ci {
    public static final Logger c = Logger.getLogger(AbstractC10245zm.class.getName());
    public static final boolean d = AbstractC3188aa1.I();
    public C0447Bm a;
    public boolean b;

    /* JADX INFO: renamed from: com.daaw.zm$b */
    public static abstract class b extends AbstractC10245zm {
        public final byte[] e;
        public final int f;
        public int g;
        public int h;

        public b(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.e = bArr;
            this.f = bArr.length;
        }

        public final void W0(byte b) {
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b;
            this.h++;
        }

        public final void X0(int i) {
            byte[] bArr = this.e;
            int i2 = this.g;
            int i3 = i2 + 1;
            this.g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.g = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.h += 4;
        }

        public final void Y0(long j) {
            byte[] bArr = this.e;
            int i = this.g;
            int i2 = i + 1;
            this.g = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.g = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.g = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.g = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.g = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.h += 8;
        }

        public final void Z0(int i) {
            if (i >= 0) {
                b1(i);
            } else {
                c1(i);
            }
        }

        public final void a1(int i, int i2) {
            b1(AbstractC6027ki1.c(i, i2));
        }

        public final void b1(int i) {
            if (!AbstractC10245zm.d) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    this.h++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr2[i3] = (byte) i;
                this.h++;
                return;
            }
            long j = this.g;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                AbstractC3188aa1.O(bArr3, i4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i5 = this.g;
            this.g = i5 + 1;
            AbstractC3188aa1.O(bArr4, i5, (byte) i);
            this.h += (int) (((long) this.g) - j);
        }

        public final void c1(long j) {
            if (!AbstractC10245zm.d) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    this.h++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr2[i2] = (byte) j;
                this.h++;
                return;
            }
            long j2 = this.g;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                AbstractC3188aa1.O(bArr3, i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            AbstractC3188aa1.O(bArr4, i4, (byte) j);
            this.h += (int) (((long) this.g) - j2);
        }

        @Override // com.daaw.AbstractC10245zm
        public final int d0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: com.daaw.zm$d */
    public static class d extends IOException {
        public d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zm$e */
    public static final class e extends b {
        public final OutputStream i;

        public e(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.i = outputStream;
        }

        @Override // com.daaw.AbstractC10245zm
        public void A0(int i) throws IOException {
            if (i >= 0) {
                T0(i);
            } else {
                V0(i);
            }
        }

        @Override // com.daaw.AbstractC10245zm
        public void D0(int i, InterfaceC1900Pj0 interfaceC1900Pj0, DN0 dn0) throws IOException {
            R0(i, 2);
            i1(interfaceC1900Pj0, dn0);
        }

        @Override // com.daaw.AbstractC10245zm
        public void E0(InterfaceC1900Pj0 interfaceC1900Pj0) throws IOException {
            T0(interfaceC1900Pj0.c());
            interfaceC1900Pj0.i(this);
        }

        @Override // com.daaw.AbstractC10245zm
        public void F0(int i, InterfaceC1900Pj0 interfaceC1900Pj0) throws IOException {
            R0(1, 3);
            S0(2, i);
            h1(3, interfaceC1900Pj0);
            R0(1, 4);
        }

        @Override // com.daaw.AbstractC10245zm
        public void G0(int i, AbstractC4340ei abstractC4340ei) throws IOException {
            R0(1, 3);
            S0(2, i);
            j0(3, abstractC4340ei);
            R0(1, 4);
        }

        @Override // com.daaw.AbstractC10245zm
        public void P0(int i, String str) throws IOException {
            R0(i, 2);
            Q0(str);
        }

        @Override // com.daaw.AbstractC10245zm
        public void Q0(String str) throws IOException {
            int iJ;
            try {
                int length = str.length() * 3;
                int iS = AbstractC10245zm.S(length);
                int i = iS + length;
                int i2 = this.f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int i3 = AbstractC3472bb1.i(str, bArr, 0, length);
                    T0(i3);
                    b(bArr, 0, i3);
                    return;
                }
                if (i > i2 - this.g) {
                    d1();
                }
                int iS2 = AbstractC10245zm.S(str.length());
                int i4 = this.g;
                try {
                    if (iS2 == iS) {
                        int i5 = i4 + iS2;
                        this.g = i5;
                        int i6 = AbstractC3472bb1.i(str, this.e, i5, this.f - i5);
                        this.g = i4;
                        iJ = (i6 - i4) - iS2;
                        b1(iJ);
                        this.g = i6;
                    } else {
                        iJ = AbstractC3472bb1.j(str);
                        b1(iJ);
                        this.g = AbstractC3472bb1.i(str, this.e, this.g, iJ);
                    }
                    this.h += iJ;
                } catch (AbstractC3472bb1.d e) {
                    this.h -= this.g - i4;
                    this.g = i4;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new d(e2);
                }
            } catch (AbstractC3472bb1.d e3) {
                Y(str, e3);
            }
        }

        @Override // com.daaw.AbstractC10245zm
        public void R0(int i, int i2) throws IOException {
            T0(AbstractC6027ki1.c(i, i2));
        }

        @Override // com.daaw.AbstractC10245zm
        public void S0(int i, int i2) throws IOException {
            e1(20);
            a1(i, 0);
            b1(i2);
        }

        @Override // com.daaw.AbstractC10245zm
        public void T0(int i) throws IOException {
            e1(5);
            b1(i);
        }

        @Override // com.daaw.AbstractC10245zm
        public void U0(int i, long j) throws IOException {
            e1(20);
            a1(i, 0);
            c1(j);
        }

        @Override // com.daaw.AbstractC10245zm
        public void V0(long j) throws IOException {
            e1(10);
            c1(j);
        }

        @Override // com.daaw.AbstractC10245zm
        public void X() throws IOException {
            if (this.g > 0) {
                d1();
            }
        }

        @Override // com.daaw.AbstractC3783ci
        public void a(ByteBuffer byteBuffer) throws IOException {
            f1(byteBuffer);
        }

        @Override // com.daaw.AbstractC10245zm, com.daaw.AbstractC3783ci
        public void b(byte[] bArr, int i, int i2) throws IOException {
            g1(bArr, i, i2);
        }

        public final void d1() throws IOException {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        @Override // com.daaw.AbstractC10245zm
        public void e0(byte b) throws IOException {
            if (this.g == this.f) {
                d1();
            }
            W0(b);
        }

        public final void e1(int i) throws IOException {
            if (this.f - this.g < i) {
                d1();
            }
        }

        @Override // com.daaw.AbstractC10245zm
        public void f0(int i, boolean z) throws IOException {
            e1(11);
            a1(i, 0);
            W0(z ? (byte) 1 : (byte) 0);
        }

        public void f1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.f;
            int i2 = this.g;
            if (i - i2 >= iRemaining) {
                byteBuffer.get(this.e, i2, iRemaining);
                this.g += iRemaining;
                this.h += iRemaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.e, i2, i3);
            int i4 = iRemaining - i3;
            this.g = this.f;
            this.h += i3;
            d1();
            while (true) {
                int i5 = this.f;
                if (i4 <= i5) {
                    byteBuffer.get(this.e, 0, i4);
                    this.g = i4;
                    this.h += i4;
                    return;
                } else {
                    byteBuffer.get(this.e, 0, i5);
                    this.i.write(this.e, 0, this.f);
                    int i6 = this.f;
                    i4 -= i6;
                    this.h += i6;
                }
            }
        }

        public void g1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f;
            int i4 = this.g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.e, i4, i2);
                this.g += i2;
                this.h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.g = this.f;
            this.h += i5;
            d1();
            if (i7 <= this.f) {
                System.arraycopy(bArr, i6, this.e, 0, i7);
                this.g = i7;
            } else {
                this.i.write(bArr, i6, i7);
            }
            this.h += i7;
        }

        public void h1(int i, InterfaceC1900Pj0 interfaceC1900Pj0) throws IOException {
            R0(i, 2);
            E0(interfaceC1900Pj0);
        }

        @Override // com.daaw.AbstractC10245zm
        public void i0(byte[] bArr, int i, int i2) throws IOException {
            T0(i2);
            g1(bArr, i, i2);
        }

        public void i1(InterfaceC1900Pj0 interfaceC1900Pj0, DN0 dn0) throws IOException {
            T0(((Q) interfaceC1900Pj0).k(dn0));
            dn0.j(interfaceC1900Pj0, this.a);
        }

        @Override // com.daaw.AbstractC10245zm
        public void j0(int i, AbstractC4340ei abstractC4340ei) throws IOException {
            R0(i, 2);
            k0(abstractC4340ei);
        }

        @Override // com.daaw.AbstractC10245zm
        public void k0(AbstractC4340ei abstractC4340ei) throws IOException {
            T0(abstractC4340ei.size());
            abstractC4340ei.f0(this);
        }

        @Override // com.daaw.AbstractC10245zm
        public void p0(int i, int i2) throws IOException {
            e1(14);
            a1(i, 5);
            X0(i2);
        }

        @Override // com.daaw.AbstractC10245zm
        public void q0(int i) throws IOException {
            e1(4);
            X0(i);
        }

        @Override // com.daaw.AbstractC10245zm
        public void r0(int i, long j) throws IOException {
            e1(18);
            a1(i, 1);
            Y0(j);
        }

        @Override // com.daaw.AbstractC10245zm
        public void s0(long j) throws IOException {
            e1(8);
            Y0(j);
        }

        @Override // com.daaw.AbstractC10245zm
        public void z0(int i, int i2) throws IOException {
            e1(20);
            a1(i, 0);
            Z0(i2);
        }
    }

    public static int A(int i) {
        return S(i) + i;
    }

    public static int B(int i, InterfaceC1900Pj0 interfaceC1900Pj0, DN0 dn0) {
        return Q(i) + D(interfaceC1900Pj0, dn0);
    }

    public static int C(InterfaceC1900Pj0 interfaceC1900Pj0) {
        return A(interfaceC1900Pj0.c());
    }

    public static int D(InterfaceC1900Pj0 interfaceC1900Pj0, DN0 dn0) {
        return A(((Q) interfaceC1900Pj0).k(dn0));
    }

    public static int E(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int F(int i, AbstractC4340ei abstractC4340ei) {
        return (Q(1) * 2) + R(2, i) + h(3, abstractC4340ei);
    }

    public static int G(int i, int i2) {
        return Q(i) + H(i2);
    }

    public static int H(int i) {
        return 4;
    }

    public static int I(int i, long j) {
        return Q(i) + J(j);
    }

    public static int J(long j) {
        return 8;
    }

    public static int K(int i, int i2) {
        return Q(i) + L(i2);
    }

    public static int L(int i) {
        return S(V(i));
    }

    public static int M(int i, long j) {
        return Q(i) + N(j);
    }

    public static int N(long j) {
        return U(W(j));
    }

    public static int O(int i, String str) {
        return Q(i) + P(str);
    }

    public static int P(String str) {
        int length;
        try {
            length = AbstractC3472bb1.j(str);
        } catch (AbstractC3472bb1.d unused) {
            length = str.getBytes(AbstractC3317b10.b).length;
        }
        return A(length);
    }

    public static int Q(int i) {
        return S(AbstractC6027ki1.c(i, 0));
    }

    public static int R(int i, int i2) {
        return Q(i) + S(i2);
    }

    public static int S(int i) {
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

    public static int T(int i, long j) {
        return Q(i) + U(j);
    }

    public static int U(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int V(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long W(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static AbstractC10245zm a0(OutputStream outputStream, int i) {
        return new e(outputStream, i);
    }

    public static AbstractC10245zm b0(byte[] bArr) {
        return c0(bArr, 0, bArr.length);
    }

    public static AbstractC10245zm c0(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public static int e(int i, boolean z) {
        return Q(i) + f(z);
    }

    public static int f(boolean z) {
        return 1;
    }

    public static int g(byte[] bArr) {
        return A(bArr.length);
    }

    public static int h(int i, AbstractC4340ei abstractC4340ei) {
        return Q(i) + i(abstractC4340ei);
    }

    public static int i(AbstractC4340ei abstractC4340ei) {
        return A(abstractC4340ei.size());
    }

    public static int j(int i, double d2) {
        return Q(i) + k(d2);
    }

    public static int k(double d2) {
        return 8;
    }

    public static int l(int i, int i2) {
        return Q(i) + m(i2);
    }

    public static int m(int i) {
        return x(i);
    }

    public static int n(int i, int i2) {
        return Q(i) + o(i2);
    }

    public static int o(int i) {
        return 4;
    }

    public static int p(int i, long j) {
        return Q(i) + q(j);
    }

    public static int q(long j) {
        return 8;
    }

    public static int r(int i, float f) {
        return Q(i) + s(f);
    }

    public static int s(float f) {
        return 4;
    }

    public static int t(int i, InterfaceC1900Pj0 interfaceC1900Pj0, DN0 dn0) {
        return (Q(i) * 2) + v(interfaceC1900Pj0, dn0);
    }

    public static int u(InterfaceC1900Pj0 interfaceC1900Pj0) {
        return interfaceC1900Pj0.c();
    }

    public static int v(InterfaceC1900Pj0 interfaceC1900Pj0, DN0 dn0) {
        return ((Q) interfaceC1900Pj0).k(dn0);
    }

    public static int w(int i, int i2) {
        return Q(i) + x(i2);
    }

    public static int x(int i) {
        if (i >= 0) {
            return S(i);
        }
        return 10;
    }

    public static int y(int i, long j) {
        return Q(i) + z(j);
    }

    public static int z(long j) {
        return U(j);
    }

    public abstract void A0(int i);

    public final void B0(int i, long j) {
        U0(i, j);
    }

    public final void C0(long j) {
        V0(j);
    }

    public abstract void D0(int i, InterfaceC1900Pj0 interfaceC1900Pj0, DN0 dn0);

    public abstract void E0(InterfaceC1900Pj0 interfaceC1900Pj0);

    public abstract void F0(int i, InterfaceC1900Pj0 interfaceC1900Pj0);

    public abstract void G0(int i, AbstractC4340ei abstractC4340ei);

    public final void H0(int i, int i2) {
        p0(i, i2);
    }

    public final void I0(int i) {
        q0(i);
    }

    public final void J0(int i, long j) {
        r0(i, j);
    }

    public final void K0(long j) {
        s0(j);
    }

    public final void L0(int i, int i2) {
        S0(i, V(i2));
    }

    public final void M0(int i) {
        T0(V(i));
    }

    public final void N0(int i, long j) {
        U0(i, W(j));
    }

    public final void O0(long j) {
        V0(W(j));
    }

    public abstract void P0(int i, String str);

    public abstract void Q0(String str);

    public abstract void R0(int i, int i2);

    public abstract void S0(int i, int i2);

    public abstract void T0(int i);

    public abstract void U0(int i, long j);

    public abstract void V0(long j);

    public abstract void X();

    public final void Y(String str, AbstractC3472bb1.d dVar) throws d {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC3317b10.b);
        try {
            T0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new d(e2);
        }
    }

    public boolean Z() {
        return this.b;
    }

    @Override // com.daaw.AbstractC3783ci
    public abstract void b(byte[] bArr, int i, int i2);

    public final void d() {
        if (d0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int d0();

    public abstract void e0(byte b2);

    public abstract void f0(int i, boolean z);

    public final void g0(boolean z) {
        e0(z ? (byte) 1 : (byte) 0);
    }

    public final void h0(byte[] bArr) {
        i0(bArr, 0, bArr.length);
    }

    public abstract void i0(byte[] bArr, int i, int i2);

    public abstract void j0(int i, AbstractC4340ei abstractC4340ei);

    public abstract void k0(AbstractC4340ei abstractC4340ei);

    public final void l0(int i, double d2) {
        r0(i, Double.doubleToRawLongBits(d2));
    }

    public final void m0(double d2) {
        s0(Double.doubleToRawLongBits(d2));
    }

    public final void n0(int i, int i2) {
        z0(i, i2);
    }

    public final void o0(int i) {
        A0(i);
    }

    public abstract void p0(int i, int i2);

    public abstract void q0(int i);

    public abstract void r0(int i, long j);

    public abstract void s0(long j);

    public final void t0(int i, float f) {
        p0(i, Float.floatToRawIntBits(f));
    }

    public final void u0(float f) {
        q0(Float.floatToRawIntBits(f));
    }

    public final void v0(int i, InterfaceC1900Pj0 interfaceC1900Pj0) {
        R0(i, 3);
        x0(interfaceC1900Pj0);
        R0(i, 4);
    }

    public final void w0(int i, InterfaceC1900Pj0 interfaceC1900Pj0, DN0 dn0) {
        R0(i, 3);
        y0(interfaceC1900Pj0, dn0);
        R0(i, 4);
    }

    public final void x0(InterfaceC1900Pj0 interfaceC1900Pj0) {
        interfaceC1900Pj0.i(this);
    }

    public final void y0(InterfaceC1900Pj0 interfaceC1900Pj0, DN0 dn0) {
        dn0.j(interfaceC1900Pj0, this.a);
    }

    public abstract void z0(int i, int i2);

    public AbstractC10245zm() {
    }

    /* JADX INFO: renamed from: com.daaw.zm$c */
    public static class c extends AbstractC10245zm {
        public final byte[] e;
        public final int f;
        public final int g;
        public int h;

        public c(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.e = bArr;
            this.f = i;
            this.h = i;
            this.g = i3;
        }

        @Override // com.daaw.AbstractC10245zm
        public final void A0(int i) throws d {
            if (i >= 0) {
                T0(i);
            } else {
                V0(i);
            }
        }

        @Override // com.daaw.AbstractC10245zm
        public final void D0(int i, InterfaceC1900Pj0 interfaceC1900Pj0, DN0 dn0) throws d {
            R0(i, 2);
            T0(((Q) interfaceC1900Pj0).k(dn0));
            dn0.j(interfaceC1900Pj0, this.a);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void E0(InterfaceC1900Pj0 interfaceC1900Pj0) throws d {
            T0(interfaceC1900Pj0.c());
            interfaceC1900Pj0.i(this);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void F0(int i, InterfaceC1900Pj0 interfaceC1900Pj0) throws d {
            R0(1, 3);
            S0(2, i);
            Y0(3, interfaceC1900Pj0);
            R0(1, 4);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void G0(int i, AbstractC4340ei abstractC4340ei) throws d {
            R0(1, 3);
            S0(2, i);
            j0(3, abstractC4340ei);
            R0(1, 4);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void P0(int i, String str) throws d {
            R0(i, 2);
            Q0(str);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void Q0(String str) throws d {
            int i = this.h;
            try {
                int iS = AbstractC10245zm.S(str.length() * 3);
                int iS2 = AbstractC10245zm.S(str.length());
                if (iS2 != iS) {
                    T0(AbstractC3472bb1.j(str));
                    this.h = AbstractC3472bb1.i(str, this.e, this.h, d0());
                    return;
                }
                int i2 = i + iS2;
                this.h = i2;
                int i3 = AbstractC3472bb1.i(str, this.e, i2, d0());
                this.h = i;
                T0((i3 - i) - iS2);
                this.h = i3;
            } catch (AbstractC3472bb1.d e) {
                this.h = i;
                Y(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new d(e2);
            }
        }

        @Override // com.daaw.AbstractC10245zm
        public final void R0(int i, int i2) throws d {
            T0(AbstractC6027ki1.c(i, i2));
        }

        @Override // com.daaw.AbstractC10245zm
        public final void S0(int i, int i2) throws d {
            R0(i, 0);
            T0(i2);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void T0(int i) throws d {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.e;
                    int i2 = this.h;
                    this.h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr2 = this.e;
            int i3 = this.h;
            this.h = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.daaw.AbstractC10245zm
        public final void U0(int i, long j) throws d {
            R0(i, 0);
            V0(j);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void V0(long j) throws d {
            if (AbstractC10245zm.d && d0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    AbstractC3188aa1.O(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = 1 + i2;
                AbstractC3188aa1.O(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.e;
                    int i3 = this.h;
                    this.h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr4 = this.e;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        public final void W0(ByteBuffer byteBuffer) throws d {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.e, this.h, iRemaining);
                this.h += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(iRemaining)), e);
            }
        }

        public final void X0(byte[] bArr, int i, int i2) throws d {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        public final void Y0(int i, InterfaceC1900Pj0 interfaceC1900Pj0) throws d {
            R0(i, 2);
            E0(interfaceC1900Pj0);
        }

        @Override // com.daaw.AbstractC3783ci
        public final void a(ByteBuffer byteBuffer) throws d {
            W0(byteBuffer);
        }

        @Override // com.daaw.AbstractC10245zm, com.daaw.AbstractC3783ci
        public final void b(byte[] bArr, int i, int i2) throws d {
            X0(bArr, i, i2);
        }

        @Override // com.daaw.AbstractC10245zm
        public final int d0() {
            return this.g - this.h;
        }

        @Override // com.daaw.AbstractC10245zm
        public final void e0(byte b) throws d {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.daaw.AbstractC10245zm
        public final void f0(int i, boolean z) throws d {
            R0(i, 0);
            e0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void i0(byte[] bArr, int i, int i2) throws d {
            T0(i2);
            X0(bArr, i, i2);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void j0(int i, AbstractC4340ei abstractC4340ei) throws d {
            R0(i, 2);
            k0(abstractC4340ei);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void k0(AbstractC4340ei abstractC4340ei) throws d {
            T0(abstractC4340ei.size());
            abstractC4340ei.f0(this);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void p0(int i, int i2) throws d {
            R0(i, 5);
            q0(i2);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void q0(int i) throws d {
            try {
                byte[] bArr = this.e;
                int i2 = this.h;
                int i3 = i2 + 1;
                this.h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.h = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.daaw.AbstractC10245zm
        public final void r0(int i, long j) throws d {
            R0(i, 1);
            s0(j);
        }

        @Override // com.daaw.AbstractC10245zm
        public final void s0(long j) throws d {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                int i2 = i + 1;
                this.h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.h = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.daaw.AbstractC10245zm
        public final void z0(int i, int i2) throws d {
            R0(i, 0);
            A0(i2);
        }

        @Override // com.daaw.AbstractC10245zm
        public void X() {
        }
    }
}
