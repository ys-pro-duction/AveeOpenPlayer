package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6280lb1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();
    public final String C;
    public final boolean D;
    public final boolean E;
    public final String[] F;
    public final Id3Frame[] G;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.C = str;
        this.D = z;
        this.E = z2;
        this.F = strArr;
        this.G = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterTocFrame.class == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.D == chapterTocFrame.D && this.E == chapterTocFrame.E && AbstractC6280lb1.b(this.C, chapterTocFrame.C) && Arrays.equals(this.F, chapterTocFrame.F) && Arrays.equals(this.G, chapterTocFrame.G)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((527 + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31;
        String str = this.C;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.C);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.F);
        parcel.writeInt(this.G.length);
        for (Id3Frame id3Frame : this.G) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.C = parcel.readString();
        this.D = parcel.readByte() != 0;
        this.E = parcel.readByte() != 0;
        this.F = parcel.createStringArray();
        int i = parcel.readInt();
        this.G = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.G[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
