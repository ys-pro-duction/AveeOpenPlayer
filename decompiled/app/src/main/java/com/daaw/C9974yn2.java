package com.daaw;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbuo;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.daaw.yn2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9974yn2 {
    public final PS2 a;
    public final PS2 b;
    public final C2358Tn2 c;
    public final V73 d;

    public C9974yn2(PS2 ps2, PS2 ps22, C2358Tn2 c2358Tn2, V73 v73) {
        this.a = ps2;
        this.b = ps22;
        this.c = c2358Tn2;
        this.d = v73;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 a(zzbuo zzbuoVar) {
        return this.c.c(zzbuoVar, ((Long) zzba.zzc().b(AbstractC9820yE1.Ba)).longValue());
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 b(zzbuo zzbuoVar, int i, C4090dn2 c4090dn2) {
        return ((BinderC2362To2) this.d.zzb()).Z2(zzbuoVar, i);
    }

    public final InterfaceFutureC8236sc0 c(final zzbuo zzbuoVar) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0F;
        String str = zzbuoVar.G;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            interfaceFutureC8236sc0F = AbstractC7360pS2.g(new C4090dn2(1, "Ads service proxy force local"));
        } else {
            interfaceFutureC8236sc0F = AbstractC7360pS2.f(AbstractC7360pS2.k(new RR2() { // from class: com.daaw.vn2
                @Override // com.daaw.RR2
                public final InterfaceFutureC8236sc0 zza() {
                    return this.a.a(zzbuoVar);
                }
            }, this.a), ExecutionException.class, new WR2() { // from class: com.daaw.wn2
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return AbstractC7360pS2.g(cause);
                }
            }, this.b);
        }
        final int callingUid = Binder.getCallingUid();
        return AbstractC7360pS2.f(interfaceFutureC8236sc0F, C4090dn2.class, new WR2() { // from class: com.daaw.xn2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.b(zzbuoVar, callingUid, (C4090dn2) obj);
            }
        }, this.b);
    }
}
