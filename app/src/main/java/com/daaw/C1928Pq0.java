package com.daaw;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: renamed from: com.daaw.Pq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1928Pq0 {
    public final Context a;
    public final C4812gM b;
    public final WB0 c;
    public AppOpenAd d;
    public boolean e;
    public boolean f;
    public final InterfaceC1396Kn g;

    /* JADX INFO: renamed from: com.daaw.Pq0$a */
    public static final class a extends AppOpenAd.AppOpenAdLoadCallback {
        public final /* synthetic */ Activity b;

        public a(Activity activity) {
            this.b = activity;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(AppOpenAd appOpenAd) {
            G10.g(appOpenAd, "ad");
            C1928Pq0.this.d = appOpenAd;
            C1928Pq0.this.e = false;
            C1928Pq0.this.g(this.b);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            G10.g(loadAdError, "loadAdError");
            C1928Pq0.this.e = false;
            C1928Pq0.this.d().B0(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pq0$b */
    public static final class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            C1928Pq0.this.d = null;
            C1928Pq0.this.f = false;
            C1928Pq0.this.d().B0(G91.a);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            G10.g(adError, "adError");
            C1928Pq0.this.d = null;
            C1928Pq0.this.f = false;
            C1928Pq0.this.d().B0(G91.a);
        }
    }

    public C1928Pq0(Context context, C4812gM c4812gM, WB0 wb0) {
        G10.g(context, "context");
        G10.g(c4812gM, "firebaseConfig");
        G10.g(wb0, "purchaseService");
        this.a = context;
        this.b = c4812gM;
        this.c = wb0;
        this.g = AbstractC1603Mn.b(null, 1, null);
    }

    public final InterfaceC1396Kn d() {
        return this.g;
    }

    public final boolean e() {
        return this.d != null;
    }

    public final void f(Activity activity) {
        if (this.e || e()) {
            this.g.B0(G91.a);
            return;
        }
        this.e = true;
        AdRequest adRequestBuild = new AdRequest.Builder().build();
        G10.f(adRequestBuild, "build(...)");
        AppOpenAd.load(this.a, "ca-app-pub-3759586557634138/8656952978", adRequestBuild, 1, new a(activity));
    }

    public final void g(Activity activity) {
        G10.g(activity, "activity");
        if (!((Boolean) this.b.i().e().b()).booleanValue()) {
            this.g.B0(G91.a);
            return;
        }
        if (this.f || !e()) {
            boolean zK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(this.a, "pref_disableHeaderAds", false);
            if (e() || zK) {
                this.g.B0(G91.a);
                return;
            } else {
                f(activity);
                return;
            }
        }
        AppOpenAd appOpenAd = this.d;
        if (appOpenAd != null) {
            appOpenAd.setFullScreenContentCallback(new b());
        }
        this.f = true;
        AppOpenAd appOpenAd2 = this.d;
        if (appOpenAd2 != null) {
            appOpenAd2.show(activity);
        }
    }
}
