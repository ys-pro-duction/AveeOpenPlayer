package com.daaw;

/* JADX INFO: renamed from: com.daaw.sP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8184sP2 extends AbstractC3772cf3 implements Mg3 {
    private static final C8184sP2 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        C8184sP2 c8184sP2 = new C8184sP2();
        zza = c8184sP2;
        AbstractC3772cf3.w(C8184sP2.class, c8184sP2);
    }

    public static RO2 B() {
        return (RO2) zza.i();
    }

    public static /* synthetic */ void D(C8184sP2 c8184sP2, String str) {
        str.getClass();
        c8184sP2.zzd |= 1;
        c8184sP2.zze = str;
    }

    public static /* synthetic */ void E(C8184sP2 c8184sP2, long j) {
        c8184sP2.zzd |= 2;
        c8184sP2.zzf = j;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C8184sP2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new RO2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
