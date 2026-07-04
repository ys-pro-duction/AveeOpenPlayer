package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class BI2 implements InterfaceC8791ub2, InterfaceC6157l72, InterfaceC9914yb2 {
    public final TI2 B;
    public final EI2 C;

    public BI2(Context context, TI2 ti2) {
        this.B = ti2;
        this.C = DI2.a(context, 13);
    }

    @Override // com.daaw.InterfaceC6157l72
    public final void d(zze zzeVar) {
        if (((Boolean) AbstractC7307pF1.d.e()).booleanValue()) {
            TI2 ti2 = this.B;
            EI2 ei2 = this.C;
            ei2.o(zzeVar.zza().toString());
            ei2.zzf(false);
            ti2.a(ei2);
        }
    }

    @Override // com.daaw.InterfaceC9914yb2
    public final void zzb() {
        if (((Boolean) AbstractC7307pF1.d.e()).booleanValue()) {
            TI2 ti2 = this.B;
            EI2 ei2 = this.C;
            ei2.zzf(true);
            ti2.a(ei2);
        }
    }

    @Override // com.daaw.InterfaceC8791ub2
    public final void zzl() {
        if (((Boolean) AbstractC7307pF1.d.e()).booleanValue()) {
            this.C.zzh();
        }
    }

    @Override // com.daaw.InterfaceC9914yb2
    public final void zza() {
    }

    @Override // com.daaw.InterfaceC8791ub2
    public final void zzk() {
    }
}
