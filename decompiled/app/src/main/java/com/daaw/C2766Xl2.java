package com.daaw;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbvg;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Xl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2766Xl2 {
    public final PS2 a;
    public final PS2 b;
    public final C1187Im2 c;
    public final V73 d;

    public C2766Xl2(PS2 ps2, PS2 ps22, C1187Im2 c1187Im2, V73 v73) {
        this.a = ps2;
        this.b = ps22;
        this.c = c1187Im2;
        this.d = v73;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 a(zzbvg zzbvgVar, int i, C4090dn2 c4090dn2) {
        return ((BinderC0883Fo2) this.d.zzb()).a3(zzbvgVar, i);
    }

    public final InterfaceFutureC8236sc0 b(final zzbvg zzbvgVar) {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0F;
        String str = zzbvgVar.E;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            interfaceFutureC8236sc0F = AbstractC7360pS2.g(new C4090dn2(1));
        } else {
            interfaceFutureC8236sc0F = AbstractC7360pS2.f(this.a.S0(new Callable() { // from class: com.daaw.Ul2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c(zzbvgVar);
                }
            }), ExecutionException.class, new WR2() { // from class: com.daaw.Vl2
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    return AbstractC7360pS2.g(((ExecutionException) obj).getCause());
                }
            }, this.b);
        }
        final int callingUid = Binder.getCallingUid();
        return AbstractC7360pS2.f(interfaceFutureC8236sc0F, C4090dn2.class, new WR2() { // from class: com.daaw.Wl2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.a(zzbvgVar, callingUid, (C4090dn2) obj);
            }
        }, this.b);
    }

    public final /* synthetic */ InputStream c(zzbvg zzbvgVar) {
        BT1 bt1;
        final C1187Im2 c1187Im2 = this.c;
        synchronized (c1187Im2.b) {
            try {
                if (c1187Im2.c) {
                    bt1 = c1187Im2.a;
                } else {
                    c1187Im2.c = true;
                    c1187Im2.e = zzbvgVar;
                    c1187Im2.f.checkAvailabilityAndConnect();
                    c1187Im2.a.g(new Runnable() { // from class: com.daaw.Hm2
                        @Override // java.lang.Runnable
                        public final void run() {
                            c1187Im2.a();
                        }
                    }, AbstractC9322wT1.f);
                    bt1 = c1187Im2.a;
                }
            } finally {
            }
        }
        return (InputStream) bt1.get(((Integer) zzba.zzc().b(AbstractC9820yE1.u5)).intValue(), TimeUnit.SECONDS);
    }
}
