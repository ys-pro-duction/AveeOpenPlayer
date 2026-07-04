package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C2573Vp1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafl extends zzafh {
    public static final Parcelable.Creator<zzafl> CREATOR = new C2573Vp1();
    public final int C;
    public final int D;
    public final int E;
    public final int[] F;
    public final int[] G;

    public zzafl(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.C = i;
        this.D = i2;
        this.E = i3;
        this.F = iArr;
        this.G = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzafh, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafl.class == obj.getClass()) {
            zzafl zzaflVar = (zzafl) obj;
            if (this.C == zzaflVar.C && this.D == zzaflVar.D && this.E == zzaflVar.E && Arrays.equals(this.F, zzaflVar.F) && Arrays.equals(this.G, zzaflVar.G)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.C + 527) * 31) + this.D) * 31) + this.E) * 31) + Arrays.hashCode(this.F)) * 31) + Arrays.hashCode(this.G);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeIntArray(this.F);
        parcel.writeIntArray(this.G);
    }

    public zzafl(Parcel parcel) {
        super("MLLT");
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = AbstractC9004vJ2.a;
        this.F = iArrCreateIntArray;
        this.G = parcel.createIntArray();
    }
}
