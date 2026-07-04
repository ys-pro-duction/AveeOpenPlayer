package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.AbstractC10175zX1;
import com.daaw.AbstractC9820yE1;
import com.daaw.BinderC2282Su2;
import com.daaw.BinderC7744qp0;
import com.daaw.CG1;
import com.daaw.InterfaceC3156aS1;
import com.daaw.InterfaceC3697cO1;
import com.daaw.InterfaceC3937dE2;
import com.daaw.InterfaceC5660jO1;
import com.daaw.InterfaceC7880rJ1;
import com.daaw.InterfaceC7934rX;
import com.daaw.InterfaceC8187sQ1;
import com.daaw.InterfaceC8717uJ1;
import com.daaw.InterfaceC8836uk2;
import com.daaw.InterfaceC9270wG1;
import com.daaw.SL1;
import com.daaw.ViewTreeObserverOnGlobalLayoutListenerC1882Pe2;
import com.daaw.ViewTreeObserverOnGlobalLayoutListenerC2112Re2;
import com.daaw.WC2;
import com.daaw.XB2;
import com.daaw.YE2;
import com.daaw.YP1;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends zzcd {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(InterfaceC7934rX interfaceC7934rX, String str, SL1 sl1, int i) {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        return new BinderC2282Su2(AbstractC10175zX1.g(context, sl1, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, String str, SL1 sl1, int i) {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        XB2 xb2W = AbstractC10175zX1.g(context, sl1, i).w();
        xb2W.zza(str);
        xb2W.a(context);
        return i >= ((Integer) zzba.zzc().b(AbstractC9820yE1.e5)).intValue() ? xb2W.zzc().zza() : new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, String str, SL1 sl1, int i) {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        WC2 wc2X = AbstractC10175zX1.g(context, sl1, i).x();
        wc2X.b(context);
        wc2X.a(zzqVar);
        wc2X.zzb(str);
        return wc2X.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, String str, SL1 sl1, int i) {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        InterfaceC3937dE2 interfaceC3937dE2Y = AbstractC10175zX1.g(context, sl1, i).y();
        interfaceC3937dE2Y.b(context);
        interfaceC3937dE2Y.a(zzqVar);
        interfaceC3937dE2Y.zzb(str);
        return interfaceC3937dE2Y.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, String str, int i) {
        return new zzs((Context) BinderC7744qp0.I(interfaceC7934rX), zzqVar, str, new zzcaz(233702000, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(InterfaceC7934rX interfaceC7934rX, int i) {
        return AbstractC10175zX1.g((Context) BinderC7744qp0.I(interfaceC7934rX), null, i).h();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i) {
        return AbstractC10175zX1.g((Context) BinderC7744qp0.I(interfaceC7934rX), sl1, i).q();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC9270wG1 zzi(InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2) {
        return new ViewTreeObserverOnGlobalLayoutListenerC2112Re2((FrameLayout) BinderC7744qp0.I(interfaceC7934rX), (FrameLayout) BinderC7744qp0.I(interfaceC7934rX2), 233702000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final CG1 zzj(InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2, InterfaceC7934rX interfaceC7934rX3) {
        return new ViewTreeObserverOnGlobalLayoutListenerC1882Pe2((View) BinderC7744qp0.I(interfaceC7934rX), (HashMap) BinderC7744qp0.I(interfaceC7934rX2), (HashMap) BinderC7744qp0.I(interfaceC7934rX3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC8717uJ1 zzk(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i, InterfaceC7880rJ1 interfaceC7880rJ1) {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        InterfaceC8836uk2 interfaceC8836uk2O = AbstractC10175zX1.g(context, sl1, i).o();
        interfaceC8836uk2O.a(context);
        interfaceC8836uk2O.b(interfaceC7880rJ1);
        return interfaceC8836uk2O.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC3697cO1 zzl(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i) {
        return AbstractC10175zX1.g((Context) BinderC7744qp0.I(interfaceC7934rX), sl1, i).r();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC5660jO1 zzm(InterfaceC7934rX interfaceC7934rX) {
        Activity activity = (Activity) BinderC7744qp0.I(interfaceC7934rX);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new com.google.android.gms.ads.internal.overlay.zzt(activity) : new zzac(activity) : new zzy(activity, adOverlayInfoParcelZza) : new zzaf(activity) : new zzae(activity) : new com.google.android.gms.ads.internal.overlay.zzs(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final YP1 zzn(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i) {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        YE2 ye2Z = AbstractC10175zX1.g(context, sl1, i).z();
        ye2Z.a(context);
        return ye2Z.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC8187sQ1 zzo(InterfaceC7934rX interfaceC7934rX, String str, SL1 sl1, int i) {
        Context context = (Context) BinderC7744qp0.I(interfaceC7934rX);
        YE2 ye2Z = AbstractC10175zX1.g(context, sl1, i).z();
        ye2Z.a(context);
        ye2Z.zza(str);
        return ye2Z.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final InterfaceC3156aS1 zzp(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i) {
        return AbstractC10175zX1.g((Context) BinderC7744qp0.I(interfaceC7934rX), sl1, i).u();
    }
}
