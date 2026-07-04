package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class NS1 {
    public final Object a = new Object();
    public volatile int c = 1;
    public volatile long b = 0;

    public /* synthetic */ NS1(MS1 ms1) {
    }

    public final void a() {
        long jA = zzt.zzB().a();
        synchronized (this.a) {
            try {
                if (this.c == 3) {
                    if (this.b + ((Long) zzba.zzc().b(AbstractC9820yE1.T5)).longValue() <= jA) {
                        this.c = 1;
                    }
                }
            } finally {
            }
        }
        long jA2 = zzt.zzB().a();
        synchronized (this.a) {
            try {
                if (this.c != 2) {
                    return;
                }
                this.c = 3;
                if (this.c == 3) {
                    this.b = jA2;
                }
            } finally {
            }
        }
    }
}
