package com.daaw;

/* JADX INFO: renamed from: com.daaw.po1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7461po1 {
    public int a;
    public int b;
    public InterfaceC1398Kn1 c;
    public InterfaceC8576to1 d;

    public static final boolean d(InterfaceC1190In1 interfaceC1190In1, int i, int i2) {
        C5900kE2 c5900kE2 = new C5900kE2(2);
        ((C9694xn1) interfaceC1190In1).h(c5900kE2.i(), 0, 2, false);
        return c5900kE2.y() == i;
    }

    public final int a(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) {
        int i = this.b;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC8576to1 interfaceC8576to1 = this.d;
        interfaceC8576to1.getClass();
        int iA = AbstractC8018ro1.a(interfaceC8576to1, interfaceC1190In1, 1024, true);
        if (iA == -1) {
            this.b = 2;
            this.d.c(0L, 1, this.a, 0, null);
            this.a = 0;
        } else {
            this.a += iA;
        }
        return 0;
    }

    public final void b(InterfaceC1398Kn1 interfaceC1398Kn1, String str) {
        this.c = interfaceC1398Kn1;
        InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(1024, 4);
        this.d = interfaceC8576to1O;
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.b(str);
        c1106Hs1.z(1);
        c1106Hs1.B(1);
        interfaceC8576to1O.e(c1106Hs1.D());
        this.c.b();
        this.c.p(new C7740qo1(-9223372036854775807L));
        this.b = 1;
    }

    public final void c(long j) {
        if (j == 0 || this.b == 1) {
            this.b = 1;
            this.a = 0;
        }
    }
}
