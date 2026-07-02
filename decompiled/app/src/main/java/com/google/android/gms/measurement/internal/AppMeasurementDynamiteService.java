package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.daaw.AbstractBinderC6526mT1;
import com.daaw.AbstractC4877gb3;
import com.daaw.AbstractC7506py0;
import com.daaw.Bh3;
import com.daaw.BinderC7744qp0;
import com.daaw.C2407Ua;
import com.daaw.C9327wU2;
import com.daaw.Ci3;
import com.daaw.FX1;
import com.daaw.Fa3;
import com.daaw.InterfaceC7934rX;
import com.daaw.LV1;
import com.daaw.La3;
import com.daaw.M83;
import com.daaw.Oa3;
import com.daaw.Ob3;
import com.daaw.Pf3;
import com.daaw.RY1;
import com.daaw.RunnableC4872ga3;
import com.daaw.RunnableC8120s93;
import com.daaw.RunnableC8259sg3;
import com.daaw.RunnableC8802ud3;
import com.daaw.Sk3;
import com.daaw.V93;
import com.daaw.Xe3;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends AbstractBinderC6526mT1 {
    public C9327wU2 B = null;
    public final Map C = new C2407Ua();

    public final void G(LV1 lv1, String str) {
        zzb();
        this.B.N().K(lv1, str);
    }

    @Override // com.daaw.ST1
    public void beginAdUnitExposure(String str, long j) {
        zzb();
        this.B.y().h(str, j);
    }

    @Override // com.daaw.ST1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb();
        this.B.I().k(str, str2, bundle);
    }

    @Override // com.daaw.ST1
    public void clearMeasurementEnabled(long j) {
        zzb();
        this.B.I().I(null);
    }

    @Override // com.daaw.ST1
    public void endAdUnitExposure(String str, long j) {
        zzb();
        this.B.y().i(str, j);
    }

    @Override // com.daaw.ST1
    public void generateEventId(LV1 lv1) {
        zzb();
        long jT0 = this.B.N().t0();
        zzb();
        this.B.N().J(lv1, jT0);
    }

    @Override // com.daaw.ST1
    public void getAppInstanceId(LV1 lv1) {
        zzb();
        this.B.x().z(new RunnableC4872ga3(this, lv1));
    }

    @Override // com.daaw.ST1
    public void getCachedAppInstanceId(LV1 lv1) {
        zzb();
        G(lv1, this.B.I().V());
    }

    @Override // com.daaw.ST1
    public void getConditionalUserProperties(String str, String str2, LV1 lv1) {
        zzb();
        this.B.x().z(new RunnableC8259sg3(this, lv1, str, str2));
    }

    @Override // com.daaw.ST1
    public void getCurrentScreenClass(LV1 lv1) {
        zzb();
        G(lv1, this.B.I().W());
    }

    @Override // com.daaw.ST1
    public void getCurrentScreenName(LV1 lv1) {
        zzb();
        G(lv1, this.B.I().X());
    }

    @Override // com.daaw.ST1
    public void getGmpAppId(LV1 lv1) {
        String strC;
        zzb();
        Oa3 oa3I = this.B.I();
        if (oa3I.a.O() != null) {
            strC = oa3I.a.O();
        } else {
            try {
                strC = AbstractC4877gb3.c(oa3I.a.v(), "google_app_id", oa3I.a.R());
            } catch (IllegalStateException e) {
                oa3I.a.w().n().b("getGoogleAppId failed with exception", e);
                strC = null;
            }
        }
        G(lv1, strC);
    }

    @Override // com.daaw.ST1
    public void getMaxUserProperties(String str, LV1 lv1) {
        zzb();
        this.B.I().Q(str);
        zzb();
        this.B.N().I(lv1, 25);
    }

    @Override // com.daaw.ST1
    public void getSessionId(LV1 lv1) {
        zzb();
        Oa3 oa3I = this.B.I();
        oa3I.a.x().z(new V93(oa3I, lv1));
    }

    @Override // com.daaw.ST1
    public void getTestFlag(LV1 lv1, int i) {
        zzb();
        if (i == 0) {
            this.B.N().K(lv1, this.B.I().Y());
            return;
        }
        if (i == 1) {
            this.B.N().J(lv1, this.B.I().U().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.B.N().I(lv1, this.B.I().T().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.B.N().E(lv1, this.B.I().R().booleanValue());
                return;
            }
        }
        Pf3 pf3N = this.B.N();
        double dDoubleValue = this.B.I().S().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            lv1.J0(bundle);
        } catch (RemoteException e) {
            pf3N.a.w().t().b("Error returning double value to wrapper", e);
        }
    }

    @Override // com.daaw.ST1
    public void getUserProperties(String str, String str2, boolean z, LV1 lv1) {
        zzb();
        this.B.x().z(new RunnableC8802ud3(this, lv1, str, str2, z));
    }

    @Override // com.daaw.ST1
    public void initForTests(Map map) {
        zzb();
    }

    @Override // com.daaw.ST1
    public void initialize(InterfaceC7934rX interfaceC7934rX, zzcl zzclVar, long j) {
        C9327wU2 c9327wU2 = this.B;
        if (c9327wU2 == null) {
            this.B = C9327wU2.H((Context) AbstractC7506py0.l((Context) BinderC7744qp0.I(interfaceC7934rX)), zzclVar, Long.valueOf(j));
        } else {
            c9327wU2.w().t().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.daaw.ST1
    public void isDataCollectionEnabled(LV1 lv1) {
        zzb();
        this.B.x().z(new Bh3(this, lv1));
    }

    @Override // com.daaw.ST1
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zzb();
        this.B.I().o(str, str2, bundle, z, z2, j);
    }

    @Override // com.daaw.ST1
    public void logEventAndBundle(String str, String str2, Bundle bundle, LV1 lv1, long j) {
        zzb();
        AbstractC7506py0.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.B.x().z(new Ob3(this, lv1, new zzau(str2, new zzas(bundle), "app", j), str));
    }

    @Override // com.daaw.ST1
    public void logHealthData(int i, String str, InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2, InterfaceC7934rX interfaceC7934rX3) {
        zzb();
        this.B.w().G(i, true, false, str, interfaceC7934rX == null ? null : BinderC7744qp0.I(interfaceC7934rX), interfaceC7934rX2 == null ? null : BinderC7744qp0.I(interfaceC7934rX2), interfaceC7934rX3 != null ? BinderC7744qp0.I(interfaceC7934rX3) : null);
    }

    @Override // com.daaw.ST1
    public void onActivityCreated(InterfaceC7934rX interfaceC7934rX, Bundle bundle, long j) {
        zzb();
        La3 la3 = this.B.I().c;
        if (la3 != null) {
            this.B.I().l();
            la3.onActivityCreated((Activity) BinderC7744qp0.I(interfaceC7934rX), bundle);
        }
    }

    @Override // com.daaw.ST1
    public void onActivityDestroyed(InterfaceC7934rX interfaceC7934rX, long j) {
        zzb();
        La3 la3 = this.B.I().c;
        if (la3 != null) {
            this.B.I().l();
            la3.onActivityDestroyed((Activity) BinderC7744qp0.I(interfaceC7934rX));
        }
    }

    @Override // com.daaw.ST1
    public void onActivityPaused(InterfaceC7934rX interfaceC7934rX, long j) {
        zzb();
        La3 la3 = this.B.I().c;
        if (la3 != null) {
            this.B.I().l();
            la3.onActivityPaused((Activity) BinderC7744qp0.I(interfaceC7934rX));
        }
    }

    @Override // com.daaw.ST1
    public void onActivityResumed(InterfaceC7934rX interfaceC7934rX, long j) {
        zzb();
        La3 la3 = this.B.I().c;
        if (la3 != null) {
            this.B.I().l();
            la3.onActivityResumed((Activity) BinderC7744qp0.I(interfaceC7934rX));
        }
    }

    @Override // com.daaw.ST1
    public void onActivitySaveInstanceState(InterfaceC7934rX interfaceC7934rX, LV1 lv1, long j) {
        zzb();
        La3 la3 = this.B.I().c;
        Bundle bundle = new Bundle();
        if (la3 != null) {
            this.B.I().l();
            la3.onActivitySaveInstanceState((Activity) BinderC7744qp0.I(interfaceC7934rX), bundle);
        }
        try {
            lv1.J0(bundle);
        } catch (RemoteException e) {
            this.B.w().t().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.daaw.ST1
    public void onActivityStarted(InterfaceC7934rX interfaceC7934rX, long j) {
        zzb();
        if (this.B.I().c != null) {
            this.B.I().l();
        }
    }

    @Override // com.daaw.ST1
    public void onActivityStopped(InterfaceC7934rX interfaceC7934rX, long j) {
        zzb();
        if (this.B.I().c != null) {
            this.B.I().l();
        }
    }

    @Override // com.daaw.ST1
    public void performAction(Bundle bundle, LV1 lv1, long j) {
        zzb();
        lv1.J0(null);
    }

    @Override // com.daaw.ST1
    public void registerOnMeasurementEventListener(FX1 fx1) {
        M83 sk3;
        zzb();
        synchronized (this.C) {
            try {
                sk3 = (M83) this.C.get(Integer.valueOf(fx1.zzd()));
                if (sk3 == null) {
                    sk3 = new Sk3(this, fx1);
                    this.C.put(Integer.valueOf(fx1.zzd()), sk3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.B.I().u(sk3);
    }

    @Override // com.daaw.ST1
    public void resetAnalyticsData(long j) {
        zzb();
        this.B.I().y(j);
    }

    @Override // com.daaw.ST1
    public void setConditionalUserProperty(Bundle bundle, long j) {
        zzb();
        if (bundle == null) {
            this.B.w().n().a("Conditional user property must not be null");
        } else {
            this.B.I().E(bundle, j);
        }
    }

    @Override // com.daaw.ST1
    public void setConsent(final Bundle bundle, final long j) {
        zzb();
        final Oa3 oa3I = this.B.I();
        oa3I.a.x().A(new Runnable() { // from class: com.daaw.Y83
            @Override // java.lang.Runnable
            public final void run() {
                Oa3 oa3 = oa3I;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(oa3.a.B().q())) {
                    oa3.G(bundle2, 0, j2);
                } else {
                    oa3.a.w().u().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.daaw.ST1
    public void setConsentThirdParty(Bundle bundle, long j) {
        zzb();
        this.B.I().G(bundle, -20, j);
    }

    @Override // com.daaw.ST1
    public void setCurrentScreen(InterfaceC7934rX interfaceC7934rX, String str, String str2, long j) {
        zzb();
        this.B.K().D((Activity) BinderC7744qp0.I(interfaceC7934rX), str, str2);
    }

    @Override // com.daaw.ST1
    public void setDataCollectionEnabled(boolean z) {
        zzb();
        Oa3 oa3I = this.B.I();
        oa3I.e();
        oa3I.a.x().z(new Fa3(oa3I, z));
    }

    @Override // com.daaw.ST1
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final Oa3 oa3I = this.B.I();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        oa3I.a.x().z(new Runnable() { // from class: com.daaw.c93
            @Override // java.lang.Runnable
            public final void run() {
                oa3I.m(bundle2);
            }
        });
    }

    @Override // com.daaw.ST1
    public void setEventInterceptor(FX1 fx1) {
        zzb();
        Ci3 ci3 = new Ci3(this, fx1);
        if (this.B.x().C()) {
            this.B.I().H(ci3);
        } else {
            this.B.x().z(new Xe3(this, ci3));
        }
    }

    @Override // com.daaw.ST1
    public void setInstanceIdProvider(RY1 ry1) {
        zzb();
    }

    @Override // com.daaw.ST1
    public void setMeasurementEnabled(boolean z, long j) {
        zzb();
        this.B.I().I(Boolean.valueOf(z));
    }

    @Override // com.daaw.ST1
    public void setMinimumSessionDuration(long j) {
        zzb();
    }

    @Override // com.daaw.ST1
    public void setSessionTimeoutDuration(long j) {
        zzb();
        Oa3 oa3I = this.B.I();
        oa3I.a.x().z(new RunnableC8120s93(oa3I, j));
    }

    @Override // com.daaw.ST1
    public void setUserId(final String str, long j) {
        zzb();
        final Oa3 oa3I = this.B.I();
        if (str != null && TextUtils.isEmpty(str)) {
            oa3I.a.w().t().a("User ID must be non-empty or null");
        } else {
            oa3I.a.x().z(new Runnable() { // from class: com.daaw.g93
                @Override // java.lang.Runnable
                public final void run() {
                    Oa3 oa3 = oa3I;
                    if (oa3.a.B().t(str)) {
                        oa3.a.B().s();
                    }
                }
            });
            oa3I.L(null, "_id", str, true, j);
        }
    }

    @Override // com.daaw.ST1
    public void setUserProperty(String str, String str2, InterfaceC7934rX interfaceC7934rX, boolean z, long j) {
        zzb();
        this.B.I().L(str, str2, BinderC7744qp0.I(interfaceC7934rX), z, j);
    }

    @Override // com.daaw.ST1
    public void unregisterOnMeasurementEventListener(FX1 fx1) {
        M83 sk3;
        zzb();
        synchronized (this.C) {
            sk3 = (M83) this.C.remove(Integer.valueOf(fx1.zzd()));
        }
        if (sk3 == null) {
            sk3 = new Sk3(this, fx1);
        }
        this.B.I().N(sk3);
    }

    public final void zzb() {
        if (this.B == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}
