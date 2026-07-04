package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Ww2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2706Ww2 implements InterfaceC1447Kz2 {
    public final OS1 a;
    public InterfaceC6273la b;
    public final ScheduledExecutorService c;
    public final PS2 d;
    public final Context e;

    public C2706Ww2(Context context, OS1 os1, ScheduledExecutorService scheduledExecutorService, PS2 ps2) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.D2)).booleanValue()) {
            this.b = AbstractC5985ka.a(context);
        }
        this.e = context;
        this.a = os1;
        this.c = scheduledExecutorService;
        this.d = ps2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 11;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.z2)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.E2)).booleanValue()) {
                if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.A2)).booleanValue()) {
                    return AbstractC7360pS2.m(FM2.a(this.b.a()), new WN2() { // from class: com.daaw.Pw2
                        @Override // com.daaw.WN2
                        public final Object apply(Object obj) {
                            C6552ma c6552ma = (C6552ma) obj;
                            return new C2810Xw2(c6552ma.a(), c6552ma.b());
                        }
                    }, AbstractC9322wT1.f);
                }
                AbstractC6963o11 abstractC6963o11A = ((Boolean) zzba.zzc().b(AbstractC9820yE1.D2)).booleanValue() ? AbstractC6754nG2.a(this.e) : this.b.a();
                if (abstractC6963o11A == null) {
                    return AbstractC7360pS2.h(new C2810Xw2(null, -1));
                }
                InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(FM2.a(abstractC6963o11A), new WR2() { // from class: com.daaw.Qw2
                    @Override // com.daaw.WR2
                    public final InterfaceFutureC8236sc0 zza(Object obj) {
                        C6552ma c6552ma = (C6552ma) obj;
                        return c6552ma == null ? AbstractC7360pS2.h(new C2810Xw2(null, -1)) : AbstractC7360pS2.h(new C2810Xw2(c6552ma.a(), c6552ma.b()));
                    }
                }, AbstractC9322wT1.f);
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.B2)).booleanValue()) {
                    interfaceFutureC8236sc0N = AbstractC7360pS2.o(interfaceFutureC8236sc0N, ((Long) zzba.zzc().b(AbstractC9820yE1.C2)).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return AbstractC7360pS2.e(interfaceFutureC8236sc0N, Exception.class, new WN2() { // from class: com.daaw.Rw2
                    @Override // com.daaw.WN2
                    public final Object apply(Object obj) {
                        this.a.a.u((Exception) obj, "AppSetIdInfoSignal");
                        return new C2810Xw2(null, -1);
                    }
                }, this.d);
            }
        }
        return AbstractC7360pS2.h(new C2810Xw2(null, -1));
    }
}
