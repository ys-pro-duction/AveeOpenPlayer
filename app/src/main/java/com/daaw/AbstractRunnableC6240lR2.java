package com.daaw;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.daaw.lR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC6240lR2 extends AbstractC4560fS2 implements Runnable {
    public InterfaceFutureC8236sc0 I;
    public Class J;
    public Object K;

    public AbstractRunnableC6240lR2(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, Class cls, Object obj) {
        interfaceFutureC8236sc0.getClass();
        this.I = interfaceFutureC8236sc0;
        this.J = cls;
        this.K = obj;
    }

    public abstract Object D(Object obj, Throwable th);

    public abstract void E(Object obj);

    @Override // com.daaw.AbstractC9873yR2
    public final String c() {
        String str;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.I;
        Class cls = this.J;
        Object obj = this.K;
        String strC = super.c();
        if (interfaceFutureC8236sc0 != null) {
            str = "inputFuture=[" + interfaceFutureC8236sc0.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strC != null) {
                return str.concat(strC);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.daaw.AbstractC9873yR2
    public final void d() {
        t(this.I);
        this.I = null;
        this.J = null;
        this.K = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.I;
        Class cls = this.J;
        Object obj = this.K;
        if (((obj == null) || ((interfaceFutureC8236sc0 == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.I = null;
        try {
            e = interfaceFutureC8236sc0 instanceof AbstractC5122hT2 ? ((AbstractC5122hT2) interfaceFutureC8236sc0).a() : null;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(interfaceFutureC8236sc0.getClass()) + " threw " + String.valueOf(e4.getClass()) + " without a cause");
            }
            e = cause;
        }
        Object objP = e == null ? AbstractC7360pS2.p(interfaceFutureC8236sc0) : null;
        if (e == null) {
            e(objP);
            return;
        }
        if (!cls.isInstance(e)) {
            u(interfaceFutureC8236sc0);
            return;
        }
        try {
            Object objD = D(obj, e);
            this.J = null;
            this.K = null;
            E(objD);
        } catch (Throwable th) {
            try {
                WS2.a(th);
                f(th);
            } finally {
                this.J = null;
                this.K = null;
            }
        }
    }
}
