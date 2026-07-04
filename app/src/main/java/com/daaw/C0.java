package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C0 {
    public final AbstractC3515bk a;
    public final C1168Ii b;

    public interface a {
        C0 a(AbstractC3515bk abstractC3515bk, C1168Ii c1168Ii);
    }

    public C0(AbstractC3515bk abstractC3515bk, C1168Ii c1168Ii) {
        this.a = (AbstractC3515bk) AbstractC7785qy0.o(abstractC3515bk, "channel");
        this.b = (C1168Ii) AbstractC7785qy0.o(c1168Ii, "callOptions");
    }

    public abstract C0 a(AbstractC3515bk abstractC3515bk, C1168Ii c1168Ii);

    public final C1168Ii b() {
        return this.b;
    }

    public final C0 c(AbstractC0960Gi abstractC0960Gi) {
        return a(this.a, this.b.l(abstractC0960Gi));
    }

    public final C0 d(Executor executor) {
        return a(this.a, this.b.n(executor));
    }
}
