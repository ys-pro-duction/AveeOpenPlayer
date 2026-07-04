package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbvg;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.jk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5759jk2 implements AppEventListener, S82, zza, R62, InterfaceC7273p72, InterfaceC7552q72, J72, U62, ZH2 {
    public final List B;
    public final C2758Xj2 C;
    public long D;

    public C5759jk2(C2758Xj2 c2758Xj2, AbstractC10175zX1 abstractC10175zX1) {
        this.C = c2758Xj2;
        this.B = Collections.singletonList(abstractC10175zX1);
    }

    public final void A(Class cls, String str, Object... objArr) {
        this.C.a(this.B, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.daaw.U62
    public final void P(zze zzeVar) {
        A(U62.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void a(Context context) {
        A(InterfaceC7552q72.class, "onResume", context);
    }

    @Override // com.daaw.ZH2
    public final void d(SH2 sh2, String str) {
        A(RH2.class, "onTaskStarted", str);
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void e(Context context) {
        A(InterfaceC7552q72.class, "onDestroy", context);
    }

    @Override // com.daaw.ZH2
    public final void l(SH2 sh2, String str) {
        A(RH2.class, "onTaskCreated", str);
    }

    @Override // com.daaw.ZH2
    public final void m(SH2 sh2, String str) {
        A(RH2.class, "onTaskSucceeded", str);
    }

    @Override // com.daaw.InterfaceC7552q72
    public final void o(Context context) {
        A(InterfaceC7552q72.class, "onPause", context);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        A(zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        A(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.daaw.ZH2
    public final void r(SH2 sh2, String str, Throwable th) {
        A(RH2.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.daaw.R62
    public final void t(VP1 vp1, String str, String str2) {
        A(R62.class, "onRewarded", vp1, str, str2);
    }

    @Override // com.daaw.S82
    public final void v0(zzbvg zzbvgVar) {
        this.D = zzt.zzB().b();
        A(S82.class, "onAdRequest", new Object[0]);
    }

    @Override // com.daaw.R62
    public final void zza() {
        A(R62.class, "onAdClosed", new Object[0]);
    }

    @Override // com.daaw.R62
    public final void zzb() {
        A(R62.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.daaw.R62
    public final void zzc() {
        A(R62.class, "onAdOpened", new Object[0]);
    }

    @Override // com.daaw.R62
    public final void zze() {
        A(R62.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.daaw.R62
    public final void zzf() {
        A(R62.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.daaw.InterfaceC7273p72
    public final void zzq() {
        A(InterfaceC7273p72.class, "onAdImpression", new Object[0]);
    }

    @Override // com.daaw.J72
    public final void zzr() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (zzt.zzB().b() - this.D));
        A(J72.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.daaw.S82
    public final void t0(C9267wF2 c9267wF2) {
    }
}
