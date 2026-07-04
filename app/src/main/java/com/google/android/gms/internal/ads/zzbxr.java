package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.daaw.YQ1;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxr> CREATOR = new YQ1();
    public final String B;
    public final String C;
    public final boolean D;
    public final boolean E;
    public final List F;
    public final boolean G;
    public final boolean H;
    public final List I;

    public zzbxr(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.B = str;
        this.C = str2;
        this.D = z;
        this.E = z2;
        this.F = list;
        this.G = z3;
        this.H = z4;
        this.I = list2 == null ? new ArrayList() : list2;
    }

    public static zzbxr e(JSONObject jSONObject) {
        return new zzbxr(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), zzbw.zzc(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), zzbw.zzc(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 2, str, false);
        JM0.q(parcel, 3, this.C, false);
        JM0.c(parcel, 4, this.D);
        JM0.c(parcel, 5, this.E);
        JM0.s(parcel, 6, this.F, false);
        JM0.c(parcel, 7, this.G);
        JM0.c(parcel, 8, this.H);
        JM0.s(parcel, 9, this.I, false);
        JM0.b(parcel, iA);
    }
}
