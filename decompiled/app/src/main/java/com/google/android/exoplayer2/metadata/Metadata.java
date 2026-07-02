package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();
    public final Entry[] B;

    public interface Entry extends Parcelable {
    }

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i) {
            return new Metadata[0];
        }
    }

    public Metadata(Entry... entryArr) {
        this.B = entryArr == null ? new Entry[0] : entryArr;
    }

    public Entry a(int i) {
        return this.B[i];
    }

    public int b() {
        return this.B.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.B, ((Metadata) obj).B);
    }

    public int hashCode() {
        return Arrays.hashCode(this.B);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.B.length);
        for (Entry entry : this.B) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(List list) {
        if (list != null) {
            Entry[] entryArr = new Entry[list.size()];
            this.B = entryArr;
            list.toArray(entryArr);
            return;
        }
        this.B = new Entry[0];
    }

    public Metadata(Parcel parcel) {
        this.B = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.B;
            if (i >= entryArr.length) {
                return;
            }
            entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i++;
        }
    }
}
