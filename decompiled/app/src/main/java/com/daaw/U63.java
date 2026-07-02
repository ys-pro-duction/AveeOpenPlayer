package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class U63 extends AbstractC4449f43 implements V43 {
    private static final U63 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        U63 u63 = new U63();
        zzb = u63;
        AbstractC4449f43.D(U63.class, u63);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", T63.a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new U63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new S63(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
