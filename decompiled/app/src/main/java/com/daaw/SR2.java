package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class SR2 extends AbstractC3772cf3 implements Mg3 {
    private static final SR2 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private C3686cL2 zzg;

    static {
        SR2 sr2 = new SR2();
        zza = sr2;
        AbstractC3772cf3.w(SR2.class, sr2);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new SR2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new C3710cR2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
