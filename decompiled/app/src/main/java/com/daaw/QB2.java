package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class QB2 implements InterfaceC1447Kz2 {
    public final OS1 a;
    public final boolean b;
    public final boolean c;
    public final ScheduledExecutorService d;
    public final PS2 e;
    public final String f;
    public final C4838gS1 g;

    public QB2(OS1 os1, boolean z, boolean z2, C4838gS1 c4838gS1, PS2 ps2, String str, ScheduledExecutorService scheduledExecutorService) {
        this.a = os1;
        this.b = z;
        this.c = z2;
        this.g = c4838gS1;
        this.e = ps2;
        this.f = str;
        this.d = scheduledExecutorService;
    }

    public final /* synthetic */ RB2 a(Exception exc) {
        this.a.u(exc, "TrustlessTokenSignal");
        return null;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 50;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.e7)).booleanValue() && this.c) {
            return AbstractC7360pS2.h(null);
        }
        if (!this.b) {
            return AbstractC7360pS2.h(null);
        }
        return AbstractC7360pS2.e(AbstractC7360pS2.o(AbstractC7360pS2.m(AbstractC7360pS2.h(null), new WN2() { // from class: com.daaw.OB2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new RB2(str);
            }
        }, this.e), ((Long) PF1.c.e()).longValue(), TimeUnit.MILLISECONDS, this.d), Exception.class, new WN2() { // from class: com.daaw.PB2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                this.a.a((Exception) obj);
                return null;
            }
        }, this.e);
    }
}
