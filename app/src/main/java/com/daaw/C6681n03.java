package com.daaw;

/* JADX INFO: renamed from: com.daaw.n03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6681n03 extends AbstractC4449f43 implements V43 {
    private static final C6681n03 zzb;
    private int zzd;
    private int zze;
    private C8354t03 zzf;
    private AbstractC9213w33 zzg = AbstractC9213w33.C;

    static {
        C6681n03 c6681n03 = new C6681n03();
        zzb = c6681n03;
        AbstractC4449f43.D(C6681n03.class, c6681n03);
    }

    public static C6402m03 N() {
        return (C6402m03) zzb.j();
    }

    public static C6681n03 P() {
        return zzb;
    }

    public static C6681n03 Q(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C6681n03) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void U(C6681n03 c6681n03, C8354t03 c8354t03) {
        c8354t03.getClass();
        c6681n03.zzf = c8354t03;
        c6681n03.zzd |= 1;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C6681n03();
        }
        AbstractC6123l03 abstractC6123l03 = null;
        if (i2 == 4) {
            return new C6402m03(abstractC6123l03);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final C8354t03 R() {
        C8354t03 c8354t03 = this.zzf;
        return c8354t03 == null ? C8354t03.P() : c8354t03;
    }

    public final AbstractC9213w33 S() {
        return this.zzg;
    }
}
