package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: renamed from: com.daaw.eR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4266eR1 {
    public final InterfaceC5485im a;
    public final zzg b;
    public final JR1 c;

    public C4266eR1(InterfaceC5485im interfaceC5485im, zzg zzgVar, JR1 jr1) {
        this.a = interfaceC5485im;
        this.b = zzgVar;
        this.c = jr1;
    }

    public final void a() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.q0)).booleanValue()) {
            this.c.y();
        }
    }

    public final void b(int i, long j) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.p0)).booleanValue()) {
            return;
        }
        if (j - this.b.zzf() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.q0)).booleanValue()) {
            this.b.zzL(i);
            this.b.zzM(j);
        } else {
            this.b.zzL(-1);
            this.b.zzM(j);
        }
        a();
    }
}
