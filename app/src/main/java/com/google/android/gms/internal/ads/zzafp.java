package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6048km2;
import com.daaw.AbstractC9004vJ2;
import com.daaw.C2781Xp1;
import com.daaw.OP2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafp extends zzafh {
    public static final Parcelable.Creator<zzafp> CREATOR = new C2781Xp1();
    public final String C;
    public final String D;
    public final OP2 E;

    public zzafp(String str, String str2, List list) {
        super(str);
        AbstractC6048km2.d(!list.isEmpty());
        this.C = str2;
        OP2 op2H = OP2.H(list);
        this.E = op2H;
        this.D = (String) op2H.get(0);
    }

    public static List a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafp.class == obj.getClass()) {
            zzafp zzafpVar = (zzafp) obj;
            if (AbstractC9004vJ2.e(this.B, zzafpVar.B) && AbstractC9004vJ2.e(this.C, zzafpVar.C) && this.E.equals(zzafpVar.E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.B.hashCode() + 527;
        String str = this.C;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.E.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    @Override // com.google.android.gms.internal.ads.zzafh, com.google.android.gms.internal.ads.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(com.daaw.C7064oO1 r9) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafp.q(com.daaw.oO1):void");
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final String toString() {
        return this.B + ": description=" + this.C + ": values=" + String.valueOf(this.E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeStringArray((String[]) this.E.toArray(new String[0]));
    }
}
