package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class ZU2 extends F32 implements InterfaceC2366Tp2 {
    private static final ZU2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        ZU2 zu2 = new ZU2();
        zzb = zu2;
        F32.q(ZU2.class, zu2);
    }

    public static /* synthetic */ void x(ZU2 zu2, C3355b83 c3355b83) {
        c3355b83.getClass();
        zu2.zzf = c3355b83;
        zu2.zze = 2;
    }

    public static /* synthetic */ void y(ZU2 zu2, int i) {
        zu2.zzg = i - 1;
        zu2.zzd |= 1;
    }

    public static C9048vU2 z() {
        return (C9048vU2) zzb.e();
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C6806nT2.a, C3355b83.class, C7841r93.class});
        }
        if (i2 == 3) {
            return new ZU2();
        }
        RT2 rt2 = null;
        if (i2 == 4) {
            return new C9048vU2(rt2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
