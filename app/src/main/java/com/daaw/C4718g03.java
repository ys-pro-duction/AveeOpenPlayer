package com.daaw;

/* JADX INFO: renamed from: com.daaw.g03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4718g03 extends AbstractC4449f43 implements V43 {
    private static final C4718g03 zzb;
    private int zzd;
    private C7518q03 zze;
    private C4723g13 zzf;

    static {
        C4718g03 c4718g03 = new C4718g03();
        zzb = c4718g03;
        AbstractC4449f43.D(C4718g03.class, c4718g03);
    }

    public static C4429f03 M() {
        return (C4429f03) zzb.j();
    }

    public static C4718g03 O(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C4718g03) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void R(C4718g03 c4718g03, C7518q03 c7518q03) {
        c7518q03.getClass();
        c4718g03.zze = c7518q03;
        c4718g03.zzd |= 1;
    }

    public static /* synthetic */ void S(C4718g03 c4718g03, C4723g13 c4723g13) {
        c4723g13.getClass();
        c4718g03.zzf = c4723g13;
        c4718g03.zzd |= 2;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C4718g03();
        }
        AbstractC4150e03 abstractC4150e03 = null;
        if (i2 == 4) {
            return new C4429f03(abstractC4150e03);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final C7518q03 P() {
        C7518q03 c7518q03 = this.zze;
        return c7518q03 == null ? C7518q03.P() : c7518q03;
    }

    public final C4723g13 Q() {
        C4723g13 c4723g13 = this.zzf;
        return c4723g13 == null ? C4723g13.P() : c4723g13;
    }
}
