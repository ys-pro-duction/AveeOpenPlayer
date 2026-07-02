package com.daaw;

import com.daaw.U30;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.b40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC3332b40 {
    public static final InterfaceC1707Nn a(U30 u30) {
        return new X30(u30);
    }

    public static /* synthetic */ InterfaceC1707Nn b(U30 u30, int i, Object obj) {
        if ((i & 1) != 0) {
            u30 = null;
        }
        return AbstractC3053a40.a(u30);
    }

    public static final void c(InterfaceC4684ft interfaceC4684ft, CancellationException cancellationException) {
        U30 u30 = (U30) interfaceC4684ft.a(U30.k);
        if (u30 != null) {
            u30.j(cancellationException);
        }
    }

    public static final void d(U30 u30, String str, Throwable th) {
        u30.j(AbstractC7317pI.a(str, th));
    }

    public static /* synthetic */ void e(InterfaceC4684ft interfaceC4684ft, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        AbstractC3053a40.c(interfaceC4684ft, cancellationException);
    }

    public static /* synthetic */ void f(U30 u30, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        AbstractC3053a40.d(u30, str, th);
    }

    public static final Object g(U30 u30, InterfaceC1416Ks interfaceC1416Ks) {
        U30.a.a(u30, null, 1, null);
        Object objO0 = u30.o0(interfaceC1416Ks);
        return objO0 == I10.c() ? objO0 : G91.a;
    }

    public static final InterfaceC9531xC h(U30 u30, InterfaceC9531xC interfaceC9531xC) {
        return u30.E0(new BC(interfaceC9531xC));
    }

    public static final void i(InterfaceC4684ft interfaceC4684ft) {
        U30 u30 = (U30) interfaceC4684ft.a(U30.k);
        if (u30 != null) {
            AbstractC3053a40.j(u30);
        }
    }

    public static final void j(U30 u30) {
        if (!u30.d()) {
            throw u30.R();
        }
    }

    public static final U30 k(InterfaceC4684ft interfaceC4684ft) {
        U30 u30 = (U30) interfaceC4684ft.a(U30.k);
        if (u30 != null) {
            return u30;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC4684ft).toString());
    }

    public static final boolean l(InterfaceC4684ft interfaceC4684ft) {
        U30 u30 = (U30) interfaceC4684ft.a(U30.k);
        if (u30 != null) {
            return u30.d();
        }
        return true;
    }
}
