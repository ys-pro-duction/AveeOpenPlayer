package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.daaw.AbstractC1772Od0;
import com.daaw.AbstractC4900gg1;
import com.daaw.C0537Ci1;
import com.daaw.C0925Fz0;
import com.daaw.C2441Ui1;
import com.daaw.InterfaceC8357t11;
import com.daaw.InterfaceC8997vI;
import com.daaw.WP0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceC8997vI {
    public static final String L = AbstractC1772Od0.f("SystemAlarmDispatcher");
    public final Context B;
    public final InterfaceC8357t11 C;
    public final C2441Ui1 D;
    public final C0925Fz0 E;
    public final C0537Ci1 F;
    public final androidx.work.impl.background.systemalarm.a G;
    public final Handler H;
    public final List I;
    public Intent J;
    public c K;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.I) {
                d dVar = d.this;
                dVar.J = (Intent) dVar.I.get(0);
            }
            Intent intent = d.this.J;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.J.getIntExtra("KEY_START_ID", 0);
                AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
                String str = d.L;
                abstractC1772Od0C.a(str, String.format("Processing command %s, %s", d.this.J, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockB = AbstractC4900gg1.b(d.this.B, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    AbstractC1772Od0.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.acquire();
                    d dVar2 = d.this;
                    dVar2.G.p(dVar2.J, intExtra, dVar2);
                    AbstractC1772Od0.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.release();
                    d dVar3 = d.this;
                    dVar3.k(new RunnableC0039d(dVar3));
                } catch (Throwable th) {
                    try {
                        AbstractC1772Od0 abstractC1772Od0C2 = AbstractC1772Od0.c();
                        String str2 = d.L;
                        abstractC1772Od0C2.b(str2, "Unexpected error in onHandleIntent", th);
                        AbstractC1772Od0.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        d dVar4 = d.this;
                        dVar4.k(new RunnableC0039d(dVar4));
                    } catch (Throwable th2) {
                        AbstractC1772Od0.c().a(d.L, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        d dVar5 = d.this;
                        dVar5.k(new RunnableC0039d(dVar5));
                        throw th2;
                    }
                }
            }
        }
    }

    public static class b implements Runnable {
        public final d B;
        public final Intent C;
        public final int D;

        public b(d dVar, Intent intent, int i) {
            this.B = dVar;
            this.C = intent;
            this.D = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.a(this.C, this.D);
        }
    }

    public interface c {
        void a();
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    public static class RunnableC0039d implements Runnable {
        public final d B;

        public RunnableC0039d(d dVar) {
            this.B = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.d();
        }
    }

    public d(Context context) {
        this(context, null, null);
    }

    public boolean a(Intent intent, int i) {
        AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
        String str = L;
        abstractC1772Od0C.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC1772Od0.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.I) {
            try {
                boolean zIsEmpty = this.I.isEmpty();
                this.I.add(intent);
                if (zIsEmpty) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void b() {
        if (this.H.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // com.daaw.InterfaceC8997vI
    public void c(String str, boolean z) {
        k(new b(this, androidx.work.impl.background.systemalarm.a.d(this.B, str, z), 0));
    }

    public void d() {
        AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
        String str = L;
        abstractC1772Od0C.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.I) {
            try {
                if (this.J != null) {
                    AbstractC1772Od0.c().a(str, String.format("Removing command %s", this.J), new Throwable[0]);
                    if (!((Intent) this.I.remove(0)).equals(this.J)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.J = null;
                }
                WP0 wp0C = this.C.c();
                if (!this.G.o() && this.I.isEmpty() && !wp0C.a()) {
                    AbstractC1772Od0.c().a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.K;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.I.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0925Fz0 e() {
        return this.E;
    }

    public InterfaceC8357t11 f() {
        return this.C;
    }

    public C0537Ci1 g() {
        return this.F;
    }

    public C2441Ui1 h() {
        return this.D;
    }

    public final boolean i(String str) {
        b();
        synchronized (this.I) {
            try {
                Iterator it = this.I.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        AbstractC1772Od0.c().a(L, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.E.i(this);
        this.D.a();
        this.K = null;
    }

    public void k(Runnable runnable) {
        this.H.post(runnable);
    }

    public final void l() {
        b();
        PowerManager.WakeLock wakeLockB = AbstractC4900gg1.b(this.B, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.F.p().b(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public void m(c cVar) {
        if (this.K != null) {
            AbstractC1772Od0.c().b(L, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.K = cVar;
        }
    }

    public d(Context context, C0925Fz0 c0925Fz0, C0537Ci1 c0537Ci1) {
        Context applicationContext = context.getApplicationContext();
        this.B = applicationContext;
        this.G = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.D = new C2441Ui1();
        c0537Ci1 = c0537Ci1 == null ? C0537Ci1.k(context) : c0537Ci1;
        this.F = c0537Ci1;
        c0925Fz0 = c0925Fz0 == null ? c0537Ci1.m() : c0925Fz0;
        this.E = c0925Fz0;
        this.C = c0537Ci1.p();
        c0925Fz0.d(this);
        this.I = new ArrayList();
        this.J = null;
        this.H = new Handler(Looper.getMainLooper());
    }
}
