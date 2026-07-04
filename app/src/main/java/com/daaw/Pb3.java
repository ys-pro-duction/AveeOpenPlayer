package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Pb3 implements InterfaceC5489im3 {
    public final Executor a;
    public final Object b = new Object();
    public InterfaceC5228hq0 c;

    public Pb3(Executor executor, InterfaceC5228hq0 interfaceC5228hq0) {
        this.a = executor;
        this.c = interfaceC5228hq0;
    }

    @Override // com.daaw.InterfaceC5489im3
    public final void a(AbstractC6963o11 abstractC6963o11) {
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new RunnableC5151ha3(this, abstractC6963o11));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
