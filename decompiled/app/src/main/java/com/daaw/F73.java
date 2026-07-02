package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class F73 extends AbstractC4449f43 implements V43 {
    private static final F73 zzb;
    private int zzd;
    private String zze = "";

    static {
        F73 f73 = new F73();
        zzb = f73;
        AbstractC4449f43.D(F73.class, f73);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new F73();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new E73(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
