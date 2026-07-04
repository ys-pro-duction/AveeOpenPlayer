package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.daaw.AbstractC9820yE1;
import com.daaw.SharedPreferencesOnSharedPreferenceChangeListenerC5408iV1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzcf {
    public final Map a = new HashMap();
    public final List b = new ArrayList();
    public final Context c;

    public zzcf(Context context) {
        this.c = context;
    }

    public final synchronized void b(String str) {
        try {
            if (this.a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = (str == "__default__" || (str != null && str.equals("__default__"))) ? PreferenceManager.getDefaultSharedPreferences(this.c) : this.c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC5408iV1 sharedPreferencesOnSharedPreferenceChangeListenerC5408iV1 = new SharedPreferencesOnSharedPreferenceChangeListenerC5408iV1(this, str);
            this.a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC5408iV1);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC5408iV1);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(zzcd zzcdVar) {
        this.b.add(zzcdVar);
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.C9)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            Map mapZzu = zzt.zzu((String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.G9));
            Iterator it = mapZzu.keySet().iterator();
            while (it.hasNext()) {
                b((String) it.next());
            }
            c(new zzcd(mapZzu));
        }
    }
}
