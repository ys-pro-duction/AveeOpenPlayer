package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6280lb1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a();
    public final int B;
    public final int C;
    public final int D;
    public final byte[] E;
    public int F;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ColorInfo[] newArray(int i) {
            return new ColorInfo[0];
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.B == colorInfo.B && this.C == colorInfo.C && this.D == colorInfo.D && Arrays.equals(this.E, colorInfo.E)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.F == 0) {
            this.F = ((((((527 + this.B) * 31) + this.C) * 31) + this.D) * 31) + Arrays.hashCode(this.E);
        }
        return this.F;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.C);
        sb.append(", ");
        sb.append(this.D);
        sb.append(", ");
        sb.append(this.E != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        AbstractC6280lb1.c0(parcel, this.E != null);
        byte[] bArr = this.E;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = AbstractC6280lb1.Q(parcel) ? parcel.createByteArray() : null;
    }
}
