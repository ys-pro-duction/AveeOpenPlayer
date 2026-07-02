package com.google.android.gms.ads.internal.util;

import com.daaw.AbstractC4274eT1;
import com.daaw.EF1;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends AbstractC4274eT1 {
    public static void zza(String str) {
        if (!zzc() || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : AbstractC4274eT1.a.d(str)) {
        }
    }

    public static void zzb(String str, Throwable th) {
        zzc();
    }

    public static boolean zzc() {
        return AbstractC4274eT1.zzm(2) && ((Boolean) EF1.a.e()).booleanValue();
    }
}
