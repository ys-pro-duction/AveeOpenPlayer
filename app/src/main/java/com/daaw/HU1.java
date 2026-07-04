package com.daaw;

import com.google.android.gms.ads.internal.util.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class HU1 implements Runnable {
    public final C6809nU1 B;
    public boolean C = false;

    public HU1(C6809nU1 c6809nU1) {
        this.B = c6809nU1;
    }

    public final void a() {
        this.C = true;
        this.B.w();
    }

    public final void b() {
        this.C = false;
        c();
    }

    public final void c() {
        HandlerC8451tM2 handlerC8451tM2 = zzt.zza;
        handlerC8451tM2.removeCallbacks(this);
        handlerC8451tM2.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.C) {
            return;
        }
        this.B.w();
        c();
    }
}
