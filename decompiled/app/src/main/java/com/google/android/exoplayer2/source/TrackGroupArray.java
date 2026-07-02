package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class TrackGroupArray implements Parcelable {
    public final int B;
    public final TrackGroup[] C;
    public int D;
    public static final TrackGroupArray E = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new a();

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroupArray[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.C = trackGroupArr;
        this.B = trackGroupArr.length;
    }

    public TrackGroup a(int i) {
        return this.C[i];
    }

    public int b(TrackGroup trackGroup) {
        for (int i = 0; i < this.B; i++) {
            if (this.C[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroupArray.class == obj.getClass()) {
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.B == trackGroupArray.B && Arrays.equals(this.C, trackGroupArray.C)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.D == 0) {
            this.D = Arrays.hashCode(this.C);
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

    public TrackGroupArray(Parcel parcel) {
        int i = parcel.readInt();
        this.B = i;
        this.C = new TrackGroup[i];
        for (int i2 = 0; i2 < this.B; i2++) {
            this.C[i2] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
