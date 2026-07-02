package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC7344pO2;
import com.daaw.C7064oO1;
import com.daaw.LN2;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfu implements zzbx {
    public static final Parcelable.Creator<zzfu> CREATOR = new LN2();
    public final long B;
    public final long C;
    public final long D;

    public zzfu(long j, long j2, long j3) {
        this.B = j;
        this.C = j2;
        this.D = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfu)) {
            return false;
        }
        zzfu zzfuVar = (zzfu) obj;
        return this.B == zzfuVar.B && this.C == zzfuVar.C && this.D == zzfuVar.D;
    }

    public final int hashCode() {
        long j = this.D;
        long j2 = this.B;
        int i = ((int) (j2 ^ (j2 >>> 32))) + 527;
        long j3 = j ^ (j >>> 32);
        long j4 = this.C;
        return (((i * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) j3);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.B + ", modification time=" + this.C + ", timescale=" + this.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.B);
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
    }

    public /* synthetic */ zzfu(Parcel parcel, AbstractC7344pO2 abstractC7344pO2) {
        this.B = parcel.readLong();
        this.C = parcel.readLong();
        this.D = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void q(C7064oO1 c7064oO1) {
    }
}
