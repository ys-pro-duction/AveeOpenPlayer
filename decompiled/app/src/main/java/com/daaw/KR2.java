package com.daaw;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KR2 extends QR2 {
    public static final Logger P = Logger.getLogger(KR2.class.getName());
    public JP2 M;
    public final boolean N;
    public final boolean O;

    public KR2(JP2 jp2, boolean z, boolean z2) {
        super(jp2.size());
        this.M = jp2;
        this.N = z;
        this.O = z2;
    }

    public static void N(Throwable th) {
        P.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    public static boolean O(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.daaw.QR2
    public final void I(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thA = a();
        thA.getClass();
        O(set, thA);
    }

    public final void K(int i, Future future) {
        try {
            P(i, AbstractC7360pS2.p(future));
        } catch (Error e) {
            e = e;
            M(e);
        } catch (RuntimeException e2) {
            e = e2;
            M(e);
        } catch (ExecutionException e3) {
            M(e3.getCause());
        }
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void T(JP2 jp2) {
        int iC = C();
        int i = 0;
        AbstractC5381iO2.j(iC >= 0, "Less than 0 remaining futures");
        if (iC == 0) {
            if (jp2 != null) {
                UQ2 uq2Y = jp2.y();
                while (uq2Y.hasNext()) {
                    Future future = (Future) uq2Y.next();
                    if (!future.isCancelled()) {
                        K(i, future);
                    }
                    i++;
                }
            }
            H();
            Q();
            U(2);
        }
    }

    public final void M(Throwable th) {
        th.getClass();
        if (this.N && !f(th) && O(E(), th)) {
            N(th);
        } else if (th instanceof Error) {
            N(th);
        }
    }

    public abstract void P(int i, Object obj);

    public abstract void Q();

    public final void R() {
        JP2 jp2 = this.M;
        jp2.getClass();
        if (jp2.isEmpty()) {
            Q();
            return;
        }
        if (!this.N) {
            final JP2 jp22 = this.O ? this.M : null;
            Runnable runnable = new Runnable() { // from class: com.daaw.JR2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.T(jp22);
                }
            };
            UQ2 uq2Y = this.M.y();
            while (uq2Y.hasNext()) {
                ((InterfaceFutureC8236sc0) uq2Y.next()).g(runnable, EnumC3993dS2.INSTANCE);
            }
            return;
        }
        UQ2 uq2Y2 = this.M.y();
        final int i = 0;
        while (uq2Y2.hasNext()) {
            final InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = (InterfaceFutureC8236sc0) uq2Y2.next();
            interfaceFutureC8236sc0.g(new Runnable() { // from class: com.daaw.IR2
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.S(interfaceFutureC8236sc0, i);
                }
            }, EnumC3993dS2.INSTANCE);
            i++;
        }
    }

    public final /* synthetic */ void S(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, int i) {
        try {
            if (interfaceFutureC8236sc0.isCancelled()) {
                this.M = null;
                cancel(false);
            } else {
                K(i, interfaceFutureC8236sc0);
            }
            T(null);
        } catch (Throwable th) {
            T(null);
            throw th;
        }
    }

    public void U(int i) {
        this.M = null;
    }

    @Override // com.daaw.AbstractC9873yR2
    public final String c() {
        JP2 jp2 = this.M;
        return jp2 != null ? "futures=".concat(jp2.toString()) : super.c();
    }

    @Override // com.daaw.AbstractC9873yR2
    public final void d() {
        JP2 jp2 = this.M;
        U(1);
        if ((jp2 != null) && isCancelled()) {
            boolean zV = v();
            UQ2 uq2Y = jp2.y();
            while (uq2Y.hasNext()) {
                ((Future) uq2Y.next()).cancel(zV);
            }
        }
    }
}
