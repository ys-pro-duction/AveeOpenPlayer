package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();
    public final long B;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    public /* synthetic */ DateValidatorPointForward(long j, a aVar) {
        this(j);
    }

    public static DateValidatorPointForward a(long j) {
        return new DateValidatorPointForward(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.B == ((DateValidatorPointForward) obj).B;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.B)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean w(long j) {
        return j >= this.B;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.B);
    }

    public DateValidatorPointForward(long j) {
        this.B = j;
    }
}
