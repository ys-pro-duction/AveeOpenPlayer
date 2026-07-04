package com.daaw;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Vd3 extends Lc3 {
    public static final Logger b = Logger.getLogger(Vd3.class.getName());
    public static final boolean c = AbstractC5750ji3.C();
    public Wd3 a;

    public /* synthetic */ Vd3(Td3 td3) {
    }

    public static Vd3 A(byte[] bArr, int i, int i2) {
        return new Md3(bArr, 0, i2);
    }

    public static int u(int i, Kg3 kg3, InterfaceC4907gh3 interfaceC4907gh3) {
        int iA = ((AbstractC8797uc3) kg3).a(interfaceC4907gh3);
        int iY = y(i << 3);
        return iY + iY + iA;
    }

    public static int v(int i) {
        if (i >= 0) {
            return y(i);
        }
        return 10;
    }

    public static int w(Kg3 kg3, InterfaceC4907gh3 interfaceC4907gh3) {
        int iA = ((AbstractC8797uc3) kg3).a(interfaceC4907gh3);
        return y(iA) + iA;
    }

    public static int x(String str) {
        int length;
        try {
            length = AbstractC8548ti3.c(str);
        } catch (C7990ri3 unused) {
            length = str.getBytes(AbstractC10214zf3.b).length;
        }
        return y(length) + length;
    }

    public static int y(int i) {
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

    public static int z(long j) {
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
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void a() {
        if (d() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void b(String str, C7990ri3 c7990ri3) throws Pd3 {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c7990ri3);
        byte[] bytes = str.getBytes(AbstractC10214zf3.b);
        try {
            int length = bytes.length;
            r(length);
            n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new Pd3(e);
        }
    }

    public abstract int d();

    public abstract void e(byte b2);

    public abstract void f(int i, boolean z);

    public abstract void g(int i, AbstractC9646xd3 abstractC9646xd3);

    public abstract void h(int i, int i2);

    public abstract void i(int i);

    public abstract void j(int i, long j);

    public abstract void k(long j);

    public abstract void l(int i, int i2);

    public abstract void m(int i);

    public abstract void n(byte[] bArr, int i, int i2);

    public abstract void o(int i, String str);

    public abstract void p(int i, int i2);

    public abstract void q(int i, int i2);

    public abstract void r(int i);

    public abstract void s(int i, long j);

    public abstract void t(long j);
}
