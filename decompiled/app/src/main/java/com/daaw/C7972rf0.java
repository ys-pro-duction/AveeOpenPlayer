package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.daaw.rf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7972rf0 {
    public static Executor e = Executors.newCachedThreadPool();
    public final Set a;
    public final Set b;
    public final Handler c;
    public volatile C7415pf0 d;

    /* JADX INFO: renamed from: com.daaw.rf0$a */
    public class a extends FutureTask {
        public a(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                C7972rf0.this.j((C7415pf0) get());
            } catch (InterruptedException | ExecutionException e) {
                C7972rf0.this.j(new C7415pf0(e));
            }
        }
    }

    public C7972rf0(Callable callable) {
        this(callable, false);
    }

    public static /* synthetic */ void a(C7972rf0 c7972rf0) {
        C7415pf0 c7415pf0 = c7972rf0.d;
        if (c7415pf0 == null) {
            return;
        }
        if (c7415pf0.b() != null) {
            c7972rf0.g(c7415pf0.b());
        } else {
            c7972rf0.e(c7415pf0.a());
        }
    }

    public synchronized C7972rf0 c(InterfaceC6011kf0 interfaceC6011kf0) {
        try {
            C7415pf0 c7415pf0 = this.d;
            if (c7415pf0 != null && c7415pf0.a() != null) {
                interfaceC6011kf0.onResult(c7415pf0.a());
            }
            this.b.add(interfaceC6011kf0);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized C7972rf0 d(InterfaceC6011kf0 interfaceC6011kf0) {
        try {
            C7415pf0 c7415pf0 = this.d;
            if (c7415pf0 != null && c7415pf0.b() != null) {
                interfaceC6011kf0.onResult(c7415pf0.b());
            }
            this.a.add(interfaceC6011kf0);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized void e(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            AbstractC1876Pd0.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC6011kf0) it.next()).onResult(th);
        }
    }

    public final void f() {
        this.c.post(new Runnable() { // from class: com.daaw.qf0
            @Override // java.lang.Runnable
            public final void run() {
                C7972rf0.a(this.B);
            }
        });
    }

    public final synchronized void g(Object obj) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC6011kf0) it.next()).onResult(obj);
        }
    }

    public synchronized C7972rf0 h(InterfaceC6011kf0 interfaceC6011kf0) {
        this.b.remove(interfaceC6011kf0);
        return this;
    }

    public synchronized C7972rf0 i(InterfaceC6011kf0 interfaceC6011kf0) {
        this.a.remove(interfaceC6011kf0);
        return this;
    }

    public final void j(C7415pf0 c7415pf0) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = c7415pf0;
        f();
    }

    public C7972rf0(Callable callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (!z) {
            e.execute(new a(callable));
            return;
        }
        try {
            j((C7415pf0) callable.call());
        } catch (Throwable th) {
            j(new C7415pf0(th));
        }
    }
}
