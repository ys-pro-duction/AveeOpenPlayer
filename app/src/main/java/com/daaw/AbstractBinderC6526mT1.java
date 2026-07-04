package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.HashMap;

/* JADX INFO: renamed from: com.daaw.mT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6526mT1 extends MK1 implements ST1 {
    public AbstractBinderC6526mT1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static ST1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof ST1 ? (ST1) iInterfaceQueryLocalInterface : new IS1(iBinder);
    }

    @Override // com.daaw.MK1
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) {
        LV1 c10163zU1 = null;
        LV1 c10163zU12 = null;
        LV1 c10163zU13 = null;
        LV1 c10163zU14 = null;
        FX1 c7932rW1 = null;
        FX1 c7932rW12 = null;
        FX1 c7932rW13 = null;
        LV1 c10163zU15 = null;
        LV1 c10163zU16 = null;
        LV1 c10163zU17 = null;
        LV1 c10163zU18 = null;
        LV1 c10163zU19 = null;
        LV1 c10163zU110 = null;
        RY1 c6267lY1 = null;
        LV1 c10163zU111 = null;
        LV1 c10163zU112 = null;
        LV1 c10163zU113 = null;
        LV1 c10163zU114 = null;
        LV1 c10163zU115 = null;
        switch (i) {
            case 1:
                InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                zzcl zzclVar = (zzcl) AbstractC7888rL1.a(parcel, zzcl.CREATOR);
                long j = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                initialize(interfaceC7934rXG, zzclVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
                boolean zF = AbstractC7888rL1.f(parcel);
                boolean zF2 = AbstractC7888rL1.f(parcel);
                long j2 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                logEvent(string, string2, bundle, zF, zF2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU1 = iInterfaceQueryLocalInterface instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface : new C10163zU1(strongBinder);
                }
                long j3 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                logEventAndBundle(string3, string4, bundle2, c10163zU1, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                boolean zF3 = AbstractC7888rL1.f(parcel);
                long j4 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                setUserProperty(string5, string6, interfaceC7934rXG2, zF3, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zF4 = AbstractC7888rL1.f(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU115 = iInterfaceQueryLocalInterface2 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface2 : new C10163zU1(strongBinder2);
                }
                AbstractC7888rL1.c(parcel);
                getUserProperties(string7, string8, zF4, c10163zU115);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU114 = iInterfaceQueryLocalInterface3 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface3 : new C10163zU1(strongBinder3);
                }
                AbstractC7888rL1.c(parcel);
                getMaxUserProperties(string9, c10163zU114);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
                AbstractC7888rL1.c(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU113 = iInterfaceQueryLocalInterface4 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface4 : new C10163zU1(strongBinder4);
                }
                AbstractC7888rL1.c(parcel);
                getConditionalUserProperties(string13, string14, c10163zU113);
                break;
            case 11:
                boolean zF5 = AbstractC7888rL1.f(parcel);
                long j7 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                setMeasurementEnabled(zF5, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                setCurrentScreen(interfaceC7934rXG3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU112 = iInterfaceQueryLocalInterface5 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface5 : new C10163zU1(strongBinder5);
                }
                AbstractC7888rL1.c(parcel);
                getCurrentScreenName(c10163zU112);
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU111 = iInterfaceQueryLocalInterface6 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface6 : new C10163zU1(strongBinder6);
                }
                AbstractC7888rL1.c(parcel);
                getCurrentScreenClass(c10163zU111);
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c6267lY1 = iInterfaceQueryLocalInterface7 instanceof RY1 ? (RY1) iInterfaceQueryLocalInterface7 : new C6267lY1(strongBinder7);
                }
                AbstractC7888rL1.c(parcel);
                setInstanceIdProvider(c6267lY1);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU110 = iInterfaceQueryLocalInterface8 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface8 : new C10163zU1(strongBinder8);
                }
                AbstractC7888rL1.c(parcel);
                getCachedAppInstanceId(c10163zU110);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU19 = iInterfaceQueryLocalInterface9 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface9 : new C10163zU1(strongBinder9);
                }
                AbstractC7888rL1.c(parcel);
                getAppInstanceId(c10163zU19);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU18 = iInterfaceQueryLocalInterface10 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface10 : new C10163zU1(strongBinder10);
                }
                AbstractC7888rL1.c(parcel);
                getGmpAppId(c10163zU18);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU17 = iInterfaceQueryLocalInterface11 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface11 : new C10163zU1(strongBinder11);
                }
                AbstractC7888rL1.c(parcel);
                generateEventId(c10163zU17);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                InterfaceC7934rX interfaceC7934rXG4 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                onActivityStarted(interfaceC7934rXG4, j14);
                break;
            case 26:
                InterfaceC7934rX interfaceC7934rXG5 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                onActivityStopped(interfaceC7934rXG5, j15);
                break;
            case 27:
                InterfaceC7934rX interfaceC7934rXG6 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                onActivityCreated(interfaceC7934rXG6, bundle5, j16);
                break;
            case 28:
                InterfaceC7934rX interfaceC7934rXG7 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                onActivityDestroyed(interfaceC7934rXG7, j17);
                break;
            case 29:
                InterfaceC7934rX interfaceC7934rXG8 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                onActivityPaused(interfaceC7934rXG8, j18);
                break;
            case 30:
                InterfaceC7934rX interfaceC7934rXG9 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                onActivityResumed(interfaceC7934rXG9, j19);
                break;
            case 31:
                InterfaceC7934rX interfaceC7934rXG10 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU16 = iInterfaceQueryLocalInterface12 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface12 : new C10163zU1(strongBinder12);
                }
                long j20 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                onActivitySaveInstanceState(interfaceC7934rXG10, c10163zU16, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU15 = iInterfaceQueryLocalInterface13 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface13 : new C10163zU1(strongBinder13);
                }
                long j21 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                performAction(bundle6, c10163zU15, j21);
                break;
            case 33:
                int i3 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC7934rX interfaceC7934rXG11 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                InterfaceC7934rX interfaceC7934rXG12 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                InterfaceC7934rX interfaceC7934rXG13 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
                AbstractC7888rL1.c(parcel);
                logHealthData(i3, string19, interfaceC7934rXG11, interfaceC7934rXG12, interfaceC7934rXG13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c7932rW13 = iInterfaceQueryLocalInterface14 instanceof FX1 ? (FX1) iInterfaceQueryLocalInterface14 : new C7932rW1(strongBinder14);
                }
                AbstractC7888rL1.c(parcel);
                setEventInterceptor(c7932rW13);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c7932rW12 = iInterfaceQueryLocalInterface15 instanceof FX1 ? (FX1) iInterfaceQueryLocalInterface15 : new C7932rW1(strongBinder15);
                }
                AbstractC7888rL1.c(parcel);
                registerOnMeasurementEventListener(c7932rW12);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c7932rW1 = iInterfaceQueryLocalInterface16 instanceof FX1 ? (FX1) iInterfaceQueryLocalInterface16 : new C7932rW1(strongBinder16);
                }
                AbstractC7888rL1.c(parcel);
                unregisterOnMeasurementEventListener(c7932rW1);
                break;
            case 37:
                HashMap mapB = AbstractC7888rL1.b(parcel);
                AbstractC7888rL1.c(parcel);
                initForTests(mapB);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU14 = iInterfaceQueryLocalInterface17 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface17 : new C10163zU1(strongBinder17);
                }
                int i4 = parcel.readInt();
                AbstractC7888rL1.c(parcel);
                getTestFlag(c10163zU14, i4);
                break;
            case 39:
                boolean zF6 = AbstractC7888rL1.f(parcel);
                AbstractC7888rL1.c(parcel);
                setDataCollectionEnabled(zF6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU13 = iInterfaceQueryLocalInterface18 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface18 : new C10163zU1(strongBinder18);
                }
                AbstractC7888rL1.c(parcel);
                isDataCollectionEnabled(c10163zU13);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
                AbstractC7888rL1.c(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                AbstractC7888rL1.c(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10163zU12 = iInterfaceQueryLocalInterface19 instanceof LV1 ? (LV1) iInterfaceQueryLocalInterface19 : new C10163zU1(strongBinder19);
                }
                AbstractC7888rL1.c(parcel);
                getSessionId(c10163zU12);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
