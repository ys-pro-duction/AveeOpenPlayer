package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class JS2 extends F32 implements InterfaceC2366Tp2 {
    private static final JS2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C9343wY2 zzh;

    static {
        JS2 js2 = new JS2();
        zzb = js2;
        F32.q(JS2.class, js2);
    }

    public static /* synthetic */ void A(JS2 js2, int i) {
        js2.zzg = i - 1;
        js2.zzd |= 1;
    }

    public static TR2 B() {
        return (TR2) zzb.e();
    }

    public static JS2 x(byte[] bArr, AU1 au1) {
        return (JS2) F32.j(zzb, bArr, au1);
    }

    public static /* synthetic */ void y(JS2 js2, C9343wY2 c9343wY2) {
        c9343wY2.getClass();
        js2.zzh = c9343wY2;
        js2.zzd |= 2;
    }

    public static /* synthetic */ void z(JS2 js2, C3355b83 c3355b83) {
        c3355b83.getClass();
        js2.zzf = c3355b83;
        js2.zze = 4;
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C6806nT2.a, "zzh", C3355b83.class});
        }
        if (i2 == 3) {
            return new JS2();
        }
        AbstractC3989dR2 abstractC3989dR2 = null;
        if (i2 == 4) {
            return new TR2(abstractC3989dR2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
