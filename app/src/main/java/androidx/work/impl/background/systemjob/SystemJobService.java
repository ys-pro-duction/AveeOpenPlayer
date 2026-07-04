package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.daaw.AbstractC1772Od0;
import com.daaw.C0537Ci1;
import com.daaw.InterfaceC8997vI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC8997vI {
    public static final String D = AbstractC1772Od0.f("SystemJobService");
    public C0537Ci1 B;
    public final Map C = new HashMap();

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.daaw.InterfaceC8997vI
    public void c(String str, boolean z) {
        JobParameters jobParameters;
        AbstractC1772Od0.c().a(D, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.C) {
            jobParameters = (JobParameters) this.C.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C0537Ci1 c0537Ci1K = C0537Ci1.k(getApplicationContext());
            this.B = c0537Ci1K;
            c0537Ci1K.m().d(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            AbstractC1772Od0.c().h(D, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C0537Ci1 c0537Ci1 = this.B;
        if (c0537Ci1 != null) {
            c0537Ci1.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.a aVar;
        if (this.B == null) {
            AbstractC1772Od0.c().a(D, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            AbstractC1772Od0.c().b(D, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.C) {
            try {
                if (this.C.containsKey(strA)) {
                    AbstractC1772Od0.c().a(D, String.format("Job is already being executed by SystemJobService: %s", strA), new Throwable[0]);
                    return false;
                }
                AbstractC1772Od0.c().a(D, String.format("onStartJob for %s", strA), new Throwable[0]);
                this.C.put(strA, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    aVar = new WorkerParameters.a();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        aVar.b = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        aVar.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i >= 28) {
                        aVar.c = jobParameters.getNetwork();
                    }
                } else {
                    aVar = null;
                }
                this.B.v(strA, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.B == null) {
            AbstractC1772Od0.c().a(D, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strA = a(jobParameters);
        if (TextUtils.isEmpty(strA)) {
            AbstractC1772Od0.c().b(D, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        AbstractC1772Od0.c().a(D, String.format("onStopJob for %s", strA), new Throwable[0]);
        synchronized (this.C) {
            this.C.remove(strA);
        }
        this.B.x(strA);
        return !this.B.m().f(strA);
    }
}
