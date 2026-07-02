package com.daaw;

import com.daaw.AbstractC0304Ac0;
import com.daaw.InterfaceC2971Zl;
import com.daaw.InterfaceC7420pg0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0599Cy implements InterfaceC7420pg0 {
    public final Executor c;
    public final ExecutorC3034a01 d;
    public Runnable e;
    public Runnable f;
    public Runnable g;
    public InterfaceC7420pg0.a h;
    public C6262lX0 j;
    public AbstractC0304Ac0.i k;
    public long l;
    public final C6404m10 a = C6404m10.a(C0599Cy.class, null);
    public final Object b = new Object();
    public Collection i = new LinkedHashSet();

    /* JADX INFO: renamed from: com.daaw.Cy$a */
    public class a implements Runnable {
        public final /* synthetic */ InterfaceC7420pg0.a B;

        public a(InterfaceC7420pg0.a aVar) {
            this.B = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.d(true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cy$b */
    public class b implements Runnable {
        public final /* synthetic */ InterfaceC7420pg0.a B;

        public b(InterfaceC7420pg0.a aVar) {
            this.B = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.d(false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cy$c */
    public class c implements Runnable {
        public final /* synthetic */ InterfaceC7420pg0.a B;

        public c(InterfaceC7420pg0.a aVar) {
            this.B = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.B.c();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cy$d */
    public class d implements Runnable {
        public final /* synthetic */ C6262lX0 B;

        public d(C6262lX0 c6262lX0) {
            this.B = c6262lX0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0599Cy.this.h.a(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cy$e */
    public class e extends C0712Dy {
        public final AbstractC0304Ac0.f j;
        public final C8594ts k;
        public final AbstractC3246am[] l;

        public /* synthetic */ e(C0599Cy c0599Cy, AbstractC0304Ac0.f fVar, AbstractC3246am[] abstractC3246amArr, a aVar) {
            this(fVar, abstractC3246amArr);
        }

        public final Runnable B(InterfaceC3525bm interfaceC3525bm) {
            C8594ts c8594tsB = this.k.b();
            try {
                InterfaceC2867Yl interfaceC2867YlC = interfaceC3525bm.c(this.j.c(), this.j.b(), this.j.a(), this.l);
                this.k.f(c8594tsB);
                return x(interfaceC2867YlC);
            } catch (Throwable th) {
                this.k.f(c8594tsB);
                throw th;
            }
        }

        @Override // com.daaw.C0712Dy, com.daaw.InterfaceC2867Yl
        public void f(C6262lX0 c6262lX0) {
            super.f(c6262lX0);
            synchronized (C0599Cy.this.b) {
                try {
                    if (C0599Cy.this.g != null) {
                        boolean zRemove = C0599Cy.this.i.remove(this);
                        if (!C0599Cy.this.q() && zRemove) {
                            C0599Cy.this.d.b(C0599Cy.this.f);
                            if (C0599Cy.this.j != null) {
                                C0599Cy.this.d.b(C0599Cy.this.g);
                                C0599Cy.this.g = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0599Cy.this.d.a();
        }

        @Override // com.daaw.C0712Dy, com.daaw.InterfaceC2867Yl
        public void m(C4994h00 c4994h00) {
            if (this.j.a().j()) {
                c4994h00.a("wait_for_ready");
            }
            super.m(c4994h00);
        }

        @Override // com.daaw.C0712Dy
        public void v(C6262lX0 c6262lX0) {
            for (AbstractC3246am abstractC3246am : this.l) {
                abstractC3246am.i(c6262lX0);
            }
        }

        public e(AbstractC0304Ac0.f fVar, AbstractC3246am[] abstractC3246amArr) {
            this.k = C8594ts.e();
            this.j = fVar;
            this.l = abstractC3246amArr;
        }
    }

    public C0599Cy(Executor executor, ExecutorC3034a01 executorC3034a01) {
        this.c = executor;
        this.d = executorC3034a01;
    }

    @Override // com.daaw.InterfaceC7420pg0
    public final Runnable b(InterfaceC7420pg0.a aVar) {
        this.h = aVar;
        this.e = new a(aVar);
        this.f = new b(aVar);
        this.g = new c(aVar);
        return null;
    }

    @Override // com.daaw.InterfaceC3525bm
    public final InterfaceC2867Yl c(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C1168Ii c1168Ii, AbstractC3246am[] abstractC3246amArr) {
        InterfaceC2867Yl kj;
        try {
            C9449wu0 c9449wu0 = new C9449wu0(c6882nk0, c2756Xj0, c1168Ii);
            AbstractC0304Ac0.i iVar = null;
            long j = -1;
            while (true) {
                synchronized (this.b) {
                    if (this.j == null) {
                        AbstractC0304Ac0.i iVar2 = this.k;
                        if (iVar2 != null) {
                            if (iVar != null && j == this.l) {
                                kj = o(c9449wu0, abstractC3246amArr);
                                break;
                            }
                            j = this.l;
                            InterfaceC3525bm interfaceC3525bmJ = AbstractC7365pU.j(iVar2.a(c9449wu0), c1168Ii.j());
                            if (interfaceC3525bmJ != null) {
                                kj = interfaceC3525bmJ.c(c9449wu0.c(), c9449wu0.b(), c9449wu0.a(), abstractC3246amArr);
                                break;
                            }
                            iVar = iVar2;
                        } else {
                            kj = o(c9449wu0, abstractC3246amArr);
                            break;
                        }
                    } else {
                        kj = new KJ(this.j, abstractC3246amArr);
                        break;
                    }
                }
            }
            return kj;
        } finally {
            this.d.a();
        }
    }

    @Override // com.daaw.InterfaceC7420pg0
    public final void d(C6262lX0 c6262lX0) {
        Collection<e> collection;
        Runnable runnable;
        g(c6262lX0);
        synchronized (this.b) {
            try {
                collection = this.i;
                runnable = this.g;
                this.g = null;
                if (!collection.isEmpty()) {
                    this.i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable runnableX = eVar.x(new KJ(c6262lX0, InterfaceC2971Zl.a.REFUSED, eVar.l));
                if (runnableX != null) {
                    runnableX.run();
                }
            }
            this.d.execute(runnable);
        }
    }

    @Override // com.daaw.InterfaceC8921v10
    public C6404m10 f() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC7420pg0
    public final void g(C6262lX0 c6262lX0) {
        Runnable runnable;
        synchronized (this.b) {
            try {
                if (this.j != null) {
                    return;
                }
                this.j = c6262lX0;
                this.d.b(new d(c6262lX0));
                if (!q() && (runnable = this.g) != null) {
                    this.d.b(runnable);
                    this.g = null;
                }
                this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e o(AbstractC0304Ac0.f fVar, AbstractC3246am[] abstractC3246amArr) {
        e eVar = new e(this, fVar, abstractC3246amArr, null);
        this.i.add(eVar);
        if (p() == 1) {
            this.d.b(this.e);
        }
        return eVar;
    }

    public final int p() {
        int size;
        synchronized (this.b) {
            size = this.i.size();
        }
        return size;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.b) {
            z = !this.i.isEmpty();
        }
        return z;
    }

    public final void r(AbstractC0304Ac0.i iVar) {
        Runnable runnable;
        synchronized (this.b) {
            this.k = iVar;
            this.l++;
            if (iVar != null && q()) {
                ArrayList<e> arrayList = new ArrayList(this.i);
                ArrayList arrayList2 = new ArrayList();
                for (e eVar : arrayList) {
                    AbstractC0304Ac0.e eVarA = iVar.a(eVar.j);
                    C1168Ii c1168IiA = eVar.j.a();
                    InterfaceC3525bm interfaceC3525bmJ = AbstractC7365pU.j(eVarA, c1168IiA.j());
                    if (interfaceC3525bmJ != null) {
                        Executor executorE = this.c;
                        if (c1168IiA.e() != null) {
                            executorE = c1168IiA.e();
                        }
                        Runnable runnableB = eVar.B(interfaceC3525bmJ);
                        if (runnableB != null) {
                            executorE.execute(runnableB);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.b) {
                    try {
                        if (q()) {
                            this.i.removeAll(arrayList2);
                            if (this.i.isEmpty()) {
                                this.i = new LinkedHashSet();
                            }
                            if (!q()) {
                                this.d.b(this.f);
                                if (this.j != null && (runnable = this.g) != null) {
                                    this.d.b(runnable);
                                    this.g = null;
                                }
                            }
                            this.d.a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
