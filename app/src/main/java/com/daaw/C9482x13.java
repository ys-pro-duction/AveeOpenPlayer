package com.daaw;

/* JADX INFO: renamed from: com.daaw.x13, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9482x13 extends AbstractC4449f43 implements V43 {
    private static final C9482x13 zzb;
    private String zzd = "";
    private AbstractC9213w33 zze = AbstractC9213w33.C;
    private int zzf;

    static {
        C9482x13 c9482x13 = new C9482x13();
        zzb = c9482x13;
        AbstractC4449f43.D(C9482x13.class, c9482x13);
    }

    public static C9203w13 M() {
        return (C9203w13) zzb.j();
    }

    public static C9482x13 O() {
        return zzb;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C9482x13();
        }
        AbstractC8924v13 abstractC8924v13 = null;
        if (i2 == 4) {
            return new C9203w13(abstractC8924v13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final EnumC3603c23 P() {
        EnumC3603c23 enumC3603c23A = EnumC3603c23.a(this.zzf);
        return enumC3603c23A == null ? EnumC3603c23.UNRECOGNIZED : enumC3603c23A;
    }

    public final AbstractC9213w33 Q() {
        return this.zze;
    }

    public final String R() {
        return this.zzd;
    }
}
