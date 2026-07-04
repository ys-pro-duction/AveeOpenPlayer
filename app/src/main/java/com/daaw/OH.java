package com.daaw;

import com.daaw.InterfaceC10301zy;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OH extends PH implements InterfaceC10301zy {
    public static final AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(OH.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(OH.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater I = AtomicIntegerFieldUpdater.newUpdater(OH.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public final class a extends c {
        public final InterfaceC3788cj D;

        public a(long j, InterfaceC3788cj interfaceC3788cj) {
            super(j);
            this.D = interfaceC3788cj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.D.C(OH.this, G91.a);
        }

        @Override // com.daaw.OH.c
        public String toString() {
            return super.toString() + this.D;
        }
    }

    public static final class b extends c {
        public final Runnable D;

        public b(long j, Runnable runnable) {
            super(j);
            this.D = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.D.run();
        }

        @Override // com.daaw.OH.c
        public String toString() {
            return super.toString() + this.D;
        }
    }

    public static abstract class c implements Runnable, Comparable, InterfaceC9531xC, InterfaceC7531q31 {
        public long B;
        public int C = -1;
        private volatile Object _heap;

        public c(long j) {
            this.B = j;
        }

        @Override // com.daaw.InterfaceC9531xC
        public final void a() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == RH.a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.g(this);
                    }
                    this._heap = RH.a;
                    G91 g91 = G91.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.InterfaceC7531q31
        public C7252p31 g() {
            Object obj = this._heap;
            if (obj instanceof C7252p31) {
                return (C7252p31) obj;
            }
            return null;
        }

        @Override // com.daaw.InterfaceC7531q31
        public int getIndex() {
            return this.C;
        }

        @Override // com.daaw.InterfaceC7531q31
        public void h(C7252p31 c7252p31) {
            if (this._heap == RH.a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = c7252p31;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j = this.B - cVar.B;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final int l(long j, d dVar, OH oh) {
            synchronized (this) {
                if (this._heap == RH.a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (oh.o()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.c = j;
                        } else {
                            long j2 = cVar.B;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - dVar.c > 0) {
                                dVar.c = j;
                            }
                        }
                        long j3 = this.B;
                        long j4 = dVar.c;
                        if (j3 - j4 < 0) {
                            this.B = j4;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean m(long j) {
            return j - this.B >= 0;
        }

        @Override // com.daaw.InterfaceC7531q31
        public void setIndex(int i) {
            this.C = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.B + ']';
        }
    }

    public static final class d extends C7252p31 {
        public long c;

        public d(long j) {
            this.c = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        return I.get(this) != 0;
    }

    public final void A1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (AbstractC5549j0.a(G, this, null, RH.b)) {
                    return;
                }
            } else if (obj instanceof C0308Ad0) {
                ((C0308Ad0) obj).d();
                return;
            } else {
                if (obj == RH.b) {
                    return;
                }
                C0308Ad0 c0308Ad0 = new C0308Ad0(8, true);
                G10.e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c0308Ad0.a((Runnable) obj);
                if (AbstractC5549j0.a(G, this, obj, c0308Ad0)) {
                    return;
                }
            }
        }
    }

    public final Runnable B1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C0308Ad0) {
                G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C0308Ad0 c0308Ad0 = (C0308Ad0) obj;
                Object objJ = c0308Ad0.j();
                if (objJ != C0308Ad0.h) {
                    return (Runnable) objJ;
                }
                AbstractC5549j0.a(G, this, obj, c0308Ad0.i());
            } else {
                if (obj == RH.b) {
                    return null;
                }
                if (AbstractC5549j0.a(G, this, obj, null)) {
                    G10.e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void C1(Runnable runnable) {
        if (D1(runnable)) {
            y1();
        } else {
            RunnableC4980gx.J.C1(runnable);
        }
    }

    public final boolean D1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (o()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC5549j0.a(G, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C0308Ad0) {
                G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C0308Ad0 c0308Ad0 = (C0308Ad0) obj;
                int iA = c0308Ad0.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    AbstractC5549j0.a(G, this, obj, c0308Ad0.i());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == RH.b) {
                    return false;
                }
                C0308Ad0 c0308Ad02 = new C0308Ad0(8, true);
                G10.e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c0308Ad02.a((Runnable) obj);
                c0308Ad02.a(runnable);
                if (AbstractC5549j0.a(G, this, obj, c0308Ad02)) {
                    return true;
                }
            }
        }
    }

    public boolean E1() {
        if (!s1()) {
            return false;
        }
        d dVar = (d) H.get(this);
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = G.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof C0308Ad0 ? ((C0308Ad0) obj).g() : obj == RH.b;
    }

    public final void F1() {
        c cVar;
        G0.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) H.get(this);
            if (dVar == null || (cVar = (c) dVar.i()) == null) {
                return;
            } else {
                x1(jNanoTime, cVar);
            }
        }
    }

    public final void G1() {
        G.set(this, null);
        H.set(this, null);
    }

    public final void H1(long j, c cVar) {
        int iI1 = I1(j, cVar);
        if (iI1 == 0) {
            if (L1(cVar)) {
                y1();
            }
        } else if (iI1 == 1) {
            x1(j, cVar);
        } else if (iI1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public final int I1(long j, c cVar) {
        if (o()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            AbstractC5549j0.a(atomicReferenceFieldUpdater, this, null, new d(j));
            Object obj = atomicReferenceFieldUpdater.get(this);
            G10.d(obj);
            dVar = (d) obj;
        }
        return cVar.l(j, dVar, this);
    }

    public final InterfaceC9531xC J1(long j, Runnable runnable) {
        long jC = RH.c(j);
        if (jC >= 4611686018427387903L) {
            return C8575to0.B;
        }
        G0.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        H1(jNanoTime, bVar);
        return bVar;
    }

    public final void K1(boolean z) {
        I.set(this, z ? 1 : 0);
    }

    public final boolean L1(c cVar) {
        d dVar = (d) H.get(this);
        return (dVar != null ? (c) dVar.e() : null) == cVar;
    }

    @Override // com.daaw.InterfaceC10301zy
    public void N(long j, InterfaceC3788cj interfaceC3788cj) {
        long jC = RH.c(j);
        if (jC < 4611686018427387903L) {
            G0.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, interfaceC3788cj);
            H1(jNanoTime, aVar);
            AbstractC4634fj.a(interfaceC3788cj, aVar);
        }
    }

    @Override // com.daaw.InterfaceC10301zy
    public InterfaceC9531xC Y0(long j, Runnable runnable, InterfaceC4684ft interfaceC4684ft) {
        return InterfaceC10301zy.a.a(this, j, runnable, interfaceC4684ft);
    }

    @Override // com.daaw.AbstractC5801jt
    public final void g1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        C1(runnable);
    }

    @Override // com.daaw.NH
    public long o1() {
        c cVar;
        if (super.o1() == 0) {
            return 0L;
        }
        Object obj = G.get(this);
        if (obj != null) {
            if (!(obj instanceof C0308Ad0)) {
                return obj == RH.b ? Long.MAX_VALUE : 0L;
            }
            if (!((C0308Ad0) obj).g()) {
                return 0L;
            }
        }
        d dVar = (d) H.get(this);
        if (dVar == null || (cVar = (c) dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = cVar.B;
        G0.a();
        return AbstractC8417tE0.e(j - System.nanoTime(), 0L);
    }

    @Override // com.daaw.NH
    public void shutdown() {
        C5848k31.a.c();
        K1(true);
        A1();
        while (t1() <= 0) {
        }
        F1();
    }

    @Override // com.daaw.NH
    public long t1() {
        InterfaceC7531q31 interfaceC7531q31H;
        if (u1()) {
            return 0L;
        }
        d dVar = (d) H.get(this);
        if (dVar != null && !dVar.d()) {
            G0.a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        InterfaceC7531q31 interfaceC7531q31B = dVar.b();
                        if (interfaceC7531q31B != null) {
                            c cVar = (c) interfaceC7531q31B;
                            interfaceC7531q31H = cVar.m(jNanoTime) ? D1(cVar) : false ? dVar.h(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((c) interfaceC7531q31H) != null);
        }
        Runnable runnableB1 = B1();
        if (runnableB1 == null) {
            return o1();
        }
        runnableB1.run();
        return 0L;
    }
}
