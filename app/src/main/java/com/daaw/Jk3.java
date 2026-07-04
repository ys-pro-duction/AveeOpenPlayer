package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Jk3 implements InterfaceC0464Bq0, InterfaceC7470pq0, InterfaceC4381eq0, InterfaceC5489im3 {
    public final Executor a;
    public final InterfaceC9066vZ0 b;
    public final C9995yr3 c;

    public Jk3(Executor executor, InterfaceC9066vZ0 interfaceC9066vZ0, C9995yr3 c9995yr3) {
        this.a = executor;
        this.b = interfaceC9066vZ0;
        this.c = c9995yr3;
    }

    @Override // com.daaw.InterfaceC5489im3
    public final void a(AbstractC6963o11 abstractC6963o11) {
        this.a.execute(new Di3(this, abstractC6963o11));
    }

    @Override // com.daaw.InterfaceC4381eq0
    public final void b() {
        this.c.s();
    }

    @Override // com.daaw.InterfaceC7470pq0
    public final void c(Exception exc) {
        this.c.q(exc);
    }

    @Override // com.daaw.InterfaceC0464Bq0
    public final void onSuccess(Object obj) {
        this.c.r(obj);
    }
}
