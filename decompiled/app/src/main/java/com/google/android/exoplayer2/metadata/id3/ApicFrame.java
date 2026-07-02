package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6280lb1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();
    public final String C;
    public final String D;
    public final int E;
    public final byte[] F;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.C = str;
        this.D = str2;
        this.E = i;
        this.F = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.E == apicFrame.E && AbstractC6280lb1.b(this.C, apicFrame.C) && AbstractC6280lb1.b(this.D, apicFrame.D) && Arrays.equals(this.F, apicFrame.F)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (527 + this.E) * 31;
        String str = this.C;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.D;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.F);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.B + ": mimeType=" + this.C + ", description=" + this.D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeByteArray(this.F);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.createByteArray();
    }
}
