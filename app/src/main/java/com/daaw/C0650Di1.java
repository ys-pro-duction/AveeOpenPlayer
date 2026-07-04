package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Di1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0650Di1 implements InterfaceC8357t11 {
    public final WP0 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new a();

    /* JADX INFO: renamed from: com.daaw.Di1$a */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C0650Di1.this.d(runnable);
        }
    }

    public C0650Di1(Executor executor) {
        this.a = new WP0(executor);
    }

    @Override // com.daaw.InterfaceC8357t11
    public Executor a() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC8357t11
    public void b(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // com.daaw.InterfaceC8357t11
    public WP0 c() {
        return this.a;
    }

    public void d(Runnable runnable) {
        this.b.post(runnable);
    }
}
