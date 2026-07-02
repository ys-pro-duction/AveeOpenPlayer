package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Tx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2398Tx2 implements InterfaceC1447Kz2 {
    public final PS2 a;

    public C2398Tx2(PS2 ps2) {
        this.a = ps2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 20;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.Sx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2502Ux2(zzt.zzs().zzb(), zzt.zzs().zzm());
            }
        });
    }
}
