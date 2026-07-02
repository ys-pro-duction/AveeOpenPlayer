package com.daaw;

/* JADX INFO: renamed from: com.daaw.q03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7518q03 extends AbstractC4449f43 implements V43 {
    private static final C7518q03 zzb;
    private int zzd;
    private C8354t03 zze;
    private int zzf;

    static {
        C7518q03 c7518q03 = new C7518q03();
        zzb = c7518q03;
        AbstractC4449f43.D(C7518q03.class, c7518q03);
    }

    public static C7239p03 N() {
        return (C7239p03) zzb.j();
    }

    public static C7518q03 P() {
        return zzb;
    }

    public static C7518q03 Q(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C7518q03) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void S(C7518q03 c7518q03, C8354t03 c8354t03) {
        c8354t03.getClass();
        c7518q03.zze = c8354t03;
        c7518q03.zzd |= 1;
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
            return new C7518q03();
        }
        AbstractC6960o03 abstractC6960o03 = null;
        if (i2 == 4) {
            return new C7239p03(abstractC6960o03);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzf;
    }

    public final C8354t03 R() {
        C8354t03 c8354t03 = this.zze;
        return c8354t03 == null ? C8354t03.P() : c8354t03;
    }
}
