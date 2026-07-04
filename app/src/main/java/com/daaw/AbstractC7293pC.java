package com.daaw;

import com.daaw.AbstractC4512fJ0;

/* JADX INFO: renamed from: com.daaw.pC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7293pC {
    public static final void a(AbstractC7014oC abstractC7014oC, int i) {
        InterfaceC1416Ks interfaceC1416KsC = abstractC7014oC.c();
        boolean z = i == 4;
        if (z || !(interfaceC1416KsC instanceof C6177lC) || b(i) != b(abstractC7014oC.D)) {
            d(abstractC7014oC, interfaceC1416KsC, z);
            return;
        }
        AbstractC5801jt abstractC5801jt = ((C6177lC) interfaceC1416KsC).E;
        InterfaceC4684ft context = interfaceC1416KsC.getContext();
        if (abstractC5801jt.i1(context)) {
            abstractC5801jt.g1(context, abstractC7014oC);
        } else {
            e(abstractC7014oC);
        }
    }

    public static final boolean b(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean c(int i) {
        return i == 2;
    }

    public static final void d(AbstractC7014oC abstractC7014oC, InterfaceC1416Ks interfaceC1416Ks, boolean z) {
        Object objE;
        Object objG = abstractC7014oC.g();
        Throwable thD = abstractC7014oC.d(objG);
        if (thD != null) {
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            objE = AbstractC4801gJ0.a(thD);
        } else {
            AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
            objE = abstractC7014oC.e(objG);
        }
        Object objA = AbstractC4512fJ0.a(objE);
        if (!z) {
            interfaceC1416Ks.x(objA);
            return;
        }
        G10.e(interfaceC1416Ks, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C6177lC c6177lC = (C6177lC) interfaceC1416Ks;
        InterfaceC1416Ks interfaceC1416Ks2 = c6177lC.F;
        Object obj = c6177lC.H;
        InterfaceC4684ft context = interfaceC1416Ks2.getContext();
        Object objC = AbstractC5010h31.c(context, obj);
        C10078z91 c10078z91G = objC != AbstractC5010h31.a ? AbstractC4963gt.g(interfaceC1416Ks2, context, objC) : null;
        try {
            c6177lC.F.x(objA);
            G91 g91 = G91.a;
            if (c10078z91G == null || c10078z91G.V0()) {
                AbstractC5010h31.a(context, objC);
            }
        } catch (Throwable th) {
            if (c10078z91G == null || c10078z91G.V0()) {
                AbstractC5010h31.a(context, objC);
            }
            throw th;
        }
    }

    public static final void e(AbstractC7014oC abstractC7014oC) {
        NH nhB = C5848k31.a.b();
        if (nhB.r1()) {
            nhB.n1(abstractC7014oC);
            return;
        }
        nhB.p1(true);
        try {
            d(abstractC7014oC, abstractC7014oC.c(), true);
            do {
            } while (nhB.u1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
