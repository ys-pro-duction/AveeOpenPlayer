package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.Jw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1331Jw2 implements InterfaceC1343Jz2 {
    public final zzw a;
    public final zzcaz b;
    public final boolean c;

    public C1331Jw2(zzw zzwVar, zzcaz zzcazVar, boolean z) {
        this.a = zzwVar;
        this.b = zzcazVar;
        this.c = z;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.b.D >= ((Integer) zzba.zzc().b(AbstractC9820yE1.e5)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.c);
        }
        zzw zzwVar = this.a;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
