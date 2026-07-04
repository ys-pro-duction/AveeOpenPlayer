package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.daaw.AbstractC4274eT1;
import com.daaw.BinderC7744qp0;
import com.daaw.QG1;
import com.google.android.gms.ads.MediaContent;

/* JADX INFO: loaded from: classes.dex */
public class MediaView extends FrameLayout {
    public MediaContent B;
    public boolean C;
    public ImageView.ScaleType D;
    public boolean E;
    public zzb F;
    public zzc G;

    public MediaView(Context context) {
        super(context);
    }

    public final synchronized void a(zzb zzbVar) {
        this.F = zzbVar;
        if (this.C) {
            zzbVar.zza.b(this.B);
        }
    }

    public final synchronized void b(zzc zzcVar) {
        this.G = zzcVar;
        if (this.E) {
            zzcVar.zza.c(this.D);
        }
    }

    public MediaContent getMediaContent() {
        return this.B;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.E = true;
        this.D = scaleType;
        zzc zzcVar = this.G;
        if (zzcVar != null) {
            zzcVar.zza.c(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        boolean zS;
        this.C = true;
        this.B = mediaContent;
        zzb zzbVar = this.F;
        if (zzbVar != null) {
            zzbVar.zza.b(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            QG1 qg1Zza = mediaContent.zza();
            if (qg1Zza != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zzb()) {
                        zS = qg1Zza.s(BinderC7744qp0.Z2(this));
                    }
                    removeAllViews();
                }
                zS = qg1Zza.z(BinderC7744qp0.Z2(this));
                if (zS) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            AbstractC4274eT1.zzh("", e);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
