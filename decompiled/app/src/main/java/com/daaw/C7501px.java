package com.daaw;

import com.daaw.InterfaceC5766jm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7501px extends AbstractC7329pL {
    public final C7050oL a;
    public final InterfaceC7569qB0 b;
    public final List c;
    public final List d;
    public final C9616xX0 e;
    public final C5015h41 f;
    public final Executor g;
    public final Executor h;
    public final Executor i;
    public final AbstractC6963o11 j;
    public final InterfaceC5766jm k;
    public K8 l;
    public J8 m;
    public L8 n;

    public C7501px(C7050oL c7050oL, InterfaceC7569qB0 interfaceC7569qB0, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        AbstractC7506py0.l(c7050oL);
        AbstractC7506py0.l(interfaceC7569qB0);
        this.a = c7050oL;
        this.b = interfaceC7569qB0;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new C9616xX0(c7050oL.k(), c7050oL.o());
        this.f = new C5015h41(c7050oL.k(), this, executor2, scheduledExecutorService);
        this.g = executor;
        this.h = executor2;
        this.i = executor3;
        this.j = o(executor3);
        this.k = new InterfaceC5766jm.a();
    }

    public static /* synthetic */ AbstractC6963o11 g(AbstractC6963o11 abstractC6963o11) {
        return abstractC6963o11.n() ? A11.e(C1743Nw.c((L8) abstractC6963o11.k())) : A11.e(C1743Nw.d(new JL(abstractC6963o11.j().getMessage(), abstractC6963o11.j())));
    }

    public static /* synthetic */ AbstractC6963o11 h(C7501px c7501px, L8 l8) {
        c7501px.q(l8);
        Iterator it = c7501px.d.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
        C1743Nw c1743NwC = C1743Nw.c(l8);
        Iterator it2 = c7501px.c.iterator();
        while (it2.hasNext()) {
            ((M8) it2.next()).a(c1743NwC);
        }
        return A11.e(l8);
    }

    public static /* synthetic */ AbstractC6963o11 i(C7501px c7501px, boolean z, AbstractC6963o11 abstractC6963o11) {
        return (z || !c7501px.m()) ? c7501px.m == null ? A11.e(C1743Nw.d(new JL("No AppCheckProvider installed."))) : c7501px.k().i(c7501px.h, new InterfaceC1519Ls() { // from class: com.daaw.ox
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o112) {
                return C7501px.g(abstractC6963o112);
            }
        }) : A11.e(C1743Nw.c(c7501px.n));
    }

    public static /* synthetic */ void j(C7501px c7501px, C7521q11 c7521q11) {
        L8 l8C = c7501px.e.c();
        if (l8C != null) {
            c7501px.p(l8C);
        }
        c7521q11.c(null);
    }

    @Override // com.daaw.InterfaceC9200w10
    public AbstractC6963o11 a(final boolean z) {
        return this.j.i(this.h, new InterfaceC1519Ls() { // from class: com.daaw.nx
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o11) {
                return C7501px.i(this.a, z, abstractC6963o11);
            }
        });
    }

    @Override // com.daaw.InterfaceC9200w10
    public void b(M8 m8) {
        AbstractC7506py0.l(m8);
        this.c.add(m8);
        this.f.e(this.c.size() + this.d.size());
        if (m()) {
            m8.a(C1743Nw.c(this.n));
        }
    }

    @Override // com.daaw.AbstractC7329pL
    public void e(K8 k8) {
        n(k8, this.a.t());
    }

    public AbstractC6963o11 k() {
        return this.m.a().p(this.g, new InterfaceC9066vZ0() { // from class: com.daaw.lx
            @Override // com.daaw.InterfaceC9066vZ0
            public final AbstractC6963o11 a(Object obj) {
                return C7501px.h(this.a, (L8) obj);
            }
        });
    }

    public InterfaceC7569qB0 l() {
        return this.b;
    }

    public final boolean m() {
        L8 l8 = this.n;
        return l8 != null && l8.a() - this.k.a() > 300000;
    }

    public void n(K8 k8, boolean z) {
        AbstractC7506py0.l(k8);
        this.l = k8;
        this.m = k8.a(this.a);
        this.f.f(z);
    }

    public final AbstractC6963o11 o(Executor executor) {
        final C7521q11 c7521q11 = new C7521q11();
        executor.execute(new Runnable() { // from class: com.daaw.kx
            @Override // java.lang.Runnable
            public final void run() {
                C7501px.j(this.B, c7521q11);
            }
        });
        return c7521q11.a();
    }

    public void p(L8 l8) {
        this.n = l8;
    }

    public final void q(final L8 l8) {
        this.i.execute(new Runnable() { // from class: com.daaw.mx
            @Override // java.lang.Runnable
            public final void run() {
                this.B.e.d(l8);
            }
        });
        p(l8);
        this.f.d(l8);
    }
}
