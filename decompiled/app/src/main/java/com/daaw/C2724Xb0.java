package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: com.daaw.Xb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2724Xb0 extends AbstractC5801jt implements InterfaceC10301zy {
    public static final AtomicIntegerFieldUpdater I = AtomicIntegerFieldUpdater.newUpdater(C2724Xb0.class, "runningWorkers");
    public final AbstractC5801jt D;
    public final int E;
    public final /* synthetic */ InterfaceC10301zy F;
    public final C10201zd0 G;
    public final Object H;
    private volatile int runningWorkers;

    /* JADX INFO: renamed from: com.daaw.Xb0$a */
    public final class a implements Runnable {
        public Runnable B;

        public a(Runnable runnable) {
            this.B = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.B.run();
                } catch (Throwable th) {
                    AbstractC6926nt.a(C5905kG.B, th);
                }
                Runnable runnableM1 = C2724Xb0.this.m1();
                if (runnableM1 == null) {
                    return;
                }
                this.B = runnableM1;
                i++;
                if (i >= 16 && C2724Xb0.this.D.i1(C2724Xb0.this)) {
                    C2724Xb0.this.D.g1(C2724Xb0.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2724Xb0(AbstractC5801jt abstractC5801jt, int i) {
        this.D = abstractC5801jt;
        this.E = i;
        InterfaceC10301zy interfaceC10301zy = abstractC5801jt instanceof InterfaceC10301zy ? (InterfaceC10301zy) abstractC5801jt : null;
        this.F = interfaceC10301zy == null ? AbstractC5259hx.a() : interfaceC10301zy;
        this.G = new C10201zd0(false);
        this.H = new Object();
    }

    @Override // com.daaw.InterfaceC10301zy
    public void N(long j, InterfaceC3788cj interfaceC3788cj) {
        this.F.N(j, interfaceC3788cj);
    }

    @Override // com.daaw.InterfaceC10301zy
    public InterfaceC9531xC Y0(long j, Runnable runnable, InterfaceC4684ft interfaceC4684ft) {
        return this.F.Y0(j, runnable, interfaceC4684ft);
    }

    @Override // com.daaw.AbstractC5801jt
    public void g1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        Runnable runnableM1;
        this.G.a(runnable);
        if (I.get(this) >= this.E || !n1() || (runnableM1 = m1()) == null) {
            return;
        }
        this.D.g1(this, new a(runnableM1));
    }

    @Override // com.daaw.AbstractC5801jt
    public void h1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        Runnable runnableM1;
        this.G.a(runnable);
        if (I.get(this) >= this.E || !n1() || (runnableM1 = m1()) == null) {
            return;
        }
        this.D.h1(this, new a(runnableM1));
    }

    public final Runnable m1() {
        while (true) {
            Runnable runnable = (Runnable) this.G.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.H) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = I;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.G.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean n1() {
        synchronized (this.H) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = I;
            if (atomicIntegerFieldUpdater.get(this) >= this.E) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
