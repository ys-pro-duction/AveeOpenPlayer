package com.daaw;

/* JADX INFO: renamed from: com.daaw.bE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3379bE1 extends AbstractC4449f43 implements V43 {
    private static final C3379bE1 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        C3379bE1 c3379bE1 = new C3379bE1();
        zzb = c3379bE1;
        AbstractC4449f43.D(C3379bE1.class, c3379bE1);
    }

    public static C3100aE1 M() {
        return (C3100aE1) zzb.j();
    }

    public static /* synthetic */ void O(C3379bE1 c3379bE1, boolean z) {
        c3379bE1.zzd |= 1;
        c3379bE1.zze = z;
    }

    public static /* synthetic */ void P(C3379bE1 c3379bE1, int i) {
        c3379bE1.zzd |= 2;
        c3379bE1.zzf = i;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C3379bE1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C3100aE1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean Q() {
        return this.zze;
    }
}
