package com.daaw;

/* JADX INFO: renamed from: com.daaw.cL2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3686cL2 extends AbstractC3772cf3 implements Mg3 {
    private static final C3686cL2 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C3686cL2 c3686cL2 = new C3686cL2();
        zza = c3686cL2;
        AbstractC3772cf3.w(C3686cL2.class, c3686cL2);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C3686cL2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new AK2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
