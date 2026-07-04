package androidx.work;

import android.os.Build;
import com.daaw.AbstractC2649Wi1;
import com.daaw.C1436Kx;
import com.daaw.EZ;
import com.daaw.InterfaceC8162sK0;
import com.daaw.TZ;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Executor a;
    public final Executor b;
    public final AbstractC2649Wi1 c;
    public final TZ d;
    public final InterfaceC8162sK0 e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0037a implements ThreadFactory {
        public final AtomicInteger B = new AtomicInteger(0);
        public final /* synthetic */ boolean C;

        public ThreadFactoryC0037a(boolean z) {
            this.C = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.C ? "WM.task-" : "androidx.work-") + this.B.incrementAndGet());
        }
    }

    public static final class b {
        public Executor a;
        public AbstractC2649Wi1 b;
        public TZ c;
        public Executor d;
        public InterfaceC8162sK0 e;
        public String f;
        public int g = 4;
        public int h = 0;
        public int i = Integer.MAX_VALUE;
        public int j = 20;

        public a a() {
            return new a(this);
        }
    }

    public a(b bVar) {
        Executor executor = bVar.a;
        if (executor == null) {
            this.a = a(false);
        } else {
            this.a = executor;
        }
        Executor executor2 = bVar.d;
        if (executor2 == null) {
            this.k = true;
            this.b = a(true);
        } else {
            this.k = false;
            this.b = executor2;
        }
        AbstractC2649Wi1 abstractC2649Wi1 = bVar.b;
        if (abstractC2649Wi1 == null) {
            this.c = AbstractC2649Wi1.c();
        } else {
            this.c = abstractC2649Wi1;
        }
        TZ tz = bVar.c;
        if (tz == null) {
            this.d = TZ.c();
        } else {
            this.d = tz;
        }
        InterfaceC8162sK0 interfaceC8162sK0 = bVar.e;
        if (interfaceC8162sK0 == null) {
            this.e = new C1436Kx();
        } else {
            this.e = interfaceC8162sK0;
        }
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.f = bVar.f;
    }

    public final Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z));
    }

    public final ThreadFactory b(boolean z) {
        return new ThreadFactoryC0037a(z);
    }

    public String c() {
        return this.f;
    }

    public EZ d() {
        return null;
    }

    public Executor e() {
        return this.a;
    }

    public TZ f() {
        return this.d;
    }

    public int g() {
        return this.i;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.j / 2 : this.j;
    }

    public int i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    public InterfaceC8162sK0 k() {
        return this.e;
    }

    public Executor l() {
        return this.b;
    }

    public AbstractC2649Wi1 m() {
        return this.c;
    }
}
