package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C1106Hs1;
import com.daaw.C2485Ut1;
import com.daaw.C7064oO1;
import com.daaw.C9983yp1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaej implements zzbx {
    public static final Parcelable.Creator<zzaej> CREATOR;
    public static final C2485Ut1 H;
    public static final C2485Ut1 I;
    public final String B;
    public final String C;
    public final long D;
    public final long E;
    public final byte[] F;
    public int G;

    static {
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.u("application/id3");
        H = c1106Hs1.D();
        C1106Hs1 c1106Hs12 = new C1106Hs1();
        c1106Hs12.u("application/x-scte35");
        I = c1106Hs12.D();
        CREATOR = new C9983yp1();
    }

    public zzaej(String str, String str2, long j, long j2, byte[] bArr) {
        this.B = str;
        this.C = str2;
        this.D = j;
        this.E = j2;
        this.F = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaej.class == obj.getClass()) {
            zzaej zzaejVar = (zzaej) obj;
            if (this.D == zzaejVar.D && this.E == zzaejVar.E && AbstractC9004vJ2.e(this.B, zzaejVar.B) && AbstractC9004vJ2.e(this.C, zzaejVar.C) && Arrays.equals(this.F, zzaejVar.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.G;
        if (i != 0) {
            return i;
        }
        String str = this.B;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.C;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.D;
        long j2 = this.E;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.F);
        this.G = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.B + ", id=" + this.E + ", durationMs=" + this.D + ", value=" + this.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeByteArray(this.F);
    }

    public zzaej(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.B = string;
        this.C = parcel.readString();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void q(C7064oO1 c7064oO1) {
    }
}
