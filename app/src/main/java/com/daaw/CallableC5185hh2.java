package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.hh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC5185hh2 implements Callable {
    public final zza a;
    public final KW1 b;
    public final Context c;
    public final C1071Hj2 d;
    public final InterfaceC6483mI2 e;
    public final C6077kq2 f;
    public final Executor g;
    public final C7782qx1 h;
    public final zzcaz i;
    public final C6487mJ2 j;
    public final BinderC9431wq2 k;

    public CallableC5185hh2(Context context, Executor executor, C7782qx1 c7782qx1, zzcaz zzcazVar, zza zzaVar, KW1 kw1, C6077kq2 c6077kq2, C6487mJ2 c6487mJ2, C1071Hj2 c1071Hj2, InterfaceC6483mI2 interfaceC6483mI2, BinderC9431wq2 binderC9431wq2) {
        this.c = context;
        this.g = executor;
        this.h = c7782qx1;
        this.i = zzcazVar;
        this.a = zzaVar;
        this.b = kw1;
        this.f = c6077kq2;
        this.j = c6487mJ2;
        this.d = c1071Hj2;
        this.e = interfaceC6483mI2;
        this.k = binderC9431wq2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C6023kh2 c6023kh2 = new C6023kh2(this);
        c6023kh2.h();
        return c6023kh2;
    }
}
