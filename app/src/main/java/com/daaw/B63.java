package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class B63 extends AbstractC4449f43 implements V43 {
    private static final B63 zzb;
    private int zzd;
    private AbstractC9213w33 zze;
    private AbstractC9213w33 zzf;
    private AbstractC9213w33 zzg;

    static {
        B63 b63 = new B63();
        zzb = b63;
        AbstractC4449f43.D(B63.class, b63);
    }

    public B63() {
        AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
        this.zze = abstractC9213w33;
        this.zzf = abstractC9213w33;
        this.zzg = abstractC9213w33;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new B63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new A63(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
