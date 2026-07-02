package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class VA2 implements InterfaceC1447Kz2 {
    public final Context a;
    public final OS1 b;
    public final ScheduledExecutorService c;
    public final Executor d;
    public final String e;
    public final C5396iS1 f;

    public VA2(C5396iS1 c5396iS1, int i, Context context, OS1 os1, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f = c5396iS1;
        this.a = context;
        this.b = os1;
        this.c = scheduledExecutorService;
        this.d = executor;
        this.e = str;
    }

    public final /* synthetic */ WA2 a(Exception exc) {
        this.b.u(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 44;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.e((AbstractC4839gS2) AbstractC7360pS2.o(AbstractC7360pS2.m(AbstractC4839gS2.C(AbstractC7360pS2.k(new RR2() { // from class: com.daaw.SA2
            @Override // com.daaw.RR2
            public final InterfaceFutureC8236sc0 zza() {
                return AbstractC7360pS2.h(null);
            }
        }, this.d)), new WN2() { // from class: com.daaw.TA2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new WA2(str);
            }
        }, this.d), ((Long) zzba.zzc().b(AbstractC9820yE1.U0)).longValue(), TimeUnit.MILLISECONDS, this.c), Exception.class, new WN2() { // from class: com.daaw.UA2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                this.a.a((Exception) obj);
                return null;
            }
        }, VS2.b());
    }
}
