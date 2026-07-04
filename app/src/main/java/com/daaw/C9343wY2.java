package com.daaw;

/* JADX INFO: renamed from: com.daaw.wY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9343wY2 extends F32 implements InterfaceC2366Tp2 {
    private static final C9343wY2 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C9343wY2 c9343wY2 = new C9343wY2();
        zzb = c9343wY2;
        F32.q(C9343wY2.class, c9343wY2);
    }

    public static /* synthetic */ void A(C9343wY2 c9343wY2, int i) {
        c9343wY2.zzg = i - 1;
        c9343wY2.zzd |= 4;
    }

    public static C5134hW2 B() {
        return (C5134hW2) zzb.e();
    }

    public static /* synthetic */ void x(C9343wY2 c9343wY2, int i) {
        c9343wY2.zzd |= 1;
        c9343wY2.zze = i;
    }

    public static /* synthetic */ void y(C9343wY2 c9343wY2, String str) {
        str.getClass();
        c9343wY2.zzd |= 2;
        c9343wY2.zzf = str;
    }

    public static /* synthetic */ void z(C9343wY2 c9343wY2, String str) {
        c9343wY2.zzd |= 8;
        c9343wY2.zzh = str;
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C7101oX2.a, "zzh"});
        }
        if (i2 == 3) {
            return new C9343wY2();
        }
        DV2 dv2 = null;
        if (i2 == 4) {
            return new C5134hW2(dv2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
