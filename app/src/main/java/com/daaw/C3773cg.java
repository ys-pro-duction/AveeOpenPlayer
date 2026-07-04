package com.daaw;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: com.daaw.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3773cg extends AbstractC9472x {
    public final Thread E;
    public final NH F;

    public C3773cg(InterfaceC4684ft interfaceC4684ft, Thread thread, NH nh) {
        super(interfaceC4684ft, true, true);
        this.E = thread;
        this.F = nh;
    }

    public final Object V0() throws Throwable {
        G0.a();
        try {
            NH nh = this.F;
            if (nh != null) {
                NH.q1(nh, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    NH nh2 = this.F;
                    long jT1 = nh2 != null ? nh2.t1() : Long.MAX_VALUE;
                    if (o()) {
                        NH nh3 = this.F;
                        if (nh3 != null) {
                            NH.l1(nh3, false, 1, null);
                        }
                        G0.a();
                        Object objH = AbstractC4167e40.h(a0());
                        C2041Qn c2041Qn = objH instanceof C2041Qn ? (C2041Qn) objH : null;
                        if (c2041Qn == null) {
                            return objH;
                        }
                        throw c2041Qn.a;
                    }
                    G0.a();
                    LockSupport.parkNanos(this, jT1);
                } catch (Throwable th) {
                    NH nh4 = this.F;
                    if (nh4 != null) {
                        NH.l1(nh4, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            v(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            G0.a();
            throw th2;
        }
    }

    @Override // com.daaw.C3889d40
    public boolean f0() {
        return true;
    }

    @Override // com.daaw.C3889d40
    public void q(Object obj) {
        if (G10.c(Thread.currentThread(), this.E)) {
            return;
        }
        Thread thread = this.E;
        G0.a();
        LockSupport.unpark(thread);
    }
}
