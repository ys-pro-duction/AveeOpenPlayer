package com.daaw;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
public final class Qd3 {
    public final Context a;

    public Qd3(Context context) {
        AbstractC7506py0.l(context);
        this.a = context;
    }

    public final int a(final Intent intent, int i, final int i2) {
        C9327wU2 c9327wU2H = C9327wU2.H(this.a, null, null);
        final C6675mz2 c6675mz2W = c9327wU2H.w();
        if (intent == null) {
            c6675mz2W.t().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c9327wU2H.a();
        c6675mz2W.s().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() { // from class: com.daaw.Hd3
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.c(i2, c6675mz2W, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().n().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new K43(C8812uf3.f0(this.a), null);
        }
        k().t().b("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void c(int i, C6675mz2 c6675mz2, Intent intent) {
        if (((Nd3) this.a).c(i)) {
            c6675mz2.s().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            k().s().a("Completed wakeful intent.");
            ((Nd3) this.a).a(intent);
        }
    }

    public final /* synthetic */ void d(C6675mz2 c6675mz2, JobParameters jobParameters) {
        c6675mz2.s().a("AppMeasurementJobService processed last upload request.");
        ((Nd3) this.a).b(jobParameters, false);
    }

    public final void e() {
        C9327wU2 c9327wU2H = C9327wU2.H(this.a, null, null);
        C6675mz2 c6675mz2W = c9327wU2H.w();
        c9327wU2H.a();
        c6675mz2W.s().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        C9327wU2 c9327wU2H = C9327wU2.H(this.a, null, null);
        C6675mz2 c6675mz2W = c9327wU2H.w();
        c9327wU2H.a();
        c6675mz2W.s().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().n().a("onRebind called with null intent");
        } else {
            k().s().b("onRebind called. action", intent.getAction());
        }
    }

    public final void h(Runnable runnable) {
        C8812uf3 c8812uf3F0 = C8812uf3.f0(this.a);
        c8812uf3F0.x().z(new Kd3(this, c8812uf3F0, runnable));
    }

    public final boolean i(final JobParameters jobParameters) {
        C9327wU2 c9327wU2H = C9327wU2.H(this.a, null, null);
        final C6675mz2 c6675mz2W = c9327wU2H.w();
        String string = jobParameters.getExtras().getString("action");
        c9327wU2H.a();
        c6675mz2W.s().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        h(new Runnable() { // from class: com.daaw.Ed3
            @Override // java.lang.Runnable
            public final void run() {
                this.B.d(c6675mz2W, jobParameters);
            }
        });
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().n().a("onUnbind called with null intent");
            return true;
        }
        k().s().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final C6675mz2 k() {
        return C9327wU2.H(this.a, null, null).w();
    }
}
