package com.daaw;

import android.content.Context;
import com.daaw.AbstractC0559Co;
import com.daaw.C7106oZ;
import com.daaw.SH;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.zM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10129zM {
    public final C4129dw a;
    public final AbstractC5806ju b;
    public final AbstractC5806ju c;
    public final C9632xb d;
    public final C2435Uh e;
    public final InterfaceC7086oU f;
    public AbstractC1940Pt0 g;
    public C3481bd0 h;
    public QG0 i;
    public ZZ0 j;
    public SH k;
    public InterfaceC8453tN0 l;
    public InterfaceC8453tN0 m;

    public C10129zM(final Context context, C4129dw c4129dw, final com.google.firebase.firestore.d dVar, AbstractC5806ju abstractC5806ju, AbstractC5806ju abstractC5806ju2, final C9632xb c9632xb, InterfaceC7086oU interfaceC7086oU) {
        this.a = c4129dw;
        this.b = abstractC5806ju;
        this.c = abstractC5806ju2;
        this.d = c9632xb;
        this.f = interfaceC7086oU;
        this.e = new C2435Uh(new MG0(c4129dw.a()));
        final C7521q11 c7521q11 = new C7521q11();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c9632xb.i(new Runnable() { // from class: com.daaw.rM
            @Override // java.lang.Runnable
            public final void run() {
                C10129zM.h(this.B, c7521q11, context, dVar);
            }
        });
        abstractC5806ju.c(new InterfaceC8515tc0() { // from class: com.daaw.sM
            @Override // com.daaw.InterfaceC8515tc0
            public final void a(Object obj) {
                C10129zM.a(this.a, atomicBoolean, c7521q11, c9632xb, (C0722Ea1) obj);
            }
        });
        abstractC5806ju2.c(new InterfaceC8515tc0() { // from class: com.daaw.tM
            @Override // com.daaw.InterfaceC8515tc0
            public final void a(Object obj) {
                C10129zM.d((String) obj);
            }
        });
    }

    public static /* synthetic */ void a(final C10129zM c10129zM, AtomicBoolean atomicBoolean, C7521q11 c7521q11, C9632xb c9632xb, final C0722Ea1 c0722Ea1) {
        c10129zM.getClass();
        if (!atomicBoolean.compareAndSet(false, true)) {
            c9632xb.i(new Runnable() { // from class: com.daaw.vM
                @Override // java.lang.Runnable
                public final void run() {
                    C10129zM.g(this.B, c0722Ea1);
                }
            });
        } else {
            AbstractC6557mb.d(!c7521q11.a().m(), "Already fulfilled first user task", new Object[0]);
            c7521q11.c(c0722Ea1);
        }
    }

    public static /* synthetic */ C1881Pe1 c(C10129zM c10129zM, C5890kC0 c5890kC0) {
        C7851rC0 c7851rC0Q = c10129zM.h.q(c5890kC0, true);
        C1669Nd1 c1669Nd1 = new C1669Nd1(c5890kC0, c7851rC0Q.b());
        return c1669Nd1.b(c1669Nd1.g(c7851rC0Q.a())).b();
    }

    public static /* synthetic */ void d(String str) {
    }

    public static /* synthetic */ void g(C10129zM c10129zM, C0722Ea1 c0722Ea1) {
        AbstractC6557mb.d(c10129zM.j != null, "SyncEngine not yet initialized", new Object[0]);
        AbstractC2212Sd0.a("FirestoreClient", "Credential changed. Current user: %s", c0722Ea1.a());
        c10129zM.j.l(c0722Ea1);
    }

    public static /* synthetic */ void h(C10129zM c10129zM, C7521q11 c7521q11, Context context, com.google.firebase.firestore.d dVar) {
        c10129zM.getClass();
        try {
            c10129zM.j(context, (C0722Ea1) A11.a(c7521q11.a()), dVar);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public AbstractC6963o11 i(final C5890kC0 c5890kC0) {
        n();
        return this.d.g(new Callable() { // from class: com.daaw.uM
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C10129zM.c(this.a, c5890kC0);
            }
        });
    }

    public final void j(Context context, C0722Ea1 c0722Ea1, com.google.firebase.firestore.d dVar) {
        AbstractC2212Sd0.a("FirestoreClient", "Initializing. user=%s", c0722Ea1.a());
        AbstractC0559Co.a aVar = new AbstractC0559Co.a(context, this.d, this.a, new C4408ew(this.a, this.d, this.b, this.c, context, this.f), c0722Ea1, 100, dVar);
        AbstractC0559Co ck0 = dVar.d() ? new CK0() : new C6598mj0();
        ck0.q(aVar);
        this.g = ck0.n();
        this.m = ck0.k();
        this.h = ck0.m();
        this.i = ck0.o();
        this.j = ck0.p();
        this.k = ck0.j();
        C7106oZ c7106oZL = ck0.l();
        InterfaceC8453tN0 interfaceC8453tN0 = this.m;
        if (interfaceC8453tN0 != null) {
            interfaceC8453tN0.start();
        }
        if (c7106oZL != null) {
            C7106oZ.a aVarF = c7106oZL.f();
            this.l = aVarF;
            aVarF.start();
        }
    }

    public boolean k() {
        return this.d.k();
    }

    public C6736nC0 l(C5890kC0 c5890kC0, SH.a aVar, LH lh) {
        n();
        final C6736nC0 c6736nC0 = new C6736nC0(c5890kC0, aVar, lh);
        this.d.i(new Runnable() { // from class: com.daaw.yM
            @Override // java.lang.Runnable
            public final void run() {
                this.B.k.d(c6736nC0);
            }
        });
        return c6736nC0;
    }

    public void m(final C6736nC0 c6736nC0) {
        if (k()) {
            return;
        }
        this.d.i(new Runnable() { // from class: com.daaw.xM
            @Override // java.lang.Runnable
            public final void run() {
                this.B.k.f(c6736nC0);
            }
        });
    }

    public final void n() {
        if (k()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public AbstractC6963o11 o(final List list) {
        n();
        final C7521q11 c7521q11 = new C7521q11();
        this.d.i(new Runnable() { // from class: com.daaw.wM
            @Override // java.lang.Runnable
            public final void run() {
                this.B.j.y(list, c7521q11);
            }
        });
        return c7521q11.a();
    }
}
