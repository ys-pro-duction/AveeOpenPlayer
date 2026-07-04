package com.daaw;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzx;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class QI1 implements zzx {
    public boolean a = false;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zza c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ Map e;

    public QI1(SI1 si1, boolean z, zza zzaVar, Map map, Map map2) {
        this.b = z;
        this.c = zzaVar;
        this.d = map;
        this.e = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zza(boolean z) {
        if (this.a) {
            return;
        }
        if (z && this.b) {
            ((InterfaceC1974Qb2) this.c).i0();
        }
        this.a = true;
        this.d.put((String) this.e.get("event_id"), Boolean.valueOf(z));
        ((InterfaceC7327pK1) this.c).U("openIntentAsync", this.d);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zzb(int i) {
    }
}
