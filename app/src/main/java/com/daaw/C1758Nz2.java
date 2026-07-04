package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Nz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1758Nz2 {
    public final Context a;
    public final Set b;
    public final Executor c;
    public final TI2 d;
    public final C1071Hj2 e;
    public long f = 0;
    public int g = 0;

    public C1758Nz2(Context context, Executor executor, Set set, TI2 ti2, C1071Hj2 c1071Hj2) {
        this.a = context;
        this.c = executor;
        this.b = set;
        this.d = ti2;
        this.e = c1071Hj2;
    }

    public final InterfaceFutureC8236sc0 a(final Object obj) {
        EI2 ei2A = DI2.a(this.a, 8);
        ei2A.zzh();
        final ArrayList arrayList = new ArrayList(this.b.size());
        List arrayList2 = new ArrayList();
        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.La;
        if (!((String) zzba.zzc().b(abstractC7582qE1)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzba.zzc().b(abstractC7582qE1)).split(","));
        }
        this.f = zzt.zzB().b();
        for (final InterfaceC1447Kz2 interfaceC1447Kz2 : this.b) {
            if (!arrayList2.contains(String.valueOf(interfaceC1447Kz2.zza()))) {
                final long jB = zzt.zzB().b();
                InterfaceFutureC8236sc0 interfaceFutureC8236sc0Zzb = interfaceC1447Kz2.zzb();
                interfaceFutureC8236sc0Zzb.g(new Runnable() { // from class: com.daaw.Lz2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.B.b(jB, interfaceC1447Kz2);
                    }
                }, AbstractC9322wT1.f);
                arrayList.add(interfaceFutureC8236sc0Zzb);
            }
        }
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0A = AbstractC7360pS2.b(arrayList).a(new Callable() { // from class: com.daaw.Mz2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = arrayList.iterator();
                while (true) {
                    Object obj2 = obj;
                    if (!it.hasNext()) {
                        return obj2;
                    }
                    InterfaceC1343Jz2 interfaceC1343Jz2 = (InterfaceC1343Jz2) ((InterfaceFutureC8236sc0) it.next()).get();
                    if (interfaceC1343Jz2 != null) {
                        interfaceC1343Jz2.a(obj2);
                    }
                }
            }
        }, this.c);
        if (WI2.a()) {
            SI2.a(interfaceFutureC8236sc0A, this.d, ei2A);
        }
        return interfaceFutureC8236sc0A;
    }

    public final void b(long j, InterfaceC1447Kz2 interfaceC1447Kz2) {
        long jB = zzt.zzB().b() - j;
        if (((Boolean) EF1.a.e()).booleanValue()) {
            zze.zza("Signal runtime (ms) : " + BO2.c(interfaceC1447Kz2.getClass().getCanonicalName()) + " = " + jB);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Y1)).booleanValue()) {
            C0967Gj2 c0967Gj2A = this.e.a();
            c0967Gj2A.b("action", "lat_ms");
            c0967Gj2A.b("lat_grp", "sig_lat_grp");
            c0967Gj2A.b("lat_id", String.valueOf(interfaceC1447Kz2.zza()));
            c0967Gj2A.b("clat_ms", String.valueOf(jB));
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Z1)).booleanValue()) {
                synchronized (this) {
                    this.g++;
                }
                c0967Gj2A.b("seq_num", zzt.zzo().g().c());
                synchronized (this) {
                    try {
                        if (this.g == this.b.size() && this.f != 0) {
                            this.g = 0;
                            String strValueOf = String.valueOf(zzt.zzB().b() - this.f);
                            if (interfaceC1447Kz2.zza() <= 39 || interfaceC1447Kz2.zza() >= 52) {
                                c0967Gj2A.b("lat_clsg", strValueOf);
                            } else {
                                c0967Gj2A.b("lat_gmssg", strValueOf);
                            }
                        }
                    } finally {
                    }
                }
            }
            c0967Gj2A.h();
        }
    }
}
