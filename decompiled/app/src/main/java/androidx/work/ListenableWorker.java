package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import com.daaw.AQ0;
import com.daaw.AbstractC2649Wi1;
import com.daaw.C3699cP;
import com.daaw.InterfaceC8357t11;
import com.daaw.InterfaceFutureC8236sc0;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {
    public Context B;
    public WorkerParameters C;
    public volatile boolean D;
    public boolean E;
    public boolean F;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0036a extends a {
            public final androidx.work.b a;

            public C0036a() {
                this(androidx.work.b.c);
            }

            public androidx.work.b e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0036a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0036a) obj).a);
            }

            public int hashCode() {
                return (C0036a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }

            public C0036a(androidx.work.b bVar) {
                this.a = bVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {
            public final androidx.work.b a;

            public c() {
                this(androidx.work.b.c);
            }

            public androidx.work.b e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }

            public c(androidx.work.b bVar) {
                this.a = bVar;
            }
        }

        public static a a() {
            return new C0036a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.B = context;
        this.C = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.B;
    }

    public Executor getBackgroundExecutor() {
        return this.C.a();
    }

    public InterfaceFutureC8236sc0 getForegroundInfoAsync() {
        AQ0 aq0T = AQ0.t();
        aq0T.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return aq0T;
    }

    public final UUID getId() {
        return this.C.c();
    }

    public final b getInputData() {
        return this.C.d();
    }

    public final Network getNetwork() {
        return this.C.e();
    }

    public final int getRunAttemptCount() {
        return this.C.g();
    }

    public final Set<String> getTags() {
        return this.C.h();
    }

    public InterfaceC8357t11 getTaskExecutor() {
        return this.C.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.C.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.C.k();
    }

    public AbstractC2649Wi1 getWorkerFactory() {
        return this.C.l();
    }

    public boolean isRunInForeground() {
        return this.F;
    }

    public final boolean isStopped() {
        return this.D;
    }

    public final boolean isUsed() {
        return this.E;
    }

    public void onStopped() {
    }

    public final InterfaceFutureC8236sc0 setForegroundAsync(C3699cP c3699cP) {
        this.F = true;
        return this.C.b().a(getApplicationContext(), getId(), c3699cP);
    }

    public InterfaceFutureC8236sc0 setProgressAsync(b bVar) {
        return this.C.f().a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z) {
        this.F = z;
    }

    public final void setUsed() {
        this.E = true;
    }

    public abstract InterfaceFutureC8236sc0 startWork();

    public final void stop() {
        this.D = true;
        onStopped();
    }
}
