package com.daaw;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.nw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6942nw2 implements InterfaceC1447Kz2 {
    public final InterfaceFutureC8236sc0 a;
    public final Executor b;

    public C6942nw2(InterfaceFutureC8236sc0 interfaceFutureC8236sc0, Executor executor) {
        this.a = interfaceFutureC8236sc0;
        this.b = executor;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 6;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.n(this.a, new WR2() { // from class: com.daaw.mw2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                final String str = (String) obj;
                return AbstractC7360pS2.h(new InterfaceC1343Jz2() { // from class: com.daaw.lw2
                    @Override // com.daaw.InterfaceC1343Jz2
                    public final void a(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.b);
    }
}
