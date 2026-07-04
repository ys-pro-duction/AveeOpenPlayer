package com.daaw;

/* JADX INFO: renamed from: com.daaw.a23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3046a23 extends AbstractC4449f43 implements V43 {
    private static final C3046a23 zzb;
    private int zzd;
    private String zze = "";
    private C9482x13 zzf;

    static {
        C3046a23 c3046a23 = new C3046a23();
        zzb = c3046a23;
        AbstractC4449f43.D(C3046a23.class, c3046a23);
    }

    public static C3046a23 O() {
        return zzb;
    }

    public static C3046a23 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C3046a23) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C3046a23();
        }
        Y13 y13 = null;
        if (i2 == 4) {
            return new Z13(y13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final C9482x13 M() {
        C9482x13 c9482x13 = this.zzf;
        return c9482x13 == null ? C9482x13.O() : c9482x13;
    }

    public final String Q() {
        return this.zze;
    }

    public final boolean R() {
        return (this.zzd & 1) != 0;
    }
}
