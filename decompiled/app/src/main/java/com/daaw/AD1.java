package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class AD1 extends AbstractC4449f43 implements V43 {
    private static final AD1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        AD1 ad1 = new AD1();
        zzb = ad1;
        AbstractC4449f43.D(AD1.class, ad1);
    }

    public static C10095zD1 M() {
        return (C10095zD1) zzb.j();
    }

    public static /* synthetic */ void O(AD1 ad1, int i) {
        ad1.zzd |= 1;
        ad1.zze = i;
    }

    public static /* synthetic */ void P(AD1 ad1, int i) {
        ad1.zzd |= 2;
        ad1.zzf = i;
    }

    public static /* synthetic */ void Q(AD1 ad1, int i) {
        ad1.zzd |= 4;
        ad1.zzg = i;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new AD1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C10095zD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
