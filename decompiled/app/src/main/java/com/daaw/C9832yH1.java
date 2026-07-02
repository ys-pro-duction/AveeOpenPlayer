package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9832yH1 extends UnifiedNativeAd {
    public final InterfaceC9553xH1 a;
    public final C8426tG1 c;
    public final NativeAd.AdChoicesInfo e;
    public final List b = new ArrayList();
    public final VideoController d = new VideoController();
    public final List f = new ArrayList();

    public C9832yH1(InterfaceC9553xH1 interfaceC9553xH1) {
        InterfaceC8147sG1 interfaceC8147sG1Zzk;
        InterfaceC8147sG1 c7590qG1;
        IBinder iBinder;
        this.a = interfaceC9553xH1;
        C6195lG1 c6195lG1 = null;
        try {
            List listZzu = interfaceC9553xH1.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        c7590qG1 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        c7590qG1 = iInterfaceQueryLocalInterface instanceof InterfaceC8147sG1 ? (InterfaceC8147sG1) iInterfaceQueryLocalInterface : new C7590qG1(iBinder);
                    }
                    if (c7590qG1 != null) {
                        this.b.add(new C8426tG1(c7590qG1));
                    }
                }
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
        try {
            List listZzv = this.a.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    zzcw zzcwVarZzb = obj2 instanceof IBinder ? zzcv.zzb((IBinder) obj2) : null;
                    if (zzcwVarZzb != null) {
                        this.f.add(new zzcx(zzcwVarZzb));
                    }
                }
            }
        } catch (RemoteException e2) {
            AbstractC4274eT1.zzh("", e2);
        }
        try {
            interfaceC8147sG1Zzk = this.a.zzk();
        } catch (RemoteException e3) {
            AbstractC4274eT1.zzh("", e3);
        }
        C8426tG1 c8426tG1 = interfaceC8147sG1Zzk != null ? new C8426tG1(interfaceC8147sG1Zzk) : null;
        this.c = c8426tG1;
        try {
            if (this.a.zzi() != null) {
                c6195lG1 = new C6195lG1(this.a.zzi());
            }
        } catch (RemoteException e4) {
            AbstractC4274eT1.zzh("", e4);
        }
        this.e = c6195lG1;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.d();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.a.zzx();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.D();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.a.zzn();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.a.zzo();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.a.zzp();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle bundleZzf = this.a.zzf();
            if (bundleZzf != null) {
                return bundleZzf;
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.a.zzq();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.a.zzj() != null) {
                return new zzep(this.a.zzj(), null);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.a.zzr();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List getMuteThisAdReasons() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.a.zzs();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVarZzg;
        try {
            zzdnVarZzg = this.a.zzg();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            zzdnVarZzg = null;
        }
        return ResponseInfo.zza(zzdnVarZzg);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double dZze = this.a.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.a.zzt();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.a.zzh() != null) {
                this.d.zzb(this.a.zzh());
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Exception occurred while getting video controller", e);
        }
        return this.d;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.zzH();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.a.zzH()) {
                    if (muteThisAdReason == null) {
                        this.a.q0(null);
                        return;
                    } else if (muteThisAdReason instanceof zzcx) {
                        this.a.q0(((zzcx) muteThisAdReason).zza());
                        return;
                    } else {
                        AbstractC4274eT1.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("", e);
            }
            AbstractC4274eT1.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e2) {
            AbstractC4274eT1.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.a.S2(bundle);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.zzA();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.R1(bundle);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.T0(bundle);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.A1(new zzct(muteThisAdListener));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.a.E0(new zzfe(onPaidEventListener));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.x2(new JH1(unconfirmedClickListener));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zza() {
        try {
            InterfaceC7934rX interfaceC7934rXZzl = this.a.zzl();
            if (interfaceC7934rXZzl != null) {
                return BinderC7744qp0.I(interfaceC7934rXZzl);
            }
            return null;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }
}
