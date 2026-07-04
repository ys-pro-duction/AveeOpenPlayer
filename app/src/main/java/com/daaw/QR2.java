package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QR2 extends AbstractC9036vR2 {
    public static final MR2 K;
    public static final Logger L = Logger.getLogger(QR2.class.getName());
    public volatile Set I = null;
    public volatile int J;

    static {
        MR2 pr2;
        Throwable th;
        OR2 or2 = null;
        try {
            pr2 = new NR2(AtomicReferenceFieldUpdater.newUpdater(QR2.class, Set.class, "I"), AtomicIntegerFieldUpdater.newUpdater(QR2.class, "J"));
            th = null;
        } catch (Error | RuntimeException e) {
            pr2 = new PR2(or2);
            th = e;
        }
        K = pr2;
        if (th != null) {
            L.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public QR2(int i) {
        this.J = i;
    }

    public final int C() {
        return K.a(this);
    }

    public final Set E() {
        Set set = this.I;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        I(setNewSetFromMap);
        K.b(this, null, setNewSetFromMap);
        Set set2 = this.I;
        set2.getClass();
        return set2;
    }

    public final void H() {
        this.I = null;
    }

    public abstract void I(Set set);
}
