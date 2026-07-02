package com.daaw;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Xx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2814Xx2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final FF2 b;

    public C2814Xx2(PS2 ps2, FF2 ff2) {
        this.a = ps2;
        this.b = ff2;
    }

    public final /* synthetic */ C2918Yx2 a() {
        return new C2918Yx2("requester_type_2".equals(zzf.zzb(this.b.d)));
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 21;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.Wx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
