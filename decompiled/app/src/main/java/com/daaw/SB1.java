package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class SB1 extends AbstractC4449f43 implements V43 {
    private static final SB1 zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC8095s43 zzf = AbstractC4449f43.x();
    private int zzg;

    static {
        SB1 sb1 = new SB1();
        zzb = sb1;
        AbstractC4449f43.D(SB1.class, sb1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", QB1.class, "zzg", C5332iC1.a});
        }
        if (i2 == 3) {
            return new SB1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new RB1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
