package com.daaw;

/* JADX INFO: renamed from: com.daaw.dC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3928dC1 extends AbstractC4449f43 implements V43 {
    private static final C3928dC1 zzb;
    private int zzd;
    private C9816yD1 zzf;
    private int zzg;
    private AD1 zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        C3928dC1 c3928dC1 = new C3928dC1();
        zzb = c3928dC1;
        AbstractC4449f43.D(C3928dC1.class, c3928dC1);
    }

    public static C3928dC1 N() {
        return zzb;
    }

    public static /* synthetic */ void O(C3928dC1 c3928dC1, String str) {
        c3928dC1.zzd |= 1;
        c3928dC1.zze = str;
    }

    public static /* synthetic */ void P(C3928dC1 c3928dC1, AD1 ad1) {
        ad1.getClass();
        c3928dC1.zzh = ad1;
        c3928dC1.zzd |= 8;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            InterfaceC6701n43 interfaceC6701n43 = C5332iC1.a;
            return AbstractC4449f43.A(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", interfaceC6701n43, "zzk", interfaceC6701n43, "zzl", interfaceC6701n43});
        }
        if (i2 == 3) {
            return new C3928dC1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C3649cC1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
