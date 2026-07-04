package com.daaw;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.wv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9455wv2 implements InterfaceC6162l82 {
    public final AtomicReference B = new AtomicReference();

    public final void a(zzdg zzdgVar) {
        this.B.set(zzdgVar);
    }

    @Override // com.daaw.InterfaceC6162l82
    public final void e(final zzs zzsVar) {
        AbstractC6742nD2.a(this.B, new InterfaceC6463mD2() { // from class: com.daaw.vv2
            @Override // com.daaw.InterfaceC6463mD2
            public final void zza(Object obj) {
                ((zzdg) obj).zze(zzsVar);
            }
        });
    }
}
