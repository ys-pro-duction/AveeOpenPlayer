package com.daaw;

import com.daaw.CO0;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.Ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1228Ix implements InterfaceC1093Hp0 {
    public final C0989Gp0 a = new C0989Gp0();
    public final long b;
    public final long c;
    public final VX0 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    /* JADX INFO: renamed from: com.daaw.Ix$b */
    public class b implements CO0 {
        public b() {
        }

        @Override // com.daaw.CO0
        public boolean e() {
            return true;
        }

        @Override // com.daaw.CO0
        public CO0.a g(long j) {
            if (j == 0) {
                return new CO0.a(new EO0(0L, C1228Ix.this.b));
            }
            long jB = C1228Ix.this.d.b(j);
            C1228Ix c1228Ix = C1228Ix.this;
            return new CO0.a(new EO0(j, c1228Ix.i(c1228Ix.b, jB, 30000L)));
        }

        @Override // com.daaw.CO0
        public long h() {
            return C1228Ix.this.d.a(C1228Ix.this.f);
        }
    }

    public C1228Ix(long j, long j2, VX0 vx0, int i, long j3) {
        AbstractC7115ob.a(j >= 0 && j2 > j);
        this.d = vx0;
        this.b = j;
        this.c = j2;
        if (i != j2 - j) {
            this.e = 0;
        } else {
            this.f = j3;
            this.e = 3;
        }
    }

    @Override // com.daaw.InterfaceC1093Hp0
    public long a(InterfaceC9001vJ interfaceC9001vJ) throws IOException {
        C1228Ix c1228Ix;
        InterfaceC9001vJ interfaceC9001vJ2;
        C1228Ix c1228Ix2;
        int i = this.e;
        if (i == 0) {
            c1228Ix = this;
            interfaceC9001vJ2 = interfaceC9001vJ;
            long position = interfaceC9001vJ2.getPosition();
            c1228Ix.g = position;
            c1228Ix.e = 1;
            long j = c1228Ix.c - 65307;
            if (j > position) {
                return j;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                long j2 = this.h;
                long jO = 0;
                if (j2 == 0) {
                    c1228Ix2 = this;
                } else {
                    long j3 = j(j2, interfaceC9001vJ);
                    if (j3 >= 0) {
                        return j3;
                    }
                    c1228Ix2 = this;
                    jO = c1228Ix2.o(interfaceC9001vJ, this.h, -(j3 + 2));
                }
                c1228Ix2.e = 3;
                return -(jO + 2);
            }
            c1228Ix = this;
            interfaceC9001vJ2 = interfaceC9001vJ;
        }
        c1228Ix.f = k(interfaceC9001vJ2);
        c1228Ix.e = 3;
        return c1228Ix.g;
    }

    @Override // com.daaw.InterfaceC1093Hp0
    public long d(long j) {
        int i = this.e;
        AbstractC7115ob.a(i == 3 || i == 2);
        this.h = j != 0 ? this.d.b(j) : 0L;
        this.e = 2;
        l();
        return this.h;
    }

    @Override // com.daaw.InterfaceC1093Hp0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b c() {
        if (this.f != 0) {
            return new b();
        }
        return null;
    }

    public final long i(long j, long j2, long j3) {
        long j4 = this.c;
        long j5 = this.b;
        long j6 = j + (((j2 * (j4 - j5)) / this.f) - j3);
        if (j6 >= j5) {
            j5 = j6;
        }
        return j5 >= j4 ? j4 - 1 : j5;
    }

    public long j(long j, InterfaceC9001vJ interfaceC9001vJ) throws IOException {
        if (this.i == this.j) {
            return -(this.k + 2);
        }
        long position = interfaceC9001vJ.getPosition();
        if (!n(interfaceC9001vJ, this.j)) {
            long j2 = this.i;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(interfaceC9001vJ, false);
        interfaceC9001vJ.i();
        C0989Gp0 c0989Gp0 = this.a;
        long j3 = c0989Gp0.c;
        long j4 = j - j3;
        int i = c0989Gp0.h + c0989Gp0.i;
        if (j4 >= 0 && j4 <= 72000) {
            interfaceC9001vJ.j(i);
            return -(this.a.c + 2);
        }
        if (j4 < 0) {
            this.j = position;
            this.l = j3;
        } else {
            long j5 = i;
            long position2 = interfaceC9001vJ.getPosition() + j5;
            this.i = position2;
            this.k = this.a.c;
            if ((this.j - position2) + j5 < 100000) {
                interfaceC9001vJ.j(i);
                return -(this.k + 2);
            }
        }
        long j6 = this.j;
        long j7 = this.i;
        if (j6 - j7 < 100000) {
            this.j = j7;
            return j7;
        }
        long position3 = interfaceC9001vJ.getPosition() - (((long) i) * (j4 > 0 ? 1L : 2L));
        long j8 = this.j;
        long j9 = this.i;
        return Math.min(Math.max(position3 + ((j4 * (j8 - j9)) / (this.l - this.k)), j9), this.j - 1);
    }

    public long k(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0, EOFException {
        m(interfaceC9001vJ);
        this.a.b();
        while ((this.a.b & 4) != 4 && interfaceC9001vJ.getPosition() < this.c) {
            this.a.a(interfaceC9001vJ, false);
            C0989Gp0 c0989Gp0 = this.a;
            interfaceC9001vJ.j(c0989Gp0.h + c0989Gp0.i);
        }
        return this.a.c;
    }

    public void l() {
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    public void m(InterfaceC9001vJ interfaceC9001vJ) throws EOFException {
        if (!n(interfaceC9001vJ, this.c)) {
            throw new EOFException();
        }
    }

    public boolean n(InterfaceC9001vJ interfaceC9001vJ, long j) {
        int i;
        long jMin = Math.min(j + 3, this.c);
        int position = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i2 = 0;
            if (interfaceC9001vJ.getPosition() + ((long) position) > jMin && (position = (int) (jMin - interfaceC9001vJ.getPosition())) < 4) {
                return false;
            }
            interfaceC9001vJ.e(bArr, 0, position, false);
            while (true) {
                i = position - 3;
                if (i2 < i) {
                    if (bArr[i2] == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103 && bArr[i2 + 3] == 83) {
                        interfaceC9001vJ.j(i2);
                        return true;
                    }
                    i2++;
                }
            }
            interfaceC9001vJ.j(i);
        }
    }

    public long o(InterfaceC9001vJ interfaceC9001vJ, long j, long j2) throws C3000Zs0, EOFException {
        this.a.a(interfaceC9001vJ, false);
        while (true) {
            C0989Gp0 c0989Gp0 = this.a;
            if (c0989Gp0.c >= j) {
                interfaceC9001vJ.i();
                return j2;
            }
            interfaceC9001vJ.j(c0989Gp0.h + c0989Gp0.i);
            C0989Gp0 c0989Gp02 = this.a;
            long j3 = c0989Gp02.c;
            c0989Gp02.a(interfaceC9001vJ, false);
            j2 = j3;
        }
    }
}
