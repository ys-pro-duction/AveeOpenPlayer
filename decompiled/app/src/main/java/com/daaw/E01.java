package com.daaw;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class E01 implements InterfaceC8732uN0 {
    public static final String F = AbstractC1772Od0.f("SystemJobScheduler");
    public final Context B;
    public final JobScheduler C;
    public final C0537Ci1 D;
    public final D01 E;

    public E01(Context context, C0537Ci1 c0537Ci1) {
        this(context, c0537Ci1, (JobScheduler) context.getSystemService("jobscheduler"), new D01(context));
    }

    public static void b(Context context) {
        List listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static void c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            AbstractC1772Od0.c().b(F, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC1772Od0.c().b(F, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, C0537Ci1 c0537Ci1) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List listA = c0537Ci1.o().y().a();
        boolean z = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                String strH = h(jobInfo);
                if (TextUtils.isEmpty(strH)) {
                    c(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strH);
                }
            }
        }
        Iterator it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                AbstractC1772Od0.c().a(F, "Reconciling jobs", new Throwable[0]);
                z = true;
                break;
            }
        }
        if (!z) {
            return z;
        }
        WorkDatabase workDatabaseO = c0537Ci1.o();
        workDatabaseO.c();
        try {
            InterfaceC1897Pi1 interfaceC1897Pi1B = workDatabaseO.B();
            Iterator it2 = listA.iterator();
            while (it2.hasNext()) {
                interfaceC1897Pi1B.b((String) it2.next(), -1L);
            }
            workDatabaseO.r();
            workDatabaseO.g();
            return z;
        } catch (Throwable th) {
            workDatabaseO.g();
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC8732uN0
    public boolean a() {
        return true;
    }

    @Override // com.daaw.InterfaceC8732uN0
    public void d(String str) {
        List listF = f(this.B, this.C, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            c(this.C, ((Integer) it.next()).intValue());
        }
        this.D.o().y().d(str);
    }

    @Override // com.daaw.InterfaceC8732uN0
    public void e(C1793Oi1... c1793Oi1Arr) {
        List listF;
        WorkDatabase workDatabaseO = this.D.o();
        RX rx = new RX(workDatabaseO);
        for (C1793Oi1 c1793Oi1 : c1793Oi1Arr) {
            workDatabaseO.c();
            try {
                C1793Oi1 c1793Oi1M = workDatabaseO.B().m(c1793Oi1.a);
                if (c1793Oi1M == null) {
                    AbstractC1772Od0.c().h(F, "Skipping scheduling " + c1793Oi1.a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseO.r();
                } else if (c1793Oi1M.b != EnumC9111vi1.ENQUEUED) {
                    AbstractC1772Od0.c().h(F, "Skipping scheduling " + c1793Oi1.a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseO.r();
                } else {
                    C7237p01 c7237p01C = workDatabaseO.y().c(c1793Oi1.a);
                    int iD = c7237p01C != null ? c7237p01C.b : rx.d(this.D.i().i(), this.D.i().g());
                    if (c7237p01C == null) {
                        this.D.o().y().b(new C7237p01(c1793Oi1.a, iD));
                    }
                    j(c1793Oi1, iD);
                    if (Build.VERSION.SDK_INT == 23 && (listF = f(this.B, this.C, c1793Oi1.a)) != null) {
                        int iIndexOf = listF.indexOf(Integer.valueOf(iD));
                        if (iIndexOf >= 0) {
                            listF.remove(iIndexOf);
                        }
                        j(c1793Oi1, !listF.isEmpty() ? ((Integer) listF.get(0)).intValue() : rx.d(this.D.i().i(), this.D.i().g()));
                    }
                    workDatabaseO.r();
                }
            } finally {
                workDatabaseO.g();
            }
        }
    }

    public void j(C1793Oi1 c1793Oi1, int i) {
        JobInfo jobInfoA = this.E.a(c1793Oi1, i);
        AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
        String str = F;
        abstractC1772Od0C.a(str, String.format("Scheduling work ID %s Job ID %s", c1793Oi1.a, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.C.schedule(jobInfoA) == 0) {
                AbstractC1772Od0.c().h(str, String.format("Unable to schedule work ID %s", c1793Oi1.a), new Throwable[0]);
                if (c1793Oi1.q && c1793Oi1.r == EnumC6638mr0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c1793Oi1.q = false;
                    AbstractC1772Od0.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", c1793Oi1.a), new Throwable[0]);
                    j(c1793Oi1, i);
                }
            }
        } catch (IllegalStateException e) {
            List listG = g(this.B, this.C);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.D.o().B().f().size()), Integer.valueOf(this.D.i().h()));
            AbstractC1772Od0.c().b(F, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e);
        } catch (Throwable th) {
            AbstractC1772Od0.c().b(F, String.format("Unable to schedule %s", c1793Oi1), th);
        }
    }

    public E01(Context context, C0537Ci1 c0537Ci1, JobScheduler jobScheduler, D01 d01) {
        this.B = context;
        this.D = c0537Ci1;
        this.C = jobScheduler;
        this.E = d01;
    }
}
