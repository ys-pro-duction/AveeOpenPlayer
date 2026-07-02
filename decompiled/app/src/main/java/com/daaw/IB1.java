package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class IB1 extends AbstractC4449f43 implements V43 {
    private static final IB1 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        IB1 ib1 = new IB1();
        zzb = ib1;
        AbstractC4449f43.D(IB1.class, ib1);
    }

    public static HB1 M() {
        return (HB1) zzb.j();
    }

    public static IB1 O() {
        return zzb;
    }

    public static /* synthetic */ void P(IB1 ib1, boolean z) {
        ib1.zzd |= 1;
        ib1.zze = z;
    }

    public static /* synthetic */ void Q(IB1 ib1, int i) {
        ib1.zzd |= 2;
        ib1.zzf = i;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new IB1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new HB1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
