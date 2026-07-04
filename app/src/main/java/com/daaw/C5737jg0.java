package com.daaw;

import com.daaw.AbstractC0304Ac0;
import com.daaw.AbstractC1699Nl;
import com.daaw.AbstractC2560Vm0;
import com.daaw.AbstractC3246am;
import com.daaw.AbstractC5278i10;
import com.daaw.AbstractC5636jJ0;
import com.daaw.AbstractC6323lk;
import com.daaw.C1272Ji;
import com.daaw.C1803Ol;
import com.daaw.C1971Qb;
import com.daaw.C4878gc;
import com.daaw.C4999h10;
import com.daaw.C7141og0;
import com.daaw.C8077s10;
import com.daaw.ExecutorC3034a01;
import com.daaw.InterfaceC4888ge;
import com.daaw.InterfaceC7420pg0;
import j$.util.DesugarCollections;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.jg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5737jg0 extends AbstractC5178hg0 implements InterfaceC6125l10 {
    public static final Logger n0 = Logger.getLogger(C5737jg0.class.getName());
    public static final Pattern o0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    public static final C6262lX0 p0;
    public static final C6262lX0 q0;
    public static final C6262lX0 r0;
    public static final C7141og0 s0;
    public static final AbstractC5278i10 t0;
    public static final AbstractC1699Nl u0;
    public final AbstractC3515bk A;
    public final String B;
    public AbstractC2560Vm0 C;
    public boolean D;
    public t E;
    public volatile AbstractC0304Ac0.i F;
    public boolean G;
    public final Set H;
    public Collection I;
    public final Object J;
    public final Set K;
    public final C0599Cy L;
    public final z M;
    public final AtomicBoolean N;
    public boolean O;
    public boolean P;
    public volatile boolean Q;
    public final CountDownLatch R;
    public final C1272Ji.b S;
    public final C1272Ji T;
    public final C7996rk U;
    public final AbstractC6323lk V;
    public final C4720g10 W;
    public final v X;
    public w Y;
    public C7141og0 Z;
    public final C6404m10 a;
    public final C7141og0 a0;
    public final String b;
    public boolean b0;
    public final String c;
    public final boolean c0;
    public final C2976Zm0 d;
    public final AbstractC5636jJ0.t d0;
    public final AbstractC2560Vm0.c e;
    public final long e0;
    public final AbstractC2560Vm0.a f;
    public final long f0;
    public final C4878gc g;
    public final boolean g0;
    public final InterfaceC3803cm h;
    public final InterfaceC7420pg0.a h0;
    public final InterfaceC3803cm i;
    public final AbstractC4018dZ i0;
    public final InterfaceC3803cm j;
    public ExecutorC3034a01.d j0;
    public final x k;
    public InterfaceC4888ge k0;
    public final Executor l;
    public final C1803Ol.e l0;
    public final InterfaceC6907np0 m;
    public final AI0 m0;
    public final InterfaceC6907np0 n;
    public final q o;
    public final q p;
    public final G31 q;
    public final int r;
    public final ExecutorC3034a01 s;
    public boolean t;
    public final C1224Iw u;
    public final C2779Xp v;
    public final AZ0 w;
    public final long x;
    public final C1512Lq y;
    public final InterfaceC4888ge.a z;

    /* JADX INFO: renamed from: com.daaw.jg0$a */
    public class a extends AbstractC5278i10 {
        @Override // com.daaw.AbstractC5278i10
        public AbstractC5278i10.b a(AbstractC0304Ac0.f fVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$b */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5737jg0.this.y0(true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$c */
    public final class c implements C1272Ji.b {
        public final /* synthetic */ G31 a;

        public c(G31 g31) {
            this.a = g31;
        }

        @Override // com.daaw.C1272Ji.b
        public C1272Ji a() {
            return new C1272Ji(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$d */
    public final class d implements Runnable {
        public final /* synthetic */ Runnable B;
        public final /* synthetic */ EnumC1304Jq C;

        public d(Runnable runnable, EnumC1304Jq enumC1304Jq) {
            this.B = runnable;
            this.C = enumC1304Jq;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5737jg0.this.y.c(this.B, C5737jg0.this.l, this.C);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$e */
    public final class e extends AbstractC0304Ac0.i {
        public final AbstractC0304Ac0.e a;
        public final /* synthetic */ Throwable b;

        public e(Throwable th) {
            this.b = th;
            this.a = AbstractC0304Ac0.e.e(C6262lX0.t.q("Panic! This is a bug!").p(th));
        }

        @Override // com.daaw.AbstractC0304Ac0.i
        public AbstractC0304Ac0.e a(AbstractC0304Ac0.f fVar) {
            return this.a;
        }

        public String toString() {
            return AbstractC6329ll0.a(e.class).d("panicPickResult", this.a).toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$f */
    public final class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5737jg0.this.N.get() || C5737jg0.this.E == null) {
                return;
            }
            C5737jg0.this.y0(false);
            C5737jg0.this.A0();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$g */
    public final class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5737jg0.this.B0();
            if (C5737jg0.this.F != null) {
                C5737jg0.this.F.b();
            }
            if (C5737jg0.this.E != null) {
                C5737jg0.this.E.a.c();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$h */
    public final class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5737jg0.this.V.a(AbstractC6323lk.a.INFO, "Entering SHUTDOWN state");
            C5737jg0.this.y.b(EnumC1304Jq.SHUTDOWN);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$i */
    public final class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5737jg0.this.O) {
                return;
            }
            C5737jg0.this.O = true;
            C5737jg0.this.F0();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$j */
    public class j implements Thread.UncaughtExceptionHandler {
        public j() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            C5737jg0.n0.log(Level.SEVERE, "[" + C5737jg0.this.f() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            C5737jg0.this.H0(th);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$k */
    public class k extends AbstractC9025vP {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC2560Vm0 abstractC2560Vm0, String str) {
            super(abstractC2560Vm0);
            this.b = str;
        }

        @Override // com.daaw.AbstractC2560Vm0
        public String a() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$m */
    public final class m implements C1803Ol.e {

        /* JADX INFO: renamed from: com.daaw.jg0$m$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5737jg0.this.B0();
            }
        }

        /* JADX INFO: renamed from: com.daaw.jg0$m$b */
        public final class b extends AbstractC5636jJ0 {
            public final /* synthetic */ C6882nk0 E;
            public final /* synthetic */ C2756Xj0 F;
            public final /* synthetic */ C1168Ii G;
            public final /* synthetic */ C6485mJ0 H;
            public final /* synthetic */ LV I;
            public final /* synthetic */ AbstractC5636jJ0.C J;
            public final /* synthetic */ C8594ts K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, C1168Ii c1168Ii, C6485mJ0 c6485mJ0, LV lv, AbstractC5636jJ0.C c, C8594ts c8594ts) {
                super(c6882nk0, c2756Xj0, C5737jg0.this.d0, C5737jg0.this.e0, C5737jg0.this.f0, C5737jg0.this.C0(c1168Ii), C5737jg0.this.i.M0(), c6485mJ0, lv, c);
                this.E = c6882nk0;
                this.F = c2756Xj0;
                this.G = c1168Ii;
                this.H = c6485mJ0;
                this.I = lv;
                this.J = c;
                this.K = c8594ts;
            }

            @Override // com.daaw.AbstractC5636jJ0
            public InterfaceC2867Yl j0(C2756Xj0 c2756Xj0, AbstractC3246am.a aVar, int i, boolean z) {
                C1168Ii c1168IiR = this.G.r(aVar);
                AbstractC3246am[] abstractC3246amArrF = AbstractC7365pU.f(c1168IiR, c2756Xj0, i, z);
                InterfaceC3525bm interfaceC3525bmC = m.this.c(new C9449wu0(this.E, c2756Xj0, c1168IiR));
                C8594ts c8594tsB = this.K.b();
                try {
                    return interfaceC3525bmC.c(this.E, c2756Xj0, c1168IiR, abstractC3246amArrF);
                } finally {
                    this.K.f(c8594tsB);
                }
            }

            @Override // com.daaw.AbstractC5636jJ0
            public void k0() {
                C5737jg0.this.M.d(this);
            }

            @Override // com.daaw.AbstractC5636jJ0
            public C6262lX0 l0() {
                return C5737jg0.this.M.a(this);
            }
        }

        public m() {
        }

        @Override // com.daaw.C1803Ol.e
        public InterfaceC2867Yl a(C6882nk0 c6882nk0, C1168Ii c1168Ii, C2756Xj0 c2756Xj0, C8594ts c8594ts) {
            if (C5737jg0.this.g0) {
                AbstractC5636jJ0.C cG = C5737jg0.this.Z.g();
                C7141og0.b bVar = (C7141og0.b) c1168Ii.h(C7141og0.b.g);
                return new b(c6882nk0, c2756Xj0, c1168Ii, bVar == null ? null : bVar.e, bVar != null ? bVar.f : null, cG, c8594ts);
            }
            InterfaceC3525bm interfaceC3525bmC = c(new C9449wu0(c6882nk0, c2756Xj0, c1168Ii));
            C8594ts c8594tsB = c8594ts.b();
            try {
                return interfaceC3525bmC.c(c6882nk0, c2756Xj0, c1168Ii, AbstractC7365pU.f(c1168Ii, c2756Xj0, 0, false));
            } finally {
                c8594ts.f(c8594tsB);
            }
        }

        public final InterfaceC3525bm c(AbstractC0304Ac0.f fVar) {
            AbstractC0304Ac0.i iVar = C5737jg0.this.F;
            if (C5737jg0.this.N.get()) {
                return C5737jg0.this.L;
            }
            if (iVar == null) {
                C5737jg0.this.s.execute(new a());
                return C5737jg0.this.L;
            }
            InterfaceC3525bm interfaceC3525bmJ = AbstractC7365pU.j(iVar.a(fVar), fVar.a().j());
            return interfaceC3525bmJ != null ? interfaceC3525bmJ : C5737jg0.this.L;
        }

        public /* synthetic */ m(C5737jg0 c5737jg0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$n */
    public static final class n extends AbstractC5941kP {
        public final AbstractC5278i10 a;
        public final AbstractC3515bk b;
        public final Executor c;
        public final C6882nk0 d;
        public final C8594ts e;
        public C1168Ii f;
        public AbstractC1699Nl g;

        /* JADX INFO: renamed from: com.daaw.jg0$n$a */
        public class a extends AbstractRunnableC0471Bs {
            public final /* synthetic */ AbstractC1699Nl.a C;
            public final /* synthetic */ C6262lX0 D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC1699Nl.a aVar, C6262lX0 c6262lX0) {
                super(n.this.e);
                this.C = aVar;
                this.D = c6262lX0;
            }

            @Override // com.daaw.AbstractRunnableC0471Bs
            public void a() {
                this.C.a(this.D, new C2756Xj0());
            }
        }

        public n(AbstractC5278i10 abstractC5278i10, AbstractC3515bk abstractC3515bk, Executor executor, C6882nk0 c6882nk0, C1168Ii c1168Ii) {
            this.a = abstractC5278i10;
            this.b = abstractC3515bk;
            this.d = c6882nk0;
            executor = c1168Ii.e() != null ? c1168Ii.e() : executor;
            this.c = executor;
            this.f = c1168Ii.n(executor);
            this.e = C8594ts.e();
        }

        @Override // com.daaw.AbstractC5941kP, com.daaw.AbstractC3839ct0, com.daaw.AbstractC1699Nl
        public void a(String str, Throwable th) {
            AbstractC1699Nl abstractC1699Nl = this.g;
            if (abstractC1699Nl != null) {
                abstractC1699Nl.a(str, th);
            }
        }

        @Override // com.daaw.AbstractC5941kP, com.daaw.AbstractC1699Nl
        public void e(AbstractC1699Nl.a aVar, C2756Xj0 c2756Xj0) {
            AbstractC5278i10.b bVarA = this.a.a(new C9449wu0(this.d, c2756Xj0, this.f));
            C6262lX0 c6262lX0C = bVarA.c();
            if (!c6262lX0C.o()) {
                h(aVar, AbstractC7365pU.n(c6262lX0C));
                this.g = C5737jg0.u0;
                return;
            }
            bVarA.b();
            C7141og0.b bVarF = ((C7141og0) bVarA.a()).f(this.d);
            if (bVarF != null) {
                this.f = this.f.q(C7141og0.b.g, bVarF);
            }
            AbstractC1699Nl abstractC1699NlE = this.b.e(this.d, this.f);
            this.g = abstractC1699NlE;
            abstractC1699NlE.e(aVar, c2756Xj0);
        }

        @Override // com.daaw.AbstractC5941kP, com.daaw.AbstractC3839ct0
        public AbstractC1699Nl f() {
            return this.g;
        }

        public final void h(AbstractC1699Nl.a aVar, C6262lX0 c6262lX0) {
            this.c.execute(new a(aVar, c6262lX0));
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$o */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5737jg0.this.j0 = null;
            C5737jg0.this.J0();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$p */
    public final class p implements InterfaceC7420pg0.a {
        public p() {
        }

        @Override // com.daaw.InterfaceC7420pg0.a
        public void a(C6262lX0 c6262lX0) {
            AbstractC7785qy0.u(C5737jg0.this.N.get(), "Channel must have been shut down");
        }

        @Override // com.daaw.InterfaceC7420pg0.a
        public void c() {
            AbstractC7785qy0.u(C5737jg0.this.N.get(), "Channel must have been shut down");
            C5737jg0.this.P = true;
            C5737jg0.this.M0(false);
            C5737jg0.this.F0();
            C5737jg0.this.G0();
        }

        @Override // com.daaw.InterfaceC7420pg0.a
        public void d(boolean z) {
            C5737jg0 c5737jg0 = C5737jg0.this;
            c5737jg0.i0.e(c5737jg0.L, z);
        }

        public /* synthetic */ p(C5737jg0 c5737jg0, a aVar) {
            this();
        }

        @Override // com.daaw.InterfaceC7420pg0.a
        public void b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$q */
    public static final class q implements Executor {
        public final InterfaceC6907np0 B;
        public Executor C;

        public q(InterfaceC6907np0 interfaceC6907np0) {
            this.B = (InterfaceC6907np0) AbstractC7785qy0.o(interfaceC6907np0, "executorPool");
        }

        public synchronized Executor a() {
            try {
                if (this.C == null) {
                    this.C = (Executor) AbstractC7785qy0.p((Executor) this.B.a(), "%s.getObject()", this.C);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.C;
        }

        public synchronized void b() {
            Executor executor = this.C;
            if (executor != null) {
                this.C = (Executor) this.B.b(executor);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a().execute(runnable);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$r */
    public final class r extends AbstractC4018dZ {
        public r() {
        }

        @Override // com.daaw.AbstractC4018dZ
        public void b() {
            C5737jg0.this.B0();
        }

        @Override // com.daaw.AbstractC4018dZ
        public void c() {
            if (C5737jg0.this.N.get()) {
                return;
            }
            C5737jg0.this.K0();
        }

        public /* synthetic */ r(C5737jg0 c5737jg0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$s */
    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5737jg0.this.E == null) {
                return;
            }
            C5737jg0.this.A0();
        }

        public /* synthetic */ s(C5737jg0 c5737jg0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$t */
    public final class t extends AbstractC0304Ac0.d {
        public C4878gc.b a;

        /* JADX INFO: renamed from: com.daaw.jg0$t$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5737jg0.this.I0();
            }
        }

        /* JADX INFO: renamed from: com.daaw.jg0$t$b */
        public final class b implements Runnable {
            public final /* synthetic */ AbstractC0304Ac0.i B;
            public final /* synthetic */ EnumC1304Jq C;

            public b(AbstractC0304Ac0.i iVar, EnumC1304Jq enumC1304Jq) {
                this.B = iVar;
                this.C = enumC1304Jq;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = t.this;
                if (tVar != C5737jg0.this.E) {
                    return;
                }
                C5737jg0.this.O0(this.B);
                if (this.C != EnumC1304Jq.SHUTDOWN) {
                    C5737jg0.this.V.b(AbstractC6323lk.a.INFO, "Entering {0} state with picker: {1}", this.C, this.B);
                    C5737jg0.this.y.b(this.C);
                }
            }
        }

        public t() {
        }

        @Override // com.daaw.AbstractC0304Ac0.d
        public AbstractC6323lk b() {
            return C5737jg0.this.V;
        }

        @Override // com.daaw.AbstractC0304Ac0.d
        public ScheduledExecutorService c() {
            return C5737jg0.this.k;
        }

        @Override // com.daaw.AbstractC0304Ac0.d
        public ExecutorC3034a01 d() {
            return C5737jg0.this.s;
        }

        @Override // com.daaw.AbstractC0304Ac0.d
        public void e() {
            C5737jg0.this.s.e();
            C5737jg0.this.s.execute(new a());
        }

        @Override // com.daaw.AbstractC0304Ac0.d
        public void f(EnumC1304Jq enumC1304Jq, AbstractC0304Ac0.i iVar) {
            C5737jg0.this.s.e();
            AbstractC7785qy0.o(enumC1304Jq, "newState");
            AbstractC7785qy0.o(iVar, "newPicker");
            C5737jg0.this.s.execute(new b(iVar, enumC1304Jq));
        }

        @Override // com.daaw.AbstractC0304Ac0.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public D0 a(AbstractC0304Ac0.b bVar) {
            C5737jg0.this.s.e();
            AbstractC7785qy0.u(!C5737jg0.this.P, "Channel is being terminated");
            return C5737jg0.this.new y(bVar, this);
        }

        public /* synthetic */ t(C5737jg0 c5737jg0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$u */
    public final class u extends AbstractC2560Vm0.d {
        public final t a;
        public final AbstractC2560Vm0 b;

        /* JADX INFO: renamed from: com.daaw.jg0$u$a */
        public final class a implements Runnable {
            public final /* synthetic */ C6262lX0 B;

            public a(C6262lX0 c6262lX0) {
                this.B = c6262lX0;
            }

            @Override // java.lang.Runnable
            public void run() {
                u.this.e(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.jg0$u$b */
        public final class b implements Runnable {
            public final /* synthetic */ AbstractC2560Vm0.e B;

            public b(AbstractC2560Vm0.e eVar) {
                this.B = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C7141og0 c7141og0;
                if (C5737jg0.this.C != u.this.b) {
                    return;
                }
                List listA = this.B.a();
                AbstractC6323lk abstractC6323lk = C5737jg0.this.V;
                AbstractC6323lk.a aVar = AbstractC6323lk.a.DEBUG;
                abstractC6323lk.b(aVar, "Resolved address: {0}, config={1}", listA, this.B.b());
                w wVar = C5737jg0.this.Y;
                w wVar2 = w.SUCCESS;
                if (wVar != wVar2) {
                    C5737jg0.this.V.b(AbstractC6323lk.a.INFO, "Address resolved: {0}", listA);
                    C5737jg0.this.Y = wVar2;
                }
                C5737jg0.this.k0 = null;
                AbstractC2560Vm0.b bVarC = this.B.c();
                AbstractC5278i10 abstractC5278i10 = (AbstractC5278i10) this.B.b().b(AbstractC5278i10.a);
                C7141og0 c7141og02 = (bVarC == null || bVarC.c() == null) ? null : (C7141og0) bVarC.c();
                C6262lX0 c6262lX0D = bVarC != null ? bVarC.d() : null;
                if (C5737jg0.this.c0) {
                    if (c7141og02 != null) {
                        if (abstractC5278i10 != null) {
                            C5737jg0.this.X.p(abstractC5278i10);
                            if (c7141og02.c() != null) {
                                C5737jg0.this.V.a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            C5737jg0.this.X.p(c7141og02.c());
                        }
                    } else if (C5737jg0.this.a0 != null) {
                        c7141og02 = C5737jg0.this.a0;
                        C5737jg0.this.X.p(c7141og02.c());
                        C5737jg0.this.V.a(AbstractC6323lk.a.INFO, "Received no service config, using default service config");
                    } else if (c6262lX0D == null) {
                        c7141og02 = C5737jg0.s0;
                        C5737jg0.this.X.p(null);
                    } else {
                        if (!C5737jg0.this.b0) {
                            C5737jg0.this.V.a(AbstractC6323lk.a.INFO, "Fallback to error due to invalid first service config without default config");
                            u.this.a(bVarC.d());
                            return;
                        }
                        c7141og02 = C5737jg0.this.Z;
                    }
                    if (!c7141og02.equals(C5737jg0.this.Z)) {
                        C5737jg0.this.V.b(AbstractC6323lk.a.INFO, "Service config changed{0}", c7141og02 == C5737jg0.s0 ? " to empty" : "");
                        C5737jg0.this.Z = c7141og02;
                    }
                    try {
                        C5737jg0.this.b0 = true;
                    } catch (RuntimeException e) {
                        C5737jg0.n0.log(Level.WARNING, "[" + C5737jg0.this.f() + "] Unexpected exception from parsing service config", (Throwable) e);
                    }
                    c7141og0 = c7141og02;
                } else {
                    if (c7141og02 != null) {
                        C5737jg0.this.V.a(AbstractC6323lk.a.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    c7141og0 = C5737jg0.this.a0 == null ? C5737jg0.s0 : C5737jg0.this.a0;
                    if (abstractC5278i10 != null) {
                        C5737jg0.this.V.a(AbstractC6323lk.a.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    C5737jg0.this.X.p(c7141og0.c());
                }
                C1971Qb c1971QbB = this.B.b();
                u uVar = u.this;
                if (uVar.a == C5737jg0.this.E) {
                    C1971Qb.b bVarC2 = c1971QbB.d().c(AbstractC5278i10.a);
                    Map mapD = c7141og0.d();
                    if (mapD != null) {
                        bVarC2.d(AbstractC0304Ac0.b, mapD).a();
                    }
                    if (u.this.a.a.e(AbstractC0304Ac0.g.d().b(listA).c(bVarC2.a()).d(c7141og0.e()).a())) {
                        return;
                    }
                    u.this.f();
                }
            }
        }

        public u(t tVar, AbstractC2560Vm0 abstractC2560Vm0) {
            this.a = (t) AbstractC7785qy0.o(tVar, "helperImpl");
            this.b = (AbstractC2560Vm0) AbstractC7785qy0.o(abstractC2560Vm0, "resolver");
        }

        @Override // com.daaw.AbstractC2560Vm0.d
        public void a(C6262lX0 c6262lX0) {
            AbstractC7785qy0.e(!c6262lX0.o(), "the error status must not be OK");
            C5737jg0.this.s.execute(new a(c6262lX0));
        }

        @Override // com.daaw.AbstractC2560Vm0.d
        public void b(AbstractC2560Vm0.e eVar) {
            C5737jg0.this.s.execute(new b(eVar));
        }

        public final void e(C6262lX0 c6262lX0) {
            C5737jg0.n0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{C5737jg0.this.f(), c6262lX0});
            C5737jg0.this.X.m();
            w wVar = C5737jg0.this.Y;
            w wVar2 = w.ERROR;
            if (wVar != wVar2) {
                C5737jg0.this.V.b(AbstractC6323lk.a.WARNING, "Failed to resolve name: {0}", c6262lX0);
                C5737jg0.this.Y = wVar2;
            }
            if (this.a != C5737jg0.this.E) {
                return;
            }
            this.a.a.b(c6262lX0);
            f();
        }

        public final void f() {
            if (C5737jg0.this.j0 == null || !C5737jg0.this.j0.b()) {
                if (C5737jg0.this.k0 == null) {
                    C5737jg0 c5737jg0 = C5737jg0.this;
                    c5737jg0.k0 = c5737jg0.z.get();
                }
                long jA = C5737jg0.this.k0.a();
                C5737jg0.this.V.b(AbstractC6323lk.a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(jA));
                C5737jg0 c5737jg02 = C5737jg0.this;
                c5737jg02.j0 = c5737jg02.s.c(c5737jg02.new o(), jA, TimeUnit.NANOSECONDS, C5737jg0.this.i.M0());
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$v */
    public class v extends AbstractC3515bk {
        public final AtomicReference a;
        public final String b;
        public final AbstractC3515bk c;

        /* JADX INFO: renamed from: com.daaw.jg0$v$a */
        public class a extends AbstractC3515bk {
            public a() {
            }

            @Override // com.daaw.AbstractC3515bk
            public String a() {
                return v.this.b;
            }

            @Override // com.daaw.AbstractC3515bk
            public AbstractC1699Nl e(C6882nk0 c6882nk0, C1168Ii c1168Ii) {
                return new C1803Ol(c6882nk0, C5737jg0.this.C0(c1168Ii), c1168Ii, C5737jg0.this.l0, C5737jg0.this.Q ? null : C5737jg0.this.i.M0(), C5737jg0.this.T, null).C(C5737jg0.this.t).B(C5737jg0.this.u).A(C5737jg0.this.v);
            }
        }

        /* JADX INFO: renamed from: com.daaw.jg0$v$b */
        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C5737jg0.this.I == null) {
                    if (v.this.a.get() == C5737jg0.t0) {
                        v.this.a.set(null);
                    }
                    C5737jg0.this.M.b(C5737jg0.q0);
                }
            }
        }

        /* JADX INFO: renamed from: com.daaw.jg0$v$c */
        public final class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (v.this.a.get() == C5737jg0.t0) {
                    v.this.a.set(null);
                }
                if (C5737jg0.this.I != null) {
                    Iterator it = C5737jg0.this.I.iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).a("Channel is forcefully shutdown", null);
                    }
                }
                C5737jg0.this.M.c(C5737jg0.p0);
            }
        }

        /* JADX INFO: renamed from: com.daaw.jg0$v$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5737jg0.this.B0();
            }
        }

        /* JADX INFO: renamed from: com.daaw.jg0$v$f */
        public class f implements Runnable {
            public final /* synthetic */ g B;

            public f(g gVar) {
                this.B = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (v.this.a.get() != C5737jg0.t0) {
                    this.B.r();
                    return;
                }
                if (C5737jg0.this.I == null) {
                    C5737jg0.this.I = new LinkedHashSet();
                    C5737jg0 c5737jg0 = C5737jg0.this;
                    c5737jg0.i0.e(c5737jg0.J, true);
                }
                C5737jg0.this.I.add(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.jg0$v$g */
        public final class g extends AbstractC0495By {
            public final C8594ts l;
            public final C6882nk0 m;
            public final C1168Ii n;

            /* JADX INFO: renamed from: com.daaw.jg0$v$g$a */
            public class a implements Runnable {
                public final /* synthetic */ Runnable B;

                public a(Runnable runnable) {
                    this.B = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.B.run();
                    g gVar = g.this;
                    C5737jg0.this.s.execute(gVar.new b());
                }
            }

            /* JADX INFO: renamed from: com.daaw.jg0$v$g$b */
            public final class b implements Runnable {
                public b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C5737jg0.this.I != null) {
                        C5737jg0.this.I.remove(g.this);
                        if (C5737jg0.this.I.isEmpty()) {
                            C5737jg0 c5737jg0 = C5737jg0.this;
                            c5737jg0.i0.e(c5737jg0.J, false);
                            C5737jg0.this.I = null;
                            if (C5737jg0.this.N.get()) {
                                C5737jg0.this.M.b(C5737jg0.q0);
                            }
                        }
                    }
                }
            }

            public g(C8594ts c8594ts, C6882nk0 c6882nk0, C1168Ii c1168Ii) {
                super(C5737jg0.this.C0(c1168Ii), C5737jg0.this.k, c1168Ii.d());
                this.l = c8594ts;
                this.m = c6882nk0;
                this.n = c1168Ii;
            }

            @Override // com.daaw.AbstractC0495By
            public void j() {
                super.j();
                C5737jg0.this.s.execute(new b());
            }

            public void r() {
                C8594ts c8594tsB = this.l.b();
                try {
                    AbstractC1699Nl abstractC1699NlL = v.this.l(this.m, this.n);
                    this.l.f(c8594tsB);
                    Runnable runnableP = p(abstractC1699NlL);
                    if (runnableP == null) {
                        C5737jg0.this.s.execute(new b());
                    } else {
                        C5737jg0.this.C0(this.n).execute(new a(runnableP));
                    }
                } catch (Throwable th) {
                    this.l.f(c8594tsB);
                    throw th;
                }
            }
        }

        public /* synthetic */ v(C5737jg0 c5737jg0, String str, a aVar) {
            this(str);
        }

        @Override // com.daaw.AbstractC3515bk
        public String a() {
            return this.b;
        }

        @Override // com.daaw.AbstractC3515bk
        public AbstractC1699Nl e(C6882nk0 c6882nk0, C1168Ii c1168Ii) {
            if (this.a.get() != C5737jg0.t0) {
                return l(c6882nk0, c1168Ii);
            }
            C5737jg0.this.s.execute(new d());
            if (this.a.get() != C5737jg0.t0) {
                return l(c6882nk0, c1168Ii);
            }
            if (C5737jg0.this.N.get()) {
                return new e();
            }
            g gVar = new g(C8594ts.e(), c6882nk0, c1168Ii);
            C5737jg0.this.s.execute(new f(gVar));
            return gVar;
        }

        public final AbstractC1699Nl l(C6882nk0 c6882nk0, C1168Ii c1168Ii) {
            AbstractC5278i10 abstractC5278i10 = (AbstractC5278i10) this.a.get();
            if (abstractC5278i10 == null) {
                return this.c.e(c6882nk0, c1168Ii);
            }
            if (!(abstractC5278i10 instanceof C7141og0.c)) {
                return new n(abstractC5278i10, this.c, C5737jg0.this.l, c6882nk0, c1168Ii);
            }
            C7141og0.b bVarF = ((C7141og0.c) abstractC5278i10).b.f(c6882nk0);
            if (bVarF != null) {
                c1168Ii = c1168Ii.q(C7141og0.b.g, bVarF);
            }
            return this.c.e(c6882nk0, c1168Ii);
        }

        public void m() {
            if (this.a.get() == C5737jg0.t0) {
                p(null);
            }
        }

        public void n() {
            C5737jg0.this.s.execute(new b());
        }

        public void o() {
            C5737jg0.this.s.execute(new c());
        }

        public void p(AbstractC5278i10 abstractC5278i10) {
            AbstractC5278i10 abstractC5278i102 = (AbstractC5278i10) this.a.get();
            this.a.set(abstractC5278i10);
            if (abstractC5278i102 != C5737jg0.t0 || C5737jg0.this.I == null) {
                return;
            }
            Iterator it = C5737jg0.this.I.iterator();
            while (it.hasNext()) {
                ((g) it.next()).r();
            }
        }

        public v(String str) {
            this.a = new AtomicReference(C5737jg0.t0);
            this.c = new a();
            this.b = (String) AbstractC7785qy0.o(str, "authority");
        }

        /* JADX INFO: renamed from: com.daaw.jg0$v$e */
        public class e extends AbstractC1699Nl {
            public e() {
            }

            @Override // com.daaw.AbstractC1699Nl
            public void e(AbstractC1699Nl.a aVar, C2756Xj0 c2756Xj0) {
                aVar.a(C5737jg0.q0, new C2756Xj0());
            }

            @Override // com.daaw.AbstractC1699Nl
            public void b() {
            }

            @Override // com.daaw.AbstractC1699Nl
            public void c(int i) {
            }

            @Override // com.daaw.AbstractC1699Nl
            public void d(Object obj) {
            }

            @Override // com.daaw.AbstractC1699Nl
            public void a(String str, Throwable th) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$w */
    public enum w {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* JADX INFO: renamed from: com.daaw.jg0$x */
    public static final class x implements ScheduledExecutorService, AutoCloseable {
        public final ScheduledExecutorService B;

        public /* synthetic */ x(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.B.awaitTermination(j, timeUnit);
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            JO.a(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.B.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection) {
            return this.B.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection) {
            return this.B.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.B.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.B.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            return this.B.schedule(callable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.B.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.B.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Callable callable) {
            return this.B.submit(callable);
        }

        public x(ScheduledExecutorService scheduledExecutorService) {
            this.B = (ScheduledExecutorService) AbstractC7785qy0.o(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
            return this.B.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
            return this.B.invokeAny(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.B.schedule(runnable, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable) {
            return this.B.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable, Object obj) {
            return this.B.submit(runnable, obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$y */
    public final class y extends D0 {
        public final AbstractC0304Ac0.b a;
        public final t b;
        public final C6404m10 c;
        public final C6602mk d;
        public final C7996rk e;
        public List f;
        public C8077s10 g;
        public boolean h;
        public boolean i;
        public ExecutorC3034a01.d j;

        /* JADX INFO: renamed from: com.daaw.jg0$y$a */
        public final class a extends C8077s10.j {
            public final /* synthetic */ AbstractC0304Ac0.j a;

            public a(AbstractC0304Ac0.j jVar) {
                this.a = jVar;
            }

            @Override // com.daaw.C8077s10.j
            public void a(C8077s10 c8077s10) {
                C5737jg0.this.i0.e(c8077s10, true);
            }

            @Override // com.daaw.C8077s10.j
            public void b(C8077s10 c8077s10) {
                C5737jg0.this.i0.e(c8077s10, false);
            }

            @Override // com.daaw.C8077s10.j
            public void c(C8077s10 c8077s10, C1408Kq c1408Kq) {
                AbstractC7785qy0.u(this.a != null, "listener is null");
                this.a.a(c1408Kq);
            }

            @Override // com.daaw.C8077s10.j
            public void d(C8077s10 c8077s10) {
                C5737jg0.this.H.remove(c8077s10);
                C5737jg0.this.W.k(c8077s10);
                C5737jg0.this.G0();
            }
        }

        /* JADX INFO: renamed from: com.daaw.jg0$y$b */
        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                y.this.g.g(C5737jg0.r0);
            }
        }

        public y(AbstractC0304Ac0.b bVar, t tVar) {
            AbstractC7785qy0.o(bVar, "args");
            this.f = bVar.a();
            if (C5737jg0.this.c != null) {
                bVar = bVar.d().e(i(bVar.a())).b();
            }
            this.a = bVar;
            this.b = (t) AbstractC7785qy0.o(tVar, "helper");
            C6404m10 c6404m10B = C6404m10.b("Subchannel", C5737jg0.this.a());
            this.c = c6404m10B;
            C7996rk c7996rk = new C7996rk(c6404m10B, C5737jg0.this.r, C5737jg0.this.q.a(), "Subchannel for " + bVar.a());
            this.e = c7996rk;
            this.d = new C6602mk(c7996rk, C5737jg0.this.q);
        }

        @Override // com.daaw.AbstractC0304Ac0.h
        public List b() {
            C5737jg0.this.s.e();
            AbstractC7785qy0.u(this.h, "not started");
            return this.f;
        }

        @Override // com.daaw.AbstractC0304Ac0.h
        public C1971Qb c() {
            return this.a.b();
        }

        @Override // com.daaw.AbstractC0304Ac0.h
        public Object d() {
            AbstractC7785qy0.u(this.h, "Subchannel is not started");
            return this.g;
        }

        @Override // com.daaw.AbstractC0304Ac0.h
        public void e() {
            C5737jg0.this.s.e();
            AbstractC7785qy0.u(this.h, "not started");
            this.g.a();
        }

        @Override // com.daaw.AbstractC0304Ac0.h
        public void f() {
            ExecutorC3034a01.d dVar;
            C5737jg0.this.s.e();
            if (this.g == null) {
                this.i = true;
                return;
            }
            if (!this.i) {
                this.i = true;
            } else {
                if (!C5737jg0.this.P || (dVar = this.j) == null) {
                    return;
                }
                dVar.a();
                this.j = null;
            }
            if (C5737jg0.this.P) {
                this.g.g(C5737jg0.q0);
            } else {
                this.j = C5737jg0.this.s.c(new RunnableC0733Ed0(new b()), 5L, TimeUnit.SECONDS, C5737jg0.this.i.M0());
            }
        }

        @Override // com.daaw.AbstractC0304Ac0.h
        public void g(AbstractC0304Ac0.j jVar) {
            C5737jg0.this.s.e();
            AbstractC7785qy0.u(!this.h, "already started");
            AbstractC7785qy0.u(!this.i, "already shutdown");
            AbstractC7785qy0.u(!C5737jg0.this.P, "Channel is being terminated");
            this.h = true;
            C8077s10 c8077s10 = new C8077s10(this.a.a(), C5737jg0.this.a(), C5737jg0.this.B, C5737jg0.this.z, C5737jg0.this.i, C5737jg0.this.i.M0(), C5737jg0.this.w, C5737jg0.this.s, new a(jVar), C5737jg0.this.W, C5737jg0.this.S.a(), this.e, this.c, this.d);
            C5737jg0.this.U.e(new C4999h10.a().b("Child Subchannel started").c(C4999h10.b.CT_INFO).e(C5737jg0.this.q.a()).d(c8077s10).a());
            this.g = c8077s10;
            C5737jg0.this.W.e(c8077s10);
            C5737jg0.this.H.add(c8077s10);
        }

        @Override // com.daaw.AbstractC0304Ac0.h
        public void h(List list) {
            C5737jg0.this.s.e();
            this.f = list;
            if (C5737jg0.this.c != null) {
                list = i(list);
            }
            this.g.T(list);
        }

        public final List i(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C5350iH c5350iH = (C5350iH) it.next();
                arrayList.add(new C5350iH(c5350iH.a(), c5350iH.b().d().c(C5350iH.d).a()));
            }
            return DesugarCollections.unmodifiableList(arrayList);
        }

        public String toString() {
            return this.c.toString();
        }
    }

    static {
        C6262lX0 c6262lX0 = C6262lX0.u;
        p0 = c6262lX0.q("Channel shutdownNow invoked");
        q0 = c6262lX0.q("Channel shutdown invoked");
        r0 = c6262lX0.q("Subchannel shutdown invoked");
        s0 = C7141og0.a();
        t0 = new a();
        u0 = new l();
    }

    public C5737jg0(C6016kg0 c6016kg0, InterfaceC3803cm interfaceC3803cm, InterfaceC4888ge.a aVar, InterfaceC6907np0 interfaceC6907np0, AZ0 az0, List list, G31 g31) {
        a aVar2;
        ExecutorC3034a01 executorC3034a01 = new ExecutorC3034a01(new j());
        this.s = executorC3034a01;
        this.y = new C1512Lq();
        this.H = new HashSet(16, 0.75f);
        this.J = new Object();
        this.K = new HashSet(1, 0.75f);
        a aVar3 = null;
        this.M = new z(this, aVar3);
        this.N = new AtomicBoolean(false);
        this.R = new CountDownLatch(1);
        this.Y = w.NO_RESOLUTION;
        this.Z = s0;
        this.b0 = false;
        this.d0 = new AbstractC5636jJ0.t();
        p pVar = new p(this, aVar3);
        this.h0 = pVar;
        this.i0 = new r(this, aVar3);
        this.l0 = new m(this, aVar3);
        String str = (String) AbstractC7785qy0.o(c6016kg0.f, "target");
        this.b = str;
        C6404m10 c6404m10B = C6404m10.b("Channel", str);
        this.a = c6404m10B;
        this.q = (G31) AbstractC7785qy0.o(g31, "timeProvider");
        InterfaceC6907np0 interfaceC6907np02 = (InterfaceC6907np0) AbstractC7785qy0.o(c6016kg0.a, "executorPool");
        this.m = interfaceC6907np02;
        Executor executor = (Executor) AbstractC7785qy0.o((Executor) interfaceC6907np02.a(), "executor");
        this.l = executor;
        this.h = interfaceC3803cm;
        q qVar = new q((InterfaceC6907np0) AbstractC7785qy0.o(c6016kg0.b, "offloadExecutorPool"));
        this.p = qVar;
        C1064Hi c1064Hi = new C1064Hi(interfaceC3803cm, c6016kg0.g, qVar);
        this.i = c1064Hi;
        this.j = new C1064Hi(interfaceC3803cm, null, qVar);
        x xVar = new x(c1064Hi.M0(), aVar3);
        this.k = xVar;
        this.r = c6016kg0.v;
        C7996rk c7996rk = new C7996rk(c6404m10B, c6016kg0.v, g31.a(), "Channel for '" + str + "'");
        this.U = c7996rk;
        C6602mk c6602mk = new C6602mk(c7996rk, g31);
        this.V = c6602mk;
        InterfaceC8405tB0 interfaceC8405tB0 = c6016kg0.y;
        interfaceC8405tB0 = interfaceC8405tB0 == null ? AbstractC7365pU.q : interfaceC8405tB0;
        boolean z2 = c6016kg0.t;
        this.g0 = z2;
        C4878gc c4878gc = new C4878gc(c6016kg0.k);
        this.g = c4878gc;
        this.d = c6016kg0.d;
        C4817gN0 c4817gN0 = new C4817gN0(z2, c6016kg0.p, c6016kg0.q, c4878gc);
        String str2 = c6016kg0.j;
        this.c = str2;
        AbstractC2560Vm0.a aVarA = AbstractC2560Vm0.a.f().c(c6016kg0.e()).f(interfaceC8405tB0).i(executorC3034a01).g(xVar).h(c4817gN0).b(c6602mk).d(qVar).e(str2).a();
        this.f = aVarA;
        AbstractC2560Vm0.c cVar = c6016kg0.e;
        this.e = cVar;
        this.C = E0(str, str2, cVar, aVarA);
        this.n = (InterfaceC6907np0) AbstractC7785qy0.o(interfaceC6907np0, "balancerRpcExecutorPool");
        this.o = new q(interfaceC6907np0);
        C0599Cy c0599Cy = new C0599Cy(executor, executorC3034a01);
        this.L = c0599Cy;
        c0599Cy.b(pVar);
        this.z = aVar;
        Map map = c6016kg0.w;
        if (map != null) {
            AbstractC2560Vm0.b bVarA = c4817gN0.a(map);
            AbstractC7785qy0.w(bVarA.d() == null, "Default config is invalid: %s", bVarA.d());
            C7141og0 c7141og0 = (C7141og0) bVarA.c();
            this.a0 = c7141og0;
            this.Z = c7141og0;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.a0 = null;
        }
        boolean z3 = c6016kg0.x;
        this.c0 = z3;
        v vVar = new v(this, this.C.a(), aVar2);
        this.X = vVar;
        this.A = AbstractC2451Ul.a(vVar, list);
        this.w = (AZ0) AbstractC7785qy0.o(az0, "stopwatchSupplier");
        long j2 = c6016kg0.o;
        if (j2 == -1) {
            this.x = j2;
        } else {
            AbstractC7785qy0.i(j2 >= C6016kg0.J, "invalid idleTimeoutMillis %s", j2);
            this.x = c6016kg0.o;
        }
        this.m0 = new AI0(new s(this, null), executorC3034a01, c1064Hi.M0(), (C8772uX0) az0.get());
        this.t = c6016kg0.l;
        this.u = (C1224Iw) AbstractC7785qy0.o(c6016kg0.m, "decompressorRegistry");
        this.v = (C2779Xp) AbstractC7785qy0.o(c6016kg0.n, "compressorRegistry");
        this.B = c6016kg0.i;
        this.f0 = c6016kg0.r;
        this.e0 = c6016kg0.s;
        c cVar2 = new c(g31);
        this.S = cVar2;
        this.T = cVar2.a();
        C4720g10 c4720g10 = (C4720g10) AbstractC7785qy0.n(c6016kg0.u);
        this.W = c4720g10;
        c4720g10.d(this);
        if (z3) {
            return;
        }
        if (this.a0 != null) {
            c6602mk.a(AbstractC6323lk.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.b0 = true;
    }

    public static AbstractC2560Vm0 D0(String str, AbstractC2560Vm0.c cVar, AbstractC2560Vm0.a aVar) {
        URI uri;
        AbstractC2560Vm0 abstractC2560Vm0B;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        if (uri != null && (abstractC2560Vm0B = cVar.b(uri, aVar)) != null) {
            return abstractC2560Vm0B;
        }
        String str2 = "";
        if (!o0.matcher(str).matches()) {
            try {
                AbstractC2560Vm0 abstractC2560Vm0B2 = cVar.b(new URI(cVar.a(), "", "/" + str, null), aVar);
                if (abstractC2560Vm0B2 != null) {
                    return abstractC2560Vm0B2;
                }
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        }
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", str, str2));
    }

    public static AbstractC2560Vm0 E0(String str, String str2, AbstractC2560Vm0.c cVar, AbstractC2560Vm0.a aVar) {
        AbstractC2560Vm0 abstractC2560Vm0D0 = D0(str, cVar, aVar);
        return str2 == null ? abstractC2560Vm0D0 : new k(abstractC2560Vm0D0, str2);
    }

    public final void A0() {
        M0(true);
        this.L.r(null);
        this.V.a(AbstractC6323lk.a.INFO, "Entering IDLE state");
        this.y.b(EnumC1304Jq.IDLE);
        if (this.i0.a(this.J, this.L)) {
            B0();
        }
    }

    public void B0() {
        this.s.e();
        if (this.N.get() || this.G) {
            return;
        }
        if (this.i0.d()) {
            y0(false);
        } else {
            K0();
        }
        if (this.E != null) {
            return;
        }
        this.V.a(AbstractC6323lk.a.INFO, "Exiting idle mode");
        t tVar = new t(this, null);
        tVar.a = this.g.e(tVar);
        this.E = tVar;
        this.C.d(new u(tVar, this.C));
        this.D = true;
    }

    public final Executor C0(C1168Ii c1168Ii) {
        Executor executorE = c1168Ii.e();
        return executorE == null ? this.l : executorE;
    }

    public final void F0() {
        if (this.O) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                ((C8077s10) it.next()).d(p0);
            }
            Iterator it2 = this.K.iterator();
            if (it2.hasNext()) {
                AbstractC6314li0.a(it2.next());
                throw null;
            }
        }
    }

    public final void G0() {
        if (!this.Q && this.N.get() && this.H.isEmpty() && this.K.isEmpty()) {
            this.V.a(AbstractC6323lk.a.INFO, "Terminated");
            this.W.j(this);
            this.m.b(this.l);
            this.o.b();
            this.p.b();
            this.i.close();
            this.Q = true;
            this.R.countDown();
        }
    }

    public void H0(Throwable th) {
        if (this.G) {
            return;
        }
        this.G = true;
        y0(true);
        M0(false);
        O0(new e(th));
        this.X.p(null);
        this.V.a(AbstractC6323lk.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.y.b(EnumC1304Jq.TRANSIENT_FAILURE);
    }

    public final void I0() {
        this.s.e();
        z0();
        J0();
    }

    public final void J0() {
        this.s.e();
        if (this.D) {
            this.C.b();
        }
    }

    public final void K0() {
        long j2 = this.x;
        if (j2 == -1) {
            return;
        }
        this.m0.k(j2, TimeUnit.MILLISECONDS);
    }

    public C5737jg0 L0() {
        this.V.a(AbstractC6323lk.a.DEBUG, "shutdown() called");
        if (!this.N.compareAndSet(false, true)) {
            return this;
        }
        this.s.execute(new h());
        this.X.n();
        this.s.execute(new b());
        return this;
    }

    public final void M0(boolean z2) {
        this.s.e();
        if (z2) {
            AbstractC7785qy0.u(this.D, "nameResolver is not started");
            AbstractC7785qy0.u(this.E != null, "lbHelper is null");
        }
        if (this.C != null) {
            z0();
            this.C.c();
            this.D = false;
            if (z2) {
                this.C = E0(this.b, this.c, this.e, this.f);
            } else {
                this.C = null;
            }
        }
        t tVar = this.E;
        if (tVar != null) {
            tVar.a.d();
            this.E = null;
        }
        this.F = null;
    }

    @Override // com.daaw.AbstractC5178hg0
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public C5737jg0 l() {
        this.V.a(AbstractC6323lk.a.DEBUG, "shutdownNow() called");
        L0();
        this.X.o();
        this.s.execute(new i());
        return this;
    }

    public final void O0(AbstractC0304Ac0.i iVar) {
        this.F = iVar;
        this.L.r(iVar);
    }

    @Override // com.daaw.AbstractC3515bk
    public String a() {
        return this.A.a();
    }

    @Override // com.daaw.AbstractC3515bk
    public AbstractC1699Nl e(C6882nk0 c6882nk0, C1168Ii c1168Ii) {
        return this.A.e(c6882nk0, c1168Ii);
    }

    @Override // com.daaw.InterfaceC8921v10
    public C6404m10 f() {
        return this.a;
    }

    @Override // com.daaw.AbstractC5178hg0
    public void i() {
        this.s.execute(new f());
    }

    @Override // com.daaw.AbstractC5178hg0
    public EnumC1304Jq j(boolean z2) {
        EnumC1304Jq enumC1304JqA = this.y.a();
        if (z2 && enumC1304JqA == EnumC1304Jq.IDLE) {
            this.s.execute(new g());
        }
        return enumC1304JqA;
    }

    @Override // com.daaw.AbstractC5178hg0
    public void k(EnumC1304Jq enumC1304Jq, Runnable runnable) {
        this.s.execute(new d(runnable, enumC1304Jq));
    }

    public String toString() {
        return AbstractC6329ll0.b(this).c("logId", this.a.d()).d("target", this.b).toString();
    }

    public final void y0(boolean z2) {
        this.m0.i(z2);
    }

    public final void z0() {
        this.s.e();
        ExecutorC3034a01.d dVar = this.j0;
        if (dVar != null) {
            dVar.a();
            this.j0 = null;
            this.k0 = null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$z */
    public final class z {
        public final Object a;
        public Collection b;
        public C6262lX0 c;

        public z() {
            this.a = new Object();
            this.b = new HashSet();
        }

        public C6262lX0 a(AbstractC5636jJ0 abstractC5636jJ0) {
            synchronized (this.a) {
                try {
                    C6262lX0 c6262lX0 = this.c;
                    if (c6262lX0 != null) {
                        return c6262lX0;
                    }
                    this.b.add(abstractC5636jJ0);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b(C6262lX0 c6262lX0) {
            synchronized (this.a) {
                try {
                    if (this.c != null) {
                        return;
                    }
                    this.c = c6262lX0;
                    boolean zIsEmpty = this.b.isEmpty();
                    if (zIsEmpty) {
                        C5737jg0.this.L.g(c6262lX0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c(C6262lX0 c6262lX0) {
            ArrayList arrayList;
            b(c6262lX0);
            synchronized (this.a) {
                arrayList = new ArrayList(this.b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC2867Yl) it.next()).f(c6262lX0);
            }
            C5737jg0.this.L.d(c6262lX0);
        }

        public void d(AbstractC5636jJ0 abstractC5636jJ0) {
            C6262lX0 c6262lX0;
            synchronized (this.a) {
                try {
                    this.b.remove(abstractC5636jJ0);
                    if (this.b.isEmpty()) {
                        c6262lX0 = this.c;
                        this.b = new HashSet();
                    } else {
                        c6262lX0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c6262lX0 != null) {
                C5737jg0.this.L.g(c6262lX0);
            }
        }

        public /* synthetic */ z(C5737jg0 c5737jg0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jg0$l */
    public class l extends AbstractC1699Nl {
        @Override // com.daaw.AbstractC1699Nl
        public void b() {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void c(int i) {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void d(Object obj) {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void a(String str, Throwable th) {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void e(AbstractC1699Nl.a aVar, C2756Xj0 c2756Xj0) {
        }
    }
}
