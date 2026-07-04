package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzew;

/* JADX INFO: renamed from: com.daaw.wA2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9247wA2 implements Runnable {
    public final /* synthetic */ zzew B;

    public RunnableC9247wA2(zzew zzewVar) {
        this.B = zzewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzew zzewVar = this.B;
        if (zzewVar.B != null) {
            try {
                zzewVar.B.zze(1);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
