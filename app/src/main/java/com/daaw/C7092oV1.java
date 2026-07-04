package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.oV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7092oV1 extends zzb {
    public final FU1 c;
    public final AbstractC9330wV1 d;
    public final String e;
    public final String[] f;

    public C7092oV1(FU1 fu1, AbstractC9330wV1 abstractC9330wV1, String str, String[] strArr) {
        this.c = fu1;
        this.d = abstractC9330wV1;
        this.e = str;
        this.f = strArr;
        zzt.zzy().m(this);
    }

    public final /* synthetic */ Boolean b() {
        return Boolean.valueOf(this.d.x(this.e, this.f, this));
    }

    public final String c() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.d.w(this.e, this.f);
        } finally {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new RunnableC6813nV1(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final InterfaceFutureC8236sc0 zzb() {
        return (((Boolean) zzba.zzc().b(AbstractC9820yE1.U1)).booleanValue() && (this.d instanceof FV1)) ? AbstractC9322wT1.e.S0(new Callable() { // from class: com.daaw.mV1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b();
            }
        }) : super.zzb();
    }
}
