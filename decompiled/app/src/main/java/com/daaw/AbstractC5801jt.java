package com.daaw;

import com.daaw.InterfaceC1727Ns;
import com.daaw.InterfaceC4684ft;

/* JADX INFO: renamed from: com.daaw.jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5801jt extends AbstractC9751y implements InterfaceC1727Ns {
    public static final a C = new a(null);

    /* JADX INFO: renamed from: com.daaw.jt$a */
    public static final class a extends AbstractC10030z {

        /* JADX INFO: renamed from: com.daaw.jt$a$a, reason: collision with other inner class name */
        public static final class C0200a extends AbstractC4192e90 implements NQ {
            public static final C0200a B = new C0200a();

            public C0200a() {
                super(1);
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC5801jt invoke(InterfaceC4684ft.b bVar) {
                if (bVar instanceof AbstractC5801jt) {
                    return (AbstractC5801jt) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
            super(InterfaceC1727Ns.e, C0200a.B);
        }
    }

    public AbstractC5801jt() {
        super(InterfaceC1727Ns.e);
    }

    @Override // com.daaw.AbstractC9751y, com.daaw.InterfaceC4684ft
    public InterfaceC4684ft Q0(InterfaceC4684ft.c cVar) {
        return InterfaceC1727Ns.a.b(this, cVar);
    }

    @Override // com.daaw.AbstractC9751y, com.daaw.InterfaceC4684ft.b, com.daaw.InterfaceC4684ft
    public InterfaceC4684ft.b a(InterfaceC4684ft.c cVar) {
        return InterfaceC1727Ns.a.a(this, cVar);
    }

    public abstract void g1(InterfaceC4684ft interfaceC4684ft, Runnable runnable);

    public void h1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        g1(interfaceC4684ft, runnable);
    }

    public boolean i1(InterfaceC4684ft interfaceC4684ft) {
        return true;
    }

    public AbstractC5801jt j1(int i) {
        AbstractC2828Yb0.a(i);
        return new C2724Xb0(this, i);
    }

    @Override // com.daaw.InterfaceC1727Ns
    public final InterfaceC1416Ks q0(InterfaceC1416Ks interfaceC1416Ks) {
        return new C6177lC(this, interfaceC1416Ks);
    }

    public String toString() {
        return AbstractC8054rw.a(this) + '@' + AbstractC8054rw.b(this);
    }

    @Override // com.daaw.InterfaceC1727Ns
    public final void x0(InterfaceC1416Ks interfaceC1416Ks) {
        G10.e(interfaceC1416Ks, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C6177lC) interfaceC1416Ks).p();
    }
}
