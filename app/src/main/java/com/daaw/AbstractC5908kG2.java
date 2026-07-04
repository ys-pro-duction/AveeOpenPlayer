package com.daaw;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzba;

/* JADX INFO: renamed from: com.daaw.kG2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5908kG2 {
    public static zze a(Throwable th) {
        if (th instanceof C3274ar2) {
            C3274ar2 c3274ar2 = (C3274ar2) th;
            return c(c3274ar2.a(), c3274ar2.b());
        }
        if (th instanceof C2350Tl2) {
            return th.getMessage() == null ? d(((C2350Tl2) th).a(), null, null) : d(((C2350Tl2) th).a(), th.getMessage(), null);
        }
        if (!(th instanceof zzba)) {
            return d(1, null, null);
        }
        zzba zzbaVar = (zzba) th;
        return new zze(zzbaVar.zza(), BO2.c(zzbaVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
    }

    public static zze b(Throwable th, C3553br2 c3553br2) {
        zze zzeVar;
        zze zzeVarA = a(th);
        int i = zzeVarA.zza;
        if ((i == 3 || i == 0) && (zzeVar = zzeVarA.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzeVarA.zzd = null;
        }
        if (c3553br2 != null) {
            zzeVarA.zze = c3553br2.b();
        }
        return zzeVarA;
    }

    public static zze c(int i, zze zzeVar) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.a8)).intValue() > 0) {
                return zzeVar;
            }
            i = 8;
        }
        return d(i, null, zzeVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.internal.client.zze d(int r8, java.lang.String r9, com.google.android.gms.ads.internal.client.zze r10) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC5908kG2.d(int, java.lang.String, com.google.android.gms.ads.internal.client.zze):com.google.android.gms.ads.internal.client.zze");
    }
}
