package com.daaw;

import android.os.Handler;

/* JADX INFO: renamed from: com.daaw.Cu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0585Cu1 {
    public static volatile Handler d;
    public final InterfaceC5027h63 a;
    public final Runnable b;
    public volatile long c;

    public AbstractC0585Cu1(InterfaceC5027h63 interfaceC5027h63) {
        AbstractC7506py0.l(interfaceC5027h63);
        this.a = interfaceC5027h63;
        this.b = new RunnableC2901Yt1(this, interfaceC5027h63);
    }

    public final void b() {
        this.c = 0L;
        f().removeCallbacks(this.b);
    }

    public abstract void c();

    public final void d(long j) {
        b();
        if (j >= 0) {
            this.c = this.a.p().a();
            if (f().postDelayed(this.b, j)) {
                return;
            }
            this.a.w().n().b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean e() {
        return this.c != 0;
    }

    public final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (AbstractC0585Cu1.class) {
            try {
                if (d == null) {
                    d = new HandlerC5113hR1(this.a.v().getMainLooper());
                }
                handler = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
