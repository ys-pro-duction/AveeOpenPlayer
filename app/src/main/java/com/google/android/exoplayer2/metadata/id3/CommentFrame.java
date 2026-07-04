package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6280lb1;

/* JADX INFO: loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();
    public final String C;
    public final String D;
    public final String E;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.C = str;
        this.D = str2;
        this.E = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CommentFrame.class == obj.getClass()) {
            CommentFrame commentFrame = (CommentFrame) obj;
            if (AbstractC6280lb1.b(this.D, commentFrame.D) && AbstractC6280lb1.b(this.C, commentFrame.C) && AbstractC6280lb1.b(this.E, commentFrame.E)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.C;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.D;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.E;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.B + ": language=" + this.C + ", description=" + this.D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.E);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
    }
}
