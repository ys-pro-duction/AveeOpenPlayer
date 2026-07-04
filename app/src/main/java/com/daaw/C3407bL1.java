package com.daaw;

import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: renamed from: com.daaw.bL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3407bL1 extends IT1 {
    public final zzbd d;
    public final Object c = new Object();
    public boolean e = false;
    public int f = 0;

    public C3407bL1(zzbd zzbdVar) {
        this.d = zzbdVar;
    }

    public final WK1 f() {
        WK1 wk1 = new WK1(this);
        synchronized (this.c) {
            e(new XK1(this, wk1), new YK1(this, wk1));
            AbstractC7506py0.o(this.f >= 0);
            this.f++;
        }
        return wk1;
    }

    public final void g() {
        synchronized (this.c) {
            AbstractC7506py0.o(this.f >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.e = true;
            h();
        }
    }

    public final void h() {
        synchronized (this.c) {
            try {
                AbstractC7506py0.o(this.f >= 0);
                if (this.e && this.f == 0) {
                    zze.zza("No reference is left (including root). Cleaning up engine.");
                    e(new C3128aL1(this), new ET1());
                } else {
                    zze.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.c) {
            AbstractC7506py0.o(this.f > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            this.f--;
            h();
        }
    }
}
