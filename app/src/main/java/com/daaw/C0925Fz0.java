package com.daaw;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.daaw.RunnableC2753Xi1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.daaw.Fz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0925Fz0 implements InterfaceC8997vI, InterfaceC4256eP {
    public static final String M = AbstractC1772Od0.f("Processor");
    public Context C;
    public androidx.work.a D;
    public InterfaceC8357t11 E;
    public WorkDatabase F;
    public List I;
    public Map H = new HashMap();
    public Map G = new HashMap();
    public Set J = new HashSet();
    public final List K = new ArrayList();
    public PowerManager.WakeLock B = null;
    public final Object L = new Object();

    /* JADX INFO: renamed from: com.daaw.Fz0$a */
    public static class a implements Runnable {
        public InterfaceC8997vI B;
        public String C;
        public InterfaceFutureC8236sc0 D;

        public a(InterfaceC8997vI interfaceC8997vI, String str, InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
            this.B = interfaceC8997vI;
            this.C = str;
            this.D = interfaceFutureC8236sc0;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.D.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.B.c(this.C, zBooleanValue);
        }
    }

    public C0925Fz0(Context context, androidx.work.a aVar, InterfaceC8357t11 interfaceC8357t11, WorkDatabase workDatabase, List list) {
        this.C = context;
        this.D = aVar;
        this.E = interfaceC8357t11;
        this.F = workDatabase;
        this.I = list;
    }

    public static boolean e(String str, RunnableC2753Xi1 runnableC2753Xi1) {
        if (runnableC2753Xi1 == null) {
            AbstractC1772Od0.c().a(M, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        runnableC2753Xi1.d();
        AbstractC1772Od0.c().a(M, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    @Override // com.daaw.InterfaceC4256eP
    public void a(String str, C3699cP c3699cP) {
        synchronized (this.L) {
            try {
                AbstractC1772Od0.c().d(M, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                RunnableC2753Xi1 runnableC2753Xi1 = (RunnableC2753Xi1) this.H.remove(str);
                if (runnableC2753Xi1 != null) {
                    if (this.B == null) {
                        PowerManager.WakeLock wakeLockB = AbstractC4900gg1.b(this.C, "ProcessorForegroundLck");
                        this.B = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.G.put(str, runnableC2753Xi1);
                    AbstractC9438ws.k(this.C, androidx.work.impl.foreground.a.d(this.C, str, c3699cP));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC4256eP
    public void b(String str) {
        synchronized (this.L) {
            this.G.remove(str);
            m();
        }
    }

    @Override // com.daaw.InterfaceC8997vI
    public void c(String str, boolean z) {
        synchronized (this.L) {
            try {
                this.H.remove(str);
                AbstractC1772Od0.c().a(M, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
                Iterator it = this.K.iterator();
                while (it.hasNext()) {
                    ((InterfaceC8997vI) it.next()).c(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(InterfaceC8997vI interfaceC8997vI) {
        synchronized (this.L) {
            this.K.add(interfaceC8997vI);
        }
    }

    public boolean f(String str) {
        boolean zContains;
        synchronized (this.L) {
            zContains = this.J.contains(str);
        }
        return zContains;
    }

    public boolean g(String str) {
        boolean z;
        synchronized (this.L) {
            try {
                z = this.H.containsKey(str) || this.G.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public boolean h(String str) {
        boolean zContainsKey;
        synchronized (this.L) {
            zContainsKey = this.G.containsKey(str);
        }
        return zContainsKey;
    }

    public void i(InterfaceC8997vI interfaceC8997vI) {
        synchronized (this.L) {
            this.K.remove(interfaceC8997vI);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) throws Throwable {
        Throwable th;
        synchronized (this.L) {
            try {
                try {
                    if (!g(str)) {
                        RunnableC2753Xi1 runnableC2753Xi1A = new RunnableC2753Xi1.c(this.C, this.D, this.E, this, this.F, str).c(this.I).b(aVar).a();
                        InterfaceFutureC8236sc0 interfaceFutureC8236sc0B = runnableC2753Xi1A.b();
                        interfaceFutureC8236sc0B.g(new a(this, str, interfaceFutureC8236sc0B), this.E.a());
                        this.H.put(str, runnableC2753Xi1A);
                        this.E.c().execute(runnableC2753Xi1A);
                        AbstractC1772Od0.c().a(M, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                        return true;
                    }
                    try {
                        AbstractC1772Od0.c().a(M, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            th = th;
            throw th;
        }
    }

    public boolean l(String str) {
        boolean zE;
        synchronized (this.L) {
            try {
                AbstractC1772Od0.c().a(M, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.J.add(str);
                RunnableC2753Xi1 runnableC2753Xi1 = (RunnableC2753Xi1) this.G.remove(str);
                boolean z = runnableC2753Xi1 != null;
                if (runnableC2753Xi1 == null) {
                    runnableC2753Xi1 = (RunnableC2753Xi1) this.H.remove(str);
                }
                zE = e(str, runnableC2753Xi1);
                if (z) {
                    m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zE;
    }

    public final void m() {
        synchronized (this.L) {
            try {
                if (this.G.isEmpty()) {
                    try {
                        this.C.startService(androidx.work.impl.foreground.a.e(this.C));
                    } catch (Throwable th) {
                        AbstractC1772Od0.c().b(M, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.B;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.B = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean n(String str) {
        boolean zE;
        synchronized (this.L) {
            AbstractC1772Od0.c().a(M, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zE = e(str, (RunnableC2753Xi1) this.G.remove(str));
        }
        return zE;
    }

    public boolean o(String str) {
        boolean zE;
        synchronized (this.L) {
            AbstractC1772Od0.c().a(M, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zE = e(str, (RunnableC2753Xi1) this.H.remove(str));
        }
        return zE;
    }
}
