package com.daaw;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Wq3 {
    public final C5900kE2 a = new C5900kE2(32);
    public Vq3 b;
    public Vq3 c;
    public Vq3 d;
    public long e;
    public final Ls3 f;

    public Wq3(Ls3 ls3) {
        this.f = ls3;
        Vq3 vq3 = new Vq3(0L, 65536);
        this.b = vq3;
        this.c = vq3;
        this.d = vq3;
    }

    public static Vq3 j(Vq3 vq3, long j) {
        while (j >= vq3.b) {
            vq3 = vq3.d;
        }
        return vq3;
    }

    public static Vq3 k(Vq3 vq3, long j, ByteBuffer byteBuffer, int i) {
        Vq3 vq3J = j(vq3, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (vq3J.b - j));
            byteBuffer.put(vq3J.c.a, vq3J.a(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == vq3J.b) {
                vq3J = vq3J.d;
            }
        }
        return vq3J;
    }

    public static Vq3 l(Vq3 vq3, long j, byte[] bArr, int i) {
        Vq3 vq3J = j(vq3, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (vq3J.b - j));
            System.arraycopy(vq3J.c.a, vq3J.a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == vq3J.b) {
                vq3J = vq3J.d;
            }
        }
        return vq3J;
    }

    public static Vq3 m(Vq3 vq3, H93 h93, Yq3 yq3, C5900kE2 c5900kE2) {
        Vq3 vq3L;
        int iY;
        if (h93.k()) {
            long j = yq3.b;
            c5900kE2.d(1);
            Vq3 vq3L2 = l(vq3, j, c5900kE2.i(), 1);
            long j2 = j + 1;
            byte b = c5900kE2.i()[0];
            int i = b & 128;
            int i2 = b & 127;
            C10080z93 c10080z93 = h93.c;
            byte[] bArr = c10080z93.a;
            if (bArr == null) {
                c10080z93.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            vq3L = l(vq3L2, j2, c10080z93.a, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                c5900kE2.d(2);
                vq3L = l(vq3L, j3, c5900kE2.i(), 2);
                j3 += 2;
                iY = c5900kE2.y();
            } else {
                iY = 1;
            }
            int[] iArr = c10080z93.d;
            if (iArr == null || iArr.length < iY) {
                iArr = new int[iY];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = c10080z93.e;
            if (iArr3 == null || iArr3.length < iY) {
                iArr3 = new int[iY];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = iY * 6;
                c5900kE2.d(i3);
                vq3L = l(vq3L, j3, c5900kE2.i(), i3);
                j3 += (long) i3;
                c5900kE2.g(0);
                for (int i4 = 0; i4 < iY; i4++) {
                    iArr2[i4] = c5900kE2.y();
                    iArr4[i4] = c5900kE2.x();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = yq3.a - ((int) (j3 - yq3.b));
            }
            C8297so1 c8297so1 = yq3.c;
            int i5 = AbstractC9004vJ2.a;
            c10080z93.c(iY, iArr2, iArr4, c8297so1.b, c10080z93.a, c8297so1.a, c8297so1.c, c8297so1.d);
            long j4 = yq3.b;
            int i6 = (int) (j3 - j4);
            yq3.b = j4 + ((long) i6);
            yq3.a -= i6;
        } else {
            vq3L = vq3;
        }
        if (!h93.e()) {
            h93.i(yq3.a);
            return k(vq3L, yq3.b, h93.d, yq3.a);
        }
        c5900kE2.d(4);
        Vq3 vq3L3 = l(vq3L, yq3.b, c5900kE2.i(), 4);
        int iX = c5900kE2.x();
        yq3.b += 4;
        yq3.a -= 4;
        h93.i(iX);
        Vq3 vq3K = k(vq3L3, yq3.b, h93.d, iX);
        yq3.b += (long) iX;
        int i7 = yq3.a - iX;
        yq3.a = i7;
        ByteBuffer byteBuffer = h93.g;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            h93.g = ByteBuffer.allocate(i7);
        } else {
            h93.g.clear();
        }
        return k(vq3K, yq3.b, h93.g, yq3.a);
    }

    public final int a(InterfaceC8304sp3 interfaceC8304sp3, int i, boolean z) throws EOFException {
        int i2 = i(i);
        Vq3 vq3 = this.d;
        int iD = interfaceC8304sp3.d(vq3.c.a, vq3.a(this.e), i2);
        if (iD != -1) {
            n(iD);
            return iD;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final long b() {
        return this.e;
    }

    public final void c(long j) {
        Vq3 vq3;
        if (j != -1) {
            while (true) {
                vq3 = this.b;
                if (j < vq3.b) {
                    break;
                }
                this.f.c(vq3.c);
                this.b = this.b.b();
            }
            if (this.c.a < vq3.a) {
                this.c = vq3;
            }
        }
    }

    public final void d(H93 h93, Yq3 yq3) {
        m(this.c, h93, yq3, this.a);
    }

    public final void e(H93 h93, Yq3 yq3) {
        this.c = m(this.c, h93, yq3, this.a);
    }

    public final void f() {
        Vq3 vq3 = this.b;
        if (vq3.c != null) {
            this.f.d(vq3);
            vq3.b();
        }
        this.b.c(0L, 65536);
        Vq3 vq32 = this.b;
        this.c = vq32;
        this.d = vq32;
        this.e = 0L;
        this.f.g();
    }

    public final void g() {
        this.c = this.b;
    }

    public final void h(C5900kE2 c5900kE2, int i) {
        while (i > 0) {
            int i2 = i(i);
            Vq3 vq3 = this.d;
            c5900kE2.c(vq3.c.a, vq3.a(this.e), i2);
            i -= i2;
            n(i2);
        }
    }

    public final int i(int i) {
        Vq3 vq3 = this.d;
        if (vq3.c == null) {
            Es3 es3B = this.f.b();
            Vq3 vq32 = new Vq3(this.d.b, 65536);
            vq3.c = es3B;
            vq3.d = vq32;
        }
        return Math.min(i, (int) (this.d.b - this.e));
    }

    public final void n(int i) {
        long j = this.e + ((long) i);
        this.e = j;
        Vq3 vq3 = this.d;
        if (j == vq3.b) {
            this.d = vq3.d;
        }
    }
}
