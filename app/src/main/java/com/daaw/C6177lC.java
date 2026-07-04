package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.lC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6177lC extends AbstractC7014oC implements InterfaceC8320st, InterfaceC1416Ks {
    public static final AtomicReferenceFieldUpdater I = AtomicReferenceFieldUpdater.newUpdater(C6177lC.class, Object.class, "_reusableCancellableContinuation");
    public final AbstractC5801jt E;
    public final InterfaceC1416Ks F;
    public Object G;
    public final Object H;
    private volatile Object _reusableCancellableContinuation;

    public C6177lC(AbstractC5801jt abstractC5801jt, InterfaceC1416Ks interfaceC1416Ks) {
        super(-1);
        this.E = abstractC5801jt;
        this.F = interfaceC1416Ks;
        this.G = AbstractC6456mC.a;
        this.H = AbstractC5010h31.b(getContext());
    }

    @Override // com.daaw.AbstractC7014oC
    public void a(Object obj, Throwable th) {
        if (obj instanceof C2145Rn) {
            ((C2145Rn) obj).b.invoke(th);
        }
    }

    @Override // com.daaw.AbstractC7014oC
    public Object g() {
        Object obj = this.G;
        this.G = AbstractC6456mC.a;
        return obj;
    }

    @Override // com.daaw.InterfaceC1416Ks
    public InterfaceC4684ft getContext() {
        return this.F.getContext();
    }

    @Override // com.daaw.InterfaceC8320st
    public InterfaceC8320st h() {
        InterfaceC1416Ks interfaceC1416Ks = this.F;
        if (interfaceC1416Ks instanceof InterfaceC8320st) {
            return (InterfaceC8320st) interfaceC1416Ks;
        }
        return null;
    }

    public final void i() {
        while (I.get(this) == AbstractC6456mC.b) {
        }
    }

    public final C4067dj j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                I.set(this, AbstractC6456mC.b);
                return null;
            }
            if (obj instanceof C4067dj) {
                if (AbstractC5549j0.a(I, this, obj, AbstractC6456mC.b)) {
                    return (C4067dj) obj;
                }
            } else if (obj != AbstractC6456mC.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void k(InterfaceC4684ft interfaceC4684ft, Object obj) {
        this.G = obj;
        this.D = 1;
        this.E.h1(interfaceC4684ft, this);
    }

    public final C4067dj l() {
        Object obj = I.get(this);
        if (obj instanceof C4067dj) {
            return (C4067dj) obj;
        }
        return null;
    }

    public final boolean m() {
        return I.get(this) != null;
    }

    public final boolean n(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            YZ0 yz0 = AbstractC6456mC.b;
            if (G10.c(obj, yz0)) {
                if (AbstractC5549j0.a(I, this, yz0, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC5549j0.a(I, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void p() {
        i();
        C4067dj c4067djL = l();
        if (c4067djL != null) {
            c4067djL.n();
        }
    }

    public final Throwable q(InterfaceC3788cj interfaceC3788cj) {
        YZ0 yz0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            yz0 = AbstractC6456mC.b;
            if (obj != yz0) {
                if (obj instanceof Throwable) {
                    if (AbstractC5549j0.a(I, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC5549j0.a(I, this, yz0, interfaceC3788cj));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.E + ", " + AbstractC8054rw.c(this.F) + ']';
    }

    @Override // com.daaw.InterfaceC1416Ks
    public void x(Object obj) {
        InterfaceC4684ft context = this.F.getContext();
        Object objD = AbstractC2459Un.d(obj, null, 1, null);
        if (this.E.i1(context)) {
            this.G = objD;
            this.D = 0;
            this.E.g1(context, this);
            return;
        }
        NH nhB = C5848k31.a.b();
        if (nhB.r1()) {
            this.G = objD;
            this.D = 0;
            nhB.n1(this);
            return;
        }
        nhB.p1(true);
        try {
            InterfaceC4684ft context2 = getContext();
            Object objC = AbstractC5010h31.c(context2, this.H);
            try {
                this.F.x(obj);
                G91 g91 = G91.a;
                while (nhB.u1()) {
                }
            } finally {
                AbstractC5010h31.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // com.daaw.AbstractC7014oC
    public InterfaceC1416Ks c() {
        return this;
    }
}
