package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class PD1 extends AbstractC4449f43 implements V43 {
    private static final PD1 zzb;
    private int zzd;
    private AD1 zze;
    private int zzf = 1000;
    private ND1 zzg;
    private C9816yD1 zzh;

    static {
        PD1 pd1 = new PD1();
        zzb = pd1;
        AbstractC4449f43.D(PD1.class, pd1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", C5332iC1.a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new PD1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new OD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
