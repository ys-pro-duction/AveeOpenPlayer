package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class P83 extends F32 implements InterfaceC2366Tp2 {
    private static final P83 zzb;
    private int zzd;
    private int zzf;
    private M72 zze = F32.l();
    private String zzg = "";

    static {
        P83 p83 = new P83();
        zzb = p83;
        F32.q(P83.class, p83);
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new P83();
        }
        I83 i83 = null;
        if (i2 == 4) {
            return new L83(i83);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
