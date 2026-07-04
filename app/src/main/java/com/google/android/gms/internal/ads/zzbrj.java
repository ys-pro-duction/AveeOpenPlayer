package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C8454tN1;
import com.daaw.JM0;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrj> CREATOR = new C8454tN1();
    public final int B;
    public final int C;
    public final int D;

    public zzbrj(int i, int i2, int i3) {
        this.B = i;
        this.C = i2;
        this.D = i3;
    }

    public static zzbrj e(VersionInfo versionInfo) {
        return new zzbrj(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbrj)) {
            zzbrj zzbrjVar = (zzbrj) obj;
            if (zzbrjVar.D == this.D && zzbrjVar.C == this.C && zzbrjVar.B == this.B) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.B, this.C, this.D});
    }

    public final String toString() {
        return this.B + "." + this.C + "." + this.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.k(parcel, 2, this.C);
        JM0.k(parcel, 3, this.D);
        JM0.b(parcel, iA);
    }
}
