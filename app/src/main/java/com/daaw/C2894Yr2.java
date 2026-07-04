package com.daaw;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.Yr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2894Yr2 implements InterfaceC6244lS2 {
    public final /* synthetic */ C2998Zr2 a;

    public C2894Yr2(C2998Zr2 c2998Zr2) {
        this.a = c2998Zr2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* synthetic */ void a(Object obj) {
        ((V22) obj).b();
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        zze zzeVarA = this.a.a.d().a(th);
        this.a.d.P(zzeVarA);
        AbstractC4223eG2.b(zzeVarA.zza, th, "DelayedBannerAd.onFailure");
    }
}
