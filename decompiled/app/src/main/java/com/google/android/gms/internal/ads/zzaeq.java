package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6048km2;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C0565Cp1;
import com.daaw.C7064oO1;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaeq implements zzbx {
    public static final Parcelable.Creator<zzaeq> CREATOR = new C0565Cp1();
    public final int B;
    public final String C;
    public final String D;
    public final String E;
    public final boolean F;
    public final int G;

    public zzaeq(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        AbstractC6048km2.d(z2);
        this.B = i;
        this.C = str;
        this.D = str2;
        this.E = str3;
        this.F = z;
        this.G = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeq.class == obj.getClass()) {
            zzaeq zzaeqVar = (zzaeq) obj;
            if (this.B == zzaeqVar.B && AbstractC9004vJ2.e(this.C, zzaeqVar.C) && AbstractC9004vJ2.e(this.D, zzaeqVar.D) && AbstractC9004vJ2.e(this.E, zzaeqVar.E) && this.F == zzaeqVar.F && this.G == zzaeqVar.G) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.C;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.B;
        String str2 = this.D;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((i + 527) * 31) + iHashCode;
        String str3 = this.E;
        return (((((((i2 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.F ? 1 : 0)) * 31) + this.G;
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final void q(C7064oO1 c7064oO1) {
        String str = this.D;
        if (str != null) {
            c7064oO1.H(str);
        }
        String str2 = this.C;
        if (str2 != null) {
            c7064oO1.A(str2);
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.D + "\", genre=\"" + this.C + "\", bitrate=" + this.B + ", metadataInterval=" + this.G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        int i2 = AbstractC9004vJ2.a;
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G);
    }

    public zzaeq(Parcel parcel) {
        this.B = parcel.readInt();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.F = parcel.readInt() != 0;
        this.G = parcel.readInt();
    }
}
