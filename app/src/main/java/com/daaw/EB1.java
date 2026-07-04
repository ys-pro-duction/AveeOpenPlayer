package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class EB1 extends AbstractC4449f43 implements V43 {
    private static final EB1 zzb;
    private int zzd;
    private int zze;
    private IB1 zzf;
    private KB1 zzg;

    static {
        EB1 eb1 = new EB1();
        zzb = eb1;
        AbstractC4449f43.D(EB1.class, eb1);
    }

    public static DB1 M() {
        return (DB1) zzb.j();
    }

    public static /* synthetic */ void O(EB1 eb1, IB1 ib1) {
        ib1.getClass();
        eb1.zzf = ib1;
        eb1.zzd |= 2;
    }

    public static /* synthetic */ void P(EB1 eb1, KB1 kb1) {
        kb1.getClass();
        eb1.zzg = kb1;
        eb1.zzd |= 4;
    }

    public static /* synthetic */ void Q(EB1 eb1, int i) {
        eb1.zze = 1;
        eb1.zzd = 1 | eb1.zzd;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", GB1.a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new EB1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new DB1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
