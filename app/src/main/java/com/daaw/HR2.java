package com.daaw;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HR2 extends AbstractC4560fS2 implements Runnable {
    public static final /* synthetic */ int K = 0;
    public InterfaceFutureC8236sc0 I;
    public Object J;

    public HR2(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, Object obj) {
        interfaceFutureC8236sc0.getClass();
        this.I = interfaceFutureC8236sc0;
        this.J = obj;
    }

    public abstract Object D(Object obj, Object obj2);

    public abstract void E(Object obj);

    @Override // com.daaw.AbstractC9873yR2
    public final String c() {
        String str;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.I;
        Object obj = this.J;
        String strC = super.c();
        if (interfaceFutureC8236sc0 != null) {
            str = "inputFuture=[" + interfaceFutureC8236sc0.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strC != null) {
                return str.concat(strC);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.daaw.AbstractC9873yR2
    public final void d() {
        t(this.I);
        this.I = null;
        this.J = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.I;
        Object obj = this.J;
        if ((isCancelled() | (interfaceFutureC8236sc0 == null)) || (obj == null)) {
            return;
        }
        this.I = null;
        if (interfaceFutureC8236sc0.isCancelled()) {
            u(interfaceFutureC8236sc0);
            return;
        }
        try {
            try {
                Object objD = D(obj, AbstractC7360pS2.p(interfaceFutureC8236sc0));
                this.J = null;
                E(objD);
            } catch (Throwable th) {
                try {
                    WS2.a(th);
                    f(th);
                } finally {
                    this.J = null;
                }
            }
        } catch (Error e) {
            f(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            f(e2);
        } catch (ExecutionException e3) {
            f(e3.getCause());
        }
    }
}
