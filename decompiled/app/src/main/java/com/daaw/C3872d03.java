package com.daaw;

/* JADX INFO: renamed from: com.daaw.d03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3872d03 extends AbstractC4449f43 implements V43 {
    private static final C3872d03 zzb;
    private int zzd;
    private int zze;
    private C6681n03 zzf;
    private C3877d13 zzg;

    static {
        C3872d03 c3872d03 = new C3872d03();
        zzb = c3872d03;
        AbstractC4449f43.D(C3872d03.class, c3872d03);
    }

    public static C3593c03 N() {
        return (C3593c03) zzb.j();
    }

    public static C3872d03 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C3872d03) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void T(C3872d03 c3872d03, C6681n03 c6681n03) {
        c6681n03.getClass();
        c3872d03.zzf = c6681n03;
        c3872d03.zzd |= 1;
    }

    public static /* synthetic */ void U(C3872d03 c3872d03, C3877d13 c3877d13) {
        c3877d13.getClass();
        c3872d03.zzg = c3877d13;
        c3872d03.zzd |= 2;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C3872d03();
        }
        AbstractC3315b03 abstractC3315b03 = null;
        if (i2 == 4) {
            return new C3593c03(abstractC3315b03);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final C6681n03 Q() {
        C6681n03 c6681n03 = this.zzf;
        return c6681n03 == null ? C6681n03.P() : c6681n03;
    }

    public final C3877d13 R() {
        C3877d13 c3877d13 = this.zzg;
        return c3877d13 == null ? C3877d13.P() : c3877d13;
    }
}
