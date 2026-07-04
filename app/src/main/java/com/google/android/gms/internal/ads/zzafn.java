package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C2677Wp1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafn extends zzafh {
    public static final Parcelable.Creator<zzafn> CREATOR = new C2677Wp1();
    public final String C;
    public final byte[] D;

    public zzafn(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        this.C = string;
        this.D = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafn.class == obj.getClass()) {
            zzafn zzafnVar = (zzafn) obj;
            if (AbstractC9004vJ2.e(this.C, zzafnVar.C) && Arrays.equals(this.D, zzafnVar.D)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.C;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.D);
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final String toString() {
        return this.B + ": owner=" + this.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.C);
        parcel.writeByteArray(this.D);
    }

    public zzafn(String str, byte[] bArr) {
        super("PRIV");
        this.C = str;
        this.D = bArr;
    }
}
