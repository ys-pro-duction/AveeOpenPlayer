package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.Vv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2598Vv2 implements InterfaceC1447Kz2 {
    public final Context a;

    public C2598Vv2(Context context) {
        this.a = context;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.G2)).booleanValue()) {
            return AbstractC7360pS2.h(new C2702Wv2(AbstractC9438ws.a(this.a, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return AbstractC7360pS2.h(null);
    }
}
