package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class UZ2 extends AbstractC4449f43 implements V43 {
    private static final UZ2 zzb;
    private int zzd;
    private int zze;
    private AbstractC9213w33 zzf = AbstractC9213w33.C;
    private C3036a03 zzg;

    static {
        UZ2 uz2 = new UZ2();
        zzb = uz2;
        AbstractC4449f43.D(UZ2.class, uz2);
    }

    public static TZ2 N() {
        return (TZ2) zzb.j();
    }

    public static UZ2 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (UZ2) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void U(UZ2 uz2, C3036a03 c3036a03) {
        c3036a03.getClass();
        uz2.zzg = c3036a03;
        uz2.zzd |= 1;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new UZ2();
        }
        SZ2 sz2 = null;
        if (i2 == 4) {
            return new TZ2(sz2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final C3036a03 Q() {
        C3036a03 c3036a03 = this.zzg;
        return c3036a03 == null ? C3036a03.P() : c3036a03;
    }

    public final AbstractC9213w33 R() {
        return this.zzf;
    }
}
