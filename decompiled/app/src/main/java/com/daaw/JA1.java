package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;

/* JADX INFO: loaded from: classes3.dex */
public final class JA1 {
    public zzbu a;
    public final Context b;
    public final String c;
    public final zzdx d;
    public final int e;
    public final AppOpenAd.AppOpenAdLoadCallback f;
    public final PL1 g = new PL1();
    public final zzp h = zzp.zza;

    public JA1(Context context, String str, zzdx zzdxVar, int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.b = context;
        this.c = str;
        this.d = zzdxVar;
        this.e = i;
        this.f = appOpenAdLoadCallback;
    }

    public final void a() {
        try {
            zzbu zzbuVarZzd = zzay.zza().zzd(this.b, zzq.zzb(), this.c, this.g);
            this.a = zzbuVarZzd;
            if (zzbuVarZzd != null) {
                if (this.e != 3) {
                    this.a.zzI(new zzw(this.e));
                }
                this.a.zzH(new BinderC9246wA1(this.f, this.c));
                this.a.zzaa(this.h.zza(this.b, this.d));
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }
}
