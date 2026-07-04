package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC3268aq1;
import com.daaw.C2989Zp1;
import com.daaw.C7064oO1;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafu implements zzbx {
    public static final Parcelable.Creator<zzafu> CREATOR = new C2989Zp1();
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;

    public zzafu(long j, long j2, long j3, long j4, long j5) {
        this.B = j;
        this.C = j2;
        this.D = j3;
        this.E = j4;
        this.F = j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafu.class == obj.getClass()) {
            zzafu zzafuVar = (zzafu) obj;
            if (this.B == zzafuVar.B && this.C == zzafuVar.C && this.D == zzafuVar.D && this.E == zzafuVar.E && this.F == zzafuVar.F) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.F;
        long j2 = this.B;
        int i = ((int) (j2 ^ (j2 >>> 32))) + 527;
        long j3 = j ^ (j >>> 32);
        long j4 = this.E;
        long j5 = j4 ^ (j4 >>> 32);
        long j6 = this.D;
        long j7 = j6 ^ (j6 >>> 32);
        long j8 = this.C;
        return (((((((i * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) j7)) * 31) + ((int) j5)) * 31) + ((int) j3);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.B + ", photoSize=" + this.C + ", photoPresentationTimestampUs=" + this.D + ", videoStartPosition=" + this.E + ", videoSize=" + this.F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.B);
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
    }

    public /* synthetic */ zzafu(Parcel parcel, AbstractC3268aq1 abstractC3268aq1) {
        this.B = parcel.readLong();
        this.C = parcel.readLong();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void q(C7064oO1 c7064oO1) {
    }
}
