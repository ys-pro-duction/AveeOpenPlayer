package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9722xt {
    public final Executor a;
    public AbstractC6963o11 b = A11.e(null);
    public final Object c = new Object();
    public final ThreadLocal d = new ThreadLocal();

    /* JADX INFO: renamed from: com.daaw.xt$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9722xt.this.d.set(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.xt$b */
    public class b implements Callable {
        public final /* synthetic */ Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.a.run();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.xt$c */
    public class c implements InterfaceC1519Ls {
        public final /* synthetic */ Callable a;

        public c(Callable callable) {
            this.a = callable;
        }

        @Override // com.daaw.InterfaceC1519Ls
        public Object a(AbstractC6963o11 abstractC6963o11) {
            return this.a.call();
        }
    }

    /* JADX INFO: renamed from: com.daaw.xt$d */
    public class d implements InterfaceC1519Ls {
        public d() {
        }

        @Override // com.daaw.InterfaceC1519Ls
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(AbstractC6963o11 abstractC6963o11) {
            return null;
        }
    }

    public C9722xt(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    public final AbstractC6963o11 d(AbstractC6963o11 abstractC6963o11) {
        return abstractC6963o11.g(this.a, new d());
    }

    public final boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    public final InterfaceC1519Ls f(Callable callable) {
        return new c(callable);
    }

    public AbstractC6963o11 g(Runnable runnable) {
        return h(new b(runnable));
    }

    public AbstractC6963o11 h(Callable callable) {
        AbstractC6963o11 abstractC6963o11G;
        synchronized (this.c) {
            abstractC6963o11G = this.b.g(this.a, f(callable));
            this.b = d(abstractC6963o11G);
        }
        return abstractC6963o11G;
    }

    public AbstractC6963o11 i(Callable callable) {
        AbstractC6963o11 abstractC6963o11I;
        synchronized (this.c) {
            abstractC6963o11I = this.b.i(this.a, f(callable));
            this.b = d(abstractC6963o11I);
        }
        return abstractC6963o11I;
    }
}
