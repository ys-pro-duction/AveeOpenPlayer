package androidx.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import com.daaw.AQ0;
import com.daaw.InterfaceFutureC8236sc0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public AQ0 G;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.G.p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.G.q(th);
            }
        }
    }

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC8236sc0 startWork() {
        this.G = AQ0.t();
        getBackgroundExecutor().execute(new a());
        return this.G;
    }
}
