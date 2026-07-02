package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6048km2;
import com.daaw.C4815gM2;
import com.daaw.C7064oO1;
import com.daaw.EM2;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfr implements zzbx {
    public static final Parcelable.Creator<zzfr> CREATOR = new C4815gM2();
    public final float B;
    public final float C;

    public zzfr(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        AbstractC6048km2.e(z, "Invalid latitude or longitude");
        this.B = f;
        this.C = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfr.class == obj.getClass()) {
            zzfr zzfrVar = (zzfr) obj;
            if (this.B == zzfrVar.B && this.C == zzfrVar.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.B).hashCode() + 527) * 31) + Float.valueOf(this.C).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.B + ", longitude=" + this.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.B);
        parcel.writeFloat(this.C);
    }

    public /* synthetic */ zzfr(Parcel parcel, EM2 em2) {
        this.B = parcel.readFloat();
        this.C = parcel.readFloat();
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void q(C7064oO1 c7064oO1) {
    }
}
