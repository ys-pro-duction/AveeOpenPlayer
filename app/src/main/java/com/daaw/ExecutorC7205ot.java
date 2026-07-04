package com.daaw;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: com.daaw.ot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC7205ot implements Executor, Closeable, AutoCloseable {
    public static final a I = new a(null);
    public static final AtomicLongFieldUpdater J = AtomicLongFieldUpdater.newUpdater(ExecutorC7205ot.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater K = AtomicLongFieldUpdater.newUpdater(ExecutorC7205ot.class, "controlState");
    public static final AtomicIntegerFieldUpdater L = AtomicIntegerFieldUpdater.newUpdater(ExecutorC7205ot.class, "_isTerminated");
    public static final YZ0 M = new YZ0("NOT_IN_STACK");
    public final int B;
    public final int C;
    public final long D;
    public final String E;
    public final C6245lT F;
    public final C6245lT G;
    public final CI0 H;
    private volatile int _isTerminated;
    private volatile long controlState;
    private volatile long parkedWorkersStack;

    /* JADX INFO: renamed from: com.daaw.ot$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.ot$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ot$d */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC7205ot(int i, int i2, long j, String str) {
        this.B = i;
        this.C = i2;
        this.D = j;
        this.E = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.F = new C6245lT();
        this.G = new C6245lT();
        this.H = new CI0((i + 1) * 2);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void F(ExecutorC7205ot executorC7205ot, Runnable runnable, InterfaceC7799r11 interfaceC7799r11, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC7799r11 = B11.g;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        executorC7205ot.s(runnable, interfaceC7799r11, z);
    }

    public static /* synthetic */ boolean w0(ExecutorC7205ot executorC7205ot, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = K.get(executorC7205ot);
        }
        return executorC7205ot.s0(j);
    }

    public final int I(c cVar) {
        Object objI = cVar.i();
        while (objI != M) {
            if (objI == null) {
                return 0;
            }
            c cVar2 = (c) objI;
            int iH = cVar2.h();
            if (iH != 0) {
                return iH;
            }
            objI = cVar2.i();
        }
        return -1;
    }

    public final c N() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = J;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.H.b((int) (2097151 & j));
            if (cVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int I2 = I(cVar);
            if (I2 >= 0 && J.compareAndSet(this, j, ((long) I2) | j2)) {
                cVar.r(M);
                return cVar;
            }
        }
    }

    public final boolean R(c cVar) {
        long j;
        int iH;
        if (cVar.i() != M) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = J;
        do {
            j = atomicLongFieldUpdater.get(this);
            iH = cVar.h();
            cVar.r(this.H.b((int) (2097151 & j)));
        } while (!J.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | ((long) iH)));
        return true;
    }

    public final void U(c cVar, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = J;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int I2 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (I2 == i) {
                I2 = i2 == 0 ? I(cVar) : i2;
            }
            if (I2 >= 0 && J.compareAndSet(this, j, j2 | ((long) I2))) {
                return;
            }
        }
    }

    public final void W(AbstractRunnableC6684n11 abstractRunnableC6684n11) {
        try {
            abstractRunnableC6684n11.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                G0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.daaw.ExecutorC7205ot.L
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            com.daaw.ot$c r0 = r7.o()
            com.daaw.CI0 r1 = r7.H
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L87
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L87
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r4 = (int) r3
            monitor-exit(r1)
            if (r2 > r4) goto L49
            r1 = 1
        L23:
            com.daaw.CI0 r3 = r7.H
            java.lang.Object r3 = r3.b(r1)
            com.daaw.G10.d(r3)
            com.daaw.ot$c r3 = (com.daaw.ExecutorC7205ot.c) r3
            if (r3 == r0) goto L44
        L30:
            boolean r5 = r3.isAlive()
            if (r5 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r3)
            r3.join(r8)
            goto L30
        L3d:
            com.daaw.Li1 r3 = r3.B
            com.daaw.lT r5 = r7.G
            r3.f(r5)
        L44:
            if (r1 == r4) goto L49
            int r1 = r1 + 1
            goto L23
        L49:
            com.daaw.lT r8 = r7.G
            r8.b()
            com.daaw.lT r8 = r7.F
            r8.b()
        L53:
            if (r0 == 0) goto L5b
            com.daaw.n11 r8 = r0.g(r2)
            if (r8 != 0) goto L83
        L5b:
            com.daaw.lT r8 = r7.F
            java.lang.Object r8 = r8.d()
            com.daaw.n11 r8 = (com.daaw.AbstractRunnableC6684n11) r8
            if (r8 != 0) goto L83
            com.daaw.lT r8 = r7.G
            java.lang.Object r8 = r8.d()
            com.daaw.n11 r8 = (com.daaw.AbstractRunnableC6684n11) r8
            if (r8 != 0) goto L83
            if (r0 == 0) goto L76
            com.daaw.ot$d r8 = com.daaw.ExecutorC7205ot.d.TERMINATED
            r0.u(r8)
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = com.daaw.ExecutorC7205ot.J
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = com.daaw.ExecutorC7205ot.K
            r8.set(r7, r0)
            return
        L83:
            r7.W(r8)
            goto L53
        L87:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ExecutorC7205ot.Y(long):void");
    }

    public final boolean c(AbstractRunnableC6684n11 abstractRunnableC6684n11) {
        return abstractRunnableC6684n11.C.b() == 1 ? this.G.a(abstractRunnableC6684n11) : this.F.a(abstractRunnableC6684n11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        Y(10000L);
    }

    public final int d() {
        synchronized (this.H) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = K;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int iD = AbstractC8417tE0.d(i - ((int) ((j & 4398044413952L) >> 21)), 0);
                if (iD >= this.B) {
                    return 0;
                }
                if (i >= this.C) {
                    return 0;
                }
                int i2 = ((int) (K.get(this) & 2097151)) + 1;
                if (i2 <= 0 || this.H.b(i2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i2);
                this.H.c(i2, cVar);
                if (i2 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i3 = iD + 1;
                cVar.start();
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        F(this, runnable, null, false, 6, null);
    }

    public final boolean isTerminated() {
        return L.get(this) != 0;
    }

    public final AbstractRunnableC6684n11 j(Runnable runnable, InterfaceC7799r11 interfaceC7799r11) {
        long jA = B11.f.a();
        if (!(runnable instanceof AbstractRunnableC6684n11)) {
            return new C9201w11(runnable, jA, interfaceC7799r11);
        }
        AbstractRunnableC6684n11 abstractRunnableC6684n11 = (AbstractRunnableC6684n11) runnable;
        abstractRunnableC6684n11.B = jA;
        abstractRunnableC6684n11.C = interfaceC7799r11;
        return abstractRunnableC6684n11;
    }

    public final c o() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !G10.c(ExecutorC7205ot.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void o0(long j, boolean z) {
        if (z || x0() || s0(j)) {
            return;
        }
        x0();
    }

    public final void p0() {
        if (x0() || w0(this, 0L, 1, null)) {
            return;
        }
        x0();
    }

    public final AbstractRunnableC6684n11 q0(c cVar, AbstractRunnableC6684n11 abstractRunnableC6684n11, boolean z) {
        if (cVar == null || cVar.D == d.TERMINATED) {
            return abstractRunnableC6684n11;
        }
        if (abstractRunnableC6684n11.C.b() == 0 && cVar.D == d.BLOCKING) {
            return abstractRunnableC6684n11;
        }
        cVar.H = true;
        return cVar.B.a(abstractRunnableC6684n11, z);
    }

    public final void s(Runnable runnable, InterfaceC7799r11 interfaceC7799r11, boolean z) {
        G0.a();
        AbstractRunnableC6684n11 abstractRunnableC6684n11J = j(runnable, interfaceC7799r11);
        boolean z2 = false;
        boolean z3 = abstractRunnableC6684n11J.C.b() == 1;
        long jAddAndGet = z3 ? K.addAndGet(this, 2097152L) : 0L;
        c cVarO = o();
        AbstractRunnableC6684n11 abstractRunnableC6684n11Q0 = q0(cVarO, abstractRunnableC6684n11J, z);
        if (abstractRunnableC6684n11Q0 != null && !c(abstractRunnableC6684n11Q0)) {
            throw new RejectedExecutionException(this.E + " was terminated");
        }
        if (z && cVarO != null) {
            z2 = true;
        }
        if (z3) {
            o0(jAddAndGet, z2);
        } else {
            if (z2) {
                return;
            }
            p0();
        }
    }

    public final boolean s0(long j) {
        if (AbstractC8417tE0.d(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.B) {
            int iD = d();
            if (iD == 1 && this.B > 1) {
                d();
            }
            if (iD > 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.H.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            c cVar = (c) this.H.b(i6);
            if (cVar != null) {
                int iE = cVar.B.e();
                int i7 = b.a[cVar.D.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iE);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iE);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iE > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iE);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = K.get(this);
        return this.E + '@' + AbstractC8054rw.b(this) + "[Pool Size {core = " + this.B + ", max = " + this.C + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.F.c() + ", global blocking queue size = " + this.G.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.B - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public final boolean x0() {
        c cVarN;
        do {
            cVarN = N();
            if (cVarN == null) {
                return false;
            }
        } while (!c.j().compareAndSet(cVarN, -1, 0));
        LockSupport.unpark(cVarN);
        return true;
    }

    /* JADX INFO: renamed from: com.daaw.ot$c */
    public final class c extends Thread {
        public static final AtomicIntegerFieldUpdater J = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        public final C1482Li1 B;
        public final C6748nF0 C;
        public d D;
        public long E;
        public long F;
        public int G;
        public boolean H;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        public c() {
            setDaemon(true);
            this.B = new C1482Li1();
            this.C = new C6748nF0();
            this.D = d.DORMANT;
            this.nextParkedWorker = ExecutorC7205ot.M;
            this.G = AbstractC6465mE0.B.c();
        }

        public static final AtomicIntegerFieldUpdater j() {
            return J;
        }

        public final void b(int i) {
            if (i == 0) {
                return;
            }
            ExecutorC7205ot.K.addAndGet(ExecutorC7205ot.this, -2097152L);
            if (this.D != d.TERMINATED) {
                this.D = d.DORMANT;
            }
        }

        public final void c(int i) {
            if (i != 0 && u(d.BLOCKING)) {
                ExecutorC7205ot.this.p0();
            }
        }

        public final void d(AbstractRunnableC6684n11 abstractRunnableC6684n11) {
            int iB = abstractRunnableC6684n11.C.b();
            k(iB);
            c(iB);
            ExecutorC7205ot.this.W(abstractRunnableC6684n11);
            b(iB);
        }

        public final AbstractRunnableC6684n11 e(boolean z) {
            AbstractRunnableC6684n11 abstractRunnableC6684n11O;
            AbstractRunnableC6684n11 abstractRunnableC6684n11O2;
            if (z) {
                boolean z2 = m(ExecutorC7205ot.this.B * 2) == 0;
                if (z2 && (abstractRunnableC6684n11O2 = o()) != null) {
                    return abstractRunnableC6684n11O2;
                }
                AbstractRunnableC6684n11 abstractRunnableC6684n11G = this.B.g();
                if (abstractRunnableC6684n11G != null) {
                    return abstractRunnableC6684n11G;
                }
                if (!z2 && (abstractRunnableC6684n11O = o()) != null) {
                    return abstractRunnableC6684n11O;
                }
            } else {
                AbstractRunnableC6684n11 abstractRunnableC6684n11O3 = o();
                if (abstractRunnableC6684n11O3 != null) {
                    return abstractRunnableC6684n11O3;
                }
            }
            return v(3);
        }

        public final AbstractRunnableC6684n11 f() {
            AbstractRunnableC6684n11 abstractRunnableC6684n11H = this.B.h();
            if (abstractRunnableC6684n11H != null) {
                return abstractRunnableC6684n11H;
            }
            AbstractRunnableC6684n11 abstractRunnableC6684n11 = (AbstractRunnableC6684n11) ExecutorC7205ot.this.G.d();
            return abstractRunnableC6684n11 == null ? v(1) : abstractRunnableC6684n11;
        }

        public final AbstractRunnableC6684n11 g(boolean z) {
            return s() ? e(z) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final void k(int i) {
            this.E = 0L;
            if (this.D == d.PARKING) {
                this.D = d.BLOCKING;
            }
        }

        public final boolean l() {
            return this.nextParkedWorker != ExecutorC7205ot.M;
        }

        public final int m(int i) {
            int i2 = this.G;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.G = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final void n() {
            if (this.E == 0) {
                this.E = System.nanoTime() + ExecutorC7205ot.this.D;
            }
            LockSupport.parkNanos(ExecutorC7205ot.this.D);
            if (System.nanoTime() - this.E >= 0) {
                this.E = 0L;
                w();
            }
        }

        public final AbstractRunnableC6684n11 o() {
            if (m(2) == 0) {
                AbstractRunnableC6684n11 abstractRunnableC6684n11 = (AbstractRunnableC6684n11) ExecutorC7205ot.this.F.d();
                return abstractRunnableC6684n11 != null ? abstractRunnableC6684n11 : (AbstractRunnableC6684n11) ExecutorC7205ot.this.G.d();
            }
            AbstractRunnableC6684n11 abstractRunnableC6684n112 = (AbstractRunnableC6684n11) ExecutorC7205ot.this.G.d();
            return abstractRunnableC6684n112 != null ? abstractRunnableC6684n112 : (AbstractRunnableC6684n11) ExecutorC7205ot.this.F.d();
        }

        public final void p() {
            loop0: while (true) {
                boolean z = false;
                while (!ExecutorC7205ot.this.isTerminated() && this.D != d.TERMINATED) {
                    AbstractRunnableC6684n11 abstractRunnableC6684n11G = g(this.H);
                    if (abstractRunnableC6684n11G != null) {
                        this.F = 0L;
                        d(abstractRunnableC6684n11G);
                    } else {
                        this.H = false;
                        if (this.F == 0) {
                            t();
                        } else if (z) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.F);
                            this.F = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
                break loop0;
            }
            u(d.TERMINATED);
        }

        public final void q(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC7205ot.this.E);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean s() {
            long j;
            if (this.D == d.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC7205ot executorC7205ot = ExecutorC7205ot.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC7205ot.K;
            do {
                j = atomicLongFieldUpdater.get(executorC7205ot);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC7205ot.K.compareAndSet(executorC7205ot, j, j - 4398046511104L));
            this.D = d.CPU_ACQUIRED;
            return true;
        }

        public final void t() {
            if (!l()) {
                ExecutorC7205ot.this.R(this);
                return;
            }
            J.set(this, -1);
            while (l() && J.get(this) == -1 && !ExecutorC7205ot.this.isTerminated() && this.D != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        public final boolean u(d dVar) {
            d dVar2 = this.D;
            boolean z = dVar2 == d.CPU_ACQUIRED;
            if (z) {
                ExecutorC7205ot.K.addAndGet(ExecutorC7205ot.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.D = dVar;
            }
            return z;
        }

        public final AbstractRunnableC6684n11 v(int i) {
            int i2 = (int) (ExecutorC7205ot.K.get(ExecutorC7205ot.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iM = m(i2);
            ExecutorC7205ot executorC7205ot = ExecutorC7205ot.this;
            long jMin = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                iM++;
                if (iM > i2) {
                    iM = 1;
                }
                c cVar = (c) executorC7205ot.H.b(iM);
                if (cVar != null && cVar != this) {
                    long jN = cVar.B.n(i, this.C);
                    if (jN == -1) {
                        C6748nF0 c6748nF0 = this.C;
                        AbstractRunnableC6684n11 abstractRunnableC6684n11 = (AbstractRunnableC6684n11) c6748nF0.B;
                        c6748nF0.B = null;
                        return abstractRunnableC6684n11;
                    }
                    if (jN > 0) {
                        jMin = Math.min(jMin, jN);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.F = jMin;
            return null;
        }

        public final void w() {
            ExecutorC7205ot executorC7205ot = ExecutorC7205ot.this;
            synchronized (executorC7205ot.H) {
                try {
                    if (executorC7205ot.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC7205ot.K.get(executorC7205ot) & 2097151)) <= executorC7205ot.B) {
                        return;
                    }
                    if (J.compareAndSet(this, -1, 1)) {
                        int i = this.indexInArray;
                        q(0);
                        executorC7205ot.U(this, i, 0);
                        int andDecrement = (int) (2097151 & ExecutorC7205ot.K.getAndDecrement(executorC7205ot));
                        if (andDecrement != i) {
                            Object objB = executorC7205ot.H.b(andDecrement);
                            G10.d(objB);
                            c cVar = (c) objB;
                            executorC7205ot.H.c(i, cVar);
                            cVar.q(i);
                            executorC7205ot.U(cVar, andDecrement, i);
                        }
                        executorC7205ot.H.c(andDecrement, null);
                        G91 g91 = G91.a;
                        this.D = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(ExecutorC7205ot executorC7205ot, int i) {
            this();
            q(i);
        }
    }
}
