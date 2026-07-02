package com.daaw;

import com.daaw.AbstractC3720cU0;
import com.daaw.AbstractC3999dU0;
import com.daaw.AbstractC4512fJ0;
import com.daaw.InterfaceC3788cj;
import com.daaw.U30;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class WE0 extends AbstractC1300Jp {
    public static final a t = new a(null);
    public static final int u = 8;
    public static final InterfaceC8286sm0 v = AbstractC7095oW0.a(AbstractC7878rJ.c());
    public long a;
    public final C1887Pg b;
    public final InterfaceC1707Nn c;
    public final InterfaceC4684ft d;
    public final Object e;
    public U30 f;
    public Throwable g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final Map m;
    public final Map n;
    public InterfaceC3788cj o;
    public int p;
    public boolean q;
    public final InterfaceC8286sm0 r;
    public final b s;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final void c(b bVar) {
            InterfaceC6095ku0 interfaceC6095ku0;
            InterfaceC6095ku0 interfaceC6095ku0Add;
            do {
                interfaceC6095ku0 = (InterfaceC6095ku0) WE0.v.getValue();
                interfaceC6095ku0Add = interfaceC6095ku0.add((Object) bVar);
                if (interfaceC6095ku0 == interfaceC6095ku0Add) {
                    return;
                }
            } while (!WE0.v.d(interfaceC6095ku0, interfaceC6095ku0Add));
        }

        public final void d(b bVar) {
            InterfaceC6095ku0 interfaceC6095ku0;
            InterfaceC6095ku0 interfaceC6095ku0Remove;
            do {
                interfaceC6095ku0 = (InterfaceC6095ku0) WE0.v.getValue();
                interfaceC6095ku0Remove = interfaceC6095ku0.remove((Object) bVar);
                if (interfaceC6095ku0 == interfaceC6095ku0Remove) {
                    return;
                }
            } while (!WE0.v.d(interfaceC6095ku0, interfaceC6095ku0Remove));
        }

        public a() {
        }
    }

    public final class b {
        public b() {
        }
    }

    public enum c {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    public static final class d extends AbstractC4192e90 implements LQ {
        public d() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m35invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m35invoke() {
            InterfaceC3788cj interfaceC3788cjU;
            Object obj = WE0.this.e;
            WE0 we0 = WE0.this;
            synchronized (obj) {
                interfaceC3788cjU = we0.U();
                if (((c) we0.r.getValue()).compareTo(c.ShuttingDown) <= 0) {
                    throw AbstractC7317pI.a("Recomposer shutdown; frame clock awaiter will never resume", we0.g);
                }
            }
            if (interfaceC3788cjU != null) {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                interfaceC3788cjU.x(AbstractC4512fJ0.a(G91.a));
            }
        }
    }

    public static final class e extends AbstractC4192e90 implements NQ {

        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ WE0 B;
            public final /* synthetic */ Throwable C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WE0 we0, Throwable th) {
                super(1);
                this.B = we0;
                this.C = th;
            }

            public final void a(Throwable th) {
                Object obj = this.B.e;
                WE0 we0 = this.B;
                Throwable th2 = this.C;
                synchronized (obj) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                AbstractC7596qI.a(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    we0.g = th2;
                    we0.r.setValue(c.ShutDown);
                    G91 g91 = G91.a;
                }
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return G91.a;
            }
        }

        public e() {
            super(1);
        }

        public final void a(Throwable th) {
            InterfaceC3788cj interfaceC3788cj;
            InterfaceC3788cj interfaceC3788cj2;
            CancellationException cancellationExceptionA = AbstractC7317pI.a("Recomposer effect job completed", th);
            Object obj = WE0.this.e;
            WE0 we0 = WE0.this;
            synchronized (obj) {
                try {
                    U30 u30 = we0.f;
                    interfaceC3788cj = null;
                    if (u30 != null) {
                        we0.r.setValue(c.ShuttingDown);
                        if (we0.q) {
                            if (we0.o != null) {
                                interfaceC3788cj2 = we0.o;
                            }
                            we0.o = null;
                            u30.E0(new a(we0, th));
                            interfaceC3788cj = interfaceC3788cj2;
                        } else {
                            u30.j(cancellationExceptionA);
                        }
                        interfaceC3788cj2 = null;
                        we0.o = null;
                        u30.E0(new a(we0, th));
                        interfaceC3788cj = interfaceC3788cj2;
                    } else {
                        we0.g = cancellationExceptionA;
                        we0.r.setValue(c.ShutDown);
                        G91 g91 = G91.a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (interfaceC3788cj != null) {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                interfaceC3788cj.x(AbstractC4512fJ0.a(G91.a));
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return G91.a;
        }
    }

    public static final class f extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;

        public f(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            f fVar = new f(interfaceC1416Ks);
            fVar.G = obj;
            return fVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            return AbstractC0527Cg.a(((c) this.G) == c.ShutDown);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, InterfaceC1416Ks interfaceC1416Ks) {
            return ((f) a(cVar, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class g extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ WX B;
        public final /* synthetic */ InterfaceC2165Rs C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(WX wx, InterfaceC2165Rs interfaceC2165Rs) {
            super(0);
            this.B = wx;
            this.C = interfaceC2165Rs;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m36invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m36invoke() {
            WX wx = this.B;
            InterfaceC2165Rs interfaceC2165Rs = this.C;
            Iterator<E> it = wx.iterator();
            while (it.hasNext()) {
                interfaceC2165Rs.l(it.next());
            }
        }
    }

    public static final class h extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC2165Rs B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC2165Rs interfaceC2165Rs) {
            super(1);
            this.B = interfaceC2165Rs;
        }

        public final void a(Object obj) {
            G10.g(obj, "value");
            this.B.e(obj);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return G91.a;
        }
    }

    public static final class i extends SZ0 implements InterfaceC3429bR {
        public Object F;
        public int G;
        public /* synthetic */ Object H;
        public final /* synthetic */ InterfaceC3986dR J;
        public final /* synthetic */ InterfaceC5203hl0 K;

        public static final class a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ InterfaceC3986dR H;
            public final /* synthetic */ InterfaceC5203hl0 I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3986dR interfaceC3986dR, InterfaceC5203hl0 interfaceC5203hl0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = interfaceC3986dR;
                this.I = interfaceC5203hl0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                a aVar = new a(this.H, this.I, interfaceC1416Ks);
                aVar.G = obj;
                return aVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.G;
                    InterfaceC3986dR interfaceC3986dR = this.H;
                    InterfaceC5203hl0 interfaceC5203hl0 = this.I;
                    this.F = 1;
                    if (interfaceC3986dR.invoke(interfaceC7484pt, interfaceC5203hl0, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ WE0 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WE0 we0) {
                super(2);
                this.B = we0;
            }

            public final void a(Set set, AbstractC3720cU0 abstractC3720cU0) {
                InterfaceC3788cj interfaceC3788cjU;
                G10.g(set, "changed");
                G10.g(abstractC3720cU0, "<anonymous parameter 1>");
                Object obj = this.B.e;
                WE0 we0 = this.B;
                synchronized (obj) {
                    if (((c) we0.r.getValue()).compareTo(c.Idle) >= 0) {
                        we0.i.add(set);
                        interfaceC3788cjU = we0.U();
                    } else {
                        interfaceC3788cjU = null;
                    }
                }
                if (interfaceC3788cjU != null) {
                    AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                    interfaceC3788cjU.x(AbstractC4512fJ0.a(G91.a));
                }
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Set) obj, (AbstractC3720cU0) obj2);
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC3986dR interfaceC3986dR, InterfaceC5203hl0 interfaceC5203hl0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.J = interfaceC3986dR;
            this.K = interfaceC5203hl0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            i iVar = WE0.this.new i(this.J, this.K, interfaceC1416Ks);
            iVar.H = obj;
            return iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.WE0.i.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((i) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class j extends SZ0 implements InterfaceC3986dR {
        public Object F;
        public Object G;
        public Object H;
        public Object I;
        public Object J;
        public int K;
        public /* synthetic */ Object L;

        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ WE0 B;
            public final /* synthetic */ List C;
            public final /* synthetic */ List D;
            public final /* synthetic */ Set E;
            public final /* synthetic */ List F;
            public final /* synthetic */ Set G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WE0 we0, List list, List list2, Set set, List list3, Set set2) {
                super(1);
                this.B = we0;
                this.C = list;
                this.D = list2;
                this.E = set;
                this.F = list3;
                this.G = set2;
            }

            public final InterfaceC3788cj a(long j) {
                Object objA;
                WX wx;
                WX wx2;
                InterfaceC3788cj interfaceC3788cjU;
                if (this.B.b.k()) {
                    WE0 we0 = this.B;
                    Q41 q41 = Q41.a;
                    objA = q41.a("Recomposer:animation");
                    try {
                        we0.b.l(j);
                        AbstractC3720cU0.e.g();
                        G91 g91 = G91.a;
                        q41.b(objA);
                    } finally {
                        Q41.a.b(objA);
                    }
                }
                WE0 we02 = this.B;
                List list = this.C;
                List list2 = this.D;
                Set set = this.E;
                List list3 = this.F;
                Set set2 = this.G;
                objA = Q41.a.a("Recomposer:recompose");
                try {
                    synchronized (we02.e) {
                        try {
                            we02.i0();
                            List list4 = we02.j;
                            int size = list4.size();
                            for (int i = 0; i < size; i++) {
                                list.add((InterfaceC2165Rs) list4.get(i));
                            }
                            we02.j.clear();
                            G91 g912 = G91.a;
                        } finally {
                        }
                    }
                    wx = new WX();
                    wx2 = new WX();
                } catch (Throwable th) {
                    throw th;
                }
                while (true) {
                    if (list.isEmpty() && list2.isEmpty()) {
                        break;
                    }
                    try {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            InterfaceC2165Rs interfaceC2165Rs = (InterfaceC2165Rs) list.get(i2);
                            wx2.add(interfaceC2165Rs);
                            InterfaceC2165Rs interfaceC2165RsF0 = we02.f0(interfaceC2165Rs, wx);
                            if (interfaceC2165RsF0 != null) {
                                list3.add(interfaceC2165RsF0);
                            }
                        }
                        list.clear();
                        if (wx.v()) {
                            synchronized (we02.e) {
                                try {
                                    List list5 = we02.h;
                                    int size3 = list5.size();
                                    for (int i3 = 0; i3 < size3; i3++) {
                                        InterfaceC2165Rs interfaceC2165Rs2 = (InterfaceC2165Rs) list5.get(i3);
                                        if (!wx2.contains(interfaceC2165Rs2) && interfaceC2165Rs2.b(wx)) {
                                            list.add(interfaceC2165Rs2);
                                        }
                                    }
                                    G91 g913 = G91.a;
                                } finally {
                                }
                            }
                        }
                        if (list.isEmpty()) {
                            j.z(list2, we02);
                            while (!list2.isEmpty()) {
                                AbstractC2141Rm.A(set, we02.e0(list2, wx));
                                j.z(list2, we02);
                            }
                        }
                    } catch (Throwable th2) {
                        list.clear();
                        throw th2;
                    }
                    throw th;
                }
                if (!list3.isEmpty()) {
                    we02.a = we02.W() + 1;
                    try {
                        AbstractC2141Rm.A(set2, list3);
                        int size4 = list3.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            ((InterfaceC2165Rs) list3.get(i4)).i();
                        }
                        list3.clear();
                    } catch (Throwable th3) {
                        list3.clear();
                        throw th3;
                    }
                }
                if (!set.isEmpty()) {
                    try {
                        AbstractC2141Rm.A(set2, set);
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC2165Rs) it.next()).d();
                        }
                        set.clear();
                    } catch (Throwable th4) {
                        set.clear();
                        throw th4;
                    }
                }
                if (!set2.isEmpty()) {
                    try {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC2165Rs) it2.next()).p();
                        }
                        set2.clear();
                    } catch (Throwable th5) {
                        set2.clear();
                        throw th5;
                    }
                }
                we02.V();
                synchronized (we02.e) {
                    interfaceC3788cjU = we02.U();
                }
                return interfaceC3788cjU;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).longValue());
            }
        }

        public j(InterfaceC1416Ks interfaceC1416Ks) {
            super(3, interfaceC1416Ks);
        }

        public static final void z(List list, WE0 we0) {
            list.clear();
            synchronized (we0.e) {
                try {
                    List list2 = we0.l;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        list.add((C0661Dl0) list2.get(i));
                    }
                    we0.l.clear();
                    G91 g91 = G91.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
        
            if (r14.p0(r4, r13) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
        
            r1 = r7;
            r7 = r6;
            r6 = r1;
            r4 = r8;
            r5 = r9;
            r1 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.WE0.j.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3986dR
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC5203hl0 interfaceC5203hl0, InterfaceC1416Ks interfaceC1416Ks) {
            j jVar = WE0.this.new j(interfaceC1416Ks);
            jVar.L = interfaceC5203hl0;
            return jVar.q(G91.a);
        }
    }

    public static final class k extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC2165Rs B;
        public final /* synthetic */ WX C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC2165Rs interfaceC2165Rs, WX wx) {
            super(1);
            this.B = interfaceC2165Rs;
            this.C = wx;
        }

        public final void a(Object obj) {
            G10.g(obj, "value");
            this.B.l(obj);
            WX wx = this.C;
            if (wx != null) {
                wx.add(obj);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return G91.a;
        }
    }

    public WE0(InterfaceC4684ft interfaceC4684ft) {
        G10.g(interfaceC4684ft, "effectCoroutineContext");
        C1887Pg c1887Pg = new C1887Pg(new d());
        this.b = c1887Pg;
        InterfaceC1707Nn interfaceC1707NnA = AbstractC3053a40.a((U30) interfaceC4684ft.a(U30.k));
        interfaceC1707NnA.E0(new e());
        this.c = interfaceC1707NnA;
        this.d = interfaceC4684ft.U(c1887Pg).U(interfaceC1707NnA);
        this.e = new Object();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.r = AbstractC7095oW0.a(c.Inactive);
        this.s = new b();
    }

    public static final void d0(List list, WE0 we0, InterfaceC2165Rs interfaceC2165Rs) {
        list.clear();
        synchronized (we0.e) {
            try {
                Iterator it = we0.l.iterator();
                while (it.hasNext()) {
                    C0661Dl0 c0661Dl0 = (C0661Dl0) it.next();
                    if (G10.c(c0661Dl0.b(), interfaceC2165Rs)) {
                        list.add(c0661Dl0);
                        it.remove();
                    }
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void R(C7729qm0 c7729qm0) {
        try {
            if (c7729qm0.A() instanceof AbstractC3999dU0.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c7729qm0.d();
        }
    }

    public final Object S(InterfaceC1416Ks interfaceC1416Ks) {
        if (Z()) {
            return G91.a;
        }
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        synchronized (this.e) {
            try {
                if (Z()) {
                    AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                    c4067dj.x(AbstractC4512fJ0.a(G91.a));
                } else {
                    this.o = c4067dj;
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU == I10.c() ? objU : G91.a;
    }

    public final void T() {
        synchronized (this.e) {
            try {
                if (((c) this.r.getValue()).compareTo(c.Idle) >= 0) {
                    this.r.setValue(c.ShuttingDown);
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        U30.a.a(this.c, null, 1, null);
    }

    public final InterfaceC3788cj U() {
        c cVar;
        if (((c) this.r.getValue()).compareTo(c.ShuttingDown) <= 0) {
            this.h.clear();
            this.i.clear();
            this.j.clear();
            this.k.clear();
            this.l.clear();
            InterfaceC3788cj interfaceC3788cj = this.o;
            if (interfaceC3788cj != null) {
                InterfaceC3788cj.a.a(interfaceC3788cj, null, 1, null);
            }
            this.o = null;
            return null;
        }
        if (this.f == null) {
            this.i.clear();
            this.j.clear();
            cVar = this.b.k() ? c.InactivePendingWork : c.Inactive;
        } else {
            cVar = (this.j.isEmpty() && this.i.isEmpty() && this.k.isEmpty() && this.l.isEmpty() && this.p <= 0 && !this.b.k()) ? c.Idle : c.PendingWork;
        }
        this.r.setValue(cVar);
        if (cVar != c.PendingWork) {
            return null;
        }
        InterfaceC3788cj interfaceC3788cj2 = this.o;
        this.o = null;
        return interfaceC3788cj2;
    }

    public final void V() {
        int i2;
        List listK;
        synchronized (this.e) {
            try {
                if (this.m.isEmpty()) {
                    listK = AbstractC1599Mm.k();
                } else {
                    List listX = AbstractC1703Nm.x(this.m.values());
                    this.m.clear();
                    listK = new ArrayList(listX.size());
                    int size = listX.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C0661Dl0 c0661Dl0 = (C0661Dl0) listX.get(i3);
                        listK.add(D61.a(c0661Dl0, this.n.get(c0661Dl0)));
                    }
                    this.n.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = listK.size();
        for (i2 = 0; i2 < size2; i2++) {
            C0576Cs0 c0576Cs0 = (C0576Cs0) listK.get(i2);
            C0661Dl0 c0661Dl02 = (C0661Dl0) c0576Cs0.a();
            C0548Cl0 c0548Cl0 = (C0548Cl0) c0576Cs0.b();
            if (c0548Cl0 != null) {
                c0661Dl02.b().m(c0548Cl0);
            }
        }
    }

    public final long W() {
        return this.a;
    }

    public final InterfaceC6537mW0 X() {
        return this.r;
    }

    public final boolean Y() {
        return !this.j.isEmpty() || this.b.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Z() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.e
            monitor-enter(r0)
            java.util.List r1 = r2.i     // Catch: java.lang.Throwable -> L22
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            java.util.List r1 = r2.j     // Catch: java.lang.Throwable -> L22
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            com.daaw.Pg r1 = r2.b     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.k()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L20
            goto L24
        L20:
            r1 = 0
            goto L25
        L22:
            r1 = move-exception
            goto L27
        L24:
            r1 = 1
        L25:
            monitor-exit(r0)
            return r1
        L27:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.WE0.Z():boolean");
    }

    @Override // com.daaw.AbstractC1300Jp
    public void a(InterfaceC2165Rs interfaceC2165Rs, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC2165Rs, "composition");
        G10.g(interfaceC3429bR, "content");
        boolean zJ = interfaceC2165Rs.j();
        AbstractC3720cU0.a aVar = AbstractC3720cU0.e;
        C7729qm0 c7729qm0H = aVar.h(g0(interfaceC2165Rs), l0(interfaceC2165Rs, null));
        try {
            AbstractC3720cU0 abstractC3720cU0K = c7729qm0H.k();
            try {
                interfaceC2165Rs.g(interfaceC3429bR);
                G91 g91 = G91.a;
                if (!zJ) {
                    aVar.c();
                }
                synchronized (this.e) {
                    if (((c) this.r.getValue()).compareTo(c.ShuttingDown) > 0 && !this.h.contains(interfaceC2165Rs)) {
                        this.h.add(interfaceC2165Rs);
                    }
                }
                c0(interfaceC2165Rs);
                interfaceC2165Rs.i();
                interfaceC2165Rs.d();
                if (zJ) {
                    return;
                }
                aVar.c();
            } finally {
                c7729qm0H.r(abstractC3720cU0K);
            }
        } finally {
            R(c7729qm0H);
        }
    }

    public final boolean a0() {
        boolean z;
        synchronized (this.e) {
            z = this.q;
        }
        if (!z) {
            return true;
        }
        Iterator it = this.c.F().iterator();
        while (it.hasNext()) {
            if (((U30) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1300Jp
    public void b(C0661Dl0 c0661Dl0) {
        G10.g(c0661Dl0, "reference");
        synchronized (this.e) {
            Map map = this.m;
            c0661Dl0.c();
            XE0.a(map, null, c0661Dl0);
        }
    }

    public final Object b0(InterfaceC1416Ks interfaceC1416Ks) {
        Object objI = AbstractC7894rN.i(X(), new f(null), interfaceC1416Ks);
        return objI == I10.c() ? objI : G91.a;
    }

    public final void c0(InterfaceC2165Rs interfaceC2165Rs) {
        synchronized (this.e) {
            List list = this.l;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (G10.c(((C0661Dl0) list.get(i2)).b(), interfaceC2165Rs)) {
                    G91 g91 = G91.a;
                    ArrayList arrayList = new ArrayList();
                    d0(arrayList, this, interfaceC2165Rs);
                    while (!arrayList.isEmpty()) {
                        e0(arrayList, null);
                        d0(arrayList, this, interfaceC2165Rs);
                    }
                    return;
                }
            }
        }
    }

    @Override // com.daaw.AbstractC1300Jp
    public boolean d() {
        return false;
    }

    public final List e0(List list, WX wx) {
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            InterfaceC2165Rs interfaceC2165RsB = ((C0661Dl0) obj).b();
            Object arrayList2 = map.get(interfaceC2165RsB);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(interfaceC2165RsB, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            InterfaceC2165Rs interfaceC2165Rs = (InterfaceC2165Rs) entry.getKey();
            List list2 = (List) entry.getValue();
            AbstractC6348lp.X(!interfaceC2165Rs.j());
            C7729qm0 c7729qm0H = AbstractC3720cU0.e.h(g0(interfaceC2165Rs), l0(interfaceC2165Rs, wx));
            try {
                AbstractC3720cU0 abstractC3720cU0K = c7729qm0H.k();
                try {
                    synchronized (this.e) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            C0661Dl0 c0661Dl0 = (C0661Dl0) list2.get(i3);
                            Map map2 = this.m;
                            c0661Dl0.c();
                            arrayList.add(D61.a(c0661Dl0, XE0.b(map2, null)));
                        }
                    }
                    interfaceC2165Rs.k(arrayList);
                    G91 g91 = G91.a;
                } finally {
                    c7729qm0H.r(abstractC3720cU0K);
                }
            } finally {
                R(c7729qm0H);
            }
        }
        return AbstractC2455Um.M0(map.keySet());
    }

    @Override // com.daaw.AbstractC1300Jp
    public int f() {
        return 1000;
    }

    public final InterfaceC2165Rs f0(InterfaceC2165Rs interfaceC2165Rs, WX wx) {
        if (interfaceC2165Rs.j() || interfaceC2165Rs.f()) {
            return null;
        }
        C7729qm0 c7729qm0H = AbstractC3720cU0.e.h(g0(interfaceC2165Rs), l0(interfaceC2165Rs, wx));
        try {
            AbstractC3720cU0 abstractC3720cU0K = c7729qm0H.k();
            if (wx != null) {
                try {
                    if (wx.v()) {
                        interfaceC2165Rs.r(new g(wx, interfaceC2165Rs));
                    }
                } catch (Throwable th) {
                    c7729qm0H.r(abstractC3720cU0K);
                    throw th;
                }
            }
            boolean zS = interfaceC2165Rs.s();
            c7729qm0H.r(abstractC3720cU0K);
            if (zS) {
                return interfaceC2165Rs;
            }
            return null;
        } finally {
            R(c7729qm0H);
        }
    }

    @Override // com.daaw.AbstractC1300Jp
    public InterfaceC4684ft g() {
        return this.d;
    }

    public final NQ g0(InterfaceC2165Rs interfaceC2165Rs) {
        return new h(interfaceC2165Rs);
    }

    @Override // com.daaw.AbstractC1300Jp
    public void h(C0661Dl0 c0661Dl0) {
        InterfaceC3788cj interfaceC3788cjU;
        G10.g(c0661Dl0, "reference");
        synchronized (this.e) {
            this.l.add(c0661Dl0);
            interfaceC3788cjU = U();
        }
        if (interfaceC3788cjU != null) {
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            interfaceC3788cjU.x(AbstractC4512fJ0.a(G91.a));
        }
    }

    public final Object h0(InterfaceC3986dR interfaceC3986dR, InterfaceC1416Ks interfaceC1416Ks) {
        Object objF = AbstractC8539th.f(this.b, new i(interfaceC3986dR, AbstractC5481il0.a(interfaceC1416Ks.getContext()), null), interfaceC1416Ks);
        return objF == I10.c() ? objF : G91.a;
    }

    @Override // com.daaw.AbstractC1300Jp
    public void i(InterfaceC2165Rs interfaceC2165Rs) {
        InterfaceC3788cj interfaceC3788cjU;
        G10.g(interfaceC2165Rs, "composition");
        synchronized (this.e) {
            if (this.j.contains(interfaceC2165Rs)) {
                interfaceC3788cjU = null;
            } else {
                this.j.add(interfaceC2165Rs);
                interfaceC3788cjU = U();
            }
        }
        if (interfaceC3788cjU != null) {
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            interfaceC3788cjU.x(AbstractC4512fJ0.a(G91.a));
        }
    }

    public final void i0() {
        if (this.i.isEmpty()) {
            return;
        }
        List list = this.i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Set set = (Set) list.get(i2);
            List list2 = this.h;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((InterfaceC2165Rs) list2.get(i3)).h(set);
            }
        }
        this.i.clear();
        if (U() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
        }
    }

    @Override // com.daaw.AbstractC1300Jp
    public void j(C0661Dl0 c0661Dl0, C0548Cl0 c0548Cl0) {
        G10.g(c0661Dl0, "reference");
        G10.g(c0548Cl0, "data");
        synchronized (this.e) {
            this.n.put(c0661Dl0, c0548Cl0);
            G91 g91 = G91.a;
        }
    }

    public final void j0(U30 u30) {
        synchronized (this.e) {
            Throwable th = this.g;
            if (th != null) {
                throw th;
            }
            if (((c) this.r.getValue()).compareTo(c.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.f != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.f = u30;
            U();
        }
    }

    @Override // com.daaw.AbstractC1300Jp
    public C0548Cl0 k(C0661Dl0 c0661Dl0) {
        C0548Cl0 c0548Cl0;
        G10.g(c0661Dl0, "reference");
        synchronized (this.e) {
            c0548Cl0 = (C0548Cl0) this.n.remove(c0661Dl0);
        }
        return c0548Cl0;
    }

    public final Object k0(InterfaceC1416Ks interfaceC1416Ks) {
        Object objH0 = h0(new j(null), interfaceC1416Ks);
        return objH0 == I10.c() ? objH0 : G91.a;
    }

    @Override // com.daaw.AbstractC1300Jp
    public void l(Set set) {
        G10.g(set, "table");
    }

    public final NQ l0(InterfaceC2165Rs interfaceC2165Rs, WX wx) {
        return new k(interfaceC2165Rs, wx);
    }

    @Override // com.daaw.AbstractC1300Jp
    public void p(InterfaceC2165Rs interfaceC2165Rs) {
        G10.g(interfaceC2165Rs, "composition");
        synchronized (this.e) {
            this.h.remove(interfaceC2165Rs);
            this.j.remove(interfaceC2165Rs);
            this.k.remove(interfaceC2165Rs);
            G91 g91 = G91.a;
        }
    }
}
