package com.daaw;

/* JADX INFO: renamed from: com.daaw.qk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7721qk2 {
    public final InterfaceC7880rJ1 a;

    public C7721qk2(InterfaceC7880rJ1 interfaceC7880rJ1) {
        this.a = interfaceC7880rJ1;
    }

    public final void a() {
        s(new C7442pk2("initialize", null));
    }

    public final void b(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("interstitial", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onAdClicked";
        this.a.zzb(C7442pk2.a(c7442pk2));
    }

    public final void c(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("interstitial", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onAdClosed";
        s(c7442pk2);
    }

    public final void d(long j, int i) {
        C7442pk2 c7442pk2 = new C7442pk2("interstitial", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onAdFailedToLoad";
        c7442pk2.d = Integer.valueOf(i);
        s(c7442pk2);
    }

    public final void e(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("interstitial", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onAdLoaded";
        s(c7442pk2);
    }

    public final void f(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("interstitial", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onNativeAdObjectNotAvailable";
        s(c7442pk2);
    }

    public final void g(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("interstitial", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onAdOpened";
        s(c7442pk2);
    }

    public final void h(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("creation", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "nativeObjectCreated";
        s(c7442pk2);
    }

    public final void i(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("creation", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "nativeObjectNotCreated";
        s(c7442pk2);
    }

    public final void j(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("rewarded", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onAdClicked";
        s(c7442pk2);
    }

    public final void k(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("rewarded", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onRewardedAdClosed";
        s(c7442pk2);
    }

    public final void l(long j, InterfaceC7351pQ1 interfaceC7351pQ1) {
        C7442pk2 c7442pk2 = new C7442pk2("rewarded", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onUserEarnedReward";
        c7442pk2.e = interfaceC7351pQ1.zzf();
        c7442pk2.f = Integer.valueOf(interfaceC7351pQ1.zze());
        s(c7442pk2);
    }

    public final void m(long j, int i) {
        C7442pk2 c7442pk2 = new C7442pk2("rewarded", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onRewardedAdFailedToLoad";
        c7442pk2.d = Integer.valueOf(i);
        s(c7442pk2);
    }

    public final void n(long j, int i) {
        C7442pk2 c7442pk2 = new C7442pk2("rewarded", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onRewardedAdFailedToShow";
        c7442pk2.d = Integer.valueOf(i);
        s(c7442pk2);
    }

    public final void o(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("rewarded", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onAdImpression";
        s(c7442pk2);
    }

    public final void p(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("rewarded", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onRewardedAdLoaded";
        s(c7442pk2);
    }

    public final void q(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("rewarded", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onNativeAdObjectNotAvailable";
        s(c7442pk2);
    }

    public final void r(long j) {
        C7442pk2 c7442pk2 = new C7442pk2("rewarded", null);
        c7442pk2.a = Long.valueOf(j);
        c7442pk2.c = "onRewardedAdOpened";
        s(c7442pk2);
    }

    public final void s(C7442pk2 c7442pk2) {
        String strA = C7442pk2.a(c7442pk2);
        AbstractC4274eT1.zzi("Dispatching AFMA event on publisher webview: ".concat(strA));
        this.a.zzb(strA);
    }
}
