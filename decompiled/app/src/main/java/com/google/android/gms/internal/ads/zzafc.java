package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C1925Pp1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafc extends zzafh {
    public static final Parcelable.Creator<zzafc> CREATOR = new C1925Pp1();
    public final String C;
    public final String D;
    public final String E;
    public final byte[] F;

    public zzafc(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.C = string;
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafc.class == obj.getClass()) {
            zzafc zzafcVar = (zzafc) obj;
            if (AbstractC9004vJ2.e(this.C, zzafcVar.C) && AbstractC9004vJ2.e(this.D, zzafcVar.D) && AbstractC9004vJ2.e(this.E, zzafcVar.E) && Arrays.equals(this.F, zzafcVar.F)) {
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
        return (((((i * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.F);
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final String toString() {
        return this.B + ": mimeType=" + this.C + ", filename=" + this.D + ", description=" + this.E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeByteArray(this.F);
    }

    public zzafc(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.C = str;
        this.D = str2;
        this.E = str3;
        this.F = bArr;
    }
}
