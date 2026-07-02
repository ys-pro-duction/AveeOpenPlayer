package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public class EP0 {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(EP0.class, Object.class, "head");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(EP0.class, "deqIdx");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(EP0.class, Object.class, "tail");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(EP0.class, "enqIdx");
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(EP0.class, "_availablePermits");
    private volatile int _availablePermits;
    public final int a;
    public final NQ b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public /* synthetic */ class a extends AbstractC9591xR implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2, FP0.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return o(((Number) obj).longValue(), (GP0) obj2);
        }

        public final GP0 o(long j, GP0 gp0) {
            return FP0.h(j, gp0);
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public b() {
            super(1);
        }

        public final void a(Throwable th) {
            EP0.this.i();
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return G91.a;
        }
    }

    public /* synthetic */ class c extends AbstractC9591xR implements InterfaceC3429bR {
        public static final c B = new c();

        public c() {
            super(2, FP0.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return o(((Number) obj).longValue(), (GP0) obj2);
        }

        public final GP0 o(long j, GP0 gp0) {
            return FP0.h(j, gp0);
        }
    }

    public EP0(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        GP0 gp0 = new GP0(0L, null, 2);
        this.head = gp0;
        this.tail = gp0;
        this._availablePermits = i - i2;
        this.b = new b();
    }

    public final void d(InterfaceC3788cj interfaceC3788cj) {
        while (g() <= 0) {
            G10.e(interfaceC3788cj, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((InterfaceC4332eg1) interfaceC3788cj)) {
                return;
            }
        }
        interfaceC3788cj.K(G91.a, this.b);
    }

    public final boolean e(InterfaceC4332eg1 interfaceC4332eg1) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        GP0 gp0 = (GP0) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        a aVar = a.B;
        long j = andIncrement / ((long) FP0.f);
        loop0: while (true) {
            objC = AbstractC3823cq.c(gp0, j, aVar);
            if (!PO0.c(objC)) {
                GO0 go0B = PO0.b(objC);
                while (true) {
                    GO0 go0 = (GO0) atomicReferenceFieldUpdater.get(this);
                    if (go0.D >= go0B.D) {
                        break loop0;
                    }
                    if (!go0B.q()) {
                        break;
                    }
                    if (AbstractC5549j0.a(atomicReferenceFieldUpdater, this, go0, go0B)) {
                        if (go0.m()) {
                            go0.k();
                        }
                    } else if (go0B.m()) {
                        go0B.k();
                    }
                }
            } else {
                break;
            }
        }
        GP0 gp02 = (GP0) PO0.b(objC);
        int i = (int) (andIncrement % ((long) FP0.f));
        if (AbstractC7439pk.a(gp02.r(), i, null, interfaceC4332eg1)) {
            interfaceC4332eg1.b(gp02, i);
            return true;
        }
        if (!AbstractC7439pk.a(gp02.r(), i, FP0.b, FP0.c)) {
            return false;
        }
        if (interfaceC4332eg1 instanceof InterfaceC3788cj) {
            G10.e(interfaceC4332eg1, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC3788cj) interfaceC4332eg1).K(G91.a, this.b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + interfaceC4332eg1).toString());
    }

    public final void f() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        do {
            atomicIntegerFieldUpdater = g;
            i = atomicIntegerFieldUpdater.get(this);
            i2 = this.a;
            if (i <= i2) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
    }

    public final int g() {
        int andDecrement;
        do {
            andDecrement = g.getAndDecrement(this);
        } while (andDecrement > this.a);
        return andDecrement;
    }

    public int h() {
        return Math.max(g.get(this), 0);
    }

    public void i() {
        do {
            int andIncrement = g.getAndIncrement(this);
            if (andIncrement >= this.a) {
                f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!l());
    }

    public boolean j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i > this.a) {
                f();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean k(Object obj) {
        if (!(obj instanceof InterfaceC3788cj)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC3788cj interfaceC3788cj = (InterfaceC3788cj) obj;
        Object objG = interfaceC3788cj.G(G91.a, null, this.b);
        if (objG == null) {
            return false;
        }
        interfaceC3788cj.M(objG);
        return true;
    }

    public final boolean l() {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        GP0 gp0 = (GP0) atomicReferenceFieldUpdater.get(this);
        long andIncrement = d.getAndIncrement(this);
        long j = andIncrement / ((long) FP0.f);
        c cVar = c.B;
        loop0: while (true) {
            objC = AbstractC3823cq.c(gp0, j, cVar);
            if (PO0.c(objC)) {
                break;
            }
            GO0 go0B = PO0.b(objC);
            while (true) {
                GO0 go0 = (GO0) atomicReferenceFieldUpdater.get(this);
                if (go0.D >= go0B.D) {
                    break loop0;
                }
                if (!go0B.q()) {
                    break;
                }
                if (AbstractC5549j0.a(atomicReferenceFieldUpdater, this, go0, go0B)) {
                    if (go0.m()) {
                        go0.k();
                    }
                } else if (go0B.m()) {
                    go0B.k();
                }
            }
        }
        GP0 gp02 = (GP0) PO0.b(objC);
        gp02.b();
        if (gp02.D > j) {
            return false;
        }
        int i = (int) (andIncrement % ((long) FP0.f));
        Object andSet = gp02.r().getAndSet(i, FP0.b);
        if (andSet != null) {
            if (andSet == FP0.e) {
                return false;
            }
            return k(andSet);
        }
        int i2 = FP0.a;
        for (int i3 = 0; i3 < i2; i3++) {
            if (gp02.r().get(i) == FP0.c) {
                return true;
            }
        }
        return !AbstractC7439pk.a(gp02.r(), i, FP0.b, FP0.d);
    }
}
