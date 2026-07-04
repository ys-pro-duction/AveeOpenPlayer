package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.sh3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8264sh3 implements InterfaceC5489im3 {
    public final Executor a;
    public final Object b = new Object();
    public InterfaceC0464Bq0 c;

    public C8264sh3(Executor executor, InterfaceC0464Bq0 interfaceC0464Bq0) {
        this.a = executor;
        this.c = interfaceC0464Bq0;
    }

    @Override // com.daaw.InterfaceC5489im3
    public final void a(AbstractC6963o11 abstractC6963o11) {
        if (abstractC6963o11.n()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new RunnableC8538tg3(this, abstractC6963o11));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
