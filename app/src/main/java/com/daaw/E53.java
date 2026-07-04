package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class E53 extends F32 implements InterfaceC2366Tp2 {
    private static final E53 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        E53 e53 = new E53();
        zzb = e53;
        F32.q(E53.class, e53);
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new E53();
        }
        J43 j43 = null;
        if (i2 == 4) {
            return new C6427m53(j43);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
