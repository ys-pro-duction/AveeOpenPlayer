package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class ND1 extends AbstractC4449f43 implements V43 {
    private static final ND1 zzb;
    private int zzd;
    private int zze;

    static {
        ND1 nd1 = new ND1();
        zzb = nd1;
        AbstractC4449f43.D(ND1.class, nd1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", MD1.a});
        }
        if (i2 == 3) {
            return new ND1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new LD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
