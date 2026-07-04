package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import com.daaw.AbstractC0821Ez0;
import com.daaw.AbstractC1772Od0;
import com.daaw.AbstractC8267si1;
import com.daaw.AbstractC9855yN0;
import com.daaw.C0537Ci1;
import com.daaw.C1793Oi1;
import com.daaw.C7703qh;
import com.daaw.E01;
import com.daaw.EnumC9111vi1;
import com.daaw.InterfaceC1170Ii1;
import com.daaw.InterfaceC1897Pi1;
import com.daaw.ZO;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    public static final String E = AbstractC1772Od0.f("ForceStopRunnable");
    public static final long F = TimeUnit.DAYS.toMillis(3650);
    public final Context B;
    public final C0537Ci1 C;
    public int D = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = AbstractC1772Od0.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC1772Od0.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, C0537Ci1 c0537Ci1) {
        this.B = context.getApplicationContext();
        this.C = c0537Ci1;
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, c(context), i);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, C7703qh.b() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + F;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = Build.VERSION.SDK_INT >= 23 ? E01.i(this.B, this.C) : false;
        WorkDatabase workDatabaseO = this.C.o();
        InterfaceC1897Pi1 interfaceC1897Pi1B = workDatabaseO.B();
        InterfaceC1170Ii1 interfaceC1170Ii1A = workDatabaseO.A();
        workDatabaseO.c();
        try {
            List<C1793Oi1> listH = interfaceC1897Pi1B.h();
            boolean z = (listH == null || listH.isEmpty()) ? false : true;
            if (z) {
                for (C1793Oi1 c1793Oi1 : listH) {
                    interfaceC1897Pi1B.k(EnumC9111vi1.ENQUEUED, c1793Oi1.a);
                    interfaceC1897Pi1B.b(c1793Oi1.a, -1L);
                }
            }
            interfaceC1170Ii1A.c();
            workDatabaseO.r();
            workDatabaseO.g();
            return z || zI;
        } catch (Throwable th) {
            workDatabaseO.g();
            throw th;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            AbstractC1772Od0.c().a(E, "Rescheduling Workers.", new Throwable[0]);
            this.C.s();
            this.C.l().c(false);
        } else if (e()) {
            AbstractC1772Od0.c().a(E, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.C.s();
        } else if (zA) {
            AbstractC1772Od0.c().a(E, "Found unfinished work, scheduling it.", new Throwable[0]);
            AbstractC9855yN0.b(this.C.i(), this.C.o(), this.C.n());
        }
    }

    public boolean e() {
        try {
            PendingIntent pendingIntentD = d(this.B, C7703qh.b() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.B.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i = 0; i < historicalProcessExitReasons.size(); i++) {
                        if (ZO.a(historicalProcessExitReasons.get(i)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.B);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            e = e;
            AbstractC1772Od0.c().h(E, "Ignoring exception", e);
            return true;
        } catch (SecurityException e2) {
            e = e2;
            AbstractC1772Od0.c().h(E, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a aVarI = this.C.i();
        if (TextUtils.isEmpty(aVarI.c())) {
            AbstractC1772Od0.c().a(E, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zB = AbstractC0821Ez0.b(this.B, aVarI);
        AbstractC1772Od0.c().a(E, String.format("Is default app process = %s", Boolean.valueOf(zB)), new Throwable[0]);
        return zB;
    }

    public boolean h() {
        return this.C.l().a();
    }

    public void i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (!f()) {
                return;
            }
            while (true) {
                AbstractC8267si1.e(this.B);
                AbstractC1772Od0.c().a(E, "Performing cleanup operations.", new Throwable[0]);
                try {
                    b();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    i = this.D + 1;
                    this.D = i;
                    if (i >= 3) {
                        AbstractC1772Od0.c().b(E, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        this.C.i().d();
                        throw illegalStateException;
                    }
                    AbstractC1772Od0.c().a(E, String.format("Retrying after %s", Long.valueOf(((long) i) * 300)), e);
                    i(((long) this.D) * 300);
                }
                AbstractC1772Od0.c().a(E, String.format("Retrying after %s", Long.valueOf(((long) i) * 300)), e);
                i(((long) this.D) * 300);
            }
        } finally {
            this.C.r();
        }
    }
}
