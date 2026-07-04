package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC4274eT1;
import com.daaw.JM0;
import com.daaw.ZA1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaxh> CREATOR = new ZA1();
    public final String B;
    public final long C;
    public final String D;
    public final String E;
    public final String F;
    public final Bundle G;
    public final boolean H;
    public long I;
    public String J;
    public int K;

    public zzaxh(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.B = str;
        this.C = j;
        this.D = str2 == null ? "" : str2;
        this.E = str3 == null ? "" : str3;
        this.F = str4 == null ? "" : str4;
        this.G = bundle == null ? new Bundle() : bundle;
        this.H = z;
        this.I = j2;
        this.J = str5;
        this.K = i;
    }

    public static zzaxh e(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                AbstractC4274eT1.zzj("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzaxh(queryParameter, j, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e) {
            e = e;
            AbstractC4274eT1.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            AbstractC4274eT1.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 2, str, false);
        JM0.n(parcel, 3, this.C);
        JM0.q(parcel, 4, this.D, false);
        JM0.q(parcel, 5, this.E, false);
        JM0.q(parcel, 6, this.F, false);
        JM0.e(parcel, 7, this.G, false);
        JM0.c(parcel, 8, this.H);
        JM0.n(parcel, 9, this.I);
        JM0.q(parcel, 10, this.J, false);
        JM0.k(parcel, 11, this.K);
        JM0.b(parcel, iA);
    }
}
