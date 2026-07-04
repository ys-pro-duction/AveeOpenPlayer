package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeu;

/* JADX INFO: renamed from: com.daaw.ey2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4419ey2 implements Runnable {
    public final /* synthetic */ BinderC6954nz2 B;

    public RunnableC4419ey2(BinderC6954nz2 binderC6954nz2) {
        this.B = binderC6954nz2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.B.B;
        if (zzeuVar.B != null) {
            try {
                zzeuVar.B.zze(1);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
