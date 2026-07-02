package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC8022rp0;
import com.daaw.C9876yS1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C9876yS1();
    public final String B;
    public final int C;
    public final long D;

    public Feature(String str, int i, long j) {
        this.B = str;
        this.C = i;
        this.D = j;
    }

    public long e() {
        long j = this.D;
        return j == -1 ? this.C : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && e() == feature.e()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.B;
    }

    public final int hashCode() {
        return AbstractC8022rp0.b(getName(), Long.valueOf(e()));
    }

    public final String toString() {
        AbstractC8022rp0.a aVarC = AbstractC8022rp0.c(this);
        aVarC.a("name", getName());
        aVarC.a("version", Long.valueOf(e()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, getName(), false);
        JM0.k(parcel, 2, this.C);
        JM0.n(parcel, 3, e());
        JM0.b(parcel, iA);
    }

    public Feature(String str, long j) {
        this.B = str;
        this.D = j;
        this.C = -1;
    }
}
