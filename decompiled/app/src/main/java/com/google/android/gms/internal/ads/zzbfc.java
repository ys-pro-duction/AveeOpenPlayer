package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C5069hG1;
import com.daaw.JM0;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfc> CREATOR = new C5069hG1();
    public final int B;
    public final boolean C;
    public final int D;
    public final boolean E;
    public final int F;
    public final zzfl G;
    public final boolean H;
    public final int I;
    public final int J;
    public final boolean K;

    public zzbfc(int i, boolean z, int i2, boolean z2, int i3, zzfl zzflVar, boolean z3, int i4, int i5, boolean z4) {
        this.B = i;
        this.C = z;
        this.D = i2;
        this.E = z2;
        this.F = i3;
        this.G = zzflVar;
        this.H = z3;
        this.I = i4;
        this.K = z4;
        this.J = i5;
    }

    public static NativeAdOptions e(zzbfc zzbfcVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbfcVar == null) {
            return builder.build();
        }
        int i = zzbfcVar.B;
        if (i == 2) {
            builder.setAdChoicesPlacement(zzbfcVar.F);
        } else {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbfcVar.H);
                    builder.setMediaAspectRatio(zzbfcVar.I);
                    builder.enableCustomClickGestureDirection(zzbfcVar.J, zzbfcVar.K);
                }
            }
            zzfl zzflVar = zzbfcVar.G;
            if (zzflVar != null) {
                builder.setVideoOptions(new VideoOptions(zzflVar));
            }
            builder.setAdChoicesPlacement(zzbfcVar.F);
        }
        builder.setReturnUrlsForImageAssets(zzbfcVar.C);
        builder.setRequestMultipleImages(zzbfcVar.E);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.c(parcel, 2, this.C);
        JM0.k(parcel, 3, this.D);
        JM0.c(parcel, 4, this.E);
        JM0.k(parcel, 5, this.F);
        JM0.p(parcel, 6, this.G, i, false);
        JM0.c(parcel, 7, this.H);
        JM0.k(parcel, 8, this.I);
        JM0.k(parcel, 9, this.J);
        JM0.c(parcel, 10, this.K);
        JM0.b(parcel, iA);
    }

    public zzbfc(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false);
    }
}
