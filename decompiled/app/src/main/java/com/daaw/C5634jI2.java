package com.daaw;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: renamed from: com.daaw.jI2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5634jI2 extends F53 {
    public static final Pair y = new Pair("", 0L);
    public SharedPreferences c;
    public C3392bH2 d;
    public final UF2 e;
    public final UF2 f;
    public final FH2 g;
    public String h;
    public boolean i;
    public long j;
    public final UF2 k;
    public final ME2 l;
    public final FH2 m;
    public final ME2 n;
    public final UF2 o;
    public final UF2 p;
    public boolean q;
    public final ME2 r;
    public final ME2 s;
    public final UF2 t;
    public final FH2 u;
    public final FH2 v;
    public final UF2 w;
    public final C7587qF2 x;

    public C5634jI2(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.k = new UF2(this, "session_timeout", 1800000L);
        this.l = new ME2(this, "start_new_session", true);
        this.o = new UF2(this, "last_pause_time", 0L);
        this.p = new UF2(this, "session_id", 0L);
        this.m = new FH2(this, "non_personalized_ads", null);
        this.n = new ME2(this, "allow_remote_dynamite", false);
        this.e = new UF2(this, "first_open_time", 0L);
        this.f = new UF2(this, "app_install_time", 0L);
        this.g = new FH2(this, "app_instance_id", null);
        this.r = new ME2(this, "app_backgrounded", false);
        this.s = new ME2(this, "deep_link_retrieval_complete", false);
        this.t = new UF2(this, "deep_link_retrieval_attempts", 0L);
        this.u = new FH2(this, "firebase_feature_rollouts", null);
        this.v = new FH2(this, "deferred_attribution_cache", null);
        this.w = new UF2(this, "deferred_attribution_cache_timestamp", 0L);
        this.x = new C7587qF2(this, "default_event_parameters", null);
    }

    @Override // com.daaw.F53
    public final void e() {
        SharedPreferences sharedPreferences = this.a.v().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.q = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.a.z();
        this.d = new C3392bH2(this, "health_monitor", Math.max(0L, ((Long) AbstractC1311Jr2.e.a(null)).longValue()), null);
    }

    @Override // com.daaw.F53
    public final boolean f() {
        return true;
    }

    public final SharedPreferences k() {
        d();
        g();
        AbstractC7506py0.l(this.c);
        return this.c;
    }

    public final Pair l(String str) {
        d();
        C9123vk3.b();
        if (this.a.z().B(null, AbstractC1311Jr2.K0) && !m().j(EnumC9512x73.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long jB = this.a.p().b();
        String str2 = this.h;
        if (str2 != null && jB < this.j) {
            return new Pair(str2, Boolean.valueOf(this.i));
        }
        this.j = jB + this.a.z().n(str, AbstractC1311Jr2.c);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a.v());
            this.h = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.h = id;
            }
            this.i = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.a.w().m().b("Unable to get advertising id", e);
            this.h = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.h, Boolean.valueOf(this.i));
    }

    public final C3633c83 m() {
        d();
        return C3633c83.c(k().getString("consent_settings", "G1"), k().getInt("consent_source", 100));
    }

    public final Boolean n() {
        d();
        if (k().contains("measurement_enabled")) {
            return Boolean.valueOf(k().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void o(Boolean bool) {
        d();
        SharedPreferences.Editor editorEdit = k().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final void q(boolean z) {
        d();
        this.a.w().s().b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = k().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final boolean r() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final boolean s(long j) {
        return j - this.k.a() > this.o.a();
    }

    public final boolean t(int i) {
        return C3633c83.k(i, k().getInt("consent_source", 100));
    }
}
