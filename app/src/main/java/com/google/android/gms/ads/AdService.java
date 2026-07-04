package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.daaw.AbstractC4274eT1;
import com.daaw.PL1;
import com.google.android.gms.ads.internal.client.zzay;

/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            zzay.zza().zzm(this, new PL1()).J(intent);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
