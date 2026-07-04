package com.daaw;

/* JADX INFO: renamed from: com.daaw.z03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10035z03 extends AbstractC4449f43 implements V43 {
    private static final C10035z03 zzb;
    private int zzd;
    private C03 zze;
    private int zzf;

    static {
        C10035z03 c10035z03 = new C10035z03();
        zzb = c10035z03;
        AbstractC4449f43.D(C10035z03.class, c10035z03);
    }

    public static C9756y03 N() {
        return (C9756y03) zzb.j();
    }

    public static C10035z03 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C10035z03) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void R(C10035z03 c10035z03, C03 c03) {
        c03.getClass();
        c10035z03.zze = c03;
        c10035z03.zzd |= 1;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C10035z03();
        }
        AbstractC9477x03 abstractC9477x03 = null;
        if (i2 == 4) {
            return new C9756y03(abstractC9477x03);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzf;
    }

    public final C03 Q() {
        C03 c03 = this.zze;
        return c03 == null ? C03.P() : c03;
    }
}
