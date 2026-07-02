package com.daaw;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class UR2 extends Thread {
    public final Object B;
    public final BlockingQueue C;
    public boolean D = false;
    public final /* synthetic */ KS2 E;

    public UR2(KS2 ks2, String str, BlockingQueue blockingQueue) {
        this.E = ks2;
        AbstractC7506py0.l(str);
        AbstractC7506py0.l(blockingQueue);
        this.B = new Object();
        this.C = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.B) {
            this.B.notifyAll();
        }
    }

    public final void b() {
        synchronized (this.E.i) {
            try {
                if (!this.D) {
                    this.E.j.release();
                    this.E.i.notifyAll();
                    KS2 ks2 = this.E;
                    if (this == ks2.c) {
                        ks2.c = null;
                    } else if (this == ks2.d) {
                        ks2.d = null;
                    } else {
                        ks2.a.w().n().a("Current scheduler thread is neither worker nor network");
                    }
                    this.D = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.E.a.w().t().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.E.j.acquire();
                z = true;
            } catch (InterruptedException e) {
                c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C4267eR2 c4267eR2 = (C4267eR2) this.C.poll();
                if (c4267eR2 != null) {
                    Process.setThreadPriority(true != c4267eR2.C ? 10 : threadPriority);
                    c4267eR2.run();
                } else {
                    synchronized (this.B) {
                        if (this.C.peek() == null) {
                            KS2.B(this.E);
                            try {
                                this.B.wait(30000L);
                            } catch (InterruptedException e2) {
                                c(e2);
                            }
                        }
                    }
                    synchronized (this.E.i) {
                        if (this.C.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
