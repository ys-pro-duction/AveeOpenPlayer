package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.gz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4989gz0 {
    public static final C4989gz0 a = new C4989gz0();

    public final boolean a() {
        return b().K(d(), "pref_alwaysHideAppLogo", false);
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC5706ja b() {
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e();
        G10.f(sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE, "createOrGetInstance(...)");
        return sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE;
    }

    public final String c() {
        return b().O(d(), "pref_claimedPromoEmail", null);
    }

    public final Context d() {
        return com.daaw.avee.a.d.d();
    }

    public final boolean e() {
        return b().K(d(), "pref_disableHeaderAds", true);
    }

    public final void f(String str) {
        b().p(d()).edit().putString("pref_claimedPromoEmail", str).apply();
    }

    public final void g(boolean z) {
        b().Q(d(), "pref_promoAttempted", z);
    }
}
