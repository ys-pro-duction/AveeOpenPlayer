package com.daaw;

import com.daaw.AbstractC4512fJ0;

/* JADX INFO: renamed from: com.daaw.gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4913gj {
    public static final void a(InterfaceC1416Ks interfaceC1416Ks, Throwable th) throws Throwable {
        AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
        interfaceC1416Ks.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(th)));
        throw th;
    }

    public static final void b(InterfaceC1416Ks interfaceC1416Ks, InterfaceC1416Ks interfaceC1416Ks2) throws Throwable {
        try {
            InterfaceC1416Ks interfaceC1416KsB = H10.b(interfaceC1416Ks);
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            AbstractC6456mC.c(interfaceC1416KsB, AbstractC4512fJ0.a(G91.a), null, 2, null);
        } catch (Throwable th) {
            a(interfaceC1416Ks2, th);
        }
    }

    public static final void c(InterfaceC3429bR interfaceC3429bR, Object obj, InterfaceC1416Ks interfaceC1416Ks, NQ nq) throws Throwable {
        try {
            InterfaceC1416Ks interfaceC1416KsB = H10.b(H10.a(interfaceC3429bR, obj, interfaceC1416Ks));
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            AbstractC6456mC.b(interfaceC1416KsB, AbstractC4512fJ0.a(G91.a), nq);
        } catch (Throwable th) {
            a(interfaceC1416Ks, th);
        }
    }

    public static /* synthetic */ void d(InterfaceC3429bR interfaceC3429bR, Object obj, InterfaceC1416Ks interfaceC1416Ks, NQ nq, int i, Object obj2) throws Throwable {
        if ((i & 4) != 0) {
            nq = null;
        }
        c(interfaceC3429bR, obj, interfaceC1416Ks, nq);
    }
}
