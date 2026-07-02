package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Mx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1646Mx2 implements InterfaceC1447Kz2 {
    public final Context a;
    public final PS2 b;

    public C1646Mx2(Context context, PS2 ps2) {
        this.a = context;
        this.b = ps2;
    }

    public final /* synthetic */ C1542Lx2 a() {
        Bundle bundle;
        zzt.zzp();
        String string = !((Boolean) zzba.zzc().b(AbstractC9820yE1.Y5)).booleanValue() ? "" : this.a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) zzba.zzc().b(AbstractC9820yE1.a6)).booleanValue() ? this.a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        zzt.zzp();
        Context context = this.a;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Z5)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new C1542Lx2(string, string2, bundle, null);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 18;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.b.S0(new Callable() { // from class: com.daaw.Jx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
