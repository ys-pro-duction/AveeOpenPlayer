package com.daaw;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.daaw.C8315ss;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class D01 {
    public static final String b = AbstractC1772Od0.f("SystemJobInfoConverter");
    public final ComponentName a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1189In0.values().length];
            a = iArr;
            try {
                iArr[EnumC1189In0.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC1189In0.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC1189In0.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC1189In0.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC1189In0.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public D01(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri b(C8315ss.a aVar) {
        boolean zB = aVar.b();
        C01.a();
        return B01.a(aVar.a(), zB ? 1 : 0);
    }

    public static int c(EnumC1189In0 enumC1189In0) {
        int i = a.a[enumC1189In0.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        AbstractC1772Od0.c().a(b, String.format("API version too low. Cannot convert network type value %s", enumC1189In0), new Throwable[0]);
        return 1;
    }

    public static void d(JobInfo.Builder builder, EnumC1189In0 enumC1189In0) {
        if (Build.VERSION.SDK_INT < 30 || enumC1189In0 != EnumC1189In0.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(enumC1189In0));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(C1793Oi1 c1793Oi1, int i) {
        C6358lr c6358lr = c1793Oi1.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c1793Oi1.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c1793Oi1.d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.a).setRequiresCharging(c6358lr.g()).setRequiresDeviceIdle(c6358lr.h()).setExtras(persistableBundle);
        d(extras, c6358lr.b());
        if (!c6358lr.h()) {
            extras.setBackoffCriteria(c1793Oi1.m, c1793Oi1.l == EnumC5167he.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(c1793Oi1.a() - System.currentTimeMillis(), 0L);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c1793Oi1.q) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24 && c6358lr.e()) {
            Iterator it = c6358lr.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((C8315ss.a) it.next()));
            }
            extras.setTriggerContentUpdateDelay(c6358lr.c());
            extras.setTriggerContentMaxDelay(c6358lr.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(c6358lr.f());
            extras.setRequiresStorageNotLow(c6358lr.i());
        }
        boolean z = c1793Oi1.k > 0;
        if (C7703qh.b() && c1793Oi1.q && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
