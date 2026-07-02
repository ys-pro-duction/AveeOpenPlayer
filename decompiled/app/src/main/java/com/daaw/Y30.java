package com.daaw;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public class Y30 implements InterfaceC1689Ni1 {
    public final Context a;
    public final XH b;
    public final AbstractC9018vN0 c;

    public Y30(Context context, XH xh, AbstractC9018vN0 abstractC9018vN0) {
        this.a = context;
        this.b = xh;
        this.c = abstractC9018vN0;
    }

    @Override // com.daaw.InterfaceC1689Ni1
    public void a(H51 h51, int i) {
        b(h51, i, false);
    }

    @Override // com.daaw.InterfaceC1689Ni1
    public void b(H51 h51, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int iC = c(h51);
        if (!z && d(jobScheduler, iC, i)) {
            AbstractC2732Xd0.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", h51);
            return;
        }
        long jI0 = this.b.I0(h51);
        JobInfo.Builder builderC = this.c.c(new JobInfo.Builder(iC, componentName), h51.d(), jI0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", h51.b());
        persistableBundle.putInt("priority", AbstractC9748xz0.a(h51.d()));
        if (h51.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(h51.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        AbstractC2732Xd0.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", h51, Integer.valueOf(iC), Long.valueOf(this.c.g(h51.d(), jI0, i)), Long.valueOf(jI0), Integer.valueOf(i));
        jobScheduler.schedule(builderC.build());
    }

    public int c(H51 h51) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(h51.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC9748xz0.a(h51.d())).array());
        if (h51.c() != null) {
            adler32.update(h51.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i, int i2) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
            }
        }
        return false;
    }
}
