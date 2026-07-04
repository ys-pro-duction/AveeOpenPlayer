package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class CX1 {
    public final zzcaz a;
    public final Context b;
    public final WeakReference c;

    public /* synthetic */ CX1(AX1 ax1, BX1 bx1) {
        this.a = ax1.a;
        this.b = ax1.b;
        this.c = ax1.c;
    }

    public final Context a() {
        return this.b;
    }

    public final C7782qx1 b() {
        return new C7782qx1(new zzi(this.b, this.a));
    }

    public final VF1 c() {
        return new VF1(this.b);
    }

    public final zzcaz d() {
        return this.a;
    }

    public final String e() {
        return zzt.zzp().zzc(this.b, this.a.B);
    }

    public final WeakReference f() {
        return this.c;
    }
}
