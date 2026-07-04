package com.google.android.gms.ads.internal.util;

/* JADX INFO: loaded from: classes.dex */
public final class zzcb {
    public long a;
    public long b = Long.MIN_VALUE;
    public final Object c = new Object();

    public zzcb(long j) {
        this.a = j;
    }

    public final void zza(long j) {
        synchronized (this.c) {
            this.a = j;
        }
    }

    public final boolean zzb() {
        synchronized (this.c) {
            try {
                long jB = com.google.android.gms.ads.internal.zzt.zzB().b();
                if (this.b + this.a > jB) {
                    return false;
                }
                this.b = jB;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
