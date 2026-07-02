package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import com.daaw.QG1;

/* JADX INFO: loaded from: classes.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    Drawable getMainImage();

    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(Drawable drawable);

    QG1 zza();

    boolean zzb();
}
