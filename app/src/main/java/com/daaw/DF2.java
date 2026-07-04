package com.daaw;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbls;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class DF2 {
    public zzl a;
    public zzq b;
    public String c;
    public zzfl d;
    public boolean e;
    public ArrayList f;
    public ArrayList g;
    public zzbfc h;
    public zzw i;
    public AdManagerAdViewOptions j;
    public PublisherAdViewOptions k;
    public zzcb l;
    public zzbls n;
    public C8611tv2 q;
    public zzcf s;
    public int m = 1;
    public final C6471mF2 o = new C6471mF2();
    public boolean p = false;
    public boolean r = false;

    public final C6471mF2 F() {
        return this.o;
    }

    public final DF2 G(FF2 ff2) {
        this.o.a(ff2.o.a);
        this.a = ff2.d;
        this.b = ff2.e;
        this.s = ff2.r;
        this.c = ff2.f;
        this.d = ff2.a;
        this.f = ff2.g;
        this.g = ff2.h;
        this.h = ff2.i;
        this.i = ff2.j;
        H(ff2.l);
        d(ff2.m);
        this.p = ff2.p;
        this.q = ff2.c;
        this.r = ff2.q;
        return this;
    }

    public final DF2 H(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final DF2 I(zzq zzqVar) {
        this.b = zzqVar;
        return this;
    }

    public final DF2 J(String str) {
        this.c = str;
        return this;
    }

    public final DF2 K(zzw zzwVar) {
        this.i = zzwVar;
        return this;
    }

    public final DF2 L(C8611tv2 c8611tv2) {
        this.q = c8611tv2;
        return this;
    }

    public final DF2 M(zzbls zzblsVar) {
        this.n = zzblsVar;
        this.d = new zzfl(false, true, false);
        return this;
    }

    public final DF2 N(boolean z) {
        this.p = z;
        return this;
    }

    public final DF2 O(boolean z) {
        this.r = true;
        return this;
    }

    public final DF2 P(boolean z) {
        this.e = z;
        return this;
    }

    public final DF2 Q(int i) {
        this.m = i;
        return this;
    }

    public final DF2 a(zzbfc zzbfcVar) {
        this.h = zzbfcVar;
        return this;
    }

    public final DF2 b(ArrayList arrayList) {
        this.f = arrayList;
        return this;
    }

    public final DF2 c(ArrayList arrayList) {
        this.g = arrayList;
        return this;
    }

    public final DF2 d(PublisherAdViewOptions publisherAdViewOptions) {
        this.k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.e = publisherAdViewOptions.zzc();
            this.l = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final DF2 e(zzl zzlVar) {
        this.a = zzlVar;
        return this;
    }

    public final DF2 f(zzfl zzflVar) {
        this.d = zzflVar;
        return this;
    }

    public final FF2 g() {
        AbstractC7506py0.m(this.c, "ad unit must not be null");
        AbstractC7506py0.m(this.b, "ad size must not be null");
        AbstractC7506py0.m(this.a, "ad request must not be null");
        return new FF2(this, null);
    }

    public final String i() {
        return this.c;
    }

    public final boolean o() {
        return this.p;
    }

    public final DF2 q(zzcf zzcfVar) {
        this.s = zzcfVar;
        return this;
    }

    public final zzl v() {
        return this.a;
    }

    public final zzq x() {
        return this.b;
    }
}
