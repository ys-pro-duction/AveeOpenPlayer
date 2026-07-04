package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: renamed from: com.daaw.cR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC3709cR1 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final zzg c;
    public final JR1 d;
    public String e = "-1";
    public int f = -1;

    public SharedPreferencesOnSharedPreferenceChangeListenerC3709cR1(Context context, zzg zzgVar, JR1 jr1) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = zzgVar;
        this.a = context;
        this.d = jr1;
    }

    public final void a() {
        this.b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.b, "gad_has_consent_for_cookies");
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.x0)).booleanValue()) {
            onSharedPreferenceChanged(this.b, "IABTCF_PurposeConsents");
        } else {
            onSharedPreferenceChanged(this.b, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.b, "IABTCF_TCString");
        }
    }

    public final void b() {
        this.c.zzH(true);
        new Bundle();
        throw null;
    }

    public final void c(String str, int i) {
        Context context;
        boolean z = true;
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.v0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z = false;
        }
        this.c.zzH(z);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f6)).booleanValue() && z && (context = this.a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        this.d.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.SharedPreferencesOnSharedPreferenceChangeListenerC3709cR1.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
