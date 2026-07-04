package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class DQ {
    public final Executor a;
    public final LQ b;
    public final Object c;
    public int d;
    public boolean e;
    public boolean f;
    public final List g;
    public final Runnable h;

    public DQ(Executor executor, LQ lq) {
        G10.g(executor, "executor");
        G10.g(lq, "reportFullyDrawn");
        this.a = executor;
        this.b = lq;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new Runnable() { // from class: com.daaw.CQ
            @Override // java.lang.Runnable
            public final void run() {
                DQ.d(this.B);
            }
        };
    }

    public static final void d(DQ dq) {
        G10.g(dq, "this$0");
        synchronized (dq.c) {
            try {
                dq.e = false;
                if (dq.d == 0 && !dq.f) {
                    dq.b.invoke();
                    dq.b();
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.f = true;
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((LQ) it.next()).invoke();
                }
                this.g.clear();
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.f;
        }
        return z;
    }
}
