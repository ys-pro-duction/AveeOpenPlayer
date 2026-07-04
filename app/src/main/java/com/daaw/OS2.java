package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OS2 extends AtomicReference implements Runnable {
    public static final Runnable B = new NS2(null);
    public static final Runnable C = new NS2(null);

    public abstract Object a();

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC9040vS2 runnableC9040vS2 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof RunnableC9040vS2)) {
                if (runnable != C) {
                    break;
                }
            } else {
                runnableC9040vS2 = (RunnableC9040vS2) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = C;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(runnableC9040vS2);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean f();

    public final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC9040vS2 runnableC9040vS2 = new RunnableC9040vS2(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, runnableC9040vS2)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(B)) == C) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(B)) == C) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zF = f();
            if (!zF) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        WS2.a(th);
                        if (!compareAndSet(threadCurrentThread, B)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, B)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, B)) {
                c(threadCurrentThread);
            }
            if (zF) {
                return;
            }
            e(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == B) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC9040vS2) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
