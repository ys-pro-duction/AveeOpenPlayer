package com.daaw;

import com.daaw.InterfaceC4684ft;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public interface U30 extends InterfaceC4684ft.b {
    public static final b k = b.B;

    public static final class a {
        public static /* synthetic */ void a(U30 u30, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            u30.j(cancellationException);
        }

        public static Object b(U30 u30, Object obj, InterfaceC3429bR interfaceC3429bR) {
            return InterfaceC4684ft.b.a.a(u30, obj, interfaceC3429bR);
        }

        public static InterfaceC4684ft.b c(U30 u30, InterfaceC4684ft.c cVar) {
            return InterfaceC4684ft.b.a.b(u30, cVar);
        }

        public static /* synthetic */ InterfaceC9531xC d(U30 u30, boolean z, boolean z2, NQ nq, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return u30.Y(z, z2, nq);
        }

        public static InterfaceC4684ft e(U30 u30, InterfaceC4684ft.c cVar) {
            return InterfaceC4684ft.b.a.c(u30, cVar);
        }

        public static InterfaceC4684ft f(U30 u30, InterfaceC4684ft interfaceC4684ft) {
            return InterfaceC4684ft.b.a.d(u30, interfaceC4684ft);
        }
    }

    public static final class b implements InterfaceC4684ft.c {
        public static final /* synthetic */ b B = new b();
    }

    InterfaceC9531xC E0(NQ nq);

    KP0 F();

    CancellationException R();

    InterfaceC9531xC Y(boolean z, boolean z2, NQ nq);

    boolean d();

    U30 getParent();

    void j(CancellationException cancellationException);

    boolean o();

    Object o0(InterfaceC1416Ks interfaceC1416Ks);

    InterfaceC1176Ik s0(InterfaceC1384Kk interfaceC1384Kk);

    boolean start();
}
