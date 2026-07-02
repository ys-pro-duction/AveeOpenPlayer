package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC2929Za1;
import com.daaw.AbstractC4976gw;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();
    public final Calendar B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final long G;
    public String H;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = AbstractC2929Za1.d(calendar);
        this.B = calendarD;
        this.C = calendarD.get(2);
        this.D = calendarD.get(1);
        this.E = calendarD.getMaximum(7);
        this.F = calendarD.getActualMaximum(5);
        this.G = calendarD.getTimeInMillis();
    }

    public static Month c(int i, int i2) {
        Calendar calendarK = AbstractC2929Za1.k();
        calendarK.set(1, i);
        calendarK.set(2, i2);
        return new Month(calendarK);
    }

    public static Month g(long j) {
        Calendar calendarK = AbstractC2929Za1.k();
        calendarK.setTimeInMillis(j);
        return new Month(calendarK);
    }

    public static Month h() {
        return new Month(AbstractC2929Za1.i());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.B.compareTo(month.B);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.C == month.C && this.D == month.D;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.C), Integer.valueOf(this.D)});
    }

    public int k(int i) {
        int i2 = this.B.get(7);
        if (i <= 0) {
            i = this.B.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.E : i3;
    }

    public long l(int i) {
        Calendar calendarD = AbstractC2929Za1.d(this.B);
        calendarD.set(5, i);
        return calendarD.getTimeInMillis();
    }

    public int m(long j) {
        Calendar calendarD = AbstractC2929Za1.d(this.B);
        calendarD.setTimeInMillis(j);
        return calendarD.get(5);
    }

    public String n() {
        if (this.H == null) {
            this.H = AbstractC4976gw.f(this.B.getTimeInMillis());
        }
        return this.H;
    }

    public long o() {
        return this.B.getTimeInMillis();
    }

    public Month p(int i) {
        Calendar calendarD = AbstractC2929Za1.d(this.B);
        calendarD.add(2, i);
        return new Month(calendarD);
    }

    public int r(Month month) {
        if (this.B instanceof GregorianCalendar) {
            return ((month.D - this.D) * 12) + (month.C - this.C);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.D);
        parcel.writeInt(this.C);
    }
}
