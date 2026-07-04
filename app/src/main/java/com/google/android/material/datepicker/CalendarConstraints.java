package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC2929Za1;
import com.daaw.AbstractC8580tp0;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    public final Month B;
    public final Month C;
    public final DateValidator D;
    public Month E;
    public final int F;
    public final int G;
    public final int H;

    public interface DateValidator extends Parcelable {
        boolean w(long j);
    }

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public static final class b {
        public static final long f = AbstractC2929Za1.a(Month.c(1900, 0).G);
        public static final long g = AbstractC2929Za1.a(Month.c(2100, 11).G);
        public long a;
        public long b;
        public Long c;
        public int d;
        public DateValidator e;

        public b(CalendarConstraints calendarConstraints) {
            this.a = f;
            this.b = g;
            this.e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.a = calendarConstraints.B.G;
            this.b = calendarConstraints.C.G;
            this.c = Long.valueOf(calendarConstraints.E.G);
            this.d = calendarConstraints.F;
            this.e = calendarConstraints.D;
        }

        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
            Month monthG = Month.g(this.a);
            Month monthG2 = Month.g(this.b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.c;
            return new CalendarConstraints(monthG, monthG2, dateValidator, l == null ? null : Month.g(l.longValue()), this.d, null);
        }

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i, a aVar) {
        this(month, month2, dateValidator, month3, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.B.equals(calendarConstraints.B) && this.C.equals(calendarConstraints.C) && AbstractC8580tp0.a(this.E, calendarConstraints.E) && this.F == calendarConstraints.F && this.D.equals(calendarConstraints.D);
    }

    public DateValidator f() {
        return this.D;
    }

    public Month g() {
        return this.C;
    }

    public int h() {
        return this.F;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.B, this.C, this.E, Integer.valueOf(this.F), this.D});
    }

    public int i() {
        return this.H;
    }

    public Month j() {
        return this.E;
    }

    public Month k() {
        return this.B;
    }

    public int l() {
        return this.G;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.B, 0);
        parcel.writeParcelable(this.C, 0);
        parcel.writeParcelable(this.E, 0);
        parcel.writeParcelable(this.D, 0);
        parcel.writeInt(this.F);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.B = month;
        this.C = month2;
        this.E = month3;
        this.F = i;
        this.D = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > AbstractC2929Za1.k().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.H = month.r(month2) + 1;
        this.G = (month2.D - month.D) + 1;
    }
}
