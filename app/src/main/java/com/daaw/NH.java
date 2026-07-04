package com.daaw;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NH extends AbstractC5801jt {
    public long D;
    public boolean E;
    public C1863Pa F;

    public static /* synthetic */ void l1(NH nh, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        nh.k1(z);
    }

    public static /* synthetic */ void q1(NH nh, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        nh.p1(z);
    }

    public final void k1(boolean z) {
        long jM1 = this.D - m1(z);
        this.D = jM1;
        if (jM1 <= 0 && this.E) {
            shutdown();
        }
    }

    public final long m1(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void n1(AbstractC7014oC abstractC7014oC) {
        C1863Pa c1863Pa = this.F;
        if (c1863Pa == null) {
            c1863Pa = new C1863Pa();
            this.F = c1863Pa;
        }
        c1863Pa.addLast(abstractC7014oC);
    }

    public long o1() {
        C1863Pa c1863Pa = this.F;
        return (c1863Pa == null || c1863Pa.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void p1(boolean z) {
        this.D += m1(z);
        if (z) {
            return;
        }
        this.E = true;
    }

    public final boolean r1() {
        return this.D >= m1(true);
    }

    public final boolean s1() {
        C1863Pa c1863Pa = this.F;
        if (c1863Pa != null) {
            return c1863Pa.isEmpty();
        }
        return true;
    }

    public abstract void shutdown();

    public abstract long t1();

    public final boolean u1() throws IllegalAccessException, InvocationTargetException {
        AbstractC7014oC abstractC7014oC;
        C1863Pa c1863Pa = this.F;
        if (c1863Pa == null || (abstractC7014oC = (AbstractC7014oC) c1863Pa.L()) == null) {
            return false;
        }
        abstractC7014oC.run();
        return true;
    }

    public boolean v1() {
        return false;
    }
}
