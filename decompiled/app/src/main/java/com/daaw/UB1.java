package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class UB1 extends AbstractC4449f43 implements V43 {
    private static final UB1 zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC8095s43 zzf = AbstractC4449f43.x();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        UB1 ub1 = new UB1();
        zzb = ub1;
        AbstractC4449f43.D(UB1.class, ub1);
    }

    public static UB1 N() {
        return zzb;
    }

    public static /* synthetic */ void O(UB1 ub1, String str) {
        str.getClass();
        ub1.zzd |= 1;
        ub1.zze = str;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            InterfaceC6701n43 interfaceC6701n43 = C5332iC1.a;
            return AbstractC4449f43.A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", QB1.class, "zzg", interfaceC6701n43, "zzh", interfaceC6701n43, "zzi", interfaceC6701n43});
        }
        if (i2 == 3) {
            return new UB1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new TB1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
