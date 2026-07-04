package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class DH2 extends AbstractC3772cf3 implements Mg3 {
    private static final DH2 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        DH2 dh2 = new DH2();
        zza = dh2;
        AbstractC3772cf3.w(DH2.class, dh2);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new DH2();
        }
        NC2 nc2 = null;
        if (i2 == 4) {
            return new ZG2(nc2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
