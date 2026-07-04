package com.daaw;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.daaw.Xi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC2753Xi1 implements Runnable {
    public static final String U = AbstractC1772Od0.f("WorkerWrapper");
    public Context B;
    public String C;
    public List D;
    public WorkerParameters.a E;
    public C1793Oi1 F;
    public ListenableWorker G;
    public InterfaceC8357t11 H;
    public androidx.work.a J;
    public InterfaceC4256eP K;
    public WorkDatabase L;
    public InterfaceC1897Pi1 M;
    public InterfaceC6951nz N;
    public InterfaceC2233Si1 O;
    public List P;
    public String Q;
    public volatile boolean T;
    public ListenableWorker.a I = ListenableWorker.a.a();
    public AQ0 R = AQ0.t();
    public InterfaceFutureC8236sc0 S = null;

    /* JADX INFO: renamed from: com.daaw.Xi1$a */
    public class a implements Runnable {
        public final /* synthetic */ InterfaceFutureC8236sc0 B;
        public final /* synthetic */ AQ0 C;

        public a(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, AQ0 aq0) {
            this.B = interfaceFutureC8236sc0;
            this.C = aq0;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.B.get();
                AbstractC1772Od0.c().a(RunnableC2753Xi1.U, String.format("Starting work for %s", RunnableC2753Xi1.this.F.c), new Throwable[0]);
                RunnableC2753Xi1 runnableC2753Xi1 = RunnableC2753Xi1.this;
                runnableC2753Xi1.S = runnableC2753Xi1.G.startWork();
                this.C.r(RunnableC2753Xi1.this.S);
            } catch (Throwable th) {
                this.C.q(th);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Xi1$b */
    public class b implements Runnable {
        public final /* synthetic */ AQ0 B;
        public final /* synthetic */ String C;

        public b(AQ0 aq0, String str) {
            this.B = aq0;
            this.C = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.B.get();
                    if (aVar == null) {
                        AbstractC1772Od0.c().b(RunnableC2753Xi1.U, String.format("%s returned a null result. Treating it as a failure.", RunnableC2753Xi1.this.F.c), new Throwable[0]);
                    } else {
                        AbstractC1772Od0.c().a(RunnableC2753Xi1.U, String.format("%s returned a %s result.", RunnableC2753Xi1.this.F.c, aVar), new Throwable[0]);
                        RunnableC2753Xi1.this.I = aVar;
                    }
                    RunnableC2753Xi1.this.f();
                } catch (InterruptedException e) {
                    e = e;
                    AbstractC1772Od0.c().b(RunnableC2753Xi1.U, String.format("%s failed because it threw an exception/error", this.C), e);
                    RunnableC2753Xi1.this.f();
                } catch (CancellationException e2) {
                    AbstractC1772Od0.c().d(RunnableC2753Xi1.U, String.format("%s was cancelled", this.C), e2);
                    RunnableC2753Xi1.this.f();
                } catch (ExecutionException e3) {
                    e = e3;
                    AbstractC1772Od0.c().b(RunnableC2753Xi1.U, String.format("%s failed because it threw an exception/error", this.C), e);
                    RunnableC2753Xi1.this.f();
                }
            } catch (Throwable th) {
                RunnableC2753Xi1.this.f();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Xi1$c */
    public static class c {
        public Context a;
        public ListenableWorker b;
        public InterfaceC4256eP c;
        public InterfaceC8357t11 d;
        public androidx.work.a e;
        public WorkDatabase f;
        public String g;
        public List h;
        public WorkerParameters.a i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, InterfaceC8357t11 interfaceC8357t11, InterfaceC4256eP interfaceC4256eP, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.d = interfaceC8357t11;
            this.c = interfaceC4256eP;
            this.e = aVar;
            this.f = workDatabase;
            this.g = str;
        }

        public RunnableC2753Xi1 a() {
            return new RunnableC2753Xi1(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.i = aVar;
            }
            return this;
        }

        public c c(List list) {
            this.h = list;
            return this;
        }
    }

    public RunnableC2753Xi1(c cVar) {
        this.B = cVar.a;
        this.H = cVar.d;
        this.K = cVar.c;
        this.C = cVar.g;
        this.D = cVar.h;
        this.E = cVar.i;
        this.G = cVar.b;
        this.J = cVar.e;
        WorkDatabase workDatabase = cVar.f;
        this.L = workDatabase;
        this.M = workDatabase.B();
        this.N = this.L.t();
        this.O = this.L.C();
    }

    public final String a(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.C);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public InterfaceFutureC8236sc0 b() {
        return this.R;
    }

    public final void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            AbstractC1772Od0.c().d(U, String.format("Worker result SUCCESS for %s", this.Q), new Throwable[0]);
            if (this.F.d()) {
                h();
                return;
            } else {
                m();
                return;
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            AbstractC1772Od0.c().d(U, String.format("Worker result RETRY for %s", this.Q), new Throwable[0]);
            g();
            return;
        }
        AbstractC1772Od0.c().d(U, String.format("Worker result FAILURE for %s", this.Q), new Throwable[0]);
        if (this.F.d()) {
            h();
        } else {
            l();
        }
    }

    public void d() {
        boolean zIsDone;
        this.T = true;
        n();
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.S;
        if (interfaceFutureC8236sc0 != null) {
            zIsDone = interfaceFutureC8236sc0.isDone();
            this.S.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.G;
        if (listenableWorker == null || zIsDone) {
            AbstractC1772Od0.c().a(U, String.format("WorkSpec %s is already done. Not interrupting.", this.F), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    public final void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.M.l(str2) != EnumC9111vi1.CANCELLED) {
                this.M.k(EnumC9111vi1.FAILED, str2);
            }
            linkedList.addAll(this.N.a(str2));
        }
    }

    public void f() {
        if (!n()) {
            this.L.c();
            try {
                EnumC9111vi1 enumC9111vi1L = this.M.l(this.C);
                this.L.A().a(this.C);
                if (enumC9111vi1L == null) {
                    i(false);
                } else if (enumC9111vi1L == EnumC9111vi1.RUNNING) {
                    c(this.I);
                } else if (!enumC9111vi1L.a()) {
                    g();
                }
                this.L.r();
                this.L.g();
            } catch (Throwable th) {
                this.L.g();
                throw th;
            }
        }
        List list = this.D;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC8732uN0) it.next()).d(this.C);
            }
            AbstractC9855yN0.b(this.J, this.L, this.D);
        }
    }

    public final void g() {
        this.L.c();
        try {
            this.M.k(EnumC9111vi1.ENQUEUED, this.C);
            this.M.s(this.C, System.currentTimeMillis());
            this.M.b(this.C, -1L);
            this.L.r();
        } finally {
            this.L.g();
            i(true);
        }
    }

    public final void h() {
        this.L.c();
        try {
            this.M.s(this.C, System.currentTimeMillis());
            this.M.k(EnumC9111vi1.ENQUEUED, this.C);
            this.M.n(this.C);
            this.M.b(this.C, -1L);
            this.L.r();
        } finally {
            this.L.g();
            i(false);
        }
    }

    public final void i(boolean z) {
        ListenableWorker listenableWorker;
        this.L.c();
        try {
            if (!this.L.B().i()) {
                AbstractC3834cs0.a(this.B, RescheduleReceiver.class, false);
            }
            if (z) {
                this.M.k(EnumC9111vi1.ENQUEUED, this.C);
                this.M.b(this.C, -1L);
            }
            if (this.F != null && (listenableWorker = this.G) != null && listenableWorker.isRunInForeground()) {
                this.K.b(this.C);
            }
            this.L.r();
            this.L.g();
            this.R.p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.L.g();
            throw th;
        }
    }

    public final void j() {
        EnumC9111vi1 enumC9111vi1L = this.M.l(this.C);
        if (enumC9111vi1L == EnumC9111vi1.RUNNING) {
            AbstractC1772Od0.c().a(U, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.C), new Throwable[0]);
            i(true);
        } else {
            AbstractC1772Od0.c().a(U, String.format("Status for %s is %s; not doing any work", this.C, enumC9111vi1L), new Throwable[0]);
            i(false);
        }
    }

    public final void k() {
        androidx.work.b bVarB;
        if (n()) {
            return;
        }
        this.L.c();
        try {
            C1793Oi1 c1793Oi1M = this.M.m(this.C);
            this.F = c1793Oi1M;
            if (c1793Oi1M == null) {
                AbstractC1772Od0.c().b(U, String.format("Didn't find WorkSpec for id %s", this.C), new Throwable[0]);
                i(false);
                this.L.r();
                return;
            }
            if (c1793Oi1M.b != EnumC9111vi1.ENQUEUED) {
                j();
                this.L.r();
                AbstractC1772Od0.c().a(U, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.F.c), new Throwable[0]);
                return;
            }
            if (c1793Oi1M.d() || this.F.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1793Oi1 c1793Oi1 = this.F;
                if (c1793Oi1.n != 0 && jCurrentTimeMillis < c1793Oi1.a()) {
                    AbstractC1772Od0.c().a(U, String.format("Delaying execution for %s because it is being executed before schedule.", this.F.c), new Throwable[0]);
                    i(true);
                    this.L.r();
                    return;
                }
            }
            this.L.r();
            this.L.g();
            if (this.F.d()) {
                bVarB = this.F.e;
            } else {
                SZ szB = this.J.f().b(this.F.d);
                if (szB == null) {
                    AbstractC1772Od0.c().b(U, String.format("Could not create Input Merger %s", this.F.d), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.F.e);
                    arrayList.addAll(this.M.p(this.C));
                    bVarB = szB.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.C), bVarB, this.P, this.E, this.F.k, this.J.e(), this.H, this.J.m(), new C1378Ki1(this.L, this.H), new C8825ui1(this.L, this.K, this.H));
            if (this.G == null) {
                this.G = this.J.m().b(this.B, this.F.c, workerParameters);
            }
            ListenableWorker listenableWorker = this.G;
            if (listenableWorker == null) {
                AbstractC1772Od0.c().b(U, String.format("Could not create Worker %s", this.F.c), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                AbstractC1772Od0.c().b(U, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.F.c), new Throwable[0]);
                l();
                return;
            }
            this.G.setUsed();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            AQ0 aq0T = AQ0.t();
            RunnableC8546ti1 runnableC8546ti1 = new RunnableC8546ti1(this.B, this.F, this.G, workerParameters.b(), this.H);
            this.H.a().execute(runnableC8546ti1);
            InterfaceFutureC8236sc0 interfaceFutureC8236sc0A = runnableC8546ti1.a();
            interfaceFutureC8236sc0A.g(new a(interfaceFutureC8236sc0A, aq0T), this.H.a());
            aq0T.g(new b(aq0T, this.Q), this.H.c());
        } finally {
            this.L.g();
        }
    }

    public void l() {
        this.L.c();
        try {
            e(this.C);
            this.M.g(this.C, ((ListenableWorker.a.C0036a) this.I).e());
            this.L.r();
        } finally {
            this.L.g();
            i(false);
        }
    }

    public final void m() {
        this.L.c();
        try {
            this.M.k(EnumC9111vi1.SUCCEEDED, this.C);
            this.M.g(this.C, ((ListenableWorker.a.c) this.I).e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.N.a(this.C)) {
                if (this.M.l(str) == EnumC9111vi1.BLOCKED && this.N.b(str)) {
                    AbstractC1772Od0.c().d(U, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.M.k(EnumC9111vi1.ENQUEUED, str);
                    this.M.s(str, jCurrentTimeMillis);
                }
            }
            this.L.r();
            this.L.g();
            i(false);
        } catch (Throwable th) {
            this.L.g();
            i(false);
            throw th;
        }
    }

    public final boolean n() {
        if (!this.T) {
            return false;
        }
        AbstractC1772Od0.c().a(U, String.format("Work interrupted for %s", this.Q), new Throwable[0]);
        if (this.M.l(this.C) == null) {
            i(false);
        } else {
            i(!r1.a());
        }
        return true;
    }

    public final boolean o() {
        boolean z;
        this.L.c();
        try {
            if (this.M.l(this.C) == EnumC9111vi1.ENQUEUED) {
                this.M.k(EnumC9111vi1.RUNNING, this.C);
                this.M.r(this.C);
                z = true;
            } else {
                z = false;
            }
            this.L.r();
            this.L.g();
            return z;
        } catch (Throwable th) {
            this.L.g();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List listA = this.O.a(this.C);
        this.P = listA;
        this.Q = a(listA);
        k();
    }
}
