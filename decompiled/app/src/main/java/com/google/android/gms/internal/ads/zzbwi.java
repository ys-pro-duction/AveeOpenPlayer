package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC8022rp0;
import com.daaw.C6514mQ1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwi> CREATOR = new C6514mQ1();
    public final String B;
    public final int C;

    public zzbwi(String str, int i) {
        this.B = str;
        this.C = i;
    }

    public static zzbwi e(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbwi(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwi)) {
            zzbwi zzbwiVar = (zzbwi) obj;
            if (AbstractC8022rp0.a(this.B, zzbwiVar.B)) {
                if (AbstractC8022rp0.a(Integer.valueOf(this.C), Integer.valueOf(zzbwiVar.C))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC8022rp0.b(this.B, Integer.valueOf(this.C));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 2, str, false);
        JM0.k(parcel, 3, this.C);
        JM0.b(parcel, iA);
    }
}
