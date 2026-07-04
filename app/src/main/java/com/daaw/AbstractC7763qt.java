package com.daaw;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7763qt {
    public static final InterfaceC7484pt a(InterfaceC4684ft interfaceC4684ft) {
        if (interfaceC4684ft.a(U30.k) == null) {
            interfaceC4684ft = interfaceC4684ft.U(AbstractC3332b40.b(null, 1, null));
        }
        return new C0575Cs(interfaceC4684ft);
    }

    public static final InterfaceC7484pt b() {
        return new C0575Cs(AbstractC10182zZ0.b(null, 1, null).U(C7850rC.c()));
    }

    public static final void c(InterfaceC7484pt interfaceC7484pt, CancellationException cancellationException) {
        U30 u30 = (U30) interfaceC7484pt.i().a(U30.k);
        if (u30 != null) {
            u30.j(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC7484pt).toString());
    }

    public static /* synthetic */ void d(InterfaceC7484pt interfaceC7484pt, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        c(interfaceC7484pt, cancellationException);
    }

    public static final Object e(InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
        ON0 on0 = new ON0(interfaceC1416Ks.getContext(), interfaceC1416Ks);
        Object objB = A91.b(on0, on0, interfaceC3429bR);
        if (objB == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objB;
    }

    public static final boolean f(InterfaceC7484pt interfaceC7484pt) {
        U30 u30 = (U30) interfaceC7484pt.i().a(U30.k);
        if (u30 != null) {
            return u30.d();
        }
        return true;
    }
}
