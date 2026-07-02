package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.rm3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8010rm3 extends Mq3 implements Ko3 {
    public C8010rm3(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.daaw.Ko3
    public final Bundle D2(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        AbstractC3837cs3.c(parcelB, bundle);
        Parcel parcelG = G(11, parcelB);
        Bundle bundle2 = (Bundle) AbstractC3837cs3.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }

    @Override // com.daaw.Ko3
    public final Bundle E1(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        parcelB.writeString(null);
        AbstractC3837cs3.c(parcelB, bundle);
        Parcel parcelG = G(8, parcelB);
        Bundle bundle2 = (Bundle) AbstractC3837cs3.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.Ko3
    public final void L(int i, String str, Bundle bundle, InterfaceC4105dq3 interfaceC4105dq3) {
        Parcel parcelB = B();
        parcelB.writeInt(12);
        parcelB.writeString(str);
        AbstractC3837cs3.c(parcelB, bundle);
        parcelB.writeStrongBinder(interfaceC4105dq3);
        I(1201, parcelB);
    }

    @Override // com.daaw.Ko3
    public final Bundle P0(int i, String str, String str2, String str3) {
        Parcel parcelB = B();
        parcelB.writeInt(3);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        Parcel parcelG = G(4, parcelB);
        Bundle bundle = (Bundle) AbstractC3837cs3.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle;
    }

    @Override // com.daaw.Ko3
    public final Bundle U0(int i, String str, String str2, String str3, String str4) {
        Parcel parcelB = B();
        parcelB.writeInt(3);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        parcelB.writeString(null);
        Parcel parcelG = G(3, parcelB);
        Bundle bundle = (Bundle) AbstractC3837cs3.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle;
    }

    @Override // com.daaw.Ko3
    public final Bundle U2(int i, String str, String str2, Bundle bundle) {
        Parcel parcelB = B();
        parcelB.writeInt(9);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC3837cs3.c(parcelB, bundle);
        Parcel parcelG = G(902, parcelB);
        Bundle bundle2 = (Bundle) AbstractC3837cs3.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }

    @Override // com.daaw.Ko3
    public final Bundle V(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC3837cs3.c(parcelB, bundle);
        AbstractC3837cs3.c(parcelB, bundle2);
        Parcel parcelG = G(901, parcelB);
        Bundle bundle3 = (Bundle) AbstractC3837cs3.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle3;
    }

    @Override // com.daaw.Ko3
    public final int X(int i, String str, String str2) {
        Parcel parcelB = B();
        parcelB.writeInt(3);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        Parcel parcelG = G(5, parcelB);
        int i2 = parcelG.readInt();
        parcelG.recycle();
        return i2;
    }

    @Override // com.daaw.Ko3
    public final Bundle c0(int i, String str, String str2, Bundle bundle) {
        Parcel parcelB = B();
        parcelB.writeInt(9);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC3837cs3.c(parcelB, bundle);
        Parcel parcelG = G(12, parcelB);
        Bundle bundle2 = (Bundle) AbstractC3837cs3.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }

    @Override // com.daaw.Ko3
    public final int i0(int i, String str, String str2) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        Parcel parcelG = G(1, parcelB);
        int i2 = parcelG.readInt();
        parcelG.recycle();
        return i2;
    }

    @Override // com.daaw.Ko3
    public final Bundle p0(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelB = B();
        parcelB.writeInt(6);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        AbstractC3837cs3.c(parcelB, bundle);
        Parcel parcelG = G(9, parcelB);
        Bundle bundle2 = (Bundle) AbstractC3837cs3.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }

    @Override // com.daaw.Ko3
    public final int z2(int i, String str, String str2, Bundle bundle) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC3837cs3.c(parcelB, bundle);
        Parcel parcelG = G(10, parcelB);
        int i2 = parcelG.readInt();
        parcelG.recycle();
        return i2;
    }
}
