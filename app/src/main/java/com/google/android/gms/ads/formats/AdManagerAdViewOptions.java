package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractBinderC7594qH1;
import com.daaw.InterfaceC7872rH1;
import com.daaw.JM0;
import com.google.android.gms.ads.internal.client.zzfj;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    public final boolean B;
    public final IBinder C;

    public static final class Builder {
        public boolean a = false;
        public ShouldDelayBannerRenderingListener b;

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        public Builder setManualImpressionsEnabled(boolean z) {
            this.a = z;
            return this;
        }

        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.b = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzbVar) {
        this.B = builder.a;
        this.C = builder.b != null ? new zzfj(builder.b) : null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.c(parcel, 1, getManualImpressionsEnabled());
        JM0.j(parcel, 2, this.C, false);
        JM0.b(parcel, iA);
    }

    public final InterfaceC7872rH1 zza() {
        IBinder iBinder = this.C;
        if (iBinder == null) {
            return null;
        }
        return AbstractBinderC7594qH1.zzc(iBinder);
    }

    public AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.B = z;
        this.C = iBinder;
    }
}
