package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C2885Yp1;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafr extends zzafh {
    public static final Parcelable.Creator<zzafr> CREATOR = new C2885Yp1();
    public final String C;
    public final String D;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzafr(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        super(string);
        this.C = parcel.readString();
        this.D = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafr.class == obj.getClass()) {
            zzafr zzafrVar = (zzafr) obj;
            if (this.B.equals(zzafrVar.B) && AbstractC9004vJ2.e(this.C, zzafrVar.C) && AbstractC9004vJ2.e(this.D, zzafrVar.D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.B.hashCode() + 527;
        String str = this.C;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i = iHashCode * 31;
        String str2 = this.D;
        return ((i + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final String toString() {
        return this.B + ": url=" + this.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
    }

    public zzafr(String str, String str2, String str3) {
        super(str);
        this.C = str2;
        this.D = str3;
    }
}
