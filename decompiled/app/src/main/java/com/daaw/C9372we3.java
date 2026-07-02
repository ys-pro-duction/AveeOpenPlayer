package com.daaw;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* JADX INFO: renamed from: com.daaw.we3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9372we3 extends Be3 {
    public final AlarmManager d;
    public AbstractC0585Cu1 e;
    public Integer f;

    public C9372we3(C8812uf3 c8812uf3) {
        super(c8812uf3);
        this.d = (AlarmManager) this.a.v().getSystemService("alarm");
    }

    private final void n() {
        JobScheduler jobScheduler = (JobScheduler) this.a.v().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(k());
        }
    }

    @Override // com.daaw.Be3
    public final boolean h() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(l());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        n();
        return false;
    }

    public final void i() {
        e();
        this.a.w().s().a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(l());
        }
        m().b();
        if (Build.VERSION.SDK_INT >= 24) {
            n();
        }
    }

    public final void j(long j) {
        e();
        this.a.a();
        Context contextV = this.a.v();
        if (!Pf3.a0(contextV)) {
            this.a.w().m().a("Receiver not registered/enabled");
        }
        if (!Pf3.b0(contextV, false)) {
            this.a.w().m().a("Service not registered/enabled");
        }
        i();
        this.a.w().s().b("Scheduling upload, millis", Long.valueOf(j));
        long jB = this.a.p().b() + j;
        this.a.z();
        if (j < Math.max(0L, ((Long) AbstractC1311Jr2.z.a(null)).longValue()) && !m().e()) {
            m().d(j);
        }
        this.a.a();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.d;
            if (alarmManager != null) {
                this.a.z();
                alarmManager.setInexactRepeating(2, jB, Math.max(((Long) AbstractC1311Jr2.u.a(null)).longValue(), j), l());
                return;
            }
            return;
        }
        Context contextV2 = this.a.v();
        ComponentName componentName = new ComponentName(contextV2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iK = k();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        AbstractC7622qO1.a(contextV2, new JobInfo.Builder(iK, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final int k() {
        if (this.f == null) {
            this.f = Integer.valueOf("measurement".concat(String.valueOf(this.a.v().getPackageName())).hashCode());
        }
        return this.f.intValue();
    }

    public final PendingIntent l() {
        Context contextV = this.a.v();
        return PendingIntent.getBroadcast(contextV, 0, new Intent().setClassName(contextV, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), KN1.a);
    }

    public final AbstractC0585Cu1 m() {
        if (this.e == null) {
            this.e = new C8528te3(this, this.b.b0());
        }
        return this.e;
    }
}
