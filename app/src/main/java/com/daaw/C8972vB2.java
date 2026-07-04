package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.vB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8972vB2 implements InterfaceC1447Kz2 {
    public final ScheduledExecutorService a;
    public final Context b;
    public final C6785nO1 c;

    public C8972vB2(C6785nO1 c6785nO1, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.c = c6785nO1;
        this.a = scheduledExecutorService;
        this.b = context;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 49;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.m(AbstractC7360pS2.o(AbstractC7360pS2.h(new Bundle()), ((Long) zzba.zzc().b(AbstractC9820yE1.V3)).longValue(), TimeUnit.MILLISECONDS, this.a), new WN2() { // from class: com.daaw.uB2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return new C9251wB2((Bundle) obj);
            }
        }, AbstractC9322wT1.a);
    }
}
