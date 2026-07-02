package com.daaw;

import android.util.SparseArray;
import com.daaw.CO0;
import com.daaw.InterfaceC8103s61;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.vB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8970vB0 implements InterfaceC8715uJ {
    public static final InterfaceC10117zJ h = new a();
    public final R31 a;
    public final SparseArray b;
    public final C2584Vs0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public InterfaceC9838yJ g;

    /* JADX INFO: renamed from: com.daaw.vB0$a */
    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new C8970vB0()};
        }
    }

    /* JADX INFO: renamed from: com.daaw.vB0$b */
    public static final class b {
        public final InterfaceC9543xF a;
        public final R31 b;
        public final C2480Us0 c = new C2480Us0(new byte[64]);
        public boolean d;
        public boolean e;
        public boolean f;
        public int g;
        public long h;

        public b(InterfaceC9543xF interfaceC9543xF, R31 r31) {
            this.a = interfaceC9543xF;
            this.b = r31;
        }

        public void a(C2584Vs0 c2584Vs0) {
            c2584Vs0.g(this.c.a, 0, 3);
            this.c.m(0);
            b();
            c2584Vs0.g(this.c.a, 0, this.g);
            this.c.m(0);
            c();
            this.a.e(this.h, true);
            this.a.a(c2584Vs0);
            this.a.c();
        }

        public final void b() {
            this.c.o(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.o(6);
            this.g = this.c.h(8);
        }

        public final void c() {
            this.h = 0L;
            if (this.d) {
                this.c.o(4);
                long jH = ((long) this.c.h(3)) << 30;
                this.c.o(1);
                long jH2 = jH | ((long) (this.c.h(15) << 15));
                this.c.o(1);
                long jH3 = jH2 | ((long) this.c.h(15));
                this.c.o(1);
                if (!this.f && this.e) {
                    this.c.o(4);
                    long jH4 = ((long) this.c.h(3)) << 30;
                    this.c.o(1);
                    long jH5 = jH4 | ((long) (this.c.h(15) << 15));
                    this.c.o(1);
                    long jH6 = jH5 | ((long) this.c.h(15));
                    this.c.o(1);
                    this.b.b(jH6);
                    this.f = true;
                }
                this.h = this.b.b(jH3);
            }
        }

        public void d() {
            this.f = false;
            this.a.b();
        }
    }

    public C8970vB0() {
        this(new R31(0L));
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        byte[] bArr = new byte[14];
        interfaceC9001vJ.k(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC9001vJ.h(bArr[13] & 7);
        interfaceC9001vJ.k(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) {
        InterfaceC9543xF c8480tU;
        if (!interfaceC9001vJ.e(this.c.a, 0, 4, true)) {
            return -1;
        }
        this.c.J(0);
        int i = this.c.i();
        if (i == 441) {
            return -1;
        }
        if (i == 442) {
            interfaceC9001vJ.k(this.c.a, 0, 10);
            this.c.J(9);
            interfaceC9001vJ.j((this.c.x() & 7) + 14);
            return 0;
        }
        if (i == 443) {
            interfaceC9001vJ.k(this.c.a, 0, 2);
            this.c.J(0);
            interfaceC9001vJ.j(this.c.D() + 6);
            return 0;
        }
        if (((i & (-256)) >> 8) != 1) {
            interfaceC9001vJ.j(1);
            return 0;
        }
        int i2 = i & 255;
        b bVar = (b) this.b.get(i2);
        if (!this.d) {
            if (bVar == null) {
                boolean z = this.e;
                if (!z && i2 == 189) {
                    c8480tU = new C4430f1();
                    this.e = true;
                } else if (!z && (i & 224) == 192) {
                    c8480tU = new C1389Kl0();
                    this.e = true;
                } else if (this.f || (i & 240) != 224) {
                    c8480tU = null;
                } else {
                    c8480tU = new C8480tU();
                    this.f = true;
                }
                if (c8480tU != null) {
                    c8480tU.d(this.g, new InterfaceC8103s61.d(i2, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                    bVar = new b(c8480tU, this.a);
                    this.b.put(i2, bVar);
                }
            }
            if ((this.e && this.f) || interfaceC9001vJ.getPosition() > 1048576) {
                this.d = true;
                this.g.n();
            }
        }
        interfaceC9001vJ.k(this.c.a, 0, 2);
        this.c.J(0);
        int iD = this.c.D() + 6;
        if (bVar == null) {
            interfaceC9001vJ.j(iD);
        } else {
            this.c.G(iD);
            interfaceC9001vJ.g(this.c.a, 0, iD);
            this.c.J(6);
            bVar.a(this.c);
            C2584Vs0 c2584Vs0 = this.c;
            c2584Vs0.I(c2584Vs0.b());
        }
        return 0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        this.a.g();
        for (int i = 0; i < this.b.size(); i++) {
            ((b) this.b.valueAt(i)).d();
        }
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.g = interfaceC9838yJ;
        interfaceC9838yJ.b(new CO0.b(-9223372036854775807L));
    }

    public C8970vB0(R31 r31) {
        this.a = r31;
        this.c = new C2584Vs0(4096);
        this.b = new SparseArray();
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
