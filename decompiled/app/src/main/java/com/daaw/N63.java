package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class N63 extends AbstractC4449f43 implements V43 {
    private static final N63 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        N63 n63 = new N63();
        zzb = n63;
        AbstractC4449f43.D(N63.class, n63);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            InterfaceC6701n43 interfaceC6701n43 = I63.a;
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", interfaceC6701n43, "zzf", "zzg", interfaceC6701n43});
        }
        if (i2 == 3) {
            return new N63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new M63(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
