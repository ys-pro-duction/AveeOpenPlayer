package com.daaw;

import com.daaw.InterfaceC4684ft;
import com.daaw.U30;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.Dm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0665Dm0 {
    public final AtomicReference a = new AtomicReference(null);
    public final InterfaceC0873Fm0 b = AbstractC1081Hm0.b(false, 1, null);

    /* JADX INFO: renamed from: com.daaw.Dm0$a */
    public static final class a {
        public final EnumC9409wm0 a;
        public final U30 b;

        public a(EnumC9409wm0 enumC9409wm0, U30 u30) {
            G10.g(enumC9409wm0, "priority");
            G10.g(u30, "job");
            this.a = enumC9409wm0;
            this.b = u30;
        }

        public final boolean a(a aVar) {
            G10.g(aVar, "other");
            return this.a.compareTo(aVar.a) >= 0;
        }

        public final void b() {
            U30.a.a(this.b, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dm0$b */
    public static final class b extends SZ0 implements InterfaceC3429bR {
        public Object F;
        public Object G;
        public Object H;
        public int I;
        public /* synthetic */ Object J;
        public final /* synthetic */ EnumC9409wm0 K;
        public final /* synthetic */ C0665Dm0 L;
        public final /* synthetic */ NQ M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC9409wm0 enumC9409wm0, C0665Dm0 c0665Dm0, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.K = enumC9409wm0;
            this.L = c0665Dm0;
            this.M = nq;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            b bVar = new b(this.K, this.L, this.M, interfaceC1416Ks);
            bVar.J = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.daaw.Fm0, int] */
        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            InterfaceC0873Fm0 interfaceC0873Fm0;
            a aVar;
            C0665Dm0 c0665Dm0;
            NQ nq;
            Throwable th;
            C0665Dm0 c0665Dm02;
            a aVar2;
            InterfaceC0873Fm0 interfaceC0873Fm02;
            Object objC = I10.c();
            ?? r1 = this.I;
            try {
                try {
                    if (r1 == 0) {
                        AbstractC4801gJ0.b(obj);
                        InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.J;
                        EnumC9409wm0 enumC9409wm0 = this.K;
                        InterfaceC4684ft.b bVarA = interfaceC7484pt.i().a(U30.k);
                        G10.d(bVarA);
                        a aVar3 = new a(enumC9409wm0, (U30) bVarA);
                        this.L.f(aVar3);
                        interfaceC0873Fm0 = this.L.b;
                        NQ nq2 = this.M;
                        C0665Dm0 c0665Dm03 = this.L;
                        this.J = aVar3;
                        this.F = interfaceC0873Fm0;
                        this.G = nq2;
                        this.H = c0665Dm03;
                        this.I = 1;
                        if (interfaceC0873Fm0.a(null, this) != objC) {
                            aVar = aVar3;
                            c0665Dm0 = c0665Dm03;
                            nq = nq2;
                        }
                        return objC;
                    }
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0665Dm02 = (C0665Dm0) this.G;
                        interfaceC0873Fm02 = (InterfaceC0873Fm0) this.F;
                        aVar2 = (a) this.J;
                        try {
                            AbstractC4801gJ0.b(obj);
                            AbstractC0552Cm0.a(c0665Dm02.a, aVar2, null);
                            interfaceC0873Fm02.c(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC0552Cm0.a(c0665Dm02.a, aVar2, null);
                            throw th;
                        }
                    }
                    c0665Dm0 = (C0665Dm0) this.H;
                    nq = (NQ) this.G;
                    InterfaceC0873Fm0 interfaceC0873Fm03 = (InterfaceC0873Fm0) this.F;
                    aVar = (a) this.J;
                    AbstractC4801gJ0.b(obj);
                    interfaceC0873Fm0 = interfaceC0873Fm03;
                    this.J = aVar;
                    this.F = interfaceC0873Fm0;
                    this.G = c0665Dm0;
                    this.H = null;
                    this.I = 2;
                    Object objInvoke = nq.invoke(this);
                    if (objInvoke != objC) {
                        c0665Dm02 = c0665Dm0;
                        interfaceC0873Fm02 = interfaceC0873Fm0;
                        obj = objInvoke;
                        aVar2 = aVar;
                        AbstractC0552Cm0.a(c0665Dm02.a, aVar2, null);
                        interfaceC0873Fm02.c(null);
                        return obj;
                    }
                    return objC;
                } catch (Throwable th3) {
                    th = th3;
                    c0665Dm02 = c0665Dm0;
                    aVar2 = aVar;
                    AbstractC0552Cm0.a(c0665Dm02.a, aVar2, null);
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

    public static /* synthetic */ Object e(C0665Dm0 c0665Dm0, EnumC9409wm0 enumC9409wm0, NQ nq, InterfaceC1416Ks interfaceC1416Ks, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC9409wm0 = EnumC9409wm0.Default;
        }
        return c0665Dm0.d(enumC9409wm0, nq, interfaceC1416Ks);
    }

    public final Object d(EnumC9409wm0 enumC9409wm0, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
        return AbstractC7763qt.e(new b(enumC9409wm0, this, nq, null), interfaceC1416Ks);
    }

    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!AbstractC0552Cm0.a(this.a, aVar2, aVar));
        if (aVar2 == null) {
            return;
        }
        aVar2.b();
    }
}
