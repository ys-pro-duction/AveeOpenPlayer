package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class QB1 extends AbstractC4449f43 implements V43 {
    private static final QB1 zzb;
    private int zzd;
    private int zze;
    private C8693uD1 zzf;

    static {
        QB1 qb1 = new QB1();
        zzb = qb1;
        AbstractC4449f43.D(QB1.class, qb1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", NB1.a, "zzf"});
        }
        if (i2 == 3) {
            return new QB1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new PB1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
