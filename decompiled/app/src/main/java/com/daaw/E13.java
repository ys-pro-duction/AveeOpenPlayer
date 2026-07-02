package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class E13 extends AbstractC4449f43 implements V43 {
    private static final E13 zzb;
    private int zzd;
    private C6965o13 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        E13 e13 = new E13();
        zzb = e13;
        AbstractC4449f43.D(E13.class, e13);
    }

    public static D13 O() {
        return (D13) zzb.j();
    }

    public static /* synthetic */ void R(E13 e13, C6965o13 c6965o13) {
        c6965o13.getClass();
        e13.zze = c6965o13;
        e13.zzd |= 1;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new E13();
        }
        B13 b13 = null;
        if (i2 == 4) {
            return new D13(b13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzg;
    }

    public final C6965o13 N() {
        C6965o13 c6965o13 = this.zze;
        return c6965o13 == null ? C6965o13.P() : c6965o13;
    }

    public final EnumC3603c23 Q() {
        EnumC3603c23 enumC3603c23A = EnumC3603c23.a(this.zzh);
        return enumC3603c23A == null ? EnumC3603c23.UNRECOGNIZED : enumC3603c23A;
    }

    public final boolean U() {
        return (this.zzd & 1) != 0;
    }

    public final int V() {
        int i = this.zzf;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
