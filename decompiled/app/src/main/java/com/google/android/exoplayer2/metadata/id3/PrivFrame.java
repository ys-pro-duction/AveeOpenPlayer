package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6280lb1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();
    public final String C;
    public final byte[] D;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.C = str;
        this.D = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PrivFrame.class == obj.getClass()) {
            PrivFrame privFrame = (PrivFrame) obj;
            if (AbstractC6280lb1.b(this.C, privFrame.C) && Arrays.equals(this.D, privFrame.D)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.C;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.D);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.B + ": owner=" + this.C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.C);
        parcel.writeByteArray(this.D);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.C = parcel.readString();
        this.D = parcel.createByteArray();
    }
}
