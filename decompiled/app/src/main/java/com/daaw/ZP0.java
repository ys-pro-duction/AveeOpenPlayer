package com.daaw;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class ZP0 implements Executor, Runnable {
    public static final Logger E = Logger.getLogger(ZP0.class.getName());
    public static final b F = c();
    public Executor B;
    public final Queue C = new ConcurrentLinkedQueue();
    public volatile int D = 0;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(ZP0 zp0, int i, int i2);

        public abstract void b(ZP0 zp0, int i);
    }

    public static final class c extends b {
        public final AtomicIntegerFieldUpdater a;

        @Override // com.daaw.ZP0.b
        public boolean a(ZP0 zp0, int i, int i2) {
            return this.a.compareAndSet(zp0, i, i2);
        }

        @Override // com.daaw.ZP0.b
        public void b(ZP0 zp0, int i) {
            this.a.set(zp0, i);
        }

        public c(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.a = atomicIntegerFieldUpdater;
        }
    }

    public static final class d extends b {
        public d() {
            super();
        }

        @Override // com.daaw.ZP0.b
        public boolean a(ZP0 zp0, int i, int i2) {
            synchronized (zp0) {
                try {
                    if (zp0.D != i) {
                        return false;
                    }
                    zp0.D = i2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.ZP0.b
        public void b(ZP0 zp0, int i) {
            synchronized (zp0) {
                zp0.D = i;
            }
        }
    }

    public ZP0(Executor executor) {
        AbstractC7785qy0.o(executor, "'executor' must not be null.");
        this.B = executor;
    }

    public static b c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(ZP0.class, "D"));
        } catch (Throwable th) {
            E.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new d();
        }
    }

    public final void d(Runnable runnable) {
        if (F.a(this, 0, -1)) {
            try {
                this.B.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.C.remove(runnable);
                }
                F.b(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.C.add((Runnable) AbstractC7785qy0.o(runnable, "'r' must not be null."));
        d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        try {
            Executor executor = this.B;
            while (executor == this.B && (runnable = (Runnable) this.C.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    E.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e);
                }
            }
            F.b(this, 0);
            if (this.C.isEmpty()) {
                return;
            }
            d(null);
        } catch (Throwable th) {
            F.b(this, 0);
            throw th;
        }
    }
}
