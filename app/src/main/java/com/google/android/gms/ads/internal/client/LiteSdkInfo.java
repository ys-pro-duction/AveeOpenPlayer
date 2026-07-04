package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.daaw.PL1;
import com.daaw.SL1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public class LiteSdkInfo extends zzck {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public SL1 getAdapterCreator() {
        return new PL1();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, 233702000, "22.5.0");
    }
}
