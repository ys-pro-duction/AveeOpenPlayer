package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzm {
    public Bundle a = new Bundle();
    public List b = new ArrayList();
    public boolean c = false;
    public int d = -1;
    public final Bundle e = new Bundle();
    public final Bundle f = new Bundle();
    public final List g = new ArrayList();
    public int h = -1;
    public String i = null;
    public final List j = new ArrayList();
    public int k = 60000;
    public final int l = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();

    public final zzl zza() {
        Bundle bundle = this.e;
        Bundle bundle2 = this.a;
        Bundle bundle3 = this.f;
        return new zzl(8, -1L, bundle2, -1, this.b, this.c, this.d, false, null, null, null, null, bundle, bundle3, this.g, null, null, false, null, this.h, this.i, this.j, this.k, null, this.l);
    }

    public final zzm zzb(Bundle bundle) {
        this.a = bundle;
        return this;
    }

    public final zzm zzc(int i) {
        this.k = i;
        return this;
    }

    public final zzm zzd(boolean z) {
        this.c = z;
        return this;
    }

    public final zzm zze(List list) {
        this.b = list;
        return this;
    }

    public final zzm zzf(String str) {
        this.i = str;
        return this;
    }

    public final zzm zzg(int i) {
        this.d = i;
        return this;
    }

    public final zzm zzh(int i) {
        this.h = i;
        return this;
    }
}
