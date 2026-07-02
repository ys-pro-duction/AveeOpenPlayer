package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC3825cq1;
import com.daaw.C3547bq1;
import com.daaw.C7064oO1;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafx implements zzbx {
    public static final Parcelable.Creator<zzafx> CREATOR = new C3547bq1();
    public final float B;
    public final int C;

    public zzafx(float f, int i) {
        this.B = f;
        this.C = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafx.class == obj.getClass()) {
            zzafx zzafxVar = (zzafx) obj;
            if (this.B == zzafxVar.B && this.C == zzafxVar.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.B).hashCode() + 527) * 31) + this.C;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.B + ", svcTemporalLayerCount=" + this.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.B);
        parcel.writeInt(this.C);
    }

    public /* synthetic */ zzafx(Parcel parcel, AbstractC3825cq1 abstractC3825cq1) {
        this.B = parcel.readFloat();
        this.C = parcel.readInt();
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void q(C7064oO1 c7064oO1) {
    }
}
