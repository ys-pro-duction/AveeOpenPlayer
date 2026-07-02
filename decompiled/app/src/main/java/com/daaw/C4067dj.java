package com.daaw;

import com.daaw.U30;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4067dj extends AbstractC7014oC implements InterfaceC3788cj, InterfaceC8320st, InterfaceC4332eg1 {
    public static final AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(C4067dj.class, "_decisionAndIndex");
    public static final AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(C4067dj.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater I = AtomicReferenceFieldUpdater.newUpdater(C4067dj.class, Object.class, "_parentHandle");
    public final InterfaceC1416Ks E;
    public final InterfaceC4684ft F;
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    public C4067dj(InterfaceC1416Ks interfaceC1416Ks, int i) {
        super(i);
        this.E = interfaceC1416Ks;
        this.F = interfaceC1416Ks.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C8639u2.B;
    }

    public static /* synthetic */ void O(C4067dj c4067dj, Object obj, int i, NQ nq, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            nq = null;
        }
        c4067dj.N(obj, i, nq);
    }

    public final void A(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C8639u2)) {
                if (obj2 instanceof AbstractC2751Xi ? true : obj2 instanceof GO0) {
                    E(obj, obj2);
                } else {
                    if (obj2 instanceof C2041Qn) {
                        C2041Qn c2041Qn = (C2041Qn) obj2;
                        if (!c2041Qn.b()) {
                            E(obj, obj2);
                        }
                        if (obj2 instanceof C5751jj) {
                            if (!AbstractC2988Zp0.a(obj2)) {
                                c2041Qn = null;
                            }
                            Throwable th = c2041Qn != null ? c2041Qn.a : null;
                            if (obj instanceof AbstractC2751Xi) {
                                j((AbstractC2751Xi) obj, th);
                                return;
                            } else {
                                G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                l((GO0) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C1811On) {
                        C1811On c1811On = (C1811On) obj2;
                        if (c1811On.b != null) {
                            E(obj, obj2);
                        }
                        if (obj instanceof GO0) {
                            return;
                        }
                        G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC2751Xi abstractC2751Xi = (AbstractC2751Xi) obj;
                        if (c1811On.c()) {
                            j(abstractC2751Xi, c1811On.e);
                            return;
                        } else {
                            if (AbstractC5549j0.a(H, this, obj2, C1811On.b(c1811On, null, abstractC2751Xi, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof GO0) {
                            return;
                        }
                        G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (AbstractC5549j0.a(H, this, obj2, new C1811On(obj2, (AbstractC2751Xi) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (AbstractC5549j0.a(H, this, obj2, obj)) {
                return;
            }
        }
    }

    public final boolean B() {
        if (!AbstractC7293pC.c(this.D)) {
            return false;
        }
        InterfaceC1416Ks interfaceC1416Ks = this.E;
        G10.e(interfaceC1416Ks, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C6177lC) interfaceC1416Ks).m();
    }

    @Override // com.daaw.InterfaceC3788cj
    public void C(AbstractC5801jt abstractC5801jt, Object obj) {
        InterfaceC1416Ks interfaceC1416Ks = this.E;
        C6177lC c6177lC = interfaceC1416Ks instanceof C6177lC ? (C6177lC) interfaceC1416Ks : null;
        O(this, obj, (c6177lC != null ? c6177lC.E : null) == abstractC5801jt ? 4 : this.D, null, 4, null);
    }

    public final AbstractC2751Xi D(NQ nq) {
        return nq instanceof AbstractC2751Xi ? (AbstractC2751Xi) nq : new W10(nq);
    }

    public final void E(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String F() {
        return "CancellableContinuation";
    }

    @Override // com.daaw.InterfaceC3788cj
    public Object G(Object obj, Object obj2, NQ nq) {
        return R(obj, obj2, nq);
    }

    public final void H(Throwable th) {
        if (m(th)) {
            return;
        }
        L(th);
        p();
    }

    public final void I() {
        Throwable thQ;
        InterfaceC1416Ks interfaceC1416Ks = this.E;
        C6177lC c6177lC = interfaceC1416Ks instanceof C6177lC ? (C6177lC) interfaceC1416Ks : null;
        if (c6177lC == null || (thQ = c6177lC.q(this)) == null) {
            return;
        }
        n();
        L(thQ);
    }

    public final boolean J() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C1811On) && ((C1811On) obj).d != null) {
            n();
            return false;
        }
        G.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C8639u2.B);
        return true;
    }

    @Override // com.daaw.InterfaceC3788cj
    public void K(Object obj, NQ nq) {
        N(obj, this.D, nq);
    }

    @Override // com.daaw.InterfaceC3788cj
    public boolean L(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC10256zo0)) {
                return false;
            }
        } while (!AbstractC5549j0.a(H, this, obj, new C5751jj(this, th, (obj instanceof AbstractC2751Xi) || (obj instanceof GO0))));
        InterfaceC10256zo0 interfaceC10256zo0 = (InterfaceC10256zo0) obj;
        if (interfaceC10256zo0 instanceof AbstractC2751Xi) {
            j((AbstractC2751Xi) obj, th);
        } else if (interfaceC10256zo0 instanceof GO0) {
            l((GO0) obj, th);
        }
        p();
        q(this.D);
        return true;
    }

    @Override // com.daaw.InterfaceC3788cj
    public void M(Object obj) {
        q(this.D);
    }

    public final void N(Object obj, int i, NQ nq) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC10256zo0)) {
                Object obj3 = obj;
                NQ nq2 = nq;
                if (obj2 instanceof C5751jj) {
                    C5751jj c5751jj = (C5751jj) obj2;
                    if (c5751jj.c()) {
                        if (nq2 != null) {
                            k(nq2, c5751jj.a);
                            return;
                        }
                        return;
                    }
                }
                i(obj3);
                throw new D80();
            }
            Object obj4 = obj;
            int i2 = i;
            NQ nq3 = nq;
            if (AbstractC5549j0.a(H, this, obj2, P((InterfaceC10256zo0) obj2, obj4, i2, nq3, null))) {
                p();
                q(i2);
                return;
            } else {
                obj = obj4;
                i = i2;
                nq = nq3;
            }
        }
    }

    public final Object P(InterfaceC10256zo0 interfaceC10256zo0, Object obj, int i, NQ nq, Object obj2) {
        if (obj instanceof C2041Qn) {
            return obj;
        }
        if ((AbstractC7293pC.b(i) || obj2 != null) && !(nq == null && !(interfaceC10256zo0 instanceof AbstractC2751Xi) && obj2 == null)) {
            return new C1811On(obj, interfaceC10256zo0 instanceof AbstractC2751Xi ? (AbstractC2751Xi) interfaceC10256zo0 : null, nq, obj2, null, 16, null);
        }
        return obj;
    }

    public final boolean Q() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = G;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!G.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    public final YZ0 R(Object obj, Object obj2, NQ nq) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC10256zo0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C1811On) && obj4 != null && ((C1811On) obj3).d == obj4) {
                    return AbstractC4345ej.a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            NQ nq2 = nq;
            if (AbstractC5549j0.a(H, this, obj3, P((InterfaceC10256zo0) obj3, obj5, this.D, nq2, obj6))) {
                p();
                return AbstractC4345ej.a;
            }
            obj = obj5;
            nq = nq2;
            obj2 = obj6;
        }
    }

    public final boolean S() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = G;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!G.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    @Override // com.daaw.AbstractC7014oC
    public void a(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC10256zo0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C2041Qn) {
                return;
            }
            if (obj2 instanceof C1811On) {
                C1811On c1811On = (C1811On) obj2;
                if (c1811On.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (AbstractC5549j0.a(H, this, obj2, C1811On.b(c1811On, null, null, null, null, th3, 15, null))) {
                    c1811On.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (AbstractC5549j0.a(H, this, obj2, new C1811On(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // com.daaw.InterfaceC4332eg1
    public void b(GO0 go0, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = G;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        A(go0);
    }

    @Override // com.daaw.AbstractC7014oC
    public final InterfaceC1416Ks c() {
        return this.E;
    }

    @Override // com.daaw.AbstractC7014oC
    public Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // com.daaw.AbstractC7014oC
    public Object e(Object obj) {
        return obj instanceof C1811On ? ((C1811On) obj).a : obj;
    }

    @Override // com.daaw.AbstractC7014oC
    public Object g() {
        return v();
    }

    @Override // com.daaw.InterfaceC1416Ks
    public InterfaceC4684ft getContext() {
        return this.F;
    }

    @Override // com.daaw.InterfaceC8320st
    public InterfaceC8320st h() {
        InterfaceC1416Ks interfaceC1416Ks = this.E;
        if (interfaceC1416Ks instanceof InterfaceC8320st) {
            return (InterfaceC8320st) interfaceC1416Ks;
        }
        return null;
    }

    public final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void j(AbstractC2751Xi abstractC2751Xi, Throwable th) {
        try {
            abstractC2751Xi.a(th);
        } catch (Throwable th2) {
            AbstractC6926nt.a(getContext(), new C2355Tn("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(NQ nq, Throwable th) {
        try {
            nq.invoke(th);
        } catch (Throwable th2) {
            AbstractC6926nt.a(getContext(), new C2355Tn("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(GO0 go0, Throwable th) {
        int i = G.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            go0.o(i, th, getContext());
        } catch (Throwable th2) {
            AbstractC6926nt.a(getContext(), new C2355Tn("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean m(Throwable th) {
        if (!B()) {
            return false;
        }
        InterfaceC1416Ks interfaceC1416Ks = this.E;
        G10.e(interfaceC1416Ks, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C6177lC) interfaceC1416Ks).n(th);
    }

    public final void n() {
        InterfaceC9531xC interfaceC9531xCT = t();
        if (interfaceC9531xCT == null) {
            return;
        }
        interfaceC9531xCT.a();
        I.set(this, C8575to0.B);
    }

    @Override // com.daaw.InterfaceC3788cj
    public boolean o() {
        return !(v() instanceof InterfaceC10256zo0);
    }

    public final void p() {
        if (B()) {
            return;
        }
        n();
    }

    public final void q(int i) {
        if (Q()) {
            return;
        }
        AbstractC7293pC.a(this, i);
    }

    @Override // com.daaw.InterfaceC3788cj
    public void r(NQ nq) {
        A(D(nq));
    }

    public Throwable s(U30 u30) {
        return u30.R();
    }

    public final InterfaceC9531xC t() {
        return (InterfaceC9531xC) I.get(this);
    }

    public String toString() {
        return F() + '(' + AbstractC8054rw.c(this.E) + "){" + w() + "}@" + AbstractC8054rw.b(this);
    }

    public final Object u() {
        U30 u30;
        boolean zB = B();
        if (S()) {
            if (t() == null) {
                z();
            }
            if (zB) {
                I();
            }
            return I10.c();
        }
        if (zB) {
            I();
        }
        Object objV = v();
        if (objV instanceof C2041Qn) {
            throw ((C2041Qn) objV).a;
        }
        if (!AbstractC7293pC.b(this.D) || (u30 = (U30) getContext().a(U30.k)) == null || u30.d()) {
            return e(objV);
        }
        CancellationException cancellationExceptionR = u30.R();
        a(objV, cancellationExceptionR);
        throw cancellationExceptionR;
    }

    public final Object v() {
        return H.get(this);
    }

    public final String w() {
        Object objV = v();
        return objV instanceof InterfaceC10256zo0 ? "Active" : objV instanceof C5751jj ? "Cancelled" : "Completed";
    }

    @Override // com.daaw.InterfaceC1416Ks
    public void x(Object obj) {
        O(this, AbstractC2459Un.b(obj, this), this.D, null, 4, null);
    }

    public void y() {
        InterfaceC9531xC interfaceC9531xCZ = z();
        if (interfaceC9531xCZ != null && o()) {
            interfaceC9531xCZ.a();
            I.set(this, C8575to0.B);
        }
    }

    public final InterfaceC9531xC z() {
        U30 u30 = (U30) getContext().a(U30.k);
        if (u30 == null) {
            return null;
        }
        InterfaceC9531xC interfaceC9531xCD = U30.a.d(u30, true, false, new C1072Hk(this), 2, null);
        AbstractC5549j0.a(I, this, null, interfaceC9531xCD);
        return interfaceC9531xCD;
    }
}
