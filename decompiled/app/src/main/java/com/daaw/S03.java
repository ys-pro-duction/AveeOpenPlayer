package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class S03 extends AbstractC4449f43 implements V43 {
    private static final S03 zzb;
    private int zzd;
    private int zze;

    static {
        S03 s03 = new S03();
        zzb = s03;
        AbstractC4449f43.D(S03.class, s03);
    }

    public static R03 N() {
        return (R03) zzb.j();
    }

    public static S03 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (S03) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        if (i2 == 3) {
            return new S03();
        }
        Q03 q03 = null;
        if (i2 == 4) {
            return new R03(q03);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd;
    }
}
