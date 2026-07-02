package com.daaw;

import com.daaw.OH;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: com.daaw.gx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC4980gx extends OH implements Runnable {
    public static final RunnableC4980gx J;
    public static final long K;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        RunnableC4980gx runnableC4980gx = new RunnableC4980gx();
        J = runnableC4980gx;
        NH.q1(runnableC4980gx, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        K = timeUnit.toNanos(l.longValue());
    }

    @Override // com.daaw.OH
    public void C1(Runnable runnable) {
        if (O1()) {
            R1();
        }
        super.C1(runnable);
    }

    public final synchronized void M1() {
        if (P1()) {
            debugStatus = 3;
            G1();
            G10.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread N1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean O1() {
        return debugStatus == 4;
    }

    public final boolean P1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    public final synchronized boolean Q1() {
        if (P1()) {
            return false;
        }
        debugStatus = 1;
        G10.e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void R1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // com.daaw.OH, com.daaw.InterfaceC10301zy
    public InterfaceC9531xC Y0(long j, Runnable runnable, InterfaceC4684ft interfaceC4684ft) {
        return J1(j, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zE1;
        C5848k31.a.d(this);
        G0.a();
        try {
            if (!Q1()) {
                if (zE1) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jT1 = t1();
                if (jT1 == Long.MAX_VALUE) {
                    G0.a();
                    long jNanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = K + jNanoTime;
                    }
                    long j2 = j - jNanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        M1();
                        G0.a();
                        if (E1()) {
                            return;
                        }
                        w1();
                        return;
                    }
                    jT1 = AbstractC8417tE0.i(jT1, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jT1 > 0) {
                    if (P1()) {
                        _thread = null;
                        M1();
                        G0.a();
                        if (E1()) {
                            return;
                        }
                        w1();
                        return;
                    }
                    G0.a();
                    LockSupport.parkNanos(this, jT1);
                }
            }
        } finally {
            _thread = null;
            M1();
            G0.a();
            if (!E1()) {
                w1();
            }
        }
    }

    @Override // com.daaw.OH, com.daaw.NH
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // com.daaw.PH
    public Thread w1() {
        Thread thread = _thread;
        return thread == null ? N1() : thread;
    }

    @Override // com.daaw.PH
    public void x1(long j, OH.c cVar) {
        R1();
    }
}
