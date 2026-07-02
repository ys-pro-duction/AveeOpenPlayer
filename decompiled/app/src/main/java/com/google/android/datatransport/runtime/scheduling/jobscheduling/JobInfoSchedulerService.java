package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.daaw.AbstractC9748xz0;
import com.daaw.H51;
import com.daaw.P51;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        P51.f(getApplicationContext());
        H51.a aVarD = H51.a().b(string).d(AbstractC9748xz0.b(i));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        P51.c().e().m(aVarD.a(), i2, new Runnable() { // from class: com.daaw.Z30
            @Override // java.lang.Runnable
            public final void run() {
                this.B.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
