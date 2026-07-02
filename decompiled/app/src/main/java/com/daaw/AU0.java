package com.daaw;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class AU0 {
    public final NQ a;
    public final InterfaceC3429bR b;
    public final NQ c;
    public final C8565tm0 d;
    public InterfaceC9424wp0 e;
    public boolean f;
    public a g;

    public static final class a {
        public final NQ a;
        public final XX b;
        public final HashSet c;
        public Object d;

        public a(NQ nq) {
            G10.g(nq, "onChanged");
            this.a = nq;
            this.b = new XX();
            this.c = new HashSet();
        }

        public final void a(Object obj) {
            G10.g(obj, "value");
            XX xx = this.b;
            Object obj2 = this.d;
            G10.d(obj2);
            xx.c(obj, obj2);
        }

        public final void b(Collection collection) {
            G10.g(collection, "scopes");
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.a.invoke(it.next());
            }
        }

        public final Object c() {
            return this.d;
        }

        public final HashSet d() {
            return this.c;
        }

        public final XX e() {
            return this.b;
        }

        public final NQ f() {
            return this.a;
        }

        public final void g(Object obj) {
            this.d = obj;
        }
    }

    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {

        public static final class a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ AU0 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AU0 au0) {
                super(0);
                this.B = au0;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m4invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4invoke() {
                this.B.f();
            }
        }

        public b() {
            super(2);
        }

        public final void a(Set set, AbstractC3720cU0 abstractC3720cU0) {
            int i;
            G10.g(set, "applied");
            G10.g(abstractC3720cU0, "<anonymous parameter 1>");
            C8565tm0 c8565tm0 = AU0.this.d;
            AU0 au0 = AU0.this;
            synchronized (c8565tm0) {
                try {
                    C8565tm0 c8565tm02 = au0.d;
                    int iR = c8565tm02.r();
                    i = 0;
                    if (iR > 0) {
                        Object[] objArrQ = c8565tm02.q();
                        int i2 = 0;
                        do {
                            a aVar = (a) objArrQ[i];
                            HashSet hashSetD = aVar.d();
                            XX xxE = aVar.e();
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                int iF = xxE.f(it.next());
                                if (iF >= 0) {
                                    Iterator<E> it2 = xxE.o(iF).iterator();
                                    while (it2.hasNext()) {
                                        hashSetD.add(it2.next());
                                        i2 = 1;
                                    }
                                }
                            }
                            i++;
                        } while (i < iR);
                        i = i2;
                    }
                    G91 g91 = G91.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i != 0) {
                AU0.this.a.invoke(new a(AU0.this));
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Set) obj, (AbstractC3720cU0) obj2);
            return G91.a;
        }
    }

    public static final class c extends AbstractC4192e90 implements NQ {
        public c() {
            super(1);
        }

        public final void a(Object obj) {
            G10.g(obj, "state");
            if (AU0.this.f) {
                return;
            }
            C8565tm0 c8565tm0 = AU0.this.d;
            AU0 au0 = AU0.this;
            synchronized (c8565tm0) {
                a aVar = au0.g;
                G10.d(aVar);
                aVar.a(obj);
                G91 g91 = G91.a;
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return G91.a;
        }
    }

    public AU0(NQ nq) {
        G10.g(nq, "onChangedExecutor");
        this.a = nq;
        this.b = new b();
        this.c = new c();
        this.d = new C8565tm0(new a[16], 0);
    }

    public final void f() {
        C8565tm0 c8565tm0 = this.d;
        int iR = c8565tm0.r();
        if (iR > 0) {
            Object[] objArrQ = c8565tm0.q();
            int i = 0;
            do {
                a aVar = (a) objArrQ[i];
                HashSet hashSetD = aVar.d();
                if (!hashSetD.isEmpty()) {
                    aVar.b(hashSetD);
                    hashSetD.clear();
                }
                i++;
            } while (i < iR);
        }
    }

    public final void g() {
        synchronized (this.d) {
            try {
                C8565tm0 c8565tm0 = this.d;
                int iR = c8565tm0.r();
                if (iR > 0) {
                    Object[] objArrQ = c8565tm0.q();
                    int i = 0;
                    do {
                        ((a) objArrQ[i]).e().d();
                        i++;
                    } while (i < iR);
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(NQ nq) {
        G10.g(nq, "predicate");
        synchronized (this.d) {
            try {
                C8565tm0 c8565tm0 = this.d;
                int iR = c8565tm0.r();
                if (iR > 0) {
                    Object[] objArrQ = c8565tm0.q();
                    int i = 0;
                    do {
                        XX xxE = ((a) objArrQ[i]).e();
                        int iJ = xxE.j();
                        int i2 = 0;
                        for (int i3 = 0; i3 < iJ; i3++) {
                            int i4 = xxE.k()[i3];
                            WX wx = xxE.i()[i4];
                            G10.d(wx);
                            int size = wx.size();
                            int i5 = 0;
                            for (int i6 = 0; i6 < size; i6++) {
                                Object obj = wx.s()[i6];
                                if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                }
                                if (!((Boolean) nq.invoke(obj)).booleanValue()) {
                                    if (i5 != i6) {
                                        wx.s()[i5] = obj;
                                    }
                                    i5++;
                                }
                            }
                            int size2 = wx.size();
                            for (int i7 = i5; i7 < size2; i7++) {
                                wx.s()[i7] = null;
                            }
                            wx.w(i5);
                            if (wx.size() > 0) {
                                if (i2 != i3) {
                                    int i8 = xxE.k()[i2];
                                    xxE.k()[i2] = i4;
                                    xxE.k()[i3] = i8;
                                }
                                i2++;
                            }
                        }
                        int iJ2 = xxE.j();
                        for (int i9 = i2; i9 < iJ2; i9++) {
                            xxE.l()[xxE.k()[i9]] = null;
                        }
                        xxE.p(i2);
                        i++;
                    } while (i < iR);
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a i(NQ nq) {
        int i;
        C8565tm0 c8565tm0 = this.d;
        int iR = c8565tm0.r();
        if (iR <= 0) {
            i = -1;
            break;
        }
        Object[] objArrQ = c8565tm0.q();
        i = 0;
        while (((a) objArrQ[i]).f() != nq) {
            i++;
            if (i >= iR) {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            return (a) this.d.q()[i];
        }
        a aVar = new a(nq);
        this.d.d(aVar);
        return aVar;
    }

    public final void j(Object obj, NQ nq, LQ lq) {
        a aVarI;
        G10.g(obj, "scope");
        G10.g(nq, "onValueChangedForScope");
        G10.g(lq, "block");
        a aVar = this.g;
        boolean z = this.f;
        synchronized (this.d) {
            aVarI = i(nq);
            aVarI.e().n(obj);
        }
        Object objC = aVarI.c();
        aVarI.g(obj);
        this.g = aVarI;
        this.f = false;
        AbstractC3720cU0.e.d(this.c, null, lq);
        this.g = aVar;
        aVarI.g(objC);
        this.f = z;
    }

    public final void k() {
        this.e = AbstractC3720cU0.e.e(this.b);
    }

    public final void l() {
        InterfaceC9424wp0 interfaceC9424wp0 = this.e;
        if (interfaceC9424wp0 != null) {
            interfaceC9424wp0.a();
        }
    }
}
