package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC8342sy0;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    public static final Parcelable.Creator<Timestamp> CREATOR = new a();
    public final long B;
    public final int C;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Timestamp createFromParcel(Parcel parcel) {
            return new Timestamp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timestamp[] newArray(int i) {
            return new Timestamp[i];
        }
    }

    public Timestamp(long j, int i) {
        k(j, i);
        this.B = j;
        this.C = i;
    }

    public static Timestamp h() {
        return new Timestamp(new Date());
    }

    public static void k(long j, int i) {
        AbstractC8342sy0.a(i >= 0, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i));
        AbstractC8342sy0.a(((double) i) < 1.0E9d, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i));
        AbstractC8342sy0.a(j >= -62135596800L, "Timestamp seconds out of range: %s", Long.valueOf(j));
        AbstractC8342sy0.a(j < 253402300800L, "Timestamp seconds out of range: %s", Long.valueOf(j));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Timestamp timestamp) {
        long j = this.B;
        long j2 = timestamp.B;
        return j == j2 ? Integer.signum(this.C - timestamp.C) : Long.signum(j - j2);
    }

    public int c() {
        return this.C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
    }

    public long g() {
        return this.B;
    }

    public int hashCode() {
        long j = this.B;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.C;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.B + ", nanoseconds=" + this.C + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.B);
        parcel.writeInt(this.C);
    }

    public Timestamp(Parcel parcel) {
        this.B = parcel.readLong();
        this.C = parcel.readInt();
    }

    public Timestamp(Date date) {
        long time = date.getTime();
        long j = time / 1000;
        int i = ((int) (time % 1000)) * UtilsKt.MICROS_MULTIPLIER;
        if (i < 0) {
            j--;
            i += 1000000000;
        }
        k(j, i);
        this.B = j;
        this.C = i;
    }
}
