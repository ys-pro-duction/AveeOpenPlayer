package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.daaw.AbstractC1772Od0;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.Ci1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0537Ci1 extends AbstractC0329Ai1 {
    public static final String j = AbstractC1772Od0.f("WorkManagerImpl");
    public static C0537Ci1 k = null;
    public static C0537Ci1 l = null;
    public static final Object m = new Object();
    public Context a;
    public androidx.work.a b;
    public WorkDatabase c;
    public InterfaceC8357t11 d;
    public List e;
    public C0925Fz0 f;
    public C4710fz0 g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;

    public C0537Ci1(Context context, androidx.work.a aVar, InterfaceC8357t11 interfaceC8357t11) {
        this(context, aVar, interfaceC8357t11, context.getResources().getBoolean(LC0.a));
    }

    public static void e(Context context, androidx.work.a aVar) {
        synchronized (m) {
            try {
                C0537Ci1 c0537Ci1 = k;
                if (c0537Ci1 != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c0537Ci1 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = new C0537Ci1(applicationContext, aVar, new C0650Di1(aVar.l()));
                    }
                    k = l;
                }
            } finally {
            }
        }
    }

    public static C0537Ci1 j() {
        synchronized (m) {
            try {
                C0537Ci1 c0537Ci1 = k;
                if (c0537Ci1 != null) {
                    return c0537Ci1;
                }
                return l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C0537Ci1 k(Context context) {
        C0537Ci1 c0537Ci1J;
        synchronized (m) {
            try {
                c0537Ci1J = j();
                if (c0537Ci1J == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0537Ci1J;
    }

    @Override // com.daaw.AbstractC0329Ai1
    public InterfaceC2054Qq0 a(String str) {
        AbstractRunnableC2959Zi abstractRunnableC2959ZiD = AbstractRunnableC2959Zi.d(str, this);
        this.d.b(abstractRunnableC2959ZiD);
        return abstractRunnableC2959ZiD.e();
    }

    @Override // com.daaw.AbstractC0329Ai1
    public InterfaceC2054Qq0 c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C7988ri1(this, list).a();
    }

    public InterfaceC2054Qq0 f(UUID uuid) {
        AbstractRunnableC2959Zi abstractRunnableC2959ZiB = AbstractRunnableC2959Zi.b(uuid, this);
        this.d.b(abstractRunnableC2959ZiB);
        return abstractRunnableC2959ZiB.e();
    }

    public List g(Context context, androidx.work.a aVar, InterfaceC8357t11 interfaceC8357t11) {
        return Arrays.asList(AbstractC9855yN0.a(context, this), new YT(context, aVar, interfaceC8357t11, this));
    }

    public Context h() {
        return this.a;
    }

    public androidx.work.a i() {
        return this.b;
    }

    public C4710fz0 l() {
        return this.g;
    }

    public C0925Fz0 m() {
        return this.f;
    }

    public List n() {
        return this.e;
    }

    public WorkDatabase o() {
        return this.c;
    }

    public InterfaceC8357t11 p() {
        return this.d;
    }

    public final void q(Context context, androidx.work.a aVar, InterfaceC8357t11 interfaceC8357t11, WorkDatabase workDatabase, List list, C0925Fz0 c0925Fz0) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = aVar;
        this.d = interfaceC8357t11;
        this.c = workDatabase;
        this.e = list;
        this.f = c0925Fz0;
        this.g = new C4710fz0(workDatabase);
        this.h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.b(new ForceStopRunnable(applicationContext, this));
    }

    public void r() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 23) {
            E01.b(h());
        }
        o().B().u();
        AbstractC9855yN0.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (m) {
            try {
                this.i = pendingResult;
                if (this.h) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.d.b(new RunnableC4285eW0(this, str, aVar));
    }

    public void w(String str) {
        this.d.b(new RunnableC8493tX0(this, str, true));
    }

    public void x(String str) {
        this.d.b(new RunnableC8493tX0(this, str, false));
    }

    public C0537Ci1(Context context, androidx.work.a aVar, InterfaceC8357t11 interfaceC8357t11, boolean z) {
        this(context, aVar, interfaceC8357t11, WorkDatabase.s(context.getApplicationContext(), interfaceC8357t11.c(), z));
    }

    public C0537Ci1(Context context, androidx.work.a aVar, InterfaceC8357t11 interfaceC8357t11, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        AbstractC1772Od0.e(new AbstractC1772Od0.a(aVar.j()));
        List listG = g(applicationContext, aVar, interfaceC8357t11);
        q(context, aVar, interfaceC8357t11, workDatabase, listG, new C0925Fz0(context, aVar, interfaceC8357t11, workDatabase, listG));
    }
}
