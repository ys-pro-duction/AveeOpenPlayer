package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1512Lq {
    public ArrayList a = new ArrayList();
    public volatile EnumC1304Jq b = EnumC1304Jq.IDLE;

    /* JADX INFO: renamed from: com.daaw.Lq$a */
    public static final class a {
        public final Runnable a;
        public final Executor b;

        public a(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }

        public void a() {
            this.b.execute(this.a);
        }
    }

    public EnumC1304Jq a() {
        EnumC1304Jq enumC1304Jq = this.b;
        if (enumC1304Jq != null) {
            return enumC1304Jq;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    public void b(EnumC1304Jq enumC1304Jq) {
        AbstractC7785qy0.o(enumC1304Jq, "newState");
        if (this.b == enumC1304Jq || this.b == EnumC1304Jq.SHUTDOWN) {
            return;
        }
        this.b = enumC1304Jq;
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        this.a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    public void c(Runnable runnable, Executor executor, EnumC1304Jq enumC1304Jq) {
        AbstractC7785qy0.o(runnable, "callback");
        AbstractC7785qy0.o(executor, "executor");
        AbstractC7785qy0.o(enumC1304Jq, "source");
        a aVar = new a(runnable, executor);
        if (this.b != enumC1304Jq) {
            aVar.a();
        } else {
            this.a.add(aVar);
        }
    }
}
