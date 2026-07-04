package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class N13 extends AbstractC4449f43 implements V43 {
    private static final N13 zzb;
    private int zzd;
    private int zze;
    private Q13 zzf;

    static {
        N13 n13 = new N13();
        zzb = n13;
        AbstractC4449f43.D(N13.class, n13);
    }

    public static M13 N() {
        return (M13) zzb.j();
    }

    public static N13 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (N13) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void S(N13 n13, Q13 q13) {
        q13.getClass();
        n13.zzf = q13;
        n13.zzd |= 1;
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
            return new N13();
        }
        L13 l13 = null;
        if (i2 == 4) {
            return new M13(l13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final Q13 Q() {
        Q13 q13 = this.zzf;
        return q13 == null ? Q13.N() : q13;
    }
}
