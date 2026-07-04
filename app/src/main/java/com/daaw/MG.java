package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.RG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class MG implements RG.a {
    public static final b q = new b();
    public static final Handler r = new Handler(Looper.getMainLooper(), new c());
    public final List a;
    public final b b;
    public final NG c;
    public final H70 d;
    public final ExecutorService e;
    public final ExecutorService f;
    public final boolean g;
    public boolean h;
    public KI0 i;
    public boolean j;
    public Exception k;
    public boolean l;
    public Set m;
    public RG n;
    public QG o;
    public volatile Future p;

    public static class b {
        public QG a(KI0 ki0, boolean z) {
            return new QG(ki0, z);
        }
    }

    public static class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (1 != i && 2 != i) {
                return false;
            }
            MG mg = (MG) message.obj;
            if (1 == i) {
                mg.j();
            } else {
                mg.i();
            }
            return true;
        }
    }

    public MG(H70 h70, ExecutorService executorService, ExecutorService executorService2, boolean z, NG ng) {
        this(h70, executorService, executorService2, z, ng, q);
    }

    @Override // com.daaw.MI0
    public void a(Exception exc) {
        this.k = exc;
        r.obtainMessage(2, this).sendToTarget();
    }

    @Override // com.daaw.MI0
    public void d(KI0 ki0) {
        this.i = ki0;
        r.obtainMessage(1, this).sendToTarget();
    }

    public void e(MI0 mi0) {
        AbstractC6559mb1.b();
        if (this.j) {
            mi0.d(this.o);
        } else if (this.l) {
            mi0.a(this.k);
        } else {
            this.a.add(mi0);
        }
    }

    public final void f(MI0 mi0) {
        if (this.m == null) {
            this.m = new HashSet();
        }
        this.m.add(mi0);
    }

    public void g() {
        if (this.l || this.j || this.h) {
            return;
        }
        this.n.b();
        Future future = this.p;
        if (future != null) {
            future.cancel(true);
        }
        this.h = true;
        this.c.d(this, this.d);
    }

    @Override // com.daaw.RG.a
    public void h(RG rg) {
        this.p = this.f.submit(rg);
    }

    public final void i() {
        if (this.h) {
            return;
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
        this.l = true;
        this.c.c(this.d, null);
        for (MI0 mi0 : this.a) {
            if (!k(mi0)) {
                mi0.a(this.k);
            }
        }
    }

    public final void j() {
        if (this.h) {
            this.i.c();
            return;
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
        QG qgA = this.b.a(this.i, this.g);
        this.o = qgA;
        this.j = true;
        qgA.b();
        this.c.c(this.d, this.o);
        for (MI0 mi0 : this.a) {
            if (!k(mi0)) {
                this.o.b();
                mi0.d(this.o);
            }
        }
        this.o.e();
    }

    public final boolean k(MI0 mi0) {
        Set set = this.m;
        return set != null && set.contains(mi0);
    }

    public void l(MI0 mi0) {
        AbstractC6559mb1.b();
        if (this.j || this.l) {
            f(mi0);
            return;
        }
        this.a.remove(mi0);
        if (this.a.isEmpty()) {
            g();
        }
    }

    public void m(RG rg) {
        this.n = rg;
        this.p = this.e.submit(rg);
    }

    public MG(H70 h70, ExecutorService executorService, ExecutorService executorService2, boolean z, NG ng, b bVar) {
        this.a = new ArrayList();
        this.d = h70;
        this.e = executorService;
        this.f = executorService2;
        this.g = z;
        this.c = ng;
        this.b = bVar;
    }
}
