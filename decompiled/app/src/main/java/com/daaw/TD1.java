package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class TD1 extends AbstractC4449f43 implements V43 {
    private static final TD1 zzb;
    private int zzd;
    private int zze = 1000;
    private ND1 zzf;
    private C9816yD1 zzg;

    static {
        TD1 td1 = new TD1();
        zzb = td1;
        AbstractC4449f43.D(TD1.class, td1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", C5332iC1.a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new TD1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new SD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
