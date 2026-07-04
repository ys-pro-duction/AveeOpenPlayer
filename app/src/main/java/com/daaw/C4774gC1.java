package com.daaw;

/* JADX INFO: renamed from: com.daaw.gC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4774gC1 extends AbstractC4449f43 implements V43 {
    private static final C4774gC1 zzb;
    private int zzd;
    private int zze;
    private AD1 zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        C4774gC1 c4774gC1 = new C4774gC1();
        zzb = c4774gC1;
        AbstractC4449f43.D(C4774gC1.class, c4774gC1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", C4485fC1.a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C4774gC1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C4206eC1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
