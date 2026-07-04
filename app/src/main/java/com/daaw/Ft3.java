package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class Ft3 implements Runnable {
    public final /* synthetic */ C9995yr3 B;
    public final /* synthetic */ Callable C;

    public Ft3(C9995yr3 c9995yr3, Callable callable) {
        this.B = c9995yr3;
        this.C = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.B.r(this.C.call());
        } catch (Exception e) {
            this.B.q(e);
        } catch (Throwable th) {
            this.B.q(new RuntimeException(th));
        }
    }
}
