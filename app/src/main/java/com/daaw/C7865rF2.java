package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.daaw.rF2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7865rF2 implements InterfaceC1810Om2 {
    @Override // com.daaw.InterfaceC1810Om2
    public final InterfaceC1834Os2 a(Looper looper, Handler.Callback callback) {
        return new C3670cH2(new Handler(looper, callback));
    }

    @Override // com.daaw.InterfaceC1810Om2
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }
}
