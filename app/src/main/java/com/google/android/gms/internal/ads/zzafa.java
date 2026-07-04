package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C1094Hp1;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafa extends zzafh {
    public static final Parcelable.Creator<zzafa> CREATOR = new C1094Hp1();
    public final String C;
    public final String D;
    public final String E;

    public zzafa(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.C = string;
        this.D = parcel.readString();
        this.E = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafa.class == obj.getClass()) {
            zzafa zzafaVar = (zzafa) obj;
            if (AbstractC9004vJ2.e(this.D, zzafaVar.D) && AbstractC9004vJ2.e(this.C, zzafaVar.C) && AbstractC9004vJ2.e(this.E, zzafaVar.E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.C;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.D;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = iHashCode + 527;
        String str3 = this.E;
        return (((i * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final String toString() {
        return this.B + ": language=" + this.C + ", description=" + this.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.E);
    }

    public zzafa(String str, String str2, String str3) {
        super("COMM");
        this.C = str;
        this.D = str2;
        this.E = str3;
    }
}
