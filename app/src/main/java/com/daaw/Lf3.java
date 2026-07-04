package com.daaw;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class Lf3 {
    public final Jf3 a;
    public final Gf3 b;
    public final InterfaceC1810Om2 c;
    public final AbstractC8657u52 d;
    public int e;
    public Object f;
    public final Looper g;
    public final int h;
    public boolean i;
    public boolean j;
    public boolean k;

    public Lf3(Gf3 gf3, Jf3 jf3, AbstractC8657u52 abstractC8657u52, int i, InterfaceC1810Om2 interfaceC1810Om2, Looper looper) {
        this.b = gf3;
        this.a = jf3;
        this.d = abstractC8657u52;
        this.g = looper;
        this.c = interfaceC1810Om2;
        this.h = i;
    }

    public final int a() {
        return this.e;
    }

    public final Looper b() {
        return this.g;
    }

    public final Jf3 c() {
        return this.a;
    }

    public final Lf3 d() {
        AbstractC6048km2.f(!this.i);
        this.i = true;
        this.b.c(this);
        return this;
    }

    public final Lf3 e(Object obj) {
        AbstractC6048km2.f(!this.i);
        this.f = obj;
        return this;
    }

    public final Lf3 f(int i) {
        AbstractC6048km2.f(!this.i);
        this.e = i;
        return this;
    }

    public final Object g() {
        return this.f;
    }

    public final synchronized void h(boolean z) {
        this.j = z | this.j;
        this.k = true;
        notifyAll();
    }

    public final synchronized boolean i(long j) {
        try {
            AbstractC6048km2.f(this.i);
            AbstractC6048km2.f(this.g.getThread() != Thread.currentThread());
            long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
            while (!this.k) {
                if (j <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j);
                j = jElapsedRealtime - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public final synchronized boolean j() {
        return false;
    }
}
