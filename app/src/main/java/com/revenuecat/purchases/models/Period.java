package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC2911Yw;
import com.daaw.C0576Cs0;
import com.daaw.G10;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002&'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/models/Period;", "Landroid/os/Parcelable;", "", "value", "Lcom/revenuecat/purchases/models/Period$Unit;", "unit", "", "iso8601", "<init>", "(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V", "component1", "()I", "component2", "()Lcom/revenuecat/purchases/models/Period$Unit;", "component3", "()Ljava/lang/String;", "copy", "(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)Lcom/revenuecat/purchases/models/Period;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcom/daaw/G91;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getValue", "Lcom/revenuecat/purchases/models/Period$Unit;", "getUnit", "Ljava/lang/String;", "getIso8601", "Factory", "Unit", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Period implements Parcelable {
    private final String iso8601;
    private final Unit unit;
    private final int value;

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Period> CREATOR = new Creator();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Period> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period createFromParcel(Parcel parcel) {
            G10.g(parcel, "parcel");
            return new Period(parcel.readInt(), Unit.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period[] newArray(int i) {
            return new Period[i];
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.models.Period$Factory, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/models/Period$Factory;", "", "()V", "create", "Lcom/revenuecat/purchases/models/Period;", "iso8601", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final Period create(String iso8601) {
            G10.g(iso8601, "iso8601");
            C0576Cs0 period = PeriodKt.toPeriod(iso8601);
            return new Period(((Number) period.c()).intValue(), (Unit) period.d(), iso8601);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/models/Period$Unit;", "", "(Ljava/lang/String;I)V", "DAY", "WEEK", "MONTH", "YEAR", "UNKNOWN", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Unit {
        DAY,
        WEEK,
        MONTH,
        YEAR,
        UNKNOWN
    }

    public Period(int i, Unit unit, String str) {
        G10.g(unit, "unit");
        G10.g(str, "iso8601");
        this.value = i;
        this.unit = unit;
        this.iso8601 = str;
    }

    public static /* synthetic */ Period copy$default(Period period, int i, Unit unit, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = period.value;
        }
        if ((i2 & 2) != 0) {
            unit = period.unit;
        }
        if ((i2 & 4) != 0) {
            str = period.iso8601;
        }
        return period.copy(i, unit, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Unit getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIso8601() {
        return this.iso8601;
    }

    public final Period copy(int value, Unit unit, String iso8601) {
        G10.g(unit, "unit");
        G10.g(iso8601, "iso8601");
        return new Period(value, unit, iso8601);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Period)) {
            return false;
        }
        Period period = (Period) other;
        return this.value == period.value && this.unit == period.unit && G10.c(this.iso8601, period.iso8601);
    }

    public final String getIso8601() {
        return this.iso8601;
    }

    public final Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.value * 31) + this.unit.hashCode()) * 31) + this.iso8601.hashCode();
    }

    public String toString() {
        return "Period(value=" + this.value + ", unit=" + this.unit + ", iso8601=" + this.iso8601 + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        G10.g(parcel, "out");
        parcel.writeInt(this.value);
        parcel.writeString(this.unit.name());
        parcel.writeString(this.iso8601);
    }
}
