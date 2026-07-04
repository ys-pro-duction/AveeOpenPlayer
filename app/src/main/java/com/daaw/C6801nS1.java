package com.daaw;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.nS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6801nS1 extends zzb {
    public final /* synthetic */ OS1 c;

    public C6801nS1(OS1 os1) {
        this.c = os1;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        OS1 os1 = this.c;
        EE1 ee1 = new EE1(os1.e, os1.f.B);
        synchronized (this.c.a) {
            try {
                zzt.zze();
                HE1.a(this.c.h, ee1);
            } catch (IllegalArgumentException e) {
                AbstractC4274eT1.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
