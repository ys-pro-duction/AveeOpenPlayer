package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.eF2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4219eF2 {
    public final InterfaceC5485im a;
    public final Object b = new Object();
    public volatile int d = 1;
    public volatile long c = 0;

    public C4219eF2(InterfaceC5485im interfaceC5485im) {
        this.a = interfaceC5485im;
    }

    public final void a() {
        f(2, 3);
    }

    public final void b(boolean z) {
        if (z) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            e();
            z = this.d == 3;
        }
        return z;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            e();
            z = this.d == 2;
        }
        return z;
    }

    public final void e() {
        long jA = this.a.a();
        synchronized (this.b) {
            try {
                if (this.d == 3) {
                    if (this.c + ((Long) zzba.zzc().b(AbstractC9820yE1.T5)).longValue() <= jA) {
                        this.d = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(int i, int i2) {
        e();
        Object obj = this.b;
        long jA = this.a.a();
        synchronized (obj) {
            try {
                if (this.d != i) {
                    return;
                }
                this.d = i2;
                if (this.d == 3) {
                    this.c = jA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
