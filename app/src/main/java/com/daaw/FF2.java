package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbls;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FF2 {
    public final zzfl a;
    public final zzbls b;
    public final C8611tv2 c;
    public final zzl d;
    public final zzq e;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;
    public final zzbfc i;
    public final zzw j;
    public final int k;
    public final AdManagerAdViewOptions l;
    public final PublisherAdViewOptions m;
    public final zzcb n;
    public final C8144sF2 o;
    public final boolean p;
    public final boolean q;
    public final zzcf r;

    public /* synthetic */ FF2(DF2 df2, EF2 ef2) {
        this.e = df2.b;
        this.f = df2.c;
        this.r = df2.s;
        int i = df2.a.zza;
        long j = df2.a.zzb;
        Bundle bundle = df2.a.zzc;
        int i2 = df2.a.zzd;
        List list = df2.a.zze;
        boolean z = df2.a.zzf;
        int i3 = df2.a.zzg;
        boolean z2 = true;
        if (!df2.a.zzh && !df2.e) {
            z2 = false;
        }
        this.d = new zzl(i, j, bundle, i2, list, z, i3, z2, df2.a.zzi, df2.a.zzj, df2.a.zzk, df2.a.zzl, df2.a.zzm, df2.a.zzn, df2.a.zzo, df2.a.zzp, df2.a.zzq, df2.a.zzr, df2.a.zzs, df2.a.zzt, df2.a.zzu, df2.a.zzv, zzt.zza(df2.a.zzw), df2.a.zzx, df2.a.zzy);
        this.a = df2.d != null ? df2.d : df2.h != null ? df2.h.G : null;
        this.g = df2.f;
        this.h = df2.g;
        this.i = df2.f == null ? null : df2.h == null ? new zzbfc(new NativeAdOptions.Builder().build()) : df2.h;
        this.j = df2.i;
        this.k = df2.m;
        this.l = df2.j;
        this.m = df2.k;
        this.n = df2.l;
        this.b = df2.n;
        this.o = new C8144sF2(df2.o, null);
        this.p = df2.p;
        this.c = df2.q;
        this.q = df2.r;
    }

    public final InterfaceC7872rH1 a() {
        PublisherAdViewOptions publisherAdViewOptions = this.m;
        if (publisherAdViewOptions == null && this.l == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.l.zza();
    }

    public final boolean b() {
        return this.f.matches((String) zzba.zzc().b(AbstractC9820yE1.T2));
    }
}
