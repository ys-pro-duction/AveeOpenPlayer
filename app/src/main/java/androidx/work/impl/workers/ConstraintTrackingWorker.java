package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.daaw.AQ0;
import com.daaw.AbstractC1772Od0;
import com.daaw.C0537Ci1;
import com.daaw.C1793Oi1;
import com.daaw.C7431pi1;
import com.daaw.InterfaceC7152oi1;
import com.daaw.InterfaceC8357t11;
import com.daaw.InterfaceFutureC8236sc0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC7152oi1 {
    public static final String L = AbstractC1772Od0.f("ConstraintTrkngWrkr");
    public WorkerParameters G;
    public final Object H;
    public volatile boolean I;
    public AQ0 J;
    public ListenableWorker K;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ InterfaceFutureC8236sc0 B;

        public b(InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
            this.B = interfaceFutureC8236sc0;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.H) {
                try {
                    if (ConstraintTrackingWorker.this.I) {
                        ConstraintTrackingWorker.this.d();
                    } else {
                        ConstraintTrackingWorker.this.J.r(this.B);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.G = workerParameters;
        this.H = new Object();
        this.I = false;
        this.J = AQ0.t();
    }

    public WorkDatabase a() {
        return C0537Ci1.k(getApplicationContext()).o();
    }

    @Override // com.daaw.InterfaceC7152oi1
    public void b(List list) {
        AbstractC1772Od0.c().a(L, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.H) {
            this.I = true;
        }
    }

    public void c() {
        this.J.p(ListenableWorker.a.a());
    }

    public void d() {
        this.J.p(ListenableWorker.a.b());
    }

    public void e() {
        String strI = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strI)) {
            AbstractC1772Od0.c().b(L, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker listenableWorkerB = getWorkerFactory().b(getApplicationContext(), strI, this.G);
        this.K = listenableWorkerB;
        if (listenableWorkerB == null) {
            AbstractC1772Od0.c().a(L, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        C1793Oi1 c1793Oi1M = a().B().m(getId().toString());
        if (c1793Oi1M == null) {
            c();
            return;
        }
        C7431pi1 c7431pi1 = new C7431pi1(getApplicationContext(), getTaskExecutor(), this);
        c7431pi1.d(Collections.singletonList(c1793Oi1M));
        if (!c7431pi1.c(getId().toString())) {
            AbstractC1772Od0.c().a(L, String.format("Constraints not met for delegate %s. Requesting retry.", strI), new Throwable[0]);
            d();
            return;
        }
        AbstractC1772Od0.c().a(L, String.format("Constraints met for delegate %s", strI), new Throwable[0]);
        try {
            InterfaceFutureC8236sc0 interfaceFutureC8236sc0StartWork = this.K.startWork();
            interfaceFutureC8236sc0StartWork.g(new b(interfaceFutureC8236sc0StartWork), getBackgroundExecutor());
        } catch (Throwable th) {
            AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
            String str = L;
            abstractC1772Od0C.a(str, String.format("Delegated worker %s threw exception in startWork.", strI), th);
            synchronized (this.H) {
                try {
                    if (this.I) {
                        AbstractC1772Od0.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC7152oi1
    public void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceC8357t11 getTaskExecutor() {
        return C0537Ci1.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.K;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.K;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.K.stop();
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC8236sc0 startWork() {
        getBackgroundExecutor().execute(new a());
        return this.J;
    }
}
