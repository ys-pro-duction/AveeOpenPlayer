package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.jA2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5602jA2 implements InterfaceC1447Kz2 {
    public final Context a;
    public final ScheduledExecutorService b;
    public final Executor c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final C5396iS1 g;

    public C5602jA2(C5396iS1 c5396iS1, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.g = c5396iS1;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = executor;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.daaw.C5884kA2 a(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.daaw.uM2 r0 = new com.daaw.uM2
            r0.<init>()
            boolean r1 = r7.e
            if (r1 != 0) goto L1b
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.O2
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.e
            if (r1 == 0) goto L6f
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.P2
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.daaw.xM2 r1 = com.daaw.C9574xM2.k(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r8.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.V2     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.daaw.wE1 r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.f     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.daaw.uM2 r0 = r1.j(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.daaw.OS1 r2 = com.google.android.gms.ads.internal.zzt.zzo()
            r2.u(r0, r1)
            com.daaw.uM2 r0 = new com.daaw.uM2
            r0.<init>()
        L6f:
            com.daaw.kA2 r1 = new com.daaw.kA2
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5602jA2.a(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.daaw.kA2");
    }

    public final /* synthetic */ C5884kA2 b(Throwable th) {
        zzay.zzb();
        ContentResolver contentResolver = this.a.getContentResolver();
        return new C5884kA2(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new C8730uM2());
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 40;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.T0)).booleanValue()) {
            return AbstractC7360pS2.g(new Exception("Did not ad Ad ID into query param."));
        }
        return AbstractC7360pS2.e((AbstractC4839gS2) AbstractC7360pS2.o(AbstractC7360pS2.m(AbstractC4839gS2.C(this.g.a(this.a, this.d)), new WN2() { // from class: com.daaw.hA2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return this.a.a((AdvertisingIdClient.Info) obj);
            }
        }, this.c), ((Long) zzba.zzc().b(AbstractC9820yE1.U0)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new WN2() { // from class: com.daaw.iA2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return this.a.b((Throwable) obj);
            }
        }, this.c);
    }
}
