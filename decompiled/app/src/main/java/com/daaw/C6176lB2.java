package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.lB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6176lB2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final String b;
    public final C4559fS1 c;

    public C6176lB2(C4559fS1 c4559fS1, PS2 ps2, String str) {
        this.c = c4559fS1;
        this.a = ps2;
        this.b = str;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 47;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0H = AbstractC7360pS2.h(null);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.L5)).booleanValue()) {
            interfaceFutureC8236sc0H = AbstractC7360pS2.h(null);
        }
        final InterfaceFutureC8236sc0 interfaceFutureC8236sc0H2 = AbstractC7360pS2.h(null);
        return AbstractC7360pS2.c(interfaceFutureC8236sc0H, interfaceFutureC8236sc0H2).a(new Callable() { // from class: com.daaw.kB2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C6455mB2((String) interfaceFutureC8236sc0H.get(), (String) interfaceFutureC8236sc0H2.get());
            }
        }, AbstractC9322wT1.a);
    }
}
