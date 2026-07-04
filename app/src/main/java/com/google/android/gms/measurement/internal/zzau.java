package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC7506py0;
import com.daaw.C0926Fz1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new C0926Fz1();
    public final String B;
    public final zzas C;
    public final String D;
    public final long E;

    public zzau(zzau zzauVar, long j) {
        AbstractC7506py0.l(zzauVar);
        this.B = zzauVar.B;
        this.C = zzauVar.C;
        this.D = zzauVar.D;
        this.E = j;
    }

    public final String toString() {
        return "origin=" + this.D + ",name=" + this.B + ",params=" + String.valueOf(this.C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0926Fz1.a(this, parcel, i);
    }

    public zzau(String str, zzas zzasVar, String str2, long j) {
        this.B = str;
        this.C = zzasVar;
        this.D = str2;
        this.E = j;
    }
}
