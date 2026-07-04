package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class X13 extends AbstractC4449f43 implements V43 {
    private static final X13 zzb;
    private int zzd;
    private int zze;
    private C3046a23 zzf;

    static {
        X13 x13 = new X13();
        zzb = x13;
        AbstractC4449f43.D(X13.class, x13);
    }

    public static S13 N() {
        return (S13) zzb.j();
    }

    public static X13 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (X13) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void S(X13 x13, C3046a23 c3046a23) {
        c3046a23.getClass();
        x13.zzf = c3046a23;
        x13.zzd |= 1;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new X13();
        }
        R13 r13 = null;
        if (i2 == 4) {
            return new S13(r13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final C3046a23 Q() {
        C3046a23 c3046a23 = this.zzf;
        return c3046a23 == null ? C3046a23.O() : c3046a23;
    }
}
