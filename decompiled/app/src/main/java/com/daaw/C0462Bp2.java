package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: renamed from: com.daaw.Bp2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0462Bp2 implements J72, U62 {
    public static final Object D = new Object();
    public static int E;
    public final zzg B;
    public final C1511Lp2 C;

    public C0462Bp2(C1511Lp2 c1511Lp2, zzg zzgVar) {
        this.C = c1511Lp2;
        this.B = zzgVar;
    }

    private final void a(boolean z) {
        int i;
        int iIntValue;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f6)).booleanValue() && !this.B.zzQ()) {
            Object obj = D;
            synchronized (obj) {
                i = E;
                iIntValue = ((Integer) zzba.zzc().b(AbstractC9820yE1.g6)).intValue();
            }
            if (i >= iIntValue) {
                return;
            }
            this.C.e(z);
            synchronized (obj) {
                E++;
            }
        }
    }

    @Override // com.daaw.U62
    public final void P(zze zzeVar) {
        a(false);
    }

    @Override // com.daaw.J72
    public final void zzr() {
        a(true);
    }
}
