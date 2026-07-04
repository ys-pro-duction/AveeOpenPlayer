package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class RD1 extends AbstractC4449f43 implements V43 {
    private static final RD1 zzb;
    private int zzd;
    private int zze = 1000;
    private ND1 zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        RD1 rd1 = new RD1();
        zzb = rd1;
        AbstractC4449f43.D(RD1.class, rd1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", C5332iC1.a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new RD1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new QD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
