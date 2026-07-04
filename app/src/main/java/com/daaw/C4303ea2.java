package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: renamed from: com.daaw.ea2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4303ea2 implements S82 {
    public int B = ((Integer) zzba.zzc().b(AbstractC9820yE1.f1)).intValue();

    public final synchronized int a() {
        return this.B;
    }

    @Override // com.daaw.S82
    public final synchronized void t0(C9267wF2 c9267wF2) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.g1)).booleanValue()) {
            try {
                this.B = c9267wF2.b.b.c;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.daaw.S82
    public final void v0(zzbvg zzbvgVar) {
    }
}
