package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class E83 extends F32 implements InterfaceC2366Tp2 {
    private static final E83 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C5017h43 zzg;
    private E53 zzh;

    static {
        E83 e83 = new E83();
        zzb = e83;
        F32.q(E83.class, e83);
    }

    public static /* synthetic */ void A(E83 e83, ZU2 zu2) {
        e83.zzf = zu2;
        e83.zze = 3;
    }

    public static A83 B() {
        return (A83) zzb.e();
    }

    public static /* synthetic */ void x(E83 e83, C4474f93 c4474f93) {
        e83.zzf = c4474f93;
        e83.zze = 4;
    }

    public static /* synthetic */ void y(E83 e83, C5017h43 c5017h43) {
        c5017h43.getClass();
        e83.zzg = c5017h43;
        e83.zzd |= 1;
    }

    public static /* synthetic */ void z(E83 e83, JS2 js2) {
        e83.zzf = js2;
        e83.zze = 2;
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", JS2.class, ZU2.class, C4474f93.class, C9766y23.class, "zzh"});
        }
        if (i2 == 3) {
            return new E83();
        }
        AbstractC9238w83 abstractC9238w83 = null;
        if (i2 == 4) {
            return new A83(abstractC9238w83);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
