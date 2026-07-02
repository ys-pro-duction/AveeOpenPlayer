package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.dA2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3921dA2 implements InterfaceC1447Kz2 {
    public final zzg a;
    public final Context b;
    public final PS2 c;
    public final ScheduledExecutorService d;
    public final C2474Uq2 e;
    public final FF2 f;

    public C3921dA2(zzg zzgVar, Context context, PS2 ps2, ScheduledExecutorService scheduledExecutorService, C2474Uq2 c2474Uq2, FF2 ff2) {
        this.a = zzgVar;
        this.b = context;
        this.c = ps2;
        this.d = scheduledExecutorService;
        this.e = c2474Uq2;
        this.f = ff2;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 a(Throwable th) {
        RO1.c(this.b).a(th, "TopicsSignal.fetchTopicsSignal");
        return AbstractC7360pS2.h(th instanceof SecurityException ? new C4478fA2("", 2, null) : th instanceof IllegalStateException ? new C4478fA2("", 3, null) : th instanceof IllegalArgumentException ? new C4478fA2("", 4, null) : th instanceof TimeoutException ? new C4478fA2("", 5, null) : new C4478fA2("", 0, null));
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r5.f.d.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.daaw.InterfaceC1447Kz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.InterfaceFutureC8236sc0 zzb() {
        /*
            r5 = this;
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.C9
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L74
            com.google.android.gms.ads.internal.util.zzg r0 = r5.a
            boolean r0 = r0.zzR()
            if (r0 == 0) goto L74
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.F9
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.daaw.FF2 r0 = r5.f
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.ads.internal.client.zzl r0 = r0.d
            int r0 = r0.zzy
            if (r0 == r1) goto L74
        L3a:
            com.daaw.Uq2 r0 = r5.e
            r1 = 0
            com.daaw.sc0 r0 = r0.a(r1)
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.D9
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.d
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.daaw.sc0 r0 = com.daaw.AbstractC7360pS2.o(r0, r1, r4, r3)
            com.daaw.gS2 r0 = com.daaw.AbstractC4839gS2.C(r0)
            com.daaw.PS2 r1 = r5.c
            com.daaw.bA2 r2 = new com.daaw.WR2() { // from class: com.daaw.bA2
                static {
                    /*
                        com.daaw.bA2 r0 = new com.daaw.bA2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.daaw.bA2) com.daaw.bA2.a com.daaw.bA2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3364bA2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3364bA2.<init>():void");
                }

                @Override // com.daaw.WR2
                public final com.daaw.InterfaceFutureC8236sc0 zza(java.lang.Object r6) {
                    /*
                        r5 = this;
                        com.daaw.yS r6 = (com.daaw.C9874yS) r6
                        com.daaw.W53 r0 = com.daaw.X53.M()
                        java.util.List r6 = r6.a()
                        java.util.Iterator r6 = r6.iterator()
                    Le:
                        boolean r1 = r6.hasNext()
                        if (r1 == 0) goto L3d
                        java.lang.Object r1 = r6.next()
                        com.daaw.t41 r1 = (com.daaw.C8372t41) r1
                        com.daaw.U53 r2 = com.daaw.V53.M()
                        int r3 = r1.c()
                        r2.p(r3)
                        long r3 = r1.a()
                        r2.n(r3)
                        long r3 = r1.b()
                        r2.o(r3)
                        com.daaw.f43 r1 = r2.j()
                        com.daaw.V53 r1 = (com.daaw.V53) r1
                        r0.n(r1)
                        goto Le
                    L3d:
                        com.daaw.f43 r6 = r0.j()
                        com.daaw.X53 r6 = (com.daaw.X53) r6
                        byte[] r6 = r6.h()
                        r0 = 1
                        java.lang.String r6 = android.util.Base64.encodeToString(r6, r0)
                        com.daaw.fA2 r1 = new com.daaw.fA2
                        r2 = 0
                        r1.<init>(r6, r0, r2)
                        com.daaw.sc0 r6 = com.daaw.AbstractC7360pS2.h(r1)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3364bA2.zza(java.lang.Object):com.daaw.sc0");
                }
            }
            com.daaw.sc0 r0 = com.daaw.AbstractC7360pS2.n(r0, r2, r1)
            com.daaw.cA2 r1 = new com.daaw.cA2
            r1.<init>()
            com.daaw.PS2 r2 = r5.c
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.daaw.sc0 r0 = com.daaw.AbstractC7360pS2.f(r0, r3, r1, r2)
            return r0
        L74:
            com.daaw.fA2 r0 = new com.daaw.fA2
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            com.daaw.sc0 r0 = com.daaw.AbstractC7360pS2.h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3921dA2.zzb():com.daaw.sc0");
    }
}
