package com.google.android.gms.ads.internal.util;

import com.daaw.AbstractC4274eT1;
import com.daaw.BT1;
import com.daaw.C1110Ht1;
import com.daaw.C3956dJ1;
import com.daaw.C3996dT1;
import com.daaw.C5249hu1;
import com.daaw.C9557xI1;
import com.daaw.InterfaceFutureC8236sc0;
import com.daaw.PK1;
import com.daaw.RH1;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbq {
    public static C5249hu1 a;
    public static final Object b = new Object();

    @Deprecated
    public static final zzbl zza = new RH1();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbq(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r4 = r4.getApplicationContext()
        Ld:
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.zzbq.b
            monitor-enter(r0)
            com.daaw.hu1 r1 = com.google.android.gms.ads.internal.util.zzbq.a     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L3d
            com.daaw.AbstractC9820yE1.a(r4)     // Catch: java.lang.Throwable -> L34
            boolean r1 = com.daaw.AbstractC2555Vl.a()     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L36
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.n4     // Catch: java.lang.Throwable -> L34
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L36
            com.daaw.hu1 r4 = com.google.android.gms.ads.internal.util.zzaz.zzb(r4)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r4 = move-exception
            goto L3f
        L36:
            r1 = 0
            com.daaw.hu1 r4 = com.daaw.AbstractC2071Qu1.a(r4, r1)     // Catch: java.lang.Throwable -> L34
        L3b:
            com.google.android.gms.ads.internal.util.zzbq.a = r4     // Catch: java.lang.Throwable -> L34
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbq.<init>(android.content.Context):void");
    }

    public final InterfaceFutureC8236sc0 zza(String str) {
        BT1 bt1 = new BT1();
        a.a(new zzbp(str, null, bt1));
        return bt1;
    }

    public final InterfaceFutureC8236sc0 zzb(int i, String str, Map map, byte[] bArr) {
        PK1 pk1 = new PK1(null);
        C9557xI1 c9557xI1 = new C9557xI1(this, str, pk1);
        C3996dT1 c3996dT1 = new C3996dT1(null);
        C3956dJ1 c3956dJ1 = new C3956dJ1(this, i, str, pk1, c9557xI1, bArr, map, c3996dT1);
        if (C3996dT1.k()) {
            try {
                c3996dT1.d(str, "GET", c3956dJ1.zzl(), c3956dJ1.zzx());
            } catch (C1110Ht1 e) {
                AbstractC4274eT1.zzj(e.getMessage());
            }
        }
        a.a(c3956dJ1);
        return pk1;
    }
}
