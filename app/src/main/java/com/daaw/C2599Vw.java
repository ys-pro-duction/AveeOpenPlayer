package com.daaw;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.daaw.Vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2599Vw implements InterfaceC5485im {
    public static final C2599Vw a = new C2599Vw();

    public static InterfaceC5485im d() {
        return a;
    }

    @Override // com.daaw.InterfaceC5485im
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.daaw.InterfaceC5485im
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.daaw.InterfaceC5485im
    public final long c() {
        return System.nanoTime();
    }
}
