package com.daaw;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzcf;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.iV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC5408iV1 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final /* synthetic */ zzcf b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC5408iV1(zzcf zzcfVar, String str) {
        this.b = zzcfVar;
        this.a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.b) {
            try {
                for (zzcd zzcdVar : this.b.b) {
                    String str2 = this.a;
                    Map map = zzcdVar.zza;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        zzt.zzo().h().zzI(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
