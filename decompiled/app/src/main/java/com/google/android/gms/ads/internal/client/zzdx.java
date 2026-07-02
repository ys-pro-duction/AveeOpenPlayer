package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.daaw.XS1;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzdx {
    public final Date a;
    public final String b;
    public final List c;
    public final int d;
    public final Set e;
    public final Bundle f;
    public final Map g;
    public final String h;
    public final String i;
    public final SearchAdRequest j;
    public final int k;
    public final Set l;
    public final Bundle m;
    public final Set n;
    public final boolean o;
    public final String p;
    public final int q;

    public zzdx(zzdw zzdwVar, SearchAdRequest searchAdRequest) {
        this.a = zzdwVar.g;
        this.b = zzdwVar.h;
        this.c = zzdwVar.i;
        this.d = zzdwVar.j;
        this.e = DesugarCollections.unmodifiableSet(zzdwVar.a);
        this.f = zzdwVar.b;
        this.g = DesugarCollections.unmodifiableMap(zzdwVar.c);
        this.h = zzdwVar.k;
        this.i = zzdwVar.l;
        this.j = searchAdRequest;
        this.k = zzdwVar.m;
        this.l = DesugarCollections.unmodifiableSet(zzdwVar.d);
        this.m = zzdwVar.e;
        this.n = DesugarCollections.unmodifiableSet(zzdwVar.f);
        this.o = zzdwVar.n;
        this.p = zzdwVar.o;
        this.q = zzdwVar.p;
    }

    @Deprecated
    public final int zza() {
        return this.d;
    }

    public final int zzb() {
        return this.q;
    }

    public final int zzc() {
        return this.k;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.f.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.m;
    }

    public final Bundle zzf(Class cls) {
        return this.f.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.f;
    }

    @Deprecated
    public final NetworkExtras zzh(Class cls) {
        return (NetworkExtras) this.g.get(cls);
    }

    public final SearchAdRequest zzi() {
        return this.j;
    }

    public final String zzj() {
        return this.p;
    }

    public final String zzk() {
        return this.b;
    }

    public final String zzl() {
        return this.h;
    }

    public final String zzm() {
        return this.i;
    }

    @Deprecated
    public final Date zzn() {
        return this.a;
    }

    public final List zzo() {
        return new ArrayList(this.c);
    }

    public final Set zzp() {
        return this.n;
    }

    public final Set zzq() {
        return this.e;
    }

    @Deprecated
    public final boolean zzr() {
        return this.o;
    }

    public final boolean zzs(Context context) {
        RequestConfiguration requestConfigurationZzc = zzej.zzf().zzc();
        zzay.zzb();
        Set set = this.l;
        String strC = XS1.C(context);
        return set.contains(strC) || requestConfigurationZzc.getTestDeviceIds().contains(strC);
    }
}
