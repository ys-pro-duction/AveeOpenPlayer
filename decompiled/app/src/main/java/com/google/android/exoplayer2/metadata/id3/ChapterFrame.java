package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6280lb1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();
    public final String C;
    public final int D;
    public final int E;
    public final long F;
    public final long G;
    public final Id3Frame[] H;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.C = str;
        this.D = i;
        this.E = i2;
        this.F = j;
        this.G = j2;
        this.H = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.D == chapterFrame.D && this.E == chapterFrame.E && this.F == chapterFrame.F && this.G == chapterFrame.G && AbstractC6280lb1.b(this.C, chapterFrame.C) && Arrays.equals(this.H, chapterFrame.H)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((527 + this.D) * 31) + this.E) * 31) + ((int) this.F)) * 31) + ((int) this.G)) * 31;
        String str = this.C;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
        parcel.writeInt(this.H.length);
        for (Id3Frame id3Frame : this.H) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.C = parcel.readString();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
        int i = parcel.readInt();
        this.H = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.H[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
