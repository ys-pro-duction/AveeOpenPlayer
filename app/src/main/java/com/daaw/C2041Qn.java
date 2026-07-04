package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: com.daaw.Qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2041Qn {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C2041Qn.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public C2041Qn(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public final boolean a() {
        return b.get(this) != 0;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return AbstractC8054rw.a(this) + '[' + this.a + ']';
    }

    public /* synthetic */ C2041Qn(Throwable th, boolean z, int i, AbstractC2911Yw abstractC2911Yw) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
