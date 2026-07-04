package com.daaw;

import com.daaw.OH;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PH extends NH {
    public abstract Thread w1();

    public void x1(long j, OH.c cVar) {
        RunnableC4980gx.J.H1(j, cVar);
    }

    public final void y1() {
        Thread threadW1 = w1();
        if (Thread.currentThread() != threadW1) {
            G0.a();
            LockSupport.unpark(threadW1);
        }
    }
}
