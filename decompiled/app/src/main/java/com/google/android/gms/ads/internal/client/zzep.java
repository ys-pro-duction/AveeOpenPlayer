package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.daaw.AbstractC4274eT1;
import com.daaw.BinderC7744qp0;
import com.daaw.InterfaceC7311pG1;
import com.daaw.InterfaceC7934rX;
import com.daaw.QG1;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: loaded from: classes.dex */
public final class zzep implements MediaContent {
    public final InterfaceC7311pG1 a;
    public final VideoController b = new VideoController();
    public final QG1 c;

    public zzep(InterfaceC7311pG1 interfaceC7311pG1, QG1 qg1) {
        this.a = interfaceC7311pG1;
        this.c = qg1;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.a.zze();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.a.zzf();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.a.zzg();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            InterfaceC7934rX interfaceC7934rXZzi = this.a.zzi();
            if (interfaceC7934rXZzi != null) {
                return (Drawable) BinderC7744qp0.I(interfaceC7934rXZzi);
            }
            return null;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if (this.a.zzh() != null) {
                this.b.zzb(this.a.zzh());
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Exception occurred while getting video controller", e);
        }
        return this.b;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.a.zzl();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.a.zzj(BinderC7744qp0.Z2(drawable));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final QG1 zza() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.a.zzk();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return false;
        }
    }

    public final InterfaceC7311pG1 zzc() {
        return this.a;
    }
}
