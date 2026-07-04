package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.AbstractC9950yi3;
import com.daaw.C1290Jm1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzad implements Comparator<zzac>, Parcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C1290Jm1();
    public final zzac[] B;
    public int C;
    public final String D;
    public final int E;

    public zzad(Parcel parcel) {
        this.D = parcel.readString();
        zzac[] zzacVarArr = (zzac[]) parcel.createTypedArray(zzac.CREATOR);
        int i = AbstractC9004vJ2.a;
        this.B = zzacVarArr;
        this.E = zzacVarArr.length;
    }

    public final zzac a(int i) {
        return this.B[i];
    }

    public final zzad b(String str) {
        return AbstractC9004vJ2.e(this.D, str) ? this : new zzad(str, false, this.B);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzac zzacVar, zzac zzacVar2) {
        zzac zzacVar3 = zzacVar;
        zzac zzacVar4 = zzacVar2;
        UUID uuid = AbstractC9950yi3.a;
        return uuid.equals(zzacVar3.C) ? !uuid.equals(zzacVar4.C) ? 1 : 0 : zzacVar3.C.compareTo(zzacVar4.C);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzad.class == obj.getClass()) {
            zzad zzadVar = (zzad) obj;
            if (AbstractC9004vJ2.e(this.D, zzadVar.D) && Arrays.equals(this.B, zzadVar.B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.C;
        if (i != 0) {
            return i;
        }
        String str = this.D;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.B);
        this.C = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.D);
        parcel.writeTypedArray(this.B, 0);
    }

    public zzad(String str, boolean z, zzac... zzacVarArr) {
        this.D = str;
        zzacVarArr = z ? (zzac[]) zzacVarArr.clone() : zzacVarArr;
        this.B = zzacVarArr;
        this.E = zzacVarArr.length;
        Arrays.sort(zzacVarArr, this);
    }

    public zzad(String str, zzac... zzacVarArr) {
        this(null, true, zzacVarArr);
    }

    public zzad(List list) {
        this(null, false, (zzac[]) list.toArray(new zzac[0]));
    }
}
