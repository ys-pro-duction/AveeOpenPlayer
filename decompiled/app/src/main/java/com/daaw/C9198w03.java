package com.daaw;

/* JADX INFO: renamed from: com.daaw.w03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9198w03 extends AbstractC4449f43 implements V43 {
    private static final C9198w03 zzb;
    private int zzd;
    private int zze;
    private C03 zzf;
    private AbstractC9213w33 zzg = AbstractC9213w33.C;

    static {
        C9198w03 c9198w03 = new C9198w03();
        zzb = c9198w03;
        AbstractC4449f43.D(C9198w03.class, c9198w03);
    }

    public static C8919v03 N() {
        return (C8919v03) zzb.j();
    }

    public static C9198w03 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C9198w03) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void T(C9198w03 c9198w03, C03 c03) {
        c03.getClass();
        c9198w03.zzf = c03;
        c9198w03.zzd |= 1;
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
            return new C9198w03();
        }
        AbstractC8633u03 abstractC8633u03 = null;
        if (i2 == 4) {
            return new C8919v03(abstractC8633u03);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final C03 Q() {
        C03 c03 = this.zzf;
        return c03 == null ? C03.P() : c03;
    }

    public final AbstractC9213w33 R() {
        return this.zzg;
    }
}
