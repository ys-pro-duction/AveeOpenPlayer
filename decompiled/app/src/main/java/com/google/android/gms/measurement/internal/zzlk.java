package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC7506py0;
import com.daaw.Ff3;
import com.daaw.If3;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlk> CREATOR = new Ff3();
    public final int B;
    public final String C;
    public final long D;
    public final Long E;
    public final String F;
    public final String G;
    public final Double H;

    public zzlk(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.B = i;
        this.C = str;
        this.D = j;
        this.E = l;
        if (i == 1) {
            this.H = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.H = d;
        }
        this.F = str2;
        this.G = str3;
    }

    public final Object e() {
        Long l = this.E;
        if (l != null) {
            return l;
        }
        Double d = this.H;
        if (d != null) {
            return d;
        }
        String str = this.F;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Ff3.a(this, parcel, i);
    }

    public zzlk(If3 if3) {
        this(if3.c, if3.d, if3.e, if3.b);
    }

    public zzlk(String str, long j, Object obj, String str2) {
        AbstractC7506py0.f(str);
        this.B = 2;
        this.C = str;
        this.D = j;
        this.G = str2;
        if (obj == null) {
            this.E = null;
            this.H = null;
            this.F = null;
            return;
        }
        if (obj instanceof Long) {
            this.E = (Long) obj;
            this.H = null;
            this.F = null;
        } else if (obj instanceof String) {
            this.E = null;
            this.H = null;
            this.F = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.E = null;
                this.H = (Double) obj;
                this.F = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
