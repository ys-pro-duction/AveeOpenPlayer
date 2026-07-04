package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LB2 {
    public static InterfaceC1447Kz2 a(C6176lB2 c6176lB2, C0498By2 c0498By2, ScheduledExecutorService scheduledExecutorService, int i) {
        return i == 0 ? new C1754Ny2(c0498By2, 0L, scheduledExecutorService) : new C1754Ny2(c6176lB2, 0L, scheduledExecutorService);
    }

    public static InterfaceC1447Kz2 b(C8972vB2 c8972vB2, ScheduledExecutorService scheduledExecutorService) {
        return new C1754Ny2(c8972vB2, ((Long) zzba.zzc().b(AbstractC9820yE1.V3)).longValue(), scheduledExecutorService);
    }

    public static InterfaceC1447Kz2 c(UB2 ub2, ScheduledExecutorService scheduledExecutorService) {
        return new C1754Ny2(ub2, 0L, scheduledExecutorService);
    }
}
