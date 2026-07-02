package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.nt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6929nt2 implements WR2 {
    public final YH2 a;
    public final T62 b;
    public final C5361iJ2 c;
    public final C6487mJ2 d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final InterfaceC6700n42 g;
    public final C5245ht2 h;
    public final C3553br2 i;
    public final Context j;
    public final TI2 k;
    public final C1626Ms2 l;

    public C6929nt2(Context context, YH2 yh2, C5245ht2 c5245ht2, T62 t62, C5361iJ2 c5361iJ2, C6487mJ2 c6487mJ2, InterfaceC6700n42 interfaceC6700n42, Executor executor, ScheduledExecutorService scheduledExecutorService, C3553br2 c3553br2, TI2 ti2, C1626Ms2 c1626Ms2) {
        this.j = context;
        this.a = yh2;
        this.h = c5245ht2;
        this.b = t62;
        this.c = c5361iJ2;
        this.d = c6487mJ2;
        this.g = interfaceC6700n42;
        this.e = executor;
        this.f = scheduledExecutorService;
        this.i = c3553br2;
        this.k = ti2;
        this.l = c1626Ms2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(com.daaw.C9267wF2 r5) {
        /*
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.r5
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.daaw.vF2 r2 = r5.b
            com.daaw.jF2 r2 = r2.b
            int r2 = r2.e
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.daaw.qE1 r2 = com.daaw.AbstractC9820yE1.q5
            com.daaw.wE1 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L57
            goto L58
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L58
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L58
        L57:
            r1 = r0
        L58:
            com.daaw.vF2 r5 = r5.b
            com.daaw.jF2 r5 = r5.b
            com.daaw.hF2 r5 = r5.i
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.a()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6929nt2.c(com.daaw.wF2):java.lang.String");
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 b(C4498fF2 c4498fF2, C9267wF2 c9267wF2, InterfaceC2682Wq2 interfaceC2682Wq2, Throwable th) {
        EI2 ei2A = DI2.a(this.j, 12);
        ei2A.l(c4498fF2.G);
        ei2A.zzh();
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0O = AbstractC7360pS2.o(interfaceC2682Wq2.a(c9267wF2, c4498fF2), c4498fF2.T, TimeUnit.MILLISECONDS, this.f);
        this.h.f(c9267wF2, c4498fF2, interfaceFutureC8236sc0O, this.c);
        SI2.a(interfaceFutureC8236sc0O, this.k, ei2A);
        return interfaceFutureC8236sc0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    @Override // com.daaw.WR2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.daaw.InterfaceFutureC8236sc0 zza(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6929nt2.zza(java.lang.Object):com.daaw.sc0");
    }
}
