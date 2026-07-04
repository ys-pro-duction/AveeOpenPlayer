package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;

/* JADX INFO: renamed from: com.daaw.uh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8821uh2 extends VideoController.VideoLifecycleCallbacks {
    public final C7969re2 a;

    public C8821uh2(C7969re2 c7969re2) {
        this.a = c7969re2;
    }

    public static zzdt a(C7969re2 c7969re2) {
        zzdq zzdqVarW = c7969re2.W();
        if (zzdqVarW == null) {
            return null;
        }
        try {
            return zzdqVarW.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzdt zzdtVarA = a(this.a);
        if (zzdtVarA == null) {
            return;
        }
        try {
            zzdtVarA.zze();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzdt zzdtVarA = a(this.a);
        if (zzdtVarA == null) {
            return;
        }
        try {
            zzdtVarA.zzg();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzdt zzdtVarA = a(this.a);
        if (zzdtVarA == null) {
            return;
        }
        try {
            zzdtVarA.zzi();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Unable to call onVideoEnd()", e);
        }
    }
}
