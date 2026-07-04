package com.daaw;

/* JADX INFO: renamed from: com.daaw.hz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5269hz1 extends AbstractC4449f43 implements V43 {
    private static final C5269hz1 zzb;
    private int zzd;
    private C6116kz1 zze;
    private AbstractC9213w33 zzf;
    private AbstractC9213w33 zzg;

    static {
        C5269hz1 c5269hz1 = new C5269hz1();
        zzb = c5269hz1;
        AbstractC4449f43.D(C5269hz1.class, c5269hz1);
    }

    public C5269hz1() {
        AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
        this.zzf = abstractC9213w33;
        this.zzg = abstractC9213w33;
    }

    public static C5269hz1 N(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C5269hz1) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C5269hz1();
        }
        AbstractC4711fz1 abstractC4711fz1 = null;
        if (i2 == 4) {
            return new C4990gz1(abstractC4711fz1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final C6116kz1 O() {
        C6116kz1 c6116kz1 = this.zze;
        return c6116kz1 == null ? C6116kz1.R() : c6116kz1;
    }

    public final AbstractC9213w33 P() {
        return this.zzg;
    }

    public final AbstractC9213w33 Q() {
        return this.zzf;
    }
}
