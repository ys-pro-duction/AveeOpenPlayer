package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.daaw.Nd3;
import com.daaw.Qd3;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements Nd3 {
    public Qd3 B;

    @Override // com.daaw.Nd3
    public final void a(Intent intent) {
    }

    @Override // com.daaw.Nd3
    public final void b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.daaw.Nd3
    public final boolean c(int i) {
        throw new UnsupportedOperationException();
    }

    public final Qd3 d() {
        if (this.B == null) {
            this.B = new Qd3(this);
        }
        return this.B;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        d().g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        d().i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d().j(intent);
        return true;
    }
}
