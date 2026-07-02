package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC4522fL2;
import com.daaw.AbstractC6048km2;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C7064oO1;
import com.daaw.DK2;
import com.daaw.UN2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfo implements zzbx {
    public static final Parcelable.Creator<zzfo> CREATOR = new DK2();
    public final String B;
    public final byte[] C;
    public final int D;
    public final int E;

    public zzfo(String str, byte[] bArr, int i, int i2) {
        this.B = str;
        this.C = bArr;
        this.D = i;
        this.E = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfo.class == obj.getClass()) {
            zzfo zzfoVar = (zzfo) obj;
            if (this.B.equals(zzfoVar.B) && Arrays.equals(this.C, zzfoVar.C) && this.D == zzfoVar.D && this.E == zzfoVar.E) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.B.hashCode() + 527) * 31) + Arrays.hashCode(this.C)) * 31) + this.D) * 31) + this.E;
    }

    public final String toString() {
        String str;
        int i = this.E;
        if (i != 1) {
            if (i == 23) {
                byte[] bArr = this.C;
                int i2 = AbstractC9004vJ2.a;
                AbstractC6048km2.d(bArr.length == 4);
                str = String.valueOf(Float.intBitsToFloat(((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)));
            } else if (i != 67) {
                byte[] bArr2 = this.C;
                int length = bArr2.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (int i3 = 0; i3 < bArr2.length; i3++) {
                    sb.append(Character.forDigit((bArr2[i3] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr2[i3] & 15, 16));
                }
                str = sb.toString();
            } else {
                byte[] bArr3 = this.C;
                int i4 = AbstractC9004vJ2.a;
                AbstractC6048km2.d(bArr3.length == 4);
                str = String.valueOf((bArr3[1] << 16) | (bArr3[0] << 24) | (bArr3[2] << 8) | bArr3[3]);
            }
        } else {
            str = new String(this.C, UN2.c);
        }
        return "mdta: key=" + this.B + ", value=" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeByteArray(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
    }

    public /* synthetic */ zzfo(Parcel parcel, AbstractC4522fL2 abstractC4522fL2) {
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.B = string;
        this.C = parcel.createByteArray();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void q(C7064oO1 c7064oO1) {
    }
}
