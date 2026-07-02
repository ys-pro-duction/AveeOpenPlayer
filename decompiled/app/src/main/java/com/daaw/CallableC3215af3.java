package com.daaw;

import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.af3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC3215af3 implements Callable {
    public final /* synthetic */ zzq a;
    public final /* synthetic */ C8812uf3 b;

    public CallableC3215af3(C8812uf3 c8812uf3, zzq zzqVar) {
        this.b = c8812uf3;
        this.a = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C3633c83 c3633c83C0 = this.b.c0((String) AbstractC7506py0.l(this.a.B));
        EnumC9512x73 enumC9512x73 = EnumC9512x73.ANALYTICS_STORAGE;
        if (c3633c83C0.j(enumC9512x73) && C3633c83.c(this.a.W, 100).j(enumC9512x73)) {
            return this.b.S(this.a).m0();
        }
        this.b.w().s().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
