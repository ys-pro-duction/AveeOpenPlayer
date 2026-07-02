package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.daaw.AbstractC10159zT1;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC8143sF1;
import com.daaw.C3996dT1;
import com.daaw.C9318wS1;
import com.daaw.InterfaceFutureC8236sc0;

/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        Object obj = C3996dT1.b;
        if (((Boolean) AbstractC8143sF1.a.e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || C3996dT1.l()) {
                    return;
                }
                InterfaceFutureC8236sc0 interfaceFutureC8236sc0Zzb = new C9318wS1(context).zzb();
                AbstractC4274eT1.zzi("Updating ad debug logging enablement.");
                AbstractC10159zT1.a(interfaceFutureC8236sc0Zzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                AbstractC4274eT1.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}
