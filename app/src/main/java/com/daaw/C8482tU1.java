package com.daaw;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.tU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8482tU1 {
    public long b;
    public final long a = TimeUnit.MILLISECONDS.toNanos(((Long) zzba.zzc().b(AbstractC9820yE1.D)).longValue());
    public boolean c = true;

    public final void a(SurfaceTexture surfaceTexture, final InterfaceC4278eU1 interfaceC4278eU1) {
        if (interfaceC4278eU1 == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.c) {
            long j = timestamp - this.b;
            if (Math.abs(j) < this.a) {
                return;
            }
        }
        this.c = false;
        this.b = timestamp;
        zzt.zza.post(new Runnable() { // from class: com.daaw.sU1
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4278eU1.zzk();
            }
        });
    }

    public final void b() {
        this.c = true;
    }
}
