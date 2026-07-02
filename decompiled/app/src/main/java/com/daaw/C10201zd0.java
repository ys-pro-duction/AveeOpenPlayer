package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.zd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C10201zd0 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C10201zd0.class, Object.class, "_cur");
    private volatile Object _cur;

    public C10201zd0(boolean z) {
        this._cur = new C0308Ad0(8, z);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            C0308Ad0 c0308Ad0 = (C0308Ad0) atomicReferenceFieldUpdater.get(this);
            int iA = c0308Ad0.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                AbstractC5549j0.a(a, this, c0308Ad0, c0308Ad0.i());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            C0308Ad0 c0308Ad0 = (C0308Ad0) atomicReferenceFieldUpdater.get(this);
            if (c0308Ad0.d()) {
                return;
            } else {
                AbstractC5549j0.a(a, this, c0308Ad0, c0308Ad0.i());
            }
        }
    }

    public final int c() {
        return ((C0308Ad0) a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            C0308Ad0 c0308Ad0 = (C0308Ad0) atomicReferenceFieldUpdater.get(this);
            Object objJ = c0308Ad0.j();
            if (objJ != C0308Ad0.h) {
                return objJ;
            }
            AbstractC5549j0.a(a, this, c0308Ad0, c0308Ad0.i());
        }
    }
}
