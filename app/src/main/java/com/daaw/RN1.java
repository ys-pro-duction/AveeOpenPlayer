package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RN1 extends NativeAd {
    public final InterfaceC9553xH1 a;
    public final QN1 c;
    public final NativeAd.AdChoicesInfo d;
    public final List b = new ArrayList();
    public final List e = new ArrayList();

    public RN1(InterfaceC9553xH1 interfaceC9553xH1) {
        InterfaceC8147sG1 interfaceC8147sG1Zzk;
        this.a = interfaceC9553xH1;
        ON1 on1 = null;
        try {
            List listZzu = interfaceC9553xH1.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    InterfaceC8147sG1 interfaceC8147sG1Z2 = obj instanceof IBinder ? AbstractBinderC7868rG1.Z2((IBinder) obj) : null;
                    if (interfaceC8147sG1Z2 != null) {
                        this.b.add(new QN1(interfaceC8147sG1Z2));
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
                        this.e.add(new zzcx(zzcwVarZzb));
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
        QN1 qn1 = interfaceC8147sG1Zzk != null ? new QN1(interfaceC8147sG1Zzk) : null;
        this.c = qn1;
        try {
            if (this.a.zzi() != null) {
                on1 = new ON1(this.a.zzi());
            }
        } catch (RemoteException e4) {
            AbstractC4274eT1.zzh("", e4);
        }
        this.d = on1;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Object a() {
        try {
            return this.a.zzm();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.d();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.a.zzx();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.D();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.a.zzn();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.a.zzo();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.a.zzp();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.a.zzq();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getImages() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getMuteThisAdReasons() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.a.zzs();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.a.zzt();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.a.j();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.zzH();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.a.S2(bundle);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.zzA();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.a.R1(bundle);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.T0(bundle);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.A1(new zzct(muteThisAdListener));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.a.E0(new zzfe(onPaidEventListener));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.x2(new ZN1(unconfirmedClickListener));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }
}
