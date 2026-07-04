package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzcl;

/* JADX INFO: loaded from: classes3.dex */
public final class IS1 extends AbstractC6211lK1 implements ST1 {
    public IS1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.daaw.ST1
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeLong(j);
        I(23, parcelB);
    }

    @Override // com.daaw.ST1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC7888rL1.d(parcelB, bundle);
        I(9, parcelB);
    }

    @Override // com.daaw.ST1
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeLong(j);
        I(24, parcelB);
    }

    @Override // com.daaw.ST1
    public final void generateEventId(LV1 lv1) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, lv1);
        I(22, parcelB);
    }

    @Override // com.daaw.ST1
    public final void getCachedAppInstanceId(LV1 lv1) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, lv1);
        I(19, parcelB);
    }

    @Override // com.daaw.ST1
    public final void getConditionalUserProperties(String str, String str2, LV1 lv1) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC7888rL1.e(parcelB, lv1);
        I(10, parcelB);
    }

    @Override // com.daaw.ST1
    public final void getCurrentScreenClass(LV1 lv1) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, lv1);
        I(17, parcelB);
    }

    @Override // com.daaw.ST1
    public final void getCurrentScreenName(LV1 lv1) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, lv1);
        I(16, parcelB);
    }

    @Override // com.daaw.ST1
    public final void getGmpAppId(LV1 lv1) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, lv1);
        I(21, parcelB);
    }

    @Override // com.daaw.ST1
    public final void getMaxUserProperties(String str, LV1 lv1) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        AbstractC7888rL1.e(parcelB, lv1);
        I(6, parcelB);
    }

    @Override // com.daaw.ST1
    public final void getUserProperties(String str, String str2, boolean z, LV1 lv1) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ClassLoader classLoader = AbstractC7888rL1.a;
        parcelB.writeInt(z ? 1 : 0);
        AbstractC7888rL1.e(parcelB, lv1);
        I(5, parcelB);
    }

    @Override // com.daaw.ST1
    public final void initialize(InterfaceC7934rX interfaceC7934rX, zzcl zzclVar, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        AbstractC7888rL1.d(parcelB, zzclVar);
        parcelB.writeLong(j);
        I(1, parcelB);
    }

    @Override // com.daaw.ST1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC7888rL1.d(parcelB, bundle);
        parcelB.writeInt(z ? 1 : 0);
        parcelB.writeInt(z2 ? 1 : 0);
        parcelB.writeLong(j);
        I(2, parcelB);
    }

    @Override // com.daaw.ST1
    public final void logHealthData(int i, String str, InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2, InterfaceC7934rX interfaceC7934rX3) {
        Parcel parcelB = B();
        parcelB.writeInt(5);
        parcelB.writeString(str);
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        AbstractC7888rL1.e(parcelB, interfaceC7934rX2);
        AbstractC7888rL1.e(parcelB, interfaceC7934rX3);
        I(33, parcelB);
    }

    @Override // com.daaw.ST1
    public final void onActivityCreated(InterfaceC7934rX interfaceC7934rX, Bundle bundle, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        AbstractC7888rL1.d(parcelB, bundle);
        parcelB.writeLong(j);
        I(27, parcelB);
    }

    @Override // com.daaw.ST1
    public final void onActivityDestroyed(InterfaceC7934rX interfaceC7934rX, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        parcelB.writeLong(j);
        I(28, parcelB);
    }

    @Override // com.daaw.ST1
    public final void onActivityPaused(InterfaceC7934rX interfaceC7934rX, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        parcelB.writeLong(j);
        I(29, parcelB);
    }

    @Override // com.daaw.ST1
    public final void onActivityResumed(InterfaceC7934rX interfaceC7934rX, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        parcelB.writeLong(j);
        I(30, parcelB);
    }

    @Override // com.daaw.ST1
    public final void onActivitySaveInstanceState(InterfaceC7934rX interfaceC7934rX, LV1 lv1, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        AbstractC7888rL1.e(parcelB, lv1);
        parcelB.writeLong(j);
        I(31, parcelB);
    }

    @Override // com.daaw.ST1
    public final void onActivityStarted(InterfaceC7934rX interfaceC7934rX, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        parcelB.writeLong(j);
        I(25, parcelB);
    }

    @Override // com.daaw.ST1
    public final void onActivityStopped(InterfaceC7934rX interfaceC7934rX, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        parcelB.writeLong(j);
        I(26, parcelB);
    }

    @Override // com.daaw.ST1
    public final void performAction(Bundle bundle, LV1 lv1, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, bundle);
        AbstractC7888rL1.e(parcelB, lv1);
        parcelB.writeLong(j);
        I(32, parcelB);
    }

    @Override // com.daaw.ST1
    public final void registerOnMeasurementEventListener(FX1 fx1) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, fx1);
        I(35, parcelB);
    }

    @Override // com.daaw.ST1
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, bundle);
        parcelB.writeLong(j);
        I(8, parcelB);
    }

    @Override // com.daaw.ST1
    public final void setConsent(Bundle bundle, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, bundle);
        parcelB.writeLong(j);
        I(44, parcelB);
    }

    @Override // com.daaw.ST1
    public final void setCurrentScreen(InterfaceC7934rX interfaceC7934rX, String str, String str2, long j) {
        Parcel parcelB = B();
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeLong(j);
        I(15, parcelB);
    }

    @Override // com.daaw.ST1
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelB = B();
        ClassLoader classLoader = AbstractC7888rL1.a;
        parcelB.writeInt(z ? 1 : 0);
        I(39, parcelB);
    }

    @Override // com.daaw.ST1
    public final void setUserProperty(String str, String str2, InterfaceC7934rX interfaceC7934rX, boolean z, long j) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC7888rL1.e(parcelB, interfaceC7934rX);
        parcelB.writeInt(z ? 1 : 0);
        parcelB.writeLong(j);
        I(4, parcelB);
    }
}
