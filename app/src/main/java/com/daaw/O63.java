package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class O63 extends AbstractC4449f43 implements V43 {
    private static final O63 zzb;
    private int zzd;
    private int zze;
    private N63 zzf;
    private N63 zzg;

    static {
        O63 o63 = new O63();
        zzb = o63;
        AbstractC4449f43.D(O63.class, o63);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", I63.a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new O63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new H63(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
