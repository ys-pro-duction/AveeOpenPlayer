package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C3300ax1;
import com.daaw.C6949ny1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzas extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzas> CREATOR = new C6949ny1();
    public final Bundle B;

    public zzas(Bundle bundle) {
        this.B = bundle;
    }

    public final String D(String str) {
        return this.B.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C3300ax1(this);
    }

    public final Bundle m() {
        return new Bundle(this.B);
    }

    public final Double p(String str) {
        return Double.valueOf(this.B.getDouble("value"));
    }

    public final Long s(String str) {
        return Long.valueOf(this.B.getLong("value"));
    }

    public final String toString() {
        return this.B.toString();
    }

    public final Object v(String str) {
        return this.B.get(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.e(parcel, 2, m(), false);
        JM0.b(parcel, iA);
    }

    public final int zza() {
        return this.B.size();
    }
}
