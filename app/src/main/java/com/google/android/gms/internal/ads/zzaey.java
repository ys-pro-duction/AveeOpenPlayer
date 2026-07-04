package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C0990Gp1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaey extends zzafh {
    public static final Parcelable.Creator<zzaey> CREATOR = new C0990Gp1();
    public final String C;
    public final boolean D;
    public final boolean E;
    public final String[] F;
    public final zzafh[] G;

    public zzaey(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.C = string;
        this.D = parcel.readByte() != 0;
        this.E = parcel.readByte() != 0;
        this.F = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.G = new zzafh[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.G[i3] = (zzafh) parcel.readParcelable(zzafh.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaey.class == obj.getClass()) {
            zzaey zzaeyVar = (zzaey) obj;
            if (this.D == zzaeyVar.D && this.E == zzaeyVar.E && AbstractC9004vJ2.e(this.C, zzaeyVar.C) && Arrays.equals(this.F, zzaeyVar.F) && Arrays.equals(this.G, zzaeyVar.G)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.C;
        return (((((this.D ? 1 : 0) + 527) * 31) + (this.E ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.C);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.F);
        parcel.writeInt(this.G.length);
        for (zzafh zzafhVar : this.G) {
            parcel.writeParcelable(zzafhVar, 0);
        }
    }

    public zzaey(String str, boolean z, boolean z2, String[] strArr, zzafh[] zzafhVarArr) {
        super("CTOC");
        this.C = str;
        this.D = z;
        this.E = z2;
        this.F = strArr;
        this.G = zzafhVarArr;
    }
}
