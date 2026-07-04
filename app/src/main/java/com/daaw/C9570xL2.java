package com.daaw;

/* JADX INFO: renamed from: com.daaw.xL2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9570xL2 extends AbstractC4449f43 implements V43 {
    private static final C9570xL2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C8447tL2 zzh;

    static {
        C9570xL2 c9570xL2 = new C9570xL2();
        zzb = c9570xL2;
        AbstractC4449f43.D(C9570xL2.class, c9570xL2);
    }

    public static C9012vL2 M() {
        return (C9012vL2) zzb.j();
    }

    public static /* synthetic */ void O(C9570xL2 c9570xL2, String str) {
        str.getClass();
        c9570xL2.zzd |= 2;
        c9570xL2.zzf = str;
    }

    public static /* synthetic */ void P(C9570xL2 c9570xL2, C8447tL2 c8447tL2) {
        c8447tL2.getClass();
        c9570xL2.zzh = c8447tL2;
        c9570xL2.zzd |= 8;
    }

    public static /* synthetic */ void Q(C9570xL2 c9570xL2, int i) {
        c9570xL2.zze = 1;
        c9570xL2.zzd = 1 | c9570xL2.zzd;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", C9291wL2.a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C9570xL2();
        }
        AbstractC8726uL2 abstractC8726uL2 = null;
        if (i2 == 4) {
            return new C9012vL2(abstractC8726uL2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
