package com.daaw;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.iR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5392iR1 extends AbstractC3665cG1 {
    public static final Logger b = Logger.getLogger(AbstractC5392iR1.class.getName());
    public static final boolean c = AbstractC4247eM2.C();
    public NR1 a;

    public /* synthetic */ AbstractC5392iR1(FQ1 fq1) {
    }

    public static int t(int i, InterfaceC7467pp2 interfaceC7467pp2, InterfaceC7500pw2 interfaceC7500pw2) {
        int iW = w(i << 3);
        return iW + iW + ((AbstractC8127sB1) interfaceC7467pp2).a(interfaceC7500pw2);
    }

    public static int u(InterfaceC7467pp2 interfaceC7467pp2, InterfaceC7500pw2 interfaceC7500pw2) {
        int iA = ((AbstractC8127sB1) interfaceC7467pp2).a(interfaceC7500pw2);
        return w(iA) + iA;
    }

    public static int v(String str) {
        int length;
        try {
            length = PO2.c(str);
        } catch (C6786nO2 unused) {
            length = str.getBytes(J82.b).length;
        }
        return w(length) + length;
    }

    public static int w(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int x(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static AbstractC5392iR1 y(byte[] bArr, int i, int i2) {
        return new C9864yP1(bArr, 0, i2);
    }

    public final void a(String str, C6786nO2 c6786nO2) throws C3705cQ1 {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c6786nO2);
        byte[] bytes = str.getBytes(J82.b);
        try {
            int length = bytes.length;
            q(length);
            m(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C3705cQ1(e);
        }
    }

    public abstract int c();

    public abstract void d(byte b2);

    public abstract void e(int i, boolean z);

    public abstract void f(int i, BM1 bm1);

    public abstract void g(int i, int i2);

    public abstract void h(int i);

    public abstract void i(int i, long j);

    public abstract void j(long j);

    public abstract void k(int i, int i2);

    public abstract void l(int i);

    public abstract void m(byte[] bArr, int i, int i2);

    public abstract void n(int i, String str);

    public abstract void o(int i, int i2);

    public abstract void p(int i, int i2);

    public abstract void q(int i);

    public abstract void r(int i, long j);

    public abstract void s(long j);

    public final void z() {
        if (c() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
