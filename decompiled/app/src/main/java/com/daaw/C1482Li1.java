package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.Li1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1482Li1 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C1482Li1.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C1482Li1.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C1482Li1.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C1482Li1.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final AbstractRunnableC6684n11 a(AbstractRunnableC6684n11 abstractRunnableC6684n11, boolean z) {
        if (z) {
            return b(abstractRunnableC6684n11);
        }
        AbstractRunnableC6684n11 abstractRunnableC6684n112 = (AbstractRunnableC6684n11) b.getAndSet(this, abstractRunnableC6684n11);
        if (abstractRunnableC6684n112 == null) {
            return null;
        }
        return b(abstractRunnableC6684n112);
    }

    public final AbstractRunnableC6684n11 b(AbstractRunnableC6684n11 abstractRunnableC6684n11) {
        if (d() == 127) {
            return abstractRunnableC6684n11;
        }
        if (abstractRunnableC6684n11.C.b() == 1) {
            e.incrementAndGet(this);
        }
        int i = c.get(this) & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, abstractRunnableC6684n11);
        c.incrementAndGet(this);
        return null;
    }

    public final void c(AbstractRunnableC6684n11 abstractRunnableC6684n11) {
        if (abstractRunnableC6684n11 == null || abstractRunnableC6684n11.C.b() != 1) {
            return;
        }
        e.decrementAndGet(this);
    }

    public final int d() {
        return c.get(this) - d.get(this);
    }

    public final int e() {
        return b.get(this) != null ? d() + 1 : d();
    }

    public final void f(C6245lT c6245lT) {
        AbstractRunnableC6684n11 abstractRunnableC6684n11 = (AbstractRunnableC6684n11) b.getAndSet(this, null);
        if (abstractRunnableC6684n11 != null) {
            c6245lT.a(abstractRunnableC6684n11);
        }
        while (j(c6245lT)) {
        }
    }

    public final AbstractRunnableC6684n11 g() {
        AbstractRunnableC6684n11 abstractRunnableC6684n11 = (AbstractRunnableC6684n11) b.getAndSet(this, null);
        return abstractRunnableC6684n11 == null ? i() : abstractRunnableC6684n11;
    }

    public final AbstractRunnableC6684n11 h() {
        return k(true);
    }

    public final AbstractRunnableC6684n11 i() {
        AbstractRunnableC6684n11 abstractRunnableC6684n11;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC6684n11 = (AbstractRunnableC6684n11) this.a.getAndSet(i2, null)) != null) {
                c(abstractRunnableC6684n11);
                return abstractRunnableC6684n11;
            }
        }
    }

    public final boolean j(C6245lT c6245lT) {
        AbstractRunnableC6684n11 abstractRunnableC6684n11I = i();
        if (abstractRunnableC6684n11I == null) {
            return false;
        }
        c6245lT.a(abstractRunnableC6684n11I);
        return true;
    }

    public final AbstractRunnableC6684n11 k(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC6684n11 abstractRunnableC6684n11;
        do {
            atomicReferenceFieldUpdater = b;
            abstractRunnableC6684n11 = (AbstractRunnableC6684n11) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC6684n11 != null) {
                if ((abstractRunnableC6684n11.C.b() == 1) == z) {
                }
            }
            int i = d.get(this);
            int i2 = c.get(this);
            while (i != i2) {
                if (z && e.get(this) == 0) {
                    return null;
                }
                i2--;
                AbstractRunnableC6684n11 abstractRunnableC6684n11M = m(i2, z);
                if (abstractRunnableC6684n11M != null) {
                    return abstractRunnableC6684n11M;
                }
            }
            return null;
        } while (!AbstractC5549j0.a(atomicReferenceFieldUpdater, this, abstractRunnableC6684n11, null));
        return abstractRunnableC6684n11;
    }

    public final AbstractRunnableC6684n11 l(int i) {
        int i2 = d.get(this);
        int i3 = c.get(this);
        boolean z = i == 1;
        while (i2 != i3) {
            if (z && e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            AbstractRunnableC6684n11 abstractRunnableC6684n11M = m(i2, z);
            if (abstractRunnableC6684n11M != null) {
                return abstractRunnableC6684n11M;
            }
            i2 = i4;
        }
        return null;
    }

    public final AbstractRunnableC6684n11 m(int i, boolean z) {
        int i2 = i & 127;
        AbstractRunnableC6684n11 abstractRunnableC6684n11 = (AbstractRunnableC6684n11) this.a.get(i2);
        if (abstractRunnableC6684n11 != null) {
            if ((abstractRunnableC6684n11.C.b() == 1) == z && AbstractC7439pk.a(this.a, i2, abstractRunnableC6684n11, null)) {
                if (z) {
                    e.decrementAndGet(this);
                }
                return abstractRunnableC6684n11;
            }
        }
        return null;
    }

    public final long n(int i, C6748nF0 c6748nF0) {
        AbstractRunnableC6684n11 abstractRunnableC6684n11I = i == 3 ? i() : l(i);
        if (abstractRunnableC6684n11I == null) {
            return o(i, c6748nF0);
        }
        c6748nF0.B = abstractRunnableC6684n11I;
        return -1L;
    }

    public final long o(int i, C6748nF0 c6748nF0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC6684n11 abstractRunnableC6684n11;
        do {
            atomicReferenceFieldUpdater = b;
            abstractRunnableC6684n11 = (AbstractRunnableC6684n11) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC6684n11 == null) {
                return -2L;
            }
            if (((abstractRunnableC6684n11.C.b() != 1 ? 2 : 1) & i) == 0) {
                return -2L;
            }
            long jA = B11.f.a() - abstractRunnableC6684n11.B;
            long j = B11.b;
            if (jA < j) {
                return j - jA;
            }
        } while (!AbstractC5549j0.a(atomicReferenceFieldUpdater, this, abstractRunnableC6684n11, null));
        c6748nF0.B = abstractRunnableC6684n11;
        return -1L;
    }
}
