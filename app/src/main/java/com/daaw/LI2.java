package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class LI2 extends AbstractC3772cf3 implements Mg3 {
    private static final LI2 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        LI2 li2 = new LI2();
        zza = li2;
        AbstractC3772cf3.w(LI2.class, li2);
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
            return new LI2();
        }
        NC2 nc2 = null;
        if (i2 == 4) {
            return new C5078hI2(nc2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String C() {
        return this.zze;
    }

    public final String D() {
        return this.zzf;
    }
}
