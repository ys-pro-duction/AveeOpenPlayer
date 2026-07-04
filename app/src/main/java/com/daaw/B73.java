package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class B73 extends AbstractC4449f43 implements V43 {
    private static final B73 zzb;
    private int zzd;
    private int zze;
    private int zzh;
    private String zzf = "";
    private InterfaceC6980o43 zzg = AbstractC4449f43.t();
    private InterfaceC8095s43 zzi = AbstractC4449f43.x();
    private AbstractC9213w33 zzj = AbstractC9213w33.C;

    static {
        B73 b73 = new B73();
        zzb = b73;
        AbstractC4449f43.D(B73.class, b73);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C10070z73.class, "zzj"});
        }
        if (i2 == 3) {
            return new B73();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new A73(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
