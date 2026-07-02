package com.daaw;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: renamed from: com.daaw.vh3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9108vh3 implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, getServiceRequest.B);
        JM0.k(parcel, 2, getServiceRequest.C);
        JM0.k(parcel, 3, getServiceRequest.D);
        JM0.q(parcel, 4, getServiceRequest.E, false);
        JM0.j(parcel, 5, getServiceRequest.F, false);
        JM0.t(parcel, 6, getServiceRequest.G, i, false);
        JM0.e(parcel, 7, getServiceRequest.H, false);
        JM0.p(parcel, 8, getServiceRequest.I, i, false);
        JM0.t(parcel, 10, getServiceRequest.J, i, false);
        JM0.t(parcel, 11, getServiceRequest.K, i, false);
        JM0.c(parcel, 12, getServiceRequest.L);
        JM0.k(parcel, 13, getServiceRequest.M);
        JM0.c(parcel, 14, getServiceRequest.N);
        JM0.q(parcel, 15, getServiceRequest.e(), false);
        JM0.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        Scope[] scopeArr = GetServiceRequest.P;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.Q;
        Feature[] featureArr2 = featureArr;
        String strF = null;
        IBinder iBinderS = null;
        Account account = null;
        String strF2 = null;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        boolean zM = false;
        int iT4 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    iT = IM0.t(parcel, iR);
                    break;
                case 2:
                    iT2 = IM0.t(parcel, iR);
                    break;
                case 3:
                    iT3 = IM0.t(parcel, iR);
                    break;
                case 4:
                    strF = IM0.f(parcel, iR);
                    break;
                case 5:
                    iBinderS = IM0.s(parcel, iR);
                    break;
                case 6:
                    scopeArr = (Scope[]) IM0.i(parcel, iR, Scope.CREATOR);
                    break;
                case 7:
                    bundle = IM0.a(parcel, iR);
                    break;
                case 8:
                    account = (Account) IM0.e(parcel, iR, Account.CREATOR);
                    break;
                case 9:
                default:
                    IM0.x(parcel, iR);
                    break;
                case 10:
                    featureArr = (Feature[]) IM0.i(parcel, iR, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) IM0.i(parcel, iR, Feature.CREATOR);
                    break;
                case 12:
                    zM = IM0.m(parcel, iR);
                    break;
                case 13:
                    iT4 = IM0.t(parcel, iR);
                    break;
                case 14:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 15:
                    strF2 = IM0.f(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new GetServiceRequest(iT, iT2, iT3, strF, iBinderS, scopeArr, bundle, account, featureArr, featureArr2, zM, iT4, zM2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
