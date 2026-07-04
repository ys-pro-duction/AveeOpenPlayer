package com.daaw;

import com.daaw.AbstractC3246am;
import com.daaw.C2756Xj0;
import com.daaw.InterfaceC2971Zl;
import com.daaw.TX0;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.daaw.jJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5636jJ0 implements InterfaceC2867Yl {
    public static final C2756Xj0.g A;
    public static final C2756Xj0.g B;
    public static final C6262lX0 C;
    public static Random D;
    public final C6882nk0 a;
    public final Executor b;
    public final ScheduledExecutorService d;
    public final C2756Xj0 e;
    public final C6485mJ0 f;
    public final LV g;
    public final boolean h;
    public final t j;
    public final long k;
    public final long l;
    public final C m;
    public C6262lX0 s;
    public long t;
    public InterfaceC2971Zl u;
    public u v;
    public u w;
    public long x;
    public C6262lX0 y;
    public boolean z;
    public final Executor c = new ExecutorC3034a01(new C5637a());
    public final Object i = new Object();
    public final C4994h00 n = new C4994h00();
    public volatile z o = new z(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
    public final AtomicBoolean p = new AtomicBoolean();
    public final AtomicInteger q = new AtomicInteger();
    public final AtomicInteger r = new AtomicInteger();

    /* JADX INFO: renamed from: com.daaw.jJ0$A */
    public final class A implements InterfaceC2971Zl {
        public final B a;

        /* JADX INFO: renamed from: com.daaw.jJ0$A$a */
        public class a implements Runnable {
            public final /* synthetic */ C2756Xj0 B;

            public a(C2756Xj0 c2756Xj0) {
                this.B = c2756Xj0;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC5636jJ0.this.u.b(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.jJ0$A$b */
        public class b implements Runnable {
            public final /* synthetic */ B B;

            /* JADX INFO: renamed from: com.daaw.jJ0$A$b$a */
            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    AbstractC5636jJ0.this.g0(bVar.B);
                }
            }

            public b(B b) {
                this.B = b;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC5636jJ0.this.b.execute(new a());
            }
        }

        /* JADX INFO: renamed from: com.daaw.jJ0$A$c */
        public class c implements Runnable {
            public final /* synthetic */ B B;

            public c(B b) {
                this.B = b;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC5636jJ0.this.g0(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.jJ0$A$d */
        public class d implements Runnable {
            public final /* synthetic */ TX0.a B;

            public d(TX0.a aVar) {
                this.B = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC5636jJ0.this.u.a(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.jJ0$A$e */
        public class e implements Runnable {
            public e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC5636jJ0.this.z) {
                    return;
                }
                AbstractC5636jJ0.this.u.d();
            }
        }

        public A(B b2) {
            this.a = b2;
        }

        @Override // com.daaw.TX0
        public void a(TX0.a aVar) {
            z zVar = AbstractC5636jJ0.this.o;
            AbstractC7785qy0.u(zVar.f != null, "Headers should be received prior to messages.");
            if (zVar.f != this.a) {
                return;
            }
            AbstractC5636jJ0.this.c.execute(new d(aVar));
        }

        @Override // com.daaw.InterfaceC2971Zl
        public void b(C2756Xj0 c2756Xj0) {
            AbstractC5636jJ0.this.d0(this.a);
            if (AbstractC5636jJ0.this.o.f == this.a) {
                if (AbstractC5636jJ0.this.m != null) {
                    AbstractC5636jJ0.this.m.c();
                }
                AbstractC5636jJ0.this.c.execute(new a(c2756Xj0));
            }
        }

        @Override // com.daaw.InterfaceC2971Zl
        public void c(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
            u uVar;
            synchronized (AbstractC5636jJ0.this.i) {
                AbstractC5636jJ0 abstractC5636jJ0 = AbstractC5636jJ0.this;
                abstractC5636jJ0.o = abstractC5636jJ0.o.g(this.a);
                AbstractC5636jJ0.this.n.a(c6262lX0.m());
            }
            if (AbstractC5636jJ0.this.r.decrementAndGet() == Integer.MIN_VALUE) {
                AbstractC5636jJ0 abstractC5636jJ02 = AbstractC5636jJ0.this;
                abstractC5636jJ02.n0(abstractC5636jJ02.s, InterfaceC2971Zl.a.PROCESSED, new C2756Xj0());
                return;
            }
            B b2 = this.a;
            if (b2.c) {
                AbstractC5636jJ0.this.d0(b2);
                if (AbstractC5636jJ0.this.o.f == this.a) {
                    AbstractC5636jJ0.this.n0(c6262lX0, aVar, c2756Xj0);
                    return;
                }
                return;
            }
            InterfaceC2971Zl.a aVar2 = InterfaceC2971Zl.a.MISCARRIED;
            if (aVar == aVar2 && AbstractC5636jJ0.this.q.incrementAndGet() > 1000) {
                AbstractC5636jJ0.this.d0(this.a);
                if (AbstractC5636jJ0.this.o.f == this.a) {
                    AbstractC5636jJ0.this.n0(C6262lX0.t.q("Too many transparent retries. Might be a bug in gRPC").p(c6262lX0.d()), aVar, c2756Xj0);
                    return;
                }
                return;
            }
            if (AbstractC5636jJ0.this.o.f == null) {
                boolean z = false;
                if (aVar == aVar2 || (aVar == InterfaceC2971Zl.a.REFUSED && AbstractC5636jJ0.this.p.compareAndSet(false, true))) {
                    B bE0 = AbstractC5636jJ0.this.e0(this.a.d, true);
                    if (bE0 == null) {
                        return;
                    }
                    if (AbstractC5636jJ0.this.h) {
                        synchronized (AbstractC5636jJ0.this.i) {
                            try {
                                AbstractC5636jJ0 abstractC5636jJ03 = AbstractC5636jJ0.this;
                                abstractC5636jJ03.o = abstractC5636jJ03.o.f(this.a, bE0);
                                AbstractC5636jJ0 abstractC5636jJ04 = AbstractC5636jJ0.this;
                                if (!abstractC5636jJ04.i0(abstractC5636jJ04.o) && AbstractC5636jJ0.this.o.d.size() == 1) {
                                    z = true;
                                }
                            } finally {
                            }
                        }
                        if (z) {
                            AbstractC5636jJ0.this.d0(bE0);
                        }
                    } else if (AbstractC5636jJ0.this.f == null || AbstractC5636jJ0.this.f.a == 1) {
                        AbstractC5636jJ0.this.d0(bE0);
                    }
                    AbstractC5636jJ0.this.b.execute(new c(bE0));
                    return;
                }
                if (aVar != InterfaceC2971Zl.a.DROPPED) {
                    AbstractC5636jJ0.this.p.set(true);
                    if (AbstractC5636jJ0.this.h) {
                        v vVarF = f(c6262lX0, c2756Xj0);
                        if (vVarF.a) {
                            AbstractC5636jJ0.this.m0(vVarF.b);
                        }
                        synchronized (AbstractC5636jJ0.this.i) {
                            try {
                                AbstractC5636jJ0 abstractC5636jJ05 = AbstractC5636jJ0.this;
                                abstractC5636jJ05.o = abstractC5636jJ05.o.e(this.a);
                                if (vVarF.a) {
                                    AbstractC5636jJ0 abstractC5636jJ06 = AbstractC5636jJ0.this;
                                    if (!abstractC5636jJ06.i0(abstractC5636jJ06.o)) {
                                        if (!AbstractC5636jJ0.this.o.d.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } finally {
                            }
                        }
                    } else {
                        x xVarG = g(c6262lX0, c2756Xj0);
                        if (xVarG.a) {
                            B bE02 = AbstractC5636jJ0.this.e0(this.a.d + 1, false);
                            if (bE02 == null) {
                                return;
                            }
                            synchronized (AbstractC5636jJ0.this.i) {
                                AbstractC5636jJ0 abstractC5636jJ07 = AbstractC5636jJ0.this;
                                uVar = new u(abstractC5636jJ07.i);
                                abstractC5636jJ07.v = uVar;
                            }
                            uVar.c(AbstractC5636jJ0.this.d.schedule(new b(bE02), xVarG.b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                } else if (AbstractC5636jJ0.this.h) {
                    AbstractC5636jJ0.this.h0();
                }
            }
            AbstractC5636jJ0.this.d0(this.a);
            if (AbstractC5636jJ0.this.o.f == this.a) {
                AbstractC5636jJ0.this.n0(c6262lX0, aVar, c2756Xj0);
            }
        }

        @Override // com.daaw.TX0
        public void d() {
            if (AbstractC5636jJ0.this.a()) {
                AbstractC5636jJ0.this.c.execute(new e());
            }
        }

        public final Integer e(C2756Xj0 c2756Xj0) {
            String str = (String) c2756Xj0.g(AbstractC5636jJ0.B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public final v f(C6262lX0 c6262lX0, C2756Xj0 c2756Xj0) {
            Integer numE = e(c2756Xj0);
            boolean zContains = AbstractC5636jJ0.this.g.c.contains(c6262lX0.m());
            return new v(zContains && !((AbstractC5636jJ0.this.m == null || (!zContains && (numE == null || numE.intValue() >= 0))) ? false : AbstractC5636jJ0.this.m.b() ^ true), numE);
        }

        public final x g(C6262lX0 c6262lX0, C2756Xj0 c2756Xj0) {
            long nanos = 0;
            boolean z = false;
            if (AbstractC5636jJ0.this.f == null) {
                return new x(false, 0L);
            }
            boolean zContains = AbstractC5636jJ0.this.f.f.contains(c6262lX0.m());
            Integer numE = e(c2756Xj0);
            boolean z2 = (AbstractC5636jJ0.this.m == null || (!zContains && (numE == null || numE.intValue() >= 0))) ? false : !AbstractC5636jJ0.this.m.b();
            if (AbstractC5636jJ0.this.f.a > this.a.d + 1 && !z2) {
                if (numE == null) {
                    if (zContains) {
                        nanos = (long) (AbstractC5636jJ0.this.x * AbstractC5636jJ0.D.nextDouble());
                        AbstractC5636jJ0.this.x = Math.min((long) (r10.x * AbstractC5636jJ0.this.f.d), AbstractC5636jJ0.this.f.c);
                        z = true;
                    }
                } else if (numE.intValue() >= 0) {
                    nanos = TimeUnit.MILLISECONDS.toNanos(numE.intValue());
                    AbstractC5636jJ0 abstractC5636jJ0 = AbstractC5636jJ0.this;
                    abstractC5636jJ0.x = abstractC5636jJ0.f.b;
                    z = true;
                }
            }
            return new x(z, nanos);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$B */
    public static final class B {
        public InterfaceC2867Yl a;
        public boolean b;
        public boolean c;
        public final int d;

        public B(int i) {
            this.d = i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$C */
    public static final class C {
        public final int a;
        public final int b;
        public final int c;
        public final AtomicInteger d;

        public C(float f, float f2) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.d = atomicInteger;
            this.c = (int) (f2 * 1000.0f);
            int i = (int) (f * 1000.0f);
            this.a = i;
            this.b = i / 2;
            atomicInteger.set(i);
        }

        public boolean a() {
            return this.d.get() > this.b;
        }

        public boolean b() {
            int i;
            int i2;
            do {
                i = this.d.get();
                if (i == 0) {
                    return false;
                }
                i2 = i - 1000;
            } while (!this.d.compareAndSet(i, Math.max(i2, 0)));
            return i2 > this.b;
        }

        public void c() {
            int i;
            int i2;
            do {
                i = this.d.get();
                i2 = this.a;
                if (i == i2) {
                    return;
                }
            } while (!this.d.compareAndSet(i, Math.min(this.c + i, i2)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C)) {
                return false;
            }
            C c = (C) obj;
            return this.a == c.a && this.c == c.c;
        }

        public int hashCode() {
            return AbstractC8301sp0.b(Integer.valueOf(this.a), Integer.valueOf(this.c));
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$a, reason: case insensitive filesystem */
    public class C5637a implements Thread.UncaughtExceptionHandler {
        public C5637a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw C6262lX0.k(th).q("Uncaught exception in the SynchronizationContext. Re-thrown.").d();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$b, reason: case insensitive filesystem */
    public class C5638b implements r {
        public final /* synthetic */ String a;

        public C5638b(String str) {
            this.a = str;
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.h(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$c, reason: case insensitive filesystem */
    public class RunnableC5639c implements Runnable {
        public final /* synthetic */ Collection B;
        public final /* synthetic */ B C;
        public final /* synthetic */ Future D;
        public final /* synthetic */ Future E;

        public RunnableC5639c(Collection collection, B b, Future future, Future future2) {
            this.B = collection;
            this.C = b;
            this.D = future;
            this.E = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (B b : this.B) {
                if (b != this.C) {
                    b.a.f(AbstractC5636jJ0.C);
                }
            }
            Future future = this.D;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.E;
            if (future2 != null) {
                future2.cancel(false);
            }
            AbstractC5636jJ0.this.k0();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$d */
    public class d implements r {
        public final /* synthetic */ InterfaceC2675Wp a;

        public d(InterfaceC2675Wp interfaceC2675Wp) {
            this.a = interfaceC2675Wp;
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.b(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$e */
    public class e implements r {
        public final /* synthetic */ C6381lw a;

        public e(C6381lw c6381lw) {
            this.a = c6381lw;
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.i(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$f */
    public class f implements r {
        public final /* synthetic */ C1224Iw a;

        public f(C1224Iw c1224Iw) {
            this.a = c1224Iw;
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.g(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$g */
    public class g implements r {
        public g() {
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.flush();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$h */
    public class h implements r {
        public final /* synthetic */ boolean a;

        public h(boolean z) {
            this.a = z;
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.q(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$i */
    public class i implements r {
        public i() {
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.j();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$j */
    public class j implements r {
        public final /* synthetic */ int a;

        public j(int i) {
            this.a = i;
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.d(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$k */
    public class k implements r {
        public final /* synthetic */ int a;

        public k(int i) {
            this.a = i;
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.e(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$l */
    public class l implements r {
        public l() {
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.p();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$m */
    public class m implements r {
        public final /* synthetic */ int a;

        public m(int i) {
            this.a = i;
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.c(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$n */
    public class n implements r {
        public final /* synthetic */ Object a;

        public n(Object obj) {
            this.a = obj;
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.n(AbstractC5636jJ0.this.a.j(this.a));
            b.a.flush();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$o */
    public class o extends AbstractC3246am.a {
        public final /* synthetic */ AbstractC3246am a;

        public o(AbstractC3246am abstractC3246am) {
            this.a = abstractC3246am;
        }

        @Override // com.daaw.AbstractC3246am.a
        public AbstractC3246am a(AbstractC3246am.b bVar, C2756Xj0 c2756Xj0) {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$p */
    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC5636jJ0.this.z) {
                return;
            }
            AbstractC5636jJ0.this.u.d();
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$q */
    public class q implements Runnable {
        public final /* synthetic */ C6262lX0 B;
        public final /* synthetic */ InterfaceC2971Zl.a C;
        public final /* synthetic */ C2756Xj0 D;

        public q(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
            this.B = c6262lX0;
            this.C = aVar;
            this.D = c2756Xj0;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5636jJ0.this.z = true;
            AbstractC5636jJ0.this.u.c(this.B, this.C, this.D);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$r */
    public interface r {
        void a(B b);
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$s */
    public class s extends AbstractC3246am {
        public final B a;
        public long b;

        public s(B b) {
            this.a = b;
        }

        @Override // com.daaw.ZX0
        public void h(long j) {
            if (AbstractC5636jJ0.this.o.f != null) {
                return;
            }
            synchronized (AbstractC5636jJ0.this.i) {
                try {
                    if (AbstractC5636jJ0.this.o.f == null && !this.a.b) {
                        long j2 = this.b + j;
                        this.b = j2;
                        if (j2 <= AbstractC5636jJ0.this.t) {
                            return;
                        }
                        if (this.b > AbstractC5636jJ0.this.k) {
                            this.a.c = true;
                        } else {
                            long jA = AbstractC5636jJ0.this.j.a(this.b - AbstractC5636jJ0.this.t);
                            AbstractC5636jJ0.this.t = this.b;
                            if (jA > AbstractC5636jJ0.this.l) {
                                this.a.c = true;
                            }
                        }
                        B b = this.a;
                        Runnable runnableC0 = b.c ? AbstractC5636jJ0.this.c0(b) : null;
                        if (runnableC0 != null) {
                            runnableC0.run();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$t */
    public static final class t {
        public final AtomicLong a = new AtomicLong();

        public long a(long j) {
            return this.a.addAndGet(j);
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$u */
    public static final class u {
        public final Object a;
        public Future b;
        public boolean c;

        public u(Object obj) {
            this.a = obj;
        }

        public boolean a() {
            return this.c;
        }

        public Future b() {
            this.c = true;
            return this.b;
        }

        public void c(Future future) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        this.b = future;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$v */
    public static final class v {
        public final boolean a;
        public final Integer b;

        public v(boolean z, Integer num) {
            this.a = z;
            this.b = num;
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$w */
    public final class w implements Runnable {
        public final u B;

        /* JADX INFO: renamed from: com.daaw.jJ0$w$a */
        public class a implements Runnable {
            public final /* synthetic */ B B;

            public a(B b) {
                this.B = b;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar;
                boolean z;
                synchronized (AbstractC5636jJ0.this.i) {
                    try {
                        uVar = null;
                        if (w.this.B.a()) {
                            z = true;
                        } else {
                            AbstractC5636jJ0 abstractC5636jJ0 = AbstractC5636jJ0.this;
                            abstractC5636jJ0.o = abstractC5636jJ0.o.a(this.B);
                            AbstractC5636jJ0 abstractC5636jJ02 = AbstractC5636jJ0.this;
                            if (abstractC5636jJ02.i0(abstractC5636jJ02.o) && (AbstractC5636jJ0.this.m == null || AbstractC5636jJ0.this.m.a())) {
                                AbstractC5636jJ0 abstractC5636jJ03 = AbstractC5636jJ0.this;
                                uVar = new u(abstractC5636jJ03.i);
                                abstractC5636jJ03.w = uVar;
                            } else {
                                AbstractC5636jJ0 abstractC5636jJ04 = AbstractC5636jJ0.this;
                                abstractC5636jJ04.o = abstractC5636jJ04.o.d();
                                AbstractC5636jJ0.this.w = null;
                            }
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    this.B.a.f(C6262lX0.g.q("Unneeded hedging"));
                    return;
                }
                if (uVar != null) {
                    uVar.c(AbstractC5636jJ0.this.d.schedule(AbstractC5636jJ0.this.new w(uVar), AbstractC5636jJ0.this.g.b, TimeUnit.NANOSECONDS));
                }
                AbstractC5636jJ0.this.g0(this.B);
            }
        }

        public w(u uVar) {
            this.B = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5636jJ0 abstractC5636jJ0 = AbstractC5636jJ0.this;
            B bE0 = abstractC5636jJ0.e0(abstractC5636jJ0.o.e, false);
            if (bE0 == null) {
                return;
            }
            AbstractC5636jJ0.this.b.execute(new a(bE0));
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$x */
    public static final class x {
        public final boolean a;
        public final long b;

        public x(boolean z, long j) {
            this.a = z;
            this.b = j;
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$y */
    public class y implements r {
        public y() {
        }

        @Override // com.daaw.AbstractC5636jJ0.r
        public void a(B b) {
            b.a.l(AbstractC5636jJ0.this.new A(b));
        }
    }

    /* JADX INFO: renamed from: com.daaw.jJ0$z */
    public static final class z {
        public final boolean a;
        public final List b;
        public final Collection c;
        public final Collection d;
        public final int e;
        public final B f;
        public final boolean g;
        public final boolean h;

        public z(List list, Collection collection, Collection collection2, B b, boolean z, boolean z2, boolean z3, int i) {
            this.b = list;
            this.c = (Collection) AbstractC7785qy0.o(collection, "drainedSubstreams");
            this.f = b;
            this.d = collection2;
            this.g = z;
            this.a = z2;
            this.h = z3;
            this.e = i;
            AbstractC7785qy0.u(!z2 || list == null, "passThrough should imply buffer is null");
            AbstractC7785qy0.u((z2 && b == null) ? false : true, "passThrough should imply winningSubstream != null");
            AbstractC7785qy0.u(!z2 || (collection.size() == 1 && collection.contains(b)) || (collection.size() == 0 && b.b), "passThrough should imply winningSubstream is drained");
            AbstractC7785qy0.u((z && b == null) ? false : true, "cancelled should imply committed");
        }

        public z a(B b) {
            Collection collectionUnmodifiableCollection;
            AbstractC7785qy0.u(!this.h, "hedging frozen");
            AbstractC7785qy0.u(this.f == null, "already committed");
            if (this.d == null) {
                collectionUnmodifiableCollection = Collections.singleton(b);
            } else {
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.add(b);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
            return new z(this.b, this.c, collectionUnmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
        }

        public z b() {
            return new z(this.b, this.c, this.d, this.f, true, this.a, this.h, this.e);
        }

        public z c(B b) {
            List list;
            Collection collectionSingleton;
            boolean z;
            AbstractC7785qy0.u(this.f == null, "Already committed");
            List list2 = this.b;
            if (this.c.contains(b)) {
                collectionSingleton = Collections.singleton(b);
                list = null;
                z = true;
            } else {
                list = list2;
                collectionSingleton = Collections.EMPTY_LIST;
                z = false;
            }
            return new z(list, collectionSingleton, this.d, b, this.g, z, this.h, this.e);
        }

        public z d() {
            return this.h ? this : new z(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
        }

        public z e(B b) {
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(b);
            return new z(this.b, this.c, DesugarCollections.unmodifiableCollection(arrayList), this.f, this.g, this.a, this.h, this.e);
        }

        public z f(B b, B b2) {
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(b);
            arrayList.add(b2);
            return new z(this.b, this.c, DesugarCollections.unmodifiableCollection(arrayList), this.f, this.g, this.a, this.h, this.e);
        }

        public z g(B b) {
            b.b = true;
            if (!this.c.contains(b)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.c);
            arrayList.remove(b);
            return new z(this.b, DesugarCollections.unmodifiableCollection(arrayList), this.d, this.f, this.g, this.a, this.h, this.e);
        }

        public z h(B b) {
            Collection collectionUnmodifiableCollection;
            AbstractC7785qy0.u(!this.a, "Already passThrough");
            if (b.b) {
                collectionUnmodifiableCollection = this.c;
            } else if (this.c.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(b);
            } else {
                ArrayList arrayList = new ArrayList(this.c);
                arrayList.add(b);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
            Collection collection = collectionUnmodifiableCollection;
            B b2 = this.f;
            boolean z = b2 != null;
            List list = this.b;
            if (z) {
                AbstractC7785qy0.u(b2 == b, "Another RPC attempt has already committed");
                list = null;
            }
            return new z(list, collection, this.d, this.f, this.g, z, this.h, this.e);
        }
    }

    static {
        C2756Xj0.d dVar = C2756Xj0.e;
        A = C2756Xj0.g.e("grpc-previous-rpc-attempts", dVar);
        B = C2756Xj0.g.e("grpc-retry-pushback-ms", dVar);
        C = C6262lX0.g.q("Stream thrown away because RetriableStream committed");
        D = new Random();
    }

    public AbstractC5636jJ0(C6882nk0 c6882nk0, C2756Xj0 c2756Xj0, t tVar, long j2, long j3, Executor executor, ScheduledExecutorService scheduledExecutorService, C6485mJ0 c6485mJ0, LV lv, C c) {
        this.a = c6882nk0;
        this.j = tVar;
        this.k = j2;
        this.l = j3;
        this.b = executor;
        this.d = scheduledExecutorService;
        this.e = c2756Xj0;
        this.f = c6485mJ0;
        if (c6485mJ0 != null) {
            this.x = c6485mJ0.b;
        }
        this.g = lv;
        AbstractC7785qy0.e(c6485mJ0 == null || lv == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.h = lv != null;
        this.m = c;
    }

    @Override // com.daaw.LX0
    public final boolean a() {
        Iterator it = this.o.c.iterator();
        while (it.hasNext()) {
            if (((B) it.next()).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.LX0
    public final void b(InterfaceC2675Wp interfaceC2675Wp) {
        f0(new d(interfaceC2675Wp));
    }

    @Override // com.daaw.LX0
    public final void c(int i2) {
        z zVar = this.o;
        if (zVar.a) {
            zVar.f.a.c(i2);
        } else {
            f0(new m(i2));
        }
    }

    public final Runnable c0(B b) {
        Future future;
        Future future2;
        synchronized (this.i) {
            try {
                if (this.o.f != null) {
                    return null;
                }
                Collection collection = this.o.c;
                this.o = this.o.c(b);
                this.j.a(-this.t);
                u uVar = this.v;
                if (uVar != null) {
                    Future futureB = uVar.b();
                    this.v = null;
                    future = futureB;
                } else {
                    future = null;
                }
                u uVar2 = this.w;
                if (uVar2 != null) {
                    Future futureB2 = uVar2.b();
                    this.w = null;
                    future2 = futureB2;
                } else {
                    future2 = null;
                }
                return new RunnableC5639c(collection, b, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void d(int i2) {
        f0(new j(i2));
    }

    public final void d0(B b) {
        Runnable runnableC0 = c0(b);
        if (runnableC0 != null) {
            runnableC0.run();
        }
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void e(int i2) {
        f0(new k(i2));
    }

    public final B e0(int i2, boolean z2) {
        int i3;
        do {
            i3 = this.r.get();
            if (i3 < 0) {
                return null;
            }
        } while (!this.r.compareAndSet(i3, i3 + 1));
        B b = new B(i2);
        b.a = j0(p0(this.e, i2), new o(new s(b)), i2, z2);
        return b;
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void f(C6262lX0 c6262lX0) {
        B b;
        B b2 = new B(0);
        b2.a = new C9698xo0();
        Runnable runnableC0 = c0(b2);
        if (runnableC0 != null) {
            this.s = c6262lX0;
            runnableC0.run();
            if (this.r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                n0(c6262lX0, InterfaceC2971Zl.a.PROCESSED, new C2756Xj0());
                return;
            }
            return;
        }
        synchronized (this.i) {
            try {
                if (this.o.c.contains(this.o.f)) {
                    b = this.o.f;
                } else {
                    this.y = c6262lX0;
                    b = null;
                }
                this.o = this.o.b();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b != null) {
            b.a.f(c6262lX0);
        }
    }

    public final void f0(r rVar) {
        Collection collection;
        synchronized (this.i) {
            try {
                if (!this.o.a) {
                    this.o.b.add(rVar);
                }
                collection = this.o.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rVar.a((B) it.next());
        }
    }

    @Override // com.daaw.LX0
    public final void flush() {
        z zVar = this.o;
        if (zVar.a) {
            zVar.f.a.flush();
        } else {
            f0(new g());
        }
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void g(C1224Iw c1224Iw) {
        f0(new f(c1224Iw));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        r8.c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        r0 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r8.o.f != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        r9 = r8.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        r9 = com.daaw.AbstractC5636jJ0.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        r0.f(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007e, code lost:
    
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0086, code lost:
    
        if (r2.hasNext() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0088, code lost:
    
        r4 = (com.daaw.AbstractC5636jJ0.r) r2.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:
    
        if ((r4 instanceof com.daaw.AbstractC5636jJ0.y) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        if (r0 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        r4 = r8.o;
        r5 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (r5 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        if (r5 == r9) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
    
        if (r4.g == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001c A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:5:0x0007, B:7:0x000b, B:10:0x0011, B:14:0x0016, B:16:0x001a, B:18:0x001c, B:20:0x0024, B:22:0x0030, B:24:0x0032, B:25:0x0037, B:35:0x0051, B:37:0x0055, B:39:0x0057, B:41:0x0065, B:43:0x007d, B:42:0x0071), top: B:60:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0(com.daaw.AbstractC5636jJ0.B r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r1
            r2 = 0
        L4:
            java.lang.Object r4 = r8.i
            monitor-enter(r4)
            com.daaw.jJ0$z r5 = r8.o     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L1c
            com.daaw.jJ0$B r6 = r5.f     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L16
            if (r6 == r9) goto L16
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            goto L38
        L13:
            r9 = move-exception
            goto La8
        L16:
            boolean r6 = r5.g     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L1c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            goto L38
        L1c:
            java.util.List r6 = r5.b     // Catch: java.lang.Throwable -> L13
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L13
            if (r2 != r6) goto L51
            com.daaw.jJ0$z r0 = r5.h(r9)     // Catch: java.lang.Throwable -> L13
            r8.o = r0     // Catch: java.lang.Throwable -> L13
            boolean r0 = r8.a()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L32
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            return
        L32:
            com.daaw.jJ0$p r1 = new com.daaw.jJ0$p     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
        L38:
            if (r1 == 0) goto L40
            java.util.concurrent.Executor r9 = r8.c
            r9.execute(r1)
            return
        L40:
            com.daaw.Yl r0 = r9.a
            com.daaw.jJ0$z r1 = r8.o
            com.daaw.jJ0$B r1 = r1.f
            if (r1 != r9) goto L4b
            com.daaw.lX0 r9 = r8.y
            goto L4d
        L4b:
            com.daaw.lX0 r9 = com.daaw.AbstractC5636jJ0.C
        L4d:
            r0.f(r9)
            return
        L51:
            boolean r6 = r9.b     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L57
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            return
        L57:
            int r6 = r2 + 128
            java.util.List r7 = r5.b     // Catch: java.lang.Throwable -> L13
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L13
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L13
            if (r3 != 0) goto L71
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
            java.util.List r5 = r5.b     // Catch: java.lang.Throwable -> L13
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> L13
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L13
            goto L7d
        L71:
            r3.clear()     // Catch: java.lang.Throwable -> L13
            java.util.List r5 = r5.b     // Catch: java.lang.Throwable -> L13
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> L13
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L13
        L7d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            java.util.Iterator r2 = r3.iterator()
        L82:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La5
            java.lang.Object r4 = r2.next()
            com.daaw.jJ0$r r4 = (com.daaw.AbstractC5636jJ0.r) r4
            r4.a(r9)
            boolean r4 = r4 instanceof com.daaw.AbstractC5636jJ0.y
            if (r4 == 0) goto L96
            r0 = 1
        L96:
            if (r0 == 0) goto L82
            com.daaw.jJ0$z r4 = r8.o
            com.daaw.jJ0$B r5 = r4.f
            if (r5 == 0) goto La1
            if (r5 == r9) goto La1
            goto La5
        La1:
            boolean r4 = r4.g
            if (r4 == 0) goto L82
        La5:
            r2 = r6
            goto L4
        La8:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC5636jJ0.g0(com.daaw.jJ0$B):void");
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void h(String str) {
        f0(new C5638b(str));
    }

    public final void h0() {
        Future future;
        synchronized (this.i) {
            try {
                u uVar = this.w;
                future = null;
                if (uVar != null) {
                    Future futureB = uVar.b();
                    this.w = null;
                    future = futureB;
                }
                this.o = this.o.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void i(C6381lw c6381lw) {
        f0(new e(c6381lw));
    }

    public final boolean i0(z zVar) {
        return zVar.f == null && zVar.e < this.g.a && !zVar.h;
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void j() {
        f0(new i());
    }

    public abstract InterfaceC2867Yl j0(C2756Xj0 c2756Xj0, AbstractC3246am.a aVar, int i2, boolean z2);

    public abstract void k0();

    @Override // com.daaw.InterfaceC2867Yl
    public final void l(InterfaceC2971Zl interfaceC2971Zl) {
        u uVar;
        C c;
        this.u = interfaceC2971Zl;
        C6262lX0 c6262lX0L0 = l0();
        if (c6262lX0L0 != null) {
            f(c6262lX0L0);
            return;
        }
        synchronized (this.i) {
            this.o.b.add(new y());
        }
        B bE0 = e0(0, false);
        if (bE0 == null) {
            return;
        }
        if (this.h) {
            synchronized (this.i) {
                try {
                    this.o = this.o.a(bE0);
                    if (i0(this.o) && ((c = this.m) == null || c.a())) {
                        uVar = new u(this.i);
                        this.w = uVar;
                    } else {
                        uVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (uVar != null) {
                uVar.c(this.d.schedule(new w(uVar), this.g.b, TimeUnit.NANOSECONDS));
            }
        }
        g0(bE0);
    }

    public abstract C6262lX0 l0();

    @Override // com.daaw.InterfaceC2867Yl
    public void m(C4994h00 c4994h00) {
        z zVar;
        synchronized (this.i) {
            c4994h00.b("closed", this.n);
            zVar = this.o;
        }
        if (zVar.f != null) {
            C4994h00 c4994h002 = new C4994h00();
            zVar.f.a.m(c4994h002);
            c4994h00.b("committed", c4994h002);
            return;
        }
        C4994h00 c4994h003 = new C4994h00();
        for (B b : zVar.c) {
            C4994h00 c4994h004 = new C4994h00();
            b.a.m(c4994h004);
            c4994h003.a(c4994h004);
        }
        c4994h00.b("open", c4994h003);
    }

    public final void m0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            h0();
            return;
        }
        synchronized (this.i) {
            try {
                u uVar = this.w;
                if (uVar == null) {
                    return;
                }
                Future futureB = uVar.b();
                u uVar2 = new u(this.i);
                this.w = uVar2;
                if (futureB != null) {
                    futureB.cancel(false);
                }
                uVar2.c(this.d.schedule(new w(uVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.LX0
    public final void n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    public final void n0(C6262lX0 c6262lX0, InterfaceC2971Zl.a aVar, C2756Xj0 c2756Xj0) {
        this.c.execute(new q(c6262lX0, aVar, c2756Xj0));
    }

    public final void o0(Object obj) {
        z zVar = this.o;
        if (zVar.a) {
            zVar.f.a.n(this.a.j(obj));
        } else {
            f0(new n(obj));
        }
    }

    @Override // com.daaw.LX0
    public void p() {
        f0(new l());
    }

    public final C2756Xj0 p0(C2756Xj0 c2756Xj0, int i2) {
        C2756Xj0 c2756Xj02 = new C2756Xj0();
        c2756Xj02.m(c2756Xj0);
        if (i2 > 0) {
            c2756Xj02.p(A, String.valueOf(i2));
        }
        return c2756Xj02;
    }

    @Override // com.daaw.InterfaceC2867Yl
    public final void q(boolean z2) {
        f0(new h(z2));
    }
}
