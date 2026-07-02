package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C8850un1;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzac implements Parcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C8850un1();
    public int B;
    public final UUID C;
    public final String D;
    public final String E;
    public final byte[] F;

    public zzac(Parcel parcel) {
        this.C = new UUID(parcel.readLong(), parcel.readLong());
        this.D = parcel.readString();
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.E = string;
        this.F = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzac)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzac zzacVar = (zzac) obj;
        return AbstractC9004vJ2.e(this.D, zzacVar.D) && AbstractC9004vJ2.e(this.E, zzacVar.E) && AbstractC9004vJ2.e(this.C, zzacVar.C) && Arrays.equals(this.F, zzacVar.F);
    }

    public final int hashCode() {
        int i = this.B;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.C.hashCode() * 31;
        String str = this.D;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.E.hashCode()) * 31) + Arrays.hashCode(this.F);
        this.B = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.C.getMostSignificantBits());
        parcel.writeLong(this.C.getLeastSignificantBits());
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeByteArray(this.F);
    }

    public zzac(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.C = uuid;
        this.D = null;
        this.E = str2;
        this.F = bArr;
    }
}
