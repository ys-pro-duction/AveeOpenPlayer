package com.daaw;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbvg;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.vm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9132vm2 {
    public final ScheduledExecutorService a;
    public final PS2 b;
    public final PS2 c;
    public final C2040Qm2 d;
    public final V73 e;

    public C9132vm2(ScheduledExecutorService scheduledExecutorService, PS2 ps2, PS2 ps22, C2040Qm2 c2040Qm2, V73 v73) {
        this.a = scheduledExecutorService;
        this.b = ps2;
        this.c = ps22;
        this.d = c2040Qm2;
        this.e = v73;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 a(zzbvg zzbvgVar, int i, Throwable th) {
        return ((BinderC0883Fo2) this.e.zzb()).b3(zzbvgVar, i);
    }

    public final InterfaceFutureC8236sc0 b(final zzbvg zzbvgVar) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0S0;
        String str = zzbvgVar.E;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            interfaceFutureC8236sc0S0 = AbstractC7360pS2.g(new C4090dn2(1));
        } else {
            interfaceFutureC8236sc0S0 = ((Boolean) zzba.zzc().b(AbstractC9820yE1.x7)).booleanValue() ? this.c.S0(new Callable() { // from class: com.daaw.tm2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c(zzbvgVar);
                }
            }) : this.d.b(zzbvgVar);
        }
        final int callingUid = Binder.getCallingUid();
        return AbstractC7360pS2.f((AbstractC4839gS2) AbstractC7360pS2.o(AbstractC4839gS2.C(interfaceFutureC8236sc0S0), ((Integer) zzba.zzc().b(AbstractC9820yE1.u5)).intValue(), TimeUnit.SECONDS, this.a), Throwable.class, new WR2() { // from class: com.daaw.um2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.a(zzbvgVar, callingUid, (Throwable) obj);
            }
        }, this.b);
    }

    public final /* synthetic */ InputStream c(zzbvg zzbvgVar) {
        return (InputStream) this.d.b(zzbvgVar).get(((Integer) zzba.zzc().b(AbstractC9820yE1.u5)).intValue(), TimeUnit.SECONDS);
    }
}
