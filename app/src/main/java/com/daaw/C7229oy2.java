package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.oy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7229oy2 implements InterfaceC1447Kz2 {
    public final PS2 a;

    public C7229oy2(PS2 ps2) {
        this.a = ps2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 24;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.ny2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", zzt.zzo().a());
                return new C7508py2(bundle);
            }
        });
    }
}
