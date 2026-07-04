package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class V03 extends AbstractC4449f43 implements V43 {
    private static final V03 zzb;
    private int zzd;
    private AbstractC9213w33 zze = AbstractC9213w33.C;

    static {
        V03 v03 = new V03();
        zzb = v03;
        AbstractC4449f43.D(V03.class, v03);
    }

    public static U03 N() {
        return (U03) zzb.j();
    }

    public static V03 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (V03) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new V03();
        }
        T03 t03 = null;
        if (i2 == 4) {
            return new U03(t03);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd;
    }

    public final AbstractC9213w33 Q() {
        return this.zze;
    }
}
