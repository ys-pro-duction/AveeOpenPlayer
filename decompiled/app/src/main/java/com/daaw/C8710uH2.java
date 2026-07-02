package com.daaw;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.daaw.uH2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8710uH2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;

    public C8710uH2(InterfaceC8394t83 interfaceC8394t83) {
        this.a = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        ThreadFactory threadFactory = (ThreadFactory) this.a.zzb();
        AbstractC8172sM2.a();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        AbstractC7000o83.b(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
