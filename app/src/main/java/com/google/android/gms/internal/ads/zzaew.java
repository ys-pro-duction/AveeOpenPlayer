package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C0886Fp1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaew extends zzafh {
    public static final Parcelable.Creator<zzaew> CREATOR = new C0886Fp1();
    public final String C;
    public final int D;
    public final int E;
    public final long F;
    public final long G;
    public final zzafh[] H;

    public zzaew(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.C = string;
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
        int i2 = parcel.readInt();
        this.H = new zzafh[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.H[i3] = (zzafh) parcel.readParcelable(zzafh.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafh, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaew.class == obj.getClass()) {
            zzaew zzaewVar = (zzaew) obj;
            if (this.D == zzaewVar.D && this.E == zzaewVar.E && this.F == zzaewVar.F && this.G == zzaewVar.G && AbstractC9004vJ2.e(this.C, zzaewVar.C) && Arrays.equals(this.H, zzaewVar.H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.C;
        return ((((((((this.D + 527) * 31) + this.E) * 31) + ((int) this.F)) * 31) + ((int) this.G)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
        parcel.writeInt(this.H.length);
        for (zzafh zzafhVar : this.H) {
            parcel.writeParcelable(zzafhVar, 0);
        }
    }

    public zzaew(String str, int i, int i2, long j, long j2, zzafh[] zzafhVarArr) {
        super("CHAP");
        this.C = str;
        this.D = i;
        this.E = i2;
        this.F = j;
        this.G = j2;
        this.H = zzafhVarArr;
    }
}
