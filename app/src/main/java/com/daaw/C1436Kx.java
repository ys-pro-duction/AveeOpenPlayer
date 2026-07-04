package com.daaw;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.daaw.Kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1436Kx implements InterfaceC8162sK0 {
    public final Handler a = AbstractC9603xU.a(Looper.getMainLooper());

    @Override // com.daaw.InterfaceC8162sK0
    public void a(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }

    @Override // com.daaw.InterfaceC8162sK0
    public void b(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }
}
