package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class XN1 implements NativeCustomFormatAd {
    public final QG1 a;
    public NativeCustomFormatAd.DisplayOpenMeasurement b;

    public XN1(QG1 qg1) {
        this.a = qg1;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.a.zzl();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List getAvailableAssetNames() {
        try {
            return this.a.zzk();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.a.zzi();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.b == null && this.a.zzq()) {
                this.b = new PN1(this.a);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
        return this.b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeAd.Image getImage(String str) {
        try {
            InterfaceC8147sG1 interfaceC8147sG1T = this.a.t(str);
            if (interfaceC8147sG1T != null) {
                return new QN1(interfaceC8147sG1T);
            }
            return null;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaContent getMediaContent() {
        try {
            if (this.a.zzf() != null) {
                return new zzep(this.a.zzf(), this.a);
            }
            return null;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String str) {
        try {
            return this.a.u2(str);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.a.zzn(str);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }
}
