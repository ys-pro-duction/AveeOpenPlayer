package com.daaw;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.daaw.ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4412ex implements InterfaceC4784gF {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final C1250Jc1 c = new C1250Jc1();
    public InterfaceC5063hF d;
    public int e;
    public int f;
    public long g;

    /* JADX INFO: renamed from: com.daaw.ex$b */
    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    @Override // com.daaw.InterfaceC4784gF
    public boolean a(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
        AbstractC7115ob.f(this.d != null);
        while (true) {
            if (!this.b.isEmpty() && interfaceC9001vJ.getPosition() >= ((b) this.b.peek()).b) {
                this.d.a(((b) this.b.pop()).a);
                return true;
            }
            if (this.e == 0) {
                long jD = this.c.d(interfaceC9001vJ, true, false, 4);
                if (jD == -2) {
                    jD = c(interfaceC9001vJ);
                }
                if (jD == -1) {
                    return false;
                }
                this.f = (int) jD;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d(interfaceC9001vJ, false, true, 8);
                this.e = 2;
            }
            int iB = this.d.b(this.f);
            if (iB != 0) {
                if (iB == 1) {
                    long position = interfaceC9001vJ.getPosition();
                    this.b.push(new b(this.f, this.g + position));
                    this.d.f(this.f, position, this.g);
                    this.e = 0;
                    return true;
                }
                if (iB == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.h(this.f, e(interfaceC9001vJ, (int) j));
                        this.e = 0;
                        return true;
                    }
                    throw new C3000Zs0("Invalid integer size: " + this.g);
                }
                if (iB == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        this.d.d(this.f, f(interfaceC9001vJ, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    throw new C3000Zs0("String element size: " + this.g);
                }
                if (iB == 4) {
                    this.d.g(this.f, (int) this.g, interfaceC9001vJ);
                    this.e = 0;
                    return true;
                }
                if (iB != 5) {
                    throw new C3000Zs0("Invalid element type " + iB);
                }
                long j3 = this.g;
                if (j3 == 4 || j3 == 8) {
                    this.d.e(this.f, d(interfaceC9001vJ, (int) j3));
                    this.e = 0;
                    return true;
                }
                throw new C3000Zs0("Invalid float size: " + this.g);
            }
            interfaceC9001vJ.j((int) this.g);
            this.e = 0;
        }
    }

    @Override // com.daaw.InterfaceC4784gF
    public void b(InterfaceC5063hF interfaceC5063hF) {
        this.d = interfaceC5063hF;
    }

    public final long c(InterfaceC9001vJ interfaceC9001vJ) {
        interfaceC9001vJ.i();
        while (true) {
            interfaceC9001vJ.k(this.a, 0, 4);
            int iC = C1250Jc1.c(this.a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) C1250Jc1.a(this.a, iC, false);
                if (this.d.c(iA)) {
                    interfaceC9001vJ.j(iC);
                    return iA;
                }
            }
            interfaceC9001vJ.j(1);
        }
    }

    public final double d(InterfaceC9001vJ interfaceC9001vJ, int i) {
        return i == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(e(interfaceC9001vJ, i));
    }

    public final long e(InterfaceC9001vJ interfaceC9001vJ, int i) {
        interfaceC9001vJ.g(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
        }
        return j;
    }

    public final String f(InterfaceC9001vJ interfaceC9001vJ, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        interfaceC9001vJ.g(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.daaw.InterfaceC4784gF
    public void reset() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }
}
