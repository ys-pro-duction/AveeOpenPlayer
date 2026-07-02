package com.daaw;

/* JADX INFO: renamed from: com.daaw.sD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8135sD1 extends AbstractC4449f43 implements V43 {
    private static final C8135sD1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C8135sD1 c8135sD1 = new C8135sD1();
        zzb = c8135sD1;
        AbstractC4449f43.D(C8135sD1.class, c8135sD1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C8135sD1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C7856rD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
