package com.daaw;

import com.daaw.AbstractC6323lk;
import com.daaw.ExecutorC3034a01;
import com.daaw.InterfaceC2971Zl;
import com.daaw.InterfaceC3803cm;
import com.daaw.InterfaceC4888ge;
import com.daaw.InterfaceC7420pg0;
import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.s10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8077s10 implements InterfaceC6125l10, O51 {
    public final C6404m10 a;
    public final String b;
    public final String c;
    public final InterfaceC4888ge.a d;
    public final j e;
    public final InterfaceC3803cm f;
    public final ScheduledExecutorService g;
    public final C4720g10 h;
    public final C1272Ji i;
    public final C7996rk j;
    public final AbstractC6323lk k;
    public final ExecutorC3034a01 l;
    public final k m;
    public volatile List n;
    public InterfaceC4888ge o;
    public final C8772uX0 p;
    public ExecutorC3034a01.d q;
    public ExecutorC3034a01.d r;
    public InterfaceC7420pg0 s;
    public InterfaceC0463Bq v;
    public volatile InterfaceC7420pg0 w;
    public C6262lX0 y;
    public final Collection t = new ArrayList();
    public final AbstractC4018dZ u = new a();
    public volatile C1408Kq x = C1408Kq.a(EnumC1304Jq.IDLE);

    /* JADX INFO: renamed from: com.daaw.s10$a */
    public class a extends AbstractC4018dZ {
        public a() {
        }

        @Override // com.daaw.AbstractC4018dZ
        public void b() {
            C8077s10.this.e.a(C8077s10.this);
        }

        @Override // com.daaw.AbstractC4018dZ
        public void c() {
            C8077s10.this.e.b(C8077s10.this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8077s10.this.q = null;
            C8077s10.this.k.a(AbstractC6323lk.a.INFO, "CONNECTING after backoff");
            C8077s10.this.M(EnumC1304Jq.CONNECTING);
            C8077s10.this.S();
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C8077s10.this.x.c() == EnumC1304Jq.IDLE) {
                C8077s10.this.k.a(AbstractC6323lk.a.INFO, "CONNECTING as requested");
                C8077s10.this.M(EnumC1304Jq.CONNECTING);
                C8077s10.this.S();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$d */
    public class d implements Runnable {
        public final /* synthetic */ List B;

        /* JADX INFO: renamed from: com.daaw.s10$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC7420pg0 interfaceC7420pg0 = C8077s10.this.s;
                C8077s10.this.r = null;
                C8077s10.this.s = null;
                interfaceC7420pg0.g(C6262lX0.u.q("InternalSubchannel closed transport due to address change"));
            }
        }

        public d(List list) {
            this.B = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC7420pg0 interfaceC7420pg0;
            SocketAddress socketAddressA = C8077s10.this.m.a();
            C8077s10.this.m.h(this.B);
            C8077s10.this.n = this.B;
            EnumC1304Jq enumC1304JqC = C8077s10.this.x.c();
            EnumC1304Jq enumC1304Jq = EnumC1304Jq.READY;
            if ((enumC1304JqC != enumC1304Jq && C8077s10.this.x.c() != EnumC1304Jq.CONNECTING) || C8077s10.this.m.g(socketAddressA)) {
                interfaceC7420pg0 = null;
            } else if (C8077s10.this.x.c() == enumC1304Jq) {
                interfaceC7420pg0 = C8077s10.this.w;
                C8077s10.this.w = null;
                C8077s10.this.m.f();
                C8077s10.this.M(EnumC1304Jq.IDLE);
            } else {
                C8077s10.this.v.g(C6262lX0.u.q("InternalSubchannel closed pending transport due to address change"));
                C8077s10.this.v = null;
                C8077s10.this.m.f();
                C8077s10.this.S();
                interfaceC7420pg0 = null;
            }
            if (interfaceC7420pg0 != null) {
                if (C8077s10.this.r != null) {
                    C8077s10.this.s.g(C6262lX0.u.q("InternalSubchannel closed transport early due to address change"));
                    C8077s10.this.r.a();
                    C8077s10.this.r = null;
                    C8077s10.this.s = null;
                }
                C8077s10.this.s = interfaceC7420pg0;
                C8077s10 c8077s10 = C8077s10.this;
                c8077s10.r = c8077s10.l.c(new a(), 5L, TimeUnit.SECONDS, C8077s10.this.g);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$e */
    public class e implements Runnable {
        public final /* synthetic */ C6262lX0 B;

        public e(C6262lX0 c6262lX0) {
            this.B = c6262lX0;
        }

        @Override // java.lang.Runnable
        public void run() {
            EnumC1304Jq enumC1304JqC = C8077s10.this.x.c();
            EnumC1304Jq enumC1304Jq = EnumC1304Jq.SHUTDOWN;
            if (enumC1304JqC == enumC1304Jq) {
                return;
            }
            C8077s10.this.y = this.B;
            InterfaceC7420pg0 interfaceC7420pg0 = C8077s10.this.w;
            InterfaceC0463Bq interfaceC0463Bq = C8077s10.this.v;
            C8077s10.this.w = null;
            C8077s10.this.v = null;
            C8077s10.this.M(enumC1304Jq);
            C8077s10.this.m.f();
            if (C8077s10.this.t.isEmpty()) {
                C8077s10.this.O();
            }
            C8077s10.this.K();
            if (C8077s10.this.r != null) {
                C8077s10.this.r.a();
                C8077s10.this.s.g(this.B);
                C8077s10.this.r = null;
                C8077s10.this.s = null;
            }
            if (interfaceC7420pg0 != null) {
                interfaceC7420pg0.g(this.B);
            }
            if (interfaceC0463Bq != null) {
                interfaceC0463Bq.g(this.B);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8077s10.this.k.a(AbstractC6323lk.a.INFO, "Terminated");
            C8077s10.this.e.d(C8077s10.this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$g */
    public class g implements Runnable {
        public final /* synthetic */ InterfaceC0463Bq B;
        public final /* synthetic */ boolean C;

        public g(InterfaceC0463Bq interfaceC0463Bq, boolean z) {
            this.B = interfaceC0463Bq;
            this.C = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8077s10.this.u.e(this.B, this.C);
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$h */
    public class h implements Runnable {
        public final /* synthetic */ C6262lX0 B;

        public h(C6262lX0 c6262lX0) {
            this.B = c6262lX0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(C8077s10.this.t).iterator();
            while (it.hasNext()) {
                ((InterfaceC7420pg0) it.next()).d(this.B);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$i */
    public static final class i extends AbstractC6787nP {
        public final InterfaceC0463Bq a;
        public final C1272Ji b;

        /* JADX INFO: renamed from: com.daaw.s10$i$a */
        public class a extends AbstractC6229lP {
            public final /* synthetic */ InterfaceC2867Yl a;

            /* JADX INFO: renamed from: com.daaw.s10$i$a$a, reason: collision with other inner class name */
            public class C0232a extends AbstractC6508mP {
                public final /* synthetic */ InterfaceC2971Zl a;

                public C0232a(InterfaceC2971Zl interfaceC2971Zl) {
                    this.a = interfaceC2971Zl;
                }

                @Override // com.daaw.AbstractC6508mP, com.daaw.InterfaceC2971Zl
                public void c(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
                    i.this.b.a(c6262lX0.o());
                    super.c(c6262lX0, aVar, c2756Xj0);
                }

                @Override // com.daaw.AbstractC6508mP
                public InterfaceC2971Zl e() {
                    return this.a;
                }
            }

            public a(InterfaceC2867Yl interfaceC2867Yl) {
                this.a = interfaceC2867Yl;
            }

            @Override // com.daaw.AbstractC6229lP, com.daaw.InterfaceC2867Yl
            public void l(InterfaceC2971Zl interfaceC2971Zl) {
                i.this.b.b();
                super.l(new C0232a(interfaceC2971Zl));
            }

            @Override // com.daaw.AbstractC6229lP
            public InterfaceC2867Yl o() {
                return this.a;
            }
        }

        public /* synthetic */ i(InterfaceC0463Bq interfaceC0463Bq, C1272Ji c1272Ji, a aVar) {
            this(interfaceC0463Bq, c1272Ji);
        }

        @Override // com.daaw.AbstractC6787nP
        public InterfaceC0463Bq a() {
            return this.a;
        }

        @Override // com.daaw.AbstractC6787nP, com.daaw.InterfaceC3525bm
        public InterfaceC2867Yl c(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C1168Ii c1168Ii, AbstractC3246am[] abstractC3246amArr) {
            return new a(super.c(c6882nk0, c2756Xj0, c1168Ii, abstractC3246amArr));
        }

        public i(InterfaceC0463Bq interfaceC0463Bq, C1272Ji c1272Ji) {
            this.a = interfaceC0463Bq;
            this.b = c1272Ji;
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$j */
    public static abstract class j {
        public abstract void a(C8077s10 c8077s10);

        public abstract void b(C8077s10 c8077s10);

        public abstract void c(C8077s10 c8077s10, C1408Kq c1408Kq);

        public abstract void d(C8077s10 c8077s10);
    }

    /* JADX INFO: renamed from: com.daaw.s10$k */
    public static final class k {
        public List a;
        public int b;
        public int c;

        public k(List list) {
            this.a = list;
        }

        public SocketAddress a() {
            return (SocketAddress) ((C5350iH) this.a.get(this.b)).a().get(this.c);
        }

        public C1971Qb b() {
            return ((C5350iH) this.a.get(this.b)).b();
        }

        public void c() {
            C5350iH c5350iH = (C5350iH) this.a.get(this.b);
            int i = this.c + 1;
            this.c = i;
            if (i >= c5350iH.a().size()) {
                this.b++;
                this.c = 0;
            }
        }

        public boolean d() {
            return this.b == 0 && this.c == 0;
        }

        public boolean e() {
            return this.b < this.a.size();
        }

        public void f() {
            this.b = 0;
            this.c = 0;
        }

        public boolean g(SocketAddress socketAddress) {
            for (int i = 0; i < this.a.size(); i++) {
                int iIndexOf = ((C5350iH) this.a.get(i)).a().indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.b = i;
                    this.c = iIndexOf;
                    return true;
                }
            }
            return false;
        }

        public void h(List list) {
            this.a = list;
            f();
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$l */
    public class l implements InterfaceC7420pg0.a {
        public final InterfaceC0463Bq a;
        public final SocketAddress b;
        public boolean c = false;

        /* JADX INFO: renamed from: com.daaw.s10$l$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C8077s10.this.o = null;
                if (C8077s10.this.y != null) {
                    AbstractC7785qy0.u(C8077s10.this.w == null, "Unexpected non-null activeTransport");
                    l lVar = l.this;
                    lVar.a.g(C8077s10.this.y);
                    return;
                }
                InterfaceC0463Bq interfaceC0463Bq = C8077s10.this.v;
                l lVar2 = l.this;
                InterfaceC0463Bq interfaceC0463Bq2 = lVar2.a;
                if (interfaceC0463Bq == interfaceC0463Bq2) {
                    C8077s10.this.w = interfaceC0463Bq2;
                    C8077s10.this.v = null;
                    C8077s10.this.M(EnumC1304Jq.READY);
                }
            }
        }

        /* JADX INFO: renamed from: com.daaw.s10$l$b */
        public class b implements Runnable {
            public final /* synthetic */ C6262lX0 B;

            public b(C6262lX0 c6262lX0) {
                this.B = c6262lX0;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C8077s10.this.x.c() == EnumC1304Jq.SHUTDOWN) {
                    return;
                }
                InterfaceC7420pg0 interfaceC7420pg0 = C8077s10.this.w;
                l lVar = l.this;
                if (interfaceC7420pg0 == lVar.a) {
                    C8077s10.this.w = null;
                    C8077s10.this.m.f();
                    C8077s10.this.M(EnumC1304Jq.IDLE);
                    return;
                }
                InterfaceC0463Bq interfaceC0463Bq = C8077s10.this.v;
                l lVar2 = l.this;
                if (interfaceC0463Bq == lVar2.a) {
                    AbstractC7785qy0.w(C8077s10.this.x.c() == EnumC1304Jq.CONNECTING, "Expected state is CONNECTING, actual state is %s", C8077s10.this.x.c());
                    C8077s10.this.m.c();
                    if (C8077s10.this.m.e()) {
                        C8077s10.this.S();
                        return;
                    }
                    C8077s10.this.v = null;
                    C8077s10.this.m.f();
                    C8077s10.this.R(this.B);
                }
            }
        }

        /* JADX INFO: renamed from: com.daaw.s10$l$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C8077s10.this.t.remove(l.this.a);
                if (C8077s10.this.x.c() == EnumC1304Jq.SHUTDOWN && C8077s10.this.t.isEmpty()) {
                    C8077s10.this.O();
                }
            }
        }

        public l(InterfaceC0463Bq interfaceC0463Bq, SocketAddress socketAddress) {
            this.a = interfaceC0463Bq;
            this.b = socketAddress;
        }

        @Override // com.daaw.InterfaceC7420pg0.a
        public void a(C6262lX0 c6262lX0) {
            C8077s10.this.k.b(AbstractC6323lk.a.INFO, "{0} SHUTDOWN with {1}", this.a.f(), C8077s10.this.Q(c6262lX0));
            this.c = true;
            C8077s10.this.l.execute(new b(c6262lX0));
        }

        @Override // com.daaw.InterfaceC7420pg0.a
        public void b() {
            C8077s10.this.k.a(AbstractC6323lk.a.INFO, "READY");
            C8077s10.this.l.execute(new a());
        }

        @Override // com.daaw.InterfaceC7420pg0.a
        public void c() {
            AbstractC7785qy0.u(this.c, "transportShutdown() must be called before transportTerminated().");
            C8077s10.this.k.b(AbstractC6323lk.a.INFO, "{0} Terminated", this.a.f());
            C8077s10.this.h.i(this.a);
            C8077s10.this.P(this.a, false);
            C8077s10.this.l.execute(new c());
        }

        @Override // com.daaw.InterfaceC7420pg0.a
        public void d(boolean z) {
            C8077s10.this.P(this.a, z);
        }
    }

    /* JADX INFO: renamed from: com.daaw.s10$m */
    public static final class m extends AbstractC6323lk {
        public C6404m10 a;

        @Override // com.daaw.AbstractC6323lk
        public void a(AbstractC6323lk.a aVar, String str) {
            C6602mk.d(this.a, aVar, str);
        }

        @Override // com.daaw.AbstractC6323lk
        public void b(AbstractC6323lk.a aVar, String str, Object... objArr) {
            C6602mk.e(this.a, aVar, str, objArr);
        }
    }

    public C8077s10(List list, String str, String str2, InterfaceC4888ge.a aVar, InterfaceC3803cm interfaceC3803cm, ScheduledExecutorService scheduledExecutorService, AZ0 az0, ExecutorC3034a01 executorC3034a01, j jVar, C4720g10 c4720g10, C1272Ji c1272Ji, C7996rk c7996rk, C6404m10 c6404m10, AbstractC6323lk abstractC6323lk) {
        AbstractC7785qy0.o(list, "addressGroups");
        AbstractC7785qy0.e(!list.isEmpty(), "addressGroups is empty");
        L(list, "addressGroups contains null entry");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.n = listUnmodifiableList;
        this.m = new k(listUnmodifiableList);
        this.b = str;
        this.c = str2;
        this.d = aVar;
        this.f = interfaceC3803cm;
        this.g = scheduledExecutorService;
        this.p = (C8772uX0) az0.get();
        this.l = executorC3034a01;
        this.e = jVar;
        this.h = c4720g10;
        this.i = c1272Ji;
        this.j = (C7996rk) AbstractC7785qy0.o(c7996rk, "channelTracer");
        this.a = (C6404m10) AbstractC7785qy0.o(c6404m10, "logId");
        this.k = (AbstractC6323lk) AbstractC7785qy0.o(abstractC6323lk, "channelLogger");
    }

    public static void L(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7785qy0.o(it.next(), str);
        }
    }

    public final void K() {
        this.l.e();
        ExecutorC3034a01.d dVar = this.q;
        if (dVar != null) {
            dVar.a();
            this.q = null;
            this.o = null;
        }
    }

    public final void M(EnumC1304Jq enumC1304Jq) {
        this.l.e();
        N(C1408Kq.a(enumC1304Jq));
    }

    public final void N(C1408Kq c1408Kq) {
        this.l.e();
        if (this.x.c() != c1408Kq.c()) {
            AbstractC7785qy0.u(this.x.c() != EnumC1304Jq.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + c1408Kq);
            this.x = c1408Kq;
            this.e.c(this, c1408Kq);
        }
    }

    public final void O() {
        this.l.execute(new f());
    }

    public final void P(InterfaceC0463Bq interfaceC0463Bq, boolean z) {
        this.l.execute(new g(interfaceC0463Bq, z));
    }

    public final String Q(C6262lX0 c6262lX0) {
        StringBuilder sb = new StringBuilder();
        sb.append(c6262lX0.m());
        if (c6262lX0.n() != null) {
            sb.append("(");
            sb.append(c6262lX0.n());
            sb.append(")");
        }
        if (c6262lX0.l() != null) {
            sb.append("[");
            sb.append(c6262lX0.l());
            sb.append("]");
        }
        return sb.toString();
    }

    public final void R(C6262lX0 c6262lX0) {
        this.l.e();
        N(C1408Kq.b(c6262lX0));
        if (this.o == null) {
            this.o = this.d.get();
        }
        long jA = this.o.a();
        C8772uX0 c8772uX0 = this.p;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jD = jA - c8772uX0.d(timeUnit);
        this.k.b(AbstractC6323lk.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", Q(c6262lX0), Long.valueOf(jD));
        AbstractC7785qy0.u(this.q == null, "previous reconnectTask is not done");
        this.q = this.l.c(new b(), jD, timeUnit, this.g);
    }

    public final void S() {
        SocketAddress socketAddressC;
        C9332wW c9332wW;
        this.l.e();
        AbstractC7785qy0.u(this.q == null, "Should have no reconnectTask scheduled");
        if (this.m.d()) {
            this.p.f().g();
        }
        SocketAddress socketAddressA = this.m.a();
        a aVar = null;
        if (socketAddressA instanceof C9332wW) {
            c9332wW = (C9332wW) socketAddressA;
            socketAddressC = c9332wW.c();
        } else {
            socketAddressC = socketAddressA;
            c9332wW = null;
        }
        C1971Qb c1971QbB = this.m.b();
        String str = (String) c1971QbB.b(C5350iH.d);
        InterfaceC3803cm.a aVar2 = new InterfaceC3803cm.a();
        if (str == null) {
            str = this.b;
        }
        InterfaceC3803cm.a aVarG = aVar2.e(str).f(c1971QbB).h(this.c).g(c9332wW);
        m mVar = new m();
        mVar.a = f();
        i iVar = new i(this.f.t0(socketAddressC, aVarG, mVar), this.i, aVar);
        mVar.a = iVar.f();
        this.h.c(iVar);
        this.v = iVar;
        this.t.add(iVar);
        Runnable runnableB = iVar.b(new l(iVar, socketAddressC));
        if (runnableB != null) {
            this.l.b(runnableB);
        }
        this.k.b(AbstractC6323lk.a.INFO, "Started transport {0}", mVar.a);
    }

    public void T(List list) {
        AbstractC7785qy0.o(list, "newAddressGroups");
        L(list, "newAddressGroups contains null entry");
        AbstractC7785qy0.e(!list.isEmpty(), "newAddressGroups is empty");
        this.l.execute(new d(DesugarCollections.unmodifiableList(new ArrayList(list))));
    }

    @Override // com.daaw.O51
    public InterfaceC3525bm a() {
        InterfaceC7420pg0 interfaceC7420pg0 = this.w;
        if (interfaceC7420pg0 != null) {
            return interfaceC7420pg0;
        }
        this.l.execute(new c());
        return null;
    }

    public void d(C6262lX0 c6262lX0) {
        g(c6262lX0);
        this.l.execute(new h(c6262lX0));
    }

    @Override // com.daaw.InterfaceC8921v10
    public C6404m10 f() {
        return this.a;
    }

    public void g(C6262lX0 c6262lX0) {
        this.l.execute(new e(c6262lX0));
    }

    public String toString() {
        return AbstractC6329ll0.b(this).c("logId", this.a.d()).d("addressGroups", this.n).toString();
    }
}
