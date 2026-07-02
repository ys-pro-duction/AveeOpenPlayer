package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

/* JADX INFO: renamed from: com.daaw.ru2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8049ru2 implements zzf {
    public final /* synthetic */ BT1 a;
    public final /* synthetic */ C9267wF2 b;
    public final /* synthetic */ C4498fF2 c;
    public final /* synthetic */ C9730xu2 d;
    public final /* synthetic */ C8328su2 e;

    public C8049ru2(C8328su2 c8328su2, BT1 bt1, C9267wF2 c9267wF2, C4498fF2 c4498fF2, C9730xu2 c9730xu2) {
        this.e = c8328su2;
        this.a = bt1;
        this.b = c9267wF2;
        this.c = c4498fF2;
        this.d = c9730xu2;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        this.a.b(this.e.d.a(this.b, this.c, view, this.d));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
