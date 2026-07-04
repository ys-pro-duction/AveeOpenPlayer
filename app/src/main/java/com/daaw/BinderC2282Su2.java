package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbls;

/* JADX INFO: renamed from: com.daaw.Su2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2282Su2 extends zzbp {
    public final Context B;
    public final AbstractC10175zX1 C;
    public final DF2 D;
    public final C0314Ae2 E;
    public zzbh F;

    public BinderC2282Su2(AbstractC10175zX1 abstractC10175zX1, Context context, String str) {
        DF2 df2 = new DF2();
        this.D = df2;
        this.E = new C0314Ae2();
        this.C = abstractC10175zX1;
        df2.J(str);
        this.B = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        C0522Ce2 c0522Ce2G = this.E.g();
        this.D.b(c0522Ce2G.i());
        this.D.c(c0522Ce2G.h());
        DF2 df2 = this.D;
        if (df2.x() == null) {
            df2.I(zzq.zzc());
        }
        return new BinderC2386Tu2(this.B, this.C, this.D, c0522Ce2G, this.F);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(UG1 ug1) {
        this.E.a(ug1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(XG1 xg1) {
        this.E.b(xg1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, InterfaceC3948dH1 interfaceC3948dH1, InterfaceC3112aH1 interfaceC3112aH1) {
        this.E.c(str, interfaceC3948dH1, interfaceC3112aH1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(InterfaceC6769nK1 interfaceC6769nK1) {
        this.E.d(interfaceC6769nK1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(InterfaceC5073hH1 interfaceC5073hH1, zzq zzqVar) {
        this.E.e(interfaceC5073hH1);
        this.D.I(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(InterfaceC7036oH1 interfaceC7036oH1) {
        this.E.f(interfaceC7036oH1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) {
        this.F = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.D.H(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbls zzblsVar) {
        this.D.M(zzblsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbfc zzbfcVar) {
        this.D.a(zzbfcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.D.d(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) {
        this.D.q(zzcfVar);
    }
}
