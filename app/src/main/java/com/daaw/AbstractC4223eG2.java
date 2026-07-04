package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.eG2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4223eG2 {
    public static void a(Context context, boolean z) {
        if (z) {
            AbstractC4274eT1.zzi("This request is sent from a test device.");
            return;
        }
        zzay.zzb();
        AbstractC4274eT1.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + XS1.C(context) + "\")) to get test ads on this device.");
    }

    public static void b(int i, Throwable th, String str) {
        AbstractC4274eT1.zzi("Ad failed to load : " + i);
        zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        zzt.zzo().t(th, str);
    }
}
