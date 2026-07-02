package com.daaw;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.daaw.ft2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4687ft2 implements InterfaceC6244lS2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ C5622jF2 b;
    public final /* synthetic */ C4498fF2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C5361iJ2 e;
    public final /* synthetic */ C9267wF2 f;
    public final /* synthetic */ C5245ht2 g;

    public C4687ft2(C5245ht2 c5245ht2, long j, C5622jF2 c5622jF2, C4498fF2 c4498fF2, String str, C5361iJ2 c5361iJ2, C9267wF2 c9267wF2) {
        this.g = c5245ht2;
        this.a = j;
        this.b = c5622jF2;
        this.c = c4498fF2;
        this.d = str;
        this.e = c5361iJ2;
        this.f = c9267wF2;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void a(Object obj) {
        long j;
        long jB = this.g.a.b() - this.a;
        synchronized (this.g) {
            try {
                C5245ht2 c5245ht2 = this.g;
                if (c5245ht2.e) {
                    j = jB;
                    c5245ht2.b.a(this.b, this.c, 0, null, j);
                } else {
                    j = jB;
                }
                C5245ht2 c5245ht22 = this.g;
                if (c5245ht22.g) {
                    return;
                }
                if (c5245ht22.q(this.c)) {
                    ((C4966gt2) this.g.d.get(this.c)).d = j;
                } else {
                    LinkedHashMap linkedHashMap = this.g.d;
                    C4498fF2 c4498fF2 = this.c;
                    long j2 = j;
                    j = j2;
                    linkedHashMap.put(c4498fF2, new C4966gt2(this.d, c4498fF2.h0, 0, j2, null));
                }
                this.g.f.g(this.c, j, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        Integer numValueOf;
        int i;
        zze zzeVarB;
        zze zzeVar;
        long jB = this.g.a.b() - this.a;
        if (th instanceof TimeoutException) {
            numValueOf = null;
            i = 2;
        } else if (th instanceof C1419Ks2) {
            numValueOf = null;
            i = 3;
        } else if (th instanceof CancellationException) {
            numValueOf = null;
            i = 4;
        } else if (th instanceof KF2) {
            numValueOf = null;
            i = 5;
        } else if (th instanceof C2350Tl2) {
            int i2 = AbstractC5908kG2.a(th).zza == 3 ? 1 : 6;
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.A1)).booleanValue() && (th instanceof C3274ar2) && (zzeVarB = ((C3274ar2) th).b()) != null) {
                numValueOf = Integer.valueOf(zzeVarB.zza);
                i = i2;
            } else {
                i = i2;
                numValueOf = null;
            }
        } else {
            numValueOf = null;
            i = 6;
        }
        synchronized (this.g) {
            try {
                C5245ht2 c5245ht2 = this.g;
                if (c5245ht2.e) {
                    c5245ht2.b.a(this.b, this.c, i, th instanceof C3274ar2 ? (C3274ar2) th : null, jB);
                    jB = jB;
                }
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.e8)).booleanValue()) {
                    C6487mJ2 c6487mJ2 = this.g.c;
                    C5361iJ2 c5361iJ2 = this.e;
                    C9267wF2 c9267wF2 = this.f;
                    C4498fF2 c4498fF2 = this.c;
                    c6487mJ2.d(c5361iJ2.c(c9267wF2, c4498fF2, c4498fF2.p));
                }
                C5245ht2 c5245ht22 = this.g;
                if (c5245ht22.g) {
                    return;
                }
                LinkedHashMap linkedHashMap = c5245ht22.d;
                C4498fF2 c4498fF22 = this.c;
                linkedHashMap.put(c4498fF22, new C4966gt2(this.d, c4498fF22.h0, i, jB, numValueOf));
                zze zzeVarA = AbstractC5908kG2.a(th);
                int i3 = zzeVarA.zza;
                if ((i3 == 3 || i3 == 0) && (zzeVar = zzeVarA.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                    zzeVarA = AbstractC5908kG2.a(new C3274ar2(13, zzeVarA.zzd));
                }
                this.g.f.f(this.c, jB, zzeVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
