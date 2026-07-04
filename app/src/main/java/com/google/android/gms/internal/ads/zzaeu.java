package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C0782Ep1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaeu extends zzafh {
    public static final Parcelable.Creator<zzaeu> CREATOR = new C0782Ep1();
    public final byte[] C;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzaeu(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC9004vJ2.a;
        super(string);
        this.C = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeu.class == obj.getClass()) {
            zzaeu zzaeuVar = (zzaeu) obj;
            if (this.B.equals(zzaeuVar.B) && Arrays.equals(this.C, zzaeuVar.C)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.B.hashCode() + 527) * 31) + Arrays.hashCode(this.C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeByteArray(this.C);
    }

    public zzaeu(String str, byte[] bArr) {
        super(str);
        this.C = bArr;
    }
}
