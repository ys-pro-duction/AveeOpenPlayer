package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractBinderC7594qH1;
import com.daaw.InterfaceC7872rH1;
import com.daaw.JM0;
import com.google.android.gms.ads.internal.client.zzca;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
    public final boolean B;
    public final zzcb C;
    public final IBinder D;

    @Deprecated
    public static final class Builder {
        public ShouldDelayBannerRenderingListener a;

        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.a = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.B = z;
        this.C = iBinder != null ? zzca.zzd(iBinder) : null;
        this.D = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.c(parcel, 1, this.B);
        zzcb zzcbVar = this.C;
        JM0.j(parcel, 2, zzcbVar == null ? null : zzcbVar.asBinder(), false);
        JM0.j(parcel, 3, this.D, false);
        JM0.b(parcel, iA);
    }

    public final zzcb zza() {
        return this.C;
    }

    public final InterfaceC7872rH1 zzb() {
        IBinder iBinder = this.D;
        if (iBinder == null) {
            return null;
        }
        return AbstractBinderC7594qH1.zzc(iBinder);
    }

    public final boolean zzc() {
        return this.B;
    }
}
