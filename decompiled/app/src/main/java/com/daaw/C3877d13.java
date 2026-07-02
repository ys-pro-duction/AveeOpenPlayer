package com.daaw;

/* JADX INFO: renamed from: com.daaw.d13, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3877d13 extends AbstractC4449f43 implements V43 {
    private static final C3877d13 zzb;
    private int zzd;
    private int zze;
    private C5558j13 zzf;
    private AbstractC9213w33 zzg = AbstractC9213w33.C;

    static {
        C3877d13 c3877d13 = new C3877d13();
        zzb = c3877d13;
        AbstractC4449f43.D(C3877d13.class, c3877d13);
    }

    public static C3598c13 N() {
        return (C3598c13) zzb.j();
    }

    public static C3877d13 P() {
        return zzb;
    }

    public static C3877d13 Q(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C3877d13) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void U(C3877d13 c3877d13, C5558j13 c5558j13) {
        c5558j13.getClass();
        c3877d13.zzf = c5558j13;
        c3877d13.zzd |= 1;
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
            return new C3877d13();
        }
        AbstractC3320b13 abstractC3320b13 = null;
        if (i2 == 4) {
            return new C3598c13(abstractC3320b13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final C5558j13 R() {
        C5558j13 c5558j13 = this.zzf;
        return c5558j13 == null ? C5558j13.Q() : c5558j13;
    }

    public final AbstractC9213w33 S() {
        return this.zzg;
    }
}
