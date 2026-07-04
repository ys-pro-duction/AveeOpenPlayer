package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class PA2 implements InterfaceC1447Kz2 {
    public final OS1 a;
    public final String b;
    public final ScheduledExecutorService c;
    public final PS2 d;
    public final KA1 e;

    public PA2(String str, KA1 ka1, OS1 os1, ScheduledExecutorService scheduledExecutorService, PS2 ps2) {
        this.b = str;
        this.e = ka1;
        this.a = os1;
        this.c = scheduledExecutorService;
        this.d = ps2;
    }

    public final /* synthetic */ QA2 a(Exception exc) {
        this.a.u(exc, "AppSetIdInfoGmscoreSignal");
        return new QA2(null, -1);
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 43;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.z2)).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.E2)).booleanValue()) {
                InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(FM2.a(A11.e(null)), new WR2() { // from class: com.daaw.NA2
                    @Override // com.daaw.WR2
                    public final InterfaceFutureC8236sc0 zza(Object obj) {
                        C6552ma c6552ma = (C6552ma) obj;
                        return c6552ma == null ? AbstractC7360pS2.h(new QA2(null, -1)) : AbstractC7360pS2.h(new QA2(c6552ma.a(), c6552ma.b()));
                    }
                }, this.d);
                if (((Boolean) AbstractC6191lF1.a.e()).booleanValue()) {
                    interfaceFutureC8236sc0N = AbstractC7360pS2.o(interfaceFutureC8236sc0N, ((Long) AbstractC6191lF1.b.e()).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return AbstractC7360pS2.e(interfaceFutureC8236sc0N, Exception.class, new WN2() { // from class: com.daaw.OA2
                    @Override // com.daaw.WN2
                    public final Object apply(Object obj) {
                        return this.a.a((Exception) obj);
                    }
                }, this.d);
            }
        }
        return AbstractC7360pS2.h(new QA2(null, -1));
    }
}
