package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes3.dex */
public final class UE2 implements OnAdMetadataChangedListener {
    public final /* synthetic */ zzdd B;
    public final /* synthetic */ WE2 C;

    public UE2(WE2 we2, zzdd zzddVar) {
        this.C = we2;
        this.B = zzddVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.C.J != null) {
            try {
                this.B.zze();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
