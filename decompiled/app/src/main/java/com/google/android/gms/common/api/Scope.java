package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC7506py0;
import com.daaw.C0553Cm1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C0553Cm1();
    public final int B;
    public final String C;

    public Scope(int i, String str) {
        AbstractC7506py0.g(str, "scopeUri must not be null or empty");
        this.B = i;
        this.C = str;
    }

    public String e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.C.equals(((Scope) obj).C);
        }
        return false;
    }

    public int hashCode() {
        return this.C.hashCode();
    }

    public String toString() {
        return this.C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.q(parcel, 2, e(), false);
        JM0.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
