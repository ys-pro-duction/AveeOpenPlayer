package com.daaw;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P33 extends AbstractC6138l33 {
    public static final Logger b = Logger.getLogger(P33.class.getName());
    public static final boolean c = K53.a();
    public Q33 a;

    public /* synthetic */ P33(O33 o33) {
    }

    public static int A(int i) {
        if (i >= 0) {
            return b(i);
        }
        return 10;
    }

    public static int B(U43 u43, InterfaceC7821r53 interfaceC7821r53) {
        int iA = ((AbstractC4444f33) u43).a(interfaceC7821r53);
        return b(iA) + iA;
    }

    public static int C(String str) {
        int length;
        try {
            length = P53.e(str);
        } catch (O53 unused) {
            length = str.getBytes(AbstractC8374t43.b).length;
        }
        return b(length) + length;
    }

    public static int b(int i) {
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

    public static int c(long j) {
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

    public static P33 d(byte[] bArr, int i, int i2) {
        return new L33(bArr, 0, i2);
    }

    public static int z(int i, U43 u43, InterfaceC7821r53 interfaceC7821r53) {
        int iA = ((AbstractC4444f33) u43).a(interfaceC7821r53);
        int iB = b(i << 3);
        return iB + iB + iA;
    }

    @Override // com.daaw.AbstractC6138l33
    public abstract void a(byte[] bArr, int i, int i2);

    public final void e() {
        if (l() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void f(String str, O53 o53) throws M33 {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) o53);
        byte[] bytes = str.getBytes(AbstractC8374t43.b);
        try {
            int length = bytes.length;
            w(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new M33(e);
        }
    }

    public abstract void h();

    public abstract void i(byte b2);

    public abstract void j(int i, boolean z);

    public abstract void k(int i, AbstractC9213w33 abstractC9213w33);

    public abstract int l();

    public abstract void m(int i, int i2);

    public abstract void n(int i);

    public abstract void o(int i, long j);

    public abstract void p(long j);

    public abstract void q(int i, int i2);

    public abstract void r(int i);

    public abstract void s(int i, U43 u43, InterfaceC7821r53 interfaceC7821r53);

    public abstract void t(int i, String str);

    public abstract void u(int i, int i2);

    public abstract void v(int i, int i2);

    public abstract void w(int i);

    public abstract void x(int i, long j);

    public abstract void y(long j);
}
