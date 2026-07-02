package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RG1 implements NativeCustomTemplateAd {
    public final QG1 a;
    public final MediaView b;
    public final VideoController c = new VideoController();
    public NativeCustomTemplateAd.DisplayOpenMeasurement d;

    public RG1(QG1 qg1) {
        Context context;
        this.a = qg1;
        MediaView mediaView = null;
        try {
            context = (Context) BinderC7744qp0.I(qg1.zzh());
        } catch (RemoteException | NullPointerException e) {
            AbstractC4274eT1.zzh("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.a.z(BinderC7744qp0.Z2(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                AbstractC4274eT1.zzh("", e2);
            }
        }
        this.b = mediaView;
    }

    public final QG1 a() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.a.zzl();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List getAvailableAssetNames() {
        try {
            return this.a.zzk();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.a.zzi();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.d == null && this.a.zzq()) {
                this.d = new C6474mG1(this.a);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
        return this.d;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeAd.Image getImage(String str) {
        try {
            InterfaceC8147sG1 interfaceC8147sG1T = this.a.t(str);
            if (interfaceC8147sG1T != null) {
                return new C8426tG1(interfaceC8147sG1T);
            }
            return null;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String str) {
        try {
            return this.a.u2(str);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            zzdq zzdqVarZze = this.a.zze();
            if (zzdqVarZze != null) {
                this.c.zzb(zzdqVarZze);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Exception occurred while getting video controller", e);
        }
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.a.zzn(str);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }
}
