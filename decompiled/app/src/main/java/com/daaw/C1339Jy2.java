package com.daaw;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Jy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1339Jy2 implements InterfaceC1447Kz2 {
    public final PS2 a;
    public final Context b;
    public final Set c;

    public C1339Jy2(PS2 ps2, Context context, Set set) {
        this.a = ps2;
        this.b = context;
        this.c = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.daaw.C1443Ky2 a() {
        /*
            r3 = this;
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.S4
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.Z4
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r3.c
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L56
        L46:
            android.content.Context r0 = r3.b
            com.daaw.Ky2 r1 = new com.daaw.Ky2
            com.daaw.Pq2 r2 = com.google.android.gms.ads.internal.zzt.zzA()
            java.lang.String r0 = r2.h(r0)
            r1.<init>(r0)
            return r1
        L56:
            com.daaw.Ky2 r0 = new com.daaw.Ky2
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1339Jy2.a():com.daaw.Ky2");
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 27;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.Ey2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
