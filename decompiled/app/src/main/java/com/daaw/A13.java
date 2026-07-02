package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class A13 extends AbstractC4449f43 implements V43 {
    private static final A13 zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        A13 a13 = new A13();
        zzb = a13;
        AbstractC4449f43.D(A13.class, a13);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new A13();
        }
        AbstractC9761y13 abstractC9761y13 = null;
        if (i2 == 4) {
            return new C10040z13(abstractC9761y13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
