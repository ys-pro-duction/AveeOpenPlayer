package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C9108vh3;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C9108vh3();
    public static final Scope[] P = new Scope[0];
    public static final Feature[] Q = new Feature[0];
    public final int B;
    public final int C;
    public final int D;
    public String E;
    public IBinder F;
    public Scope[] G;
    public Bundle H;
    public Account I;
    public Feature[] J;
    public Feature[] K;
    public final boolean L;
    public final int M;
    public boolean N;
    public final String O;

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? P : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? Q : featureArr;
        featureArr2 = featureArr2 == null ? Q : featureArr2;
        this.B = i;
        this.C = i2;
        this.D = i3;
        if ("com.google.android.gms".equals(str)) {
            this.E = "com.google.android.gms";
        } else {
            this.E = str;
        }
        if (i < 2) {
            this.I = iBinder != null ? a.I(b.a.G(iBinder)) : null;
        } else {
            this.F = iBinder;
            this.I = account;
        }
        this.G = scopeArr;
        this.H = bundle;
        this.J = featureArr;
        this.K = featureArr2;
        this.L = z;
        this.M = i4;
        this.N = z2;
        this.O = str2;
    }

    public final String e() {
        return this.O;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C9108vh3.a(this, parcel, i);
    }
}
