package com.daaw;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HM1 extends AbstractBinderC5931kM1 {
    public final UnifiedNativeAdMapper B;

    public HM1(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.B = unifiedNativeAdMapper;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final void Z1(InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2, InterfaceC7934rX interfaceC7934rX3) {
        HashMap map = (HashMap) BinderC7744qp0.I(interfaceC7934rX2);
        HashMap map2 = (HashMap) BinderC7744qp0.I(interfaceC7934rX3);
        this.B.trackViews((View) BinderC7744qp0.I(interfaceC7934rX), map, map2);
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final void j0(InterfaceC7934rX interfaceC7934rX) {
        this.B.untrackView((View) BinderC7744qp0.I(interfaceC7934rX));
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final void k2(InterfaceC7934rX interfaceC7934rX) {
        this.B.handleClick((View) BinderC7744qp0.I(interfaceC7934rX));
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final boolean zzA() {
        return this.B.getOverrideClickHandling();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final boolean zzB() {
        return this.B.getOverrideImpressionRecording();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final double zze() {
        if (this.B.getStarRating() != null) {
            return this.B.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final float zzf() {
        return this.B.getMediaContentAspectRatio();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final float zzg() {
        return this.B.getCurrentTime();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final float zzh() {
        return this.B.getDuration();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final Bundle zzi() {
        return this.B.getExtras();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final zzdq zzj() {
        if (this.B.zzb() != null) {
            return this.B.zzb().zza();
        }
        return null;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final InterfaceC5907kG1 zzk() {
        return null;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final InterfaceC8147sG1 zzl() {
        NativeAd.Image icon = this.B.getIcon();
        if (icon != null) {
            return new BinderC4501fG1(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final InterfaceC7934rX zzm() {
        View adChoicesContent = this.B.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return BinderC7744qp0.Z2(adChoicesContent);
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final InterfaceC7934rX zzn() {
        View viewZza = this.B.zza();
        if (viewZza == null) {
            return null;
        }
        return BinderC7744qp0.Z2(viewZza);
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final InterfaceC7934rX zzo() {
        Object objZzc = this.B.zzc();
        if (objZzc == null) {
            return null;
        }
        return BinderC7744qp0.Z2(objZzc);
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzp() {
        return this.B.getAdvertiser();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzq() {
        return this.B.getBody();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzr() {
        return this.B.getCallToAction();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzs() {
        return this.B.getHeadline();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzt() {
        return this.B.getPrice();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final String zzu() {
        return this.B.getStore();
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final List zzv() {
        List<NativeAd.Image> images = this.B.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new BinderC4501fG1(image.getDrawable(), image.getUri(), image.getScale(), image.zzb(), image.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC6219lM1
    public final void zzx() {
        this.B.recordImpression();
    }
}
