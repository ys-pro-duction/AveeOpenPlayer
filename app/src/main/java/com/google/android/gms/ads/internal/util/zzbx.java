package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.daaw.AbstractC7506py0;
import com.daaw.HandlerC8451tM2;

/* JADX INFO: loaded from: classes.dex */
public final class zzbx {
    public HandlerThread a = null;
    public Handler b = null;
    public int c = 0;
    public final Object d = new Object();

    public final Handler zza() {
        return this.b;
    }

    public final Looper zzb() {
        Looper looper;
        synchronized (this.d) {
            try {
                if (this.c != 0) {
                    AbstractC7506py0.m(this.a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.a == null) {
                    zze.zza("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.a = handlerThread;
                    handlerThread.start();
                    this.b = new HandlerC8451tM2(this.a.getLooper());
                    zze.zza("Looper thread started.");
                } else {
                    zze.zza("Resuming the looper thread");
                    this.d.notifyAll();
                }
                this.c++;
                looper = this.a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }
}
