package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC5903kF1;
import com.daaw.AbstractC7506py0;
import com.daaw.AbstractC9322wT1;
import com.daaw.AsyncTaskC5770jm3;
import com.daaw.BO1;
import com.daaw.BinderC7744qp0;
import com.daaw.C7782qx1;
import com.daaw.C8060rx1;
import com.daaw.C8817ug3;
import com.daaw.C9975yn3;
import com.daaw.CallableC9113vi3;
import com.daaw.EA1;
import com.daaw.InterfaceC3383bF1;
import com.daaw.InterfaceC5109hQ1;
import com.daaw.InterfaceC7934rX;
import com.daaw.InterfaceC9860yO1;
import com.daaw.ViewOnTouchListenerC8543th3;
import com.daaw.XS1;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends zzbt {
    public final zzcaz B;
    public final zzq C;
    public final Future D = AbstractC9322wT1.a.S0(new CallableC9113vi3(this));
    public final Context E;
    public final C9975yn3 F;
    public WebView G;
    public zzbh H;
    public C7782qx1 I;
    public AsyncTask J;

    public zzs(Context context, zzq zzqVar, String str, zzcaz zzcazVar) {
        this.E = context;
        this.B = zzcazVar;
        this.C = zzqVar;
        this.G = new WebView(context);
        this.F = new C9975yn3(context, str);
        Z2(0);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.getSettings().setJavaScriptEnabled(true);
        this.G.setWebViewClient(new C8817ug3(this));
        this.G.setOnTouchListener(new ViewOnTouchListenerC8543th3(this));
    }

    public static /* bridge */ /* synthetic */ String f3(zzs zzsVar, String str) {
        if (zzsVar.I == null) {
            return str;
        }
        Uri uriA = Uri.parse(str);
        try {
            uriA = zzsVar.I.a(uriA, zzsVar.E, null, null);
        } catch (C8060rx1 e) {
            AbstractC4274eT1.zzk("Unable to process ad data", e);
        }
        return uriA.toString();
    }

    public static /* bridge */ /* synthetic */ void i3(zzs zzsVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzsVar.E.startActivity(intent);
    }

    public final void Z2(int i) {
        if (this.G == null) {
            return;
        }
        this.G.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        AbstractC7506py0.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        this.H = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(EA1 ea1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(InterfaceC9860yO1 interfaceC9860yO1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(InterfaceC3383bF1 interfaceC3383bF1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(BO1 bo1, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(InterfaceC5109hQ1 interfaceC5109hQ1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzflVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        AbstractC7506py0.m(this.G, "This Search Ad has already been torn down");
        this.F.f(zzlVar, this.B);
        this.J = new AsyncTaskC5770jm3(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcfVar) {
        throw new IllegalStateException("Unused method");
    }

    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzay.zzb();
            return XS1.B(this.E, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        return this.C;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final InterfaceC7934rX zzn() {
        AbstractC7506py0.e("getAdFrame must be called on the main UI thread.");
        return BinderC7744qp0.Z2(this.G);
    }

    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) AbstractC5903kF1.d.e());
        builder.appendQueryParameter("query", this.F.d());
        builder.appendQueryParameter("pubId", this.F.c());
        builder.appendQueryParameter("mappver", this.F.a());
        Map mapE = this.F.e();
        for (String str : mapE.keySet()) {
            builder.appendQueryParameter(str, (String) mapE.get(str));
        }
        Uri uriBuild = builder.build();
        C7782qx1 c7782qx1 = this.I;
        if (c7782qx1 != null) {
            try {
                uriBuild = c7782qx1.b(uriBuild, this.E);
            } catch (C8060rx1 e) {
                AbstractC4274eT1.zzk("Unable to process ad data", e);
            }
        }
        return zzq() + "#" + uriBuild.getEncodedQuery();
    }

    public final String zzq() {
        String strB = this.F.b();
        if (true == TextUtils.isEmpty(strB)) {
            strB = "www.google.com";
        }
        return "https://" + strB + ((String) AbstractC5903kF1.d.e());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        AbstractC7506py0.e("destroy must be called on the main UI thread.");
        this.J.cancel(true);
        this.D.cancel(true);
        this.G.destroy();
        this.G = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        AbstractC7506py0.e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(InterfaceC7934rX interfaceC7934rX) {
    }
}
