package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.daaw.k01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5833k01 implements InterfaceC5207hm {
    @Override // com.daaw.InterfaceC5207hm
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.daaw.InterfaceC5207hm
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.daaw.InterfaceC5207hm
    public CU d(Looper looper, Handler.Callback callback) {
        return new C6958o01(new Handler(looper, callback));
    }
}
