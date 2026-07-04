package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.dq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4101dq {
    public static final AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(AbstractC4101dq.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(AbstractC4101dq.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC4101dq(AbstractC4101dq abstractC4101dq) {
        this._prev = abstractC4101dq;
    }

    public final void b() {
        C.lazySet(this, null);
    }

    public final AbstractC4101dq c() {
        AbstractC4101dq abstractC4101dqG = g();
        while (abstractC4101dqG != null && abstractC4101dqG.h()) {
            abstractC4101dqG = (AbstractC4101dq) C.get(abstractC4101dqG);
        }
        return abstractC4101dqG;
    }

    public final AbstractC4101dq d() {
        AbstractC4101dq abstractC4101dqE;
        AbstractC4101dq abstractC4101dqE2 = e();
        G10.d(abstractC4101dqE2);
        while (abstractC4101dqE2.h() && (abstractC4101dqE = abstractC4101dqE2.e()) != null) {
            abstractC4101dqE2 = abstractC4101dqE;
        }
        return abstractC4101dqE2;
    }

    public final AbstractC4101dq e() {
        Object objF = f();
        if (objF == AbstractC3823cq.a) {
            return null;
        }
        return (AbstractC4101dq) objF;
    }

    public final Object f() {
        return B.get(this);
    }

    public final AbstractC4101dq g() {
        return (AbstractC4101dq) C.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return AbstractC5549j0.a(B, this, null, AbstractC3823cq.a);
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            AbstractC4101dq abstractC4101dqC = c();
            AbstractC4101dq abstractC4101dqD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC4101dqD);
            } while (!AbstractC5549j0.a(atomicReferenceFieldUpdater, abstractC4101dqD, obj, ((AbstractC4101dq) obj) == null ? null : abstractC4101dqC));
            if (abstractC4101dqC != null) {
                B.set(abstractC4101dqC, abstractC4101dqD);
            }
            if (!abstractC4101dqD.h() || abstractC4101dqD.i()) {
                if (abstractC4101dqC == null || !abstractC4101dqC.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(AbstractC4101dq abstractC4101dq) {
        return AbstractC5549j0.a(B, this, null, abstractC4101dq);
    }
}
