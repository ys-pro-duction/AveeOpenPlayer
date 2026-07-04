package com.daaw;

import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Iw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1227Iw2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final FF2 b;
    public final zzcaz c;
    public final RS1 d;

    public C1227Iw2(PS2 ps2, FF2 ff2, zzcaz zzcazVar, RS1 rs1) {
        this.a = ps2;
        this.b = ff2;
        this.c = zzcazVar;
        this.d = rs1;
    }

    public final /* synthetic */ C1331Jw2 a() {
        return new C1331Jw2(this.b.j, this.c, this.d.l());
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 9;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.Hw2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
