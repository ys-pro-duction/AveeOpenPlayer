package com.daaw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0816Ey {
    public static final String d = AbstractC1772Od0.f("DelayedWorkTracker");
    public final YT a;
    public final InterfaceC8162sK0 b;
    public final Map c = new HashMap();

    /* JADX INFO: renamed from: com.daaw.Ey$a */
    public class a implements Runnable {
        public final /* synthetic */ C1793Oi1 B;

        public a(C1793Oi1 c1793Oi1) {
            this.B = c1793Oi1;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1772Od0.c().a(C0816Ey.d, String.format("Scheduling work %s", this.B.a), new Throwable[0]);
            C0816Ey.this.a.e(this.B);
        }
    }

    public C0816Ey(YT yt, InterfaceC8162sK0 interfaceC8162sK0) {
        this.a = yt;
        this.b = interfaceC8162sK0;
    }

    public void a(C1793Oi1 c1793Oi1) {
        Runnable runnable = (Runnable) this.c.remove(c1793Oi1.a);
        if (runnable != null) {
            this.b.b(runnable);
        }
        a aVar = new a(c1793Oi1);
        this.c.put(c1793Oi1.a, aVar);
        this.b.a(c1793Oi1.a() - System.currentTimeMillis(), aVar);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.c.remove(str);
        if (runnable != null) {
            this.b.b(runnable);
        }
    }
}
