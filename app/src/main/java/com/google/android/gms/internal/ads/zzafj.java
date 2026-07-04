package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C2469Up1;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafj extends zzafh {
    public static final Parcelable.Creator<zzafj> CREATOR = new C2469Up1();
    public final String C;
    public final String D;
    public final String E;

    public zzafj(Parcel parcel) {
        super("----");
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
        if (obj != null && zzafj.class == obj.getClass()) {
            zzafj zzafjVar = (zzafj) obj;
            if (AbstractC9004vJ2.e(this.D, zzafjVar.D) && AbstractC9004vJ2.e(this.C, zzafjVar.C) && AbstractC9004vJ2.e(this.E, zzafjVar.E)) {
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
        return this.B + ": domain=" + this.C + ", description=" + this.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.E);
    }

    public zzafj(String str, String str2, String str3) {
        super("----");
        this.C = str;
        this.D = str2;
        this.E = str3;
    }
}
