package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

/* JADX INFO: renamed from: com.daaw.Au2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0378Au2 implements zzf {
    public final /* synthetic */ AbstractC5998kc2 a;

    public C0378Au2(C0907Fu2 c0907Fu2, AbstractC5998kc2 abstractC5998kc2) {
        this.a = abstractC5998kc2;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.a.a().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.a.b().zza();
        this.a.e().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }
}
