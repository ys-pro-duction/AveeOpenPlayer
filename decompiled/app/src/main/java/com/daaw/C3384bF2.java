package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: renamed from: com.daaw.bF2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3384bF2 implements OnAdMetadataChangedListener {
    public final /* synthetic */ zzby B;
    public final /* synthetic */ BinderC3662cF2 C;

    public C3384bF2(BinderC3662cF2 binderC3662cF2, zzby zzbyVar) {
        this.C = binderC3662cF2;
        this.B = zzbyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.C.E != null) {
            try {
                this.B.zze();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
