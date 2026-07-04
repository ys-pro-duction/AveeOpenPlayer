package com.daaw;

import android.content.Context;
import com.daaw.C0425Bg1;
import com.daaw.C10217zg1;
import com.daaw.avee.MainActivity;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Vx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2604Vx0 extends InterstitialAdLoadCallback {
    public final C0746Eg1 a;
    public final List b;
    public InterstitialAd c;

    public C2604Vx0(C0746Eg1 c0746Eg1) {
        G10.g(c0746Eg1, "isPremium");
        this.a = c0746Eg1;
        LinkedList linkedList = new LinkedList();
        this.b = linkedList;
        C2221Sf1.Q.b(new C0425Bg1.a() { // from class: com.daaw.Tx0
            @Override // com.daaw.C0425Bg1.a
            public final void invoke(Object obj, Object obj2, Object obj3) {
                C2604Vx0.c(this.a, ((Boolean) obj).booleanValue(), (Long) obj2, (Boolean) obj3);
            }
        }, linkedList);
        C2221Sf1.S.b(new C10217zg1.a() { // from class: com.daaw.Ux0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                C2604Vx0.d(this.a, (Boolean) obj);
            }
        }, linkedList);
    }

    public static final void c(C2604Vx0 c2604Vx0, boolean z, Long l, Boolean bool) {
        Context contextD;
        G10.g(c2604Vx0, "this$0");
        if ((((Boolean) c2604Vx0.a.a(Boolean.FALSE)).booleanValue() && C4989gz0.a.e()) || !z || (contextD = C4989gz0.a.d()) == null) {
            return;
        }
        InterstitialAd.load(contextD, contextD.getString(JD0.s), P2.a.b(), c2604Vx0);
    }

    public static final void d(C2604Vx0 c2604Vx0, Boolean bool) {
        G10.g(c2604Vx0, "this$0");
        if (((Boolean) c2604Vx0.a.a(Boolean.FALSE)).booleanValue() && C4989gz0.a.e()) {
            return;
        }
        c2604Vx0.f();
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(InterstitialAd interstitialAd) {
        G10.g(interstitialAd, "ad");
        super.onAdLoaded(interstitialAd);
        this.c = interstitialAd;
    }

    public final void f() {
        InterstitialAd interstitialAd;
        MainActivity mainActivityE = MainActivity.INSTANCE.e();
        if (mainActivityE == null || (interstitialAd = this.c) == null) {
            return;
        }
        interstitialAd.show(mainActivityE);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        G10.g(loadAdError, "error");
        super.onAdFailedToLoad(loadAdError);
        loadAdError.getCode();
    }
}
