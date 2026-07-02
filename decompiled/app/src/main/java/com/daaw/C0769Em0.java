package com.daaw;

import com.daaw.InterfaceC4684ft;
import com.daaw.U30;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.Em0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0769Em0 {
    public final AtomicReference a = new AtomicReference(null);
    public final InterfaceC0873Fm0 b = AbstractC1081Hm0.b(false, 1, null);

    /* JADX INFO: renamed from: com.daaw.Em0$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public Object F;
        public Object G;
        public Object H;
        public int I;
        public /* synthetic */ Object J;
        public final /* synthetic */ EnumC9130vm0 K;
        public final /* synthetic */ C0769Em0 L;
        public final /* synthetic */ NQ M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC9130vm0 enumC9130vm0, C0769Em0 c0769Em0, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.K = enumC9130vm0;
            this.L = c0769Em0;
            this.M = nq;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = new a(this.K, this.L, this.M, interfaceC1416Ks);
            aVar.J = obj;
            return aVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.daaw.Fm0, int] */
        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            InterfaceC0873Fm0 interfaceC0873Fm0;
            c cVar;
            C0769Em0 c0769Em0;
            NQ nq;
            Throwable th;
            C0769Em0 c0769Em02;
            c cVar2;
            InterfaceC0873Fm0 interfaceC0873Fm02;
            Object objC = I10.c();
            ?? r1 = this.I;
            try {
                try {
                    if (r1 == 0) {
                        AbstractC4801gJ0.b(obj);
                        InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.J;
                        EnumC9130vm0 enumC9130vm0 = this.K;
                        InterfaceC4684ft.b bVarA = interfaceC7484pt.i().a(U30.k);
                        G10.d(bVarA);
                        c cVar3 = new c(enumC9130vm0, (U30) bVarA);
                        this.L.g(cVar3);
                        interfaceC0873Fm0 = this.L.b;
                        NQ nq2 = this.M;
                        C0769Em0 c0769Em03 = this.L;
                        this.J = cVar3;
                        this.F = interfaceC0873Fm0;
                        this.G = nq2;
                        this.H = c0769Em03;
                        this.I = 1;
                        if (interfaceC0873Fm0.a(null, this) != objC) {
                            cVar = cVar3;
                            c0769Em0 = c0769Em03;
                            nq = nq2;
                        }
                        return objC;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0769Em02 = (C0769Em0) this.G;
                        interfaceC0873Fm02 = (InterfaceC0873Fm0) this.F;
                        cVar2 = (c) this.J;
                        try {
                            AbstractC4801gJ0.b(obj);
                            AbstractC0552Cm0.a(c0769Em02.a, cVar2, null);
                            interfaceC0873Fm02.c(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC0552Cm0.a(c0769Em02.a, cVar2, null);
                            throw th;
                        }
                    }
                    c0769Em0 = (C0769Em0) this.H;
                    nq = (NQ) this.G;
                    InterfaceC0873Fm0 interfaceC0873Fm03 = (InterfaceC0873Fm0) this.F;
                    cVar = (c) this.J;
                    AbstractC4801gJ0.b(obj);
                    interfaceC0873Fm0 = interfaceC0873Fm03;
                    this.J = cVar;
                    this.F = interfaceC0873Fm0;
                    this.G = c0769Em0;
                    this.H = null;
                    this.I = 2;
                    Object objInvoke = nq.invoke(this);
                    if (objInvoke != objC) {
                        c0769Em02 = c0769Em0;
                        interfaceC0873Fm02 = interfaceC0873Fm0;
                        obj = objInvoke;
                        cVar2 = cVar;
                        AbstractC0552Cm0.a(c0769Em02.a, cVar2, null);
                        interfaceC0873Fm02.c(null);
                        return obj;
                    }
                    return objC;
                } catch (Throwable th3) {
                    th = th3;
                    c0769Em02 = c0769Em0;
                    cVar2 = cVar;
                    AbstractC0552Cm0.a(c0769Em02.a, cVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.c(null);
                throw th4;
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Em0$b */
    public static final class b extends SZ0 implements InterfaceC3429bR {
        public Object F;
        public Object G;
        public Object H;
        public Object I;
        public int J;
        public /* synthetic */ Object K;
        public final /* synthetic */ EnumC9130vm0 L;
        public final /* synthetic */ C0769Em0 M;
        public final /* synthetic */ InterfaceC3429bR N;
        public final /* synthetic */ Object O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC9130vm0 enumC9130vm0, C0769Em0 c0769Em0, InterfaceC3429bR interfaceC3429bR, Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.L = enumC9130vm0;
            this.M = c0769Em0;
            this.N = interfaceC3429bR;
            this.O = obj;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            b bVar = new b(this.L, this.M, this.N, this.O, interfaceC1416Ks);
            bVar.K = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.daaw.Fm0, int] */
        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            InterfaceC0873Fm0 interfaceC0873Fm0;
            InterfaceC3429bR interfaceC3429bR;
            c cVar;
            C0769Em0 c0769Em0;
            Object obj2;
            Throwable th;
            C0769Em0 c0769Em02;
            c cVar2;
            InterfaceC0873Fm0 interfaceC0873Fm02;
            Object objC = I10.c();
            ?? r1 = this.J;
            try {
                try {
                    if (r1 == 0) {
                        AbstractC4801gJ0.b(obj);
                        InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.K;
                        EnumC9130vm0 enumC9130vm0 = this.L;
                        InterfaceC4684ft.b bVarA = interfaceC7484pt.i().a(U30.k);
                        G10.d(bVarA);
                        c cVar3 = new c(enumC9130vm0, (U30) bVarA);
                        this.M.g(cVar3);
                        interfaceC0873Fm0 = this.M.b;
                        interfaceC3429bR = this.N;
                        Object obj3 = this.O;
                        C0769Em0 c0769Em03 = this.M;
                        this.K = cVar3;
                        this.F = interfaceC0873Fm0;
                        this.G = interfaceC3429bR;
                        this.H = obj3;
                        this.I = c0769Em03;
                        this.J = 1;
                        if (interfaceC0873Fm0.a(null, this) != objC) {
                            cVar = cVar3;
                            c0769Em0 = c0769Em03;
                            obj2 = obj3;
                        }
                        return objC;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0769Em02 = (C0769Em0) this.G;
                        interfaceC0873Fm02 = (InterfaceC0873Fm0) this.F;
                        cVar2 = (c) this.K;
                        try {
                            AbstractC4801gJ0.b(obj);
                            AbstractC0552Cm0.a(c0769Em02.a, cVar2, null);
                            interfaceC0873Fm02.c(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC0552Cm0.a(c0769Em02.a, cVar2, null);
                            throw th;
                        }
                    }
                    c0769Em0 = (C0769Em0) this.I;
                    obj2 = this.H;
                    interfaceC3429bR = (InterfaceC3429bR) this.G;
                    InterfaceC0873Fm0 interfaceC0873Fm03 = (InterfaceC0873Fm0) this.F;
                    cVar = (c) this.K;
                    AbstractC4801gJ0.b(obj);
                    interfaceC0873Fm0 = interfaceC0873Fm03;
                    this.K = cVar;
                    this.F = interfaceC0873Fm0;
                    this.G = c0769Em0;
                    this.H = null;
                    this.I = null;
                    this.J = 2;
                    Object objInvoke = interfaceC3429bR.invoke(obj2, this);
                    if (objInvoke != objC) {
                        c0769Em02 = c0769Em0;
                        interfaceC0873Fm02 = interfaceC0873Fm0;
                        obj = objInvoke;
                        cVar2 = cVar;
                        AbstractC0552Cm0.a(c0769Em02.a, cVar2, null);
                        interfaceC0873Fm02.c(null);
                        return obj;
                    }
                    return objC;
                } catch (Throwable th3) {
                    th = th3;
                    c0769Em02 = c0769Em0;
                    cVar2 = cVar;
                    AbstractC0552Cm0.a(c0769Em02.a, cVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r1.c(null);
                throw th4;
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Em0$c */
    public static final class c {
        public final EnumC9130vm0 a;
        public final U30 b;

        public c(EnumC9130vm0 enumC9130vm0, U30 u30) {
            G10.g(enumC9130vm0, "priority");
            G10.g(u30, "job");
            this.a = enumC9130vm0;
            this.b = u30;
        }

        public final boolean a(c cVar) {
            G10.g(cVar, "other");
            return this.a.compareTo(cVar.a) >= 0;
        }

        public final void b() {
            U30.a.a(this.b, null, 1, null);
        }
    }

    public static /* synthetic */ Object e(C0769Em0 c0769Em0, EnumC9130vm0 enumC9130vm0, NQ nq, InterfaceC1416Ks interfaceC1416Ks, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC9130vm0 = EnumC9130vm0.Default;
        }
        return c0769Em0.d(enumC9130vm0, nq, interfaceC1416Ks);
    }

    public final Object d(EnumC9130vm0 enumC9130vm0, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
        return AbstractC7763qt.e(new a(enumC9130vm0, this, nq, null), interfaceC1416Ks);
    }

    public final Object f(Object obj, EnumC9130vm0 enumC9130vm0, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
        return AbstractC7763qt.e(new b(enumC9130vm0, this, interfaceC3429bR, obj, null), interfaceC1416Ks);
    }

    public final void g(c cVar) {
        c cVar2;
        do {
            cVar2 = (c) this.a.get();
            if (cVar2 != null && !cVar.a(cVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!AbstractC0552Cm0.a(this.a, cVar2, cVar));
        if (cVar2 != null) {
            cVar2.b();
        }
    }
}
