package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.ky2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6113ky2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final C7447pl2 b;

    public C6113ky2(PS2 ps2, C7447pl2 c7447pl2) {
        this.a = ps2;
        this.b = c7447pl2;
    }

    public final /* synthetic */ C6392ly2 a() {
        C7447pl2 c7447pl2 = this.b;
        String strC = c7447pl2.c();
        boolean zQ = c7447pl2.q();
        boolean zZzl = zzt.zzs().zzl();
        C7447pl2 c7447pl22 = this.b;
        return new C6392ly2(strC, zQ, zZzl, c7447pl22.o(), c7447pl22.r());
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 23;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.jy2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
