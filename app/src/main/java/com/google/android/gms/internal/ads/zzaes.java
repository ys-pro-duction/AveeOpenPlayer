package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C0678Dp1;
import com.daaw.C7064oO1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaes extends zzafh {
    public static final Parcelable.Creator<zzaes> CREATOR = new C0678Dp1();
    public final String C;
    public final String D;
    public final int E;
    public final byte[] F;

    public zzaes(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.C = string;
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaes.class == obj.getClass()) {
            zzaes zzaesVar = (zzaes) obj;
            if (this.E == zzaesVar.E && AbstractC9004vJ2.e(this.C, zzaesVar.C) && AbstractC9004vJ2.e(this.D, zzaesVar.D) && Arrays.equals(this.F, zzaesVar.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.C;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.E;
        String str2 = this.D;
        return ((((((i + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.F);
    }

    @Override // com.google.android.gms.internal.ads.zzafh, com.google.android.gms.internal.ads.zzbx
    public final void q(C7064oO1 c7064oO1) {
        c7064oO1.s(this.F, this.E);
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final String toString() {
        return this.B + ": mimeType=" + this.C + ", description=" + this.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeByteArray(this.F);
    }

    public zzaes(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.C = str;
        this.D = str2;
        this.E = i;
        this.F = bArr;
    }
}
