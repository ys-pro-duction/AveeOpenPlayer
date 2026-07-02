package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Ye3 implements InterfaceC5489im3 {
    public final Executor a;
    public final Object b = new Object();
    public InterfaceC7470pq0 c;

    public Ye3(Executor executor, InterfaceC7470pq0 interfaceC7470pq0) {
        this.a = executor;
        this.c = interfaceC7470pq0;
    }

    @Override // com.daaw.InterfaceC5489im3
    public final void a(AbstractC6963o11 abstractC6963o11) {
        if (abstractC6963o11.n() || abstractC6963o11.l()) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new RunnableC9088vd3(this, abstractC6963o11));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
