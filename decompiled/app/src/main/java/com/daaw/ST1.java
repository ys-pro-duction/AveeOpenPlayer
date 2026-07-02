package com.daaw;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface ST1 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(LV1 lv1);

    void getAppInstanceId(LV1 lv1);

    void getCachedAppInstanceId(LV1 lv1);

    void getConditionalUserProperties(String str, String str2, LV1 lv1);

    void getCurrentScreenClass(LV1 lv1);

    void getCurrentScreenName(LV1 lv1);

    void getGmpAppId(LV1 lv1);

    void getMaxUserProperties(String str, LV1 lv1);

    void getSessionId(LV1 lv1);

    void getTestFlag(LV1 lv1, int i);

    void getUserProperties(String str, String str2, boolean z, LV1 lv1);

    void initForTests(Map map);

    void initialize(InterfaceC7934rX interfaceC7934rX, zzcl zzclVar, long j);

    void isDataCollectionEnabled(LV1 lv1);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, LV1 lv1, long j);

    void logHealthData(int i, String str, InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2, InterfaceC7934rX interfaceC7934rX3);

    void onActivityCreated(InterfaceC7934rX interfaceC7934rX, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC7934rX interfaceC7934rX, long j);

    void onActivityPaused(InterfaceC7934rX interfaceC7934rX, long j);

    void onActivityResumed(InterfaceC7934rX interfaceC7934rX, long j);

    void onActivitySaveInstanceState(InterfaceC7934rX interfaceC7934rX, LV1 lv1, long j);

    void onActivityStarted(InterfaceC7934rX interfaceC7934rX, long j);

    void onActivityStopped(InterfaceC7934rX interfaceC7934rX, long j);

    void performAction(Bundle bundle, LV1 lv1, long j);

    void registerOnMeasurementEventListener(FX1 fx1);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC7934rX interfaceC7934rX, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(FX1 fx1);

    void setInstanceIdProvider(RY1 ry1);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC7934rX interfaceC7934rX, boolean z, long j);

    void unregisterOnMeasurementEventListener(FX1 fx1);
}
