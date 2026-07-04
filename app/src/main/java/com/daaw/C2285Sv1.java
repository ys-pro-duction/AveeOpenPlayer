package com.daaw;

/* JADX INFO: renamed from: com.daaw.Sv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2285Sv1 extends AbstractC4449f43 implements V43 {
    private static final C2285Sv1 zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        C2285Sv1 c2285Sv1 = new C2285Sv1();
        zzb = c2285Sv1;
        AbstractC4449f43.D(C2285Sv1.class, c2285Sv1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", C0589Cv1.a, "zzf"});
        }
        if (i2 == 3) {
            return new C2285Sv1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C2179Rv1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
