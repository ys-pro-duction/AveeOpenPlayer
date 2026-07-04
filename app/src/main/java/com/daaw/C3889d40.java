package com.daaw;

import com.daaw.C9922yd0;
import com.daaw.InterfaceC4684ft;
import com.daaw.U30;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.d40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3889d40 implements U30, InterfaceC1384Kk, InterfaceC2376Ts0 {
    public static final AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(C3889d40.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(C3889d40.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: com.daaw.d40$a */
    public static final class a extends C4067dj {
        public final C3889d40 J;

        public a(InterfaceC1416Ks interfaceC1416Ks, C3889d40 c3889d40) {
            super(interfaceC1416Ks, 1);
            this.J = c3889d40;
        }

        @Override // com.daaw.C4067dj
        public String F() {
            return "AwaitContinuation";
        }

        @Override // com.daaw.C4067dj
        public Throwable s(U30 u30) {
            Throwable thE;
            Object objA0 = this.J.a0();
            return (!(objA0 instanceof c) || (thE = ((c) objA0).e()) == null) ? objA0 instanceof C2041Qn ? ((C2041Qn) objA0).a : u30.R() : thE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.d40$b */
    public static final class b extends AbstractC3610c40 {
        public final C3889d40 F;
        public final c G;
        public final C1280Jk H;
        public final Object I;

        public b(C3889d40 c3889d40, c cVar, C1280Jk c1280Jk, Object obj) {
            this.F = c3889d40;
            this.G = cVar;
            this.H = c1280Jk;
            this.I = obj;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            w((Throwable) obj);
            return G91.a;
        }

        @Override // com.daaw.AbstractC2251Sn
        public void w(Throwable th) {
            this.F.H(this.G, this.H, this.I);
        }
    }

    /* JADX INFO: renamed from: com.daaw.d40$c */
    public static final class c implements InterfaceC5143hZ {
        public static final AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
        public static final AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
        public static final AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        public final C7460po0 B;
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        public c(C7460po0 c7460po0, boolean z, Throwable th) {
            this.B = c7460po0;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable thE = e();
            if (thE == null) {
                m(th);
                return;
            }
            if (th == thE) {
                return;
            }
            Object objC = c();
            if (objC == null) {
                l(th);
                return;
            }
            if (objC instanceof Throwable) {
                if (th == objC) {
                    return;
                }
                ArrayList arrayListB = b();
                arrayListB.add(objC);
                arrayListB.add(th);
                l(arrayListB);
                return;
            }
            if (objC instanceof ArrayList) {
                ((ArrayList) objC).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objC).toString());
        }

        public final ArrayList b() {
            return new ArrayList(4);
        }

        public final Object c() {
            return E.get(this);
        }

        @Override // com.daaw.InterfaceC5143hZ
        public boolean d() {
            return e() == null;
        }

        public final Throwable e() {
            return (Throwable) D.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        public final boolean g() {
            return C.get(this) != 0;
        }

        @Override // com.daaw.InterfaceC5143hZ
        public C7460po0 h() {
            return this.B;
        }

        public final boolean i() {
            return c() == AbstractC4167e40.e;
        }

        public final List j(Throwable th) {
            ArrayList arrayListB;
            Object objC = c();
            if (objC == null) {
                arrayListB = b();
            } else if (objC instanceof Throwable) {
                ArrayList arrayListB2 = b();
                arrayListB2.add(objC);
                arrayListB = arrayListB2;
            } else {
                if (!(objC instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objC).toString());
                }
                arrayListB = (ArrayList) objC;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListB.add(0, thE);
            }
            if (th != null && !G10.c(th, thE)) {
                arrayListB.add(th);
            }
            l(AbstractC4167e40.e);
            return arrayListB;
        }

        public final void k(boolean z) {
            C.set(this, z ? 1 : 0);
        }

        public final void l(Object obj) {
            E.set(this, obj);
        }

        public final void m(Throwable th) {
            D.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + c() + ", list=" + h() + ']';
        }
    }

    /* JADX INFO: renamed from: com.daaw.d40$d */
    public static final class d extends C9922yd0.a {
        public final /* synthetic */ C3889d40 d;
        public final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9922yd0 c9922yd0, C3889d40 c3889d40, Object obj) {
            super(c9922yd0);
            this.d = c3889d40;
            this.e = obj;
        }

        @Override // com.daaw.AbstractC1763Ob
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(C9922yd0 c9922yd0) {
            if (this.d.a0() == this.e) {
                return null;
            }
            return AbstractC9643xd0.a();
        }
    }

    /* JADX INFO: renamed from: com.daaw.d40$e */
    public static final class e extends AbstractC4233eJ0 implements InterfaceC3429bR {
        public Object D;
        public Object E;
        public int F;
        public /* synthetic */ Object G;

        public e(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            e eVar = C3889d40.this.new e(interfaceC1416Ks);
            eVar.G = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        
            if (r6.b(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        
            if (r4.b(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r5.F
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.E
                com.daaw.yd0 r1 = (com.daaw.C9922yd0) r1
                java.lang.Object r3 = r5.D
                com.daaw.wd0 r3 = (com.daaw.AbstractC9364wd0) r3
                java.lang.Object r4 = r5.G
                com.daaw.NP0 r4 = (com.daaw.NP0) r4
                com.daaw.AbstractC4801gJ0.b(r6)
                goto L81
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                com.daaw.AbstractC4801gJ0.b(r6)
                goto L86
            L2a:
                com.daaw.AbstractC4801gJ0.b(r6)
                java.lang.Object r6 = r5.G
                com.daaw.NP0 r6 = (com.daaw.NP0) r6
                com.daaw.d40 r1 = com.daaw.C3889d40.this
                java.lang.Object r1 = r1.a0()
                boolean r4 = r1 instanceof com.daaw.C1280Jk
                if (r4 == 0) goto L48
                com.daaw.Jk r1 = (com.daaw.C1280Jk) r1
                com.daaw.Kk r1 = r1.F
                r5.F = r3
                java.lang.Object r6 = r6.b(r1, r5)
                if (r6 != r0) goto L86
                goto L80
            L48:
                boolean r3 = r1 instanceof com.daaw.InterfaceC5143hZ
                if (r3 == 0) goto L86
                com.daaw.hZ r1 = (com.daaw.InterfaceC5143hZ) r1
                com.daaw.po0 r1 = r1.h()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.o()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                com.daaw.G10.e(r3, r4)
                com.daaw.yd0 r3 = (com.daaw.C9922yd0) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L63:
                boolean r6 = com.daaw.G10.c(r1, r3)
                if (r6 != 0) goto L86
                boolean r6 = r1 instanceof com.daaw.C1280Jk
                if (r6 == 0) goto L81
                r6 = r1
                com.daaw.Jk r6 = (com.daaw.C1280Jk) r6
                com.daaw.Kk r6 = r6.F
                r5.G = r4
                r5.D = r3
                r5.E = r1
                r5.F = r2
                java.lang.Object r6 = r4.b(r6, r5)
                if (r6 != r0) goto L81
            L80:
                return r0
            L81:
                com.daaw.yd0 r1 = r1.p()
                goto L63
            L86:
                com.daaw.G91 r6 = com.daaw.G91.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3889d40.e.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NP0 np0, InterfaceC1416Ks interfaceC1416Ks) {
            return ((e) a(np0, interfaceC1416Ks)).q(G91.a);
        }
    }

    public C3889d40(boolean z) {
        this._state = z ? AbstractC4167e40.g : AbstractC4167e40.f;
    }

    public static /* synthetic */ CancellationException I0(C3889d40 c3889d40, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return c3889d40.H0(th, str);
    }

    public final boolean A(Throwable th) {
        if (f0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC1176Ik interfaceC1176IkZ = Z();
        return (interfaceC1176IkZ == null || interfaceC1176IkZ == C8575to0.B) ? z : interfaceC1176IkZ.c(th) || z;
    }

    public final void A0(AbstractC3610c40 abstractC3610c40) {
        abstractC3610c40.k(new C7460po0());
        AbstractC5549j0.a(B, this, abstractC3610c40, abstractC3610c40.p());
    }

    public String B() {
        return "Job was cancelled";
    }

    public final void C0(AbstractC3610c40 abstractC3610c40) {
        Object objA0;
        do {
            objA0 = a0();
            if (!(objA0 instanceof AbstractC3610c40)) {
                if (!(objA0 instanceof InterfaceC5143hZ) || ((InterfaceC5143hZ) objA0).h() == null) {
                    return;
                }
                abstractC3610c40.s();
                return;
            }
            if (objA0 != abstractC3610c40) {
                return;
            }
        } while (!AbstractC5549j0.a(B, this, objA0, AbstractC4167e40.g));
    }

    public boolean D(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return w(th) && T();
    }

    public final void D0(InterfaceC1176Ik interfaceC1176Ik) {
        C.set(this, interfaceC1176Ik);
    }

    public final void E(InterfaceC5143hZ interfaceC5143hZ, Object obj) throws Throwable {
        InterfaceC1176Ik interfaceC1176IkZ = Z();
        if (interfaceC1176IkZ != null) {
            interfaceC1176IkZ.a();
            D0(C8575to0.B);
        }
        C2041Qn c2041Qn = obj instanceof C2041Qn ? (C2041Qn) obj : null;
        Throwable th = c2041Qn != null ? c2041Qn.a : null;
        if (!(interfaceC5143hZ instanceof AbstractC3610c40)) {
            C7460po0 c7460po0H = interfaceC5143hZ.h();
            if (c7460po0H != null) {
                t0(c7460po0H, th);
                return;
            }
            return;
        }
        try {
            ((AbstractC3610c40) interfaceC5143hZ).w(th);
        } catch (Throwable th2) {
            c0(new C2355Tn("Exception in completion handler " + interfaceC5143hZ + " for " + this, th2));
        }
    }

    @Override // com.daaw.U30
    public final InterfaceC9531xC E0(NQ nq) {
        return Y(false, true, nq);
    }

    @Override // com.daaw.U30
    public final KP0 F() {
        return QP0.b(new e(null));
    }

    public final int F0(Object obj) {
        if (obj instanceof C4220eG) {
            if (((C4220eG) obj).d()) {
                return 0;
            }
            if (!AbstractC5549j0.a(B, this, obj, AbstractC4167e40.g)) {
                return -1;
            }
            y0();
            return 1;
        }
        if (!(obj instanceof C4296eZ)) {
            return 0;
        }
        if (!AbstractC5549j0.a(B, this, obj, ((C4296eZ) obj).h())) {
            return -1;
        }
        y0();
        return 1;
    }

    public final String G0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC5143hZ ? ((InterfaceC5143hZ) obj).d() ? "Active" : "New" : obj instanceof C2041Qn ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    public final void H(c cVar, C1280Jk c1280Jk, Object obj) {
        C1280Jk c1280JkN0 = n0(c1280Jk);
        if (c1280JkN0 == null || !P0(cVar, c1280JkN0, obj)) {
            q(N(cVar, obj));
        }
    }

    public final CancellationException H0(Throwable th, String str) {
        CancellationException v30 = th instanceof CancellationException ? (CancellationException) th : null;
        if (v30 == null) {
            if (str == null) {
                str = B();
            }
            v30 = new V30(str, th, this);
        }
        return v30;
    }

    public final Throwable J(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new V30(B(), null, this) : th;
        }
        G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC2376Ts0) obj).K0();
    }

    public final String J0() {
        return m0() + '{' + G0(a0()) + '}';
    }

    @Override // com.daaw.InterfaceC2376Ts0
    public CancellationException K0() {
        Throwable thE;
        Object objA0 = a0();
        if (objA0 instanceof c) {
            thE = ((c) objA0).e();
        } else if (objA0 instanceof C2041Qn) {
            thE = ((C2041Qn) objA0).a;
        } else {
            if (objA0 instanceof InterfaceC5143hZ) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objA0).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new V30("Parent job is " + G0(objA0), thE, this);
    }

    public final boolean L0(InterfaceC5143hZ interfaceC5143hZ, Object obj) throws Throwable {
        if (!AbstractC5549j0.a(B, this, interfaceC5143hZ, AbstractC4167e40.g(obj))) {
            return false;
        }
        u0(null);
        v0(obj);
        E(interfaceC5143hZ, obj);
        return true;
    }

    public final boolean M0(InterfaceC5143hZ interfaceC5143hZ, Throwable th) throws Throwable {
        C7460po0 c7460po0X = X(interfaceC5143hZ);
        if (c7460po0X == null) {
            return false;
        }
        if (!AbstractC5549j0.a(B, this, interfaceC5143hZ, new c(c7460po0X, false, th))) {
            return false;
        }
        r0(c7460po0X, th);
        return true;
    }

    public final Object N(c cVar, Object obj) throws Throwable {
        boolean zF;
        Throwable thS;
        C2041Qn c2041Qn = obj instanceof C2041Qn ? (C2041Qn) obj : null;
        Throwable th = c2041Qn != null ? c2041Qn.a : null;
        synchronized (cVar) {
            zF = cVar.f();
            List listJ = cVar.j(th);
            thS = S(cVar, listJ);
            if (thS != null) {
                p(thS, listJ);
            }
        }
        if (thS != null && thS != th) {
            obj = new C2041Qn(thS, false, 2, null);
        }
        if (thS != null && (A(thS) || b0(thS))) {
            G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C2041Qn) obj).b();
        }
        if (!zF) {
            u0(thS);
        }
        v0(obj);
        AbstractC5549j0.a(B, this, cVar, AbstractC4167e40.g(obj));
        E(cVar, obj);
        return obj;
    }

    public final Object N0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC5143hZ) ? AbstractC4167e40.a : ((!(obj instanceof C4220eG) && !(obj instanceof AbstractC3610c40)) || (obj instanceof C1280Jk) || (obj2 instanceof C2041Qn)) ? O0((InterfaceC5143hZ) obj, obj2) : L0((InterfaceC5143hZ) obj, obj2) ? obj2 : AbstractC4167e40.c;
    }

    public final C1280Jk O(InterfaceC5143hZ interfaceC5143hZ) {
        C1280Jk c1280Jk = interfaceC5143hZ instanceof C1280Jk ? (C1280Jk) interfaceC5143hZ : null;
        if (c1280Jk != null) {
            return c1280Jk;
        }
        C7460po0 c7460po0H = interfaceC5143hZ.h();
        if (c7460po0H != null) {
            return n0(c7460po0H);
        }
        return null;
    }

    public final Object O0(InterfaceC5143hZ interfaceC5143hZ, Object obj) throws Throwable {
        C7460po0 c7460po0X = X(interfaceC5143hZ);
        if (c7460po0X == null) {
            return AbstractC4167e40.c;
        }
        c cVar = interfaceC5143hZ instanceof c ? (c) interfaceC5143hZ : null;
        if (cVar == null) {
            cVar = new c(c7460po0X, false, null);
        }
        C6748nF0 c6748nF0 = new C6748nF0();
        synchronized (cVar) {
            if (cVar.g()) {
                return AbstractC4167e40.a;
            }
            cVar.k(true);
            if (cVar != interfaceC5143hZ && !AbstractC5549j0.a(B, this, interfaceC5143hZ, cVar)) {
                return AbstractC4167e40.c;
            }
            boolean zF = cVar.f();
            C2041Qn c2041Qn = obj instanceof C2041Qn ? (C2041Qn) obj : null;
            if (c2041Qn != null) {
                cVar.a(c2041Qn.a);
            }
            Throwable thE = zF ? null : cVar.e();
            c6748nF0.B = thE;
            G91 g91 = G91.a;
            if (thE != null) {
                r0(c7460po0X, thE);
            }
            C1280Jk c1280JkO = O(interfaceC5143hZ);
            return (c1280JkO == null || !P0(cVar, c1280JkO, obj)) ? N(cVar, obj) : AbstractC4167e40.b;
        }
    }

    public final Object P() throws Throwable {
        Object objA0 = a0();
        if (objA0 instanceof InterfaceC5143hZ) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objA0 instanceof C2041Qn) {
            throw ((C2041Qn) objA0).a;
        }
        return AbstractC4167e40.h(objA0);
    }

    public final boolean P0(c cVar, C1280Jk c1280Jk, Object obj) {
        while (U30.a.d(c1280Jk.F, false, false, new b(this, cVar, c1280Jk, obj), 1, null) == C8575to0.B) {
            c1280Jk = n0(c1280Jk);
            if (c1280Jk == null) {
                return false;
            }
        }
        return true;
    }

    public final Throwable Q(Object obj) {
        C2041Qn c2041Qn = obj instanceof C2041Qn ? (C2041Qn) obj : null;
        if (c2041Qn != null) {
            return c2041Qn.a;
        }
        return null;
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft Q0(InterfaceC4684ft.c cVar) {
        return U30.a.e(this, cVar);
    }

    @Override // com.daaw.U30
    public final CancellationException R() {
        Object objA0 = a0();
        if (!(objA0 instanceof c)) {
            if (objA0 instanceof InterfaceC5143hZ) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objA0 instanceof C2041Qn) {
                return I0(this, ((C2041Qn) objA0).a, null, 1, null);
            }
            return new V30(AbstractC8054rw.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objA0).e();
        if (thE != null) {
            CancellationException cancellationExceptionH0 = H0(thE, AbstractC8054rw.a(this) + " is cancelling");
            if (cancellationExceptionH0 != null) {
                return cancellationExceptionH0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Throwable S(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new V30(B(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof N31) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof N31)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean T() {
        return true;
    }

    @Override // com.daaw.InterfaceC4684ft
    public InterfaceC4684ft U(InterfaceC4684ft interfaceC4684ft) {
        return U30.a.f(this, interfaceC4684ft);
    }

    public boolean V() {
        return false;
    }

    public final C7460po0 X(InterfaceC5143hZ interfaceC5143hZ) {
        C7460po0 c7460po0H = interfaceC5143hZ.h();
        if (c7460po0H != null) {
            return c7460po0H;
        }
        if (interfaceC5143hZ instanceof C4220eG) {
            return new C7460po0();
        }
        if (interfaceC5143hZ instanceof AbstractC3610c40) {
            A0((AbstractC3610c40) interfaceC5143hZ);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC5143hZ).toString());
    }

    @Override // com.daaw.U30
    public final InterfaceC9531xC Y(boolean z, boolean z2, NQ nq) {
        AbstractC3610c40 abstractC3610c40L0 = l0(nq, z);
        while (true) {
            Object objA0 = a0();
            if (objA0 instanceof C4220eG) {
                C4220eG c4220eG = (C4220eG) objA0;
                if (!c4220eG.d()) {
                    z0(c4220eG);
                } else if (AbstractC5549j0.a(B, this, objA0, abstractC3610c40L0)) {
                    break;
                }
            } else {
                if (!(objA0 instanceof InterfaceC5143hZ)) {
                    if (z2) {
                        C2041Qn c2041Qn = objA0 instanceof C2041Qn ? (C2041Qn) objA0 : null;
                        nq.invoke(c2041Qn != null ? c2041Qn.a : null);
                    }
                    return C8575to0.B;
                }
                C7460po0 c7460po0H = ((InterfaceC5143hZ) objA0).h();
                if (c7460po0H == null) {
                    G10.e(objA0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    A0((AbstractC3610c40) objA0);
                } else {
                    InterfaceC9531xC interfaceC9531xC = C8575to0.B;
                    if (z && (objA0 instanceof c)) {
                        synchronized (objA0) {
                            try {
                                thE = ((c) objA0).e();
                                if (thE == null || ((nq instanceof C1280Jk) && !((c) objA0).g())) {
                                    if (n(objA0, c7460po0H, abstractC3610c40L0)) {
                                        if (thE == null) {
                                            return abstractC3610c40L0;
                                        }
                                        interfaceC9531xC = abstractC3610c40L0;
                                    }
                                }
                                G91 g91 = G91.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thE != null) {
                        if (z2) {
                            nq.invoke(thE);
                        }
                        return interfaceC9531xC;
                    }
                    if (n(objA0, c7460po0H, abstractC3610c40L0)) {
                        break;
                    }
                }
            }
        }
        return abstractC3610c40L0;
    }

    public final InterfaceC1176Ik Z() {
        return (InterfaceC1176Ik) C.get(this);
    }

    @Override // com.daaw.InterfaceC4684ft.b, com.daaw.InterfaceC4684ft
    public InterfaceC4684ft.b a(InterfaceC4684ft.c cVar) {
        return U30.a.c(this, cVar);
    }

    public final Object a0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC1720Nq0)) {
                return obj;
            }
            ((AbstractC1720Nq0) obj).a(this);
        }
    }

    public boolean b0(Throwable th) {
        return false;
    }

    @Override // com.daaw.InterfaceC1384Kk
    public final void b1(InterfaceC2376Ts0 interfaceC2376Ts0) throws Throwable {
        w(interfaceC2376Ts0);
    }

    @Override // com.daaw.InterfaceC4684ft
    public Object c1(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return U30.a.b(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.U30
    public boolean d() {
        Object objA0 = a0();
        return (objA0 instanceof InterfaceC5143hZ) && ((InterfaceC5143hZ) objA0).d();
    }

    public final void d0(U30 u30) {
        if (u30 == null) {
            D0(C8575to0.B);
            return;
        }
        u30.start();
        InterfaceC1176Ik interfaceC1176IkS0 = u30.s0(this);
        D0(interfaceC1176IkS0);
        if (o()) {
            interfaceC1176IkS0.a();
            D0(C8575to0.B);
        }
    }

    public final boolean e0() {
        Object objA0 = a0();
        if (objA0 instanceof C2041Qn) {
            return true;
        }
        return (objA0 instanceof c) && ((c) objA0).f();
    }

    public boolean f0() {
        return false;
    }

    public final boolean g0() {
        Object objA0;
        do {
            objA0 = a0();
            if (!(objA0 instanceof InterfaceC5143hZ)) {
                return false;
            }
        } while (F0(objA0) < 0);
        return true;
    }

    @Override // com.daaw.InterfaceC4684ft.b
    public final InterfaceC4684ft.c getKey() {
        return U30.k;
    }

    @Override // com.daaw.U30
    public U30 getParent() {
        InterfaceC1176Ik interfaceC1176IkZ = Z();
        if (interfaceC1176IkZ != null) {
            return interfaceC1176IkZ.getParent();
        }
        return null;
    }

    public final Object h0(InterfaceC1416Ks interfaceC1416Ks) {
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        AbstractC4634fj.a(c4067dj, E0(new C5359iJ0(c4067dj)));
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU == I10.c() ? objU : G91.a;
    }

    public final Object i0(Object obj) throws Throwable {
        Throwable thJ = null;
        while (true) {
            Object objA0 = a0();
            if (objA0 instanceof c) {
                synchronized (objA0) {
                    if (((c) objA0).i()) {
                        return AbstractC4167e40.d;
                    }
                    boolean zF = ((c) objA0).f();
                    if (obj != null || !zF) {
                        if (thJ == null) {
                            thJ = J(obj);
                        }
                        ((c) objA0).a(thJ);
                    }
                    Throwable thE = zF ? null : ((c) objA0).e();
                    if (thE != null) {
                        r0(((c) objA0).h(), thE);
                    }
                    return AbstractC4167e40.a;
                }
            }
            if (!(objA0 instanceof InterfaceC5143hZ)) {
                return AbstractC4167e40.d;
            }
            if (thJ == null) {
                thJ = J(obj);
            }
            InterfaceC5143hZ interfaceC5143hZ = (InterfaceC5143hZ) objA0;
            if (!interfaceC5143hZ.d()) {
                Object objN0 = N0(objA0, new C2041Qn(thJ, false, 2, null));
                if (objN0 == AbstractC4167e40.a) {
                    throw new IllegalStateException(("Cannot happen in " + objA0).toString());
                }
                if (objN0 != AbstractC4167e40.c) {
                    return objN0;
                }
            } else if (M0(interfaceC5143hZ, thJ)) {
                return AbstractC4167e40.a;
            }
        }
    }

    @Override // com.daaw.U30, com.daaw.QE0
    public void j(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new V30(B(), null, this);
        }
        y(cancellationException);
    }

    public final boolean j0(Object obj) {
        Object objN0;
        do {
            objN0 = N0(a0(), obj);
            if (objN0 == AbstractC4167e40.a) {
                return false;
            }
            if (objN0 == AbstractC4167e40.b) {
                return true;
            }
        } while (objN0 == AbstractC4167e40.c);
        q(objN0);
        return true;
    }

    public final Object k0(Object obj) {
        Object objN0;
        do {
            objN0 = N0(a0(), obj);
            if (objN0 == AbstractC4167e40.a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, Q(obj));
            }
        } while (objN0 == AbstractC4167e40.c);
        return objN0;
    }

    public final AbstractC3610c40 l0(NQ nq, boolean z) {
        AbstractC3610c40 y10;
        if (z) {
            y10 = nq instanceof W30 ? (W30) nq : null;
            if (y10 == null) {
                y10 = new X10(nq);
            }
        } else {
            y10 = nq instanceof AbstractC3610c40 ? (AbstractC3610c40) nq : null;
            if (y10 == null) {
                y10 = new Y10(nq);
            }
        }
        y10.z(this);
        return y10;
    }

    public String m0() {
        return AbstractC8054rw.a(this);
    }

    public final boolean n(Object obj, C7460po0 c7460po0, AbstractC3610c40 abstractC3610c40) {
        int iV;
        d dVar = new d(abstractC3610c40, this, obj);
        do {
            iV = c7460po0.q().v(abstractC3610c40, c7460po0, dVar);
            if (iV == 1) {
                return true;
            }
        } while (iV != 2);
        return false;
    }

    public final C1280Jk n0(C9922yd0 c9922yd0) {
        while (c9922yd0.r()) {
            c9922yd0 = c9922yd0.q();
        }
        while (true) {
            c9922yd0 = c9922yd0.p();
            if (!c9922yd0.r()) {
                if (c9922yd0 instanceof C1280Jk) {
                    return (C1280Jk) c9922yd0;
                }
                if (c9922yd0 instanceof C7460po0) {
                    return null;
                }
            }
        }
    }

    @Override // com.daaw.U30
    public final boolean o() {
        return !(a0() instanceof InterfaceC5143hZ);
    }

    @Override // com.daaw.U30
    public final Object o0(InterfaceC1416Ks interfaceC1416Ks) {
        if (g0()) {
            Object objH0 = h0(interfaceC1416Ks);
            return objH0 == I10.c() ? objH0 : G91.a;
        }
        AbstractC3053a40.i(interfaceC1416Ks.getContext());
        return G91.a;
    }

    public final void p(Throwable th, List list) throws IllegalAccessException, InvocationTargetException {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                AbstractC7596qI.a(th, th2);
            }
        }
    }

    public final void r0(C7460po0 c7460po0, Throwable th) throws Throwable {
        u0(th);
        Object objO = c7460po0.o();
        G10.e(objO, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C2355Tn c2355Tn = null;
        for (C9922yd0 c9922yd0P = (C9922yd0) objO; !G10.c(c9922yd0P, c7460po0); c9922yd0P = c9922yd0P.p()) {
            if (c9922yd0P instanceof W30) {
                AbstractC3610c40 abstractC3610c40 = (AbstractC3610c40) c9922yd0P;
                try {
                    abstractC3610c40.w(th);
                } catch (Throwable th2) {
                    if (c2355Tn != null) {
                        AbstractC7596qI.a(c2355Tn, th2);
                    } else {
                        c2355Tn = new C2355Tn("Exception in completion handler " + abstractC3610c40 + " for " + this, th2);
                        G91 g91 = G91.a;
                    }
                }
            }
        }
        if (c2355Tn != null) {
            c0(c2355Tn);
        }
        A(th);
    }

    @Override // com.daaw.U30
    public final InterfaceC1176Ik s0(InterfaceC1384Kk interfaceC1384Kk) {
        InterfaceC9531xC interfaceC9531xCD = U30.a.d(this, true, false, new C1280Jk(interfaceC1384Kk), 2, null);
        G10.e(interfaceC9531xCD, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC1176Ik) interfaceC9531xCD;
    }

    @Override // com.daaw.U30
    public final boolean start() {
        int iF0;
        do {
            iF0 = F0(a0());
            if (iF0 == 0) {
                return false;
            }
        } while (iF0 != 1);
        return true;
    }

    public final Object t(InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        Object objA0;
        do {
            objA0 = a0();
            if (!(objA0 instanceof InterfaceC5143hZ)) {
                if (objA0 instanceof C2041Qn) {
                    throw ((C2041Qn) objA0).a;
                }
                return AbstractC4167e40.h(objA0);
            }
        } while (F0(objA0) < 0);
        return u(interfaceC1416Ks);
    }

    public final void t0(C7460po0 c7460po0, Throwable th) throws Throwable {
        Object objO = c7460po0.o();
        G10.e(objO, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C2355Tn c2355Tn = null;
        for (C9922yd0 c9922yd0P = (C9922yd0) objO; !G10.c(c9922yd0P, c7460po0); c9922yd0P = c9922yd0P.p()) {
            if (c9922yd0P instanceof AbstractC3610c40) {
                AbstractC3610c40 abstractC3610c40 = (AbstractC3610c40) c9922yd0P;
                try {
                    abstractC3610c40.w(th);
                } catch (Throwable th2) {
                    if (c2355Tn != null) {
                        AbstractC7596qI.a(c2355Tn, th2);
                    } else {
                        c2355Tn = new C2355Tn("Exception in completion handler " + abstractC3610c40 + " for " + this, th2);
                        G91 g91 = G91.a;
                    }
                }
            }
        }
        if (c2355Tn != null) {
            c0(c2355Tn);
        }
    }

    public String toString() {
        return J0() + '@' + AbstractC8054rw.b(this);
    }

    public final Object u(InterfaceC1416Ks interfaceC1416Ks) {
        a aVar = new a(H10.b(interfaceC1416Ks), this);
        aVar.y();
        AbstractC4634fj.a(aVar, E0(new C5080hJ0(aVar)));
        Object objU = aVar.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU;
    }

    public final boolean v(Throwable th) {
        return w(th);
    }

    public final boolean w(Object obj) throws Throwable {
        Object objI0 = AbstractC4167e40.a;
        if (V() && (objI0 = z(obj)) == AbstractC4167e40.b) {
            return true;
        }
        if (objI0 == AbstractC4167e40.a) {
            objI0 = i0(obj);
        }
        if (objI0 == AbstractC4167e40.a || objI0 == AbstractC4167e40.b) {
            return true;
        }
        if (objI0 == AbstractC4167e40.d) {
            return false;
        }
        q(objI0);
        return true;
    }

    public void y(Throwable th) throws Throwable {
        w(th);
    }

    public final Object z(Object obj) {
        Object objN0;
        do {
            Object objA0 = a0();
            if (!(objA0 instanceof InterfaceC5143hZ) || ((objA0 instanceof c) && ((c) objA0).g())) {
                return AbstractC4167e40.a;
            }
            objN0 = N0(objA0, new C2041Qn(J(obj), false, 2, null));
        } while (objN0 == AbstractC4167e40.c);
        return objN0;
    }

    public final void z0(C4220eG c4220eG) {
        C7460po0 c7460po0 = new C7460po0();
        Object c4296eZ = c7460po0;
        if (!c4220eG.d()) {
            c4296eZ = new C4296eZ(c7460po0);
        }
        AbstractC5549j0.a(B, this, c4220eG, c4296eZ);
    }

    public void y0() {
    }

    public void c0(Throwable th) throws Throwable {
        throw th;
    }

    public void q(Object obj) {
    }

    public void u0(Throwable th) {
    }

    public void v0(Object obj) {
    }
}
