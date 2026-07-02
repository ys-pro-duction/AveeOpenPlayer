package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.ZP1;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzby implements Parcelable {
    public static final Parcelable.Creator<zzby> CREATOR = new ZP1();
    public final zzbx[] B;
    public final long C;

    public zzby(long j, zzbx... zzbxVarArr) {
        this.C = j;
        this.B = zzbxVarArr;
    }

    public final int a() {
        return this.B.length;
    }

    public final zzbx b(int i) {
        return this.B[i];
    }

    public final zzby c(zzbx... zzbxVarArr) {
        int length = zzbxVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.C;
        zzbx[] zzbxVarArr2 = this.B;
        int i = AbstractC9004vJ2.a;
        int length2 = zzbxVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzbxVarArr2, length2 + length);
        System.arraycopy(zzbxVarArr, 0, objArrCopyOf, length2, length);
        return new zzby(j, (zzbx[]) objArrCopyOf);
    }

    public final zzby d(zzby zzbyVar) {
        return zzbyVar == null ? this : c(zzbyVar.B);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzby.class == obj.getClass()) {
            zzby zzbyVar = (zzby) obj;
            if (Arrays.equals(this.B, zzbyVar.B) && this.C == zzbyVar.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.B) * 31;
        long j = this.C;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        long j = this.C;
        String string = Arrays.toString(this.B);
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.B.length);
        for (zzbx zzbxVar : this.B) {
            parcel.writeParcelable(zzbxVar, 0);
        }
        parcel.writeLong(this.C);
    }

    public zzby(Parcel parcel) {
        this.B = new zzbx[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbx[] zzbxVarArr = this.B;
            if (i >= zzbxVarArr.length) {
                this.C = parcel.readLong();
                return;
            } else {
                zzbxVarArr[i] = (zzbx) parcel.readParcelable(zzbx.class.getClassLoader());
                i++;
            }
        }
    }

    public zzby(List list) {
        this(-9223372036854775807L, (zzbx[]) list.toArray(new zzbx[0]));
    }
}
