package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.Ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1763Ob extends AbstractC1720Nq0 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1763Ob.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC1555Mb.a;

    @Override // com.daaw.AbstractC1720Nq0
    public final Object a(Object obj) {
        Object objC = a.get(this);
        if (objC == AbstractC1555Mb.a) {
            objC = c(d(obj));
        }
        b(obj, objC);
        return objC;
    }

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AbstractC1555Mb.a;
        return obj2 != obj3 ? obj2 : AbstractC5549j0.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public abstract Object d(Object obj);
}
