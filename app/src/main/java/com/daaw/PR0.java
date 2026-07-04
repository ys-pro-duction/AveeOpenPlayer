package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class PR0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final QJ0 b;
    public volatile NZ0 c;

    public PR0(QJ0 qj0) {
        this.b = qj0;
    }

    public NZ0 a() {
        b();
        return e(this.a.compareAndSet(false, true));
    }

    public void b() {
        this.b.a();
    }

    public final NZ0 c() {
        return this.b.d(d());
    }

    public abstract String d();

    public final NZ0 e(boolean z) {
        if (!z) {
            return c();
        }
        if (this.c == null) {
            this.c = c();
        }
        return this.c;
    }

    public void f(NZ0 nz0) {
        if (nz0 == this.c) {
            this.a.set(false);
        }
    }
}
