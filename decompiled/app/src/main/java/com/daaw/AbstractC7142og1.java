package com.daaw;

/* JADX INFO: renamed from: com.daaw.og1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7142og1 {

    /* JADX INFO: renamed from: com.daaw.og1$a */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(InterfaceC9001vJ interfaceC9001vJ, C2584Vs0 c2584Vs0) {
            interfaceC9001vJ.k(c2584Vs0.a, 0, 8);
            c2584Vs0.J(0);
            return new a(c2584Vs0.i(), c2584Vs0.n());
        }
    }

    public static C6863ng1 a(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
        AbstractC7115ob.e(interfaceC9001vJ);
        C2584Vs0 c2584Vs0 = new C2584Vs0(16);
        if (a.a(interfaceC9001vJ, c2584Vs0).a != AbstractC6280lb1.v("RIFF")) {
            return null;
        }
        int iX = 0;
        interfaceC9001vJ.k(c2584Vs0.a, 0, 4);
        c2584Vs0.J(0);
        if (c2584Vs0.i() != AbstractC6280lb1.v("WAVE")) {
            return null;
        }
        a aVarA = a.a(interfaceC9001vJ, c2584Vs0);
        while (aVarA.a != AbstractC6280lb1.v("fmt ")) {
            interfaceC9001vJ.h((int) aVarA.b);
            aVarA = a.a(interfaceC9001vJ, c2584Vs0);
        }
        AbstractC7115ob.f(aVarA.b >= 16);
        interfaceC9001vJ.k(c2584Vs0.a, 0, 16);
        c2584Vs0.J(0);
        int iP = c2584Vs0.p();
        int iP2 = c2584Vs0.p();
        int iO = c2584Vs0.o();
        int iO2 = c2584Vs0.o();
        int iP3 = c2584Vs0.p();
        int iP4 = c2584Vs0.p();
        int i = (iP2 * iP4) / 8;
        if (iP3 != i) {
            throw new C3000Zs0("Expected block alignment: " + i + "; got: " + iP3);
        }
        if (iP == 1) {
            iX = AbstractC6280lb1.x(iP4);
        } else if (iP != 3) {
            if (iP != 65534) {
                return null;
            }
            iX = AbstractC6280lb1.x(iP4);
        } else if (iP4 == 32) {
            iX = 4;
        }
        int i2 = iX;
        if (i2 == 0) {
            return null;
        }
        interfaceC9001vJ.h(((int) aVarA.b) - 16);
        return new C6863ng1(iP2, iO, iO2, iP3, iP4, i2);
    }

    public static void b(InterfaceC9001vJ interfaceC9001vJ, C6863ng1 c6863ng1) throws C3000Zs0 {
        AbstractC7115ob.e(interfaceC9001vJ);
        AbstractC7115ob.e(c6863ng1);
        interfaceC9001vJ.i();
        C2584Vs0 c2584Vs0 = new C2584Vs0(8);
        a aVarA = a.a(interfaceC9001vJ, c2584Vs0);
        while (aVarA.a != AbstractC6280lb1.v("data")) {
            long j = aVarA.b + 8;
            if (aVarA.a == AbstractC6280lb1.v("RIFF")) {
                j = 12;
            }
            if (j > 2147483647L) {
                throw new C3000Zs0("Chunk is too large (~2GB+) to skip; id: " + aVarA.a);
            }
            interfaceC9001vJ.j((int) j);
            aVarA = a.a(interfaceC9001vJ, c2584Vs0);
        }
        interfaceC9001vJ.j(8);
        c6863ng1.k(interfaceC9001vJ.getPosition(), aVarA.b);
    }
}
