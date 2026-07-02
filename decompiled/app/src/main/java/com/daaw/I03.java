package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class I03 extends AbstractC4449f43 implements V43 {
    private static final I03 zzb;
    private int zzd;
    private int zze;

    static {
        I03 i03 = new I03();
        zzb = i03;
        AbstractC4449f43.D(I03.class, i03);
    }

    public static H03 N() {
        return (H03) zzb.j();
    }

    public static I03 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (I03) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new I03();
        }
        G03 g03 = null;
        if (i2 == 4) {
            return new H03(g03);
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
