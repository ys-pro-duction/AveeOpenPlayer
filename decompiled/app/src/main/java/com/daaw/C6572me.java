package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: renamed from: com.daaw.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6572me {
    public static C1058Hg1 c = new C1058Hg1();
    public static final boolean[] d = {false, false, false};
    public U2 a;
    public int b;

    public C6572me(int i, View view) {
        this.b = i;
        c(view);
    }

    public final void c(View view) {
        AdView adView;
        if (view instanceof AdView) {
            adView = (AdView) view;
        } else {
            if (!(view instanceof ViewGroup)) {
                return;
            }
            AdView adView2 = new AdView(view.getContext());
            ((ViewGroup) view).addView(adView2);
            adView = adView2;
        }
        if (adView.getAdSize() == null) {
            adView.setAdSize(AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(adView.getContext(), (int) (adView.getResources().getDisplayMetrics().widthPixels / adView.getResources().getDisplayMetrics().density)));
        }
        if (adView.getAdUnitId() == null) {
            adView.setAdUnitId(adView.getResources().getString(JD0.r));
        }
        U2 u2 = new U2(adView);
        this.a = u2;
        AdView adView3 = u2.a;
        if (adView3 != null) {
            if (d[this.b]) {
                adView3.setVisibility(0);
            } else {
                adView3.setVisibility(8);
            }
            this.a.a.setAdListener(new a());
        }
    }

    public void d(int i) {
        U2 u2 = this.a;
        if (u2 == null || u2.a == null) {
            d[this.b] = false;
        } else {
            if ((((Boolean) WB0.m.a(Boolean.TRUE)).booleanValue() && C4989gz0.a.e()) || ((Boolean) c.a(this.a, Integer.valueOf(this.b), Integer.valueOf(i), Boolean.FALSE)).booleanValue()) {
                return;
            }
            d[this.b] = false;
            this.a.a.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.daaw.me$a */
    public class a extends AdListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            C6572me.this.a.a.setVisibility(8);
            C6572me.d[C6572me.this.b] = false;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            C6572me.this.a.a.setVisibility(0);
            C6572me.d[C6572me.this.b] = true;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }
    }
}
