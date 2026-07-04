package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC7115ob;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a();
    public final int B;
    public final Format[] C;
    public int D;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroup[] newArray(int i) {
            return new TrackGroup[i];
        }
    }

    public TrackGroup(Format... formatArr) {
        AbstractC7115ob.f(formatArr.length > 0);
        this.C = formatArr;
        this.B = formatArr.length;
    }

    public Format a(int i) {
        return this.C[i];
    }

    public int b(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.C;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.B == trackGroup.B && Arrays.equals(this.C, trackGroup.C)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.D == 0) {
            this.D = 527 + Arrays.hashCode(this.C);
        }
        return this.D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.B);
        for (int i2 = 0; i2 < this.B; i2++) {
            parcel.writeParcelable(this.C[i2], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int i = parcel.readInt();
        this.B = i;
        this.C = new Format[i];
        for (int i2 = 0; i2 < this.B; i2++) {
            this.C[i2] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
