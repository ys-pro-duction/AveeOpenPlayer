package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9820yE1;
import com.daaw.EG2;
import com.daaw.FG2;
import com.daaw.GG2;
import com.daaw.HG2;
import com.daaw.JM0;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzffh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzffh> CREATOR = new HG2();
    public final EG2[] B;
    public final Context C;
    public final int D;
    public final EG2 E;
    public final int F;
    public final int G;
    public final int H;
    public final String I;
    public final int J;
    public final int K;
    public final int[] L;
    public final int[] M;
    public final int N;

    public zzffh(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        EG2[] eg2ArrValues = EG2.values();
        this.B = eg2ArrValues;
        int[] iArrA = FG2.a();
        this.L = iArrA;
        int[] iArrA2 = GG2.a();
        this.M = iArrA2;
        this.C = null;
        this.D = i;
        this.E = eg2ArrValues[i];
        this.F = i2;
        this.G = i3;
        this.H = i4;
        this.I = str;
        this.J = i5;
        this.N = iArrA[i5];
        this.K = i6;
        int i7 = iArrA2[i6];
    }

    public static zzffh e(EG2 eg2, Context context) {
        if (eg2 == EG2.Rewarded) {
            return new zzffh(context, eg2, ((Integer) zzba.zzc().b(AbstractC9820yE1.p6)).intValue(), ((Integer) zzba.zzc().b(AbstractC9820yE1.v6)).intValue(), ((Integer) zzba.zzc().b(AbstractC9820yE1.x6)).intValue(), (String) zzba.zzc().b(AbstractC9820yE1.z6), (String) zzba.zzc().b(AbstractC9820yE1.r6), (String) zzba.zzc().b(AbstractC9820yE1.t6));
        }
        if (eg2 == EG2.Interstitial) {
            return new zzffh(context, eg2, ((Integer) zzba.zzc().b(AbstractC9820yE1.q6)).intValue(), ((Integer) zzba.zzc().b(AbstractC9820yE1.w6)).intValue(), ((Integer) zzba.zzc().b(AbstractC9820yE1.y6)).intValue(), (String) zzba.zzc().b(AbstractC9820yE1.A6), (String) zzba.zzc().b(AbstractC9820yE1.s6), (String) zzba.zzc().b(AbstractC9820yE1.u6));
        }
        if (eg2 != EG2.AppOpen) {
            return null;
        }
        return new zzffh(context, eg2, ((Integer) zzba.zzc().b(AbstractC9820yE1.D6)).intValue(), ((Integer) zzba.zzc().b(AbstractC9820yE1.F6)).intValue(), ((Integer) zzba.zzc().b(AbstractC9820yE1.G6)).intValue(), (String) zzba.zzc().b(AbstractC9820yE1.B6), (String) zzba.zzc().b(AbstractC9820yE1.C6), (String) zzba.zzc().b(AbstractC9820yE1.E6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.D;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.k(parcel, 2, this.F);
        JM0.k(parcel, 3, this.G);
        JM0.k(parcel, 4, this.H);
        JM0.q(parcel, 5, this.I, false);
        JM0.k(parcel, 6, this.J);
        JM0.k(parcel, 7, this.K);
        JM0.b(parcel, iA);
    }

    public zzffh(Context context, EG2 eg2, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.B = EG2.values();
        this.L = FG2.a();
        this.M = GG2.a();
        this.C = context;
        this.D = eg2.ordinal();
        this.E = eg2;
        this.F = i;
        this.G = i2;
        this.H = i3;
        this.I = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.N = i4;
        this.J = i4 - 1;
        "onAdClosed".equals(str3);
        this.K = 0;
    }
}
