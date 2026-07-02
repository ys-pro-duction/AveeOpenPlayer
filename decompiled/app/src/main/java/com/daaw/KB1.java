package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class KB1 extends AbstractC4449f43 implements V43 {
    private static final KB1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        KB1 kb1 = new KB1();
        zzb = kb1;
        AbstractC4449f43.D(KB1.class, kb1);
    }

    public static JB1 M() {
        return (JB1) zzb.j();
    }

    public static /* synthetic */ void O(KB1 kb1, boolean z) {
        kb1.zzd |= 1;
        kb1.zze = z;
    }

    public static /* synthetic */ void P(KB1 kb1, boolean z) {
        kb1.zzd |= 2;
        kb1.zzf = z;
    }

    public static /* synthetic */ void Q(KB1 kb1, int i) {
        kb1.zzd |= 4;
        kb1.zzg = i;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new KB1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new JB1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
