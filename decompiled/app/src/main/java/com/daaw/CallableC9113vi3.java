package com.daaw;

import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.vi3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9113vi3 implements Callable {
    public final /* synthetic */ zzs a;

    public CallableC9113vi3(zzs zzsVar) {
        this.a = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzs zzsVar = this.a;
        return new C7782qx1(C7503px1.p(zzsVar.B.B, zzsVar.E, false));
    }
}
